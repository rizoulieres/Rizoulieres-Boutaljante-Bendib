package com.example.devtools;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.zip.DataFormatException;

public class AjoutPersonne extends AppCompatActivity {


    Button ajout;
    EditText nom;
    EditText prenom;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ajout_personne);
        ajout = (Button) findViewById(R.id.btn_ajout);
        nom = findViewById(R.id.id_nom);
       prenom = findViewById(R.id.id_prenom);

       ajout.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               if(nom.length()!=0 && prenom.length()!=0){
                   DataPersonne.addPerson(new Personne(nom.getText().toString(),prenom.getText().toString()));
                   Toast.makeText(getApplicationContext(), "Vous avez ajouté :"+nom.getText().toString()+" "+prenom.getText().toString(),Toast.LENGTH_LONG).show();
               }
           }
       });


    }

}
