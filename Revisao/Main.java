public class Main
{
    public static void main(String[] args) 
    {
        Pessoa pessoa = new Pessoa("Mari Linda");
        System.out.println(pessoa.getNome());

        Time now = Time.now();
        Time daquiUmMinutin = new Time(now);
        daquiUmMinutin.addMinutes(1);
        while (now.isBiggerThan(daquiUmMinutin)) {
            now = Time.now();
        }

    }
}