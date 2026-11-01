package yads;

import java.util.ArrayDeque;
import java.util.PriorityQueue;
import yads.ot;
import yads.ua0;

/* JADX INFO: loaded from: classes10.dex */
public abstract class pt implements s43 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayDeque f81582a = new ArrayDeque();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayDeque f81583b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final PriorityQueue f81584c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public nt f81585d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f81586e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f81587f;

    public abstract void a(nt ntVar);

    public abstract qt c();

    public abstract boolean f();

    @Override // yads.oa0
    public void release() {
    }

    @Override // yads.oa0
    public final void a(w43 w43Var) {
        if (w43Var != this.f81585d) {
            throw new IllegalArgumentException();
        }
        nt ntVar = (nt) w43Var;
        if (ntVar.b(Integer.MIN_VALUE)) {
            ntVar.b();
            this.f81582a.add(ntVar);
        } else {
            long j10 = this.f81587f;
            this.f81587f = 1 + j10;
            ntVar.f80753k = j10;
            this.f81584c.add(ntVar);
        }
        this.f81585d = null;
    }

    @Override // yads.oa0
    public final Object b() {
        if (this.f81585d != null) {
            throw new IllegalStateException();
        }
        if (this.f81582a.isEmpty()) {
            return null;
        }
        nt ntVar = (nt) this.f81582a.pollFirst();
        this.f81585d = ntVar;
        return ntVar;
    }

    @Override // yads.oa0
    /* JADX INFO: renamed from: d */
    public x43 a() {
        if (this.f81583b.isEmpty()) {
            return null;
        }
        while (!this.f81584c.isEmpty()) {
            nt ntVar = (nt) this.f81584c.peek();
            int i10 = ib3.f78556a;
            if (ntVar.f82570f > this.f81586e) {
                break;
            }
            nt ntVar2 = (nt) this.f81584c.poll();
            if (ntVar2.b(4)) {
                x43 x43Var = (x43) this.f81583b.pollFirst();
                x43Var.f82731b = 4 | x43Var.f82731b;
                ntVar2.b();
                this.f81582a.add(ntVar2);
                return x43Var;
            }
            a(ntVar2);
            if (f()) {
                qt qtVarC = c();
                x43 x43Var2 = (x43) this.f81583b.pollFirst();
                long j10 = ntVar2.f82570f;
                x43Var2.f83403c = j10;
                x43Var2.f84450d = qtVarC;
                x43Var2.f84451e = j10;
                ntVar2.b();
                this.f81582a.add(ntVar2);
                return x43Var2;
            }
            ntVar2.b();
            this.f81582a.add(ntVar2);
        }
        return null;
    }

    public final x43 e() {
        return (x43) this.f81583b.pollFirst();
    }

    @Override // yads.oa0
    public void flush() {
        this.f81587f = 0L;
        this.f81586e = 0L;
        while (!this.f81584c.isEmpty()) {
            nt ntVar = (nt) this.f81584c.poll();
            int i10 = ib3.f78556a;
            ntVar.b();
            this.f81582a.add(ntVar);
        }
        nt ntVar2 = this.f81585d;
        if (ntVar2 != null) {
            ntVar2.b();
            this.f81582a.add(ntVar2);
            this.f81585d = null;
        }
    }

    public pt() {
        for (int i10 = 0; i10 < 10; i10++) {
            this.f81582a.add(new nt());
        }
        this.f81583b = new ArrayDeque();
        for (int i11 = 0; i11 < 2; i11++) {
            this.f81583b.add(new ot(new ta0() { // from class: cp.o8
                @Override // yads.ta0
                public final void a(ua0 ua0Var) {
                    this.f51494a.a((ot) ua0Var);
                }
            }));
        }
        this.f81584c = new PriorityQueue();
    }

    public final void a(x43 x43Var) {
        x43Var.f82731b = 0;
        x43Var.f84450d = null;
        this.f81583b.add(x43Var);
    }

    @Override // yads.s43
    public final void a(long j10) {
        this.f81586e = j10;
    }
}
