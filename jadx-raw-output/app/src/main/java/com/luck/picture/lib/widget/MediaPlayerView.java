package com.luck.picture.lib.widget;

import a8.d;
import android.content.Context;
import android.media.MediaPlayer;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.io.IOException;

/* JADX INFO: loaded from: classes6.dex */
public class MediaPlayerView extends FrameLayout implements SurfaceHolder.Callback {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public MediaPlayer f32444b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public VideoSurfaceView f32445c;

    public static class VideoSurfaceView extends SurfaceView {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f32446b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f32447c;

        public VideoSurfaceView(Context context) {
            this(context, null);
        }

        public VideoSurfaceView(Context context, AttributeSet attributeSet) {
            this(context, attributeSet, 0);
        }

        public void a(int i10, int i11) {
            if (i10 == 0 || i11 == 0) {
                return;
            }
            this.f32446b = i10;
            this.f32447c = i11;
            getHolder().setFixedSize(i10, i11);
            requestLayout();
        }

        @Override // android.view.SurfaceView, android.view.View
        public void onMeasure(int i10, int i11) {
            int i12;
            int defaultSize = View.getDefaultSize(this.f32446b, i10);
            int defaultSize2 = View.getDefaultSize(this.f32447c, i11);
            if (this.f32446b > 0 && this.f32447c > 0) {
                int mode = View.MeasureSpec.getMode(i10);
                int size = View.MeasureSpec.getSize(i10);
                int mode2 = View.MeasureSpec.getMode(i11);
                int size2 = View.MeasureSpec.getSize(i11);
                if (mode == 1073741824 && mode2 == 1073741824) {
                    int i13 = this.f32446b;
                    int i14 = i13 * size2;
                    int i15 = this.f32447c;
                    if (i14 < size * i15) {
                        defaultSize = (i13 * size2) / i15;
                    } else {
                        if (i13 * size2 > size * i15) {
                            defaultSize2 = (i15 * size) / i13;
                            defaultSize = size;
                        }
                        defaultSize = size;
                    }
                    defaultSize2 = size2;
                } else if (mode == 1073741824) {
                    int i16 = (this.f32447c * size) / this.f32446b;
                    if (mode2 != Integer.MIN_VALUE || i16 <= size2) {
                        defaultSize2 = i16;
                        defaultSize = size;
                    }
                    defaultSize = size;
                    defaultSize2 = size2;
                } else {
                    if (mode2 == 1073741824) {
                        i12 = (this.f32446b * size2) / this.f32447c;
                        if (mode == Integer.MIN_VALUE && i12 > size) {
                            defaultSize = size;
                        }
                        defaultSize2 = size2;
                    } else {
                        int i17 = this.f32446b;
                        int i18 = this.f32447c;
                        if (mode2 != Integer.MIN_VALUE || i18 <= size2) {
                            i12 = i17;
                            size2 = i18;
                        } else {
                            i12 = (size2 * i17) / i18;
                        }
                        if (mode == Integer.MIN_VALUE && i12 > size) {
                            defaultSize2 = (i18 * size) / i17;
                            defaultSize = size;
                        }
                    }
                    defaultSize = i12;
                    defaultSize2 = size2;
                }
            }
            setMeasuredDimension(defaultSize, defaultSize2);
        }

        public VideoSurfaceView(Context context, AttributeSet attributeSet, int i10) {
            super(context, attributeSet, i10);
        }
    }

    public class a implements MediaPlayer.OnVideoSizeChangedListener {
        public a() {
        }

        @Override // android.media.MediaPlayer.OnVideoSizeChangedListener
        public void onVideoSizeChanged(MediaPlayer mediaPlayer, int i10, int i11) {
            MediaPlayerView.this.f32445c.a(mediaPlayer.getVideoWidth(), mediaPlayer.getVideoHeight());
        }
    }

    public MediaPlayerView(@NonNull Context context) {
        super(context);
        c();
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceChanged(@NonNull SurfaceHolder surfaceHolder, int i10, int i11, int i12) {
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceDestroyed(@NonNull SurfaceHolder surfaceHolder) {
    }

    public void b() {
        this.f32445c.getHolder().setFormat(-1);
        this.f32445c.getHolder().setFormat(-2);
    }

    public final void c() {
        this.f32445c = new VideoSurfaceView(getContext());
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        layoutParams.gravity = 17;
        this.f32445c.setLayoutParams(layoutParams);
        addView(this.f32445c);
        SurfaceHolder holder = this.f32445c.getHolder();
        holder.setFormat(-2);
        holder.addCallback(this);
    }

    public MediaPlayer d() {
        if (this.f32444b == null) {
            this.f32444b = new MediaPlayer();
        }
        this.f32444b.setOnVideoSizeChangedListener(new a());
        return this.f32444b;
    }

    public void e() {
        MediaPlayer mediaPlayer = this.f32444b;
        if (mediaPlayer != null) {
            mediaPlayer.release();
            this.f32444b.setOnPreparedListener(null);
            this.f32444b.setOnCompletionListener(null);
            this.f32444b.setOnErrorListener(null);
            this.f32444b = null;
        }
    }

    public MediaPlayer getMediaPlayer() {
        return this.f32444b;
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceCreated(@NonNull SurfaceHolder surfaceHolder) {
        this.f32444b.setAudioStreamType(3);
        this.f32444b.setDisplay(surfaceHolder);
    }

    public MediaPlayerView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        c();
    }

    public void f(String str) {
        try {
            if (d.c(str)) {
                this.f32444b.setDataSource(getContext(), Uri.parse(str));
            } else {
                this.f32444b.setDataSource(str);
            }
            this.f32444b.prepareAsync();
        } catch (IOException e10) {
            e10.printStackTrace();
        }
    }

    public MediaPlayerView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        c();
    }
}
