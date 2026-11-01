package gl;

import com.yk.e.callBack.MainInitSdkCallback;
import com.yk.e.inf.IComCallback;
import com.yk.e.util.AdLog;

/* JADX INFO: loaded from: classes2.dex */
public final class o1 implements IComCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MainInitSdkCallback f53573a;

    @Override // com.yk.e.inf.IComCallback
    public final void onFailed(int i10, String str) {
        AdLog.ad("3rdFsPartySdk init failed, code = " + i10 + ", msg = " + str);
        this.f53573a.onInitFailed(i10, str);
    }

    @Override // com.yk.e.inf.IComCallback
    public final void onSuccess() {
        AdLog.ad("3rdFsPartySdk init success");
        this.f53573a.onInitSuccess();
    }

    public o1(MainInitSdkCallback mainInitSdkCallback) {
        this.f53573a = mainInitSdkCallback;
    }
}
