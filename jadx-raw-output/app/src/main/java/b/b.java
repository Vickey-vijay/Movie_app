package b;

import android.app.Activity;
import android.view.View;
import com.yk.e.activity.MainInterstitialActivity;
import com.yk.e.callBack.MainInterstitialAdCallBack;

/* JADX INFO: loaded from: classes6.dex */
public final class b implements View.OnClickListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Activity f4706b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ MainInterstitialActivity f4707c;

    public b(MainInterstitialActivity mainInterstitialActivity, Activity activity) {
        this.f4707c = mainInterstitialActivity;
        this.f4706b = activity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        MainInterstitialAdCallBack mainInterstitialAdCallBack = this.f4707c.f51168Lil;
        if (mainInterstitialAdCallBack != null) {
            mainInterstitialAdCallBack.onAdClose();
        }
        this.f4707c.IL1Iii(this.f4706b);
    }
}
