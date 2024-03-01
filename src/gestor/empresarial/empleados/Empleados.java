package gestor.empresarial.empleados;

import gestor.errores.GestionErrores;
import gestor.empresarial.contrato.Cargos;

public final class Empleados implements iEmpleados {
    private int i;
    private GestionErrores error;

    public Empleados() {
        this.error = new GestionErrores();
    }

    public void addDatosPersonales(String nombre, String apellido, String direccion) {


    }

    public void addContrato(int id, int salario, String fechaInicio, Cargos cargo) {

    }

    private int findEmpleado(int id) {

        return id;
    }

    private int findEmpleado(String nombre) {

        return 0;
    }

    public void setWhatsApp(int id, String numero) {

    }

    public String datosPersonales(int id) {

        return null;
    }

    @Override
    public String getInfoEmpleado(int id) {

        return null;
    }

    @Override
    public String getInfoEmpleado(String nombre) {

        return nombre;
    }

    public void setAdscripcion(int id, String adscripcion) {

    }

    public void setTelefonoExtesion(int id, String extension) {

    }

    public void setPuesto(int id, String puesto) {

    }

    @Override
    public void showDatosEmpleados() {

    }

    public void showContratosEmpleado(int id) {

    }

    @Override
    public int getAntiguedad(int id) {

        return id;
    }

    public void setCargo(int id, Cargos cargo) {


    }
}