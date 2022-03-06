package Exercicio_2;

public class questao2 {
	static int paresDifK(int arr[],int n, int k)
    {
        int count = 0;
        // Analise de elementos 1 por 1
        for (int i = 0; i < n; i++)
        {
            // existe um par dos elementos pegos?
            for (int j = i + 1; j < n; j++)
                if (arr[i] - arr[j] == k ||
                    arr[j] - arr[i] == k)
                    count++;
        }
        return count;
    }
	public static void main(String[] args) {
		int arr[] = { 1, 5, 3, 4, 2 };
        int n = arr.length;
        int k = 3;
        System.out.println("número de elementos pares do vetor que tem uma diferença igual a: "+ paresDifK(arr, n, k));
	}

}
