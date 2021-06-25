package com.example.dh1.basesdedatos.Model.DAO;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import com.example.dh1.basesdedatos.Model.POJO.Persona;

/**
 * Created by dh1 on 14/06/17.
 */

// MI TABLA
public class DAOPersonaDatabase extends DatabaseHelper{
    public static final String TABLE_NAME = "persona";
    public static final String ID = "ID";
    public static final String NAME = "NAME";
    public static final String LAST_TWEET = "LASTTWEET";

    // CONSTRUCTOR
    public DAOPersonaDatabase(Context context) {
        super(context);
    }

    public void addPersona(Persona persona){
        // Esta agregada?
        if (!isPersonInDB(persona.getId())) {
            SQLiteDatabase database = getWritableDatabase();

            ContentValues values = new ContentValues();
            values.put(ID, persona.getId());
            values.put(NAME, persona.getNombre());
            values.put(LAST_TWEET, persona.getLastTweet());

            database.insert(TABLE_NAME, null, values);

            // Cerramos la base de datos
            database.close();
        }
    }

    public Boolean isPersonInDB(Integer id){
        SQLiteDatabase database = getReadableDatabase();

        String query = "SELECT * " +
                        "FROM " + TABLE_NAME + " " +
                        "WHERE " + ID + " = " + id;

        Cursor cursor = database.rawQuery(query, null);

        Boolean isPerson = cursor.moveToNext();

        // BUSCAR UN VALOR DE UNA COLUMNA
        cursor.getString(cursor.getColumnIndex(NAME));

        database.close();

        return isPerson;
    }

    public Persona getPerson(Integer id){


        return null;
    }

}
