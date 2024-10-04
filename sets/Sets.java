public class Sets {

    public static Set New(Object... values) {
        Set[] sets = new Set[values.length];
        for (int i = 0; i < values.length; i++)
        {
            if (values[i].getClass() == Set.class)
                sets[i] = (Set)(values[i]);
            else if (values[i].getClass() == Double.class)
                sets[i] = new NumberSet((Double)values[i]);
        }
        return new ValuesSet(sets);
    }
}
