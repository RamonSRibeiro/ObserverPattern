package padroescomportamentais.observer;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LeitorTest {


    @Test
    void deveNotificarUmLeitor() {
        Livro livro = new Livro("Dom Casmurro", "Machado de Assis", 1899, "Garnier");
        Leitor leitor = new Leitor("Leitor 1");
        leitor.acompanhar(livro);
        livro.disponibilizarLivro();
        assertEquals("Leitor 1, livro disponível na Livro{titulo='Dom Casmurro', autor='Machado de Assis', ano=1899, editora='Garnier'}", leitor.getUltimaNotificacao());
    }

    @Test
    void deveNotificarLeitores() {
        Livro livro = new Livro("Dom Casmurro", "Machado de Assis", 1899, "Garnier");
        Leitor leitor1 = new Leitor("Leitor 1");
        Leitor leitor2 = new Leitor("Leitor 2");
        leitor1.acompanhar(livro);
        leitor2.acompanhar(livro);
        livro.disponibilizarLivro();
        assertEquals("Leitor 1, livro disponível na Livro{titulo='Dom Casmurro', autor='Machado de Assis', ano=1899, editora='Garnier'}", leitor1.getUltimaNotificacao());
        assertEquals("Leitor 2, livro disponível na Livro{titulo='Dom Casmurro', autor='Machado de Assis', ano=1899, editora='Garnier'}", leitor2.getUltimaNotificacao());
    }

    @Test
    void naoDeveNotificarLeitor() {
        Livro livro = new Livro("Dom Casmurro", "Machado de Assis", 1899, "Garnier");
        Leitor leitor = new Leitor("Leitor 1");
        livro.disponibilizarLivro();
        assertEquals(null, leitor.getUltimaNotificacao());
    }

    @Test
    void deveNotificarLeitorLivroA() {
        Livro livroA = new Livro("Dom Casmurro", "Machado de Assis", 1899, "Garnier");
        Livro livroB = new Livro("O Cortiço", "Aluísio Azevedo", 1890, "Garnier");
        Leitor leitor1 = new Leitor("Leitor 1");
        Leitor leitor2 = new Leitor("Leitor 2");
        leitor1.acompanhar(livroA);
        leitor2.acompanhar(livroB);
        livroA.disponibilizarLivro();
        assertEquals("Leitor 1, livro disponível na Livro{titulo='Dom Casmurro', autor='Machado de Assis', ano=1899, editora='Garnier'}", leitor1.getUltimaNotificacao());
        assertEquals(null, leitor2.getUltimaNotificacao());
    }


}
