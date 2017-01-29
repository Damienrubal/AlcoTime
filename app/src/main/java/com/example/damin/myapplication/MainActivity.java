package com.example.damin.myapplication;

import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import com.example.damin.myapplication.DataBase.DataBase;
import com.example.damin.myapplication.DataBase.Person;
import com.example.damin.myapplication.DataBase.PersonTableFeatures;
import com.example.damin.myapplication.DataBase.PersonTableHelper;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button connexion = (Button) findViewById(R.id.buttonConnexion);
        connexion.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent myIntent= new Intent(MainActivity.this, Connexion.class);
                startActivity(myIntent);
            }
        });

        Button inscription = (Button) findViewById(R.id.buttonInscription);
        inscription.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent myIntent= new Intent(MainActivity.this, InscriptionActivity.class);
                startActivity(myIntent);
            }
        });


        //For the DataBase
        //Context context= this;
        //Person verratti = new Person("Silva","Thiago",82,"Homme");
        //long newRowId=0;

        //PersonTableFeatures personTableFeatures = new PersonTableFeatures();

        // DataBase and tablePerson made
        //PersonTableHelper personTableHelper = new PersonTableHelper(context);

        //Now we can handle personTable
        //SQLiteDatabase db=personTableFeatures.open( personTableHelper);

        //ContentValues values = new ContentValues();
        //values.put(DataBase.PersonTable.COLUMN_FIRST_NAME, verratti.getFirstName());
        //values.put(DataBase.PersonTable.COLUMN_LAST_NAME, verratti.getLastName());

// Insert the new row, returning the primary key value of the new row
      //  newRowId = db.insert(DataBase.PersonTable.TABLE_NAME, null, values);
        //Just to see the evolution within the personTable
        //String result = new Long(newRowId).toString();
        //Log.d("IdOfTheNewElement",result);
        //String name = "Rubal";
       // personTableFeatures.ApplicationConnexion(name);




    }


}
