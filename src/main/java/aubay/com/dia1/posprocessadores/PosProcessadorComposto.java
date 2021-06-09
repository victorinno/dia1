package aubay.com.dia1.posprocessadores;

import java.util.Arrays;
import java.util.List;

public class PosProcessadorComposto implements PosProcessador{

    private List<PosProcessador> processadores;

    public PosProcessadorComposto(PosProcessador... posProcessadors) {
        this.processadores = Arrays.asList(posProcessadors);
    }

    @Override
    public byte[] processar(byte[] dados) {
        for(PosProcessador p : processadores){
            dados = p.processar(dados);
        }
        return dados;
    }
}
