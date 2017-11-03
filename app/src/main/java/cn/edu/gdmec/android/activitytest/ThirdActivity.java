package cn.edu.gdmec.android.activitytest;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Window;

/**
 * Created by Jack on 2017/11/3.
 */

public class ThirdActivity extends AppCompatActivity{
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate ( savedInstanceState );
        requestWindowFeature ( Window.FEATURE_NO_TITLE );
        setContentView ( R.layout.third_layout );
    }
}
