package com.genpact.projectk.coding.solid;

public class CardManger {
public static void main(String[] args) {
	CardManagerSystem card = null;
			String cardType="credit";
			if(cardType=="debit")
				card=new DebitCard();
			if(cardType=="credit") {
				card=new CreditCard();
			}
			
			ShoppingMall s=new ShoppingMall(card);
			s.doTransaction(3000);
}
}

interface CardManagerSystem{
	void doPayment(long amount);
}

class CreditCard implements CardManagerSystem{

	@Override
	public void doPayment(long amount) {
		
		System.out.println("cREDIDT CRD TRNCTION");
	}
	
}
class DebitCard implements CardManagerSystem{

	@Override
	public void doPayment(long amount) {
		// TODO Auto-generated method stub
		System.out.println("debit card tracaction");
	}
	
}
class ShoppingMall {
	CardManagerSystem cardManagemenersystem;

	public ShoppingMall(CardManagerSystem cardManagerSystem) {
		this.cardManagemenersystem=cardManagerSystem;
	}
	
	Boolean doTransaction(long amount) {
		cardManagemenersystem.doPayment(amount);
		return null;
	}
}
