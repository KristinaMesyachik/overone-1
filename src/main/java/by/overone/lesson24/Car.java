package by.overone.lesson24;

public class Car {
    private String color;
    private int countOfWindows;
    private Engine engine;
    private static int count;

    public void setColor(String color) {
        this.color = color;
    }

    public void setCountOfWindows(int countOfWindows) {
        this.countOfWindows = countOfWindows;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public static void setCount(int count) {
        Car.count = count;
    }

    public Car(String color, int countOfWindows, int horsePower) {
        this.color = color;
        this.countOfWindows = countOfWindows;
//        this.engine = this.new Engine(horsePower);
        count++;
    }

    public void foo() {
        Engine engine = new Engine(3000);

    }

    @Override
    public String toString() {
        return "Car{" +
                "color='" + color + '\'' +
                ", countOfWindows=" + countOfWindows +
                ", engine=" + engine +
                '}';
    }

    static class Engine implements Cloneable {
        private int horsePower;
        private static final int CONST = 2;

        public Engine(int horsePower) {
            this.horsePower = horsePower;
        }

        public void a() {
            // this = engine
//            Car car = new Car("blue", 20, this);
//            System.out.println(car.engine);
            System.out.println(count);
//            System.out.println(color);
        }

        @Override
        public String toString() {
            return "Engine{" +
                    "horsePower=" + horsePower +
                    '}';
        }
    }


}

class Test {
    public static void main(String[] args) {
//        Car.Engine engine = new Car.Engine(300); - объект вложенного класса
//        Car car = new Car("black", 4, engine);
//        System.out.println(engine);
//        System.out.println(car);
//        engine.a();
//        Car car = new Car("black", 4, 500);
//        System.out.println(car);
//        Car.Engine engine = car.new Engine(300); - объект внутреннего класса
//        System.out.println(car);
//        System.out.println(engine);
//        car.setEngine(engine);
//        System.out.println(car);
    }
}

class Motor extends Car.Engine {

    public Motor(int horsePower) {
        super(horsePower);
    }
}

class Math {
    private int a;

    public int calculate(int a, int b) {
        return a + b;
    }
}

interface MathInterface {
    void a();
}

class Test2 {
    public static void main(String[] args) {
        Math math = new Math() {
            @Override
            public int calculate(int a, int b) {
                return a * b;
            }
        };

        MathInterface mathInterface = new MathInterface() {
            @Override
            public void a() {

            }
        };

        mathInterface.a();

        Math mathInterface2 = new Math() {

        };

        System.out.println(math.calculate(2, 3));

    }
}