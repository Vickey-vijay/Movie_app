package yads;

/* JADX INFO: loaded from: classes7.dex */
public final class vm2 extends u51 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final transient s51 f83956d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final transient p51 f83957e;

    @Override // yads.u51, yads.j51
    public final p51 a() {
        return this.f83957e;
    }

    @Override // yads.j51
    public final boolean e() {
        return true;
    }

    @Override // yads.j51
    public final int a(int i10, Object[] objArr) {
        return this.f83957e.a(i10, objArr);
    }

    @Override // yads.j51, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.f83956d.get(obj) != null;
    }

    @Override // yads.j51, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final ja3 iterator() {
        return this.f83957e.listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return ((xm2) this.f83956d).f84639g;
    }

    public vm2(s51 s51Var, wm2 wm2Var) {
        this.f83956d = s51Var;
        this.f83957e = wm2Var;
    }
}
