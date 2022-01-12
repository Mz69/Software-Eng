package ca.dal.cs.csci3130.a1;

// Importing Required Classes
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    // Declaring a Text field.
    EditText numberEditField;

    // Declaring a Button.
    Button checkPrimalityButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initializing text field and button to the correspond ID's.
        numberEditField = (EditText) findViewById(R.id.numberEditElement);
        checkPrimalityButton = (Button) findViewById(R.id.checkPrimalityButton);

        // Calling setOnClickListener method for the button.
        checkPrimalityButton.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                double number = Double.parseDouble(numberEditField.getText().toString());
                int x=0;
                for(int i=2; i<number; i++){
                    if(number%i==0)
                        x=1;
                }
                if(x==0){
                    Toast toast = Toast.makeText(getApplicationContext(),"PRIME",
                            Toast.LENGTH_SHORT);
                    toast.show();
                }
                else{
                    Toast toast = Toast.makeText(getApplicationContext(),"NOT PRIME",
                            Toast.LENGTH_SHORT);
                    toast.show();
                }
            }
        });
    }
}