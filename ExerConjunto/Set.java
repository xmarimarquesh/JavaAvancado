import java.util.ArrayList;

public class Set<T> implements Collection<T> {
    private ArrayList<T> set = new ArrayList<>();

    public ArrayList<T> getSet() {
        return set;
    }

    public Set(){}

    public Set(ArrayList<T> conjunto){
        this.set = conjunto;
    }

    @Override
    public boolean belongs(Collection<T> value) {
        return true;
    }

    @Override
    public Collection<T> union(Collection<T> value) {
        Collection<T> newCollection = new Set<T>();

        for(int i = 0; i < value.getSet().size(); i++ ){
            newCollection.getSet().add(value.getSet().get(i));
        }

        for(int i = 0; i < this.getSet().size(); i++ ){
            newCollection.getSet().add(this.getSet().get(i));
        }
        
        return newCollection;
    }

    @Override
    public Collection<T> intersection(Collection<T> value) {
        return (Collection<T>)set;
    }

    @Override
    public boolean contains(Collection<T> value) {
        return true;
    }
    


   

    
    
}
