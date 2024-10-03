import java.util.ArrayList;

public class Set<T> implements Collection<T> {
    private ArrayList<T> set = new ArrayList<T>();

    public ArrayList<T> getSet() {
        return set;
    }

    public Set(ArrayList<T> conjunto){
        this.set = conjunto;
    }
    
    @Override
    public boolean belongs(Collection<T>[] value) {
        return true;
    }

    @Override
    public Collection<T>[] union(Collection<T>[] value) {
    }

    @Override
    public Collection<T>[] intersection(Collection<T>[] value) {
        Collection<T>[] sla = new Set<T>[]();
        return sla;
    }

    @Override
    public boolean contain(Collection<T>[] value) {
        return true;
    }


   

    
    
}
