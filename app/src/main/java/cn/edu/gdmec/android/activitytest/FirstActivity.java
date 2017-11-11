package cn.edu.gdmec.android.activitytest;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class FirstActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );
        //在活动中添加布局activity_first
        //去掉标题栏
        //requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView ( R.layout.activity_first );

        //在活动中使用Toast
        final Button button1=( Button ) findViewById ( R.id.button_1 );
        button1.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View v) {
//                Toast.makeText ( FirstActivity.this, "You clicked Button 1",
//                        Toast.LENGTH_SHORT ).show ();

                //Intent intent = new Intent ( FirstActivity.this, SecondActivity.class );
                //Intent intent = new Intent ( "cn.edu.gdmec.android.activitytest.ACTION_START" );
                //intent.addCategory ( "cn.edu.gdmec.android.activitytest.MY_CATEGORY" );
//                Intent intent = new Intent ( Intent.ACTION_VIEW );
//                intent.setData ( Uri.parse ("http://www.baidu.com") );
                //调用系统打电话
//                Intent intent = new Intent ( Intent.ACTION_DIAL );
//                intent.setData ( Uri.parse ( "tel:10086" ) );
                //添加日志
//                String data = "Hello SecondActivity";
//                Intent intent = new Intent ( FirstActivity.this, SecondActivity.class );
//                intent.putExtra ( "extra_data", data );
//
//                startActivity ( intent );
                Intent intent = new Intent ( FirstActivity.this, SecondActivity.class );
                startActivityForResult ( intent, 1 );

//                Intent intent = new Intent ( FirstActivity.this, SecondActivity.class );
//                AnimUtils.startIntent(intent,button1, (Activity ) FirstActivity.this,R.id.button_1);
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
//按钮间相互跳转
        @Override
        protected void onActivityResult(int requestCode, int resultCode, Intent data){
            switch (requestCode){
                case 1:
                    if (resultCode == RESULT_OK){
                        String returnedData = data.getStringExtra ( "data_return" );
                        Log.d ("FirstActivity", returnedData);
                    }
                    break;
                default:
            }
        }
        @Override
    public void onBackPressed(){
            Intent intent = new Intent (  );
            intent.putExtra ( "data_return", "Hello FirstActivity" );
            setResult ( RESULT_OK, intent );
            finish ();
           // AnimUtils.finishonBackPressed(FirstActivity.this,R.id.button_1);

        }
}
