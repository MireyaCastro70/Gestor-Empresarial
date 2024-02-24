import gestor.empresarial.datos.DatosPersonales;

public class Principal {
    public static void main(String[] args) {
        // Crear una instancia de DatosPersonales
        DatosPersonales datosPersonales = new DatosPersonales(1, "Irma Mireya", "Castro ", "mireya@gmail.com", "123456789", "Adscripcion A", "1011121314", "Gerente");

        // Imprimir algunos datos
        System.out.println("ID: " + datosPersonales.getId());
        System.out.println("Nombre: " + datosPersonales.getNombre());
        System.out.println("Apellido: " + datosPersonales.getApellido());
        System.out.println("Correo: " + datosPersonales.getCorreo());
        System.out.println("WhatsApp: " + datosPersonales.getWhatshapp());
        System.out.println("Adscripción: " + datosPersonales.getAdscripcion());
        System.out.println("Teléfono Exterior: " + datosPersonales.getTelefonoExterior());
        System.out.println("Puesto: " + datosPersonales.getPuesto());
    }
}
