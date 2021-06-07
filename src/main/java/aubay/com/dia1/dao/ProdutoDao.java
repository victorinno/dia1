package aubay.com.dia1.dao;

import aubay.com.dia1.entidade.Produto;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProdutoDao implements Dao<Produto> {

    private Map<Long, Produto> db = new HashMap<>();

    @Override
    public Produto recuperarPorId(Long id) {
        return db.get(id);
    }

    @Override
    public void salvar(Produto entidade) {
        db.put(entidade.getId(), entidade);
    }

    @Override
    public void excluir(Long id) {
        db.remove(id);
    }

    @Override
    public List<Produto> listarTodos() {
        return (List<Produto>) db.values();
    }
}
