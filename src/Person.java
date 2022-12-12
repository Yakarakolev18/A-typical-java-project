public class Person {

    String ime;
    int godini;
    String grad;


    public Person(String ime, int godini, String grad) {
        this.ime = ime;
        this.godini = godini;
        this.grad = grad;
    }

    @Override
    public String toString() {
        return "Person{" +
                "ime=" + ime +
                ", godini=" + godini +
                ", grad='" + grad + '\'' +
                '}';
    }
}
