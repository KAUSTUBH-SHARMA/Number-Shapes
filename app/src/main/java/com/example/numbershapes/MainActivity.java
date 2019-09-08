package com.example.numbershapes;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText numberField;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        numberField=findViewById(R.id.NumberEditText);
    }
    public void checkNumber(View view){


        if((numberField.getText().toString()).isEmpty()){
            tost("Enter a number Please");
            return;
        }
        int num=Integer.parseInt(numberField.getText().toString());
         if(isTriangular(num) && isSquare(num)){
            tost(""+num+" is both Square and Triangular");
        } else if (isSquare(num) && !isTriangular(num)) {
            tost(""+num+" is square but not Triangular");
        }
        else if(isTriangular(num) && !isSquare(num)){
            tost(""+num+" is Triangular but not Square");
        }
        else{
            tost(""+num+" is neither Traingular nor square");
        }

    }
    public boolean isSquare(double x){
        double sr=Math.sqrt(x);
        return((sr-Math.floor(sr)) == 0);


    }
    public boolean isTriangular(int num){
        if(num<0){
            return false;
        }
        int sum=0;
        for(int n=1;n<=num;n++){
            sum=sum+n;
            if(sum==num)
                return true;
        }
       return false;
    }
    public void tost(String str){
        Toast.makeText(this,str,Toast.LENGTH_SHORT).show();
    }
}
