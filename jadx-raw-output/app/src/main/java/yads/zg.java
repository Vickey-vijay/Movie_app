package yads;

import android.content.Context;

/* JADX INFO: loaded from: classes11.dex */
public final class zg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final sh1 f85382a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dw2 f85383b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Context f85384c;

    public /* synthetic */ zg(Context context) {
        sh1 sh1Var = new sh1();
        Object obj = dw2.f76819j;
        this(context, sh1Var, cw2.a());
    }

    public final boolean a() {
        sh1 sh1Var = this.f85382a;
        Context context = this.f85384c;
        sh1Var.getClass();
        Boolean bool = (Boolean) sh1.a(context, th1.f83042i.f83045b);
        if (bool != null) {
            return bool.booleanValue();
        }
        return true;
    }

    public final boolean b() {
        nt2 nt2VarA = this.f85383b.a(this.f85384c);
        boolean z10 = !(nt2VarA != null && nt2VarA.f80788q0);
        sh1 sh1Var = this.f85382a;
        Context context = this.f85384c;
        sh1Var.getClass();
        Boolean bool = (Boolean) sh1.a(context, th1.f83041h.f83045b);
        return a() && z10 && (bool != null ? bool.booleanValue() : true);
    }

    public final boolean c() {
        nt2 nt2VarA = this.f85383b.a(this.f85384c);
        return a() && (nt2VarA != null && nt2VarA.I);
    }

    public zg(Context context, sh1 sh1Var, dw2 dw2Var) {
        this.f85382a = sh1Var;
        this.f85383b = dw2Var;
        this.f85384c = uz.a(context);
    }
}
