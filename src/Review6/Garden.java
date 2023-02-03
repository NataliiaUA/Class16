package Review6;

public class Garden {
    public static void main (String [] args) {
        Flower flower1 = new Flower();
        flower1.color = "red";
        flower1.name = "Rose ";
        flower1.price = 5;

        flower1.bloom();
        flower1.grow();
        flower1.smell();

        System.out.println("Creating 2-nd object of the flower class");

        Flower flower2 = new Flower();
        flower2.color = "red";
        flower2.name = "Hibiscus ";
        flower2.price = 6;

        flower2.bloom();
        flower2.grow();
        flower2.smell();

        Flower flower3 = new Flower();
        flower3.color = "yellow";
        flower3.name = " ";
        flower3.price = 4;

        flower3.bloom();
        flower3.grow();
        flower3.smell();

    }
}
