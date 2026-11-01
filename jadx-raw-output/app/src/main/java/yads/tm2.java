package yads;

import java.util.AbstractMap;
import java.util.Objects;

/* JADX INFO: loaded from: classes11.dex */
public final class tm2 extends p51 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ um2 f83099d;

    @Override // yads.j51
    public final boolean e() {
        return true;
    }

    public tm2(um2 um2Var) {
        this.f83099d = um2Var;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        ng2.a(i10, this.f83099d.f83541g);
        um2 um2Var = this.f83099d;
        int i11 = i10 * 2;
        Object obj = um2Var.f83539e[um2Var.f83540f + i11];
        Objects.requireNonNull(obj);
        um2 um2Var2 = this.f83099d;
        Object obj2 = um2Var2.f83539e[i11 + (um2Var2.f83540f ^ 1)];
        Objects.requireNonNull(obj2);
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f83099d.f83541g;
    }
}
