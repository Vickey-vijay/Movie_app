package k;

import android.app.Activity;
import com.applovin.mediation.ads.MaxAppOpenAd;
import com.yk.e.inf.IComCallback;

/* JADX INFO: loaded from: classes2.dex */
public final class p0 implements IComCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Activity f62023a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ y f62024b;

    public p0(y yVar, Activity activity) {
        this.f62024b = yVar;
        this.f62023a = activity;
    }

    @Override // com.yk.e.inf.IComCallback
    public final void onFailed(int i10, String str) {
        this.f62024b.v(str);
    }

    @Override // com.yk.e.inf.IComCallback
    public final void onSuccess() {
        y yVar = this.f62024b;
        yVar.E = new MaxAppOpenAd(yVar.H, this.f62023a.getApplicationContext());
        y yVar2 = this.f62024b;
        yVar2.E.setListener(yVar2.I);
        this.f62024b.E.loadAd();
    }
}
