package aubay.com.dia1.dao;

import aubay.com.dia1.entidade.Propriedades;

import java.util.List;

public interface Dao<E extends Propriedades> {
    public E recuperarPorId(Long id);

    public void salvar(E entidade);

    public void excluir(Long id);

    public List<E> listarTodos();
}
