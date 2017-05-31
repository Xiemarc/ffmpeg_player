package com.xie.ffmpeg_player;

import android.os.Bundle;
import android.os.Environment;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import java.io.File;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void mDecode(View btn){
        String input = new File(Environment.getExternalStorageDirectory(),"input.avi").getAbsolutePath();
        String output = new File(Environment.getExternalStorageDirectory(),"output_1280x720_yuv420p.yuv").getAbsolutePath();
        VideoUtils.decode(input, output);
    }
}
