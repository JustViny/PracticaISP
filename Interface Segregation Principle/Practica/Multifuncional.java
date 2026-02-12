package Practica;

public class Multifuncional implements Dispositivo {

    @Override
    public void imprimir() {
        System.out.println("Imprimiendo documento...");
    }

    @Override
    public void escanear() {
        System.out.println("Escaneando documento...");
    }

    @Override
    public void enviarFax() {
        System.out.println("Enviando fax...");
    }
}
