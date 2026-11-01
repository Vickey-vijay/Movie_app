package com.fyber.inneractive.sdk.protobuf;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes9.dex */
public final class w2 implements Iterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f18323a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Iterator f18324b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e3 f18325c;

    public w2(e3 e3Var) {
        this.f18325c = e3Var;
        this.f18323a = e3Var.f18173b.size();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i10 = this.f18323a;
        if (i10 <= 0 || i10 > this.f18325c.f18173b.size()) {
            if (this.f18324b == null) {
                this.f18324b = this.f18325c.f18177f.entrySet().iterator();
            }
            if (!this.f18324b.hasNext()) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f18324b == null) {
            this.f18324b = this.f18325c.f18177f.entrySet().iterator();
        }
        if (this.f18324b.hasNext()) {
            if (this.f18324b == null) {
                this.f18324b = this.f18325c.f18177f.entrySet().iterator();
            }
            return (Map.Entry) this.f18324b.next();
        }
        List list = this.f18325c.f18173b;
        int i10 = this.f18323a - 1;
        this.f18323a = i10;
        return (Map.Entry) list.get(i10);
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
