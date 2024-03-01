package gestor.empresarial.empleados;

import gestor.errores.GestionErrores;
import gestor.empresarial.contrato.Cargos;

public final class Empleados implements iEmpleados {
    private int i;
    private GestionErrores error;
    private int[] empleadosIds;
    private String[] empleadosNombres;
    private String[][] datosPersonales;
    private int[] telefonos;
    private String[] adscripciones;
    private String[] puestos;
    private int[][] contratos;
    private Cargos[] cargos;
    private int[] antiguedades;

    public Empleados() {
        this.error = new GestionErrores();
    }

    public void addDatosPersonales(String nombre, String apellido, String direccion) {
        // Agregar datos personales
        datosPersonales = new String[10][3];
        datosPersonales[i] = new String[]{nombre, apellido, direccion};
        i++;
    }

    public void addContrato(int id, int salario, String fechaInicio, Cargos cargo) {
        contratos = new int[10][2];
        cargos = new Cargos[10];
        antiguedades = new int[10];
        contratos[i] = new int[]{id, salario};
        cargos[i] = cargo;
        antiguedades[i] = calcularAntiguedad(fechaInicio);
        i++;
    }

    private int findEmpleado(int id) {
        // Encontrar empleado por ID
        for (int j = 0; j < i; j++) {
            if (empleadosIds[j] == id) {
                return j;
            }
        }
        return -1;
    }

    private int findEmpleado(String nombre) {
        for (int j = 0; j < i; j++) {
            if (empleadosNombres[j].equals(nombre)) {
                return j;
            }
        }
        return -1;
    }

    public void setWhatsApp(int id, String numero) {
        int j = findEmpleado(id);
        if (j != -1) {
            telefonos[j] = Integer.parseInt(numero);
            System.out.println("Se ha establecido el WhatsApp para el empleado con ID " + id);
        } else {
            System.out.println("No se encontró ningún empleado con el ID " + id);
        }
    }

    public String datosPersonales(int id) {
        int j = findEmpleado(id);
        if (j != -1) {
            return "Nombre: " + datosPersonales[j][0] + ", Apellido: " + datosPersonales[j][1] + ", Dirección: " + datosPersonales[j][2];
        } else {
            return "Empleado no encontrado";
        }
    }

    @Override
    public String getInfoEmpleado(int id) {
        int j = findEmpleado(id);
        if (j != -1) {
            return "ID: " + contratos[j][0] + ", Salario: " + contratos[j][1];
        } else {
            return "Empleado no encontrado";
        }
    }

    @Override
    public String getInfoEmpleado(String nombre) {
        int j = findEmpleado(nombre);
        if (j != -1) {
            return "ID: " + contratos[j][0] + ", Salario: " + contratos[j][1];
        } else {
            return "Empleado no encontrado";
        }
    }

    public void setAdscripcion(int id, String adscripcion) {
        int j = findEmpleado(id);
        if (j != -1) {
            adscripciones[j] = adscripcion;
            System.out.println("Se ha establecido la adscripción para el empleado con ID " + id);
        } else {
            System.out.println("No se encontró ningún empleado con el ID " + id);
        }
    }

    public void setTelefonoExtesion(int id, String extension) {
        int j = findEmpleado(id);
        if (j != -1) {
            telefonos[j] = Integer.parseInt(extension);
            System.out.println("Se ha establecido el teléfono de extensión para el empleado con ID " + id);
        } else {
            System.out.println("No se encontró ningún empleado con el ID " + id);
        }
    }

    public void setPuesto(int id, String puesto) {
        int j = findEmpleado(id);
        if (j != -1) {
            puestos[j] = puesto;
            System.out.println("Se ha establecido el puesto para el empleado con ID " + id);
        } else {
            System.out.println("No se encontró ningún empleado con el ID " + id);
        }
    }

    @Override
    public void showDatosEmpleados() {
        for (int j = 0; j < i; j++) {
            System.out.println("ID: " + empleadosIds[j] + ", Nombre: " + empleadosNombres[j] + ", Antigüedad: " + antiguedades[j]);
        }
    }

    public void showContratosEmpleado(int id) {
        int j = findEmpleado(id);
        if (j != -1) {
            System.out.println("ID: " + contratos[j][0] + ", Salario: " + contratos[j][1] + ", Cargo: " + cargos[j]);
        } else {
            System.out.println("Empleado no encontrado");
        }
    }

    @Override
    public int getAntiguedad(int id) {
        int j = findEmpleado(id);
        if (j != -1) {
            return antiguedades[j];
        } else {
            return -1;
        }
    }

    public void setCargo(int id, Cargos cargo) {

        int j = findEmpleado(id);
        if (j != -1) {
            cargos[j] = cargo;
        }
    }

    private int calcularAntiguedad(String fechaInicio) {
        // Lógica para calcular la antigüedad
        return 0;
    }
}