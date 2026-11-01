package z2;

import android.util.Log;
import androidx.annotation.NonNull;
import com.google.ads.mediation.mintegral.MintegralMediationAdapter;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationAppOpenAd;
import com.google.android.gms.ads.mediation.MediationAppOpenAdCallback;
import com.mbridge.msdk.out.MBSplashLoadWithCodeListener;
import com.mbridge.msdk.out.MBSplashShowListener;
import com.mbridge.msdk.out.MBridgeIds;
import y2.i;
import y2.j;

/* JADX INFO: compiled from: MintegralAppOpenAd.java */
/* JADX INFO: loaded from: classes7.dex */
public abstract class a extends MBSplashLoadWithCodeListener implements MediationAppOpenAd, MBSplashShowListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final MediationAdLoadCallback<MediationAppOpenAd, MediationAppOpenAdCallback> f85895b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public i f85896c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public MediationAppOpenAdCallback f85897d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public j f85898e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final y2.a f85899f;

    @Override // com.mbridge.msdk.out.MBSplashLoadListener
    public void isSupportZoomOut(MBridgeIds mBridgeIds, boolean z10) {
    }

    @Override // com.mbridge.msdk.out.MBSplashShowListener
    public void onAdTick(MBridgeIds mBridgeIds, long j10) {
    }

    @Override // com.mbridge.msdk.out.MBSplashShowListener
    public void onZoomOutPlayFinish(MBridgeIds mBridgeIds) {
    }

    @Override // com.mbridge.msdk.out.MBSplashShowListener
    public void onZoomOutPlayStart(MBridgeIds mBridgeIds) {
    }

    @Override // com.mbridge.msdk.out.MBSplashShowListener
    public void onAdClicked(MBridgeIds mBridgeIds) {
        MediationAppOpenAdCallback mediationAppOpenAdCallback = this.f85897d;
        if (mediationAppOpenAdCallback != null) {
            mediationAppOpenAdCallback.reportAdClicked();
        }
    }

    @Override // com.mbridge.msdk.out.MBSplashShowListener
    public void onDismiss(MBridgeIds mBridgeIds, int i10) {
        MediationAppOpenAdCallback mediationAppOpenAdCallback = this.f85897d;
        if (mediationAppOpenAdCallback != null) {
            mediationAppOpenAdCallback.onAdClosed();
        }
        j jVar = this.f85898e;
        if (jVar != null) {
            jVar.onDestroy();
        }
    }

    @Override // com.mbridge.msdk.out.MBSplashLoadWithCodeListener
    public void onLoadFailedWithCode(MBridgeIds mBridgeIds, int i10, String str, int i11) {
        i iVar;
        if (this.f85899f.a() && (iVar = this.f85896c) != null) {
            MintegralMediationAdapter.loadedSlotIdentifiers.remove(iVar);
        }
        AdError adErrorB = y2.d.b(i10, str);
        Log.d(MintegralMediationAdapter.TAG, adErrorB.toString());
        this.f85895b.onFailure(adErrorB);
    }

    @Override // com.mbridge.msdk.out.MBSplashLoadListener
    public void onLoadSuccessed(MBridgeIds mBridgeIds, int i10) {
        this.f85897d = this.f85895b.onSuccess(this);
    }

    @Override // com.mbridge.msdk.out.MBSplashShowListener
    public void onShowFailed(MBridgeIds mBridgeIds, String str) {
        i iVar;
        if (this.f85899f.a() && (iVar = this.f85896c) != null) {
            MintegralMediationAdapter.loadedSlotIdentifiers.remove(iVar);
        }
        if (this.f85897d != null) {
            AdError adErrorB = y2.d.b(100, str);
            Log.w(MintegralMediationAdapter.TAG, adErrorB.toString());
            this.f85897d.onAdFailedToShow(adErrorB);
        }
    }

    @Override // com.mbridge.msdk.out.MBSplashShowListener
    public void onShowSuccessed(MBridgeIds mBridgeIds) {
        i iVar;
        if (this.f85899f.a() && (iVar = this.f85896c) != null) {
            MintegralMediationAdapter.loadedSlotIdentifiers.remove(iVar);
        }
        MediationAppOpenAdCallback mediationAppOpenAdCallback = this.f85897d;
        if (mediationAppOpenAdCallback != null) {
            mediationAppOpenAdCallback.onAdOpened();
            this.f85897d.reportAdImpression();
        }
    }

    public a(@NonNull MediationAdLoadCallback<MediationAppOpenAd, MediationAppOpenAdCallback> mediationAdLoadCallback, y2.a aVar) {
        this.f85895b = mediationAdLoadCallback;
        this.f85899f = aVar;
    }
}
