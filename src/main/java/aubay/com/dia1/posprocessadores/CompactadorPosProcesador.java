package aubay.com.dia1.posprocessadores;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class CompactadorPosProcesador implements PosProcessador {

    private String nome = "internal";

    @Override
    public byte[] processar(byte[] dados) {
        try {
            ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
            ZipOutputStream zipOutputStream = new ZipOutputStream(outputStream);
            zipOutputStream.putNextEntry(new ZipEntry(nome));
            zipOutputStream.write(dados);
            zipOutputStream.closeEntry();
            zipOutputStream.close();
            return outputStream.toByteArray();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
