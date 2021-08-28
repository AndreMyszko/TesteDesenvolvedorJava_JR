import java.text.DecimalFormat;

public class SalarioLiquido{
    //MAIN
    public static void main(String []args){
       System.out.println("Hello World");
    }

    //CLASS
    public class Funcionario{
        public Long id_funcionario;
        public String nm_cliente;
        public DecimalFormat vl_salario_bruto;
    }

    public class Descontos{
        public Long id_funcionario;
        public Long id_desconto;
        public DecimalFormat vl_desconto;
    }

    //CONTROLLER
    //public class SalarioController
}