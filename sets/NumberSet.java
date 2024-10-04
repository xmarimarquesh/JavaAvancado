public class NumberSet implements Set {
    Double value;

    public NumberSet(Double value) {
        this.value = value;
    }

    public Double getValue() {
        return value;
    }

    @Override
    public boolean contains(Set element) {
        return false;
    }

    @Override
    public boolean isSubset(Set set) {
        return false;
    }

    @Override
    public boolean is(Set set) {
        if (set.getClass() != NumberSet.class)
            return false;
        
        NumberSet num = (NumberSet)set;
        return this.getValue() == num.getValue();
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