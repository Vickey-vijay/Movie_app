package yads;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import yads.sk2;

/* JADX INFO: loaded from: classes9.dex */
public final class sk2 implements gy0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final kd1 f82674a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Handler f82675b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final y5 f82676c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public w00 f82677d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public t5 f82678e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f82679f;

    public /* synthetic */ sk2(Context context, d4 d4Var, lu2 lu2Var, w5 w5Var, kd1 kd1Var) {
        this(kd1Var, new Handler(Looper.getMainLooper()), new y5(context, d4Var, lu2Var, w5Var));
    }

    @Override // yads.gy0
    public final void a(l4 l4Var) {
        this.f82676c.a(l4Var.f79698b, l4Var.f79699c);
        final l4 l4Var2 = new l4(l4Var.f79697a, l4Var.f79698b, l4Var.f79699c, this.f82679f);
        this.f82675b.post(new Runnable() { // from class: cp.v9
            @Override // java.lang.Runnable
            public final void run() {
                sk2.a(this.f51643b, l4Var2);
            }
        });
    }

    public sk2(kd1 kd1Var, Handler handler, y5 y5Var) {
        this.f82674a = kd1Var;
        this.f82675b = handler;
        this.f82676c = y5Var;
    }

    public static final void a(sk2 sk2Var, l4 l4Var) {
        w00 w00Var = sk2Var.f82677d;
        if (w00Var != null) {
            w00Var.a(l4Var);
        }
        t5 t5Var = sk2Var.f82678e;
        if (t5Var != null) {
            t5Var.a();
        }
    }

    @Override // yads.gy0
    public final void a(cd1 cd1Var) {
        this.f82676c.a();
        kd1 kd1Var = this.f82674a;
        final jd1 jd1Var = new jd1(cd1Var, kd1Var.f79390a, new rh1(kd1Var.f79391b), new mh1());
        this.f82675b.post(new Runnable() { // from class: cp.w9
            @Override // java.lang.Runnable
            public final void run() {
                sk2.a(this.f51666b, jd1Var);
            }
        });
    }

    public static final void a(sk2 sk2Var, jd1 jd1Var) {
        w00 w00Var = sk2Var.f82677d;
        if (w00Var != null) {
            w00Var.a(jd1Var);
        }
        t5 t5Var = sk2Var.f82678e;
        if (t5Var != null) {
            t5Var.a();
        }
    }

    public final void a(d4 d4Var) {
        this.f82676c.f84823e = new j9(d4Var);
    }

    public final void a(t5 t5Var) {
        this.f82678e = t5Var;
    }

    public final void a(fq2 fq2Var) {
        this.f82676c.f84824f = fq2Var;
    }
}
