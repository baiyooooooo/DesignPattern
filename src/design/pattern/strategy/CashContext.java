package design.pattern.strategy;

public class CashContext {
	private CashSuper cs;
	public CashContext(String type){
		switch (type){
		case "rebate":
			CashRebate cr = new CashRebate(0.8);
			this.cs = cr;
		}
	}
	public double getResult(double money){
		return cs.acceptCash(money);
	}

}
