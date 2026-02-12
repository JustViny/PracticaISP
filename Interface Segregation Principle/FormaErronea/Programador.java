package FormaErronea;
public class Programador implements Empleado {

    @Override
    public void trabajar() {
        System.out.println("Programando nuevas funcionalidades");
    }

    @Override
    public void administrar() {
        // No aplica
        throw new UnsupportedOperationException("Un programador no administra");
    }

    @Override
    public void cobrarSalario() {
        System.out.println("Cobrando salario mensual");
    }
}
