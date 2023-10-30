package com.example.calculator;

/**
 * Represents a calculator.
 *
 * @author Saltanat Umarova
 * @since 29.10.2023
 * @version 1.0
 */

public class Calculator {

    private double op1;
    private double op2;
    private char operator;
    private double result;

    /**
     * A non-return method that calculates a result
     * of arithmetic expression based on arithmetic operator.
     */
    public void calculate(){
        if(this.operator == '+') {
            this.result = this.op1 + this.op2;
        }
        else if(this.operator == '-'){
            this.result = this.op1 - this.op2;
        }
        else if(this.operator == '/'){
            this.result = this.op1 / this.op2;
        }
        else if(this.operator == '*'){
            this.result = this.op1 * this.op2;
        }
        else {
            System.out.println("Invalid operator");
        }
    }

    /**
     * Gets the first operand.
     * @return A double contains first operand.
     */
    public double getOp1() {
        return op1;
    }

    /**
     * Sets the first operand.
     * @param op1 represents the first operand.
     */
    public void setOp1(double op1) {
        this.op1 = op1;
    }

    /**
     * Gets the second operand.
     * @return A double containing the second operand.
     */
    public double getOp2() {
        return op2;
    }

    /**
     * Sets the second operand.
     * @param op2 represents the second operand.
     */
    public void setOp2(double op2) {
        this.op2 = op2;
    }

    /**
     * Gets the operator.
     * @return contains the operator.
     */
    public char getOperator() {
        return operator;
    }

    /**
     * Sets the operator.
     * @param operator represents the operator.
     */
    public void setOperator(char operator) {
        this.operator = operator;
    }

    /**
     * Gets the result.
     * @return contains the result.
     */
    public double getResult() {
        return result;
    }

    /**
     * Sets the result.
     * @param result represents the result.
     */
    public void setResult(double result) {
        this.result = result;
    }
}
