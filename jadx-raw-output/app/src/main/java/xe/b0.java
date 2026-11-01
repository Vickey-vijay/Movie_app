package xe;

import android.app.Activity;
import com.mbridge.msdk.newinterstitial.out.MBNewInterstitialHandler;
import com.yk.e.inf.IComCallback;

/* JADX INFO: loaded from: classes2.dex */
public final class b0 implements IComCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Activity f74435a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m f74436b;

    public b0(m mVar, Activity activity) {
        this.f74436b = mVar;
        this.f74435a = activity;
    }

    @Override // com.yk.e.inf.IComCallback
    public final void onFailed(int i10, String str) {
        this.f74436b.v(i10 + ", " + str);
    }

    @Override // com.yk.e.inf.IComCallback
    public final void onSuccess() {
        m mVar = this.f74436b;
        mVar.D = new MBNewInterstitialHandler(this.f74435a, mVar.G, mVar.H);
        m mVar2 = this.f74436b;
        if (mVar2.B) {
            mVar2.D.playVideoMute(2);
        } else {
            mVar2.D.playVideoMute(1);
        }
        m mVar3 = this.f74436b;
        mVar3.D.setInterstitialVideoListener(mVar3.I);
        this.f74436b.D.load();
    }
}
