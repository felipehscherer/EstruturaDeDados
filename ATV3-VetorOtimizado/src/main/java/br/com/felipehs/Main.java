package br.com.felipehs;

public class Main {

	public static void main(String[] args) {
		VetorAlunosOtimizado vetorDeAlunos = new VetorAlunosOtimizado(3);

		Aluno a1 = new Aluno("Felipe", 18, 10.0);
		Aluno a2 = new Aluno("Pedro", 21, 8.5);
		Aluno a3 = new Aluno("Joao", 17, 6.2);
		Aluno a4 = new Aluno("Felipe", 18, 10.0);
		Aluno a5 = new Aluno("Gabriel", 20, 9.0);

		vetorDeAlunos.adiciona(a1);
		vetorDeAlunos.adiciona(a2);
		vetorDeAlunos.adiciona(a3);
		vetorDeAlunos.adiciona(a4);
		vetorDeAlunos.adiciona(a5);

		System.out.println("Todos os alunos: ");
		vetorDeAlunos.printVetor();
		System.out.println("---remove gabriel---");
		vetorDeAlunos.remove(a5);
		vetorDeAlunos.printVetor();
		System.out.println("------");


		System.out.println(vetorDeAlunos.contem(a5));
		System.out.println(vetorDeAlunos.contem(a1));
	}
}
