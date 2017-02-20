package com.zeroeur.todolist;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;

/**
 * Created by Luca on 20/02/2017.
 */

public class MainActivity extends Activity implements View.OnClickListener{

    private ArrayList<Nota> listaNote;
    RecyclerView notaRV;
    LinearLayoutManager layoutManager;
    FloatingActionButton addNota;
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
        addNota = (FloatingActionButton) findViewById(R.id.nota_add_btn);
        addNota.setOnClickListener(this);
        /*listaNote = new ArrayList<>();
        listaNote.add(new Nota("Ciao","01/02/1997","01/02/1998","01/02/1997","Corpo"));
        adapter.setDataSet(listaNote);*/

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(resultCode == 123){
            String titolo = data.getStringExtra(AddNoteActivity.KEY_TITOLO);
            String corpo = data.getStringExtra(AddNoteActivity.KEY_CORPO);
            String date = DateFormat.getDateInstance().format(new Date());
            Nota nota = new Nota(titolo,date,date,corpo);
            adapter.addNote(nota);
        }
    }

    @Override
    public void onClick(View view) {
        if(view.getId() == R.id.nota_add_btn){
            Intent intent = new Intent(MainActivity.this, AddNoteActivity.class);
            startActivityForResult(intent,0);
        }

    }
}
