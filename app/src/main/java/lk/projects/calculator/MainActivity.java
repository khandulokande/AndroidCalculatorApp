/*
 * @Author: Khandu Lokande
 * @Version: 1.0
 * @Since: 2024-08-19
 * @Project Name: Calculator
 */

package lk.projects.calculator;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.content.SharedPreferences;

public class MainActivity extends AppCompatActivity {
    TextView entryView, totalView;
    Button btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btn0, btnDot, btnBackspace, btnClear, btnAdd, btnSub, btnMul, btnDiv, btnResultOff;
    static String screenValue;

    public static void numKeyValue(int keyValue, TextView entryView) {
        screenValue = (String) entryView.getText();
        if (keyValue == 46){
            entryView.setText(screenValue + ".");
        }
        else {
            entryView.setText(screenValue + keyValue);
        }
    }

    public void backspace(TextView entryView){
        screenValue = entryView.getText().toString();

        if (screenValue == "") {
            entryView.setText("");
        }
        else {
            int valueLength = screenValue.length();
            int backspaceValue = valueLength - 1;

            String backspaceResult = screenValue.substring(0, backspaceValue);
            entryView.setText(backspaceResult);
        }
    }

    public static void clear(TextView entryView, TextView totalView){
        entryView.setText("");
        totalView.setText("");
    }

    public void setScreenValue(TextView entryView, TextView totalView, String setOnTotalView) {
        totalView.setText(setOnTotalView);
        entryView.setText("");
    }

    public void resultOff(SharedPreferences sharedPreferences, float first, float second) {
        Calculator calculator = new Calculator();
        String preOperator = sharedPreferences.getString("preOperatorType", null);

        switch (preOperator){
            case "ADD":
                float addValue = calculator.add(first, second);
                String addValueOff = String.valueOf(addValue);
                setScreenValue(entryView, totalView, addValueOff);
                break;
            case "SUB":
                float subValue = calculator.sub(first, second);
                String subValueOff = String.valueOf(subValue);
                setScreenValue(entryView, totalView, subValueOff);
                break;
            case "MUL":
                float mulValue = calculator.mul(first, second);
                String mulValueOff = String.valueOf(mulValue);
                setScreenValue(entryView, totalView, mulValueOff);
                break;
            case "DIV":
                float divValue = calculator.div(first, second);
                String divValueOff = String.valueOf(divValue);
                setScreenValue(entryView, totalView, divValueOff);
        }
    }

    public void mathsOperator(String operator, TextView entryView, TextView totalView) {
        String total = totalView.getText().toString();
        String entry = entryView.getText().toString();

        SharedPreferences sharedPreferences = getSharedPreferences("CalLK", MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();

        if (total == "") {
            totalView.setText(entry);
            entryView.setText("");

            editor.putString("preOperatorType", operator);
            editor.apply();
        }
        else if (entry == "") {
            totalView.setText(total);
            entryView.setText(entry);

            editor.putString("preOperatorType", operator);
            editor.apply();
        }
        else {
            float first = Float.parseFloat(total);
            float second = Float.parseFloat(entry);

            if (operator == "RESULT"){
                resultOff(sharedPreferences, first, second);
            }
            else {
                resultOff(sharedPreferences, first, second);

                editor.putString("preOperatorType", operator);
                editor.apply();
            }
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        entryView = findViewById(R.id.entryView);
        totalView = findViewById(R.id.totalView);

        entryView.setText("");
        totalView.setText("");

        btn1 = findViewById(R.id.btnOne);
        btn2 = findViewById(R.id.btnTwo);
        btn3 = findViewById(R.id.btnThree);
        btn4 = findViewById(R.id.btnFour);
        btn5 = findViewById(R.id.btnFive);
        btn6 = findViewById(R.id.btnSix);
        btn7 = findViewById(R.id.btnSeven);
        btn8 = findViewById(R.id.btnEight);
        btn9 = findViewById(R.id.btnNine);
        btn0 = findViewById(R.id.btnZero);
        btnDot = findViewById(R.id.btnDot);
        btnBackspace = findViewById(R.id.btnBackspace);
        btnClear = findViewById(R.id.btnClear);
        btnAdd = findViewById(R.id.btnAdd);
        btnSub = findViewById(R.id.btnSub);
        btnMul = findViewById(R.id.btnMul);
        btnDiv = findViewById(R.id.btnDiv);
        btnResultOff = findViewById(R.id.resultOff);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numKeyValue(1, entryView);
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numKeyValue(2, entryView);
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numKeyValue(3, entryView);
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numKeyValue(4, entryView);
            }
        });

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numKeyValue(5, entryView);
            }
        });

        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numKeyValue(6, entryView);
            }
        });

        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numKeyValue(7, entryView);
            }
        });

        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numKeyValue(8, entryView);
            }
        });

        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numKeyValue(9, entryView);
            }
        });

        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numKeyValue(0, entryView);
            }
        });

        btnDot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numKeyValue(46, entryView);
            }
        });

        btnBackspace.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                backspace(entryView);
            }
        });

        btnClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clear(entryView, totalView);
            }
        });

        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mathsOperator("ADD", entryView, totalView);
            }
        });

        btnSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mathsOperator("SUB", entryView, totalView);
            }
        });

        btnMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mathsOperator("MUL", entryView, totalView);
            }
        });

        btnDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mathsOperator("DIV", entryView, totalView);
            }
        });

        btnResultOff.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mathsOperator("RESULT", entryView, totalView);
            }
        });
    }
}