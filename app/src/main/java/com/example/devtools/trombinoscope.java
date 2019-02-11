package com.example.devtools;

import android.provider.ContactsContract;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class trombinoscope extends AppCompatActivity {

    ArrayList<Personne> liste = DataPersonne.getPerson();
    ListView listv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trombinoscope);
        listv = findViewById(R.id.list);

        PersonAdapter adap = new PersonAdapter(trombinoscope.this,liste);
        listv.setAdapter(adap);




    }
}
