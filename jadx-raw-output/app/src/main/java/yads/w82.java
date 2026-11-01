package yads;

import android.content.Context;
import android.util.DisplayMetrics;

/* JADX INFO: loaded from: classes2.dex */
public final class w82 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final s82 f84125d = new s82();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static volatile w82 f84126e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d03 f84127a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dk0 f84128b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final pa3 f84129c;

    public static v82 a(Context context) {
        int iG;
        try {
            int iMaxMemory = (int) (Runtime.getRuntime().maxMemory() / ((long) 1024));
            DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
            iG = ik.k.g(iMaxMemory / 8, ((int) (((displayMetrics.widthPixels * displayMetrics.heightPixels) * displayMetrics.density) / 1024)) * 3);
        } catch (IllegalArgumentException unused) {
            boolean z10 = ad1.f75480a;
            iG = 5120;
        }
        return new v82(ik.k.d(iG, 5120));
    }

    public final d03 b() {
        return this.f84127a;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x001f  */
    public static cp2 b(Context context) {
        int iIntValue;
        Integer num;
        Object obj = dw2.f76819j;
        nt2 nt2VarA = cw2.a().a(context);
        if (nt2VarA == null || (num = nt2VarA.f80792s0) == null) {
            iIntValue = 4;
        } else {
            if (num.intValue() == 0) {
                num = null;
            }
            if (num != null) {
                iIntValue = num.intValue();
            } else {
                iIntValue = 4;
            }
        }
        cp2 cp2VarA = dp2.a(context, iIntValue);
        cp2VarA.a();
        return cp2VarA;
    }

    public final pa3 c() {
        return this.f84129c;
    }

    public w82(Context context, k31 k31Var) {
        v82 v82VarA = a(context);
        cp2 cp2VarB = b(context);
        t82 t82Var = new t82(v82VarA);
        this.f84129c = new pa3(v82VarA, k31Var);
        this.f84127a = new d03(cp2VarB, t82Var, k31Var);
        this.f84128b = new dk0(cp2VarB, context);
    }

    public final dk0 a() {
        return this.f84128b;
    }
}
