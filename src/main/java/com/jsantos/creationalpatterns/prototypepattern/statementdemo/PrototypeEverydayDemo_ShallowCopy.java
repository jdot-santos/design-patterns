package java.com.jsantos.creationalpatterns.prototypepattern.statementdemo;

import java.util.ArrayList;
import java.util.List;

public class PrototypeEverydayDemo_ShallowCopy {

	/**
	 * Runs a demo of shallow cloning. Note that if the values for parameters and/or record change, then the change will be seen in both firstStatement and secondStatement since they're both referencing the same 2 objects.
	 * @param args
	 */
	public static void main(String[] args) {
		String sql = "select * from movies where title = ?";
		List<String> parameters = new ArrayList<>();
		parameters.add("Star Wars");

		Record record = new Record();

		Statement firstStatement = new Statement(sql, parameters, record);

		System.out.println(firstStatement.getSql());
		System.out.println(firstStatement.getParameters());
		System.out.println(firstStatement.getRecord());

		Statement secondStatement = firstStatement.clone();

		System.out.println(secondStatement.getSql());
		System.out.println(secondStatement.getParameters());
		System.out.println(secondStatement.getRecord());
	}
}
