package tutorial3;
import java.util.Scanner;
import java.util.Arrays;
public class VendingMachine {
	public double price;
	public String drinkName;
	public VendingMachine() {
	
}
	
	public double selectDrink() {
		Scanner myObj = new Scanner(System.in);
		System.out.println("1) Buy Beer($3.00)");
		System.out.println("2) Buy Coke($1.00)");
		System.out.println("3) Buy Green Tea($5.00)");
		System.out.println("Enter Selection:");
		int UserChoice= myObj.nextInt();
switch(UserChoice) {
case 1:
	drinkName ="Beer";
	price = 3.00;
	break;
	
case 2:
	drinkName = "Coke";
	price = 1.00;
	break;

case 3:
	drinkName = "Green Tea";
	price = 5.00;
	break;

}
return price;
}

	public double insertCoins(double drinkCost)
	{ double amtLeft= 0.00;
	Scanner myObj = new Scanner(System.in);
	System.out.println("Enter Q for ten cents");
	System.out.println("Enter T for twenty cents");
	System.out.println("Enter F for fifty cents");
	System.out.println("Enter N for a dollar");
	while(amtLeft<drinkCost) {
	String 	userCoins = myObj.nextLine();
		switch(userCoins){
		case "Q":
			amtLeft += 0.10;
			break;
		case "T":
			amtLeft += 0.20;
			break;
		case "F":
			amtLeft += 0.50;
			break;
		case "N":
			amtLeft+= 1.00;
			break;
		}
	System.out.println("Coins inserted:" + amtLeft);
	}
	return amtLeft;
	}
	
	public void checkChange(double amount, double drinkCost) {
		double change = amount-drinkCost;
		change = Math.round(change * 100.00) / 100.00;
		System.out.println("Change is: $"+ change);
	}
	
	public void printReceipt() {
		System.out.println("collect your drink");
		System.out.println("Thank you!!");
	}
	
}