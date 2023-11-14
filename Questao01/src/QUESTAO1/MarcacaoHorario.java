package QUESTAO1;

public class MarcacaoHorario {
    int horario;
    String nomePaciente;

    public MarcacaoHorario(int horario) {
        this.horario = horario;
        this.nomePaciente = null;
    }

    public int VerHorario() {
        return horario;
    }

    public String VerNomePaciente() {
        return nomePaciente;
    }

    public void agendarConsulta(String nomePaciente) {
        this.nomePaciente = nomePaciente;
    }
}
