package ca.dal.cs.csci3130.a1;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText numberEditField;
    Button checkPrimalityButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        numberEditField=(EditText)findViewById(R.id.numberEditField);
        checkPrimalityButton=(Button)findViewById(R.id.checkPrimalityButton);

        checkPrimalityButton.setOnClickListener(new OnClickListener()
        {

            @Override
            public void onClick(View view) {
                double number = Double.parseDouble(numberEditField.getText().toString());
                int x = 0;



                for (int i = 2; i < number; i++)
                {
                    if (number % i == 0)
                        x = 1;
                }

                if (x == 0)
                {
                    Toast t = Toast.makeText(getApplicationContext(),
                            "PRIME",
                            Toast.LENGTH_SHORT);
                    t.show();
                }else{
                    Toast t = Toast.makeText(getApplicationContext(),
                            "NOT PRIME",
                            Toast.LENGTH_SHORT);
                    t.show();

                }
            }});
    }

}