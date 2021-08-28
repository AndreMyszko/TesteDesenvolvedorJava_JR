package SalarioLiquido.model;

public class Funcionario {
    //attributes:
    private Long id_funcionario;
    private String nm_cliente;
    private Double vl_salario_bruto;
    //constructor:
    public Funcionario(Long id, String nome, Double salario) {
        this.id_funcionario = id;
        this.nm_cliente = nome;
        this.vl_salario_bruto = salario;
    }
    //getter and setters:
    public Long getId_funcionario() {
        return id_funcionario;
    }
    public void setId_funcionario(Long id) {
        this.id_funcionario = id;
    }
    public String getNm_cliente() {
        return nm_cliente;
    }
    public void setNm_cliente(String nome) {
        this.nm_cliente = nome;
    }
    public Double getVl_salario_bruto() {
        return vl_salario_bruto;
    }
    public void setVl_salario_bruto(Double salario) {
        this.vl_salario_bruto = salario;
    }
}
