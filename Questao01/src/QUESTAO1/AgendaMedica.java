package QUESTAO1;

public class AgendaMedica {
    String data;
    MarcacaoHorario[] horariosDisponiveis;

    
    public AgendaMedica(String data) {
        this.data = data;
        this.horariosDisponiveis = new MarcacaoHorario[8];

        for (int i = 0; i < 8; i++) {
            horariosDisponiveis[i] = new MarcacaoHorario(i + 13);
        }
    }
        
    
    
        public String agendar(String nomePaciente, int horario) {
            if (horarioValido(horario)) {
                int indice = horario - 13;
                if (horariosDisponiveis[indice].VerNomePaciente() == null) {
                    horariosDisponiveis[indice].agendarConsulta(nomePaciente);
                    return String.format("Consulta marcada para %dh com %s.", horario, nomePaciente);
                } else {
                    return String.format("Erro: Horário %dh já ocupado.", horario);
                }
            }

            return "Erro: Horário inválido.";
        }

        
        
        public String verificarHorario(int horario) {
            if (horarioValido(horario)) {
                int indice = horario - 13;
                String paciente = horariosDisponiveis[indice].VerNomePaciente();
                if (paciente != null) {
                    return String.format("Paciente agendado para %dh: %s.", horario, paciente);
                } else {
                    return String.format("Horário %dh está livre.", horario);
                }
            }

            return "Erro: Horário inválido.";
        }

        
        
        public String verificarPaciente(String nomePaciente) {
            for (MarcacaoHorario horario : horariosDisponiveis) {
                if (horario.VerNomePaciente() != null && horario.VerNomePaciente().equals(nomePaciente)) {
                    return String.format("Paciente %s tem consulta marcada para %dh.", nomePaciente, horario.VerHorario());
                }
            }

            return String.format("Nenhuma consulta encontrada para o paciente %s.", nomePaciente);
        }
        
        

        private boolean horarioValido(int horario) {
            return horario >= 13 && horario <= 20;
        }
    }

