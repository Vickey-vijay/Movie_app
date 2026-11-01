package b;

import android.view.View;
import com.yk.e.activity.BaseVideoActivity;
import com.yk.e.activity.RewardVideoActivity;

/* JADX INFO: loaded from: classes6.dex */
public final class j implements View.OnClickListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ BaseVideoActivity f4724b;

    public j(RewardVideoActivity rewardVideoActivity) {
        this.f4724b = rewardVideoActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.f4724b.IL1Iii();
        this.f4724b.I1I.onAdClick();
    }
}
