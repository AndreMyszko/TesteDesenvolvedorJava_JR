package SalarioLiquido.controller;

import java.util.ArrayList;
import java.util.List;

import SalarioLiquido.model.Funcionario;
import SalarioLiquido.model.Descontos;

public class SalarioController {

    static List<Funcionario> listaFuncionario = new ArrayList<Funcionario>();
    static List<Descontos> listaDescontos = new ArrayList<Descontos>();

    public static List<Funcionario> addFuncionario(){
        Funcionario a = new Funcionario((long) 1, "andre", 50.00);
        Funcionario b = new Funcionario((long) 2, "luiz", 50.00);
        Funcionario c = new Funcionario((long) 3, "bill", 50.00);
        listaFuncionario.add(a);
        listaFuncionario.add(b);
        listaFuncionario.add(c);
        
        System.out.println(listaFuncionario.size());
        return listaFuncionario;
    }

    public static List<Descontos> addDescontos(){
        Descontos d1 = new Descontos(listaFuncionario.get(0).getId_funcionario(), (long) 1, 50.00);
        Descontos d2 = new Descontos(listaFuncionario.get(0).getId_funcionario(), (long) 1, 50.00);
        Descontos d3 = new Descontos(listaFuncionario.get(0).getId_funcionario(), (long) 1, 50.00);
        Descontos d4 = new Descontos(listaFuncionario.get(1).getId_funcionario(), (long) 1, 50.00);
        Descontos d5 = new Descontos(listaFuncionario.get(1).getId_funcionario(), (long) 1, 50.00);
        Descontos d6 = new Descontos(listaFuncionario.get(1).getId_funcionario(), (long) 1, 50.00);
        Descontos d7 = new Descontos(listaFuncionario.get(2).getId_funcionario(), (long) 1, 50.00);
        Descontos d8 = new Descontos(listaFuncionario.get(2).getId_funcionario(), (long) 1, 50.00);
        Descontos d9 = new Descontos(listaFuncionario.get(2).getId_funcionario(), (long) 1, 50.00);
        listaDescontos.add(d1);
        listaDescontos.add(d2);
        listaDescontos.add(d3);
        listaDescontos.add(d4);
        listaDescontos.add(d5);
        listaDescontos.add(d6);
        listaDescontos.add(d7);
        listaDescontos.add(d8);
        listaDescontos.add(d9);
        System.out.println(listaDescontos.size());
        return listaDescontos;
    }



}
