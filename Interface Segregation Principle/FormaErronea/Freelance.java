package FormaErronea;
public class Freelance implements Empleado {

    @Override
    public void trabajar() {
        System.out.println("Trabajando por proyecto");
    }

    @Override
    public void administrar() {
        // No aplica
        throw new UnsupportedOperationException("Un freelancer no administra");
    }

    @Override
    public void cobrarSalario() {
        // No aplica
        throw new UnsupportedOperationException("Un freelancer no tiene salario fijo");
    }
}
