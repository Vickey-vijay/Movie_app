package c;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.yk.e.pl.OktVideoView;
import com.yk.e.util.AdPlayer;
import com.yk.e.util.IDUtil;

/* JADX INFO: loaded from: classes9.dex */
public final class a implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f0 f5560b;

    public a(f0 f0Var) {
        this.f5560b = f0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        v vVar = this.f5560b.f5570a;
        if (vVar.F) {
            return;
        }
        vVar.F = true;
        vVar.E = true;
        Activity activity = vVar.C;
        View viewInflate = LayoutInflater.from(activity).inflate(IDUtil.getLayoutID(activity, "main_layout_reward_view"), (ViewGroup) null);
        vVar.H = viewInflate;
        vVar.I = (OktVideoView) viewInflate.findViewById(IDUtil.getViewID(activity, "player"));
        AdPlayer adPlayer = new AdPlayer();
        vVar.G = adPlayer;
        adPlayer.init(vVar.C.getApplicationContext(), vVar.I, vVar.f61589j.videoUrl);
        vVar.G.setIPreparedCallback(new p0(vVar));
        vVar.G.play(vVar.C.getApplicationContext(), vVar.f61589j.videoUrl, false);
        vVar.G.hasVoice();
    }
}
