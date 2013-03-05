package de.constantin.lehenmeier;

public class CoinGenerator {
	
	protected static int generateCoins(int coinValue){
		if(coinValue == 0){
			return 1;
		}
		return (generateCoins(coinValue / 2) + generateCoins(coinValue / 3) + 
				generateCoins(coinValue / 4));
	}	
}
