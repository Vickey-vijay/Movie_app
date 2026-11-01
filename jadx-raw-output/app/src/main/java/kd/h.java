package kd;

import android.view.MotionEvent;
import androidx.annotation.NonNull;

/* JADX INFO: compiled from: RotationGestureDetector.java */
/* JADX INFO: loaded from: classes8.dex */
public class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f62769a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f62770b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f62771c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f62772d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f62773e = -1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f62774f = -1;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f62775g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f62776h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public a f62777i;

    /* JADX INFO: compiled from: RotationGestureDetector.java */
    public interface a {
        boolean a(h hVar);
    }

    /* JADX INFO: compiled from: RotationGestureDetector.java */
    public static class b implements a {
    }

    public final float a(float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17) {
        return b((float) Math.toDegrees((float) Math.atan2(f11 - f13, f10 - f12)), (float) Math.toDegrees((float) Math.atan2(f15 - f17, f14 - f16)));
    }

    public boolean d(@NonNull MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f62771c = motionEvent.getX();
            this.f62772d = motionEvent.getY();
            this.f62773e = motionEvent.findPointerIndex(motionEvent.getPointerId(0));
            this.f62775g = 0.0f;
            this.f62776h = true;
        } else if (actionMasked == 1) {
            this.f62773e = -1;
        } else if (actionMasked != 2) {
            if (actionMasked == 5) {
                this.f62769a = motionEvent.getX();
                this.f62770b = motionEvent.getY();
                this.f62774f = motionEvent.findPointerIndex(motionEvent.getPointerId(motionEvent.getActionIndex()));
                this.f62775g = 0.0f;
                this.f62776h = true;
            } else if (actionMasked == 6) {
                this.f62774f = -1;
            }
        } else if (this.f62773e != -1 && this.f62774f != -1 && motionEvent.getPointerCount() > this.f62774f) {
            float x10 = motionEvent.getX(this.f62773e);
            float y10 = motionEvent.getY(this.f62773e);
            float x11 = motionEvent.getX(this.f62774f);
            float y11 = motionEvent.getY(this.f62774f);
            if (this.f62776h) {
                this.f62775g = 0.0f;
                this.f62776h = false;
            } else {
                a(this.f62769a, this.f62770b, this.f62771c, this.f62772d, x11, y11, x10, y10);
            }
            a aVar = this.f62777i;
            if (aVar != null) {
                aVar.a(this);
            }
            this.f62769a = x11;
            this.f62770b = y11;
            this.f62771c = x10;
            this.f62772d = y10;
        }
        return true;
    }

    public final float b(float f10, float f11) {
        float f12 = (f11 % 360.0f) - (f10 % 360.0f);
        this.f62775g = f12;
        if (f12 < -180.0f) {
            this.f62775g = f12 + 360.0f;
        } else if (f12 > 180.0f) {
            this.f62775g = f12 - 360.0f;
        }
        return this.f62775g;
    }

    public float c() {
        return this.f62775g;
    }

    public h(a aVar) {
        this.f62777i = aVar;
    }
}
