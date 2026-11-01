package yads;

import android.content.Context;
import com.monetization.ads.mediation.base.initialize.MediatedAdapterInitializer;

/* JADX INFO: loaded from: classes11.dex */
public final class to1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final sp1 f83126a;

    public final MediatedAdapterInitializer a(Context context, qq1 qq1Var, lu2 lu2Var) {
        e00 e00VarA = this.f83126a.a(qq1Var);
        v9 v9Var = null;
        if (e00VarA == null) {
            return null;
        }
        Object objA = new ro1(new xo1(new d4(e00VarA), lu2Var, v9Var)).a(context, qq1Var, com.monetization.ads.mediation.base.a.class);
        if (objA instanceof MediatedAdapterInitializer) {
            return (MediatedAdapterInitializer) objA;
        }
        return null;
    }

    public to1(sp1 sp1Var) {
        this.f83126a = sp1Var;
    }
}
