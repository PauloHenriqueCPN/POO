import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        
    }

    public static void vetores() {
        int tamanho = 5;
        int[] arrayInteiros = new int[tamanho];
        System.out.println(arrayInteiros);

        String[] letras = {"a", "e", "f", "k"};
        System.out.println(letras);
        System.out.println(letras.length);

        System.out.println(letras[2]);
        letras[2] = "r";
        System.out.println(letras[2]);

        arrayInteiros[3] = 4;

        // percorrendo todos os elementos do array
        for (int i = 0; i < tamanho; i++) {
            System.out.println(arrayInteiros[i]);
        }

        //for letra in letras:
        for (String letra : letras) {
            System.out.println(letra);
        }

        System.out.println("----------------");
        letras = aumentaVetor(letras);
        System.out.println(letras.length);

    }

    public static String[] aumentaVetor (String[] vetor) {
        String[] novoVetor = new String[vetor.length + 1];

        for (int i = 0; i <vetor.length; i++) {
            novoVetor[i] = vetor[i];
        }

        return novoVetor;
    }

    public static void arraylist() {
        ArrayList<Integer> numeros = new ArrayList<>();
        System.out.println(numeros);

        numeros.add(8); // adiciona elemento no final da lista
        numeros.add(3);
        System.out.println(numeros);
        System.out.println(numeros.size());
        System.out.println(numeros.get(1));

        numeros.remove(0);
        System.out.println(numeros);

        for (Integer numero : numeros) {
            System.out.println(numero);
        }

        //verifica se o elemneto esta contido no ArrayList
        System.out.println(numeros.contains(8));
        numeros.add(1);
        numeros.add(2);
        numeros.add(3);
        System.out.println();

        //adiciona um elemento novo no indice 0
        numeros.add(0, 16);
        
    }
}
