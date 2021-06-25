package com.example.dh1.integrador.Model.DAO;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import com.example.dh1.integrador.Model.POJO.Card;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by dh1 on 15/06/17.
 */

public class DaoCardDatabase extends DatabaseHelper{
    public static final String TABLE_NAME = "Cards";
    public static final String COLUMN_ID = "id";
    public static final String COLUMN_IMAGE = "image";

    public DaoCardDatabase(Context context) {
        super(context);
    }

    public void addCard(Card card){
          if (!estaEnLaDB(card.getId())){
              SQLiteDatabase database = getWritableDatabase();

              ContentValues row = new ContentValues();
              row.put(COLUMN_ID, card.getId());
              row.put(COLUMN_IMAGE, card.getImageUrl());

              database.insert(TABLE_NAME, null, row);

              database.close();
          }
    }

    public void addListCard(List<Card> cards){
        for (Card card : cards){
            addCard(card);
        }
    }

    public Boolean estaEnLaDB(String id){
        SQLiteDatabase database = getReadableDatabase();

        String query = "SELECT "+ COLUMN_ID +
                " FROM " + TABLE_NAME +
                " WHERE " + COLUMN_ID + " = " + "'" + id + "'";

        Cursor cursor = database.rawQuery(query, null);

        Boolean esta = cursor.moveToNext();

        cursor.close();
        database.close();

        return esta;
    }

    public List<Card> getListCardInDatabase(){
        List<Card> cards = new ArrayList<>();
        SQLiteDatabase database = getReadableDatabase();

        String query = "SELECT * FROM " + TABLE_NAME;

        Cursor cursor = database.rawQuery(query, null);

        while(cursor.moveToNext()){
            String id = cursor.getString(cursor.getColumnIndex(COLUMN_ID));
            String imageUrl = cursor.getString(cursor.getColumnIndex(COLUMN_IMAGE));
            Card card = new Card(id, imageUrl);
            cards.add(card);
        }

        cursor.close();
        database.close();
        return cards;
    }



}





