package master.flame.danmaku.ui.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.os.HandlerThread;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
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
import rl.a;

/* JADX INFO: loaded from: classes11.dex */
public class DanmakuSurfaceView extends SurfaceView implements f, g, SurfaceHolder.Callback {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public c.d f64341b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public SurfaceHolder f64342c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public HandlerThread f64343d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public c f64344e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f64345f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f64346g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public f.a f64347h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public float f64348i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public float f64349j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public a f64350k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f64351l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f64352m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f64353n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public LinkedList<Long> f64354o;

    public DanmakuSurfaceView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f64346g = true;
        this.f64352m = true;
        this.f64353n = 0;
        k();
    }

    public View getView() {
        return this;
    }

    @Override // jl.f
    public void hide() {
        this.f64352m = false;
        c cVar = this.f64344e;
        if (cVar == null) {
            return;
        }
        cVar.C(false);
    }

    @Override // android.view.View, jl.g
    public boolean isHardwareAccelerated() {
        return false;
    }

    public synchronized Looper j(int i10) {
        int i11;
        HandlerThread handlerThread = this.f64343d;
        if (handlerThread != null) {
            handlerThread.quit();
            this.f64343d = null;
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
        this.f64343d = handlerThread2;
        handlerThread2.start();
        return this.f64343d.getLooper();
    }

    public final void k() {
        setZOrderMediaOverlay(true);
        setWillNotCacheDrawing(true);
        setDrawingCacheEnabled(false);
        setWillNotDraw(true);
        SurfaceHolder holder = getHolder();
        this.f64342c = holder;
        holder.addCallback(this);
        this.f64342c.setFormat(-2);
        d.e(true, true);
        this.f64350k = a.j(this);
    }

    public void n(Long l10) {
        this.f64352m = true;
        c cVar = this.f64344e;
        if (cVar == null) {
            return;
        }
        cVar.U(l10);
    }

    public final synchronized void q() {
        c cVar = this.f64344e;
        if (cVar != null) {
            cVar.L();
            this.f64344e = null;
        }
        HandlerThread handlerThread = this.f64343d;
        this.f64343d = null;
        if (handlerThread != null) {
            try {
                handlerThread.join();
            } catch (InterruptedException e10) {
                e10.printStackTrace();
            }
            handlerThread.quit();
        }
    }

    @Override // jl.f
    public void show() {
        n(null);
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceCreated(SurfaceHolder surfaceHolder) {
        this.f64345f = true;
        Canvas canvasLockCanvas = surfaceHolder.lockCanvas();
        if (canvasLockCanvas != null) {
            d.a(canvasLockCanvas);
            surfaceHolder.unlockCanvasAndPost(canvasLockCanvas);
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        this.f64345f = false;
    }

    @Override // jl.f
    public void a(kl.c cVar) {
        c cVar2 = this.f64344e;
        if (cVar2 != null) {
            cVar2.u(cVar);
        }
    }

    @Override // jl.g
    public long b() {
        if (!this.f64345f) {
            return 0L;
        }
        if (!isShown()) {
            return -1L;
        }
        long jB = b.b();
        Canvas canvasLockCanvas = this.f64342c.lockCanvas();
        if (canvasLockCanvas != null) {
            c cVar = this.f64344e;
            if (cVar != null) {
                ol.a.b bVarX = cVar.x(canvasLockCanvas);
                if (this.f64351l) {
                    if (this.f64354o == null) {
                        this.f64354o = new LinkedList<>();
                    }
                    b.b();
                    d.d(canvasLockCanvas, String.format(Locale.getDefault(), "fps %.2f,time:%d s,cache:%d,miss:%d", Float.valueOf(i()), Long.valueOf(getCurrentTime() / 1000), Long.valueOf(bVarX.f65420r), Long.valueOf(bVarX.f65421s)));
                }
            }
            if (this.f64345f) {
                this.f64342c.unlockCanvasAndPost(canvasLockCanvas);
            }
        }
        return b.b() - jB;
    }

    @Override // jl.f
    public boolean c() {
        c cVar = this.f64344e;
        return cVar != null && cVar.E();
    }

    @Override // jl.g
    public boolean d() {
        return this.f64345f;
    }

    @Override // jl.g
    public boolean e() {
        return this.f64346g;
    }

    @Override // jl.f
    public void f(Long l10) {
        c cVar = this.f64344e;
        if (cVar != null) {
            cVar.Q(l10);
        }
    }

    public DanmakuContext getConfig() {
        c cVar = this.f64344e;
        if (cVar == null) {
            return null;
        }
        return cVar.z();
    }

    public long getCurrentTime() {
        c cVar = this.f64344e;
        if (cVar != null) {
            return cVar.A();
        }
        return 0L;
    }

    @Override // jl.f
    public k getCurrentVisibleDanmakus() {
        c cVar = this.f64344e;
        if (cVar != null) {
            return cVar.B();
        }
        return null;
    }

    @Override // jl.f
    public f.a getOnDanmakuClickListener() {
        return this.f64347h;
    }

    @Override // jl.f
    public float getXOff() {
        return this.f64348i;
    }

    @Override // jl.f
    public float getYOff() {
        return this.f64349j;
    }

    @Override // jl.f
    public void h(boolean z10) {
        this.f64346g = z10;
    }

    @Override // jl.f
    public boolean isPaused() {
        c cVar = this.f64344e;
        if (cVar != null) {
            return cVar.F();
        }
        return false;
    }

    @Override // android.view.View
    public boolean isShown() {
        return this.f64352m && super.isShown();
    }

    public final void l() {
        if (this.f64344e == null) {
            this.f64344e = new c(j(this.f64353n), this, this.f64352m);
        }
    }

    public void o(long j10) {
        c cVar = this.f64344e;
        if (cVar == null) {
            l();
        } else {
            cVar.removeCallbacksAndMessages(null);
        }
        this.f64344e.obtainMessage(1, Long.valueOf(j10)).sendToTarget();
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean zK = this.f64350k.k(motionEvent);
        return !zK ? super.onTouchEvent(motionEvent) : zK;
    }

    @Override // jl.f
    public void pause() {
        c cVar = this.f64344e;
        if (cVar != null) {
            cVar.I();
        }
    }

    @Override // jl.f
    public void resume() {
        c cVar = this.f64344e;
        if (cVar != null && cVar.E()) {
            this.f64344e.P();
        } else if (this.f64344e == null) {
            m();
        }
    }

    @Override // jl.f
    public void setCallback(c.d dVar) {
        this.f64341b = dVar;
        c cVar = this.f64344e;
        if (cVar != null) {
            cVar.R(dVar);
        }
    }

    public void setDrawingThreadType(int i10) {
        this.f64353n = i10;
    }

    public void setOnDanmakuClickListener(f.a aVar) {
        this.f64347h = aVar;
    }

    @Override // jl.f
    public void start() {
        o(0L);
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceChanged(SurfaceHolder surfaceHolder, int i10, int i11, int i12) {
        c cVar = this.f64344e;
        if (cVar != null) {
            cVar.G(i11, i12);
        }
    }

    @Override // jl.f
    public void toggle() {
        if (this.f64345f) {
            c cVar = this.f64344e;
            if (cVar == null) {
                start();
            } else if (cVar.F()) {
                resume();
            } else {
                pause();
            }
        }
    }

    @Override // jl.g
    public void clear() {
        Canvas canvasLockCanvas;
        if (d() && (canvasLockCanvas = this.f64342c.lockCanvas()) != null) {
            d.a(canvasLockCanvas);
            this.f64342c.unlockCanvasAndPost(canvasLockCanvas);
        }
    }

    @Override // jl.f
    public void g(nl.a aVar, DanmakuContext danmakuContext) {
        l();
        this.f64344e.S(danmakuContext);
        this.f64344e.T(aVar);
        this.f64344e.R(this.f64341b);
        this.f64344e.J();
    }

    @Override // jl.g
    public int getViewHeight() {
        return super.getHeight();
    }

    @Override // jl.g
    public int getViewWidth() {
        return super.getWidth();
    }

    public final float i() {
        long jB = b.b();
        this.f64354o.addLast(Long.valueOf(jB));
        Long lPeekFirst = this.f64354o.peekFirst();
        if (lPeekFirst == null) {
            return 0.0f;
        }
        float fLongValue = jB - lPeekFirst.longValue();
        if (this.f64354o.size() > 50) {
            this.f64354o.removeFirst();
        }
        if (fLongValue <= 0.0f) {
            return 0.0f;
        }
        return (this.f64354o.size() * 1000) / fLongValue;
    }

    public void m() {
        p();
        start();
    }

    public void p() {
        q();
    }

    @Override // jl.f
    public void release() {
        p();
        LinkedList<Long> linkedList = this.f64354o;
        if (linkedList != null) {
            linkedList.clear();
        }
    }

    public DanmakuSurfaceView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f64346g = true;
        this.f64352m = true;
        this.f64353n = 0;
        k();
    }
}
