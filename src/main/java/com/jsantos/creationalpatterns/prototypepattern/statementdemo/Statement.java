package java.com.jsantos.creationalpatterns.prototypepattern.statementdemo;

import java.util.List;

public class Statement implements Cloneable {

	private String sql;
	private List<String> parameters;
	private Record record;

	public Statement(String sql, List<String> parameters, Record record) {
		this.sql = sql;
		this.parameters = parameters;
		this.record = record;
	}

	/**
	 * Responsible for returning the instance of the {@link Statement} object. Note that this returns references to parameters and record, meaning a shallow copy.
	 * @return a shallow clone of this Statement
	 */
	public Statement clone() {
		try {
			return (Statement) super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return null;
	}

	public Record getRecord() {
		return record;
	}

	public List<String> getParameters() {
		return parameters;
	}

	public String getSql() {
		return sql;
	}
}
