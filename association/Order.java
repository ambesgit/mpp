package prob2B;

import java.util.List;
import java.util.ArrayList;

public class Order {
	private int orderNum;
	private List orderLine;
	Order(int orderNum){
		this.orderNum=orderNum;	
		new OrderLine(this);
		orderLine=new ArrayList<OrderLine>();
		orderLine.add(new OrderLine(this));
	}
}
