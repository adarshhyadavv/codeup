public class Stories{

    //Problem 1:The Efficient Traveller

    public int citiesTravelled(int num[], int initialEnergy){
        try{
            for(int i = 0; i < num.length; i++){
                initialEnergy = initialEnergy - num[i];
                if(initialEnergy <= 0){
                    return i;
                }
            }
            return num.length;
        }catch(Exception e){
            System.out.println("Error in citiesTravelled");
            return -1;
        }    
    }

    //Problem 2: The Sum That Stands Out

    public int standOut(int arr[]){
        try{
            int prefix = 0;
            int suffix;
            int totalSum = 0;
            for(int i = 0; i < arr.length; i++){
                totalSum = totalSum + arr[i];
            }
            for(int i = 1; i< arr.length; i++){
                prefix = prefix + arr[i - 1];
                suffix = totalSum - prefix - arr[i];
                if(prefix == suffix){
                    return i;
                }
            }
            return -1;
        }catch(Exception e){
            System.out.println("Error in standOut");
            return -1;
        }
    }

    //problem 3:Flip the Switch

    public int noOfFlips(int arr[]){
        try{
            int ones = 0;
            int zeroes = 0;
            for(int i = 0; i < arr.length; i++){
                if(arr[i] == 0){
                    zeroes += 1;
                }else{
                    ones += 1;
                }
            }
            return ones > zeroes ? zeroes : ones;
        }catch(Exception e){
            System.out.println("Error in noOfFlips");
            return -1;
        }
    }

    //problem 4:The odd one out

    public int unique(int arr[]){
        try{
            int sum = 0;
            for(int i = 0; i < arr.length; i++){
                sum = sum ^ arr[i];
            }
            return sum;
        }catch(Exception e){
            System.out.println("Error in unique");
            return -1;
        }    
    }

    //problem 5:Smart Pair Finder

    boolean hasSmartPair(int k, int arr[]){
        try{
            for(int i = 0; i < arr.length; i++){
                for(int j = i + 1; j < arr.length; j++){ 
                    if((arr[i] + arr[j]) == k){
                        return true;
                    }
                } 
            }
            return false;
        }catch(Exception e){
            System.out.println("Error in hasSmartPair");
            return false;
        }
    }

    //problem 6:The minimalist painter

    public int minTime(int time[]){
        try{
            int max = time[0];
            int totalTime = 0;
            for(int i = 0; i < time.length; i++){
                if(max < time[i]){
                    max = time[i];
                }
                totalTime = totalTime + time[i];
            }
            totalTime = totalTime - max;
            return totalTime;
        }catch(Exception e){
            System.out.println("Error in minTime");
            return -1;
        }
    }

    //problem 7: Coordiante Geometry library. 

    public String runGeometryStory(float x1, float y1, float x2, float y2, double radius, double side, float dx,
            float dy) {
        
        Point p1 = new Point(x1, y1);
        Point p2 = new Point(x2, y2);

        double dist = p1.distance(p2);

        Shape circle = new Circle(radius);
        Shape square = new Square(side);

        double circleArea = circle.getArea();
        double squareArea = square.getArea();

        p1.translate(dx, dy);

        String nl = System.lineSeparator(); // For cross-platform new lines
        return "Distance: " + String.format("%.1f", dist) + nl +
                "Circle Area: " + String.format("%.2f", circleArea) + nl +
                "Square Area: " + String.format("%.1f", squareArea) + nl +
                "Translated Point1: " + p1.toString();
    }

    
    // 1. Base Class -> Point
    static class Point {
        private float x;
        private float y;

        public Point(float x, float y) {
            this.x = x;
            this.y = y;
        }

        public double distance(Point other) {
            double dx = this.x - other.x;
            double dy = this.y - other.y;
            return Math.sqrt(dx * dx + dy * dy);
        }

        public void translate(float dx, float dy) {
            this.x += dx;
            this.y += dy;
        }

        @Override
        public String toString() {
            return "(" + String.format("%.1f", this.x) + ", " + String.format("%.1f", this.y) + ")";
        }
    }

    // 2. Base Class -> Shape 
    static abstract class Shape {
        public abstract double getArea();
    }

    // 3a. Derived Class -> Circle
    static class Circle extends Shape {
        private double radius; 

        public Circle(double radius) {
            this.radius = radius;
        }

        @Override
        public double getArea() {
            return Math.PI * this.radius * this.radius;
        }
    }

    // 3b. Derived Class -> Square
    static class Square extends Shape {
        private double side;

        public Square(double side) {
            this.side = side;
        }

        @Override
        public double getArea() {
            return this.side * this.side;
        }
    }
}
