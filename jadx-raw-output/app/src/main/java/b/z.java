package b;

import com.yk.e.activity.MainInterstitialActivity;

/* JADX INFO: loaded from: classes6.dex */
public final class z implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f4743b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ MainInterstitialActivity f4744c;

    public z(MainInterstitialActivity mainInterstitialActivity, int i10) {
        this.f4744c = mainInterstitialActivity;
        this.f4743b = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f4744c.ILL.setText(String.valueOf(this.f4743b - 1));
        this.f4744c.IL1Iii(this.f4743b - 1);
    }
}
