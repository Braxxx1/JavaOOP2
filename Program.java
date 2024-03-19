public class Program {
    public static void main(String[] args) {
        Cat[] cats = {new Cat("Barsik", 5), new Cat("Murzik", 7)};
        Plate plate = new Plate(6);
        plate.info(); 
        for (Cat cat : cats) {
            cat.eat(plate); 
        }

       
        for (Cat cat : cats) {
            System.out.println(cat.getName() + " сыт: " + cat.isFull());
        }
        plate.addFood(10);
        cats[1].eat(plate);
        System.out.println(cats[1].getName() + " сыт: " + cats[1].isFull());
    }
}
