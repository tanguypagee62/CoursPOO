package com.CESI.cda.courspoo.dao.meet.model;

public class meetDTO {

    private int id;
    private int numGagant;
    private int numPerdant;
    private String lieuTournoi;
    private int annee;

    public meetDTO(int id, int numGagant, int numPerdant, String lieuTournoi, int annee){

        this.id = id;
        this.numGagant = numGagant;
        this.numPerdant = numPerdant;
        this.lieuTournoi = lieuTournoi;
        this.annee = annee;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNumGagnant() {
        return numGagant;
    }

    public void setNumGagant(int numGagant) {
        this.numGagant = numGagant;
    }

    public int getNumPerdant() {
        return numPerdant;
    }

    public void setNumPerdant(int numPerdant) {
        this.numPerdant = numPerdant;
    }

    public String getLieuTournoi() {
        return lieuTournoi;
    }

    public void setLieuTournoi(String lieuTournoi) {
        this.lieuTournoi = lieuTournoi;
    }

    public int getAnnee() {
        return annee;
    }

    public void setAnnee(int annee) {
        this.annee = annee;
    }






}
