package io.bidmachine.nativead.view;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.VideoView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import io.bidmachine.core.Logger;
import io.bidmachine.core.Utils;
import io.bidmachine.iab.utils.Assets;
import io.bidmachine.iab.vast.view.CircleCountdownView;
import io.bidmachine.utils.lazy.LazyValue;

/* JADX INFO: loaded from: classes10.dex */
public class VideoPlayerActivity extends Activity implements MediaPlayer.OnCompletionListener, MediaPlayer.OnErrorListener, MediaPlayer.OnPreparedListener {
    private static final String FILE_URI = "io.bidmachine.fileUri";
    private static final String SEEK_TO = "io.bidmachine.seekTo";
    private c listener;
    private int seekTo;
    private VideoView videoView;

    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            VideoPlayerActivity.this.closeClicked();
        }
    }

    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                VideoPlayerActivity.this.getWindow().clearFlags(128);
            } catch (Exception e10) {
                Logger.w(e10);
            }
        }
    }

    public interface c {
        void videoPlayerActivityClosed(int i10, boolean z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ String lambda$onCreate$0() {
        return String.format("VideoPlayerActivity started, position: %s", Integer.valueOf(this.seekTo));
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent me2) {
        DetectTouchUtils.activityOnTouch("io.bidmachine", me2);
        return super.dispatchTouchEvent(me2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void closeClicked() {
        if (this.listener != null) {
            this.listener.videoPlayerActivityClosed(this.videoView.isPlaying() ? this.videoView.getCurrentPosition() : 0, false);
        }
        finishActivity();
    }

    private void finishActivity() {
        runOnUiThread(new b());
        finish();
    }

    public static Intent getIntent(@NonNull Context context, @NonNull String str, int i10) {
        Intent intent = new Intent(context, (Class<?>) VideoPlayerActivity.class);
        intent.putExtra(FILE_URI, str);
        intent.putExtra(SEEK_TO, i10);
        return intent;
    }

    @Override // android.media.MediaPlayer.OnCompletionListener
    public void onCompletion(MediaPlayer mediaPlayer) {
        c cVar = this.listener;
        if (cVar != null) {
            cVar.videoPlayerActivityClosed(0, true);
        }
        finishActivity();
    }

    @Override // android.media.MediaPlayer.OnPreparedListener
    public void onPrepared(MediaPlayer mediaPlayer) {
        VideoView videoView = this.videoView;
        if (videoView == null || !videoView.canSeekForward()) {
            return;
        }
        this.videoView.seekTo(this.seekTo);
        this.videoView.start();
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        closeClicked();
    }

    @Override // android.app.Activity
    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        getWindow().addFlags(128);
        Intent intent = getIntent();
        String stringExtra = intent.getStringExtra(FILE_URI);
        this.seekTo = intent.getIntExtra(SEEK_TO, 0);
        Logger.d((LazyValue<String>) new LazyValue() { // from class: io.bidmachine.nativead.view.j
            @Override // io.bidmachine.utils.lazy.LazyValue
            public final Object get() {
                return this.f59959a.lambda$onCreate$0();
            }
        });
        if (stringExtra == null) {
            return;
        }
        this.listener = MediaView.listener;
        RelativeLayout relativeLayout = new RelativeLayout(this);
        relativeLayout.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
        this.videoView = new VideoView(this);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams.addRule(13);
        this.videoView.setLayoutParams(layoutParams);
        this.videoView.setOnCompletionListener(this);
        this.videoView.setOnPreparedListener(this);
        this.videoView.setVideoPath(stringExtra);
        relativeLayout.addView(this.videoView);
        float screenDensity = Utils.getScreenDensity(this);
        int iRound = Math.round(24.0f * screenDensity);
        int iRound2 = Math.round(screenDensity * 8.0f);
        CircleCountdownView circleCountdownView = new CircleCountdownView(this);
        circleCountdownView.setColors(Assets.MAIN_ASSETS_COLOR, Assets.BACKGROUND_COLOR);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(iRound, iRound);
        layoutParams2.addRule(11, -1);
        layoutParams2.addRule(10, -1);
        layoutParams2.setMargins(iRound2, iRound2, iRound2, iRound2);
        circleCountdownView.setImage(Assets.getBitmapFromBase64(Assets.CLOSE));
        circleCountdownView.setLayoutParams(layoutParams2);
        circleCountdownView.setOnClickListener(new a());
        relativeLayout.addView(circleCountdownView);
        setContentView(relativeLayout);
    }

    @Override // android.media.MediaPlayer.OnErrorListener
    public boolean onError(MediaPlayer mediaPlayer, int i10, int i11) {
        finishActivity();
        return false;
    }
}
