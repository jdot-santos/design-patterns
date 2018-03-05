package com.jsantos.behavioralpatterns.interpreterpattern.rulesvalidator;

/**
 * This demos a rules validator using the interpreter pattern
 */
public class RulesValidatorDemo {

    /**
     * Returns an expression that will be used to evaluate Strings. The equivalent below would be if-else statements or switch statements, which could be unmaintainable if it gets more complex. Validating this way enables developers to build expressions in separate class in order to increase maintainability.
     * @return
     */
    static Expression buildInterpreterTree() {

        Expression terminal1 = new TerminalExpression("Lions");
        Expression terminal2 = new TerminalExpression("Tigers");
        Expression terminal3 = new TerminalExpression("Bears");

        // true if string contains Tigers and Bears
        Expression alteration1 = new AndExpression(terminal2, terminal3);

        // true if it contains Lions or (Tigers and Bears)
        Expression alteration2 = new OrExpression(terminal1, alteration1);

        return new AndExpression(terminal3, alteration2);
    }

    public static void main(String[] args) {
//        String context = "Lions";         // false
//        String context = "Tigers";        // false
//        String context = "Bears";         // false
//        String context = "Lions Tigers";  // false
        String context = "Lions Bears";   // true
//        String context = "Tigers Bears";  // false
        Expression define = buildInterpreterTree();
        System.out.println(context + " is " + define.interpret(context));
    }
}


