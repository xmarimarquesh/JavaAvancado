import java.util.ArrayList;
import java.util.List;

public class Set<T> implements Collection<T> {
    private List<T> set = new ArrayList<>();

    public List<T> getSet() {
        return set;
    }

    public Set(List<T> conjunto){
        this.set = conjunto;
    }

    @Override
    public boolean belongs(List<T> value) {
        //
    }

    @Override
    public List<T> union(List<T> value) {
        //
    }

    @Override
    public List<T> intersection(List<T> value) {
        //
    }

    @Override
    public boolean contains(List<T> value) {
        //
    }
}
