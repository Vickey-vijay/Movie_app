package master.flame.danmaku.ui.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.os.HandlerThread;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import java.util.LinkedList;
import java.util.Locale;
import jl.c;
import jl.d;
import jl.f;
import jl.g;
import kl.k;
import master.flame.danmaku.danmaku.model.android.DanmakuContext;
import ql.b;

/* JADX INFO: loaded from: classes8.dex */
public class DanmakuView extends View implements f, g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public c.d f64368b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public HandlerThread f64369c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public volatile c f64370d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f64371e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f64372f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public f.a f64373g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f64374h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public float f64375i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public rl.a f64376j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f64377k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f64378l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f64379m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public Object f64380n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f64381o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f64382p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public long f64383q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public LinkedList<Long> f64384r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f64385s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f64386t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public Runnable f64387u;

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            c cVar = DanmakuView.this.f64370d;
            if (cVar == null) {
                return;
            }
            DanmakuView.j(DanmakuView.this);
            if (DanmakuView.this.f64386t > 4 || DanmakuView.super.isShown()) {
                cVar.P();
            } else {
                cVar.postDelayed(this, DanmakuView.this.f64386t * 100);
            }
        }
    }

    public DanmakuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f64372f = true;
        this.f64378l = true;
        this.f64379m = 0;
        this.f64380n = new Object();
        this.f64381o = false;
        this.f64382p = false;
        this.f64386t = 0;
        this.f64387u = new a();
        n();
    }

    public View getView() {
        return this;
    }

    @Override // jl.f
    public void hide() {
        this.f64378l = false;
        if (this.f64370d == null) {
            return;
        }
        this.f64370d.C(false);
    }

    public synchronized Looper m(int i10) {
        int i11;
        HandlerThread handlerThread = this.f64369c;
        if (handlerThread != null) {
            handlerThread.quit();
            this.f64369c = null;
        }
        if (i10 == 1) {
            return Looper.getMainLooper();
        }
        if (i10 != 2) {
            i11 = i10 != 3 ? 0 : 19;
        } else {
            i11 = -8;
        }
        HandlerThread handlerThread2 = new HandlerThread("DFM Handler Thread #" + i11, i11);
        this.f64369c = handlerThread2;
        handlerThread2.start();
        return this.f64369c.getLooper();
    }

    public final void p() {
        this.f64385s = true;
        o();
    }

    @SuppressLint({"NewApi"})
    public final void q() {
        this.f64382p = true;
        postInvalidateOnAnimation();
    }

    @Override // jl.f
    public void show() {
        t(null);
    }

    public void t(Long l10) {
        this.f64378l = true;
        this.f64385s = false;
        if (this.f64370d == null) {
            return;
        }
        this.f64370d.U(l10);
    }

    public final synchronized void w() {
        if (this.f64370d == null) {
            return;
        }
        c cVar = this.f64370d;
        this.f64370d = null;
        x();
        if (cVar != null) {
            cVar.L();
        }
        HandlerThread handlerThread = this.f64369c;
        this.f64369c = null;
        if (handlerThread != null) {
            try {
                handlerThread.join();
            } catch (InterruptedException e10) {
                e10.printStackTrace();
            }
            handlerThread.quit();
        }
    }

    public static /* synthetic */ int j(DanmakuView danmakuView) {
        int i10 = danmakuView.f64386t;
        danmakuView.f64386t = i10 + 1;
        return i10;
    }

    @Override // jl.f
    public void a(kl.c cVar) {
        if (this.f64370d != null) {
            this.f64370d.u(cVar);
        }
    }

    @Override // jl.g
    public long b() {
        if (!this.f64371e) {
            return 0L;
        }
        if (!isShown()) {
            return -1L;
        }
        long jB = b.b();
        o();
        return b.b() - jB;
    }

    @Override // jl.f
    public boolean c() {
        return this.f64370d != null && this.f64370d.E();
    }

    @Override // jl.g
    public boolean d() {
        return this.f64371e;
    }

    @Override // jl.g
    public boolean e() {
        return this.f64372f;
    }

    @Override // jl.f
    public void f(Long l10) {
        if (this.f64370d != null) {
            this.f64370d.Q(l10);
        }
    }

    public DanmakuContext getConfig() {
        if (this.f64370d == null) {
            return null;
        }
        return this.f64370d.z();
    }

    public long getCurrentTime() {
        if (this.f64370d != null) {
            return this.f64370d.A();
        }
        return 0L;
    }

    @Override // jl.f
    public k getCurrentVisibleDanmakus() {
        if (this.f64370d != null) {
            return this.f64370d.B();
        }
        return null;
    }

    @Override // jl.f
    public f.a getOnDanmakuClickListener() {
        return this.f64373g;
    }

    @Override // jl.f
    public float getXOff() {
        return this.f64374h;
    }

    @Override // jl.f
    public float getYOff() {
        return this.f64375i;
    }

    @Override // jl.f
    public void h(boolean z10) {
        this.f64372f = z10;
    }

    @Override // jl.f
    public boolean isPaused() {
        if (this.f64370d != null) {
            return this.f64370d.F();
        }
        return false;
    }

    @Override // android.view.View
    public boolean isShown() {
        return this.f64378l && super.isShown();
    }

    public void o() {
        if (this.f64378l) {
            q();
            synchronized (this.f64380n) {
                while (!this.f64381o && this.f64370d != null) {
                    try {
                        this.f64380n.wait(200L);
                    } catch (InterruptedException unused) {
                        if (!this.f64378l || this.f64370d == null || this.f64370d.F()) {
                            break;
                            break;
                            break;
                        }
                        Thread.currentThread().interrupt();
                        this.f64381o = false;
                    }
                }
                this.f64381o = false;
            }
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        if (!this.f64378l && !this.f64382p) {
            super.onDraw(canvas);
            return;
        }
        if (this.f64385s) {
            d.a(canvas);
            this.f64385s = false;
        } else if (this.f64370d != null) {
            ol.a.b bVarX = this.f64370d.x(canvas);
            if (this.f64377k) {
                if (this.f64384r == null) {
                    this.f64384r = new LinkedList<>();
                }
                d.d(canvas, String.format(Locale.getDefault(), "fps %.2f,time:%d s,cache:%d,miss:%d", Float.valueOf(l()), Long.valueOf(getCurrentTime() / 1000), Long.valueOf(bVarX.f65420r), Long.valueOf(bVarX.f65421s)));
            }
        }
        this.f64382p = false;
        x();
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean zK = this.f64376j.k(motionEvent);
        return !zK ? super.onTouchEvent(motionEvent) : zK;
    }

    @Override // jl.f
    public void pause() {
        if (this.f64370d != null) {
            this.f64370d.removeCallbacks(this.f64387u);
            this.f64370d.I();
        }
    }

    public final void r() {
        if (this.f64370d == null) {
            this.f64370d = new c(m(this.f64379m), this, this.f64378l);
        }
    }

    @Override // jl.f
    public void resume() {
        if (this.f64370d != null && this.f64370d.E()) {
            this.f64386t = 0;
            this.f64370d.post(this.f64387u);
        } else if (this.f64370d == null) {
            s();
        }
    }

    @Override // jl.f
    public void setCallback(c.d dVar) {
        this.f64368b = dVar;
        if (this.f64370d != null) {
            this.f64370d.R(dVar);
        }
    }

    public void setDrawingThreadType(int i10) {
        this.f64379m = i10;
    }

    public void setOnDanmakuClickListener(f.a aVar) {
        this.f64373g = aVar;
    }

    @Override // jl.f
    public void start() {
        u(0L);
    }

    @Override // jl.f
    public void toggle() {
        if (this.f64371e) {
            if (this.f64370d == null) {
                start();
            } else if (this.f64370d.F()) {
                resume();
            } else {
                pause();
            }
        }
    }

    public void u(long j10) {
        c cVar = this.f64370d;
        if (cVar == null) {
            r();
            cVar = this.f64370d;
        } else {
            cVar.removeCallbacksAndMessages(null);
        }
        if (cVar != null) {
            cVar.obtainMessage(1, Long.valueOf(j10)).sendToTarget();
        }
    }

    public final void x() {
        synchronized (this.f64380n) {
            this.f64381o = true;
            this.f64380n.notifyAll();
        }
    }

    @Override // jl.g
    public void clear() {
        if (!d()) {
            return;
        }
        if (this.f64378l && Thread.currentThread().getId() != this.f64383q) {
            p();
        } else {
            this.f64385s = true;
            q();
        }
    }

    @Override // jl.f
    public void g(nl.a aVar, DanmakuContext danmakuContext) {
        r();
        this.f64370d.S(danmakuContext);
        this.f64370d.T(aVar);
        this.f64370d.R(this.f64368b);
        this.f64370d.J();
    }

    @Override // jl.g
    public int getViewHeight() {
        return super.getHeight();
    }

    @Override // jl.g
    public int getViewWidth() {
        return super.getWidth();
    }

    @Override // android.view.View, jl.g
    @SuppressLint({"NewApi"})
    public boolean isHardwareAccelerated() {
        return super.isHardwareAccelerated();
    }

    public final float l() {
        long jB = b.b();
        this.f64384r.addLast(Long.valueOf(jB));
        Long lPeekFirst = this.f64384r.peekFirst();
        if (lPeekFirst == null) {
            return 0.0f;
        }
        float fLongValue = jB - lPeekFirst.longValue();
        if (this.f64384r.size() > 50) {
            this.f64384r.removeFirst();
        }
        if (fLongValue <= 0.0f) {
            return 0.0f;
        }
        return (this.f64384r.size() * 1000) / fLongValue;
    }

    public final void n() {
        this.f64383q = Thread.currentThread().getId();
        setBackgroundColor(0);
        setDrawingCacheBackgroundColor(0);
        d.e(true, false);
        this.f64376j = rl.a.j(this);
    }

    @Override // android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        if (this.f64370d != null) {
            this.f64370d.G(i12 - i10, i13 - i11);
        }
        this.f64371e = true;
    }

    @Override // jl.f
    public void release() {
        v();
        LinkedList<Long> linkedList = this.f64384r;
        if (linkedList != null) {
            linkedList.clear();
        }
    }

    public void s() {
        v();
        start();
    }

    public void v() {
        w();
    }

    public DanmakuView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f64372f = true;
        this.f64378l = true;
        this.f64379m = 0;
        this.f64380n = new Object();
        this.f64381o = false;
        this.f64382p = false;
        this.f64386t = 0;
        this.f64387u = new a();
        n();
    }
}
