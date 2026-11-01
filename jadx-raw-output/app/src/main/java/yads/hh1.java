package yads;

import android.content.Context;

/* JADX INFO: loaded from: classes2.dex */
public final class hh1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fh1 f78235a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final gc2 f78236b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public gh1 f78237c;

    public /* synthetic */ hh1(Context context, String str) {
        this(new fh1(context, str), new gc2(context), null);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x002f  */
    public final gh1 a() {
        Class<?> cls;
        yy0 yy0Var;
        Object objA;
        fh1 fh1Var = this.f78235a;
        pm2 pm2Var = fh1Var.f77401b;
        String str = fh1Var.f77400a;
        pm2Var.getClass();
        try {
            cls = Class.forName(str);
        } catch (Throwable unused) {
            boolean z10 = ad1.f75480a;
            cls = null;
        }
        if (cls != null) {
            pm2 pm2Var2 = fh1Var.f77401b;
            Object[] objArr = {fh1Var.f77402c};
            pm2Var2.getClass();
            Object objA2 = pm2.a(cls, "getFusedLocationProviderClient", objArr);
            if (objA2 != null) {
                yy0Var = new yy0(objA2);
            } else {
                yy0Var = null;
            }
        } else {
            yy0Var = null;
        }
        if (yy0Var == null) {
            return null;
        }
        boolean zA = this.f78236b.a("android.permission.ACCESS_COARSE_LOCATION");
        boolean zA2 = this.f78236b.a("android.permission.ACCESS_FINE_LOCATION");
        if ((zA || zA2) && (objA = om2.a(yy0Var.f85146a, "getLastLocation", new Object[0])) != null) {
            return new gh1(objA);
        }
        return null;
    }

    public hh1(fh1 fh1Var, gc2 gc2Var, gh1 gh1Var) {
        this.f78235a = fh1Var;
        this.f78236b = gc2Var;
        this.f78237c = gh1Var;
    }
}
