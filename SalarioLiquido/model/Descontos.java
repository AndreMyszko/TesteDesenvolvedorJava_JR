package SalarioLiquido.model;

public class Descontos {
    //attributes:
    public Long id_funcionario;
    public Long id_desconto;
    public Double vl_desconto;
    //constructor:
    public Descontos(Long id_funcionario, Long id_desconto, Double vl_desconto) {
        this.id_funcionario = id_funcionario;
        this.id_desconto = id_desconto;
        this.vl_desconto = vl_desconto;
    }
    //gettars and setters:
    public Long getId_funcionario() {
        return this.id_funcionario;
    }
    public void setId_funcionario(Long id_funcionario) {
        this.id_funcionario = id_funcionario;
    }
    public Long getId_desconto() {
        return this.id_desconto;
    }
    public void setId_desconto(Long id_desconto) {
        this.id_desconto = id_desconto;
    }
    public Double getVl_desconto() {
        return this.vl_desconto;
    }
    public void setVl_desconto(Double vl_desconto) {
        this.vl_desconto = vl_desconto;
    }
}
