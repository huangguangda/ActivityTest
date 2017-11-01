package cn.edu.gdmec.android.activitytest;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.Toast;

public class FirstActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );
        //在活动中添加布局activity_first
        //去掉标题栏
        //requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView ( R.layout.activity_first );
        //在活动中使用Toast
        Button button1=( Button ) findViewById ( R.id.button_1 );
        button1.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                Toast.makeText ( FirstActivity.this, "You clicked Button 1",
                        Toast.LENGTH_SHORT ).show ();
                //Toast.LENGTH_SHORT显示时长
            }
        } );
    }
        @Override
        public boolean onCreateOptionsMenu(Menu menu){
            getMenuInflater ().inflate ( R.menu.main, menu );
            return true;
        }

        @Override
        public boolean onOptionsItemSelected(MenuItem item){
            switch (item.getItemId ()){
                case R.id.add_item:
                    Toast.makeText ( this, "You clicked Add", Toast.LENGTH_SHORT ).show ();
                    break;
                case R.id.remove_item:
                    Toast.makeText ( this, "You chicked Remove", Toast.LENGTH_SHORT ).show ();
                    break;
                default:
            }
            return true;
        }
}
