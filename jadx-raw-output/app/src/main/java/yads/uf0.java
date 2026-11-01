package yads;

import android.content.Context;
import android.content.Intent;
import com.safedk.android.utils.Logger;
import com.yandex.mobile.ads.common.AdActivity;
import kotlin.Result;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;

/* JADX INFO: loaded from: classes2.dex */
public final class uf0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final io2 f83454a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p1 f83455b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l2 f83456c;

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ uf0(d4 d4Var, lu2 lu2Var, v9 v9Var) {
        iu3 iu3Var = (iu3) lu2Var;
        this(iu3Var.a(), new p1(d4Var, lu2Var, v9Var), new l2(iu3Var.c()));
    }

    public static void safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(Context p10, Intent p11) {
        Logger.d("SafeDK-Special|SafeDK: Call> Landroid/content/Context;->startActivity(Landroid/content/Intent;)V");
        if (p11 == null) {
            return;
        }
        p10.startActivity(p11);
    }

    public final Object a(Context context, Intent intent, wg2 wg2Var) {
        Object objM3458constructorimpl;
        kotlinx.coroutines.c cVar = new kotlinx.coroutines.c(IntrinsicsKt__IntrinsicsJvmKt.c(wg2Var), 1);
        cVar.J();
        long andIncrement = y21.f84797a.getAndIncrement();
        this.f83456c.f79689a.getClass();
        Intent intent2 = new Intent(context, (Class<?>) AdActivity.class);
        intent2.putExtra("window_type", "window_type_activity_result");
        intent2.putExtra("data_identifier", andIncrement);
        p1 p1Var = this.f83455b;
        sf0 sf0Var = new sf0(cVar);
        tf0 tf0Var = new tf0(cVar);
        p1Var.getClass();
        x1 x1Var = new x1(p1Var.f81202c, p1Var.f81200a, new z9(), p1Var.f81201b, null, 0, new qf0(intent, sf0Var, tf0Var), 48);
        Object obj = z1.f85173b;
        z1 z1VarA = y1.a();
        z1VarA.a(andIncrement, x1Var);
        cVar.p(new rf0(z1VarA, andIncrement));
        try {
            Result.a aVar = Result.Companion;
            safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(context, intent2);
            objM3458constructorimpl = Result.m3458constructorimpl(mj.r.f64562a);
        } catch (Throwable th2) {
            Result.a aVar2 = Result.Companion;
            objM3458constructorimpl = Result.m3458constructorimpl(kotlin.c.a(th2));
        }
        Throwable thM3461exceptionOrNullimpl = Result.m3461exceptionOrNullimpl(objM3458constructorimpl);
        if (thM3461exceptionOrNullimpl != null) {
            z1VarA.a(andIncrement);
            this.f83454a.reportError("Failed to launch AdActivity for result", thM3461exceptionOrNullimpl);
            if (cVar.isActive()) {
                cVar.resumeWith(Result.m3458constructorimpl(kotlin.c.a(thM3461exceptionOrNullimpl)));
            }
        }
        Object objB = cVar.B();
        if (objB == sj.a.f()) {
            tj.f.c(wg2Var);
        }
        return objB == sj.a.f() ? objB : mj.r.f64562a;
    }

    public uf0(io2 io2Var, p1 p1Var, l2 l2Var) {
        this.f83454a = io2Var;
        this.f83455b = p1Var;
        this.f83456c = l2Var;
    }
}
