package com.example.exercise1;

public class MathEquation {
    double leftVal;
    double rightVal;
    MathOperation opCode;
    double result;
    private static int numberOfCalculations;
    private static double sumOfResults;

    public MathEquation() {
    }

    public MathEquation(MathOperation opCode, double leftVal, double rightVal) {
        this.opCode = opCode;
    }


    void execute() {
        switch (opCode) {
            case ADD:
                result = leftVal + rightVal;
                break;
            case SUBTRACT:
                result = leftVal - rightVal;
                break;
            case MULTIPLY:
                result = leftVal * rightVal;
                break;
            case DIVIDE:
                result = rightVal != 0 ? leftVal / rightVal : 0.0d;
                break;
            default:
                System.out.println("Invalid opCode: " + opCode);
                result = 0.0d;
                break;
        }
        numberOfCalculations++;
        sumOfResults += result;
    }

    public static double getAverageResult(){
        return sumOfResults / numberOfCalculations;
    }
    public double getLeftVal() {
        return leftVal;
    }
    public void setLeftVal(double leftVal){
        this.leftVal = leftVal;
    }
    public double getRightVal(){
        return rightVal;
    }
    public void setRightVal(double rightVal){
        this.rightVal = rightVal;
    }
}
