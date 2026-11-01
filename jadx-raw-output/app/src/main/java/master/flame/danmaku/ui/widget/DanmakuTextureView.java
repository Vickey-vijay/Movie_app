package master.flame.danmaku.ui.widget;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.SurfaceTexture;
import android.os.HandlerThread;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.TextureView;
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

/* JADX INFO: loaded from: classes2.dex */
@SuppressLint({"NewApi"})
public class DanmakuTextureView extends TextureView implements f, g, TextureView.SurfaceTextureListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public c.d f64355b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public HandlerThread f64356c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public c f64357d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f64358e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f64359f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public f.a f64360g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f64361h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public float f64362i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public a f64363j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f64364k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f64365l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f64366m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public LinkedList<Long> f64367n;

    public DanmakuTextureView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f64359f = true;
        this.f64365l = true;
        this.f64366m = 0;
        k();
    }

    @Override // jl.g
    public synchronized long b() {
        if (!this.f64358e) {
            return 0L;
        }
        long jB = b.b();
        if (!isShown()) {
            return -1L;
        }
        Canvas canvasLockCanvas = lockCanvas();
        if (canvasLockCanvas != null) {
            c cVar = this.f64357d;
            if (cVar != null) {
                ol.a.b bVarX = cVar.x(canvasLockCanvas);
                if (this.f64364k) {
                    if (this.f64367n == null) {
                        this.f64367n = new LinkedList<>();
                    }
                    b.b();
                    d.d(canvasLockCanvas, String.format(Locale.getDefault(), "fps %.2f,time:%d s,cache:%d,miss:%d", Float.valueOf(i()), Long.valueOf(getCurrentTime() / 1000), Long.valueOf(bVarX.f65420r), Long.valueOf(bVarX.f65421s)));
                }
            }
            if (this.f64358e) {
                unlockCanvasAndPost(canvasLockCanvas);
            }
        }
        return b.b() - jB;
    }

    @Override // jl.g
    public synchronized void clear() {
        if (d()) {
            Canvas canvasLockCanvas = lockCanvas();
            if (canvasLockCanvas != null) {
                d.a(canvasLockCanvas);
                unlockCanvasAndPost(canvasLockCanvas);
            }
        }
    }

    public View getView() {
        return this;
    }

    @Override // jl.f
    public void hide() {
        this.f64365l = false;
        c cVar = this.f64357d;
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
        HandlerThread handlerThread = this.f64356c;
        if (handlerThread != null) {
            handlerThread.quit();
            this.f64356c = null;
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
        this.f64356c = handlerThread2;
        handlerThread2.start();
        return this.f64356c.getLooper();
    }

    @TargetApi(11)
    public final void k() {
        setLayerType(2, null);
        setOpaque(false);
        setWillNotCacheDrawing(true);
        setDrawingCacheEnabled(false);
        setWillNotDraw(true);
        setSurfaceTextureListener(this);
        d.e(true, true);
        this.f64363j = a.j(this);
    }

    public void n(Long l10) {
        this.f64365l = true;
        c cVar = this.f64357d;
        if (cVar == null) {
            return;
        }
        cVar.U(l10);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i10, int i11) {
        this.f64358e = true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public synchronized boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        this.f64358e = false;
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    public final synchronized void q() {
        c cVar = this.f64357d;
        if (cVar != null) {
            cVar.L();
            this.f64357d = null;
        }
        HandlerThread handlerThread = this.f64356c;
        this.f64356c = null;
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

    @Override // jl.f
    public void a(kl.c cVar) {
        c cVar2 = this.f64357d;
        if (cVar2 != null) {
            cVar2.u(cVar);
        }
    }

    @Override // jl.f
    public boolean c() {
        c cVar = this.f64357d;
        return cVar != null && cVar.E();
    }

    @Override // jl.g
    public boolean d() {
        return this.f64358e;
    }

    @Override // jl.g
    public boolean e() {
        return this.f64359f;
    }

    @Override // jl.f
    public void f(Long l10) {
        c cVar = this.f64357d;
        if (cVar != null) {
            cVar.Q(l10);
        }
    }

    public DanmakuContext getConfig() {
        c cVar = this.f64357d;
        if (cVar == null) {
            return null;
        }
        return cVar.z();
    }

    public long getCurrentTime() {
        c cVar = this.f64357d;
        if (cVar != null) {
            return cVar.A();
        }
        return 0L;
    }

    @Override // jl.f
    public k getCurrentVisibleDanmakus() {
        c cVar = this.f64357d;
        if (cVar != null) {
            return cVar.B();
        }
        return null;
    }

    @Override // jl.f
    public f.a getOnDanmakuClickListener() {
        return this.f64360g;
    }

    @Override // jl.f
    public float getXOff() {
        return this.f64361h;
    }

    @Override // jl.f
    public float getYOff() {
        return this.f64362i;
    }

    @Override // jl.f
    public void h(boolean z10) {
        this.f64359f = z10;
    }

    @Override // jl.f
    public boolean isPaused() {
        c cVar = this.f64357d;
        if (cVar != null) {
            return cVar.F();
        }
        return false;
    }

    @Override // android.view.View
    public boolean isShown() {
        return this.f64365l && super.isShown();
    }

    public final void l() {
        if (this.f64357d == null) {
            this.f64357d = new c(j(this.f64366m), this, this.f64365l);
        }
    }

    public void o(long j10) {
        c cVar = this.f64357d;
        if (cVar == null) {
            l();
        } else {
            cVar.removeCallbacksAndMessages(null);
        }
        this.f64357d.obtainMessage(1, Long.valueOf(j10)).sendToTarget();
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i10, int i11) {
        c cVar = this.f64357d;
        if (cVar != null) {
            cVar.G(i10, i11);
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean zK = this.f64363j.k(motionEvent);
        return !zK ? super.onTouchEvent(motionEvent) : zK;
    }

    @Override // jl.f
    public void pause() {
        c cVar = this.f64357d;
        if (cVar != null) {
            cVar.I();
        }
    }

    @Override // jl.f
    public void resume() {
        c cVar = this.f64357d;
        if (cVar != null && cVar.E()) {
            this.f64357d.P();
        } else if (this.f64357d == null) {
            m();
        }
    }

    @Override // jl.f
    public void setCallback(c.d dVar) {
        this.f64355b = dVar;
        c cVar = this.f64357d;
        if (cVar != null) {
            cVar.R(dVar);
        }
    }

    public void setDrawingThreadType(int i10) {
        this.f64366m = i10;
    }

    public void setOnDanmakuClickListener(f.a aVar) {
        this.f64360g = aVar;
    }

    @Override // jl.f
    public void start() {
        o(0L);
    }

    @Override // jl.f
    public void toggle() {
        if (this.f64358e) {
            c cVar = this.f64357d;
            if (cVar == null) {
                start();
            } else if (cVar.F()) {
                resume();
            } else {
                pause();
            }
        }
    }

    @Override // jl.f
    public void g(nl.a aVar, DanmakuContext danmakuContext) {
        l();
        this.f64357d.S(danmakuContext);
        this.f64357d.T(aVar);
        this.f64357d.R(this.f64355b);
        this.f64357d.J();
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
        this.f64367n.addLast(Long.valueOf(jB));
        Long lPeekFirst = this.f64367n.peekFirst();
        if (lPeekFirst == null) {
            return 0.0f;
        }
        float fLongValue = jB - lPeekFirst.longValue();
        if (this.f64367n.size() > 50) {
            this.f64367n.removeFirst();
        }
        if (fLongValue <= 0.0f) {
            return 0.0f;
        }
        return (this.f64367n.size() * 1000) / fLongValue;
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
        LinkedList<Long> linkedList = this.f64367n;
        if (linkedList != null) {
            linkedList.clear();
        }
    }

    public DanmakuTextureView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f64359f = true;
        this.f64365l = true;
        this.f64366m = 0;
        k();
    }
}
