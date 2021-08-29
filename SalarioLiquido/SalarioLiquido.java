package SalarioLiquido;

import SalarioLiquido.controller.SalarioController;

public class SalarioLiquido{
    static SalarioController sc = new SalarioController();
    //MAIN
    public static void main(String []args){
        System.out.println("Resultado: ");
        sc.addFuncionario();
        sc.addDescontos();
    }

}