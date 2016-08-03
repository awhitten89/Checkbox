package checkbox.alan.com.checkbox;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private CheckBox checkDog;
    private CheckBox checkCat;
    private CheckBox checkDragon;

    private Button showButton;

    private TextView showResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        showResult = (TextView) findViewById(R.id.resultId);
        checkDog = (CheckBox) findViewById(R.id.dog_checkbox);
        checkCat = (CheckBox) findViewById(R.id.cat_checkbox);
        checkDragon = (CheckBox) findViewById(R.id.dragon_checkbox);

        showButton = (Button) findViewById(R.id.button_Show);

        showButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                StringBuilder stringBuilder = new StringBuilder();

                stringBuilder.append(checkDog.getText().toString() + " status is " + checkDog.isChecked() + "\n");
                stringBuilder.append(checkCat.getText().toString() + " status is " + checkCat.isChecked() + "\n");
                stringBuilder.append(checkDragon.getText().toString() + " status is " + checkDragon.isChecked() + "\n");

                showResult.setText(stringBuilder);
            }
        });
    }
}
