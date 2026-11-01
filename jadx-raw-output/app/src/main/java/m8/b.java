package m8;

import android.content.Context;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;

/* JADX INFO: compiled from: CustomGestureDetector.java */
/* JADX INFO: loaded from: classes.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f64251a = -1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f64252b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ScaleGestureDetector f64253c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public VelocityTracker f64254d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f64255e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f64256f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f64257g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final float f64258h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final float f64259i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public c f64260j;

    /* JADX INFO: compiled from: CustomGestureDetector.java */
    public class a implements ScaleGestureDetector.OnScaleGestureListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public float f64261a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public float f64262b = 0.0f;

        @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
        public void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
        }

        public a() {
        }

        @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
        public boolean onScale(ScaleGestureDetector scaleGestureDetector) {
            float scaleFactor = scaleGestureDetector.getScaleFactor();
            if (!Float.isNaN(scaleFactor) && !Float.isInfinite(scaleFactor)) {
                if (scaleFactor >= 0.0f) {
                    b.this.f64260j.b(scaleFactor, scaleGestureDetector.getFocusX(), scaleGestureDetector.getFocusY(), scaleGestureDetector.getFocusX() - this.f64261a, scaleGestureDetector.getFocusY() - this.f64262b);
                    this.f64261a = scaleGestureDetector.getFocusX();
                    this.f64262b = scaleGestureDetector.getFocusY();
                    return true;
                }
                return true;
            }
            return false;
        }

        @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
        public boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
            this.f64261a = scaleGestureDetector.getFocusX();
            this.f64262b = scaleGestureDetector.getFocusY();
            return true;
        }
    }

    public final float b(MotionEvent motionEvent) {
        try {
            return motionEvent.getX(this.f64252b);
        } catch (Exception unused) {
            return motionEvent.getX();
        }
    }

    public final float c(MotionEvent motionEvent) {
        try {
            return motionEvent.getY(this.f64252b);
        } catch (Exception unused) {
            return motionEvent.getY();
        }
    }

    public boolean d() {
        return this.f64255e;
    }

    public boolean e() {
        return this.f64253c.isInProgress();
    }

    public boolean f(MotionEvent motionEvent) {
        try {
            this.f64253c.onTouchEvent(motionEvent);
            return g(motionEvent);
        } catch (IllegalArgumentException unused) {
            return true;
        }
    }

    public b(Context context, c cVar) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f64259i = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f64258h = viewConfiguration.getScaledTouchSlop();
        this.f64260j = cVar;
        this.f64253c = new ScaleGestureDetector(context, new a());
    }

    public final boolean g(MotionEvent motionEvent) {
        boolean z10;
        int i10;
        int action = motionEvent.getAction() & 255;
        int i11 = 0;
        if (action != 0) {
            if (action != 1) {
                if (action != 2) {
                    if (action != 3) {
                        if (action == 6) {
                            int iB = l.b(motionEvent.getAction());
                            if (motionEvent.getPointerId(iB) == this.f64251a) {
                                if (iB == 0) {
                                    i10 = 1;
                                } else {
                                    i10 = 0;
                                }
                                this.f64251a = motionEvent.getPointerId(i10);
                                this.f64256f = motionEvent.getX(i10);
                                this.f64257g = motionEvent.getY(i10);
                            }
                        }
                    } else {
                        this.f64251a = -1;
                        VelocityTracker velocityTracker = this.f64254d;
                        if (velocityTracker != null) {
                            velocityTracker.recycle();
                            this.f64254d = null;
                        }
                    }
                } else {
                    float fB = b(motionEvent);
                    float fC = c(motionEvent);
                    float f10 = fB - this.f64256f;
                    float f11 = fC - this.f64257g;
                    if (!this.f64255e) {
                        if (Math.sqrt((f10 * f10) + (f11 * f11)) >= this.f64258h) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        this.f64255e = z10;
                    }
                    if (this.f64255e) {
                        this.f64260j.a(f10, f11);
                        this.f64256f = fB;
                        this.f64257g = fC;
                        VelocityTracker velocityTracker2 = this.f64254d;
                        if (velocityTracker2 != null) {
                            velocityTracker2.addMovement(motionEvent);
                        }
                    }
                }
            } else {
                this.f64251a = -1;
                if (this.f64255e && this.f64254d != null) {
                    this.f64256f = b(motionEvent);
                    this.f64257g = c(motionEvent);
                    this.f64254d.addMovement(motionEvent);
                    this.f64254d.computeCurrentVelocity(1000);
                    float xVelocity = this.f64254d.getXVelocity();
                    float yVelocity = this.f64254d.getYVelocity();
                    if (Math.max(Math.abs(xVelocity), Math.abs(yVelocity)) >= this.f64259i) {
                        this.f64260j.c(this.f64256f, this.f64257g, -xVelocity, -yVelocity);
                    }
                }
                VelocityTracker velocityTracker3 = this.f64254d;
                if (velocityTracker3 != null) {
                    velocityTracker3.recycle();
                    this.f64254d = null;
                }
            }
        } else {
            this.f64251a = motionEvent.getPointerId(0);
            VelocityTracker velocityTrackerObtain = VelocityTracker.obtain();
            this.f64254d = velocityTrackerObtain;
            if (velocityTrackerObtain != null) {
                velocityTrackerObtain.addMovement(motionEvent);
            }
            this.f64256f = b(motionEvent);
            this.f64257g = c(motionEvent);
            this.f64255e = false;
        }
        int i12 = this.f64251a;
        if (i12 != -1) {
            i11 = i12;
        }
        this.f64252b = motionEvent.findPointerIndex(i11);
        return true;
    }
}
