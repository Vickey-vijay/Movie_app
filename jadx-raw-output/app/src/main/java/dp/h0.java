package dp;

import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.yk.e.adview.PauseInterstitialView;
import com.yk.e.object.MainParams;
import com.yk.e.pl.BaseAdPlayer;
import com.yk.e.util.AdLog;
import com.yk.e.util.LogUtil;

/* JADX INFO: loaded from: classes10.dex */
public final class h0 implements BaseAdPlayer.IPreparedCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ n0 f52253a;

    public h0(n0 n0Var) {
        this.f52253a = n0Var;
    }

    @Override // com.yk.e.pl.BaseAdPlayer.IPreparedCallback
    public final void onPrepared() {
        this.f52253a.f52265b.f52272a.A();
        n nVar = this.f52253a.f52265b.f52272a;
        MainParams mainParams = nVar.f61589j;
        nVar.D(mainParams.videoWidth, mainParams.videoHeight);
        LogUtil.info("expressWidth = " + nVar.B);
        LogUtil.info("expressHeight = " + nVar.C);
        PauseInterstitialView pauseInterstitialView = nVar.H;
        int i10 = nVar.B;
        int i11 = nVar.C;
        if (pauseInterstitialView.ILL == null) {
            AdLog.e("adPlayer is null");
        } else {
            pauseInterstitialView.f3342il.setVisibility(0);
            pauseInterstitialView.f3336IL.setVisibility(8);
            pauseInterstitialView.Ilil.setVisibility(8);
            pauseInterstitialView.f3340iILLL1.setVisibility(8);
            pauseInterstitialView.f3337IiL.setVisibility(8);
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) pauseInterstitialView.f3342il.getLayoutParams();
            layoutParams.width = i10;
            layoutParams.height = i11;
            pauseInterstitialView.f3342il.setLayoutParams(layoutParams);
            pauseInterstitialView.f3341lLi1LL.setLayoutParams(new LinearLayout.LayoutParams(i10, i11));
            ImageView imageView = pauseInterstitialView.Ilil;
            PauseInterstitialView.IL1Iii(imageView, i10, (RelativeLayout.LayoutParams) imageView.getLayoutParams());
            TextView textView = pauseInterstitialView.f3340iILLL1;
            PauseInterstitialView.IL1Iii(textView, i10, (RelativeLayout.LayoutParams) textView.getLayoutParams());
            pauseInterstitialView.f3339L11I = true;
            pauseInterstitialView.setVisibility(0);
        }
        nVar.H.setContentClickListener4VideoView(nVar);
    }
}
