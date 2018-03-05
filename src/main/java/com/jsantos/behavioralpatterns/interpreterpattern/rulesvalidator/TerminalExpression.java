package com.jsantos.behavioralpatterns.interpreterpattern.rulesvalidator;

import java.util.StringTokenizer;

/**
 * Represents a TerminalExpression
 */
public class TerminalExpression implements Expression {

    private String data;

    public TerminalExpression(String data) {
        this.data = data;
    }

    /**
     * Returns true if str contains the string value data
     * @param str
     * @return
     */
    @Override
    public boolean interpret(String str) {
        StringTokenizer st = new StringTokenizer(str);
        while (st.hasMoreTokens()) {
            String test = st.nextToken();
            if (test.equals(data)) {
                return true;
            }
        }
        return false;
    }
}
