package b;

import android.view.View;
import com.yk.e.activity.BaseVideoActivity;
import com.yk.e.activity.RewardVideoActivity;

/* JADX INFO: loaded from: classes6.dex */
public final class c implements View.OnClickListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ BaseVideoActivity f4709b;

    public c(RewardVideoActivity rewardVideoActivity) {
        this.f4709b = rewardVideoActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.f4709b.closeAd();
    }
}
