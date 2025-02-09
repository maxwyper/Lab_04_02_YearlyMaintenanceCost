public class Main {
    public static void main(String[] args) {

        double winterCost = 258.09;
        double springCost = 167.78;
        double summerCost = 193.50;
        double fallCost = 136.88;

        double totalYearlyCost = winterCost + springCost + summerCost + fallCost;

        System.out.println("Winter maitenance cost: $" + String.format("%.2f", winterCost));
        System.out.println("Spring maintenance cost: $" + String.format("%.2f", springCost));
        System.out.println("Summer maintenance cost: $" + String.format("%.2f", summerCost));
        System.out.println("Fall maintenance cost: $" + String.format("%.2f", fallCost));

        System.out.println("Total yearly maintenance cost: $" + String.format("%.2f", totalYearlyCost));
    }
}