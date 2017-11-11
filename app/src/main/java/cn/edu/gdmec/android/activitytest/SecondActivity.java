package cn.edu.gdmec.android.activitytest;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.widget.Button;

/**
 * Created by Jack on 2017/11/3.
 * hahhh
 */

public class SecondActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.second_layout );
        //ctrl+o  不要手动
//        Intent intent = getIntent ();
//        String data = intent.getStringExtra ( "extra_data" );
//        Log.d ("SecondActivity", data);

        Button button2 = (Button) findViewById ( R.id.button_2 );
        button2.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent (  );
                intent.putExtra ( "data_return", "Hello FirstActivity" );
                setResult ( RESULT_OK, intent );
                finish ();
            }
        } );
    }
}
