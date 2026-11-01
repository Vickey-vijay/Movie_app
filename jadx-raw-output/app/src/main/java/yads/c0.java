package yads;

import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public class c0 extends tx1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e0 f76073b;

    public c0(a0 a0Var) {
        this.f76073b = a0Var;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        a0 a0Var = (a0) this.f76073b;
        a0Var.getClass();
        return new k(a0Var);
    }
}
