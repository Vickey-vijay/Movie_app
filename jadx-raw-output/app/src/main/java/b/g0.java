package b;

import android.graphics.Bitmap;
import com.yk.e.activity.BaseVideoActivity;
import com.yk.e.activity.RewardVideoActivity;
import com.yk.e.util.ImageLoader;

/* JADX INFO: loaded from: classes9.dex */
public final class g0 extends ImageLoader.ImageLoadCallBack {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ BaseVideoActivity f4719a;

    public g0(RewardVideoActivity rewardVideoActivity) {
        this.f4719a = rewardVideoActivity;
    }

    @Override // com.yk.e.util.ImageLoader.ImageLoadCallBack
    public final void execute(Bitmap bitmap) {
        if (bitmap != null) {
            this.f4719a.f3275iILLL1.setVisibility(0);
            this.f4719a.f3277lIiI.setVisibility(0);
        } else {
            this.f4719a.f3275iILLL1.setVisibility(8);
            this.f4719a.f3277lIiI.setVisibility(8);
        }
        this.f4719a.f3275iILLL1.setImageBitmap(bitmap);
        this.f4719a.f3277lIiI.setImageBitmap(bitmap);
    }
}
