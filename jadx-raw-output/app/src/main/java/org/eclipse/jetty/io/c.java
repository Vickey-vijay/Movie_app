package org.eclipse.jetty.io;

import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: PooledBuffers.java */
/* JADX INFO: loaded from: classes9.dex */
public class c extends a {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Queue<mm.d> f65588f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Queue<mm.d> f65589g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Queue<mm.d> f65590h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final AtomicInteger f65591i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f65592j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final boolean f65593k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f65594l;

    @Override // org.eclipse.jetty.io.Buffers
    public mm.d b() {
        mm.d dVarPoll = this.f65588f.poll();
        if (dVarPoll == null) {
            return j();
        }
        this.f65591i.decrementAndGet();
        return dVarPoll;
    }

    @Override // org.eclipse.jetty.io.Buffers
    public mm.d c(int i10) {
        if (this.f65593k && i10 == e()) {
            return b();
        }
        if (this.f65594l && i10 == d()) {
            return getBuffer();
        }
        mm.d dVarPoll = this.f65590h.poll();
        while (dVarPoll != null && dVarPoll.e0() != i10) {
            this.f65591i.decrementAndGet();
            dVarPoll = this.f65590h.poll();
        }
        if (dVarPoll == null) {
            return i(i10);
        }
        this.f65591i.decrementAndGet();
        return dVarPoll;
    }

    @Override // org.eclipse.jetty.io.Buffers
    public mm.d getBuffer() {
        mm.d dVarPoll = this.f65589g.poll();
        if (dVarPoll == null) {
            return h();
        }
        this.f65591i.decrementAndGet();
        return dVarPoll;
    }

    public String toString() {
        return String.format("%s [%d/%d@%d,%d/%d@%d,%d/%d@-]", getClass().getSimpleName(), Integer.valueOf(this.f65588f.size()), Integer.valueOf(this.f65592j), Integer.valueOf(this.f65583b), Integer.valueOf(this.f65589g.size()), Integer.valueOf(this.f65592j), Integer.valueOf(this.f65585d), Integer.valueOf(this.f65590h.size()), Integer.valueOf(this.f65592j));
    }

    public c(Buffers.Type type, int i10, Buffers.Type type2, int i11, Buffers.Type type3, int i12) {
        boolean z10;
        super(type, i10, type2, i11, type3);
        this.f65591i = new AtomicInteger();
        this.f65588f = new ConcurrentLinkedQueue();
        this.f65589g = new ConcurrentLinkedQueue();
        this.f65590h = new ConcurrentLinkedQueue();
        if (type == type3) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f65593k = z10;
        this.f65594l = type2 == type3;
        this.f65592j = i12;
    }

    @Override // org.eclipse.jetty.io.Buffers
    public void a(mm.d dVar) {
        dVar.clear();
        if (!dVar.h0() && !dVar.Y()) {
            if (this.f65591i.incrementAndGet() > this.f65592j) {
                this.f65591i.decrementAndGet();
                return;
            }
            if (g(dVar)) {
                this.f65588f.add(dVar);
            } else if (f(dVar)) {
                this.f65589g.add(dVar);
            } else {
                this.f65590h.add(dVar);
            }
        }
    }
}
