/*
 * The Calculator class performs basic arithmetic operations:
 * addition, subtraction, multiplication, and division.
 * This class is designed for simple mathematical calculations
 *
 * @Author: Khandu Lokande
 * @Version: 1.0
 * @Since: 2024-08-19
 * @Project Name: Calculator
 */
package lk.projects.calculator;

public class Calculator {
    public float add(float x, float ...arr){
        float result = x;
        for (float y : arr){
            result += y;
        }
        return result;
    }

    public float sub(float x, float ...arr){
        float result = x;
        for (float y : arr){
            result -=y;
        }
        return result;
    }

    public float mul(float x, float ...arr){
        float result = x;
        for (float y : arr){
            result *= y;
        }
        return result;
    }

    public float div(float x, float ...arr){
        float result = x;
        for (float y : arr){
            result /= y;
        }
        return result;
    }
}