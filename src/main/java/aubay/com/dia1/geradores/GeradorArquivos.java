package aubay.com.dia1.geradores;

import aubay.com.dia1.posprocessadores.NullPorProcessador;
import aubay.com.dia1.posprocessadores.PosProcessador;

import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Map;

/**
 * Template Method
 *
 * */
public abstract class GeradorArquivos {

    protected PosProcessador posProcessador = new NullPorProcessador();

    /**
     * Bridge
     * */
    public void setPosProcessador(PosProcessador posProcessador) {
        this.posProcessador = posProcessador;
    }

    public void gerarArquivos(String nome, Map<String, Object> propriedades) throws IOException {
        String conteudo = gerarConteudo(propriedades);
        byte[] dados = conteudo.getBytes(StandardCharsets.UTF_8);
        dados = posProcessador.processar(dados);
        FileOutputStream stream = new FileOutputStream(nome);
        stream.write(dados);
        stream.close();
    }

    protected abstract String gerarConteudo(Map<String, Object> propriedades);
}
