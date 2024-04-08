package br.com.felipehs;

public class Main {
    public static void main(String[] args) {
        Vetor vetorDeAlunos = new Vetor(6);

        Aluno aluno = new Aluno("Felipe", 18, 10.0);
        Aluno aluno1 = new Aluno("Gabriel", 17, 7.5);
        Aluno aluno2 = new Aluno("Pedro", 18, 10.0);
        Aluno aluno3 = new Aluno("Joao", 21, 10.0);
        Aluno aluno4 = new Aluno("Pedro", 18, 10.0);

        vetorDeAlunos.add(aluno);
        vetorDeAlunos.add(aluno1);
        vetorDeAlunos.add(aluno2);
        vetorDeAlunos.add(aluno3);
        vetorDeAlunos.add(aluno4);


        System.out.println("Tamanho do vetor é: " + vetorDeAlunos.tamanho());

        if (vetorDeAlunos.contem(aluno))
            System.out.println("O aluno " + aluno.getNome() + " está presente no vetor.");
        else
            System.out.println("O aluno " + aluno.getNome() + " não está presente no vetor.");


        Aluno alunoTeste= new Aluno("Rafael", 20, 4.0);
        if (vetorDeAlunos.contem(alunoTeste))
            System.out.println("O aluno " + alunoTeste.getNome() + " está presente no vetor.");
        else
            System.out.println("O aluno " + alunoTeste.getNome() + " não está presente no vetor.");


    }
}
