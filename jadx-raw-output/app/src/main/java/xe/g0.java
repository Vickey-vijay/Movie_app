package xe;

import android.app.Activity;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.ads.MaxInterstitialAd;
import com.yk.e.inf.IComCallback;
import com.yk.e.util.AdLog;
import gl.m1;

/* JADX INFO: loaded from: classes2.dex */
public final class g0 implements IComCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Activity f74445a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ t f74446b;

    public g0(t tVar, Activity activity) {
        this.f74446b = tVar;
        this.f74445a = activity;
    }

    @Override // com.yk.e.inf.IComCallback
    public final void onFailed(int i10, String str) {
        this.f74446b.x(str);
    }

    @Override // com.yk.e.inf.IComCallback
    public final void onSuccess() {
        m1 m1Var;
        gl.x xVarA = gl.x.a();
        String str = this.f74446b.H;
        synchronized (xVarA) {
            m1 m1Var2 = null;
            try {
                m1Var = (m1) xVarA.f53609a.get(str);
                if (m1Var != null) {
                    try {
                        AdLog.d(xVarA.f53610b, "has cache, unitID " + str);
                        xVarA.f53609a.remove(str);
                    } catch (Exception e10) {
                        e = e10;
                        m1Var2 = m1Var;
                        AdLog.e(e.getMessage(), e);
                        m1Var = m1Var2;
                    }
                }
            } catch (Exception e11) {
                e = e11;
            }
        }
        if (m1Var != null) {
            t tVar = this.f74446b;
            MaxInterstitialAd maxInterstitialAd = m1Var.f53538a;
            tVar.D = maxInterstitialAd;
            MaxAd maxAd = m1Var.f53539b;
            if (maxInterstitialAd.isReady() && maxAd != null) {
                t tVar2 = this.f74446b;
                tVar2.D.setListener(tVar2.I);
                this.f74446b.I.onAdLoaded(maxAd);
                return;
            }
        }
        this.f74446b.D = new MaxInterstitialAd(this.f74446b.H, this.f74445a);
        t tVar3 = this.f74446b;
        tVar3.D.setListener(tVar3.I);
        this.f74446b.D.loadAd();
    }
}
