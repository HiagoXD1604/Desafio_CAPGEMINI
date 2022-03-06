package Exercicio_1;
import java.util.*;
import java.util.Collections; 

public class questao1 {

	public static void main(String[] args) {
		//Questão #1
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
	        //verifica se tamanho da lista é impar
	        if(arr.size()%2!=0){
	        	// p_num é metadade do tamanho da lista
	            int p_num=((arr.size()+1)/2)-1;
	            //res é valor contido no meio da lista
	            res=arr.get(p_num);
	            System.out.println("A lista: " + arr+" é ímpar e tem tamanho: "+arr.size());
	            System.out.println("Valor da mediana quando a lista tem tamanho ímpar é: "+res); 
	        }
	        //valor não é ímpar -> avisa e mostra a lista e tamanho atual
	        else{
	           System.out.println("A lista: " + arr+" Não tem tamanho ímpar, seu tamanho é: "
	        +arr.size()+" Mude seu valor para calcular médiana"); 
	        }
	}

}
