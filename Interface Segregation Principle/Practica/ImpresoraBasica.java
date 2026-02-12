package Practica;

public class ImpresoraBasica implements Dispositivo {

    @Override
    public void imprimir() {
        System.out.println("Imprimiendo documento...");
    }

    @Override
    public void escanear() {
        throw new UnsupportedOperationException("No soporta escaneo");
    }

    @Override
    public void enviarFax() {
        throw new UnsupportedOperationException("No soporta fax");
    }
}
