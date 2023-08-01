package co.com.choucair.autoAPI.models;

public class ActualizoDatosEmpleado {

    private String name;
    private String job;

    public ActualizoDatosEmpleado(String name, String job) {
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
