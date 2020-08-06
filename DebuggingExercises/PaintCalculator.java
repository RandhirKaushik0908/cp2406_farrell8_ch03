import java.util.Scanner;
public class PaintCalculator {
    public static void main(String[] args){
        float height;
        float width;
        float length;
        int paintCost;
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the height of the room(in feet): ");
        height = input.nextFloat();
        System.out.print("Please enter the width of the room(in feet): ");
        width = input.nextFloat();
        System.out.print("Please enter the length of the room(in feet): ");
        length = input.nextFloat();
        paintCost = AreaCalculator(height, width, length);
        System.out.println("The cost of paint needed for a " + length + "-by-" + width + "-foot room with " + height + "-foot ceilings is $" + paintCost);
    }
    public static int AreaCalculator(float h, float w, float l ){
        float wallArea = 2 * (h * (l + w));
        return PriceCalculator(wallArea);
    }
    public static int PriceCalculator(float area){
        int paintPrice;
        float paintNeeded;
        final float AREA_PAINTED_BY_GALLON = 350;
        final int GALLON_PAINT_PRICE = 32;
        paintNeeded = area / AREA_PAINTED_BY_GALLON ;
        System.out.println("The total area of wall will be " + area + "square feet and the gallons of paint needed for it is " + paintNeeded);
        int roundedPaintNeeded = (int) paintNeeded;
        paintPrice = roundedPaintNeeded * GALLON_PAINT_PRICE;
        return paintPrice;
    }
}
