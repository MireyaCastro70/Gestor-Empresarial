package gestor.archivos;

import java.io.*;

public final class ArchivoTexto extends ControlArchivos implements iFileText{
    private File file;
    private FileReader fr;
    private BufferedReader br;
    private FileWriter fw;
    private BufferedWriter bw;
    private boolean archivoExiste;
    private boolean modoLectura;
    private boolean modoEscritura;
    public ArchivoTexto(String nombreArchivo) {
        super(nombreArchivo);
        this.file = new File(nombreArchivo);
    }

    public ArchivoTexto(String nombreArchivo, boolean modoEscritura) {
        super(nombreArchivo);
        this.file = new File(nombreArchivo);
        this.modoEscritura = modoEscritura;
    }

    public void AbrirModoLectura() {

    }

    public String Leer() {

        return null; // Valor temporal
    }

    @Override
    public void AbrirmodoEscritura() {

    }


    public void Escribir(String contenido) {

    }

    public void Cerrar() {

    }

}
