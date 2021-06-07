package aubay.com.dia1.dao;

import aubay.com.dia1.entidade.Venda;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class VendaDao implements Dao<Venda> {

    private Map<Long, Venda> db = new HashMap<>();

    @Override
    public Venda recuperarPorId(Long id) {
        return db.get(id);
    }

    @Override
    public void salvar(Venda entidade) {
        db.put(entidade.getId(), entidade);
    }

    @Override
    public void excluir(Long id) {
        db.remove(id);
    }

    @Override
    public List<Venda> listarTodos() {
        return (List<Venda>) db.values();
    }
}
