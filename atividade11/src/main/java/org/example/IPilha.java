package org.example;

public interface IPilha {
    public void push(Object info);
    public Object pop();
    public Object top(); //retorna sem removê-lo
    public boolean isEmpty();
    public int size();

    public boolean estahVazia();
}
