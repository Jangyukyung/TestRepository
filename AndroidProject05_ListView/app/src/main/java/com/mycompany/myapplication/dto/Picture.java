package com.mycompany.myapplication.dto;


public class Picture {
    private int pno;
    private String ptitle;
    private int pphoto;
    private int pstar;
    private String pcontent;

    public int getPno() {
        return pno;
    }

    public void setPno(int pno) {
        this.pno = pno;
    }

    public String getPtitle() {
        return ptitle;
    }

    public void setPtitle(String ptitle) {
        this.ptitle = ptitle;
    }

    public int getPphoto() {
        return pphoto;
    }

    public void setPphoto(int pphoto) {
        this.pphoto = pphoto;
    }

    public int getPstar() {
        return pstar;
    }

    public void setPstar(int pstar) {
        this.pstar = pstar;
    }

    public String getPcontent() {
        return pcontent;
    }

    public void setPcontent(String pcontent) {
        this.pcontent = pcontent;
    }
}
