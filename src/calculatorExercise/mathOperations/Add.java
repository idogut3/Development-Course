package calculatorExercise.mathOperations;

import calculatorExercise.IMathOperation;

public class Add implements IMathOperation {

    @Override
    public double mathOperation(double num1, double num2) {
        return num1+num2;
    }
}