package yads;

import android.content.Context;
import android.content.Intent;
import com.safedk.android.utils.Logger;
import kotlin.Result;

/* JADX INFO: loaded from: classes11.dex */
public final class ky0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final io2 f79622a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final jy0 f79623b;

    public ky0(io2 io2Var, jy0 jy0Var) {
        this.f79622a = io2Var;
        this.f79623b = jy0Var;
    }

    public static void safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(Context p10, Intent p11) {
        Logger.d("SafeDK-Special|SafeDK: Call> Landroid/content/Context;->startActivity(Landroid/content/Intent;)V");
        if (p11 == null) {
            return;
        }
        p10.startActivity(p11);
    }

    public final Object a(Context context, x1 x1Var) {
        Object objM3458constructorimpl;
        long jA = y21.a();
        Intent intentA = this.f79623b.a(context, jA);
        Object obj = z1.f85173b;
        z1 z1VarA = y1.a();
        z1VarA.a(jA, x1Var);
        try {
            Result.a aVar = Result.Companion;
            safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(context, intentA);
            objM3458constructorimpl = Result.m3458constructorimpl(mj.r.f64562a);
        } catch (Throwable th2) {
            Result.a aVar2 = Result.Companion;
            objM3458constructorimpl = Result.m3458constructorimpl(kotlin.c.a(th2));
        }
        Throwable thM3461exceptionOrNullimpl = Result.m3461exceptionOrNullimpl(objM3458constructorimpl);
        if (thM3461exceptionOrNullimpl != null) {
            z1VarA.a(jA);
            lc1.a("Failed to show Fullscreen Ad. Exception: " + thM3461exceptionOrNullimpl, new Object[0]);
            this.f79622a.reportError("Failed to show Fullscreen Ad", thM3461exceptionOrNullimpl);
        }
        return objM3458constructorimpl;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ ky0(lu2 lu2Var) {
        iu3 iu3Var = (iu3) lu2Var;
        this(iu3Var.a(), new jy0(iu3Var.c()));
    }
}
