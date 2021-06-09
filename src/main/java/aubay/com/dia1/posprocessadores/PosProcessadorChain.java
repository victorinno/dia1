package aubay.com.dia1.posprocessadores;

public abstract class PosProcessadorChain{

    private PosProcessadorChain proximo;

    public PosProcessadorChain(PosProcessadorChain proximo) {
        this.proximo = proximo;
    }

    public PosProcessadorChain() {
        this.proximo = new PosProcessadorChainNull();
    }

    public byte[] processarCadeia(byte[] dados){
        byte[] d = processar(dados);
        return proximo.processarCadeia(d);
    }

    protected abstract byte[] processar(byte[] dados);

}
