package aubay.com.dia1.posprocessadores;

public class NullPorProcessador implements PosProcessador {
    @Override
    public byte[] processar(byte[] dados) {
        return dados;
    }
}
