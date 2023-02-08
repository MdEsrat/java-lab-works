public class Main {
    public static void main(String[] args){
        Box2 b1 = new Box2();
        b1.height = 5;
        b1.width = 10;
        b1.length = 2;
        b1.display();
        b1.calculate_area(b1.height, b1.width, b1.length);
        b1.calculate_area(b1.height, b1.width);

    }

}
