package aubay.com.dia1.geradores;

import java.io.IOException;
import java.util.Map;

public class GeradorArquivosComposite extends GeradorArquivos {

    private GeradorArquivos atual;
    private GeradorArquivos proximo;
    private String sufixoAtual;
    private String sufixoproximo;

    public GeradorArquivosComposite(GeradorArquivos atual, GeradorArquivos proximo, String sufixoAtual, String sufixoproximo) {
        this.atual = atual;
        this.proximo = proximo;
        this.sufixoAtual = sufixoAtual;
        this.sufixoproximo = sufixoproximo;
    }

    public GeradorArquivos getProximo() {
        return proximo;
    }

    @Override
    public void gerarArquivos(String nome, Map<String, Object> propriedades) throws IOException {
        atual.gerarArquivos(nome+sufixoAtual, propriedades);
        proximo.gerarArquivos(nome+sufixoproximo, propriedades);
    }

    @Override
    protected String gerarConteudo(Map<String, Object> propriedades) {
        return atual.gerarConteudo(propriedades);
    }
}
