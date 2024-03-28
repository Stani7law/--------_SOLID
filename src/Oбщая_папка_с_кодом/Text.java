package Oбщая_папка_с_кодом;

public class Text {

    // 5) Переписать код в соответствии с Dependency Inversion Principle:
    public class Car {
        /**Бензиновый двигатель*/
        private PetrolEngine engine;

        public Car(PetrolEngine engine) {
            this.engine = engine;
        }

        public void start() {
            this.engine.start();
        }
    }

    public class PetrolEngine {
        public void start() {
        }
    }
    // Разорвать зависимость классов Car и PetrolEngine. У машины же может быть
    // DieselEngine.

}
