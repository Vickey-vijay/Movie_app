package com.google.android.exoplayer2.video;

import android.content.Context;
import android.opengl.GLSurfaceView;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.annotation.Nullable;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import h5.e;
import h5.f;

/* JADX INFO: loaded from: classes11.dex */
public class VideoDecoderGLSurfaceView extends GLSurfaceView {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f f20221b;

    @Override // android.view.View
    public boolean dispatchTouchEvent(MotionEvent me2) {
        DetectTouchUtils.viewOnTouch("com.google.android.exoplayer", this, me2);
        return super.dispatchTouchEvent(me2);
    }

    @Override // android.view.SurfaceView, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        }
    }

    public e getVideoDecoderOutputBufferRenderer() {
        return this.f20221b;
    }

    public VideoDecoderGLSurfaceView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        f fVar = new f(this);
        this.f20221b = fVar;
        setPreserveEGLContextOnPause(true);
        setEGLContextClientVersion(2);
        setRenderer(fVar);
        setRenderMode(0);
    }
}
