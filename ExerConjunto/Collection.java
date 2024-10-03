public interface Collection<T> {
    boolean belongs(Collection<T>[] value);
    Collection<T>[] union(Collection<T>[] value);
    Collection<T>[] intersection(Collection<T>[] value);
    boolean contains(Collection<T>[] value);
}
