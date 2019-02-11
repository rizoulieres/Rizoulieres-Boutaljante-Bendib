package com.example.devtools;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class PersonAdapter extends ArrayAdapter<Personne> {

    public PersonAdapter(Context context, ArrayList<Personne> personne){
        super(context,0,personne);
    }

    @Override
            public View getView(int position, View convertView, ViewGroup parent){

        if(convertView==null){
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.person_item,parent,false);
        }
        PersonItemHolder viewHolder = (PersonItemHolder) convertView.getTag();
        if(viewHolder ==null){
            viewHolder = new PersonItemHolder();
            viewHolder.nom = (TextView) convertView.findViewById(R.id.firstName);
            viewHolder.prenom = (TextView) convertView.findViewById(R.id.lastName);
            viewHolder.couleur = (ImageView) convertView.findViewById(R.id.avatar);
            convertView.setTag(viewHolder);

        }

        Personne personne = getItem(position);
        viewHolder.nom.setText(personne.getNom());
        viewHolder.prenom.setText(personne.getPrenom());
        int r = (int) (Math.random()*255);
        int g = (int) (Math.random()*255);
        int b = (int) (Math.random()*255);
        viewHolder.couleur.setImageDrawable(new ColorDrawable(Color.rgb(r,g,b)));

        return convertView;
    }

}
