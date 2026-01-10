package javaLambdaExpressions;

import java.util.Arrays;
import java.util.List;

class Trade{
	
	String currencyPair;
	int openPrice;
	int closePrice;
	
	public String getCurrencyPair() {
		return currencyPair;
	}
	public void setCurrencyPair(String currencyPair) {
		this.currencyPair = currencyPair;
	}
	public int getOpenPrice() {
		return openPrice;
	}
	public void setOpenPrice(int openPrice) {
		this.openPrice = openPrice;
	}
	public int getClosePrice() {
		return closePrice;
	}
	public void setClosePrice(int closePrice) {
		this.closePrice = closePrice;
	}
	public Trade(String currencyPair, int openPrice, int closePrice) {
		super();
		this.currencyPair = currencyPair;
		this.openPrice = openPrice;
		this.closePrice = closePrice;
	}
}

public class StreamAllMatcnExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Trade> trade = Arrays.asList(
				new Trade("BTCUSD", 85000, 903000),
				new Trade("ETHUSD",2950,3070),
				new Trade("XAUUSD",4400,4505)
				);
		
		
		boolean specificPrice = trade.stream()
		.allMatch((price) -> price.getClosePrice() > 1000000);
		
		System.out.println(specificPrice);
		
	}

}
