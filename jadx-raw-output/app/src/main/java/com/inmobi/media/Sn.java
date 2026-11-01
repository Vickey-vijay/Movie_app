package com.inmobi.media;

import android.os.Handler;
import android.view.View;
import com.inmobi.media.Sn;
import com.mbridge.msdk.MBridgeConstans;
import io.bidmachine.iab.utils.VisibilityTracker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes8.dex */
public abstract class Sn {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WeakHashMap f23532a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Handler f23533b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final byte f23534c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final InterfaceC3028m9 f23535d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f23537f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Pn f23539h;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f23542k;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ArrayList f23536e = new ArrayList(50);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final AtomicBoolean f23538g = new AtomicBoolean(true);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final mj.g f23540i = kotlin.b.a(new bk.a() { // from class: b7.g4
        @Override // bk.a
        public final Object invoke() {
            return Sn.a(this.f4941b);
        }
    });

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final mj.g f23541j = kotlin.b.a(new bk.a() { // from class: b7.h4
        @Override // bk.a
        public final Object invoke() {
            return Sn.b(this.f4955b);
        }
    });

    public static final On a(Sn sn2) {
        return new On(sn2, sn2.f23538g);
    }

    public static final Runnable b(final Sn sn2) {
        return new Runnable() { // from class: b7.f4
            @Override // java.lang.Runnable
            public final void run() {
                Sn.c(this.f4921b);
            }
        };
    }

    public abstract int c();

    public static final void c(Sn sn2) {
        sn2.f23533b.post((On) sn2.f23540i.getValue());
    }

    public final void a(View view, View view2, View view3, int i10) {
        ck.p.j(view, "rootView");
        ck.p.j(view2, MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW);
        InterfaceC3028m9 interfaceC3028m9 = this.f23535d;
        if (interfaceC3028m9 != null) {
            ((C3053n9) interfaceC3028m9).c(VisibilityTracker.TAG, "add view to tracker - minPercent - " + i10 + "  " + this);
        }
        Qn qn2 = (Qn) this.f23532a.get(view2);
        if (qn2 == null) {
            qn2 = new Qn();
            this.f23532a.put(view2, qn2);
            this.f23537f++;
        }
        qn2.f23416a = i10;
        long j10 = this.f23537f;
        qn2.f23417b = j10;
        qn2.f23418c = view;
        long j11 = 50;
        if (j10 % j11 == 0) {
            long j12 = j10 - j11;
            for (Map.Entry entry : this.f23532a.entrySet()) {
                View view4 = (View) entry.getKey();
                if (((Qn) entry.getValue()).f23417b < j12) {
                    this.f23536e.add(view4);
                }
            }
            Iterator it = this.f23536e.iterator();
            ck.p.i(it, "iterator(...)");
            while (it.hasNext()) {
                a((View) it.next());
            }
            this.f23536e.clear();
        }
        if (this.f23532a.size() == 1) {
            e();
        }
    }

    public final void b() {
        InterfaceC3028m9 interfaceC3028m9 = this.f23535d;
        if (interfaceC3028m9 != null) {
            ((C3053n9) interfaceC3028m9).c(VisibilityTracker.TAG, "destroy " + this);
        }
        a();
        this.f23539h = null;
        this.f23538g.set(true);
    }

    public final void d() {
        InterfaceC3028m9 interfaceC3028m9 = this.f23535d;
        if (interfaceC3028m9 != null) {
            ((C3053n9) interfaceC3028m9).c(VisibilityTracker.TAG, "pause " + this);
        }
        ((On) this.f23540i.getValue()).run();
        this.f23533b.removeCallbacksAndMessages(null);
        this.f23542k = false;
        this.f23538g.set(true);
    }

    public final void e() {
        InterfaceC3028m9 interfaceC3028m9 = this.f23535d;
        if (interfaceC3028m9 != null) {
            ((C3053n9) interfaceC3028m9).c(VisibilityTracker.TAG, "resume " + this);
        }
        this.f23538g.set(false);
        if (this.f23542k || this.f23538g.get()) {
            return;
        }
        this.f23542k = true;
        nk.j.d(A9.f22352d, null, null, new Rn(this, null), 3, null);
    }

    public Sn(WeakHashMap weakHashMap, Handler handler, byte b10, InterfaceC3028m9 interfaceC3028m9) {
        this.f23532a = weakHashMap;
        this.f23533b = handler;
        this.f23534c = b10;
        this.f23535d = interfaceC3028m9;
    }

    public final void a(View view) {
        ck.p.j(view, MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW);
        InterfaceC3028m9 interfaceC3028m9 = this.f23535d;
        if (interfaceC3028m9 != null) {
            ((C3053n9) interfaceC3028m9).c(VisibilityTracker.TAG, "removed view from tracker " + this);
        }
        if (((Qn) this.f23532a.remove(view)) != null) {
            this.f23537f--;
            if (this.f23532a.isEmpty()) {
                d();
            }
        }
    }

    public final void a() {
        InterfaceC3028m9 interfaceC3028m9 = this.f23535d;
        if (interfaceC3028m9 != null) {
            ((C3053n9) interfaceC3028m9).c(VisibilityTracker.TAG, "clear " + this);
        }
        this.f23532a.clear();
        this.f23533b.removeMessages(0);
        this.f23542k = false;
    }
}
