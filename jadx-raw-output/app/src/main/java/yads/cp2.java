package yads;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes10.dex */
public final class cp2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicInteger f76382a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashSet f76383b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final PriorityBlockingQueue f76384c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final PriorityBlockingQueue f76385d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final mr f76386e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final xo f76387f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final bq2 f76388g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final a82[] f76389h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public tr f76390i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ArrayList f76391j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final ArrayList f76392k;

    public cp2(mr mrVar, xo xoVar, int i10) {
        this(mrVar, xoVar, i10, new gn0(new Handler(Looper.getMainLooper())));
    }

    public final void a(po2 po2Var) {
        po2Var.f81495i = this;
        synchronized (this.f76383b) {
            this.f76383b.add(po2Var);
        }
        po2Var.f81494h = Integer.valueOf(this.f76382a.incrementAndGet());
        po2Var.a("add-to-queue");
        a(po2Var, 0);
        if (po2Var.f81496j) {
            this.f76384c.add(po2Var);
        } else {
            this.f76385d.add(po2Var);
        }
    }

    public cp2(mr mrVar, xo xoVar, int i10, gn0 gn0Var) {
        this.f76382a = new AtomicInteger();
        this.f76383b = new HashSet();
        this.f76384c = new PriorityBlockingQueue();
        this.f76385d = new PriorityBlockingQueue();
        this.f76391j = new ArrayList();
        this.f76392k = new ArrayList();
        this.f76386e = mrVar;
        this.f76387f = xoVar;
        this.f76389h = new a82[i10];
        this.f76388g = gn0Var;
    }

    public final void a(bp2 bp2Var) {
        synchronized (this.f76383b) {
            for (po2 po2Var : this.f76383b) {
                if (bp2Var.a(po2Var)) {
                    po2Var.a();
                }
            }
        }
    }

    public final void a(po2 po2Var, int i10) {
        uo2 uo2Var;
        synchronized (this.f76392k) {
            Iterator it = this.f76392k.iterator();
            while (it.hasNext()) {
                ((ro2) ((ap2) it.next())).getClass();
                po poVar = po2Var instanceof po ? (po) po2Var : null;
                if (poVar != null && i10 == 3 && (uo2Var = poVar.f81481u) != null) {
                    uo2Var.b();
                }
            }
        }
    }

    public final void a() {
        tr trVar = this.f76390i;
        if (trVar != null) {
            trVar.f83148f = true;
            trVar.interrupt();
        }
        for (a82 a82Var : this.f76389h) {
            if (a82Var != null) {
                a82Var.f75437f = true;
                a82Var.interrupt();
            }
        }
        tr trVar2 = new tr(this.f76384c, this.f76385d, this.f76386e, this.f76388g);
        this.f76390i = trVar2;
        trVar2.start();
        for (int i10 = 0; i10 < this.f76389h.length; i10++) {
            a82 a82Var2 = new a82(this.f76385d, this.f76387f, this.f76386e, this.f76388g);
            this.f76389h[i10] = a82Var2;
            a82Var2.start();
        }
    }
}
