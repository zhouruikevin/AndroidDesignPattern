package example.com.designpattern;

import android.app.Activity;
import android.content.Intent;
import android.os.Binder;
import android.os.Process;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import example.com.designpattern.singleton.IActivityManager;
import example.com.designpattern.singleton.SingleInstance;
import example.com.designpattern.singleton.SingletonGeneric;

public class MainActivity extends AppCompatActivity {

    private static SingletonGeneric<IActivityManager> mDefault = new SingletonGeneric<IActivityManager>() {
        @Override
        public IActivityManager create() {
            return new SingleInstance("zr", "keystore", 27);
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
