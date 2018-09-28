package lab2;

public abstract class AbstractInitializer {

    public void create() {
        System.out.println("DO create");
    }

    public abstract Client init();

}
