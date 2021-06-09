package aubay.com.dia1.posprocessadores;

import java.util.stream.IntStream;

public class CriptografadorPosProcessadorChain extends PosProcessadorChain{
    private byte delay;

    public CriptografadorPosProcessadorChain(PosProcessadorChain proximo, byte delay) {
        super(proximo);
        this.delay = delay;
    }

    @Override
    protected byte[] processar(byte[] dados) {
        byte[] newBytes = new byte[dados.length];
        IntStream.range(0, dados.length).forEach(i -> newBytes[i] = (byte) ((dados[i] + delay) % Byte.MAX_VALUE));
        return newBytes;
    }
}
