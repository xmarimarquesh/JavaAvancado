import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Integer> conjuntoA = new ArrayList<>();
        conjuntoA.add(1);
        conjuntoA.add(2);
        conjuntoA.add(3);

        ArrayList<Integer> conjuntoB = new ArrayList<>();
        conjuntoB.add(3);
        conjuntoB.add(4);
        conjuntoB.add(5);
        
        Collection<Integer> setA = new Set<Integer>(conjuntoA);
        Collection<Integer> setB = new Set<Integer>(conjuntoB);
        
        Collection<Integer> uniao = new Set<Integer>();
        
        uniao = setA.union(setB);
        
        System.err.println(uniao.getSet());
        
        System.out.println("Conjunto A: " + setA.getSet());
        System.out.println("Conjunto B: " + setB.getSet());
    }
}