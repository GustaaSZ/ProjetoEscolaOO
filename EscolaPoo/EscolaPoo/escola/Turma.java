package escola;

import java.util.ArrayList;

public class Turma {
	
	private String sigla;
	private int ano;
	
	// Fazendo a associação:
	
	/* 
	  Como uma turma pode ter vários alunos, vamos pegar
	  vários objetos da classe Aluno, e colocar na classe Turma
	*/
	private ArrayList<Aluno> alunos;
	
	/* 
	  Como uma turma pode ter várias professores, vamos pegar
	  vários(uma lista) objetos da classe Professores, e colocar na classe Turma
	*/
	
	private ArrayList<Professor> professores;
	
	/* 
	  Como uma Turma pode ter várias disciplinas, vamos pegar
	  vários(uma lista) objetos da classe Disciplina, e colocar na classe Turma
	*/
	
	private ArrayList<Disciplina> disciplinas;
	
	
	/*
	 * Quando criamos uma lista em java, por padrão ela tem um valor nulo(null).
	 * Então por isso, precisamos fazer o método constrututor da lista de alunos.
	 * Porém quero que esse método constrututor da lista de alunos seja criada quando o método construtor da classe Turma for criado.
	 */
	
	public Turma(){
		alunos = new ArrayList<Aluno>();
	}
	
	// -_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-Manipulando Listas de alunos da classe Aluno_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_
	
	// 1º Função void que adiciona alunos, e não retorna nada;
	public void adicionarAluno(Aluno aluno) {
		
		// Add aluno na lista de alunos da classe Aluno
		alunos.add(aluno);
		
	}
	
	// 2º função que retorna a quantidade de alunos
	public int quantidadeAlunos() {
		
		// Vai retornar a quantidade alunos da lista alunos, da classe Aluno
		return alunos.size();
	}
	
	// 3º Função que exclui aluno, não retorna nada;
	public void excluirAluno(Aluno aluno) {
		alunos.remove(aluno);
	}
	
	// 4º Método que Pega cada aluno da Lista:
	public Aluno getAluno(int posicao) {
		
		// Função que vai retornar um objeto da classe Aluno, que neste caso é a posição
		return alunos.get(posicao);
		
	}
	
	// Método void que não retorna nada:
	void adicionarAluno() {
		
	}
	
	// Encapsulando os atributos Sigla e Ano, que por sua vez são privado
	// e usando os geters e seters, consiguimos obter acesso á esses atributos:
	
	public String getSigla() {
		return sigla;
	}

	public void setSigla(String sigla) {
		this.sigla = sigla;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}
	
	
}
