package b;

import com.yk.e.activity.BaseVideoActivity;
import com.yk.e.activity.RewardVideoActivity;
import com.yk.e.object.AdSdkStateCode;
import com.yk.e.pl.BaseAdPlayer;
import com.yk.e.util.IDUtil;

/* JADX INFO: loaded from: classes6.dex */
public final class r implements BaseAdPlayer.IPlayerCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ BaseVideoActivity f4735a;

    @Override // com.yk.e.pl.BaseAdPlayer.IPlayerCallback
    public final void onStartPlay() {
    }

    public r(RewardVideoActivity rewardVideoActivity) {
        this.f4735a = rewardVideoActivity;
    }

    @Override // com.yk.e.pl.BaseAdPlayer.IPlayerCallback
    public final void onPlayComplete() {
        this.f4735a.ILil();
    }

    @Override // com.yk.e.pl.BaseAdPlayer.IPlayerCallback
    public final void onPlayFailed(String str) {
        this.f4735a.finish();
        BaseVideoActivity baseVideoActivity = this.f4735a;
        baseVideoActivity.I1I.onAdFail(AdSdkStateCode.MAIN_RENDER_FAILED, "platform:wx, msg:" + IDUtil.getString(baseVideoActivity, "main_ad_render_fail"));
    }
}
