package com.example.calculator2


import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import net.objecthunter.exp4j.ExpressionBuilder

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        //Declaration
        val tVWorking = findViewById<TextView>(R.id.tVWorking)
        val tVResult = findViewById<TextView>(R.id.tVResult)

        val btn1 = findViewById<Button>(R.id.btn1)
        val btn2 = findViewById<Button>(R.id.btn2)
        val btn3 = findViewById<Button>(R.id.btn3)
        val btn4 = findViewById<Button>(R.id.btn4)
        val btn5 = findViewById<Button>(R.id.btn5)
        val btn6 = findViewById<Button>(R.id.btn6)
        val btn7 = findViewById<Button>(R.id.btn7)
        val btn8 = findViewById<Button>(R.id.btn8)
        val btn9 = findViewById<Button>(R.id.btn9)
        val btn0 = findViewById<Button>(R.id.btn0)

        val btnPlus = findViewById<Button>(R.id.btnPlus)
        val btnMinus = findViewById<Button>(R.id.btnMinus)
        val btnMultiply = findViewById<Button>(R.id.btnMultiply)
        val btnDivide = findViewById<Button>(R.id.btnDivide)
        val btnEqual = findViewById<Button>(R.id.btnEqual)
        val btnAC= findViewById<Button>(R.id.btnAC)
        val btnC= findViewById<Button>(R.id.btnC)
        val btnDecimal= findViewById<Button>(R.id.btnDecimal)


        btn1.setOnClickListener {
            tVWorking.text = tVWorking.text.toString() + "1"

        }

        btn2.setOnClickListener {
            tVWorking.text = tVWorking.text.toString() + "2"

        }

        btn3.setOnClickListener {
            tVWorking.text = tVWorking.text.toString() + "3"
        }

        btn4.setOnClickListener {
            tVWorking.text = tVWorking.text.toString() + "4"
        }

        btn5.setOnClickListener {
            tVWorking.text = tVWorking.text.toString() + "5"
        }

        btn6.setOnClickListener {
            tVWorking.text = tVWorking.text.toString() + "6"
        }

        btn7.setOnClickListener {
            tVWorking.text = tVWorking.text.toString() + "7"
        }
        btn8.setOnClickListener {
            tVWorking.text = tVWorking.text.toString() + "8"
        }
        btn9.setOnClickListener {
            tVWorking.text = tVWorking.text.toString() + "9"
        }

        btn0.setOnClickListener {
            tVWorking.text = tVWorking.text.toString() + "0"
        }

        btnPlus.setOnClickListener {
            tVWorking.text = tVWorking.text.toString() + "+"
        }
        btnMinus.setOnClickListener {
            tVWorking.text = tVWorking.text.toString() + "-"
        }

        btnMultiply.setOnClickListener {
            tVWorking.text = tVWorking.text.toString() + "*"
        }

        btnDivide.setOnClickListener {
            tVWorking.text = tVWorking.text.toString() + "/"
        }

        btnDecimal.setOnClickListener {
            tVWorking.text = tVWorking.text.toString() + "."
        }

        btnEqual.setOnClickListener {
            //For null values
            try {
                if (tVWorking.text != "") {
                    val result = ExpressionBuilder(tVWorking.text.toString()).build().evaluate()

                    // Check and show the number is decimal or integer
                    if (result % 1 == 0.0) {
                        tVResult.text = result.toInt().toString()
                    } else {
                        tVResult.text = result.toString()
                    }

                } else {
                    tVWorking.text = ""
                    tVResult.text = ""
                }
            }catch(e: ArithmeticException){
                tVResult.text= "Cannot divide by 0"
            }catch (e: Exception){
                tVResult.text= "Invalid Input"
            }
        }
        btnC.setOnClickListener {
            tVWorking.text = tVWorking.text.toString().dropLast(1)
        }

        btnAC.setOnClickListener {
            tVWorking.text= ""
            tVResult.text= ""
        }
    }


}