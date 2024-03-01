package gestor.empresarial.empresa;
import gestor.errores.GestionErrores;
import gestor.empresarial.empleados.Empleados;

public final class Empresa {
    private String nombreEmpresa;
    private String representanteLegal;
    private String telefono;
    private String rfc;
    public Empleados datosRH;
    public GestionErrores error;

    public Empresa(String nombreEmpresa, String rfc) {
        this.nombreEmpresa = nombreEmpresa;
        this.rfc = rfc;
        this.error = new GestionErrores();
    }

    public void setRepresentanteLegal(String representanteLegal) {
        this.representanteLegal = representanteLegal;
    }

    public String getRepresentanteLegal() {
        return representanteLegal;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getInfo() {

        return null;
    }
}
