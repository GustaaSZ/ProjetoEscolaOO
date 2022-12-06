package escola;

import java.util.Date;

// A classe aluno, vai estender(herdar) os atributos da classe Pessoa
public class Aluno  extends Pessoa{
	private Date dateNascimento;
	
	// Fazendo a associação:
	
	/*
	Como um aluno só pode ter no máximo uma turma,
	então vamo pegar um objeto da classe Turma e colocar na classe Aluno
	*/
	private Turma turma;
	
	
	// Método (void): não retorna nada	
	void realizarAvaliacao() {
		
	}
	
	
	public Date getDateNascimento() {
		return dateNascimento;
	}

	public void setDateNascimento(Date dateNascimento) {
		this.dateNascimento = dateNascimento;
	}

	public Turma getTurma() {
		return turma;
	}

	public void setTurma(Turma turma) {
		this.turma = turma;
	}
	
}
