package com.example.devtools;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.util.jar.JarFile;


public class MainActivity extends AppCompatActivity {

    Button btn_trombi;
    Button btn_ajout;


    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_trombi = (Button) findViewById(R.id.button3);
        btn_ajout = (Button) findViewById(R.id.button4);

        btn_trombi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               // Log.i(TAG,"REDICRECTION VERS PERSONNELIST");
                Toast.makeText(getApplicationContext(), "Bienvenue au trombinoscope",Toast.LENGTH_LONG).show();
                Intent activityChangeIntent = new Intent(view.getContext(),trombinoscope.class);
                MainActivity.this.startActivity(activityChangeIntent);

            }
        });

        btn_ajout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Log.i(TAG,"REDICRECTION VERS PERSONNELIST");
                Toast.makeText(getApplicationContext(), "AJouter une personne",Toast.LENGTH_LONG).show();
                Intent activityChangeIntent = new Intent(view.getContext(),AjoutPersonne.class);
                MainActivity.this.startActivity(activityChangeIntent);
            }
        });

    }
}
