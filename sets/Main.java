public class Main {
    public static void main(String[] args) {
        Set a = Sets.New(1.0, 2.0, 3.0);
        Set b = Sets.New(1.0, 2.0, 4.0);
        Set c = a.union(b);
        Set d = Sets.New(a, b, c);
        if (d.contains(Sets.New(1.0, 2.0, 3.0)))
        {
            // Eta pega coisa loka
        }
    }
}