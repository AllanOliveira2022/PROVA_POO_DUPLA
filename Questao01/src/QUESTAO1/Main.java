package QUESTAO1;

public class Main {

	public static void main(String[] args) {

		AgendaMedica agenda = new AgendaMedica("2023-11-14");

        System.out.println(agenda.agendar("Jadieene", 15));
        System.out.println(agenda.agendar("Allan", 16));
        System.out.println(agenda.verificarHorario(15));
        System.out.println(agenda.verificarHorario(14));
        System.out.println(agenda.verificarPaciente("Allan"));
        System.out.println(agenda.verificarPaciente("Paulo"));

	}

}
