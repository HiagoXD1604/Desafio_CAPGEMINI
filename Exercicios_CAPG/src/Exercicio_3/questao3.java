package Exercicio_3;
import java.util.Scanner;
public class questao3 {

	public static void main(String[] args) {
		System.out.println("Digite a frase que vai ser encriptada:");
		String s = "", saida = "";
		//abre o scanner para digitar a frase que ser� encriptada
		Scanner scan = new Scanner( System.in );
        s=scan.nextLine();
        scan.close();
        //remove espa�os da string input
        s=s.replaceAll("\\s+","");
        //Gera Colunas e linha da matriz que ser� usada
        int linhas, colunas;
        linhas = (int) Math.floor(Math.sqrt(s.length()));
        colunas = (int) Math.ceil(Math.sqrt(s.length()));
        
        //checa se colunas * linhas s�o menores que o tamanho da string s(T)
        if (colunas*linhas < s.length()){
            linhas++;
        }
        
        //gera a matriz usada na encripta��o
        char matriz[][] = new char[linhas][colunas];
        
        //Store message in array
        for(int linhas_i=0; linhas_i<linhas; linhas_i++){
            for(int colunas_i=0; colunas_i<colunas; colunas_i++){
            	//se valor da linha atual * valor de coluna da matriz + valor da coluna atual for menor que
            	//tamanho da string s ent�o adicione o valor atual(char) na posi��o atual da matriz
                if(((linhas_i*colunas)+colunas_i) < (s.length())){
                    matriz[linhas_i][colunas_i] = s.charAt((linhas_i*colunas)+colunas_i);
                }
            }
        }
        
        //reescreve o array(string s) para gerar a sa�da
        for(int col_i=0; col_i<colunas; col_i++){
            for(int lin_i=0; lin_i<linhas; lin_i++){
                if(((lin_i*colunas)+col_i) < (s.length())){
                    saida += matriz[lin_i][col_i];
                }
            }
            //Gera os espa�os do texto novamente
            if(col_i < (colunas-1)){
                saida+=" ";
            }
        }
        //imprime a sa�da do texto j� encriptada
        System.out.println(saida);
	}


}
