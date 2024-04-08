package br.com.felipehs;

public class VetorAlunosOtimizado implements IVetorAlunos {
	private Aluno[] alunos;

	private int totalAlunos = 0;

	@Override
	public void garanteEspaco(){
		Aluno[] novoAlunos = new Aluno[this.totalAlunos * 2];
		for (int i = 0; i < this.alunos.length; i++)
			novoAlunos[i] = this.alunos[i];
		this.alunos = novoAlunos;

	}


	public VetorAlunosOtimizado(int capacidade){
		this.alunos = new Aluno[capacidade];
	}


	@Override
	public void adiciona(Aluno aluno) {
		if (this.cheio())
			this.garanteEspaco();
		this.alunos[this.totalAlunos] = aluno;
		this.totalAlunos++;
	}

	@Override
	public boolean remove(Aluno aluno) {
		for (int i = 0; i < this.totalAlunos; i++) {
			if (this.alunos[i] != null && this.alunos[i].equals(aluno)) {
				for (int j = i; j < this.totalAlunos - 1; j++) {
					this.alunos[j] = this.alunos[j + 1];
				}
				this.alunos[this.totalAlunos - 1] = null;
				this.totalAlunos--;
				return true;
			}
		}
		return false;
	}

	@Override
	public boolean cheio(){
		return totalAlunos == this.alunos.length;
	}

	@Override
	public int tamanho(){
		return totalAlunos;
	}

	@Override
	public boolean contem(Aluno aluno) {
		for (int i = 0; i < this.totalAlunos; i++) {
			if (this.alunos[i] != null && this.alunos[i].equals(aluno)) {
				return true;
			}
		}
		return false;
	}

	public void printVetor(){
		for (int i = 0; i < totalAlunos; i++) {
			System.out.println(alunos[i]);
		}
	}

	
}
