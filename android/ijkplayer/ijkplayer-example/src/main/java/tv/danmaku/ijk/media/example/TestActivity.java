package tv.danmaku.ijk.media.example;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import tv.danmaku.ijk.media.example.widget.media.IjkVideoView;

/**
 * Created by yinghuihong on 2016/10/31.
 */
public class TestActivity extends Activity {

    private static final String URL = "http://html5demos.com/assets/dizzy.mp4";

    private EditText etUrl;

    private IjkVideoView ijk_video_view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);

        etUrl = (EditText) findViewById(R.id.et_url);
        ijk_video_view = (IjkVideoView) findViewById(R.id.ijk_video_view);

        findViewById(R.id.btn_test).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = etUrl.getText().toString();
//                url = "http://106.75.22.76:8086/api/mediaMgr/media?type=video&suffix=mp4&sn=3T21447X0005D&name=2016_12_16_184733110";
//                url = URL;
                ijk_video_view.setVideoPath(url);
                ijk_video_view.start();
            }
        });
    }
}
