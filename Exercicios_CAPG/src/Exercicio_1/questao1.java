package Exercicio_1;
import java.util.*;
import java.util.Collections; 

public class questao1 {

	public static void main(String[] args) {
		//Quest�o #1
		//array de teste da lista : ArrayList [9, 2, 1, 4, 6]
			int res;
	        List<Integer> arr = new ArrayList<Integer>();
	        //valoresadicionados na lista
	        arr.add(9); 
	        arr.add(2);
	        arr.add(1);
	        arr.add(4);
	        arr.add(6);
	        //ordena a lista em forma crescente antes de encontrar o valor da metade
	        Collections.sort(arr);
	        //verifica se tamanho da lista � impar
	        if(arr.size()%2!=0){
	        	// p_num � metadade do tamanho da lista
	            int p_num=((arr.size()+1)/2)-1;
	            //res � valor contido no meio da lista
	            res=arr.get(p_num);
	            System.out.println("A lista: " + arr+" � �mpar e tem tamanho: "+arr.size());
	            System.out.println("Valor da mediana quando a lista tem tamanho �mpar �: "+res); 
	        }
	        //valor n�o � �mpar -> avisa e mostra a lista e tamanho atual
	        else{
	           System.out.println("A lista: " + arr+" N�o tem tamanho �mpar, seu tamanho �: "
	        +arr.size()+" Mude seu valor para calcular m�diana"); 
	        }
	}

}
