import java.util.List;

public interface Collection<T> {
    boolean belongs(List<T> value);
    List<T> union(List<T> value);
    List<T> intersection(List<T> value);
    boolean contains(List<T> value);
}
