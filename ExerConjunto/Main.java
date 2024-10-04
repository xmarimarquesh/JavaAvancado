import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Criando dois conjuntos
        List<Integer> conjuntoA = new ArrayList<>();
        conjuntoA.add(1);
        conjuntoA.add(2);
        conjuntoA.add(3);

        List<Integer> conjuntoB = new ArrayList<>();
        conjuntoB.add(3);
        conjuntoB.add(4);
        conjuntoB.add(5);

        Set<Integer> setA = new Set<>(conjuntoA);
        Set<Integer> setB = new Set<>(conjuntoB);
    }
}
