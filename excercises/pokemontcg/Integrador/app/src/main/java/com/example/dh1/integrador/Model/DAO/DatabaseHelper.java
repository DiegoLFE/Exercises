package com.example.dh1.integrador.Model.DAO;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by dh1 on 15/06/17.
 */

public class DatabaseHelper extends SQLiteOpenHelper{
    public static final String DATABASE_NAME = "tcg_db";
    public static final Integer DATABASE_VERSION = 1;

    public DatabaseHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        // CREAR TODAS LAS TABLAS
        String query = "CREATE TABLE " + DaoCardDatabase.TABLE_NAME + " (" +
                DaoCardDatabase.COLUMN_ID + " TEXT PRIMARY KEY, " +
                DaoCardDatabase.COLUMN_IMAGE + " TEXT NOT NULL);";

        db.execSQL(query);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
    }
}
