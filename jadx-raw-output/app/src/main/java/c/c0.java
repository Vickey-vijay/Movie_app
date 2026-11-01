package c;

import android.app.Activity;
import com.mbridge.msdk.out.MBRewardVideoHandler;
import com.yk.e.inf.IComCallback;

/* JADX INFO: loaded from: classes9.dex */
public final class c0 implements IComCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Activity f5564a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m f5565b;

    public c0(m mVar, Activity activity) {
        this.f5565b = mVar;
        this.f5564a = activity;
    }

    @Override // com.yk.e.inf.IComCallback
    public final void onFailed(int i10, String str) {
        this.f5565b.v(i10 + ", " + str);
    }

    @Override // com.yk.e.inf.IComCallback
    public final void onSuccess() {
        m mVar = this.f5565b;
        mVar.C = new MBRewardVideoHandler(this.f5564a, mVar.F, mVar.G);
        m mVar2 = this.f5565b;
        mVar2.C.setRewardVideoListener(mVar2.H);
        this.f5565b.C.playVideoMute(2);
        this.f5565b.C.load();
    }
}
