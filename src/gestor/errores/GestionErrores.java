package gestor.errores;
import java.util.HashMap;
import java.util.Map;
public final class GestionErrores {
    private final Map<Integer, String> error = new HashMap<>();
    private boolean existeError;
    private int noError;
    private String descripcionTecnica;

    public GestionErrores() {

    }

    private void cargarErrores() {

    }

    public void setNoError(int codigoError, String descripcion) {

    }

    public String getError() {

        return null;
    }

    public String getErrorTecnico() {

        return null;
    }

    public boolean existeError() {
        return existeError;
    }
}
