package FormaCorrecta;

public class Empresa {

    public static void main(String[] args) {
        Trabajador programador = new Programador();
        Trabajador freelancer = new Freelancer();

        programador.trabajar();
        freelancer.trabajar();
    }
}
