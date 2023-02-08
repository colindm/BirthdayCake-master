package cs301.birthdaycake;
import android.view.View;
import android.util.Log;
import android.widget.CompoundButton;

public class CakeController implements View.OnClickListener, CompoundButton.OnCheckedChangeListener {
    private CakeView cakeView;
    private CakeModel cakeModel;

    public CakeController(CakeView cakeView) {
        this.cakeView = cakeView;
        this.cakeModel = cakeView.getInstanceCakeModel();
    }

    @Override
    public void onClick(View view) {
        Log.d("CakeController", "onClick method called");
        cakeModel.candlesLit = false;
        cakeView.invalidate();
    }

    @Override
    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
        Log.d("CakeController", "onCheckedChanged method called");
        cakeModel.hasCandles = isChecked;
        cakeView.invalidate();
    }
}