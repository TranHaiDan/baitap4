public class Engine {
    void start() {
        System.out.println("Engine Started");
    }

    void stop() {
        System.out.println("Engine Stopped");
    }

}
class Car {
    // Car has-a Engine
    Engine engine;

    Car() {
        engine = new Engine();

    }

    void startCar() {
        engine.start();
        System.out.println("Car started.");
    }

    void stopCar() {
        engine.stop();
        System.out.println("Car stopped.");
    }
}
