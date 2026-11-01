package yads;

import android.os.Handler;
import android.view.View;

/* JADX INFO: loaded from: classes4.dex */
public final class eq0 implements Runnable {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ jk.k[] f77168f = {wb.a(eq0.class, "exposureUpdateListenerReference", "getExposureUpdateListenerReference()Lcom/monetization/ads/base/webview/mraid/exposure/OnExposureUpdateListener;", 0), wb.a(eq0.class, "viewReference", "getViewReference()Landroid/view/View;", 0)};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Handler f77169b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final cq0 f77170c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final lm2 f77171d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final lm2 f77172e;

    @Override // java.lang.Runnable
    public final void run() {
        lm2 lm2Var = this.f77172e;
        jk.k[] kVarArr = f77168f;
        jk.k kVar = kVarArr[1];
        View view = (View) lm2Var.f79854a.get();
        lm2 lm2Var2 = this.f77171d;
        jk.k kVar2 = kVarArr[0];
        ka2 ka2Var = (ka2) lm2Var2.f79854a.get();
        if (view == null || ka2Var == null) {
            return;
        }
        bq0 bq0VarA = this.f77170c.a(view);
        wv1 wv1Var = (wv1) ka2Var;
        if (!ck.p.e(bq0VarA, wv1Var.f84349r)) {
            wv1Var.f84349r = bq0VarA;
            wv1Var.f84333b.a(new dq0(bq0VarA.f75930a, bq0VarA.f75931b));
        }
        this.f77169b.postDelayed(this, 200L);
    }

    public eq0(Handler handler, View view, cq0 cq0Var, ka2 ka2Var) {
        this.f77169b = handler;
        this.f77170c = cq0Var;
        this.f77171d = mm2.a(ka2Var);
        this.f77172e = mm2.a(view);
    }
}
