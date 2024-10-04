public class UnionSet implements Set {

    private Set setA;
    private Set setB;

    public UnionSet(Set setA, Set setB)
    {
        this.setA = setA;
        this.setB = setB;
    }

    @Override
    public boolean contains(Set element) {
        return setA.contains(element) || setB.contains(element);
    }

    @Override
    public boolean isSubset(Set set) {
        return setA.isSubset(set) && setB.isSubset(set);
    }

    @Override
    public boolean is(Set set) {
        return this.isSubset(set) && set.isSubset(this);
    }

    @Override
    public Set union(Set set) {
        return new UnionSet(this, set);
    }

    @Override
    public Set intersect(Set set) {
        return new IntersectionSet(this, set);
    }
    
}
