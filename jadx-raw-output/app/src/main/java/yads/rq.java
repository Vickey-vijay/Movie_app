package yads;

import android.content.Context;
import android.content.Intent;
import com.safedk.android.utils.Logger;

/* JADX INFO: loaded from: classes11.dex */
public final class rq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final lu2 f82388a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final io2 f82389b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final qq f82390c;

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ rq(lu2 lu2Var) {
        iu3 iu3Var = (iu3) lu2Var;
        this(lu2Var, iu3Var.a(), new qq(iu3Var.c()));
    }

    public static void safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(Context p10, Intent p11) {
        Logger.d("SafeDK-Special|SafeDK: Call> Landroid/content/Context;->startActivity(Landroid/content/Intent;)V");
        if (p11 == null) {
            return;
        }
        p10.startActivity(p11);
    }

    public final boolean a(Context context, v9 v9Var, z9 z9Var, d4 d4Var, String str) {
        Object obj = z1.f85173b;
        z1 z1VarA = y1.a();
        long jA = y21.a();
        Intent intentA = this.f82390c.a(context, str, jA);
        z1VarA.a(jA, new x1(v9Var, d4Var, z9Var, this.f82388a, null, 0, null, 112));
        try {
            safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(context, intentA);
            return true;
        } catch (Exception e10) {
            z1VarA.a(jA);
            e10.toString();
            boolean z10 = ad1.f75480a;
            this.f82389b.reportError("Failed to show Browser", e10);
            return false;
        }
    }

    public rq(lu2 lu2Var, io2 io2Var, qq qqVar) {
        this.f82388a = lu2Var;
        this.f82389b = io2Var;
        this.f82390c = qqVar;
    }
}
