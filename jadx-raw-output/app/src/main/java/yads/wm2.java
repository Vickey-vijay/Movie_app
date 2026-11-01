package yads;

import java.util.Objects;

/* JADX INFO: loaded from: classes10.dex */
public final class wm2 extends p51 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final transient Object[] f84272d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final transient int f84273e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final transient int f84274f;

    @Override // yads.j51
    public final boolean e() {
        return true;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        ng2.a(i10, this.f84274f);
        Object obj = this.f84272d[(i10 * 2) + this.f84273e];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f84274f;
    }

    public wm2(Object[] objArr, int i10, int i11) {
        this.f84272d = objArr;
        this.f84273e = i10;
        this.f84274f = i11;
    }
}
