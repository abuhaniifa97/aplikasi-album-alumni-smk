package com.nesaci.rdc.aplikasialumni;

public class Model {
    String nama_lengkap, foto, alamat,jenis_kelamin,no_hp,quetes,status;

    public Model(){}

//    getter and setters press Alt+Insert

    public String getNama_lengkap() {
        return nama_lengkap;
    }

    public void setTitle(String title) {
        this.nama_lengkap = title;
    }

    public String getFoto() {
        return foto;
    }

    public void setImage(String foto) {
        this.foto = foto;
    }

    public String getalamat() {
        return alamat;
    }

    public void setDescription(String description) {
        this.alamat = description;
    }

    public String getjenis_kelamin() {
        return jenis_kelamin;
    }

    public void setJenis_kelamin(String jenis_kelamin){
        this.jenis_kelamin = jenis_kelamin;
    }

    public String getno_hp(){
        return no_hp;
    }

    public void setNo_hp(String no_hp){
        this.no_hp = no_hp;
    }

    public String getquetes() {
        return quetes;
    }

    public void setQuetes(String quetes){
        this.quetes = quetes;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
