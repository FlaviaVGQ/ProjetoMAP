package br.uepb.edu.domain.TiposDeLivros;

import br.uepb.edu.domain.Livro;
import br.uepb.edu.domain.Interfaces.LivroFactory;
import br.uepb.edu.domain.LivroTipo;


public class DidaticoFactory implements LivroFactory {
    @Override
    public Livro criarLivro() {
        return new Livro(LivroTipo.DIDATICO);
    }
}