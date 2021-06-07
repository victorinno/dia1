package aubay.com.dia1.dao;

import aubay.com.dia1.entidade.Venda;
import aubay.com.dia1.geradores.GeradorArquivos;

public class ServicoVenda extends ServicoAbstrato<Venda> {

    private Dao<Venda> dao;

    public ServicoVenda(GeradorArquivos geradorArquivos) {
        super(geradorArquivos);
    }

    @Override
    public Dao<Venda> getDao() {
        if(dao == null){
            dao = new VendaDao();
        }
        return dao;
    }
}
