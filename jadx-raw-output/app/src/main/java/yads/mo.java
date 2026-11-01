package yads;

import android.os.Looper;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: loaded from: classes10.dex */
public abstract class mo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f80293a = new ArrayList(1);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashSet f80294b = new HashSet(1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final bn1 f80295c = new bn1();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ok0 f80296d = new ok0();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Looper f80297e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public s63 f80298f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ye2 f80299g;

    public final ok0 a(ym1 ym1Var) {
        return new ok0(this.f80296d.f81064c, 0, ym1Var);
    }

    public abstract pm1 a(ym1 ym1Var, qe qeVar, long j10);

    public void a() {
    }

    public abstract void a(pm1 pm1Var);

    public abstract void a(r83 r83Var);

    public final bn1 b(ym1 ym1Var) {
        return new bn1(this.f80295c.f75912c, 0, ym1Var, 0L);
    }

    public void b() {
    }

    public abstract fm1 c();

    public abstract void d();

    public abstract void e();

    public final void c(zm1 zm1Var) {
        this.f80293a.remove(zm1Var);
        if (!this.f80293a.isEmpty()) {
            a(zm1Var);
            return;
        }
        this.f80297e = null;
        this.f80298f = null;
        this.f80299g = null;
        this.f80294b.clear();
        e();
    }

    public final void a(zm1 zm1Var) {
        boolean z10 = !this.f80294b.isEmpty();
        this.f80294b.remove(zm1Var);
        if (z10 && this.f80294b.isEmpty()) {
            a();
        }
    }

    public final void b(zm1 zm1Var) {
        this.f80297e.getClass();
        boolean zIsEmpty = this.f80294b.isEmpty();
        this.f80294b.add(zm1Var);
        if (zIsEmpty) {
            b();
        }
    }

    public final void a(s63 s63Var) {
        this.f80298f = s63Var;
        Iterator it = this.f80293a.iterator();
        while (it.hasNext()) {
            ((zm1) it.next()).a(this, s63Var);
        }
    }

    public final void a(pk0 pk0Var) {
        ok0 ok0Var = this.f80296d;
        for (nk0 nk0Var : ok0Var.f81064c) {
            if (nk0Var.f80680b == pk0Var) {
                ok0Var.f81064c.remove(nk0Var);
            }
        }
    }

    public final void a(cn1 cn1Var) {
        bn1 bn1Var = this.f80295c;
        for (an1 an1Var : bn1Var.f75912c) {
            if (an1Var.f75576b == cn1Var) {
                bn1Var.f75912c.remove(an1Var);
            }
        }
    }
}
