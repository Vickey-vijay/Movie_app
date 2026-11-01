package yads;

import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class um2 extends u51 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final transient s51 f83538d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final transient Object[] f83539e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final transient int f83540f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final transient int f83541g;

    @Override // yads.j51
    public final boolean e() {
        return true;
    }

    @Override // yads.j51, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Object key = entry.getKey();
        Object value = entry.getValue();
        return value != null && value.equals(this.f83538d.get(key));
    }

    @Override // yads.u51
    public final p51 f() {
        return new tm2(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f83541g;
    }

    public um2(s51 s51Var, Object[] objArr, int i10) {
        this.f83538d = s51Var;
        this.f83539e = objArr;
        this.f83541g = i10;
    }

    @Override // yads.j51
    public final int a(int i10, Object[] objArr) {
        return a().a(i10, objArr);
    }

    @Override // yads.j51, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final ja3 iterator() {
        return a().listIterator(0);
    }
}
