*Teste Desenvolvedor Java JR*

Favor codificar as questões de programação e encaminhar via link o código. O link deve ser encaminhado pelo site https://www.tutorialspoint.com/ . 
Clique no link abaixo para compilar em Java: Java: ⦁⦁ https://www.tutorialspoint.com/compile_java_online.php ⦁⦁

⦁ 1)	Implemente uma variação da função parseInt()  utilizada em javascript para converter números hexadecimais para decimal. 
Vamos chamar este método de parseHexInt(), seguem alguns exemplos:
Observação: você precisa implementar um código que convert um string em um int. Você não pode usar funções prontas como parseInt nem int(text, 16). 
A entrada do método deve ser uma entrada válida (ex:  strings não vazios, contend chars de 0 a 9 e entre A e F) e sem sinais negativos.


⦁ 2)	Dado uma lista de inteiros, encontre os dois numeros em que a soma destes é a maior dentre todas as possibilidades. 
Exemplo:
Observação: a lista de entrada deve conter pelo menos dois itens. Seu algoritmo pode percorrer a lista 
apenas uma vez. Dica: você não precisa ordenar a lista.


⦁ 3)	Codifique as solicitações abaixo:
**(img em anexo) => ../testedesenvolvedorjava_jr/info/img/**
3.1 - Mapeie as classes conforme o diagrama MER ilustrado abaixo: (img em anexo)
3.2 - A partir do mapeamento, construa uma classe de controle (SalarioController) que deverá conter uma lista de funcionários e deverá processar 
os dados das entidades mepeadas através do método calcularSalarioLiquido(). 
Este método deverá listar todos os funcionários e seus respectivos salarios líquidos. O salário liquido pode ser calculado com a formula: 
(salário líquido = salário bruto – (soma dos descontos));
3.3 – Monte a execução do programa em uma classe main. 
Nesta você fará a chamada do método SalarioController. calcularSalarioLiquido() e inicializará a lista de funcionarios/descontos: 
SalarioController.setFuncionarios(List <Funcionario> funcionarios).  Para inicialização, utilize os valores  das tabelas representadas abaixo:
DADOS TABELA DESCONTOS: (img em anexo)
DADOS TABELA FUNCIONARIOS: (img em anexo)
3.4 – Imprimir o resultado do cálculo (funcionário vs salário liquido), conforme ilustração abaixo:
RESULTADO ESPERADO: (img em anexo)