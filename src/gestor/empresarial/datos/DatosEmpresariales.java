package gestor.empresarial.datos;

public abstract class DatosEmpresariales {
    private String adscripcion;
    private String telefonoExterior;
    private String puesto;

    public DatosEmpresariales(String adscripcion, String telefonoExterior, String puesto) {
        this.adscripcion = adscripcion;
        this.telefonoExterior = telefonoExterior;
        this.puesto = puesto;
    }

    public String getAdscripcion() {
        return adscripcion;
    }

    public void setAdscripcion(String adscripcion) {
        this.adscripcion = adscripcion;
    }

    public String getTelefonoExterior() {
        return telefonoExterior;
    }

    public void setTelefonoExterior(String telefonoExterior) {
        this.telefonoExterior = telefonoExterior;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }
}
