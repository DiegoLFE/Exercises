package com.example.dh1.basesdedatos.Model.DAO;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by dh1 on 14/06/17.
 */

public class DatabaseHelper extends SQLiteOpenHelper{
    public static final String DATABASE_NAME = "miBase_db";
    public static final Integer DATABASE_VERSION = 1;

    public DatabaseHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

        // ACA CREAMOS TODAS LAS TABLAS
        db.execSQL("CREATE TABLE "+ DAOPersonaDatabase.TABLE_NAME +" (" +
                DAOPersonaDatabase.ID + " INTEGER PRIMARY KEY, " +
                DAOPersonaDatabase.NAME + " TEXT NOT NULL, " +
                DAOPersonaDatabase.LAST_TWEET + " TEXT NOT NULL);");

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
