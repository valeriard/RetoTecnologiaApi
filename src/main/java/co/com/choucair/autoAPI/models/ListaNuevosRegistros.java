package co.com.choucair.autoAPI.models;

public class ListaNuevosRegistros {
    private String name;
    private String job;


    public ListaNuevosRegistros(String name, String job) {
        this.name = name;
        this.job = job;
    }

    public String getName() {
        return name;
    }

    public String getJob() {
        return job;
    }
}