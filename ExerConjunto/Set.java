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

    // @Override
    // public boolean belongs(Integer value) {
    //     Collection<T> newCollection = new Set<T>();
    //     newCollection = value;
    

    
    //     // while (true) {
    //     //     for(int i = 0; i < newCollection.getSet().size(); i++){
    //     //         if(newCollection.getSet().get(i) instanceof Set<?>){
    //     //             newCollection = (Collection<T>)newCollection.getSet().get(i);

    //     //             // for (int j = 0; j < newCollection.getSet().size(); j++) {
    //     //             //     if (this.set.contains(newCollection.getSet().get(j))) {
    //     //             //         continue
    //     //             //     } else {
    //     //             //         return false
    //     //             //     }
    //     //             }
            
    //     //         }
    
    //     //     }
    //     // }
    //     return true;
    // }

    @Override
    public boolean belongs(Set<?> set, Object value) {

        for (Object elemento : this.getSet()) {
            if(elemento.equals(value)){
                return true;
            } else if ( elemento instanceof Set<?> ) {
                boolean pertence = belongs(( Set<?>)elemento, value);

                if(pertence){
                    return true;
                }
            } else {
                return false;
            }
        }

        return false;
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
        Collection<T> newCollection = new Set<T>();
        
        for(int i = 0; i < value.getSet().size(); i++){
            for(int j = 0; j < this.getSet().size(); j++){
                if(value.getSet().get(i) == this.getSet().get(j)){
                    newCollection.getSet().add(value.getSet().get(i));
                }
            }
        }

        return newCollection;
    }

    @Override
    public boolean contains(Collection<T> value) {
        return true;
    }    
}
