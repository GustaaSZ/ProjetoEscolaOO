package escolapoo;

// Importanto a classe Disciplina que está no package escola
import escola.Disciplina;

//Importanto a classe Disciplina que está no package escola
import escola.Professor;

// Importando o Scanner:
import java.util.Scanner;

public class AssociacaoMuitosParaMuitos {
	
	public static void main(String[] args) {
		
		//--------------------------- OBJETO ler ---------------------------:
		// Construtor que tráz a existência o objeto ler
		Scanner ler = new Scanner(System.in);
		
		//-------------------------------- OBJETO disciplina1 instanciado pela classe Disciplina ---------------------------
		
		// Construtor que tráz a existência o objeto disciplina1
		Disciplina disciplina1 = new Disciplina();
		
		System.out.println("Digite o nome da Disciplina:");
		disciplina1.setNome(ler.next());
		
		System.out.println("Digite a carga horária da disciplina:");
		disciplina1.setCargaHoraria(ler.nextInt());
		
		
		
		//-------------------------------- OBJETO disciplina2 instanciado pela classe Disciplina ---------------------------
		
		// Construtor que tráz a existência o objeto disciplina1
		Disciplina disciplina2 = new Disciplina();
		
		System.out.println("Digite o nome da Disciplina:");
		disciplina2.setNome(ler.next());
		
		System.out.println("Digite a carga horária da disciplina:");
		disciplina2.setCargaHoraria(ler.nextInt());
		
		
		
		//-------------------------------- OBJETO professor1 instânciado pela classe Professor ---------------------------
		Professor professor1 = new Professor();
		
		// matricula, nome, salario e formacao academica
		
		System.out.println("Digite o nome do professor:");
		professor1.setNome(ler.next());
		
		System.out.println("Digite a matricula do professor "+professor1.getNome());
		professor1.setMatricula(ler.next());
		
		System.out.println("Digite o seu salário professor "+professor1.getNome());
		professor1.setSalario(ler.nextDouble());
		
		System.out.println("Digite sua formação acadêmica professor "+professor1.getNome());
		professor1.setFormacaoAcademica(ler.next());
		
		
		
		//-------------------------------- OBJETO professor2 instânciado pela classe Professor ---------------------------
		Professor professor2 = new Professor();
		
		// matricula, nome, salario e formacao academica
		
		System.out.println("Digite o nome do professor:");
		professor2.setNome(ler.next());
		
		System.out.println("Digite a matricula do professor "+professor2.getNome());
		professor2.setMatricula(ler.next());
		
		System.out.println("Digite o seu salário professor "+professor2.getNome());
		professor2.setSalario(ler.nextDouble());
		
		System.out.println("Digite sua formação acadêmica professor "+professor2.getNome());
		professor2.setFormacaoAcademica(ler.next());
		
		
		// Associação bi-dimensioanal entre o professor1 e a disciplina1:
		professor1.adicionarDisciplina(disciplina1);
		disciplina1.adicionarProfessor(professor1);
		
		
		// Associação bi-dimensioanal entre o professor1 e a disciplina2:
		professor1.adicionarDisciplina(disciplina2);
		disciplina2.adicionarProfessor(professor1);
		
		
		// Associação bi-dimensioanal entre o professor2 e a disciplina1:
		professor2.adicionarDisciplina(disciplina1);
		disciplina1.adicionarProfessor(professor2);
		
		
		// Associação bi-dimensioanal entre o professor2 e a disciplina2:
		professor2.adicionarDisciplina(disciplina2);
		disciplina2.adicionarProfessor(professor2);
		
		
		//-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_- LISTAR AS DISCIPLINAS DO professor1 -_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_:
		
		System.out.println("Disciplinas do Professor "+professor1.getNome());
		System.out.println();
		
		for(int contador = 0; contador < professor1.quantidadeDisciplinas(); contador++) {
			//Disciplina disciplina = professor1.getDisciplina(contador);
			//System.out.println(disciplina.getNome());
			System.out.println("Nome da Disciplina: "+professor1.getDisciplina(contador).getNome());
			System.out.println("Carga Horária da Disciplina: "+professor1.getDisciplina(contador).getCargaHoraria()+"h");
			System.out.println();
		}
		System.out.println();
		
		
		//-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_- LISTAR AS DISCIPLINAS DO professor2 -_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_:
		
		System.out.println("Disciplinas do Professor "+professor2.getNome());
		System.out.println();
		
		for(int contador = 0; contador < professor2.quantidadeDisciplinas(); contador++) {
			//Disciplina disciplina = professor1.getDisciplina(contador);
			//System.out.println(disciplina.getNome());
			System.out.println("Nome da Disciplina: "+professor2.getDisciplina(contador).getNome());
			System.out.println("Carga Horária da Disciplina: "+professor2.getDisciplina(contador).getCargaHoraria()+"h");
			System.out.println();
		}
		System.out.println();
		
		
		//-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_- LISTAR OS PROFESSORES DA disciplina1 -_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_:
		
		System.out.println("Professores que Lecionam a Disciplina "+disciplina1.getNome());
		System.out.println();
		
		for(int contador = 0; contador < disciplina1.quantidadeProfessores(); contador++) {
			
			System.out.println("Nome do Professor: "+disciplina1.getProfessor(contador).getNome());
			System.out.println("Formação Acadêmica: "+disciplina1.getProfessor(contador).getFormacaoAcademica());
			System.out.println("Matrícula: "+disciplina1.getProfessor(contador).getMatricula());
			System.out.println();
		}
		System.out.println();
		
		
		
		//-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_- LISTAR OS PROFESSORES DA disciplina2 -_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_:
		
		System.out.println("Professores que Lecionam a Disciplina "+disciplina2.getNome());
		System.out.println();
		
		for(int contador = 0; contador < disciplina2.quantidadeProfessores(); contador++) {
		
			System.out.println("Nome do Professor: "+disciplina2.getProfessor(contador).getNome());
			System.out.println("Formação Acadêmica: "+disciplina2.getProfessor(contador).getFormacaoAcademica());
			System.out.println("Matrícula: "+disciplina2.getProfessor(contador).getMatricula());
			System.out.println();
		}
		System.out.println();
		
	}
	
}
