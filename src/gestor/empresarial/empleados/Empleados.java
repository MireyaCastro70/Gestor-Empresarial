package gestor.empresarial.empleados;


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
    private Cargo[] cargos;
    private int[] antiguedades;

    public Empleados() {
        // Constructor
    }


    public void addDatosPersonales(String nombre, String apellido, String direccion) {
        // Agregar datos personales
        datosPersonales[i] = new String[]{nombre, apellido, direccion};
        i++;
    }


    public void addContrato(int id, int salario, String fechaInicio, Cargo cargo) {
        // Agregar contrato
        contratos[i] = new int[]{id, salario};
        cargos[i] = cargo;
        antiguedades[i] = calcularAntiguedad(fechaInicio);
        i++;
    }

    private int findEmpleado(int id) {
        // Encontrar empleado por ID
        for (int j = 0; j < empleadosIds.length; j++) {
            if (empleadosIds[j] == id) {
                return j;
            }
        }
        return -1;
    }

    private int findEmpleado(String nombre) {
        // Encontrar empleado por nombre
        for (int j = 0; j < empleadosNombres.length; j++) {
            if (empleadosNombres[j].equals(nombre)) {
                return j;
            }
        }
        return -1;
    }


    public void setWhatsApp(int id, String numero) {
        // Establecer WhatsApp
        int j = findEmpleado(id);
        // Realizar la lógica para establecer WhatsApp
    }


    public String datosPersonales(int id) {
        // Obtener datos personales
        int j = findEmpleado(id);
        if (j != -1) {
            return "Nombre: " + datosPersonales[j][0] + ", Apellido: " + datosPersonales[j][1] + ", Dirección: " + datosPersonales[j][2];
        } else {
            return "Empleado no encontrado";
        }
    }

    @Override
    public String getInfoEmpleado(int id) {
        // Obtener información del empleado por ID
        int j = findEmpleado(id);
        if (j != -1) {
            return "ID: " + contratos[j][0] + ", Salario: " + contratos[j][1];
        } else {
            return "Empleado no encontrado";
        }
    }

    @Override
    public String getInfoEmpleado(String nombre) {
        // Obtener información del empleado por nombre
        int j = findEmpleado(nombre);
        if (j != -1) {
            return "ID: " + contratos[j][0] + ", Salario: " + contratos[j][1];
        } else {
            return "Empleado no encontrado";
        }
    }

    public void setAdscripcion(int id, String adscripcion) {
        // Establecer adscripción
        int j = findEmpleado(id);
        // Realizar la lógica para establecer adscripción
    }

    public void setTelefonoExtesion(int id, String extension) {
        // Establecer teléfono de extensión
        int j = findEmpleado(id);
        // Realizar la lógica para establecer teléfono de extensión
    }


    public void setPuesto(int id, String puesto) {
        // Establecer puesto
        int j = findEmpleado(id);
        // Realizar la lógica para establecer puesto
    }

    @Override
    public void showDatosEmpleados() {
        // Mostrar datos de empleados
        for (int j = 0; j < i; j++) {
            System.out.println("ID: " + empleadosIds[j] + ", Nombre: " + empleadosNombres[j] + ", Antigüedad: " + antiguedades[j]);
        }
    }

    @Override
    public int getAntiguedades() {
        return 0;
    }

    public void showContratosEmpleado(int id) {
        // Mostrar contratos de empleado
        int j = findEmpleado(id);
        if (j != -1) {
            System.out.println("ID: " + contratos[j][0] + ", Salario: " + contratos[j][1] + ", Cargo: " + cargos[j]);
        } else {
            System.out.println("Empleado no encontrado");
        }
    }

    @Override
    public int getAntiguedad(int id) {
        // Obtener antigüedad de empleado
        int j = findEmpleado(id);
        if (j != -1) {
            return antiguedades[j];
        } else {
            return -1;
        }
    }

    public void setCargo(Cargo cargo) {
        // Establecer cargo
        // Aquí debería ir la lógica para establecer el cargo,
        // pero no está claro cómo se usaría este método sin parámetros adicionales.
    }

    // Método auxiliar para calcular la antigüedad
    private int calcularAntiguedad(String fechaInicio) {
        // Lógica para calcular la antigüedad
        return 0;
    }
}