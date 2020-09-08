package tutorial3;
import java.util.Scanner;
import java.util.Arrays;
public class VendingMachineApp {
public static double drinkPrice;
public static double amtAdded;
public static void main(String[]args)
{	
	VendingMachine vend1 = new VendingMachine();
	drinkPrice= vend1.selectDrink();
	amtAdded = vend1.insertCoins(drinkPrice);
	vend1.checkChange(amtAdded,drinkPrice);
	vend1.printReceipt();
	}
}
