package yads;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class w93 implements r43 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final s93 f84132b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long[] f84133c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Map f84134d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Map f84135e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Map f84136f;

    @Override // yads.r43
    public final long a(int i10) {
        return this.f84133c[i10];
    }

    @Override // yads.r43
    public final int a() {
        return this.f84133c.length;
    }

    @Override // yads.r43
    public final List b(long j10) {
        return this.f84132b.a(j10, this.f84134d, this.f84135e, this.f84136f);
    }

    public w93(s93 s93Var, HashMap map, HashMap map2, HashMap map3) {
        this.f84132b = s93Var;
        this.f84135e = map2;
        this.f84136f = map3;
        this.f84134d = Collections.unmodifiableMap(map);
        this.f84133c = s93Var.a();
    }

    @Override // yads.r43
    public final int a(long j10) {
        int iA = ib3.a(this.f84133c, j10, false);
        if (iA < this.f84133c.length) {
            return iA;
        }
        return -1;
    }
}
