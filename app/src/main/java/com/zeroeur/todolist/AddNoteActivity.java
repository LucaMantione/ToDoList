package com.zeroeur.todolist;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.Snackbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

/**
 * Created by Luca on 20/02/2017.
 */

public class AddNoteActivity extends Activity implements View.OnClickListener{

    Button aggiungiNota;
    EditText titolo, corpo;
    public static final String KEY_TITOLO = "titolo";
    public static final String KEY_CORPO = "corpo";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_note);
        titolo = (EditText) findViewById(R.id.add_note_titolo);
        corpo = (EditText) findViewById(R.id.add_note_corpo);
        aggiungiNota = (Button) findViewById(R.id.aggiungi_nota);
        aggiungiNota.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        if(view.getId() == R.id.aggiungi_nota){
            if(titolo.getText().toString().length() != 0){
                Intent intent = new Intent();
                intent.putExtra(KEY_TITOLO,titolo.getText().toString());
                intent.putExtra(KEY_CORPO,corpo.getText().toString());
                setResult(123,intent);
                finish();
            } else{
                Snackbar.make(view,"Titolo Vuoto",Snackbar.LENGTH_LONG).show();
            }

        }
    }
}
