package yads;

import android.content.Context;

/* JADX INFO: loaded from: classes4.dex */
public final class rw0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mw0 f82445a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final hx0 f82446b;

    public /* synthetic */ rw0(Context context) {
        this(new mw0(context), new hx0(context));
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0096  */
    /* JADX WARN: Code duplicated, block: B:35:0x0098 A[Catch: Exception -> 0x00a2, TRY_LEAVE, TryCatch #0 {Exception -> 0x00a2, blocks: (B:13:0x002d, B:32:0x008a, B:35:0x0098, B:18:0x003d, B:28:0x0069, B:24:0x0055), top: B:40:0x0023 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(dn2 dn2Var, rj.c cVar) throws Throwable {
        nw0 nw0Var;
        rw0 rw0Var;
        rw0 rw0Var2;
        if (cVar instanceof nw0) {
            nw0Var = (nw0) cVar;
            int i10 = nw0Var.f80840f;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                nw0Var.f80840f = i10 - Integer.MIN_VALUE;
            } else {
                nw0Var = new nw0(this, cVar);
            }
        } else {
            nw0Var = new nw0(this, cVar);
        }
        Object objA = nw0Var.f80838d;
        Object objF = sj.a.f();
        int i11 = nw0Var.f80840f;
        boolean z10 = false;
        try {
            if (i11 != 0) {
                if (i11 == 1) {
                    dn2Var = nw0Var.f80837c;
                    rw0Var = nw0Var.f80836b;
                    kotlin.c.b(objA);
                } else {
                    if (i11 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    dn2Var = nw0Var.f80837c;
                    rw0Var2 = nw0Var.f80836b;
                    kotlin.c.b(objA);
                }
                if (rw0Var2.f82446b.a(dn2Var.a()) != null) {
                    z10 = true;
                } else {
                    dn2Var.a().name();
                    boolean z11 = ad1.f75480a;
                }
                return tj.a.a(z10);
            }
            kotlin.c.b(objA);
            if (this.f82446b.a(dn2Var.a()) != null) {
                return tj.a.a(true);
            }
            mw0 mw0Var = this.f82445a;
            String strB = dn2Var.b();
            nw0Var.f80836b = this;
            nw0Var.f80837c = dn2Var;
            nw0Var.f80840f = 1;
            objA = mw0Var.a(strB, nw0Var);
            if (objA == objF) {
                return objF;
            }
            rw0Var = this;
            sw0 sw0VarA = dn2Var.a();
            nw0Var.f80836b = rw0Var;
            nw0Var.f80837c = dn2Var;
            nw0Var.f80840f = 2;
            rw0Var.getClass();
            if (nk.h.g(nk.w0.b(), new qw0((byte[]) objA, rw0Var, sw0VarA, null), nw0Var) == objF) {
                return objF;
            }
            rw0Var2 = rw0Var;
            if (rw0Var2.f82446b.a(dn2Var.a()) != null) {
                z10 = true;
            } else {
                dn2Var.a().name();
                boolean z12 = ad1.f75480a;
            }
            return tj.a.a(z10);
        } catch (Exception unused) {
            boolean z13 = ad1.f75480a;
        }
    }

    public rw0(mw0 mw0Var, hx0 hx0Var) {
        this.f82445a = mw0Var;
        this.f82446b = hx0Var;
    }
}
