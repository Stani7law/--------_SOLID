package DIP;

public class PetrolEngine extends Car {

    private String engine;

    public PetrolEngine(String engine) {
        this.engine = engine;
    }

    /** Метод запуска двигателя */
    @Override
    public void start() {
        System.out.println(engine);
    }

}
