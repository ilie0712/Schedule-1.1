package schedule.ro.schedule;

import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.Spinner;

public class CreateListActivity2 extends AppCompatActivity {

    FloatingActionButton mContinue_btn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_list2);

        mContinue_btn = (FloatingActionButton) findViewById(R.id.Continue_Btn);


        mContinue_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //popupwindow dar nu e ce vreau totusi merita salvat asa
                //setContentView(R.layout.popupwindow);

               // DisplayMetrics dm = new DisplayMetrics();
                //getWindowManager().getDefaultDisplay().getMetrics(dm);

               // int width = dm.widthPixels;
               // int height = dm.heightPixels;

               // getWindow().setLayout((int) (width*.8), (int)(width*.6));

            }
        });

    }
}
