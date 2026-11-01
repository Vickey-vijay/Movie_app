package xe;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.yk.e.pl.OktVideoView;
import com.yk.e.util.AdPlayer;
import com.yk.e.util.IDUtil;

/* JADX INFO: loaded from: classes11.dex */
public final class b implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j0 f74434b;

    public b(j0 j0Var) {
        this.f74434b = j0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z10;
        u uVar = this.f74434b.f74451b;
        synchronized (uVar) {
            z10 = uVar.E == 0;
        }
        if (z10) {
            u.D(this.f74434b.f74451b);
            j0 j0Var = this.f74434b;
            u uVar2 = j0Var.f74451b;
            Activity activity = j0Var.f74450a;
            uVar2.getClass();
            View viewInflate = LayoutInflater.from(activity).inflate(IDUtil.getLayoutID(activity, "main_layout_interstitial_view"), (ViewGroup) null);
            uVar2.G = viewInflate;
            uVar2.H = (OktVideoView) viewInflate.findViewById(IDUtil.getViewID(activity, "player"));
            AdPlayer adPlayer = new AdPlayer();
            uVar2.F = adPlayer;
            adPlayer.init(activity.getApplicationContext(), uVar2.H, uVar2.f61589j.videoUrl);
            uVar2.F.setIPreparedCallback(new e0(uVar2));
            uVar2.F.play(activity.getApplicationContext(), uVar2.f61589j.videoUrl, true ^ "1".equals(uVar2.f61589j.playable));
            if (uVar2.B) {
                uVar2.F.hasVoice();
            } else {
                uVar2.F.noVoice();
            }
        }
    }
}
