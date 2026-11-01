package com.google.android.exoplayer2.render;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import java.lang.ref.WeakReference;
import k3.u0;

/* JADX INFO: loaded from: classes4.dex */
public class RenderSurfaceView extends SurfaceView implements com.google.android.exoplayer2.render.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f19416b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public com.google.android.exoplayer2.render.a.InterfaceC0179a f19417c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public i4.a f19418d;

    public static final class b implements com.google.android.exoplayer2.render.a.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public WeakReference<SurfaceHolder> f19419a;

        @Override // com.google.android.exoplayer2.render.a.b
        public void a(u0 u0Var) {
            if (u0Var == null || this.f19419a.get() == null) {
                return;
            }
            u0Var.a0(this.f19419a.get());
        }

        public b(SurfaceHolder surfaceHolder) {
            this.f19419a = new WeakReference<>(surfaceHolder);
        }
    }

    public class c implements SurfaceHolder.Callback {
        public c() {
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceChanged(SurfaceHolder surfaceHolder, int i10, int i11, int i12) {
            Log.d("RenderSurfaceView", "surfaceChanged : width = " + i11 + " height = " + i12);
            if (RenderSurfaceView.this.f19417c != null) {
                RenderSurfaceView.this.f19417c.b(new b(surfaceHolder), i10, i11, i12);
            }
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceCreated(SurfaceHolder surfaceHolder) {
            Log.d("RenderSurfaceView", "<---surfaceCreated---->");
            if (RenderSurfaceView.this.f19417c != null) {
                RenderSurfaceView.this.f19417c.a(new b(surfaceHolder), 0, 0);
            }
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
            Log.d("RenderSurfaceView", "***surfaceDestroyed***");
            if (RenderSurfaceView.this.f19417c != null) {
                RenderSurfaceView.this.f19417c.c(new b(surfaceHolder));
            }
        }
    }

    public RenderSurfaceView(Context context) {
        this(context, null);
    }

    @Override // com.google.android.exoplayer2.render.a
    public void d(int i10) {
    }

    @Override // android.view.View
    public boolean dispatchTouchEvent(MotionEvent me2) {
        DetectTouchUtils.viewOnTouch("com.google.android.exoplayer", this, me2);
        return super.dispatchTouchEvent(me2);
    }

    @Override // com.google.android.exoplayer2.render.a
    public View getRenderView() {
        return this;
    }

    public RenderSurfaceView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f19416b = "RenderSurfaceView";
        this.f19418d = new i4.a();
        getHolder().addCallback(new c());
        a(480, 270);
    }

    @Override // com.google.android.exoplayer2.render.a
    public void a(int i10, int i11) {
        this.f19418d.j(i10, i11);
        f(i10, i11);
        requestLayout();
    }

    @Override // com.google.android.exoplayer2.render.a
    public void b(int i10, int i11) {
        if (i10 <= 0 || i11 <= 0) {
            return;
        }
        this.f19418d.i(i10, i11);
        requestLayout();
    }

    @Override // com.google.android.exoplayer2.render.a
    public void c(int i10) {
        this.f19418d.f(i10);
        requestLayout();
    }

    public void f(int i10, int i11) {
        if (i10 == 0 || i11 == 0) {
            return;
        }
        getHolder().setFixedSize(i10, i11);
    }

    @Override // com.google.android.exoplayer2.render.a
    public int getResizeMode() {
        return this.f19418d.e();
    }

    @Override // com.google.android.exoplayer2.render.a
    public void setPixelWidthHeightRatio(float f10) {
        this.f19418d.g(f10);
    }

    @Override // com.google.android.exoplayer2.render.a
    public void setRenderCallback(com.google.android.exoplayer2.render.a.InterfaceC0179a interfaceC0179a) {
        this.f19417c = interfaceC0179a;
    }

    public void setVideoRotation(int i10) {
        Log.e("RenderSurfaceView", "surface view not support rotation ... ");
    }

    @Override // android.view.SurfaceView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Log.d("RenderSurfaceView", "onSurfaceViewAttachedToWindow");
    }

    @Override // android.view.SurfaceView, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Log.d("RenderSurfaceView", "onSurfaceViewDetachedFromWindow");
    }

    @Override // android.view.SurfaceView, android.view.View
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        this.f19418d.a(i10, i11);
        setMeasuredDimension(this.f19418d.d(), this.f19418d.c());
    }
}
