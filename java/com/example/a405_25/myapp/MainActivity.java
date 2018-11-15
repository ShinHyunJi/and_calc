package com.example.a405_25.myapp;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Context ctx = MainActivity.this;                  // Context(Class) == 설정값,맥락   뒤의 위치값을 설정값에 넣음(ex)위도,경도넣기)

        final EditText num = findViewById(R.id.num);    //객체 두개 숫자불러오기
        //final EditText num2 = findViewById(R.id.num2);

        final TextView result = findViewById(R.id.result);

        //inner class

        class Calc{
            //private int num1,num2,res;            //instance 변수
            private int num,res;

            String op;

            public void exe(){
//                switch(op){
//                    case "+": res = num1  + num2; break;
//                    case "-": res = num1  - num2; break;
//                    case "*": res = num1  * num2; break;
//                    case "/": res = num1  / num2; break;
//                }
                switch(op){
                    case "+": res = num  + num; break;
                    case "-": res = num  - num; break;
                    case "*": res = num  * num; break;
                    case "/": res = num  / num; break;
                }


            }
//            public void setNum1(int num1){
//                this.num1=num1;
//            }
//            public int getNum1(){
//                return this.num1;
//            }
//            public void setNum2(int num2){
//                this.num2=num2;
//            }
//            public int getNum2(){
//                return this.num2;
//            }
//            public void setRes(int res){
//                this.res=res;
//            }
//            public int getRes(){
//                return this.res;
//            }
//            public void setOp(String op){
//                this.op=op;
//            }
//            public String getOp(){
//                return this.op;
//            }


            public void setNum(int num){
                this.num=num;
            }
            public int getNum(){
                return this.num;
            }
            public void setRes(int res){
                this.res=res;
            }
            public int getRes(){
                return this.res;
            }
            public void setOp(String op){
                this.op=op;
            }
            public String getOp(){
                return this.op;
            }





        }

        //Calc calc = new Calc();
        final Calc calc = new Calc();

        //int a = num1;           //type 불일치로 에러
        //int b = num2;

        findViewById(R.id.plusBtn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {   //click 이벤트
                                                                                                             //ctx? ==>
                                                                                                            //단, 첫 화면에서는 아무 숫자도 입력하지 않았기에 error발생
                final int a = Integer.parseInt(num.getText().toString());                               //string에 해당하는 것을 text로
                Log.d("입력값1",a+"");

                //final int b = Integer.parseInt(num2.getText().toString());

                Log.d("입력값2",b+"");
                calc.setNum(a);
               // calc.setNum2(b);
                calc.setOp("+");
                //calc.exe();

              int c = calc.getRes();
                //Log.d("결과",c+"");

               //Toast.makeText(ctx,"덧셈결과"+c,Toast.LENGTH_LONG).show();
            }
        });

        findViewById(R.id.minusBtn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                final int a = Integer.parseInt(num.getText().toString());
                calc.setNum(a);

//                final int b = Integer.parseInt(num2.getText().toString());
//                calc.setNum2(b);
//                calc.setOp("-");
//                calc.exe();

                int c = calc.getRes();
                //Toast.makeText(ctx,"뺄셈결과"+c,Toast.LENGTH_LONG).show();

            }
        });


        findViewById(R.id.multiBtn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final int a = Integer.parseInt(num.getText().toString());
//                final int b = Integer.parseInt(num2.getText().toString());
                calc.setNum(a);
//                calc.setNum2(b);
                calc.setOp("*");
                calc.exe();

                int c = calc.getRes();
            }
        });
        findViewById(R.id.divBtn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final int a = Integer.parseInt(num.getText().toString());
 //               final int b = Integer.parseInt(num2.getText().toString());
                calc.setNum(a);
//                calc.setNum2(b);
                calc.setOp("/");
                calc.exe();

                int c = calc.getRes();
            }
        });
        findViewById(R.id.equalBtn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(ctx,"결과"+calc.getRes(),Toast.LENGTH_LONG).show();

            }
        });
    }
}
