package com.example.damin.myapplication;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.damin.myapplication.DataBase.PersonTableFeatures;
import com.example.damin.myapplication.DataBase.PersonTableHelper;

/**
 * Created by damin on 25/01/2017.
 */

public class Connexion extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_connexion);
        Context context= this;

        //si pas final , ne foncitonne pas , why ?
        final EditText name = (EditText)findViewById(R.id.name);
        final TextView nope= (TextView) findViewById(R.id.nope) ;


       //For the DataBase
        final PersonTableFeatures personTableFeatures = new PersonTableFeatures();

        // DataBase (with constructor) and tablePerson (with the OnCreate methode) made
        PersonTableHelper personTableHelper = new PersonTableHelper(context);

        //Now we can handle personTable
        SQLiteDatabase db=personTableFeatures.open( personTableHelper);


        Button button = (Button)findViewById(R.id.connexion);

        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                boolean bool=false;
                String result= name.getText().toString();
                Log.d("GETEXT",result);
                bool=personTableFeatures.ApplicationConnexion(result);
                if (bool) {
                    Intent myIntent = new Intent(Connexion.this, Main2Activity.class);
                    startActivity(myIntent);
                }
                else
                {   nope.setText("Votre pseudo ou votre mot de passe sont incorrects.");
                }

            }
        });


    }
}
