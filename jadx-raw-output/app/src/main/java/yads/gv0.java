package yads;

import java.util.Iterator;
import kotlin.Pair;

/* JADX INFO: loaded from: classes10.dex */
public final class gv0 implements zg3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w5 f77947a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g62 f77948b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final z52 f77949c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Iterator f77950d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final z30 f77951e;

    @Override // yads.zg3
    public final void a() {
        if (this.f77950d.hasNext()) {
            Pair pair = (Pair) this.f77950d.next();
            String str = (String) pair.component1();
            String str2 = (String) pair.component2();
            w5 w5Var = this.f77947a;
            g62 g62Var = this.f77948b;
            z52 z52Var = this.f77949c;
            z52Var.a(str, new gv0(w5Var, g62Var, z52Var, this.f77950d, this.f77951e), str2);
        }
    }

    @Override // yads.zg3
    public final void b() {
        this.f77951e.a(y30.f84802f);
    }

    public gv0(w5 w5Var, g62 g62Var, z52 z52Var, Iterator it, z30 z30Var) {
        this.f77947a = w5Var;
        this.f77948b = g62Var;
        this.f77949c = z52Var;
        this.f77950d = it;
        this.f77951e = z30Var;
    }

    @Override // yads.zg3
    public final void c() {
        a();
    }
}
