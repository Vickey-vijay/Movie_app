package k;

import android.app.Activity;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.appopen.AppOpenAd;
import com.yk.e.inf.IComCallback;

/* JADX INFO: loaded from: classes7.dex */
public final class f implements IComCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Activity f62006a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m f62007b;

    public f(m mVar, Activity activity) {
        this.f62007b = mVar;
        this.f62006a = activity;
    }

    @Override // com.yk.e.inf.IComCallback
    public final void onFailed(int i10, String str) {
        this.f62007b.x(str);
    }

    @Override // com.yk.e.inf.IComCallback
    public final void onSuccess() {
        AppOpenAd.load(this.f62006a, m.J, new AdRequest.Builder().build(), this.f62007b.H);
    }
}
