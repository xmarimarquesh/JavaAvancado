public interface Set {
    boolean contains(Set element);
    boolean isSubset(Set set);
    boolean is(Set set);
    Set union(Set set);
    Set intersect(Set set);
}