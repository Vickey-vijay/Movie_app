package b;

import android.graphics.Bitmap;
import com.yk.e.activity.BaseVideoActivity;
import com.yk.e.activity.RewardVideoActivity;
import com.yk.e.util.ImageLoader;

/* JADX INFO: loaded from: classes6.dex */
public final class e extends ImageLoader.ImageLoadCallBack {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ BaseVideoActivity f4713a;

    public e(RewardVideoActivity rewardVideoActivity) {
        this.f4713a = rewardVideoActivity;
    }

    @Override // com.yk.e.util.ImageLoader.ImageLoadCallBack
    public final void execute(Bitmap bitmap) {
        this.f4713a.llliI.setImageBitmap(bitmap);
    }
}
