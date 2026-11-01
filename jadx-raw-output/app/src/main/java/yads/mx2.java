package yads;

import android.net.Uri;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes6.dex */
public abstract class mx2 implements rj0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final u30 f80444a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final pb2 f80445b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ArrayList f80446c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final qr f80447d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final nr f80448e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final yr f80449f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Executor f80450g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final ArrayList f80451h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private volatile boolean f80452i;

    private void a(as2 as2Var) {
        synchronized (this.f80451h) {
            if (this.f80452i) {
                throw new InterruptedException();
            }
            this.f80451h.add(as2Var);
        }
    }

    public abstract ArrayList a(rr rrVar, dv0 dv0Var, boolean z10);

    private void b(as2 as2Var) {
        synchronized (this.f80451h) {
            this.f80451h.remove(as2Var);
        }
    }

    @Override // yads.rj0
    public final void cancel() {
        synchronized (this.f80451h) {
            this.f80452i = true;
            for (int i10 = 0; i10 < this.f80451h.size(); i10++) {
                ((as2) this.f80451h.get(i10)).cancel(true);
            }
        }
    }

    @Override // yads.rj0
    public final void remove() {
        rr rrVarA = this.f80447d.a(null, 1, -1000);
        try {
            ArrayList arrayListA = a(rrVarA, (dv0) a((as2) new ix2(this, rrVarA, this.f80444a), true), true);
            for (int i10 = 0; i10 < arrayListA.size(); i10++) {
                ((vy2) this.f80448e).c(this.f80449f.a(((kx2) arrayListA.get(i10)).f79619c));
            }
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        } catch (Exception unused2) {
        } finally {
            ((vy2) this.f80448e).c(this.f80449f.a(this.f80444a));
        }
    }

    public mx2(fm1 fm1Var, e30 e30Var, qr qrVar, Executor executor) {
        ni.a(fm1Var.f77444c);
        this.f80444a = a(fm1Var.f77444c.f85472a);
        this.f80445b = e30Var;
        this.f80446c = new ArrayList(fm1Var.f77444c.f85475d);
        this.f80447d = qrVar;
        this.f80450g = executor;
        this.f80448e = (nr) ni.a(qrVar.b());
        this.f80449f = qrVar.c();
        this.f80451h = new ArrayList();
    }

    public final Object a(as2 as2Var, boolean z10) throws ExecutionException, InterruptedException, IOException {
        if (z10) {
            as2Var.run();
            try {
                as2Var.f75614c.a();
                return as2Var.c();
            } catch (ExecutionException e10) {
                Throwable cause = e10.getCause();
                cause.getClass();
                if (cause instanceof IOException) {
                    throw ((IOException) cause);
                }
                int i10 = ib3.f78556a;
                throw e10;
            }
        }
        if (!this.f80452i) {
            a(as2Var);
            this.f80450g.execute(as2Var);
            try {
                try {
                    as2Var.f75614c.a();
                    Object objC = as2Var.c();
                    as2Var.f75614c.b();
                    synchronized (this.f80451h) {
                        this.f80451h.remove(as2Var);
                    }
                    return objC;
                } catch (ExecutionException e11) {
                    Throwable cause2 = e11.getCause();
                    cause2.getClass();
                    if (cause2 instanceof IOException) {
                        throw ((IOException) cause2);
                    }
                    int i11 = ib3.f78556a;
                    throw e11;
                }
            } catch (Throwable th2) {
                as2Var.f75614c.b();
                b(as2Var);
                throw th2;
            }
        }
        throw new InterruptedException();
    }

    public static u30 a(Uri uri) {
        Map mapEmptyMap = Collections.emptyMap();
        ni.a(uri, "The uri must be set.");
        return new u30(uri, 0L, 1, null, mapEmptyMap, 0L, -1L, null, 1, null);
    }

    private void a(int i10) {
        synchronized (this.f80451h) {
            this.f80451h.remove(i10);
        }
    }

    /* JADX WARN: Code duplicated, block: B:75:0x018d A[LOOP:1: B:73:0x0185->B:75:0x018d, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:78:0x01a6 A[LOOP:2: B:77:0x01a4->B:78:0x01a6, LOOP_END] */
    @Override // yads.rj0
    public final void a(qj0 qj0Var) throws Throwable {
        mx2 mx2Var;
        int i10;
        int size;
        rr rrVarA;
        byte[] bArr;
        ArrayDeque arrayDeque;
        mx2 mx2Var2 = this;
        ArrayDeque arrayDeque2 = new ArrayDeque();
        ArrayDeque arrayDeque3 = new ArrayDeque();
        try {
            rr rrVarA2 = mx2Var2.f80447d.a();
            dv0 dv0VarA = (dv0) mx2Var2.a((as2) new ix2(mx2Var2, rrVarA2, mx2Var2.f80444a), false);
            if (!mx2Var2.f80446c.isEmpty()) {
                dv0VarA = ((c30) dv0VarA).a(mx2Var2.f80446c);
            }
            ArrayList arrayListA = mx2Var2.a(rrVarA2, dv0VarA, false);
            Collections.sort(arrayListA);
            a(arrayListA, mx2Var2.f80449f);
            int size2 = arrayListA.size();
            int size3 = arrayListA.size() - 1;
            int i11 = 0;
            long j10 = 0;
            long j11 = 0;
            while (size3 >= 0) {
                try {
                    u30 u30Var = ((kx2) arrayListA.get(size3)).f79619c;
                    String strA = mx2Var2.f80449f.a(u30Var);
                    long j12 = u30Var.f83347g;
                    if (j12 == -1) {
                        long jA = qz.a(((vy2) mx2Var2.f80448e).b(strA));
                        if (jA != -1) {
                            j12 = jA - u30Var.f83346f;
                        }
                    }
                    ArrayDeque arrayDeque4 = arrayDeque3;
                    long jA2 = ((vy2) mx2Var2.f80448e).a(strA, u30Var.f83346f, j12);
                    j11 += jA2;
                    if (j12 != -1) {
                        if (j12 == jA2) {
                            i11++;
                            arrayListA.remove(size3);
                        }
                        if (j10 != -1) {
                            j10 += j12;
                        }
                    } else {
                        j10 = -1;
                    }
                    size3--;
                    arrayDeque3 = arrayDeque4;
                    mx2Var2 = this;
                } catch (Throwable th2) {
                    th = th2;
                    mx2Var = this;
                    for (i10 = 0; i10 < mx2Var.f80451h.size(); i10++) {
                        ((as2) mx2Var.f80451h.get(i10)).cancel(true);
                    }
                    for (size = mx2Var.f80451h.size() - 1; size >= 0; size--) {
                        ((as2) mx2Var.f80451h.get(size)).f75614c.b();
                        mx2Var.a(size);
                    }
                    throw th;
                }
            }
            ArrayDeque arrayDeque5 = arrayDeque3;
            jx2 jx2Var = qj0Var != null ? new jx2(qj0Var, j10, size2, j11, i11) : null;
            arrayDeque2.addAll(arrayListA);
            mx2Var = this;
            while (!mx2Var.f80452i && !arrayDeque2.isEmpty()) {
                try {
                    if (!arrayDeque5.isEmpty()) {
                        lx2 lx2Var = (lx2) arrayDeque5.removeFirst();
                        rrVarA = lx2Var.f79983i;
                        bArr = lx2Var.f79985k;
                    } else {
                        rrVarA = mx2Var.f80447d.a();
                        bArr = new byte[131072];
                    }
                    lx2 lx2Var2 = new lx2((kx2) arrayDeque2.removeFirst(), rrVarA, jx2Var, bArr);
                    mx2Var.a(lx2Var2);
                    mx2Var.f80450g.execute(lx2Var2);
                    int size4 = mx2Var.f80451h.size() - 1;
                    while (size4 >= 0) {
                        lx2 lx2Var3 = (lx2) mx2Var.f80451h.get(size4);
                        if (arrayDeque2.isEmpty() || lx2Var3.isDone()) {
                            try {
                                lx2Var3.f75614c.a();
                                lx2Var3.c();
                                mx2Var.a(size4);
                                arrayDeque = arrayDeque5;
                                arrayDeque.addLast(lx2Var3);
                            } catch (ExecutionException e10) {
                                Throwable cause = e10.getCause();
                                cause.getClass();
                                if (cause instanceof IOException) {
                                    throw ((IOException) cause);
                                }
                                throw cause;
                            }
                        } else {
                            arrayDeque = arrayDeque5;
                        }
                        size4--;
                        arrayDeque5 = arrayDeque;
                    }
                    ArrayDeque arrayDeque6 = arrayDeque5;
                    lx2Var2.f75613b.b();
                    arrayDeque5 = arrayDeque6;
                } catch (Throwable th3) {
                    th = th3;
                    while (i10 < mx2Var.f80451h.size()) {
                        ((as2) mx2Var.f80451h.get(i10)).cancel(true);
                    }
                    while (size >= 0) {
                        ((as2) mx2Var.f80451h.get(size)).f75614c.b();
                        mx2Var.a(size);
                    }
                    throw th;
                }
            }
            for (int i12 = 0; i12 < mx2Var.f80451h.size(); i12++) {
                ((as2) mx2Var.f80451h.get(i12)).cancel(true);
            }
            for (int size5 = mx2Var.f80451h.size() - 1; size5 >= 0; size5--) {
                ((as2) mx2Var.f80451h.get(size5)).f75614c.b();
                mx2Var.a(size5);
            }
        } catch (Throwable th4) {
            th = th4;
            mx2Var = mx2Var2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:31:0x00aa  */
    private static void a(ArrayList arrayList, yr yrVar) {
        HashMap map = new HashMap();
        int i10 = 0;
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            kx2 kx2Var = (kx2) arrayList.get(i11);
            String strA = yrVar.a(kx2Var.f79619c);
            Integer num = (Integer) map.get(strA);
            kx2 kx2Var2 = num == null ? null : (kx2) arrayList.get(num.intValue());
            if (kx2Var2 != null && kx2Var.f79618b <= kx2Var2.f79618b + 20000000) {
                u30 u30Var = kx2Var2.f79619c;
                u30 u30Var2 = kx2Var.f79619c;
                if (u30Var.f83341a.equals(u30Var2.f83341a)) {
                    long j10 = u30Var.f83347g;
                    if (j10 != -1 && u30Var.f83346f + j10 == u30Var2.f83346f && ib3.a(u30Var.f83348h, u30Var2.f83348h) && u30Var.f83349i == u30Var2.f83349i && u30Var.f83343c == u30Var2.f83343c && u30Var.f83345e.equals(u30Var2.f83345e)) {
                        long j11 = kx2Var.f79619c.f83347g;
                        u30 u30VarA = kx2Var2.f79619c.a(0L, j11 == -1 ? -1L : kx2Var2.f79619c.f83347g + j11);
                        num.getClass();
                        arrayList.set(num.intValue(), new kx2(kx2Var2.f79618b, u30VarA));
                    } else {
                        map.put(strA, Integer.valueOf(i10));
                        arrayList.set(i10, kx2Var);
                        i10++;
                    }
                } else {
                    map.put(strA, Integer.valueOf(i10));
                    arrayList.set(i10, kx2Var);
                    i10++;
                }
            } else {
                map.put(strA, Integer.valueOf(i10));
                arrayList.set(i10, kx2Var);
                i10++;
            }
        }
        int size = arrayList.size();
        int i12 = ib3.f78556a;
        if (i10 < 0 || size > arrayList.size() || i10 > size) {
            throw new IllegalArgumentException();
        }
        if (i10 != size) {
            arrayList.subList(i10, size).clear();
        }
    }
}
