public class animal {
        public void eat(){
            System.out.println("Animal is eating");
        }
        public void sleep(){
            System.out.println("Animal is sleeping ");
        }
        public void breathe(){
            System.out.println("Animal is breathing air");
        }
        public void movement(){
            System.out.println("Animal is moving");
        }
    }

    class Dog extends animal{
        String breeds = "";
        public void movement(){
            System.out.println("Dog is walking");
        }

    }
    class Doberman extends Dog{
        String breeds = "";

        @Override
        public void movement() {
            super.movement();
        }

        public static void main(String[] args) {
            Dog d1 = new Dog();
            Doberman c1 = new Doberman();
            d1.eat();
            c1.movement();
            d1.movement();

            d1.breeds = "Doberman";

        }
    }

