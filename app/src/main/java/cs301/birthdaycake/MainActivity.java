package cs301.birthdaycake;

import android.content.pm.ActivityInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.Switch;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
        setContentView(R.layout.activity_main);

        CakeView cakeView = findViewById(R.id.cakeview);
        CakeController cakeController = new CakeController(cakeView);

        Button blowOutButton = findViewById(R.id.button_blow_out);
        blowOutButton.setOnClickListener(cakeController);

        Switch CandlesSwitch = findViewById(R.id.CandlesSwitch);
        CandlesSwitch.setOnCheckedChangeListener(cakeController);
    }

//public class CakeController implements CompoundButton.OnCheckedChangeListener {
//    @Override
//    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
//        Log.d("CakeController", "onCheckedChanged method called");
//        cakeModel.hasCandles = isChecked;
//        cakeView.invalidate();
//    }
//}
//
//Switch candlesSwitch = findViewById(R.id.CandlesSwitch);
//CakeController cakeController = new CakeController();
//candlesSwitch.setOnCheckedChangeListener(cakeController);

public void goodbye(View button) {
        Log.i("button", "Goodbye");
    }
}