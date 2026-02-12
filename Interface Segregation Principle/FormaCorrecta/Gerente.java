package FormaCorrecta;

public class Gerente implements Trabajador, Administrador, EmpleadoAsalariado {

    @Override
    public void trabajar() {
        System.out.println("Supervisando proyectos");
    }

    @Override
    public void administrar() {
        System.out.println("Administrando recursos del equipo");
    }

    @Override
    public void cobrarSalario() {
        System.out.println("Cobrando salario como gerente");
    }
}
