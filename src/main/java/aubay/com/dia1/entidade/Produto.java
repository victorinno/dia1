package aubay.com.dia1.entidade;

import java.util.HashMap;
import java.util.Map;

public class Produto implements Propriedades {

    private Long id;

    private String nome;

    private Double valor;

    public Produto(Long id, String nome, Double valor) {
        this.id = id;
        this.nome = nome;
        this.valor = valor;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    @Override
    public Map<String, Object> getProperiedades() {
        HashMap<String, Object> map = new HashMap<>(3);
        map.put("id", id);
        map.put("nome", nome);
        map.put("valor", valor);
        return map;
    }
}
