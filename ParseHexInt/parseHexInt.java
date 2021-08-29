package ParseHexInt;
import java.io.*;

public class parseHexInt{
    public static void main(String args[]){
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String entrada = "";
        System.out.println("[CONSOLE INICIADO]");
        System.out.println("[EXIT = sair]");
        System.out.println("Insira um padrão hexadecimal para converte-lo em decimal:");
        do {
            try {
                entrada = br.readLine();
                if (!entrada.isBlank() && !entrada.isEmpty() && !entrada.equals("sair")){
                    if (convertoHexToDecimal(entrada) < 0) {
                        System.out.println(">erro: insira numeros de 0-9 positivos e letras de A-F sem espaços entre os mesmos");                        
                    } else{
                        System.out.println(">" + convertoHexToDecimal(entrada));
                    }
                }
            }catch (IOException e) {
                e.printStackTrace();
            }
        } while(!entrada.equals("sair"));
        System.out.println("[CONSOLE ENCERRADO]");
    }
    public static int convertoHexToDecimal(String hex){
        String chars = "0123456789ABCDEF";
        hex = hex.toUpperCase();
        int val = 0;
        for (int i = 0; i < hex.length(); i++)
        {
            char charPosition = hex.charAt(i);
            int charValue = chars.indexOf(charPosition);
            val = 16*val + charValue;
        }
        return val;
    }
}