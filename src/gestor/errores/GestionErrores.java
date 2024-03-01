package gestor.errores;
import java.util.HashMap;
import java.util.Map;
public final class GestionErrores {
    private final Map<Integer, String> error = new HashMap<>();
    private boolean existeError;
    private int noError;
    private String descripcionTecnica;

    public GestionErrores() {
        cargarErrores();
    }

    private void cargarErrores() {
        error.put(1, "Error 1");
        error.put(2, "Error 2");
    }

    public void setNoError(int codigoError, String descripcion) {
        if (error.containsKey(codigoError)) {
            this.noError = codigoError;
            this.descripcionTecnica = descripcion;
            existeError = true;
        } else {
            // Error: Código de error no encontrado
            // Aquí podrías manejar esta situación según tus necesidades
        }
    }

    public String getError() {
        if (existeError) {
            return error.get(noError);
        } else {
            return "No hay error";
        }
    }

    public String getErrorTecnico() {
        if (existeError) {
            return descripcionTecnica;
        } else {
            return "No hay error técnico";
        }
    }

    public boolean existeError() {
        return existeError;
    }
}
