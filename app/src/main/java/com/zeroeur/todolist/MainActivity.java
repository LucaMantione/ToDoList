package com.zeroeur.todolist;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

/**
 * Created by Luca on 20/02/2017.
 */

public class MainActivity extends Activity {

    private ArrayList<Nota> listaNote;
    RecyclerView notaRV;
    LinearLayoutManager layoutManager;
    NotaAdapter adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        notaRV = (RecyclerView) findViewById(R.id.nota_rv);
        layoutManager = new LinearLayoutManager(this);
        adapter = new NotaAdapter();
        notaRV.setLayoutManager(layoutManager);
        notaRV.setAdapter(adapter);
        listaNote = new ArrayList<>();
        listaNote.add(new Nota("Ciao","01/02/1997","01/02/1998","01/02/1997","Corpo"));
        listaNote.add(new Nota("Prova","01/02/1997","01/02/1998","01/02/1997","Corpo"));
        listaNote.add(new Nota("Titolo","01/02/1997","01/02/1998","01/02/1997","Corpo"));
        listaNote.add(new Nota("Ciao","01/02/1997","01/02/1998","01/02/1997","Corpo"));
        listaNote.add(new Nota("Prova","01/02/1997","01/02/1998","01/02/1997","Corpo"));
        listaNote.add(new Nota("Titolo","01/02/1997","01/02/1998","01/02/1997","Corpo"));
        listaNote.add(new Nota("Ciao","01/02/1997","01/02/1998","01/02/1997","Corpo"));
        listaNote.add(new Nota("Prova","01/02/1997","01/02/1998","01/02/1997","Corpo"));
        listaNote.add(new Nota("Titolo","01/02/1997","01/02/1998","01/02/1997","Corpo"));
        listaNote.add(new Nota("Ciao","01/02/1997","01/02/1998","01/02/1997","Corpo"));
        listaNote.add(new Nota("Prova","01/02/1997","01/02/1998","01/02/1997","Corpo"));
        listaNote.add(new Nota("Titolo","01/02/1997","01/02/1998","01/02/1997","Corpo"));
        adapter.setDataSet(listaNote);

    }
}
