package k;

import android.app.Activity;
import com.yk.e.util.AdPlayer;

/* JADX INFO: loaded from: classes2.dex */
public final class y0 implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ z f62043b;

    public y0(z zVar) {
        this.f62043b = zVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        x xVar = this.f62043b.f62044a;
        if (xVar.L) {
            return;
        }
        xVar.L = true;
        xVar.K = true;
        Activity activity = xVar.G;
        AdPlayer adPlayer = new AdPlayer();
        xVar.I = adPlayer;
        adPlayer.init(activity.getApplicationContext(), xVar.J, xVar.f61589j.videoUrl);
        xVar.I.addFragmentLife(activity);
        xVar.I.setViewOnClickListener(xVar.P);
        xVar.I.setIPlayerCallback(new p(xVar));
        xVar.I.setIPreparedCallback(new x0(xVar));
        xVar.I.play(activity.getApplicationContext(), xVar.f61589j.videoUrl, true);
        if (xVar.B) {
            xVar.I.hasVoice();
        } else {
            xVar.I.noVoice();
        }
    }
}
