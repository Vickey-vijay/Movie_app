package yads;

import java.util.Set;

/* JADX INFO: loaded from: classes6.dex */
public class iy2 extends lx implements Set {
    public iy2(Set set, og2 og2Var) {
        super(set, og2Var);
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        return ly2.a(this, obj);
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        return ly2.a(this);
    }
}
