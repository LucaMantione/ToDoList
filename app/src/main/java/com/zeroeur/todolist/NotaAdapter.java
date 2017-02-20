package com.zeroeur.todolist;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Luca on 20/02/2017.
 */

public class NotaAdapter extends RecyclerView.Adapter<NotaAdapter.NotaVH> {


    private ArrayList<Nota> dataSet = new ArrayList<>();


    public void setDataSet(ArrayList<Nota> dataSet){
        this.dataSet = dataSet;
        notifyDataSetChanged();
    }


    @Override
    public NotaVH onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_nota,parent,false);
        return new NotaVH(view);
    }

    @Override
    public void onBindViewHolder(NotaVH holder, int position) {
        Nota nota = dataSet.get(position);
        holder.titoloTv.setText(nota.getTitolo());
        holder.creazioneTv.setText("Creazione: " + nota.getDataCreazione());
        holder.scadenzaTv.setText("Scadenza: " + nota.getDataScadenza());

    }

    @Override
    public int getItemCount() {
        return dataSet.size();
    }

    public class NotaVH extends RecyclerView.ViewHolder{

        TextView titoloTv, creazioneTv, scadenzaTv;

        public NotaVH(View itemView) {
            super(itemView);
            titoloTv = (TextView) itemView.findViewById(R.id.nota_titolo_tv);
            creazioneTv = (TextView) itemView.findViewById(R.id.nota_creazione_tv);
            scadenzaTv = (TextView) itemView.findViewById(R.id.nota_scadenza_tv);
        }
    }
}
