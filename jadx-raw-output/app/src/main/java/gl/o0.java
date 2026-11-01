package gl;

import com.yk.e.inf.IComCallback;
import com.yk.e.util.AdLog;

/* JADX INFO: loaded from: classes2.dex */
public final class o0 implements IComCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f53571a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f53572b;

    public o0(String str, String str2) {
        this.f53571a = str;
        this.f53572b = str2;
    }

    @Override // com.yk.e.inf.IComCallback
    public final void onFailed(int i10, String str) {
        AdLog.d("collectErrMsg failed, adPlcID = " + this.f53571a + ", platform = " + this.f53572b + ", msg = " + str);
    }

    @Override // com.yk.e.inf.IComCallback
    public final void onSuccess() {
        AdLog.d("collectErrMsg success, adPlcID = " + this.f53571a + ", platform = " + this.f53572b);
    }
}
