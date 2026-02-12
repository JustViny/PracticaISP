package FormaCorrecta;

public class Programador implements Trabajador, EmpleadoAsalariado {

    @Override
    public void trabajar() {
        System.out.println("Programando nuevas funcionalidades");
    }

    @Override
    public void cobrarSalario() {
        System.out.println("Cobrando salario mensual");
    }
}
