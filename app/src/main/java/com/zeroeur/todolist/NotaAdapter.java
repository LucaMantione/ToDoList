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


    public void addNote(Nota nota){
        this.dataSet.add(0,nota);
        notifyItemChanged(0);
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
        holder.modificaTv.setText("Modifica: " + nota.getUltimaModifica());

    }

    @Override
    public int getItemCount() {
        return dataSet.size();
    }

    public class NotaVH extends RecyclerView.ViewHolder{

        TextView titoloTv, creazioneTv, modificaTv;

        public NotaVH(View itemView) {
            super(itemView);
            titoloTv = (TextView) itemView.findViewById(R.id.nota_titolo_tv);
            creazioneTv = (TextView) itemView.findViewById(R.id.nota_creazione_tv);
            modificaTv = (TextView) itemView.findViewById(R.id.nota_modifica_tv);
        }
    }
}
