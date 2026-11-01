package d;

import com.yk.e.adview.PauseInterstitialView;

/* JADX INFO: loaded from: classes11.dex */
public final class c implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j f51758b;

    public c(j jVar) {
        this.f51758b = jVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f51758b.f51773b.f3337IiL.setVisibility(0);
        this.f51758b.f51773b.f3340iILLL1.setVisibility(0);
        j jVar = this.f51758b;
        jVar.f51773b.f3340iILLL1.setText(String.valueOf(jVar.f51772a.countDownTime));
        j jVar2 = this.f51758b;
        PauseInterstitialView.IL1Iii(jVar2.f51773b, jVar2.f51772a.countDownTime);
    }
}
