package aubay.com.dia1.geradores;

import java.text.MessageFormat;
import java.util.Map;
import java.util.stream.Collectors;

public class GeradorPropriedades extends GeradorArquivos {

    @Override
    protected String gerarConteudo(Map<String, Object> propriedades) {
        return propriedades.keySet().stream()
                .map(prop -> MessageFormat.format("{0}={1}\n", prop, propriedades.get(prop)))
                .collect(Collectors.joining());
    }

}
