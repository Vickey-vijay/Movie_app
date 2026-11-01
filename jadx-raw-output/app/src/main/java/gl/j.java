package gl;

import android.app.Activity;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.nativeAds.MaxNativeAdLoader;
import com.yk.e.inf.IComCallback;
import com.yk.e.util.AdLog;
import com.yk.e.util.UsLocalSaveHelper;

/* JADX INFO: loaded from: classes11.dex */
public final class j implements IComCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Activity f53507a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ n0 f53508b;

    public j(n0 n0Var, Activity activity) {
        this.f53508b = n0Var;
        this.f53507a = activity;
    }

    @Override // com.yk.e.inf.IComCallback
    public final void onFailed(int i10, String str) {
        n0.c(this.f53508b, str);
    }

    @Override // com.yk.e.inf.IComCallback
    public final void onSuccess() {
        d0 d0Var;
        boolean zIsExpired;
        m mVarA = m.a();
        String str = this.f53508b.f53544b;
        synchronized (mVarA) {
            d0 d0Var2 = null;
            try {
                d0Var = (d0) mVarA.f53536a.get(str);
                if (d0Var != null) {
                    try {
                        AdLog.d("OktMaxNativeCacheUtil", "has cache, adPlcId " + str);
                        mVarA.f53536a.remove(str);
                    } catch (Exception e10) {
                        e = e10;
                        d0Var2 = d0Var;
                        AdLog.e(e.getMessage(), e);
                        d0Var = d0Var2;
                    }
                }
            } catch (Exception e11) {
                e = e11;
            }
        }
        this.f53508b.d("useNativeCache " + UsLocalSaveHelper.getInstance().useNativeCache());
        if (d0Var != null && UsLocalSaveHelper.getInstance().useNativeCache()) {
            n0 n0Var = this.f53508b;
            n0Var.f53558p = d0Var.f53470a;
            MaxAd maxAd = d0Var.f53472c;
            n0Var.f53560r = maxAd;
            if (maxAd.getNativeAd() == null) {
                zIsExpired = true;
            } else {
                zIsExpired = this.f53508b.f53560r.getNativeAd().isExpired();
            }
            this.f53508b.d("nativeCache isExpired = " + zIsExpired);
            MaxNativeAdLoader maxNativeAdLoader = this.f53508b.f53558p;
            if (maxNativeAdLoader != null && !zIsExpired) {
                maxNativeAdLoader.setRevenueListener(new m0(this));
                n0 n0Var2 = this.f53508b;
                n0Var2.f53558p.setNativeAdListener(n0Var2.f53566x);
                this.f53508b.f53566x.onNativeAdLoaded(d0Var.f53471b, d0Var.f53472c);
                return;
            }
        }
        n0 n0Var3 = this.f53508b;
        n0Var3.f53558p = new MaxNativeAdLoader(n0Var3.f53565w, this.f53507a);
        this.f53508b.f53558p.setRevenueListener(new e(this));
        n0 n0Var4 = this.f53508b;
        n0Var4.f53558p.setNativeAdListener(n0Var4.f53566x);
        n0 n0Var5 = this.f53508b;
        n0Var5.f53558p.setPlacement(n0Var5.f53544b);
        n0 n0Var6 = this.f53508b;
        n0Var6.f53558p.loadAd(n0.a(n0Var6).f51760b);
    }
}
