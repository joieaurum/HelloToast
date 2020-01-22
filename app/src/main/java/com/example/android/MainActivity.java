package com.example.android;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    private int mCount = 0;
    private TextView mShowCount;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mShowCount = (TextView) findViewById(R.id.show_count);
    }

    public void showToast(View view) {
        //onclick handler for the button_toast button
        Context context = getApplicationContext();
        Toast toast = Toast.makeText(context, R.string.toast_message, Toast. LENGTH_LONG);
        toast.show();
        //an alternative to line 20 to 22 could be:-
        // Toast toast = Toast.makeText(this, R.string.toast_button_toast, Toast.LENGTH_LONG);
        //        toast.show();

        }

    public void countUp(View view) {
        //onclick handler for the button_count button
        mCount++;
    if (mShowCount != null)
        mShowCount.setText(Integer.toString(mCount));
    }
}
