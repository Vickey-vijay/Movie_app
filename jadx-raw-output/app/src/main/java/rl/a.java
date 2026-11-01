package rl;

import android.graphics.RectF;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import jl.f;
import kl.c;
import kl.k;
import ll.e;

/* JADX INFO: compiled from: DanmakuTouchHelper.java */
/* JADX INFO: loaded from: classes4.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final GestureDetector f66800a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public f f66801b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public RectF f66802c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f66803d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f66804e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final GestureDetector.OnGestureListener f66805f;

    /* JADX INFO: renamed from: rl.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: DanmakuTouchHelper.java */
    public class C0630a extends GestureDetector.SimpleOnGestureListener {
        public C0630a() {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onDown(MotionEvent motionEvent) {
            if (a.this.f66801b == null || a.this.f66801b.getOnDanmakuClickListener() == null) {
                return false;
            }
            a aVar = a.this;
            aVar.f66803d = aVar.f66801b.getXOff();
            a aVar2 = a.this;
            aVar2.f66804e = aVar2.f66801b.getYOff();
            return true;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public void onLongPress(MotionEvent motionEvent) {
            if (a.this.f66801b.getOnDanmakuClickListener() == null) {
                return;
            }
            a aVar = a.this;
            aVar.f66803d = aVar.f66801b.getXOff();
            a aVar2 = a.this;
            aVar2.f66804e = aVar2.f66801b.getYOff();
            k kVarN = a.this.n(motionEvent.getX(), motionEvent.getY());
            if (kVarN == null || kVarN.isEmpty()) {
                return;
            }
            a.this.l(kVarN, true);
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
        public boolean onSingleTapConfirmed(MotionEvent motionEvent) {
            k kVarN = a.this.n(motionEvent.getX(), motionEvent.getY());
            boolean zL = false;
            if (kVarN != null && !kVarN.isEmpty()) {
                zL = a.this.l(kVarN, false);
            }
            return !zL ? a.this.m() : zL;
        }
    }

    /* JADX INFO: compiled from: DanmakuTouchHelper.java */
    public class b extends k.c<c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ float f66807a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ float f66808b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ k f66809c;

        public b(float f10, float f11, k kVar) {
            this.f66807a = f10;
            this.f66808b = f11;
            this.f66809c = kVar;
        }

        @Override // kl.k.b
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public int a(c cVar) {
            if (cVar == null) {
                return 0;
            }
            a.this.f66802c.set(cVar.g(), cVar.l(), cVar.i(), cVar.d());
            if (!a.this.f66802c.intersect(this.f66807a - a.this.f66803d, this.f66808b - a.this.f66804e, this.f66807a + a.this.f66803d, this.f66808b + a.this.f66804e)) {
                return 0;
            }
            this.f66809c.a(cVar);
            return 0;
        }
    }

    public static synchronized a j(f fVar) {
        return new a(fVar);
    }

    public boolean k(MotionEvent motionEvent) {
        return this.f66800a.onTouchEvent(motionEvent);
    }

    public final boolean l(k kVar, boolean z10) {
        f.a onDanmakuClickListener = this.f66801b.getOnDanmakuClickListener();
        if (onDanmakuClickListener != null) {
            return z10 ? onDanmakuClickListener.a(kVar) : onDanmakuClickListener.c(kVar);
        }
        return false;
    }

    public final boolean m() {
        f.a onDanmakuClickListener = this.f66801b.getOnDanmakuClickListener();
        if (onDanmakuClickListener != null) {
            return onDanmakuClickListener.b(this.f66801b);
        }
        return false;
    }

    public final k n(float f10, float f11) {
        e eVar = new e();
        this.f66802c.setEmpty();
        k currentVisibleDanmakus = this.f66801b.getCurrentVisibleDanmakus();
        if (currentVisibleDanmakus != null && !currentVisibleDanmakus.isEmpty()) {
            currentVisibleDanmakus.c(new b(f10, f11, eVar));
        }
        return eVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public a(f fVar) {
        C0630a c0630a = new C0630a();
        this.f66805f = c0630a;
        this.f66801b = fVar;
        this.f66802c = new RectF();
        this.f66800a = new GestureDetector(((View) fVar).getContext(), c0630a);
    }
}
