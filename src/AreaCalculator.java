public class AreaCalculator {
    public static double area(double radius){
        if (radius<0) {
            return -1;
        }else{
            double a = 22/7;
            double newArea = a* Math.pow(radius,2);
            return Math.PI*radius*radius;
        }
    }

    //2nd overloaded method to calculate area of rectangle
    public static double area(double base, double height){
        if (base<0 || height<0) {
            return -1;
        }else{
            return base*height;
        }
    }
}
