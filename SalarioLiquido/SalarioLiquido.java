//COMPILAR EM IDE, UMA VEZ QUE EXISTE MAIS DE UM ARQUIVO(MODEL/CONTROLLER/MAIN)...
package SalarioLiquido;

import SalarioLiquido.controller.SalarioController;

public class SalarioLiquido{
    static SalarioController sc = new SalarioController();
    //MAIN
    public static void main(String []args){
        //PREENCHE LISTAS
        sc.addFuncionario();
        sc.addDescontos();
        //CALCULA SALÁRIOS
        sc.calcularSalarioLiquido();
    }
}