public class ArrayList<T> implements Collection<T>{
    private T[] data;
    private int size = 0;

    public ArrayList() {
        data = create(10);
    }

    private T[] create(int size){
        Object[] array = new Object[size];
        return (T[])array;
    }

    public int getIndex(T value) {
        for(int i = 0; i < data.length; i++){
            if(data[i] == value){
                return i;
            }
        }
        return -1;
    }

    @Override
    public T get(int index) {
        return data[index];
    }

    @Override
    public void add(T value) {
        if(size == data.length)
        {
            T[] newArray = create(2 * size);

            for(int i = 0; i < data.length; i++){
                newArray[i] = data[i];
            }

            data = newArray;
        }
        data[size] = value;
        size ++;
    }

    @Override
    public int size(T value) {
        return 0;
    }
}
