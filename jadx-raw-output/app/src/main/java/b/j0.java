package b;

import android.view.View;
import com.yk.e.activity.RewardWebActivity;

/* JADX INFO: loaded from: classes9.dex */
public final class j0 implements View.OnClickListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ RewardWebActivity f4725b;

    public j0(RewardWebActivity rewardWebActivity) {
        this.f4725b = rewardWebActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        RewardWebActivity rewardWebActivity = this.f4725b;
        rewardWebActivity.f3312Ll1.onAdClose();
        rewardWebActivity.finish();
    }
}
