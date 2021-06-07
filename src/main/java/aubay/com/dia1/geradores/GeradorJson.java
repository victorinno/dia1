package aubay.com.dia1.geradores;

import java.util.Map;
import java.util.stream.Collectors;

public class GeradorJson extends GeradorArquivos{
    @Override
    protected String gerarConteudo(Map<String, Object> propriedades) {
        return propriedades.keySet().stream()
                .map(prop -> String.format("\"%s\":\"%s\"", prop, propriedades.get(prop)))
                .collect(Collectors.joining(",", "{", "}"));
    }
}
