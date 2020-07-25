package exercício_too_agosto;

public class Exercício_TOO_Agosto {

    public static void main(String[] args) {

        System.out.println("***** DAGOS DO PACIENTE ***** \n");
        Paciente p = new Paciente();
        p.setNome("Helen");
        p.setSobrenome("Ikeda");
        p.setCPF("055.475.999-66");
        p.setRG("12.741.200-4");
        p.setCodPaciente(1);
        Informações.mostrarDadosPaciente(p);
        System.out.println("\n");

        System.out.println("***** DADOS DO MÉDICO ***** \n");
        Médico m = new Médico();
        m.setNome("Juliana");
        m.setSobrenome("Marques");
        m.setCPF("042.149.666-69");
        m.setRG("07.510.497-X");
        m.setEspecialidade("Ortopedista");
        m.setSalario(10000);
        Informações.mostrarDadosMedico(m);
        System.out.println("\n");

        System.out.println("***** DADOS DO ENFERMEIRO *****  \n");
        Enfermeiro e = new Enfermeiro();
        e.setNome("Murilo");
        e.setSobrenome("Sérgio");
        e.setCPF("318.417.910-01");
        e.setRG("87.977.450-3");
        e.setCoren("8925");
        Informações.mostrarDadosEnfermeiros(e);
    }

}
