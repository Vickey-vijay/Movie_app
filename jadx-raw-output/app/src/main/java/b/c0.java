package b;

import android.app.Activity;
import android.view.View;
import com.yk.e.activity.MainInterstitialActivity;

/* JADX INFO: loaded from: classes8.dex */
public final class c0 implements View.OnClickListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Activity f4710b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ MainInterstitialActivity f4711c;

    public c0(MainInterstitialActivity mainInterstitialActivity, Activity activity) {
        this.f4711c = mainInterstitialActivity;
        this.f4710b = activity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        MainInterstitialActivity mainInterstitialActivity = this.f4711c;
        Activity activity = this.f4710b;
        int i10 = MainInterstitialActivity.I11L;
        if (gl.c.f53460b == null) {
            mainInterstitialActivity.getClass();
            gl.c.f53460b = new gl.c();
        }
        gl.c.f53460b.a(activity, 6, mainInterstitialActivity.ILil, mainInterstitialActivity.f3297ILl.adPlcID, false);
        this.f4711c.f51168Lil.onAdClick();
        this.f4711c.f51168Lil.onAdClose();
        this.f4711c.IL1Iii(this.f4710b);
    }
}
