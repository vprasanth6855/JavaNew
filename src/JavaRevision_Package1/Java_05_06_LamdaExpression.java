package JavaRevision_Package1;

import java.util.ArrayList;

import org.omg.Messaging.SyncScopeHelper;

public class Java_05_06_LamdaExpression {

	public static void main(String[] args) {
		ArrayList<Double> heightList = new ArrayList<Double>();
		heightList.add(12.23);
		heightList.add(100.00);
		
		heightList.forEach((p)-> System.out.println(p));

	}

}
