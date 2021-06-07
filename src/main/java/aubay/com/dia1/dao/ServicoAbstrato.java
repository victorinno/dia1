package aubay.com.dia1.dao;

import aubay.com.dia1.geradores.GeradorArquivos;
import aubay.com.dia1.entidade.Propriedades;

/**
 * Dao -> Factory Method
 * Serivcos -> Template Method
 * */
import java.io.IOException;

public abstract class ServicoAbstrato<E extends Propriedades> {

    public GeradorArquivos geradorArquivos;

    public ServicoAbstrato(GeradorArquivos geradorArquivos) {
        this.geradorArquivos = geradorArquivos;
    }

    public abstract Dao<E> getDao();

    public void gravarEntidadeEmArquivo(Long id, String nomeArquivo) throws IOException {
        E entidade = getDao().recuperarPorId(id);
        geradorArquivos.gerarArquivos(nomeArquivo, entidade.getProperiedades());
    }

}
