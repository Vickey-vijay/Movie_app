package z2;

import android.util.Log;
import androidx.annotation.NonNull;
import com.google.ads.mediation.mintegral.MintegralMediationAdapter;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationInterstitialAd;
import com.google.android.gms.ads.mediation.MediationInterstitialAdCallback;
import com.google.android.gms.ads.mediation.MediationInterstitialAdConfiguration;
import com.mbridge.msdk.newinterstitial.out.NewInterstitialWithCodeListener;
import com.mbridge.msdk.out.MBridgeIds;
import com.mbridge.msdk.out.RewardInfo;
import y2.i;
import y2.k;

/* JADX INFO: compiled from: MintegralInterstitialAd.java */
/* JADX INFO: loaded from: classes7.dex */
public abstract class c extends NewInterstitialWithCodeListener implements MediationInterstitialAd {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final MediationAdLoadCallback<MediationInterstitialAd, MediationInterstitialAdCallback> f85903b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public i f85904c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public MediationInterstitialAdCallback f85905d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f85906e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final y2.a f85907f;

    @Override // com.mbridge.msdk.newinterstitial.out.NewInterstitialListener
    public void onAdCloseWithNIReward(MBridgeIds mBridgeIds, RewardInfo rewardInfo) {
    }

    @Override // com.mbridge.msdk.newinterstitial.out.NewInterstitialListener
    public void onEndcardShow(MBridgeIds mBridgeIds) {
    }

    @Override // com.mbridge.msdk.newinterstitial.out.NewInterstitialListener
    public void onLoadCampaignSuccess(MBridgeIds mBridgeIds) {
    }

    @Override // com.mbridge.msdk.newinterstitial.out.NewInterstitialListener
    public void onVideoComplete(MBridgeIds mBridgeIds) {
    }

    @Override // com.mbridge.msdk.newinterstitial.out.NewInterstitialListener
    public void onAdClicked(MBridgeIds mBridgeIds) {
        MediationInterstitialAdCallback mediationInterstitialAdCallback = this.f85905d;
        if (mediationInterstitialAdCallback != null) {
            mediationInterstitialAdCallback.reportAdClicked();
        }
    }

    @Override // com.mbridge.msdk.newinterstitial.out.NewInterstitialListener
    public void onAdClose(MBridgeIds mBridgeIds, RewardInfo rewardInfo) {
        MediationInterstitialAdCallback mediationInterstitialAdCallback = this.f85905d;
        if (mediationInterstitialAdCallback != null) {
            mediationInterstitialAdCallback.onAdClosed();
        }
    }

    @Override // com.mbridge.msdk.newinterstitial.out.NewInterstitialListener
    public void onAdShow(MBridgeIds mBridgeIds) {
        i iVar;
        if (this.f85907f.a() && (iVar = this.f85904c) != null) {
            MintegralMediationAdapter.loadedSlotIdentifiers.remove(iVar);
        }
        MediationInterstitialAdCallback mediationInterstitialAdCallback = this.f85905d;
        if (mediationInterstitialAdCallback != null) {
            mediationInterstitialAdCallback.onAdOpened();
            this.f85905d.reportAdImpression();
        }
    }

    @Override // com.mbridge.msdk.newinterstitial.out.NewInterstitialWithCodeListener
    public void onResourceLoadFailWithCode(MBridgeIds mBridgeIds, int i10, String str) {
        i iVar;
        if (this.f85907f.a() && (iVar = this.f85904c) != null) {
            MintegralMediationAdapter.loadedSlotIdentifiers.remove(iVar);
        }
        AdError adErrorB = y2.d.b(i10, str);
        Log.w(MintegralMediationAdapter.TAG, adErrorB.toString());
        this.f85903b.onFailure(adErrorB);
    }

    @Override // com.mbridge.msdk.newinterstitial.out.NewInterstitialListener
    public void onResourceLoadSuccess(MBridgeIds mBridgeIds) {
        this.f85905d = this.f85903b.onSuccess(this);
    }

    @Override // com.mbridge.msdk.newinterstitial.out.NewInterstitialWithCodeListener
    public void onShowFailWithCode(MBridgeIds mBridgeIds, int i10, String str) {
        i iVar;
        if (this.f85907f.a() && (iVar = this.f85904c) != null) {
            MintegralMediationAdapter.loadedSlotIdentifiers.remove(iVar);
        }
        AdError adErrorB = y2.d.b(i10, str);
        Log.w(MintegralMediationAdapter.TAG, adErrorB.toString());
        MediationInterstitialAdCallback mediationInterstitialAdCallback = this.f85905d;
        if (mediationInterstitialAdCallback != null) {
            mediationInterstitialAdCallback.onAdFailedToShow(adErrorB);
        }
    }

    public c(@NonNull MediationInterstitialAdConfiguration mediationInterstitialAdConfiguration, @NonNull MediationAdLoadCallback<MediationInterstitialAd, MediationInterstitialAdCallback> mediationAdLoadCallback, y2.a aVar) {
        this.f85906e = k.f(mediationInterstitialAdConfiguration.getMediationExtras());
        this.f85903b = mediationAdLoadCallback;
        this.f85907f = aVar;
    }
}
