import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

// class List {
// public static void main(String[] args) {

//   ArrayList<Double> notas = new ArrayList<>();
// notas.add(7.0);
// notas.add(8.5);
// notas.add(9.3);
// notas.add(5.0);
// notas.add(7.0);
// notas.add(0.0);
// notas.add(3.6);
// System.out.println(notas);

// System.out.println("Exiba a posição da nota 5.0: " + notas.indexOf(5d));

// notas.add(4, 8d);
// System.out.println(notas);

// notas.set(3, 6.0);
// System.out.println("Após a mudança: ");
// System.out.println(notas);
// System.out.println("A nota 5.0 está na lista? " + notas.contains(5.0));

// System.out.println("Exiba todas as notas na ordem em que foram informados: ");

// System.out.println(notas);

// System.out.println("Exiba a terceira nota adicionada: " + notas.get(2));
// System.out.println("Exiba a soma das nota: ");

// }

//}

class settest {
    public static void main(String[] args) {
        // Set notas = new HashSet<>();

        System.out.println("Criando um conjunto e adicionando as notas: ");
        Set<Double> notas = new HashSet<>(Arrays.asList(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6));
        System.out.println(notas.toString());

    }
}
