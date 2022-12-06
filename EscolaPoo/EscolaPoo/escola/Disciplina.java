package escola;

import java.util.ArrayList;

public class Disciplina {
	// Atributos
	private String nome;
	private int cargaHoraria;
	
	// Fazendo a associação:
	
	/* 
	  Como uma Disciplina pode ter várias professores, vamos pegar
	  vários(uma lista) professores da classe Professor, e colocar na classe Disciplina
	*/
	
	private ArrayList<Professor> professores;
	
	/* 
	  Como uma Disciplina pode ter várias turmas, vamos pegar
	  vários(uma lista) turmas da classe Turma, e colocar na classe Disciplina
	*/
	
	private ArrayList<Turma> turmas;
	
	
	// ENCAPSULAMENTO DOS ATRIBUTOS:{
		public String getNome() {
			return nome;
		}
	
		public void setNome(String nome) {
			this.nome = nome;
		}
	
		public int getCargaHoraria() {
			return cargaHoraria;
		}
//  }	
		
		// Criando o método construtor da classe Disciplina, assim, quando uma disciplina
		// for criada, criamos também uma lista de professores :
		public Disciplina() {
			professores = new ArrayList<Professor>();
		}
		
		 // --------------------- CRIANDO OS 4 MÉTODOS PARA MANIPULAR A LISTA professores da classe Professor: -----------------------
		
		//1º
		public void adicionarProfessor(Professor professor) {
			// Adiciona professor
			professores.add(professor);
		}
		
		//2º
		public int quantidadeProfessores() {
			// Retorna a quantidade de professores
			return professores.size();
		}
		
		//3º
		public void excluirProfessor(Professor professor) {
			// Exclui professor
			professores.remove(professor);
		}
		
		//4º
		public Professor getProfessor(int posicao) {
			// Retorna os professores de cada posição
			return professores.get(posicao);
		}
		
		// ----------------------------------------------------------------------------------------------
		
	public void setCargaHoraria(int cargaHoraria) {
		
		// Fazendo a verificação da carga horária, 
		// se for maior que 0, armazena no atributo cargaHoraria do objeto disciplina1:
		
		if(cargaHoraria >= 0) {
			this.cargaHoraria = cargaHoraria;
		}
		
	}
	
}
