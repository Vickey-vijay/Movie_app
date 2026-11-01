package b;

import android.view.View;
import com.yk.e.activity.MainInterstitialActivity;

/* JADX INFO: loaded from: classes6.dex */
public final class s implements View.OnClickListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MainInterstitialActivity f4736b;

    public s(MainInterstitialActivity mainInterstitialActivity) {
        this.f4736b = mainInterstitialActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        MainInterstitialActivity mainInterstitialActivity = this.f4736b;
        mainInterstitialActivity.f51168Lil.onAdClick();
        mainInterstitialActivity.f51168Lil.onAdClose();
        MainInterstitialActivity mainInterstitialActivity2 = mainInterstitialActivity.IL1Iii;
        if (gl.c.f53460b == null) {
            gl.c.f53460b = new gl.c();
        }
        gl.c.f53460b.a(mainInterstitialActivity2, 6, mainInterstitialActivity.ILil, mainInterstitialActivity.f3297ILl.adPlcID, false);
        mainInterstitialActivity.IL1Iii(mainInterstitialActivity.IL1Iii);
    }
}
