package b;

import android.os.Handler;
import android.os.Message;
import com.yk.e.activity.RewardWebActivity;
import com.yk.e.callBack.MainRewardVideoAdCallBack;
import java.util.Timer;

/* JADX INFO: loaded from: classes6.dex */
public final class x implements Handler.Callback {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ RewardWebActivity f4741b;

    public x(RewardWebActivity rewardWebActivity) {
        this.f4741b = rewardWebActivity;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        RewardWebActivity rewardWebActivity = this.f4741b;
        if (rewardWebActivity.f3315lIiI) {
            return false;
        }
        int i10 = rewardWebActivity.LlLI1;
        if (i10 >= 0) {
            if (i10 <= 0) {
                if (!rewardWebActivity.f51169Lil) {
                    rewardWebActivity.f51169Lil = true;
                    ((MainRewardVideoAdCallBack) rewardWebActivity.f3312Ll1).onReward("");
                }
                rewardWebActivity.ILil.setVisibility(0);
            }
            this.f4741b.I1I.setText(this.f4741b.LlLI1 + "秒之后获得奖励");
            RewardWebActivity rewardWebActivity2 = this.f4741b;
            rewardWebActivity2.LlLI1 = rewardWebActivity2.LlLI1 - 1;
        } else {
            Timer timer = rewardWebActivity.f3313L11I;
            if (timer != null) {
                timer.cancel();
                this.f4741b.f3313L11I = null;
            }
            this.f4741b.I1I.setText("恭喜获得奖励！");
            RewardWebActivity rewardWebActivity3 = this.f4741b;
            if (!rewardWebActivity3.f3309ILl) {
                rewardWebActivity3.f3309ILl = true;
                rewardWebActivity3.f3312Ll1.onAdVideoComplete();
            }
        }
        return false;
    }
}
