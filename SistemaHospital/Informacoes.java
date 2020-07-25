package hospitalsistema;

public class Informacoes {
    public static void mostrarDadosPaciente(Paciente p) {
        System.out.println("Nome: " + p.getNome() + " " + p.getSobrenome());
        System.out.println("RG: " + p.getRG());
        System.out.println("CPF: " + p.getCPF());
        System.out.println("Código do paciente: " + p.getCodPaciente());
        System.out.println("Senha do paciente: " + p.getSenhaPaciente());

    }

    public static void mostrarDadosMedico(Medico m) {

        System.out.println("Nome: " + m.getNome() + " " + m.getSobrenome());
        System.out.println("RG: " + m.getRG());
        System.out.println("CPF: " + m.getCPF());
        System.out.println("Especialidade: " + m.getEspecialidade());
        System.out.println("CRM: " + m.getCrm());
        System.out.println("Salário: " + m.getSalario());
        System.out.println("Senha: " + m.getSenhaMedico());

    }

    public static void mostrarDadosEnfermeiros(Enfermeiro e) {

        System.out.println("Nome: " + e.getNome() + " " + e.getSobrenome());
        System.out.println("RG: " + e.getRG());
        System.out.println("CPF: " + e.getCPF());
        System.out.println("Corem: " + e.getCorem());
        System.out.println("Salário: " + e.getSalario());

    }
     public static void mostrarDadosProntoSocorro(ProntoSocorro ps) {

        System.out.println("Enderaço: " + ps.getEndereco());
        System.out.println("Código do Pronto Socorro: " + ps.getCodProntoSocorro());
        System.out.println("Hospital: " + ps.getHospital().getNome());
        

    }
      public static void mostrarDadosHospital(Hospital Hospital) {

        System.out.println("Nome do Hospital: " + Hospital.getNome());
        System.out.println("Endereço do Hospital: " + Hospital.getEndereco());
 
        

    }
    
    
    
    

    
    
}
