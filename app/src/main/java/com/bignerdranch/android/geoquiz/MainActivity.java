package com.bignerdranch.android.geoquiz;

import android.annotation.SuppressLint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";
    private Button mTrueButton;
    private Button mFalseButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mTrueButton = (Button) findViewById(R.id.true_button);//以组件资源ID作为参数，返回一个视图对象View，然后向下转型为Button实例（多态的特性）
        mTrueButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast toast = Toast.makeText(MainActivity.this, R.string.correct_toast, Toast.LENGTH_SHORT);
                toast.setGravity(Gravity.TOP, 0, 0);
                toast.show();
                Log.e(TAG, "duration: " + toast.getDuration());
                Log.e(TAG, "gravity: " + toast.getGravity());
                Log.e(TAG, "horizontalMargin: " + toast.getHorizontalMargin());
                Log.e(TAG, "verticalMargin: " + toast.getVerticalMargin());
                Log.e(TAG, "xOffset: " + toast.getXOffset());
                Log.e(TAG, "yOffset: " + toast.getYOffset());
            }
        });//setOnClickListener()方法的参数类型是接口引用类型，所以需要传入接口实现类对象，然后在这个接口实现类对象中，重写了接口中被定义的onClick(View v)抽象方法。
        mFalseButton = (Button) findViewById(R.id.false_button);
        mFalseButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast toast = Toast.makeText(MainActivity.this, R.string.incorrect_toast, Toast.LENGTH_LONG);
                toast.setGravity(Gravity.TOP, 0, 0);
                toast.show();
                Log.e(TAG, "duration: " + toast.getDuration());
                Log.e(TAG, "gravity: " + toast.getGravity());
                Log.e(TAG, "horizontalMargin: " + toast.getHorizontalMargin());
                Log.e(TAG, "verticalMargin: " + toast.getVerticalMargin());
                Log.e(TAG, "xOffset: " + toast.getXOffset());
                Log.e(TAG, "yOffset: " + toast.getYOffset());
            }
        });
    }
}
