public class Box2 {
    public int height;
    public int width;
    public int length;
    public void calculate_area(int height, int width, int length){
        int area = height*width*length;
        System.out.println("Area:"+area);
    }
    public void calculate_area(int height, int width){
        int area = height*width;
        System.out.println("Area:"+area);
    }
    public void display(){
        System.out.println(height+" "+width+" "+length);
    }
}
