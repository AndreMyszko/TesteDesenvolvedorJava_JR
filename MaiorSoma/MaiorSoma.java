package MaiorSoma;

public class MaiorSoma {
    public static void main(String []args){
        int[] intArray = {100,10,1,100,333,555,777,1000,1000};
        int arrayTop = 0;
        int posicao = 0;
        while (posicao < intArray.length - 1) {
            if (intArray[posicao] < intArray[posicao + 1]) {
                arrayTop = intArray[posicao];
                intArray[posicao] = intArray[posicao + 1];
                intArray[posicao + 1] = arrayTop;
                posicao = 0;
                continue;
            }
            posicao++;
        }
        System.out.println("Dois maiores números: "+intArray[0] + " e " + intArray[1]);
        System.out.println("Soma dos dois maiores números: "+ (intArray[0] + intArray[1]));
    } 
}
