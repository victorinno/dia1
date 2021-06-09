package aubay.com.dia1.posprocessadores;

public class PosProcessadorChainNull extends PosProcessadorChain {

    public PosProcessadorChainNull(PosProcessadorChain proximo) {
        super(proximo);
    }

    public PosProcessadorChainNull() {
    }

    @Override
    public byte[] processar(byte[] dados) {
        return dados;
    }
}
