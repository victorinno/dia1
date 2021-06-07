package aubay.com.dia1;

import aubay.com.dia1.dao.ServicoProduto;
import aubay.com.dia1.dao.ServicoVenda;
import aubay.com.dia1.entidade.Produto;
import aubay.com.dia1.entidade.Venda;
import aubay.com.dia1.geradores.GeradorJson;
import aubay.com.dia1.geradores.GeradorPropriedades;
import aubay.com.dia1.geradores.GeradorXml;
import aubay.com.dia1.posprocessadores.CompactadorPosProcesador;
import aubay.com.dia1.posprocessadores.CriptografadorPosProcessador;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        long id = 1l;
        GeradorXml geradorXml = new GeradorXml();
        ServicoProduto servicoProdutoXml = new ServicoProduto(geradorXml);
        servicoProdutoXml.getDao().salvar(new Produto(id, "teste", 123.45));
        servicoProdutoXml.gravarEntidadeEmArquivo(id, "testXml.xml");

        GeradorXml geradorXmlCompactado = new GeradorXml();
        geradorXmlCompactado.setPosProcessador(new CompactadorPosProcesador());
        ServicoProduto servicoProdutoXmlCompactado = new ServicoProduto(geradorXmlCompactado);
        servicoProdutoXmlCompactado.getDao().salvar(new Produto(id, "teste", 123.45));
        servicoProdutoXmlCompactado.gravarEntidadeEmArquivo(id, "testXml.zip");

        GeradorXml geradorXmlCriptografado = new GeradorXml();
        geradorXmlCriptografado.setPosProcessador(new CriptografadorPosProcessador(100));
        ServicoProduto servicoProdutoXmlCriptografado = new ServicoProduto(geradorXmlCriptografado);
        servicoProdutoXmlCriptografado.getDao().salvar(new Produto(id, "teste", 123.45));
        servicoProdutoXmlCriptografado.gravarEntidadeEmArquivo(id, "testXml");

        GeradorPropriedades geradorPropriedades = new GeradorPropriedades();
        ServicoProduto servicoProduto = new ServicoProduto(geradorPropriedades);
        servicoProduto.getDao().salvar(new Produto(id, "teste", 123.45));
        servicoProduto.gravarEntidadeEmArquivo(id, "testProp.properties");

        GeradorPropriedades geradorPropriedadesCompactado = new GeradorPropriedades();
        geradorPropriedadesCompactado.setPosProcessador(new CompactadorPosProcesador());
        ServicoProduto servicoProdutoCompactado = new ServicoProduto(geradorPropriedadesCompactado);
        servicoProdutoCompactado.getDao().salvar(new Produto(id, "teste", 123.45));
        servicoProdutoCompactado.gravarEntidadeEmArquivo(id, "testProp.zip");

        GeradorPropriedades geradorPropriedadesCripto = new GeradorPropriedades();
        geradorPropriedadesCripto.setPosProcessador(new CriptografadorPosProcessador(100));
        ServicoProduto servicoProdutoCrip = new ServicoProduto(geradorPropriedadesCripto);
        servicoProdutoCrip.getDao().salvar(new Produto(id, "teste", 123.45));
        servicoProdutoCrip.gravarEntidadeEmArquivo(id, "testProp");

        GeradorJson geradorJson = new GeradorJson();
        ServicoProduto servicoProdutoJson = new ServicoProduto(geradorJson);
        servicoProdutoJson.getDao().salvar(new Produto(id, "teste", 123.45));
        servicoProdutoJson.gravarEntidadeEmArquivo(id, "testJson.json");

        GeradorJson geradorJsonCrip = new GeradorJson();
        geradorJsonCrip.setPosProcessador(new CriptografadorPosProcessador(25));
        ServicoProduto servicoProdutoJsonCrip = new ServicoProduto(geradorJsonCrip);
        servicoProdutoJsonCrip.getDao().salvar(new Produto(id, "teste", 123.45));
        servicoProdutoJsonCrip.gravarEntidadeEmArquivo(id, "testJsonCrip");

        GeradorXml geradorXmlVenda = new GeradorXml();
        ServicoVenda servicoVendaXml = new ServicoVenda(geradorXmlVenda);
        servicoVendaXml.getDao().salvar(new Venda(id, 200, 123.45));
        servicoVendaXml.gravarEntidadeEmArquivo(id, "venda.xml");
    }
}
