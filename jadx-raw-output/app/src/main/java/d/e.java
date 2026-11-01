package d;

import android.view.View;
import com.yk.e.adview.PauseInterstitialView;
import com.yk.e.util.AdPlayer;

/* JADX INFO: loaded from: classes11.dex */
public final class e implements View.OnClickListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ PauseInterstitialView f51763b;

    public e(PauseInterstitialView pauseInterstitialView) {
        this.f51763b = pauseInterstitialView;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        AdPlayer adPlayer = this.f51763b.ILL;
        if (adPlayer != null) {
            adPlayer.release();
        }
        h hVar = this.f51763b.ILil;
        if (hVar != null) {
            ((dp.q) hVar).f52271a.F.onAdClose();
        }
    }
}
