package h;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.LoadAdError;
import com.yk.e.callBack.MainMRECCallBack;
import com.yk.e.util.AdLog;

/* JADX INFO: loaded from: classes10.dex */
public final class g extends AdListener {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ n f53653c;

    public g(n nVar) {
        this.f53653c = nVar;
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdClicked() {
        super.onAdClicked();
        MainMRECCallBack mainMRECCallBack = this.f53653c.F;
        if (mainMRECCallBack != null) {
            mainMRECCallBack.onAdClick();
        }
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdClosed() {
        super.onAdClosed();
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdFailedToLoad(LoadAdError loadAdError) {
        super.onAdFailedToLoad(loadAdError);
        this.f53653c.v(loadAdError.getCode() + ", " + loadAdError.getMessage());
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdImpression() {
        super.onAdImpression();
        n nVar = this.f53653c;
        MainMRECCallBack mainMRECCallBack = nVar.F;
        if (mainMRECCallBack != null) {
            mainMRECCallBack.onAdShow(nVar.I);
        }
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdLoaded() {
        super.onAdLoaded();
        n nVar = this.f53653c;
        if (nVar.J) {
            return;
        }
        nVar.J = true;
        nVar.G.setOnPaidEventListener(new a(this));
        n nVar2 = this.f53653c;
        MainMRECCallBack mainMRECCallBack = nVar2.F;
        if (mainMRECCallBack != null) {
            mainMRECCallBack.onAdLoaded(nVar2.H);
        }
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdOpened() {
        super.onAdOpened();
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdSwipeGestureClicked() {
        super.onAdSwipeGestureClicked();
        AdLog.d(this.f53653c.E, "onAdSwipeGestureClicked");
    }
}
