package com.example.damin.myapplication.DataBase;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;

import java.util.ArrayList;
import java.util.List;

import static com.example.damin.myapplication.DataBase.PersonTableHelper.DATABASE_NAME;

/**
 * Created by damin on 25/01/2017.
 */


public class PersonTableFeatures {
    private SQLiteDatabase sqLiteDatabase;
    private boolean bool =false;
    private String[] projection = {
            DataBase.PersonTable._ID,
            DataBase.PersonTable.COLUMN_FIRST_NAME,
            DataBase.PersonTable.COLUMN_LAST_NAME
    };


    public PersonTableFeatures(){
    };

    public SQLiteDatabase open(PersonTableHelper personTableHelper){
        //on ouvre la BDD en écriture
        return  sqLiteDatabase = personTableHelper.getWritableDatabase();
    }

    public boolean ApplicationConnexion (String name){

// Filter results WHERE "title" = 'My Title'
        String selection = DataBase.PersonTable.COLUMN_FIRST_NAME + " = ?";
        String[] selectionArgs = { name };

// How you want the results sorted in the resulting Cursor
        String sortOrder =
                DataBase.PersonTable.COLUMN_LAST_NAME + " DESC";

        Cursor cursor = sqLiteDatabase.query(
                DataBase.PersonTable.TABLE_NAME, // The table to query
                projection,   // The columns to return
                selection,   // The columns for the WHERE clause
                selectionArgs, // The values for the WHERE clause
                null, // don't group the rows
                null,   // don't filter by row groups
                sortOrder// The sort order
        );

        List<String> itemIds = new ArrayList<>();
        while(cursor.moveToNext()) {
            long itemId = cursor.getLong(
                    cursor.getColumnIndexOrThrow(DataBase.PersonTable._ID));
            int convertItem = (int) itemId;
            String ItemFinal= Integer.toString(convertItem);
            itemIds.add(ItemFinal);
        }
        cursor.close();
        if(itemIds.size()!=0) {
            for (String i : itemIds) {
                Log.d("RESULTAT", i);
            }
            bool =true;
        }
       return bool;
    }

    public long insertPersonne(Person personne){
        //Création d'un ContentValues (fonctionne comme une HashMap)
        ContentValues values = new ContentValues();
        //on lui ajoute une valeur associée à une clé (qui est le nom de la colonne dans laquelle on veut mettre la valeur)
        values.put(DataBase.PersonTable.COLUMN_LAST_NAME, personne.getLastName());
        values.put(DataBase.PersonTable.COLUMN_FIRST_NAME, personne.getFirstName());
        values.put(DataBase.PersonTable.COLUMN_WEIGHT,personne.getWeight());
        values.put(DataBase.PersonTable.COLUMN_SEXE,personne.getSexe());

        //on insère l'objet dans la BDD via le ContentValues
        return sqLiteDatabase.insert(DATABASE_NAME, null, values);
    }


    public void close(){
        //on ferme l'accès à la BDD
        sqLiteDatabase.close();
    }
}