package yads;

import android.content.Context;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes9.dex */
public final class sv2 implements w22 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ jk.k[] f82769f = {wb.a(sv2.class, "nativeAdLoadManager", "getNativeAdLoadManager()Lcom/monetization/ads/nativeads/NativeAdLoadManager;", 0)};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d4 f82770a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final mv2 f82771b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final lm2 f82772c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final zs2 f82773d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final d22 f82774e;

    @Override // yads.w22
    public final void a(Context context, v9 v9Var) {
        lm2 lm2Var = this.f82772c;
        jk.k kVar = f82769f[0];
        m02 m02Var = (m02) lm2Var.f79854a.get();
        if (m02Var != null) {
            m02Var.f85496b.a(v5.f83743c, null);
            d12 d12Var = (d12) v9Var.f83828t;
            d4 d4Var = this.f82770a;
            f22 f22Var = new f22();
            this.f82773d.a(context, v9Var, this.f82774e);
            zs2 zs2Var = this.f82773d;
            zs2Var.getClass();
            Map mapJ = kotlin.collections.a.j();
            if ((ck.x.m(mapJ) ? mapJ : null) == null) {
                new LinkedHashMap();
            }
            fo2 fo2VarA = f22Var.a(v9Var, d4Var, d12Var);
            do2 do2Var = do2.f76756c;
            fo2VarA.b("success", "status");
            zs2Var.a(context, v9Var, co2.f76357h, fo2VarA);
            xz1 xz1VarA = this.f82771b.a(v9Var);
            if (m02Var.f85512r == z5.f85211b) {
                return;
            }
            d12 d12Var2 = (d12) v9Var.f83828t;
            mz1 mz1Var = m02Var.B;
            nk.j.d(mz1Var.f80481d, null, null, new lz1(mz1Var, v9Var, d12Var2, xz1VarA, m02Var.C, null), 3, null);
        }
    }

    public sv2(m02 m02Var, d4 d4Var, mv2 mv2Var) {
        this.f82770a = d4Var;
        this.f82771b = mv2Var;
        this.f82772c = mm2.a(m02Var);
        this.f82773d = new zs2(m02Var.e(), m02Var.h());
        this.f82774e = new d22(m02Var.e());
    }
}
