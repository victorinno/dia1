package aubay.com.dia1.dao;

import aubay.com.dia1.geradores.GeradorArquivos;
import aubay.com.dia1.entidade.Produto;

public class ServicoProduto extends ServicoAbstrato<Produto> {

    private Dao<Produto> dao;

    public ServicoProduto(GeradorArquivos geradorArquivos) {
        super(geradorArquivos);
    }

    @Override
    public Dao<Produto> getDao() {
        if (dao == null) {
            dao = new ProdutoDao();
        }
        return dao;
    }
}
