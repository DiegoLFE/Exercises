package com.digitalhouse.integratorio.Model.DAO;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by digitalhouse on 14/06/17.
 */

public class DatabaseHelper extends SQLiteOpenHelper{
    public static final Integer DATABASE_VERSION = 1;
    public static final String DATABASE_NAME = "cards_db";


    public DatabaseHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String query = "CREATE TABLE " + DaoCardDatabase.TABLE_NAME + " ("+
                DaoCardDatabase.COLUMN_ID + " INTEGER PRIMARY KEY, " +
                DaoCardDatabase.COLUMN_IMG + " TEXT NOT NULL );";

        db.execSQL(query);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
