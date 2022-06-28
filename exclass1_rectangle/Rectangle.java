package exclass1_rectangle;

public class Rectangle {
    double width;
    double height;
    public double areaRectangle(){
        return width * height;
    }
    public double perimeter(){
        return (2*width) + (2* height);
    }
    public double diagonal(){
        return (Math.sqrt((width*width) + (height*height)));
    }
}
