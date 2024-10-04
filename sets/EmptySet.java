public class EmptySet implements Set {

    @Override
    public boolean contains(Set element) {
        return false;
    }

    @Override
    public boolean isSubset(Set set) {
        return true;
    }

    @Override
    public boolean is(Set set) {
        return this.isSubset(set) && set.isSubset(this);
    }

    @Override
    public Set union(Set set) {
        return set;
    }

    @Override
    public Set intersect(Set set) {
        return this;
    }
    
}
