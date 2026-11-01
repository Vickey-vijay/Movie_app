package dp;

import android.app.Activity;
import com.yk.e.adview.PauseInterstitialView;
import com.yk.e.object.MainParams;
import com.yk.e.util.AdPlayer;

/* JADX INFO: loaded from: classes10.dex */
public final class n0 implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q0 f52265b;

    public n0(q0 q0Var) {
        this.f52265b = q0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        n nVar = this.f52265b.f52272a;
        if (nVar.J) {
            return;
        }
        nVar.J = true;
        nVar.I = true;
        PauseInterstitialView pauseInterstitialView = nVar.H;
        Activity activity = nVar.G;
        MainParams mainParams = nVar.f61589j;
        boolean z10 = nVar.E;
        h0 h0Var = new h0(this);
        pauseInterstitialView.getClass();
        AdPlayer adPlayer = new AdPlayer();
        pauseInterstitialView.ILL = adPlayer;
        adPlayer.init(activity, pauseInterstitialView.f3342il, mainParams.videoUrl);
        pauseInterstitialView.f3338Ll1 = z10;
        pauseInterstitialView.ILL.addFragmentLife(activity);
        pauseInterstitialView.ILL.setIPlayerCallback(new d.j(pauseInterstitialView, mainParams));
        pauseInterstitialView.ILL.setIPreparedCallback(h0Var);
        pauseInterstitialView.ILL.play(activity.getApplicationContext(), mainParams.videoUrl, true);
        if (pauseInterstitialView.f3338Ll1) {
            pauseInterstitialView.ILL.hasVoice();
        } else {
            pauseInterstitialView.ILL.noVoice();
        }
    }
}
