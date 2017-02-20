package com.zeroeur.todolist;

import java.util.Date;

/**
 * Created by Luca on 20/02/2017.
 */

public class Nota {
    private String titolo;
    private String dataCreazione;
    private String dataScadenza;
    private String ultimaModifica;
    private String corpo;
    private Stato stato;


    public Nota(){}

    public Nota(String titolo, String dataCreazione, String ultimaModifica, String corpo){
        this.titolo = titolo;
        this.dataCreazione = dataCreazione;
        this.ultimaModifica = ultimaModifica;
        this.corpo = corpo;
        stato = Stato.ATTUALE;
    }

    public String getTitolo() {
        return titolo;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    public String getDataCreazione() {
        return dataCreazione;
    }

    public void setDataCreazione(String dataCreazione) {
        this.dataCreazione = dataCreazione;
    }

    public String getUltimaModifica() {
        return ultimaModifica;
    }

    public void setUltimaModifica(String ultimaModifica) {
        this.ultimaModifica = ultimaModifica;
    }

    public String getDataScadenza() {
        return dataScadenza;
    }

    public void setDataScadenza(String dataScadenza) {
        this.dataScadenza = dataScadenza;
    }

    public String getCorpo() {
        return corpo;
    }

    public void setCorpo(String corpo) {
        this.corpo = corpo;
    }

    public Stato getStato() {
        return stato;
    }

    public void setStato(Stato stato) {
        this.stato = stato;
    }

}

enum Stato{
    ATTUALE, ARCHIVIATO
}
