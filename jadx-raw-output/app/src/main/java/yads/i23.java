package yads;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.opengl.GLSurfaceView;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.Surface;
import android.view.View;
import android.view.WindowManager;
import androidx.annotation.Nullable;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes11.dex */
public final class i23 extends GLSurfaceView {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CopyOnWriteArrayList f78464a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SensorManager f78465b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Sensor f78466c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final wa2 f78467d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Handler f78468e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ps2 f78469f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public SurfaceTexture f78470g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Surface f78471h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f78472i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f78473j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f78474k;

    public final void a() {
        Surface surface = this.f78471h;
        if (surface != null) {
            Iterator it = this.f78464a.iterator();
            while (it.hasNext()) {
                ((wn0) ((h23) it.next())).f84275a.a((Surface) null);
            }
        }
        SurfaceTexture surfaceTexture = this.f78470g;
        if (surfaceTexture != null) {
            surfaceTexture.release();
        }
        if (surface != null) {
            surface.release();
        }
        this.f78470g = null;
        this.f78471h = null;
    }

    public final void b(final SurfaceTexture surfaceTexture) {
        this.f78468e.post(new Runnable() { // from class: cp.p2
            @Override // java.lang.Runnable
            public final void run() {
                this.f51503b.a(surfaceTexture);
            }
        });
    }

    @Override // android.opengl.GLSurfaceView
    public final void onPause() {
        this.f78473j = false;
        b();
        super.onPause();
    }

    public final void b() {
        boolean z10 = this.f78472i && this.f78473j;
        Sensor sensor = this.f78466c;
        if (sensor == null || z10 == this.f78474k) {
            return;
        }
        if (z10) {
            this.f78465b.registerListener(this.f78467d, sensor, 0);
        } else {
            this.f78465b.unregisterListener(this.f78467d);
        }
        this.f78474k = z10;
    }

    public void setDefaultStereoMode(int i10) {
        this.f78469f.f81579l = i10;
    }

    public void setUseSensorRotation(boolean z10) {
        this.f78472i = z10;
        b();
    }

    public i23(Context context, @Nullable AttributeSet attributeSet) {
        Sensor defaultSensor;
        super(context, attributeSet);
        this.f78464a = new CopyOnWriteArrayList();
        this.f78468e = new Handler(Looper.getMainLooper());
        SensorManager sensorManager = (SensorManager) ni.a(context.getSystemService("sensor"));
        this.f78465b = sensorManager;
        if (ib3.f78556a >= 18) {
            defaultSensor = sensorManager.getDefaultSensor(15);
        } else {
            defaultSensor = null;
        }
        this.f78466c = defaultSensor == null ? sensorManager.getDefaultSensor(11) : defaultSensor;
        ps2 ps2Var = new ps2();
        this.f78469f = ps2Var;
        g23 g23Var = new g23(this, ps2Var);
        View.OnTouchListener c73Var = new c73(context, g23Var);
        this.f78467d = new wa2(((WindowManager) ni.a((WindowManager) context.getSystemService("window"))).getDefaultDisplay(), c73Var, g23Var);
        this.f78472i = true;
        setEGLContextClientVersion(2);
        setRenderer(g23Var);
        setOnTouchListener(c73Var);
    }

    @Override // android.opengl.GLSurfaceView, android.view.SurfaceView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f78468e.post(new Runnable() { // from class: cp.o2
            @Override // java.lang.Runnable
            public final void run() {
                this.f51486b.a();
            }
        });
    }

    @Override // android.opengl.GLSurfaceView
    public final void onResume() {
        super.onResume();
        this.f78473j = true;
        b();
    }

    public final void a(SurfaceTexture surfaceTexture) {
        SurfaceTexture surfaceTexture2 = this.f78470g;
        Surface surface = this.f78471h;
        Surface surface2 = new Surface(surfaceTexture);
        this.f78470g = surfaceTexture;
        this.f78471h = surface2;
        Iterator it = this.f78464a.iterator();
        while (it.hasNext()) {
            ((wn0) ((h23) it.next())).f84275a.a(surface2);
        }
        if (surfaceTexture2 != null) {
            surfaceTexture2.release();
        }
        if (surface != null) {
            surface.release();
        }
    }
}
