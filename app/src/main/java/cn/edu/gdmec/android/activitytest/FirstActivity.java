package cn.edu.gdmec.android.activitytest;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class FirstActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );
        //在活动中添加布局activity_first
        //去掉标题栏
        //requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView ( R.layout.activity_first );
    }
}
