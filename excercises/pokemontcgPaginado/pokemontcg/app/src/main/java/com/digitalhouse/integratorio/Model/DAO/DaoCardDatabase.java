package com.digitalhouse.integratorio.Model.DAO;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import com.digitalhouse.integratorio.Model.POJO.Card;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by digitalhouse on 14/06/17.
 */

public class DaoCardDatabase extends DatabaseHelper{
    public static final String TABLE_NAME = "CARDS";
    public static final String COLUMN_ID = "ID";
    public static final String COLUMN_IMG = "IMG";

    public DaoCardDatabase(Context context) {
        super(context);
    }


    public void addCard(Card card){
        if (!isCardAdded(card.getImage())){
            SQLiteDatabase database = getWritableDatabase();

            ContentValues row = new ContentValues();
            row.put(COLUMN_IMG, card.getImage());

            database.insert(TABLE_NAME, null, row);

            database.close();
        }
    }

    public void addCardList(List<Card> cardList){
        for (Card card : cardList){
            addCard(card);
        }
    }

    public Boolean isCardAdded(String img){
        SQLiteDatabase database = getReadableDatabase();

        String query = "SELECT * FROM " + TABLE_NAME +
                " WHERE " + COLUMN_IMG + " = " + "'" + img + "'";

        Cursor cursor = database.rawQuery(query, null);

        Boolean exist = cursor.moveToNext();

        database.close();

        return exist;
    }

    public Card getCard(Integer id){
        SQLiteDatabase database = getReadableDatabase();

        String query = "SELECT * FROM " + TABLE_NAME +
                " WHERE " + COLUMN_ID + " = " + id;

        Cursor cursor = database.rawQuery(query, null);

        Card card = null;

        if (cursor.moveToNext()){
            card = new Card(cursor.getString(cursor.getColumnIndex(COLUMN_IMG)));
            card.setId(cursor.getInt(cursor.getColumnIndex(COLUMN_ID)));
        }

        database.close();

        return card;
    }

    public List<Card> getCardList(Integer page, Integer pageSize){
        String query = "SELECT * FROM " + TABLE_NAME +
                " LIMIT " + ((page-1) * pageSize) + ", " + pageSize;
        return getCardList(query);
    }

    public List<Card> getCardList(){
        String query = "SELECT * FROM " + TABLE_NAME;
        return getCardList(query);
    }

    private List<Card>getCardList(String query){
        List<Card> cardList = new ArrayList<>();

        SQLiteDatabase database = getReadableDatabase();

        Cursor cursor = database.rawQuery(query, null);

        while(cursor.moveToNext()){
            Card card = new Card(cursor.getString(cursor.getColumnIndex(COLUMN_IMG)));
            card.setId(cursor.getInt(cursor.getColumnIndex(COLUMN_ID)));
            cardList.add(card);
        }

        database.close();

        return cardList;
    }

}
