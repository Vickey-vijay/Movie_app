package yads;

import android.app.Activity;
import android.content.Intent;
import com.safedk.android.utils.Logger;
import java.util.Map;
import kotlin.Result;

/* JADX INFO: loaded from: classes11.dex */
public final class m2 implements h2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Activity f80030a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final x1 f80031b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final q1 f80032c;

    public static void safedk_Activity_startActivityForResult_206f42f0b65887e835d87ee52d14d221(Activity p10, Intent p11, int p12) {
        Logger.d("SafeDK-Special|SafeDK: Call> Landroid/app/Activity;->startActivityForResult(Landroid/content/Intent;I)V");
        if (p11 == null) {
            return;
        }
        p10.startActivityForResult(p11, p12);
    }

    @Override // yads.h2
    public final void a() {
    }

    @Override // yads.h2
    public final void b() {
    }

    @Override // yads.h2
    public final boolean d() {
        return true;
    }

    @Override // yads.h2
    public final void f() {
    }

    @Override // yads.h2
    public final void g() {
    }

    @Override // yads.h2
    public final void onAdClosed() {
    }

    @Override // yads.h2
    public final void c() {
        Object objM3458constructorimpl;
        q1 q1Var = this.f80032c;
        Activity activity = this.f80030a;
        x1 x1Var = this.f80031b;
        q1Var.getClass();
        qf0 qf0Var = x1Var.f84410g;
        if (qf0Var == null) {
            return;
        }
        try {
            Result.a aVar = Result.Companion;
            safedk_Activity_startActivityForResult_206f42f0b65887e835d87ee52d14d221(activity, qf0Var.f81844a, 0);
            mj.r rVar = mj.r.f64562a;
            r1 r1Var = q1Var.f81675a;
            fo2 fo2VarA = r1Var.f82068b.a(x1Var.f84404a, x1Var.f84405b);
            co2 co2Var = co2.H;
            Map map = fo2VarA.f77471a;
            r1Var.f82067a.a(new eo2(co2Var.a(), kotlin.collections.a.B(map), fo2VarA.f77472b));
            qf0Var.f81845b.invoke();
            activity.finish();
            objM3458constructorimpl = Result.m3458constructorimpl(rVar);
        } catch (Throwable th2) {
            Result.a aVar2 = Result.Companion;
            objM3458constructorimpl = Result.m3458constructorimpl(kotlin.c.a(th2));
        }
        Throwable thM3461exceptionOrNullimpl = Result.m3461exceptionOrNullimpl(objM3458constructorimpl);
        if (thM3461exceptionOrNullimpl != null) {
            activity.finish();
            q1Var.f81675a.f82067a.reportError("Failed to register ActivityResult", thM3461exceptionOrNullimpl);
            qf0Var.f81846c.invoke(thM3461exceptionOrNullimpl);
        }
    }

    public m2(Activity activity, x1 x1Var, q1 q1Var) {
        this.f80030a = activity;
        this.f80031b = x1Var;
        this.f80032c = q1Var;
    }
}
