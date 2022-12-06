package escolapoo;

import java.util.Scanner;

import escola.Disciplina;

public class EscolaPoo {
	
	public static void main(String[] args) {
		
		// Criando os objetos:
		// para cadastrar uma disciplina eu preciso criar um objeto
		
		// Chamando a classe Disciplina, e criando o objeto disciplina1:
		Disciplina disciplina1 = new Disciplina();
		Scanner ler = new Scanner(System.in);
		
		// Usando o Set para alterar o valor do atributo nome;
		System.out.println("Digite o nome da Disciplina:");
		disciplina1.setNome(ler.nextLine());
		
		// Usando o Set para alterar o valor do atributo cargaHoraria;
		System.out.println("Digite a carga Horaria da Disciplina");
		disciplina1.setCargaHoraria(ler.nextInt());
		
		// Imprimindo o nome:
		System.out.println("Disciplina: "+disciplina1.getNome());
		
		// Imprimindo a cargaHoraria:
		System.out.println("Carga Horária: "+disciplina1.getCargaHoraria());
		
		// Como não estamos usando o conteiro de encapsulamento de forma correta,
		// de forma a proteger os dados, como não permitindo colocar numeros negativos na cargaHoraria por exemplo.
		// Com isso devemos fazer uma proteção do atributo cargaHoraria do objeto disciplina1 de valores negativos.
		
	}
}
