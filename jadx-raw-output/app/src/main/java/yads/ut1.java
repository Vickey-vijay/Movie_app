package yads;

import android.content.Context;
import java.util.ArrayList;
import yads.ut1;

/* JADX INFO: loaded from: classes2.dex */
public final class ut1 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Object f83601f = new Object();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static volatile ut1 f83602g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final nt1 f83603a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final rt1 f83604b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final uu2 f83605c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final lu2 f83606d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public tt1 f83607e;

    public static final void a(ut1 ut1Var) {
        ArrayList<s61> arrayList;
        rt1 rt1Var = ut1Var.f83604b;
        synchronized (rt1Var.f82422a) {
            arrayList = new ArrayList(rt1Var.f82423b);
            rt1Var.f82423b.clear();
            mj.r rVar = mj.r.f64562a;
        }
        for (s61 s61Var : arrayList) {
            if (s61Var != null) {
                s61Var.a();
            }
        }
    }

    public final void b(Context context, final l00 l00Var) {
        boolean z10;
        boolean z11;
        synchronized (f83601f) {
            s61 s61Var = new s61(this.f83603a, l00Var);
            z10 = false;
            if (this.f83607e == tt1.f83171d) {
                z11 = false;
                z10 = true;
            } else {
                this.f83604b.a(s61Var);
                if (this.f83607e == tt1.f83169b) {
                    this.f83607e = tt1.f83170c;
                    z11 = true;
                } else {
                    z11 = false;
                }
            }
            mj.r rVar = mj.r.f64562a;
        }
        if (z10) {
            this.f83603a.f80754a.f81141a.execute(new Runnable() { // from class: cp.ab
                @Override // java.lang.Runnable
                public final void run() {
                    ut1.a(l00Var);
                }
            });
        }
        if (z11) {
            uu2 uu2Var = this.f83605c;
            lu2 lu2Var = this.f83606d;
            uu2Var.getClass();
            iu3 iu3Var = (iu3) lu2Var;
            this.f83603a.f80754a.f81142b.execute(new tu2(context, iu3Var, kotlinx.coroutines.d.a(nk.j2.b(null, 1, null).plus(nk.w0.b()).plus(new y10(iu3Var.a()))), st1.a(iu3Var)));
        }
    }

    public ut1(nt1 nt1Var, rt1 rt1Var, uu2 uu2Var, lu2 lu2Var, tt1 tt1Var) {
        this.f83603a = nt1Var;
        this.f83604b = rt1Var;
        this.f83605c = uu2Var;
        this.f83606d = lu2Var;
        this.f83607e = tt1Var;
    }

    public final void a(ru2 ru2Var) {
        if (ru2Var instanceof qu2) {
            synchronized (f83601f) {
                this.f83607e = tt1.f83171d;
                mj.r rVar = mj.r.f64562a;
            }
        } else if (ru2Var instanceof pu2) {
            synchronized (f83601f) {
                this.f83607e = tt1.f83169b;
                mj.r rVar2 = mj.r.f64562a;
            }
        }
        nt1 nt1Var = this.f83603a;
        nt1Var.f80754a.f81141a.execute(new Runnable() { // from class: cp.bb
            @Override // java.lang.Runnable
            public final void run() {
                ut1.a(this.f51251b);
            }
        });
    }

    public final void a(final Context context, final l00 l00Var) {
        j1.a(context);
        nt1 nt1Var = this.f83603a;
        nt1Var.f80754a.f81142b.execute(new Runnable() { // from class: cp.za
            @Override // java.lang.Runnable
            public final void run() {
                ut1.a(this.f51739b, context, l00Var);
            }
        });
    }

    public static final void a(ut1 ut1Var, Context context, l00 l00Var) {
        ut1Var.b(context, l00Var);
    }

    public static final void a(l00 l00Var) {
        l00Var.onInitializationCompleted();
    }
}
