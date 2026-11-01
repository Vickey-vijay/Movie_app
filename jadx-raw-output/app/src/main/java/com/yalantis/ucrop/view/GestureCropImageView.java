package com.yalantis.ucrop.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import kd.h;

/* JADX INFO: loaded from: classes2.dex */
public class GestureCropImageView extends CropImageView {
    public ScaleGestureDetector E;
    public h F;
    public GestureDetector G;
    public float H;
    public float I;
    public boolean J;
    public boolean K;
    public boolean L;
    public int M;

    public class b extends GestureDetector.SimpleOnGestureListener {
        public b() {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
        public boolean onDoubleTap(MotionEvent motionEvent) {
            GestureCropImageView gestureCropImageView = GestureCropImageView.this;
            gestureCropImageView.A(gestureCropImageView.getDoubleTapTargetScale(), motionEvent.getX(), motionEvent.getY(), 200L);
            return super.onDoubleTap(motionEvent);
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
            GestureCropImageView.this.i(-f10, -f11);
            return true;
        }
    }

    public class c extends h.b {
        public c() {
        }

        @Override // kd.h.a
        public boolean a(h hVar) {
            GestureCropImageView.this.g(hVar.c(), GestureCropImageView.this.H, GestureCropImageView.this.I);
            return true;
        }
    }

    public class d extends ScaleGestureDetector.SimpleOnScaleGestureListener {
        public d() {
        }

        @Override // android.view.ScaleGestureDetector.SimpleOnScaleGestureListener, android.view.ScaleGestureDetector.OnScaleGestureListener
        public boolean onScale(ScaleGestureDetector scaleGestureDetector) {
            GestureCropImageView.this.h(scaleGestureDetector.getScaleFactor(), GestureCropImageView.this.H, GestureCropImageView.this.I);
            return true;
        }
    }

    public GestureCropImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public GestureCropImageView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.J = true;
        this.K = true;
        this.L = true;
        this.M = 5;
    }

    public final void H() {
        this.G = new GestureDetector(getContext(), new b(), null, true);
        this.E = new ScaleGestureDetector(getContext(), new d());
        this.F = new h(new c());
    }

    public int getDoubleTapScaleSteps() {
        return this.M;
    }

    public void setDoubleTapScaleSteps(int i10) {
        this.M = i10;
    }

    public void setGestureEnabled(boolean z10) {
        this.L = z10;
    }

    public void setRotateEnabled(boolean z10) {
        this.J = z10;
    }

    public void setScaleEnabled(boolean z10) {
        this.K = z10;
    }

    @Override // com.yalantis.ucrop.view.TransformImageView
    public void e() {
        super.e();
        H();
    }

    public float getDoubleTapTargetScale() {
        return getCurrentScale() * ((float) Math.pow(getMaxScale() / getMinScale(), 1.0f / this.M));
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if ((motionEvent.getAction() & 255) == 0) {
            s();
        }
        if (motionEvent.getPointerCount() > 1) {
            this.H = (motionEvent.getX(0) + motionEvent.getX(1)) / 2.0f;
            this.I = (motionEvent.getY(0) + motionEvent.getY(1)) / 2.0f;
        }
        if (this.L) {
            this.G.onTouchEvent(motionEvent);
        }
        if (this.K) {
            this.E.onTouchEvent(motionEvent);
        }
        if (this.J) {
            this.F.d(motionEvent);
        }
        if ((motionEvent.getAction() & 255) == 1) {
            y();
        }
        return true;
    }
}
