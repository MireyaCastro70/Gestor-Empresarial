package gestor.empresarial.empleados;

public interface iEmpleados {
    String getInfoEmpleado(int id);

    String getInfoEmpleado(String nombre);
    void showDatosEmpleados();

    int getAntiguedad(int id);
}
