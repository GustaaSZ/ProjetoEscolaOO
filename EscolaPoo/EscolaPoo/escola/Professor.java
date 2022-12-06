package escola;

import java.util.ArrayList;

//A classe Professor, vai estender(herdar) os atributos da classe Pessoa
public class Professor extends Pessoa {
	
	private String formacaoAcademica;
	private double salario;
	
	
	// Fazendo a associação:
	
	/* 
	  Como um professor pode ter várias disciplinas, vamos pegar
	  vários(uma lista) objetos da classe Disciplina, e colocar na classe Professor
	*/
	private ArrayList<Disciplina> disciplinas;
	
	/* 
	  Como um professor pode ter várias turmas, vamos pegar
	  vários(uma lista) objetos da classe Turma, e colocar na classe Professor
	*/
	
	private ArrayList<Turma> turmas;
	
	// Encapsulando os atributos da classe professor, para que possamos obter acesso a eles:
	
	public String getFormacaoAcademica() {
		return formacaoAcademica;
	}

	public void setFormacaoAcademica(String formacaoAcademica) {
		this.formacaoAcademica = formacaoAcademica;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	
	
	// Método (void) que não retorna nada:
	public void aplicarAvaliacao() {
		
	}
	
	// Criando o método construtor da Classe Professor, quando ele for criado, cria o constrututor disciplinas da lista Disciplina:
	public Professor(){
		disciplinas = new ArrayList<Disciplina>();
		
	}
	
	 // ---------------------CRIANDO OS 4 MÉTODOS PARA MANIPULAR A LISTA disciplinas da classe Disciplina--------------------------
	
	//1º
	public void adicionarDisciplina(Disciplina disciplina) {
		// Vai adicionar disciplinas
		disciplinas.add(disciplina);
	}
	
	//2º
	public int quantidadeDisciplinas() {
		// Vai retornar a quantidade de disciplinas
		return disciplinas.size();
	}
	
	//3º
	public void excluirDisciplina(Disciplina disciplina) {
		// Exclui uma disciplina
		disciplinas.remove(disciplina);
	}
	
	//4º
	public Disciplina getDisciplina(int posicao) {
		// Retorna a posição de cada Disciplina na lista de disciplinas
		return disciplinas.get(posicao);
	}
	
}
