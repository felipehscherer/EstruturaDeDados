package br.com.felipehs;

public interface IVetorAlunos {
    public void adiciona(Aluno aluno);
    public int tamanho();
    public boolean contem(Aluno aluno);
    public boolean cheio();
    public boolean remove(Aluno aluno);
    public void garanteEspaco();
}
