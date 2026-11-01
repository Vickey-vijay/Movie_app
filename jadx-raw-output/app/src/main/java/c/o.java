package c;

import com.mbridge.msdk.out.MBridgeIds;
import com.mbridge.msdk.out.RewardInfo;
import com.mbridge.msdk.out.RewardVideoListener;
import gl.r0;

/* JADX INFO: loaded from: classes9.dex */
public final class o implements RewardVideoListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m f5584b;

    @Override // com.mbridge.msdk.out.RewardVideoListener, com.mbridge.msdk.video.bt.module.orglistener.g
    public final void onEndcardShow(MBridgeIds mBridgeIds) {
    }

    @Override // com.mbridge.msdk.out.RewardVideoListener, com.mbridge.msdk.video.bt.module.orglistener.g
    public final void onLoadSuccess(MBridgeIds mBridgeIds) {
    }

    public o(m mVar) {
        this.f5584b = mVar;
    }

    @Override // com.mbridge.msdk.out.RewardVideoListener, com.mbridge.msdk.video.bt.module.orglistener.g
    public final void onAdClose(MBridgeIds mBridgeIds, RewardInfo rewardInfo) {
        this.f5584b.B.onAdClose();
        if (rewardInfo.isCompleteView()) {
            this.f5584b.B.onReward("");
        }
    }

    @Override // com.mbridge.msdk.out.RewardVideoListener, com.mbridge.msdk.video.bt.module.orglistener.g
    public final void onAdShow(MBridgeIds mBridgeIds) {
        m mVar = this.f5584b;
        mVar.B.onAdShow(r0.b(null, mVar.f61585f));
    }

    @Override // com.mbridge.msdk.out.RewardVideoListener, com.mbridge.msdk.video.bt.module.orglistener.g
    public final void onShowFail(MBridgeIds mBridgeIds, String str) {
        this.f5584b.v(str);
    }

    @Override // com.mbridge.msdk.out.RewardVideoListener, com.mbridge.msdk.video.bt.module.orglistener.g
    public final void onVideoAdClicked(MBridgeIds mBridgeIds) {
        this.f5584b.B.onAdClick();
    }

    @Override // com.mbridge.msdk.out.RewardVideoListener, com.mbridge.msdk.video.bt.module.orglistener.g
    public final void onVideoComplete(MBridgeIds mBridgeIds) {
        this.f5584b.B.onAdVideoComplete();
    }

    @Override // com.mbridge.msdk.out.RewardVideoListener, com.mbridge.msdk.video.bt.module.orglistener.g
    public final void onVideoLoadFail(MBridgeIds mBridgeIds, String str) {
        this.f5584b.v(str);
    }

    @Override // com.mbridge.msdk.out.RewardVideoListener, com.mbridge.msdk.video.bt.module.orglistener.g
    public final void onVideoLoadSuccess(MBridgeIds mBridgeIds) {
        this.f5584b.B.onAdVideoCache();
    }
}
