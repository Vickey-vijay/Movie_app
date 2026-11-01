package d;

import com.yk.e.adview.PauseInterstitialView;

/* JADX INFO: loaded from: classes11.dex */
public final class m implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f51775b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ PauseInterstitialView f51776c;

    public m(PauseInterstitialView pauseInterstitialView, int i10) {
        this.f51776c = pauseInterstitialView;
        this.f51775b = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f51776c.f3340iILLL1.setText(String.valueOf(this.f51775b - 1));
        PauseInterstitialView.IL1Iii(this.f51776c, this.f51775b - 1);
    }
}
