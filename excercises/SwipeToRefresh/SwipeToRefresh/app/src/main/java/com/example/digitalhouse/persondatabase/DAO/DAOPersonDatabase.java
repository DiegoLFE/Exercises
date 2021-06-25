package com.example.digitalhouse.persondatabase.DAO;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import com.example.digitalhouse.persondatabase.model.Person;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by digitalhouse on 10/06/17.
 */

public class DAOPersonDatabase extends DatabaseHelper {

    public static final String ID = "id";
    public static final String NAME = "name";
    public static final String LAST_TWEET = "lastTweet";
    public static final String TABLE_PERSONS = "persons";

    public DAOPersonDatabase(Context context) {
        super(context);
    }


    public void addPerson(Person person){

        if(!checkIfExist(person.getId())) {

            SQLiteDatabase database = getWritableDatabase();

            //CREO LA FILA Y LE CARGO LOS DATOS
            ContentValues row = new ContentValues();
            row.put(ID, person.getId());
            row.put(NAME, person.getName());
            row.put(LAST_TWEET, person.getLastTweet());

            //LE DIGO A LA BD QUE CARGUE LA FILA EN LA TABLA
            database.insert(TABLE_PERSONS, null, row);

            database.close();
        }
    }

    public void addPersons(List<Person> personList){

        for(Person person : personList){
            addPerson(person);
        }
    }


    public List<Person> getAllPersons(){

        List<Person> persons  = new ArrayList<>();
        SQLiteDatabase database = getReadableDatabase();
        String select = "SELECT * FROM " + TABLE_PERSONS;

        Cursor cursor = database.rawQuery(select, null);
        while(cursor.moveToNext()){

            //LEER CADA FILA DE LA TABLA RESULTADO
            Person person = new Person();
            person.setId(cursor.getInt(cursor.getColumnIndex(ID)));
            person.setName(cursor.getString(cursor.getColumnIndex(NAME)));
            person.setLastTweet(cursor.getString(cursor.getColumnIndex(LAST_TWEET)));

            persons.add(person);
        }

        //CERRAR
        cursor.close();
        database.close();

        return persons;
    }

    public Person getPerson(Integer id){

        SQLiteDatabase database = getReadableDatabase();

        String query = "SELECT * FROM " + TABLE_PERSONS +
                        " WHERE " + ID + " = " + id;

        Cursor cursor = database.rawQuery(query, null);
        Person person = null;
        if(cursor.moveToNext()){

            //LEER CADA FILA DE LA TABLA RESULTADO
            person = new Person();
            person.setId(cursor.getInt(cursor.getColumnIndex(ID)));
            person.setName(cursor.getString(cursor.getColumnIndex(NAME)));
            person.setLastTweet(cursor.getString(cursor.getColumnIndex(LAST_TWEET)));
        }

        cursor.close();
        database.close();

        return person;
    }

    public Boolean checkIfExist(Integer id){
        Person person = getPerson(id);
        return !(person == null);
    }
}
