package gestor.archivos;

public interface iFileText {
    void AbrirModoLectura();
    String Leer();
    void AbrirmodoEscritura();
    void Escribir(String contenido);
    void Cerrar();
}
