public class Demo_Subway {
    public static void main(String[] args) {
        SubwaySandwich sandwich = new SubwaySandwich.Builder()
            .setChicken(1)
            .setBreadType("Italian")
            .setPaneer(2)
            .setJalapenos(3)
            .setCucumbers(1)
            .setTomatoes(2)
            .build();

            System.out.println("\n----- Your Subway Sandwich -----");
            System.out.println("Bread Type  : " + sandwich.getBreadType());
            System.out.println("Tomatoes    : " + sandwich.getTomatoes());
            System.out.println("Jalapenos   : " + sandwich.getJalapenos());
            System.out.println("Cucumbers   : " + sandwich.getCucumbers());
            System.out.println("Paneer      : " + sandwich.getPaneer());
            System.out.println("Chicken     : " + sandwich.getChicken());
            System.out.println("--------------------------------");

            
    }
}
