package padroescomportamentais.observer;

import java.util.Observable;

public class Livro extends Observable {


    private String titulo;
    private String autor;
    private Integer ano;
    private String editora;

    public Livro(String titulo, String autor, Integer ano, String editora) {
        this.titulo = titulo;
        this.autor = autor;
        this.ano = ano;
        this.editora = editora;
    }

    public void disponibilizarLivro() {
        setChanged();
        notifyObservers();
    }

    @Override
    public String toString() {
        return "Livro{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", ano=" + ano +
                ", editora='" + editora + '\'' +
                '}';
    }


}
