package com.example.digitalhouse.calculadora;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private enum Operador { NONE, SUMA, RESTA, MULTIPLICACION, DIVISION, MODULO, IGUAL }

    private TextView textViewCalculo;
    private Operador lastOperator = Operador.NONE;

    private String showTotal = "";
    private String currentNumber = "";
    private Double total = 0.;
    private Boolean clean = false;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textViewCalculo = (TextView) findViewById(R.id.textViewCalculo);
    }

    public void onClick(View view){
        switch (view.getId()){
            case R.id.button0:
                if (clean){
                    clean();
                }
                currentNumber += "0";
                textViewCalculo.setText(showTotal+currentNumber);
                break;
            case R.id.button1:
                if (clean){
                    clean();
                }
                currentNumber += "1";
                textViewCalculo.setText(showTotal+currentNumber);
                break;
            case R.id.button2:
                if (clean){
                    clean();
                }
                currentNumber += "2";
                textViewCalculo.setText(showTotal+currentNumber);
                break;
            case R.id.button3:
                if (clean){
                    clean();
                }
                currentNumber += "3";
                textViewCalculo.setText(showTotal+currentNumber);
                break;
            case R.id.button4:
                if (clean){
                    clean();
                }
                currentNumber += "4";
                textViewCalculo.setText(showTotal+currentNumber);
                break;
            case R.id.button5:
                if (clean){
                    clean();
                }
                currentNumber += "5";
                textViewCalculo.setText(showTotal+currentNumber);
                break;
            case R.id.button6:
                if (clean){
                    clean();
                }
                currentNumber += "6";
                textViewCalculo.setText(showTotal+currentNumber);
                break;
            case R.id.button7:
                if (clean){
                    clean();
                }
                currentNumber += "7";
                textViewCalculo.setText(showTotal+currentNumber);
                break;
            case R.id.button8:
                if (clean){
                    clean();
                }
                currentNumber += "8";
                textViewCalculo.setText(showTotal+currentNumber);
                break;
            case R.id.button9:
                if (clean){
                    clean();
                }
                currentNumber += "9";
                textViewCalculo.setText(showTotal+currentNumber);
                break;
            case R.id.buttonModulo:
                onCheckSintaxOperator(Operador.MODULO);
                break;
            case R.id.buttonSuma:
                onCheckSintaxOperator(Operador.SUMA);
                break;
            case R.id.buttonResta:
                onCheckSintaxOperator(Operador.RESTA);
                break;
            case R.id.buttonDivision:
                onCheckSintaxOperator(Operador.DIVISION);
                break;
            case R.id.buttonMultiplicacion:
                onCheckSintaxOperator(Operador.MULTIPLICACION);
                break;
            case R.id.buttonDot:
                if (clean){
                    clean();
                }
                currentNumber += ".";
                textViewCalculo.setText(showTotal + currentNumber);
                break;
            case R.id.buttonIgual:
                onCheckSintaxOperator(Operador.IGUAL);
                break;
            case R.id.buttonClear:
                clean();
                break;
        }
    }

    private void clean(){
        lastOperator = Operador.NONE;
        currentNumber = "";
        showTotal = "";
        total = 0.;
        clean = false;
        textViewCalculo.setText("0.");
    }

    private Character convertOperator(Operador operador){
        switch (operador) {
            case SUMA:
                return '+';
            case RESTA:
                return '-';
            case MULTIPLICACION:
                return '*';
            case DIVISION:
                return '/';
            case MODULO:
                return '%';
            case IGUAL:
                return '=';
            default:
                return null;
        }
    }

    private void onCheckSintaxOperator(Operador operador){
        Character operadorChar = convertOperator(operador);

        if (operadorChar != null) {
            showTotal = showTotal + currentNumber;

            if (!showTotal.equals("")) {
                if (!((Character) (showTotal).charAt(showTotal.length() - 1)).equals(operadorChar)) {
                    onDoOperation(operador, operadorChar);
                }
            }
        }
    }

    private void onDoOperation(Operador operador, Character operadorChar) {
        Double number;
        try {
            number = Double.parseDouble(currentNumber);
        } catch(NumberFormatException e){
            number = 0.;
        }
        switch (lastOperator){
            case NONE:
                total = number;
                break;
            case SUMA:
                total += number;
                break;
            case RESTA:
                total -= number;
                break;
            case MULTIPLICACION:
                total *= number;
                break;
            case DIVISION:
                if (number > 0.){
                    total /= number;
                } else {
                    Toast.makeText(this, R.string.divide_by_zero, Toast.LENGTH_SHORT).show();
                }
                break;
            case MODULO:
                total %= number;
                break;
        }
        currentNumber = "";
        lastOperator = operador;

        if (!operador.equals(Operador.IGUAL)) {
            showTotal = showTotal + operadorChar;
        } else {
            clean = true;
            showTotal = total.toString();
        }

        textViewCalculo.setText(showTotal);
    }
}
