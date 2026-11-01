package yads;

import android.content.Context;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes10.dex */
public final class cj0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final AtomicBoolean f76287e = new AtomicBoolean(true);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w5 f76288a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f76289b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a5 f76290c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final d11 f76291d;

    public /* synthetic */ cj0(Context context, w5 w5Var) {
        this(w5Var, context.getApplicationContext(), new a5(), new d11());
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(rj.c cVar) throws Throwable {
        yi0 yi0Var;
        v5 v5Var;
        w5 w5Var;
        Throwable th2;
        if (cVar instanceof yi0) {
            yi0Var = (yi0) cVar;
            int i10 = yi0Var.f84972f;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                yi0Var.f84972f = i10 - Integer.MIN_VALUE;
            } else {
                yi0Var = new yi0(this, cVar);
            }
        } else {
            yi0Var = new yi0(this, cVar);
        }
        Object obj = yi0Var.f84970d;
        Object objF = sj.a.f();
        int i11 = yi0Var.f84972f;
        if (i11 == 0) {
            kotlin.c.b(obj);
            if (f76287e.getAndSet(false)) {
                w5 w5Var2 = this.f76288a;
                v5 v5Var2 = v5.f83766z;
                w5Var2.b(v5Var2);
                try {
                    nk.h0 h0VarA = w10.a();
                    zi0 zi0Var = new zi0(this, null);
                    yi0Var.f84968b = w5Var2;
                    yi0Var.f84969c = v5Var2;
                    yi0Var.f84972f = 1;
                    if (nk.h.g(h0VarA, zi0Var, yi0Var) == objF) {
                        return objF;
                    }
                    w5Var = w5Var2;
                    v5Var = v5Var2;
                    mj.r rVar = mj.r.f64562a;
                    w5Var.a(v5Var);
                } catch (Throwable th3) {
                    v5Var = v5Var2;
                    w5Var = w5Var2;
                    th2 = th3;
                    th2.getMessage();
                    boolean z10 = ad1.f75480a;
                }
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            v5Var = yi0Var.f84969c;
            w5Var = yi0Var.f84968b;
            try {
                kotlin.c.b(obj);
            } catch (Throwable th4) {
                th2 = th4;
                th2.getMessage();
                boolean z11 = ad1.f75480a;
            }
            mj.r rVar2 = mj.r.f64562a;
            w5Var.a(v5Var);
        }
        return mj.r.f64562a;
    }

    public cj0(w5 w5Var, Context context, a5 a5Var, d11 d11Var) {
        this.f76288a = w5Var;
        this.f76289b = context;
        this.f76290c = a5Var;
        this.f76291d = d11Var;
    }

    public final void a(String str) {
        if (this.f76291d.a(2000, str)) {
            boolean z10 = ad1.f75480a;
        } else {
            boolean z11 = ad1.f75480a;
        }
    }
}
