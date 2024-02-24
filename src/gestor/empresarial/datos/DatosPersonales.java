package gestor.empresarial.datos;

public final class DatosPersonales extends DatosEmpresariales {
    private int id;
    private String nombre;
    private String apellido;
    private String correo;
    private String whatshapp;

    public DatosPersonales(int id, String nombre, String apellido, String correo, String whatshapp, String adscripcion, String telefonoExterior, String puesto) {
        super(adscripcion, telefonoExterior, puesto);
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.whatshapp = whatshapp;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getWhatshapp() {
        return whatshapp;
    }

    public void setWhatshapp(String whatshapp) {
        this.whatshapp = whatshapp;
    }
}