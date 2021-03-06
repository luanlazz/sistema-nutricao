import java.sql.Date;
import java.sql.Time;

public class AvaliacaoFisica implements Avaliacao {
	private String condicionamento;
	private String parecer;
	private Time horario;
	private Date data;
	private Paciente paciente;
	private Nutricionista nutricionista;
	private Avaliacao avaliacao;
	
	public AvaliacaoFisica() {
		this.condicionamento = null;
		this.parecer = null;
		this.horario = null;
		this.data = null;
		this.paciente = null;
		this.nutricionista = null;
		this.avaliacao = new AvaliacaoFisica();
	}

	@Override
	public void Consulta(String str1, String str2) {
		this.condicionamento = str1;
		this.parecer = str2;
	}

	@Override
	public boolean agendaConsulta(Paciente paciente, Nutricionista nutricionista, Time horario, Date data) {
		if (/*horario disponivel*/) {
			this.horario = horario;
			this.data = data;
			this.paciente = paciente;
			this.nutricionista = nutricionista;
			return true;
		}
		
		return false;
	}

	@Override
	public void requisitarExame(String exame) {
		this.parecer += exame;
	}

	@Override
	public void ReceitarMedicamento(String remedio) {
		this.parecer += remedio;
	}

	@Override
	public Avaliacao getDados() {
		if (avaliacao == null) avaliacao = new AvaliacaoFisica();
	    return avaliacao;
	}

	@Override
	public boolean setConsulta(Time horario, Date data) {
		if (/*horario disponivel*/) {
			this.horario = horario;
			this.data = data;
			return true;
		}
		return false;
	}
}
