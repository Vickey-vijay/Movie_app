package b;

import com.yk.e.activity.BaseVideoActivity;
import com.yk.e.callBack.MainRewardVideoAdCallBack;
import com.yk.e.util.IDUtil;

/* JADX INFO: loaded from: classes9.dex */
public final class e0 implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f4714b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ BaseVideoActivity f4715c;

    public e0(BaseVideoActivity baseVideoActivity, int i10) {
        this.f4715c = baseVideoActivity;
        this.f4714b = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f4714b;
        BaseVideoActivity baseVideoActivity = this.f4715c;
        if (i10 > baseVideoActivity.f3274LlLLL) {
            baseVideoActivity.IL1Iii.setText(String.valueOf(i10 - 1));
            BaseVideoActivity baseVideoActivity2 = this.f4715c;
            if (baseVideoActivity2.I11li1) {
                return;
            }
            baseVideoActivity2.IL1Iii(this.f4714b - 1);
            return;
        }
        baseVideoActivity.IL1Iii.setVisibility(8);
        this.f4715c.f3278lIII.setVisibility(0);
        BaseVideoActivity baseVideoActivity3 = this.f4715c;
        baseVideoActivity3.f3278lIII.setText(IDUtil.getString(baseVideoActivity3, "main_skip"));
        BaseVideoActivity baseVideoActivity4 = this.f4715c;
        if (baseVideoActivity4.LL1IL) {
            return;
        }
        baseVideoActivity4.LL1IL = true;
        ((MainRewardVideoAdCallBack) baseVideoActivity4.I1I).onReward("");
    }
}
