package b;

import android.view.View;
import com.yk.e.activity.BaseVideoActivity;
import com.yk.e.activity.RewardVideoActivity;

/* JADX INFO: loaded from: classes6.dex */
public final class v implements View.OnClickListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ BaseVideoActivity f4739b;

    public v(RewardVideoActivity rewardVideoActivity) {
        this.f4739b = rewardVideoActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.f4739b.closeAd();
    }
}
