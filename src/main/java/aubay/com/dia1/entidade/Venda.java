package aubay.com.dia1.entidade;

import java.util.HashMap;
import java.util.Map;

public class Venda implements Propriedades {

    private Long id;

    private Integer quantidade;

    private Double total;

    public Venda(Long id, Integer quantidade, Double total) {
        this.id = id;
        this.quantidade = quantidade;
        this.total = total;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

    @Override
    public Map<String, Object> getProperiedades() {
        HashMap<String, Object> map = new HashMap<>(3);
        map.put("id", id);
        map.put("quantidade", quantidade);
        map.put("total", total);
        map.put("valorPorQuantidade", (double) total / quantidade);
        return map;
    }
}
