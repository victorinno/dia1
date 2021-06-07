package aubay.com.dia1.posprocessadores;

import java.util.stream.IntStream;

public class CriptografadorPosProcessador implements PosProcessador {

    private final int delay;

    public CriptografadorPosProcessador(int delay) {
        this.delay = delay;
    }

    @Override
    public byte[] processar(byte[] dados) {
        byte[] newBytes = new byte[dados.length];
        IntStream.range(0, dados.length).forEach(i -> newBytes[i] = (byte) ((dados[i] + delay) % Byte.MAX_VALUE));
        return newBytes;
    }
}
