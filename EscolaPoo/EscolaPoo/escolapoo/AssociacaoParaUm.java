package escolapoo;

//Importação da classe Aluno, que está no package escola
import escola.Aluno;

// Importação da classe Turma, que está no package escola
import escola.Turma;

// Importação do Scanner:
import java.util.Scanner;

// Importação da Data
import java.util.Date;

// Associando aluno com turma:
public class AssociacaoParaUm {
	
	public static void main(String[] args) {
		
		// - Um aluno só pode ter uma turma
		// - Uma turma pode ter vários alunos
		
		// Para associarmos aluno com turma, 1º precisamos criar uma Turma, e o objeto turma1:
		
		// -_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-OBJETO ler_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-
		
		// Instânciando o objeto ler da classe Scanner
		Scanner ler = new Scanner(System.in);
		
		// -_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-OBJETO turma1_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-
		
		// Instânciando o objeto turma1 da classe Turma
		Turma turma1 = new Turma();
		
		System.out.println("Digite a sigla da Turma:");
		turma1.setSigla(ler.nextLine());
		
		System.out.println("Digite o Ano da Turma:");
		turma1.setAno(ler.nextInt());
		
		
		// -_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-OBJETO aluno1_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-
		
		// COMO QUEREMOS COLOCOCAR A TURMA NO ALUNO, PRECISAMOS QUE ESSE ALUNO EXISTA:
		
		// - obejto(aluno1) instanciado da classe Aluno
		Aluno aluno1 = new Aluno();
		
		System.out.println("Digite o Nome do aluno:");
		aluno1.setNome(ler.next());
		
		System.out.println("Digite a Matrícula do Aluno "+aluno1.getNome());
		aluno1.setMatricula(ler.next());
		
		System.out.println("Data de Nascimento do Aluno "+aluno1.getNome());
		aluno1.setDateNascimento(new Date());
		
		//System.out.println("Turma do aluno "+aluno1.getNome());
		// Associação Bidimensional:
		
		aluno1.setTurma(turma1);
		// Add o aluno1 na turma 1
		turma1.adicionarAluno(aluno1);
		
		
		
		
		// -_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-OBJETO aluno2_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-
		
		// - obejto(aluno2) instanciado da classe Aluno
		Aluno aluno2 = new Aluno();
		
		System.out.println("Digite o Nome do aluno:");
		aluno2.setNome(ler.next());
		
		System.out.println("Digite a Matrícula do Aluno "+aluno2.getNome());
		aluno2.setMatricula(ler.next());
		
		System.out.println("Data de Nascimento do Aluno "+aluno2.getNome());
		aluno2.setDateNascimento(new Date());
		
		//System.out.println("Turma do aluno "+aluno2.getNome());
		
		// Associação Bidimensional:
		aluno2.setTurma(turma1);
		// Add aluno2 na turma1
		turma1.adicionarAluno(aluno2);
		
		// PRINTANDO OS DADOS DO ALUNO1:
		System.out.println();
		System.out.println("DADOS DO ALUNO 1");
		System.out.println();
		System.out.println("Nome: "+aluno1.getNome());
		System.out.println("Matrícula: "+aluno1.getMatricula());
		System.out.println("Data de Nascimento: "+aluno1.getDateNascimento());
		System.out.println("Turma/Sigla: "+aluno1.getTurma().getSigla());
		System.out.println();
		
		// PRINTANDO OS DADOS DO ALUNO2:
		System.out.println("DADOS DO ALUNO 2");
		System.out.println();
		System.out.println("Nome: "+aluno2.getNome());
		System.out.println("Matrícula: "+aluno2.getMatricula());
		System.out.println("Data de Nascimento: "+aluno2.getDateNascimento());
		System.out.println("Turma/Sigla: "+aluno2.getTurma().getSigla());
		System.out.println();
		
		// PRINTADO OS DADOS DA TURMA1:
		System.out.println("Alunos da turma1");
		System.out.println();
		// Estrutura de repetição que vai printar na tela os alunos pertencentes a turma 1.
		// Para isso definimos um contador que vai percorrer a quantidade de alunos e logo
		// depois vai imprimir o nome do aluno da posição i, até chegar a quantidade de alunos cadastrados.
		
		for(int i = 0; i < turma1.quantidadeAlunos(); i++) {
			System.out.println(turma1.getAluno(i).getNome());
		}

	}
}
