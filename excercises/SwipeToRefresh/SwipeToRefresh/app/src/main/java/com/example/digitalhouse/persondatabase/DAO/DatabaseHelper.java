package com.example.digitalhouse.persondatabase.DAO;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by digitalhouse on 10/06/17.
 */

public class DatabaseHelper extends SQLiteOpenHelper {

    public static final String PERSONS_DB = "personsDB";
    public static final Integer VERSION_DB = 1;


    private Context context;

    //DEFINE LA BASE DE DATOS CON EL NOMBRE personDB y con version 1
    public DatabaseHelper(Context context) {
        super(context, PERSONS_DB, null, VERSION_DB);
    }

    //ACA ADENTRO DEFINIMOS LA ESTRUCTURA QUE VA A TENER MI BD EN VERSION 1
    @Override
    public void onCreate(SQLiteDatabase db) {

        //TENGO QUE EJECUTAR MI SENTENCIA DE SQL
        String query =  "CREATE TABLE " + DAOPersonDatabase.TABLE_PERSONS  + "(" +
                DAOPersonDatabase.ID + " INTEGER PRIMARY KEY," +
                DAOPersonDatabase.NAME + " TEXT NOT NULL, " +
                DAOPersonDatabase.LAST_TWEET + " TEXT )";

        db.execSQL(query);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }







}
