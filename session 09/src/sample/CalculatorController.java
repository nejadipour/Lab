package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.event.ActionEvent;

/**
 * controller of calculator
 */

public class CalculatorController
{
    private String result = "";

    @FXML
    private TextField resultTextField;


    /**
     * updates text field
     * @param actionEvent act by user
     */
    @FXML
    public void activeButtonController(ActionEvent actionEvent) {
        result = resultTextField.getText();
        result += ((Button) actionEvent.getSource()).getText();
        resultTextField.setText(result);
    }

    /**
     * updates text field when the button is not simple
     * @param actionEvent the act by user
     */
    @FXML
    public void triangular(ActionEvent actionEvent)
    {
        result = resultTextField.getText();
        result += "(" + ((Button) actionEvent.getSource()).getText() + ")";
        resultTextField.setText(result);

    }

    /**
     * cleans text field
     */
    @FXML
    public void cleanButtonController()
    {
        result = "";
        resultTextField.setText(result);

    }

    /**
     * calculates result
     */
    @FXML
    public void resultButtonController()
    {
        result = resultTextField.getText();
        resultTextField.setText(result + "=");

        String[] numbers = result.split("[-+×/^]");

        for (String num : numbers)
        {
            result = result.replace(num, "");
        }

        if (numbers.length == 2)
        {
            simpleOperators(numbers, result);
        }
        else
        {
            triangularOperator(numbers[0]);
        }
        resultTextField.setText(result);

    }


    /**
     * for simple operators
     * @param numbers two numbs
     * @param operator the operator
     */
    public void simpleOperators(String[] numbers, String operator)
    {
        float firstNum = Float.parseFloat(numbers[0]);
        float secondNum = Float.parseFloat(numbers[1]);

        switch (operator)
        {
            case "+" -> result = Float.toString(firstNum + secondNum);

            case "-" -> result = Float.toString(firstNum - secondNum);

            case "×" -> result = Float.toString(firstNum * secondNum);

            case "/" ->
                    {
                        if (secondNum == 0)
                        {
                            result = "division by zero!";
                        }
                        else
                        {
                            result = Float.toString(firstNum / secondNum);
                        }

                    }

            case "^" -> result = Double.toString(Math.pow(firstNum, secondNum));

            default -> result = "couldn't calculate!";

        }

    }


    /**
     * for triangular operators
     * @param expression the expression
     */
    public void triangularOperator(String expression)
    {
        double number;
        if (expression.contains("sin"))
        {
            expression = expression.replace("(sin)", "");
            number = Math.toRadians(Double.parseDouble(expression));
            result = Double.toString(Math.sin(number));

        }
        else if (expression.contains("cos"))
        {
            expression = expression.replace("(cos)", "");
            number = Math.toRadians(Double.parseDouble(expression));
            result = Double.toString(Math.cos(number));

        }
        else if (expression.contains("tan"))
        {
            expression = expression.replace("(tan)", "");
            number = Math.toRadians(Double.parseDouble(expression));
            result = Double.toString(Math.tan(number));
        }
        else
        {
            result = "couldn't calculate!";
        }

    }

}