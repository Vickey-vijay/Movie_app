package xe;

import com.mbridge.msdk.newinterstitial.out.NewInterstitialListener;
import com.mbridge.msdk.out.MBridgeIds;
import com.mbridge.msdk.out.RewardInfo;
import com.yk.e.util.AdLog;
import gl.r0;

/* JADX INFO: loaded from: classes2.dex */
public final class o implements NewInterstitialListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m f74458b;

    @Override // com.mbridge.msdk.newinterstitial.out.NewInterstitialListener
    public final void onAdCloseWithNIReward(MBridgeIds mBridgeIds, RewardInfo rewardInfo) {
    }

    @Override // com.mbridge.msdk.newinterstitial.out.NewInterstitialListener
    public final void onEndcardShow(MBridgeIds mBridgeIds) {
    }

    @Override // com.mbridge.msdk.newinterstitial.out.NewInterstitialListener
    public final void onVideoComplete(MBridgeIds mBridgeIds) {
    }

    public o(m mVar) {
        this.f74458b = mVar;
    }

    @Override // com.mbridge.msdk.newinterstitial.out.NewInterstitialListener
    public final void onAdClicked(MBridgeIds mBridgeIds) {
        this.f74458b.C.onAdClick();
    }

    @Override // com.mbridge.msdk.newinterstitial.out.NewInterstitialListener
    public final void onAdClose(MBridgeIds mBridgeIds, RewardInfo rewardInfo) {
        this.f74458b.C.onAdClose();
    }

    @Override // com.mbridge.msdk.newinterstitial.out.NewInterstitialListener
    public final void onAdShow(MBridgeIds mBridgeIds) {
        m mVar = this.f74458b;
        mVar.C.onAdShow(r0.b(mBridgeIds, mVar.f61585f));
    }

    @Override // com.mbridge.msdk.newinterstitial.out.NewInterstitialListener
    public final void onLoadCampaignSuccess(MBridgeIds mBridgeIds) {
        AdLog.d("MintegralInterstitial onLoadCampaignSuccess");
    }

    @Override // com.mbridge.msdk.newinterstitial.out.NewInterstitialListener
    public final void onResourceLoadFail(MBridgeIds mBridgeIds, String str) {
        this.f74458b.v(str);
    }

    @Override // com.mbridge.msdk.newinterstitial.out.NewInterstitialListener
    public final void onResourceLoadSuccess(MBridgeIds mBridgeIds) {
        this.f74458b.C.onAdLoaded();
    }

    @Override // com.mbridge.msdk.newinterstitial.out.NewInterstitialListener
    public final void onShowFail(MBridgeIds mBridgeIds, String str) {
        this.f74458b.v(str);
    }
}
