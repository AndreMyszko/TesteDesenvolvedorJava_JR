package SalarioLiquido.controller;

import java.util.ArrayList;
import java.util.List;

import SalarioLiquido.model.Funcionario;
import SalarioLiquido.model.Descontos;

public class SalarioController {
    //CÁLCULO SALÁRIO LÍQUIDO

    

    //REPOSITORY - SPRINGBOOT/JPA/JDBC/HIBERNATE/SQL...
    static List<Funcionario> listaFuncionario = new ArrayList<Funcionario>();
    static List<Descontos> listaDescontos = new ArrayList<Descontos>();
    public static List<Funcionario> addFuncionario(){
        Funcionario jonas = new Funcionario((long) 81, "Jonas Alberto Lekinihs", 3235.00);
        Funcionario roseli = new Funcionario((long) 82, "Roseli Nunes", 1750.00);
        Funcionario silvio = new Funcionario((long) 83, "Silvio Santos", 17321.00);
        Funcionario maria = new Funcionario((long) 84, "Maria da Glória", 7322.00);
        Funcionario roberto = new Funcionario((long) 85, "Roberto Robertinho", 2280.00);
        listaFuncionario.add(jonas);
        listaFuncionario.add(roseli);
        listaFuncionario.add(silvio);
        listaFuncionario.add(maria);
        listaFuncionario.add(roberto);
        System.out.println(">quantidade de funcionários: " + listaFuncionario.size());
        return listaFuncionario;
    }
    public static List<Descontos> addDescontos(){
        Descontos d1 = new Descontos(listaFuncionario.get(0).getId_funcionario(), (long) 1, 11.56);
        Descontos d2 = new Descontos(listaFuncionario.get(0).getId_funcionario(), (long) 2, 54.22);
        Descontos d3 = new Descontos(listaFuncionario.get(0).getId_funcionario(), (long) 3, 12.88);
        Descontos d4 = new Descontos(listaFuncionario.get(0).getId_funcionario(), (long) 4, 59.54);
        Descontos d5 = new Descontos(listaFuncionario.get(0).getId_funcionario(), (long) 5, 150.55);
        Descontos d6 = new Descontos(listaFuncionario.get(0).getId_funcionario(), (long) 6, 56.63);
        Descontos d7 = new Descontos(listaFuncionario.get(1).getId_funcionario(), (long) 7, 46.89);
        Descontos d8 = new Descontos(listaFuncionario.get(1).getId_funcionario(), (long) 8, 455.53);
        Descontos d9 = new Descontos(listaFuncionario.get(1).getId_funcionario(), (long) 9, 78.99);
        Descontos d10 = new Descontos(listaFuncionario.get(1).getId_funcionario(), (long) 10, 78.67);
        Descontos d11 = new Descontos(listaFuncionario.get(1).getId_funcionario(), (long) 11, 45.23);
        Descontos d12 = new Descontos(listaFuncionario.get(2).getId_funcionario(), (long) 12, 937.29);
        Descontos d13 = new Descontos(listaFuncionario.get(2).getId_funcionario(), (long) 13, 899.22);
        Descontos d14 = new Descontos(listaFuncionario.get(2).getId_funcionario(), (long) 14, 789.67);
        Descontos d15 = new Descontos(listaFuncionario.get(2).getId_funcionario(), (long) 15, 899.66);
        Descontos d16 = new Descontos(listaFuncionario.get(3).getId_funcionario(), (long) 16, 860.57);
        Descontos d17 = new Descontos(listaFuncionario.get(3).getId_funcionario(), (long) 17, 46.22);
        Descontos d18 = new Descontos(listaFuncionario.get(3).getId_funcionario(), (long) 18, 68.88);
        Descontos d19 = new Descontos(listaFuncionario.get(4).getId_funcionario(), (long) 19, 15.27);
        Descontos d20 = new Descontos(listaFuncionario.get(4).getId_funcionario(), (long) 20, 88.55);
        listaDescontos.add(d1);
        listaDescontos.add(d2);
        listaDescontos.add(d3);
        listaDescontos.add(d4);
        listaDescontos.add(d5);
        listaDescontos.add(d6);
        listaDescontos.add(d7);
        listaDescontos.add(d8);
        listaDescontos.add(d9);
        listaDescontos.add(d10);
        listaDescontos.add(d11);
        listaDescontos.add(d12);
        listaDescontos.add(d13);
        listaDescontos.add(d14);
        listaDescontos.add(d15);
        listaDescontos.add(d16);
        listaDescontos.add(d17);
        listaDescontos.add(d18);
        listaDescontos.add(d19);
        listaDescontos.add(d20);
        System.out.println(">quantidade de descontos geral: " + listaDescontos.size());
        return listaDescontos;
    }
}
