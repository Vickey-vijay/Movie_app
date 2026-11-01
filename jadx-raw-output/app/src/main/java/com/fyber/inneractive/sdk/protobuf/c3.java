package com.fyber.inneractive.sdk.protobuf;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class c3 implements Iterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f18159a = -1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f18160b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Iterator f18161c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e3 f18162d;

    @Override // java.util.Iterator
    public final Object next() {
        this.f18160b = true;
        int i10 = this.f18159a + 1;
        this.f18159a = i10;
        if (i10 < this.f18162d.f18173b.size()) {
            return (Map.Entry) this.f18162d.f18173b.get(this.f18159a);
        }
        if (this.f18161c == null) {
            this.f18161c = this.f18162d.f18174c.entrySet().iterator();
        }
        return (Map.Entry) this.f18161c.next();
    }

    public c3(e3 e3Var) {
        this.f18162d = e3Var;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f18159a + 1 < this.f18162d.f18173b.size()) {
            return true;
        }
        if (!this.f18162d.f18174c.isEmpty()) {
            if (this.f18161c == null) {
                this.f18161c = this.f18162d.f18174c.entrySet().iterator();
            }
            if (this.f18161c.hasNext()) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.f18160b) {
            throw new IllegalStateException("remove() was called before next()");
        }
        this.f18160b = false;
        e3 e3Var = this.f18162d;
        int i10 = e3.f18171h;
        e3Var.a();
        if (this.f18159a >= this.f18162d.f18173b.size()) {
            if (this.f18161c == null) {
                this.f18161c = this.f18162d.f18174c.entrySet().iterator();
            }
            this.f18161c.remove();
            return;
        }
        e3 e3Var2 = this.f18162d;
        int i11 = this.f18159a;
        this.f18159a = i11 - 1;
        e3Var2.a();
        Object obj = ((b3) e3Var2.f18173b.remove(i11)).f18155b;
        if (e3Var2.f18174c.isEmpty()) {
            return;
        }
        Iterator it = e3Var2.c().entrySet().iterator();
        e3Var2.f18173b.add(new b3(e3Var2, (Map.Entry) it.next()));
        it.remove();
    }
}
