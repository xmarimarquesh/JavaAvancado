import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Integer> conjuntoA = new ArrayList<>();
        conjuntoA.add(6);
        conjuntoA.add(3);
        conjuntoA.add(4);
        conjuntoA.add(5);

        ArrayList<Integer> conjuntoB = new ArrayList<>();
        conjuntoB.add(6);
        
        Collection<Integer> setA = new Set<Integer>(conjuntoA);
        Collection<Integer> setB = new Set<Integer>(conjuntoB);
        
        System.out.println("Conjunto A: " + setA.getSet());
        System.out.println("Conjunto B: " + setB.getSet());

        Collection<Integer> uniao = new Set<Integer>();
        uniao = setA.union(setB);
        System.err.println("UNIAO: " + uniao.getSet());

        Collection<Integer> interseccao = new Set<Integer>();
        interseccao = setA.intersection(setB);
        System.err.println("INTERSECCAO: " + interseccao.getSet());

        boolean pertence = setA.belongs(setB, 1);
        System.err.println("PERTENCE: " + pertence);
        
    }
}