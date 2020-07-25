package hospitalsistema;

public class HospitalSistema {

    public static void main(String[] args) {

        Hospital Hospital = new Hospital();
        
        System.out.println("***** DADOS DO HOSPITAL *****\n");
        Hospital.setNome("DAS DORES");
        Hospital.setEndereco("Av.Paulista - SP");
        Informacoes.mostrarDadosHospital(Hospital);
        System.out.println("***** DADOS DO ENFERMEIRO *****  \n");
        Enfermeiro e = new Enfermeiro();
        e.setNome("Luis");
        e.setSobrenome("Serradas");
        e.setCPF("318.417.910-01");
        e.setRG("87.977.450-3");
        e.setCorem("8925");
        e.setSalario(50000);

        Hospital.addFuncionarios(e);

        Informacoes.mostrarDadosEnfermeiros(e);

        System.out.println("***** DADOS DO MÉDICO ***** \n");
        Medico m = new Medico();
        m.setNome("Douglas");
        m.setSobrenome("Camilo");
        m.setCPF("042.149.666-69");
        m.setRG("07.510.497-X");
        m.setCrm("002-BR");
        m.setEspecialidade("Ortopedista");
        m.setSenhaMedico("DESLOGADO :(");

        if (m.logar("DESLOGADO :(")) {

            System.out.println("ONLINE");
        } else {
            System.out.println("OFFLINE");
        }
        m.setSalario(10000);
        Informacoes.mostrarDadosMedico(m);
        System.out.println("\n");

        Hospital.addFuncionarios(m);

        System.out.println("***** DADOS DO PACIENTE ***** \n");
        
        Paciente p = new Paciente();
        
        p.setNome("Gabriela");
        p.setSobrenome("Marculino");
        p.setCPF("055.475.999-66");
        p.setRG("12.741.200-4");
        p.setSenhaPaciente("LOGADO :)");
        p.setCodPaciente(1);
        
        if (p.logar("LOGADO :)")) {
            System.out.println("ONLINE");
        } else {
            System.out.println("OFFLINE");
        }
        Informacoes.mostrarDadosPaciente(p);
        System.out.println("\n");

        System.out.println("***** DADOS DO PRONTO SOCORRO *****\n");
        
        ProntoSocorro ps = new ProntoSocorro();
        
        ps.setEndereco("Rua São Jorge");
        ps.setCodProntoSocorro(123456);
        ps.setHospital(Hospital);
        ps.addProntoSocorro(ps);
        Informacoes.mostrarDadosProntoSocorro(ps);
        
        Hospital.listarFuncionario(m, p);
        Hospital.listarPaciente(p, p);
        Hospital.listarProntoSocorro(ps);
    }

}
