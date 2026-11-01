package yads;

import java.util.Iterator;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes7.dex */
public final class o51 extends p51 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final transient int f80949d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final transient int f80950e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ p51 f80951f;

    @Override // yads.j51
    public final boolean e() {
        return true;
    }

    @Override // yads.p51, yads.j51, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return listIterator(0);
    }

    @Override // yads.p51, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    public o51(p51 p51Var, int i10, int i11) {
        this.f80951f = p51Var;
        this.f80949d = i10;
        this.f80950e = i11;
    }

    @Override // yads.p51, java.util.List
    /* JADX INFO: renamed from: a */
    public final p51 subList(int i10, int i11) {
        ng2.a(i10, i11, this.f80950e);
        p51 p51Var = this.f80951f;
        int i12 = this.f80949d;
        return p51Var.subList(i10 + i12, i11 + i12);
    }

    @Override // yads.j51
    public final Object[] b() {
        return this.f80951f.b();
    }

    @Override // yads.j51
    public final int c() {
        return this.f80951f.d() + this.f80949d + this.f80950e;
    }

    @Override // yads.j51
    public final int d() {
        return this.f80951f.d() + this.f80949d;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        ng2.a(i10, this.f80950e);
        return this.f80951f.get(i10 + this.f80949d);
    }

    @Override // yads.p51, java.util.List
    public final /* bridge */ /* synthetic */ ListIterator listIterator(int i10) {
        return listIterator(i10);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f80950e;
    }
}
