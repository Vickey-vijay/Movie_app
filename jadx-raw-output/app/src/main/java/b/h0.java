package b;

import android.view.View;
import android.widget.ImageView;
import com.yk.e.activity.MainInterstitialActivity;
import com.yk.e.util.AdLog;
import com.yk.e.util.AdPlayer;
import com.yk.e.util.IDUtil;

/* JADX INFO: loaded from: classes9.dex */
public final class h0 implements View.OnClickListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MainInterstitialActivity f4721b;

    public h0(MainInterstitialActivity mainInterstitialActivity) {
        this.f4721b = mainInterstitialActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        try {
            MainInterstitialActivity mainInterstitialActivity = this.f4721b;
            boolean z10 = !mainInterstitialActivity.iIlLiL;
            mainInterstitialActivity.iIlLiL = z10;
            ImageView imageView = mainInterstitialActivity.f3303lIiI;
            if (imageView != null) {
                imageView.setImageResource(IDUtil.getDrawable(mainInterstitialActivity, z10 ? "main_ico_voice" : "main_ico_no_voice"));
            }
            MainInterstitialActivity mainInterstitialActivity2 = this.f4721b;
            AdPlayer adPlayer = mainInterstitialActivity2.I1I;
            if (adPlayer != null) {
                if (mainInterstitialActivity2.iIlLiL) {
                    adPlayer.hasVoice();
                } else {
                    adPlayer.noVoice();
                }
            }
        } catch (Exception e10) {
            AdLog.e(e10.getMessage(), e10);
        }
    }
}
