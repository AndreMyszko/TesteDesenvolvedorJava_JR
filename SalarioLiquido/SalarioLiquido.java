package SalarioLiquido;

import SalarioLiquido.controller.SalarioController;

public class SalarioLiquido{
    //MAIN
    public static void main(String []args){
        System.out.println("Resultado: ");
        SalarioController().addFuncionario();
        SalarioController().addDescontos();
    }

    private static SalarioController SalarioController() {
        return null;
    }
}