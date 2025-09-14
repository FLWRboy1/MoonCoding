public class MoonCoding {
    public static void main(String[] args) {

        double distance = 380000;
        double speed = 10; 
        double timeSeconds = distance / speed;
        double timeHours = timeSeconds / 3600.0;
        System.out.println("it will take " + timeHours + " hours to reach the moon");

        double horizontal = 2000; 
        double vertical = 3000;  
        double totalSpeedChange = Math.sqrt(Math.pow(horizontal, 2) + Math.pow(vertical, 2));
        System.out.println("the total speed change needed is " + totalSpeedChange + " m/s");

        double moonRad = 1731 * 1000; 
        double pi = 3.14;
        double surfaceArea = 4 * pi * Math.pow(moonRad, 2);
        double volume = surfaceArea * 0.001; 
        System.out.println("the volume of 1 mm surface layer is " + volume + " cubic meters");

        double density = 3000; 
        double massKg = volume * density;
        double massTons = massKg / 1000;
        System.out.println("the mass of regolith in 1 mm surface layer is " + massTons + " metric tons");

        double waterMass = massTons * 0.25;
        System.out.println("the amount or recoverable water is  " + waterMass + " metric tons");
    }
}