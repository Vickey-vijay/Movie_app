package yads;

import android.content.Context;

/* JADX INFO: loaded from: classes7.dex */
public final class ie0 implements s52 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f78602a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d4 f78603b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final lu2 f78604c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final v9 f78605d;

    @Override // yads.s52
    public final p52 a() {
        Context context = this.f78602a;
        d4 d4Var = this.f78603b;
        lu2 lu2Var = this.f78604c;
        v9 v9Var = this.f78605d;
        Object obj = dw2.f76819j;
        nt2 nt2VarA = cw2.a().a(context);
        Context applicationContext = context.getApplicationContext();
        zd0 zd0Var = null;
        md2 md2Var = nt2VarA != null ? nt2VarA.L0 : null;
        if (md2Var != null) {
            Integer num = md2Var.f80142a;
            int iIntValue = num != null ? num.intValue() : 50000;
            Integer num2 = md2Var.f80143b;
            int iIntValue2 = num2 != null ? num2.intValue() : 50000;
            Integer num3 = md2Var.f80144c;
            int iIntValue3 = num3 != null ? num3.intValue() : 2500;
            Integer num4 = md2Var.f80145d;
            int iIntValue4 = num4 != null ? num4.intValue() : 5000;
            zd0.a(iIntValue3, 0, "bufferForPlaybackMs", "0");
            zd0.a(iIntValue4, 0, "bufferForPlaybackAfterRebufferMs", "0");
            zd0.a(iIntValue, iIntValue3, "minBufferMs", "bufferForPlaybackMs");
            zd0.a(iIntValue, iIntValue4, "minBufferMs", "bufferForPlaybackAfterRebufferMs");
            zd0.a(iIntValue2, iIntValue, "maxBufferMs", "minBufferMs");
            Integer num5 = md2Var.f80146e;
            zd0Var = new zd0(new ib0(0), iIntValue, iIntValue2, iIntValue3, iIntValue4, num5 != null ? num5.intValue() : -1, true);
        }
        rn0 rn0Var = new rn0(applicationContext);
        pe0 pe0Var = new pe0(applicationContext);
        pe0Var.f81384d = true;
        rn0 rn0VarC = rn0Var.c(pe0Var);
        if (zd0Var != null) {
            rn0VarC.a(zd0Var);
        }
        if (!(!rn0VarC.f82340r)) {
            throw new IllegalStateException();
        }
        rn0VarC.f82340r = true;
        return new sp0(new zn0(rn0VarC), new ln1(applicationContext, new jn1()), new qi3(applicationContext, d4Var, lu2Var, v9Var), new o52(), new fj3());
    }

    public ie0(Context context, v9 v9Var, lu2 lu2Var, d4 d4Var) {
        this.f78602a = context;
        this.f78603b = d4Var;
        this.f78604c = lu2Var;
        this.f78605d = v9Var;
    }
}
