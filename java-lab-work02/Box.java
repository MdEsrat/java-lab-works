public class Box {
    int height;
    int width;
    int length;
    public static void calculate_area(){
        int height = 5;
        int width = 10;
        int length = 2;
        System.out.println(height*width*length);
    }
    public void display(){

        System.out.println(height+" "+width+" "+length);
    }
    public static void calculate_area(int height, int width){
        System.out.println(height*width);
    }
    public static void main(String[] args){
        calculate_area();
        Box b1 = new Box();
        b1.height = 10;
        b1.width = 20;
        b1.length = 5;
        b1.display();
    }
}
