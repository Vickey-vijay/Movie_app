package yads;

import android.os.Handler;
import java.io.IOException;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes11.dex */
public final class bn1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f75910a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ym1 f75911b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final CopyOnWriteArrayList f75912c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f75913d;

    public bn1() {
        this(new CopyOnWriteArrayList(), 0, null, 0L);
    }

    public final void a(Handler handler, cn1 cn1Var) {
        cn1Var.getClass();
        this.f75912c.add(new an1(handler, cn1Var));
    }

    public final /* synthetic */ void b(cn1 cn1Var, vf1 vf1Var, hm1 hm1Var) {
        cn1Var.a(this.f75910a, this.f75911b, vf1Var, hm1Var);
    }

    public final /* synthetic */ void c(cn1 cn1Var, vf1 vf1Var, hm1 hm1Var) {
        cn1Var.b(this.f75910a, this.f75911b, vf1Var, hm1Var);
    }

    public bn1(CopyOnWriteArrayList copyOnWriteArrayList, int i10, ym1 ym1Var, long j10) {
        this.f75912c = copyOnWriteArrayList;
        this.f75910a = i10;
        this.f75911b = ym1Var;
        this.f75913d = j10;
    }

    public final void b(final vf1 vf1Var, final hm1 hm1Var) {
        for (an1 an1Var : this.f75912c) {
            final cn1 cn1Var = an1Var.f75576b;
            ib3.a(an1Var.f75575a, new Runnable() { // from class: cp.n
                @Override // java.lang.Runnable
                public final void run() {
                    this.f51456b.b(cn1Var, vf1Var, hm1Var);
                }
            });
        }
    }

    public final void c(final vf1 vf1Var, final hm1 hm1Var) {
        for (an1 an1Var : this.f75912c) {
            final cn1 cn1Var = an1Var.f75576b;
            ib3.a(an1Var.f75575a, new Runnable() { // from class: cp.m
                @Override // java.lang.Runnable
                public final void run() {
                    this.f51438b.c(cn1Var, vf1Var, hm1Var);
                }
            });
        }
    }

    public final long a(long j10) {
        long jB = ib3.b(j10);
        if (jB == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return this.f75913d + jB;
    }

    public final void a(final hm1 hm1Var) {
        for (an1 an1Var : this.f75912c) {
            final cn1 cn1Var = an1Var.f75576b;
            ib3.a(an1Var.f75575a, new Runnable() { // from class: cp.p
                @Override // java.lang.Runnable
                public final void run() {
                    this.f51500b.a(cn1Var, hm1Var);
                }
            });
        }
    }

    public final void b(final hm1 hm1Var) {
        final ym1 ym1Var = this.f75911b;
        ym1Var.getClass();
        for (an1 an1Var : this.f75912c) {
            final cn1 cn1Var = an1Var.f75576b;
            ib3.a(an1Var.f75575a, new Runnable() { // from class: cp.o
                @Override // java.lang.Runnable
                public final void run() {
                    this.f51480b.a(cn1Var, ym1Var, hm1Var);
                }
            });
        }
    }

    public final /* synthetic */ void a(cn1 cn1Var, hm1 hm1Var) {
        cn1Var.b(this.f75910a, this.f75911b, hm1Var);
    }

    public final /* synthetic */ void a(cn1 cn1Var, vf1 vf1Var, hm1 hm1Var) {
        cn1Var.c(this.f75910a, this.f75911b, vf1Var, hm1Var);
    }

    public final /* synthetic */ void a(cn1 cn1Var, vf1 vf1Var, hm1 hm1Var, IOException iOException, boolean z10) {
        cn1Var.a(this.f75910a, this.f75911b, vf1Var, hm1Var, iOException, z10);
    }

    public final /* synthetic */ void a(cn1 cn1Var, ym1 ym1Var, hm1 hm1Var) {
        cn1Var.a(this.f75910a, ym1Var, hm1Var);
    }

    public final void a(final vf1 vf1Var, final hm1 hm1Var) {
        for (an1 an1Var : this.f75912c) {
            final cn1 cn1Var = an1Var.f75576b;
            ib3.a(an1Var.f75575a, new Runnable() { // from class: cp.r
                @Override // java.lang.Runnable
                public final void run() {
                    this.f51543b.a(cn1Var, vf1Var, hm1Var);
                }
            });
        }
    }

    public final void a(final vf1 vf1Var, final hm1 hm1Var, final IOException iOException, final boolean z10) {
        for (an1 an1Var : this.f75912c) {
            final cn1 cn1Var = an1Var.f75576b;
            ib3.a(an1Var.f75575a, new Runnable() { // from class: cp.q
                @Override // java.lang.Runnable
                public final void run() {
                    this.f51521b.a(cn1Var, vf1Var, hm1Var, iOException, z10);
                }
            });
        }
    }
}
