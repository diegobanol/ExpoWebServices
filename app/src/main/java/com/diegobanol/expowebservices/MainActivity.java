package com.diegobanol.expowebservices;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends ActionBarActivity {

    // Atributos
    ListView listView;
    ArrayAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Obtener instancia de la lista
        listView= (ListView) findViewById(R.id.listView);

        // Crear y setear adaptador
        adapter = new PostAdapter(this);
        listView.setAdapter(adapter);

    }


}