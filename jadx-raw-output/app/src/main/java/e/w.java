package e;

import android.app.Activity;
import com.bytedance.sdk.openadsdk.api.init.PAGSdk;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAd;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeRequest;

/* JADX INFO: loaded from: classes2.dex */
public final class w implements PAGSdk.PAGInitCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Activity f52309a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h0 f52310b;

    public w(h0 h0Var, Activity activity) {
        this.f52310b = h0Var;
        this.f52309a = activity;
    }

    @Override // com.bytedance.sdk.openadsdk.api.init.PAGSdk.PAGInitCallback
    public final void fail(int i10, String str) {
        this.f52310b.x(i10 + ", " + str);
    }

    @Override // com.bytedance.sdk.openadsdk.api.init.PAGSdk.PAGInitCallback
    public final void success() {
        this.f52310b.N.a(this.f52309a);
        PAGNativeRequest pAGNativeRequest = new PAGNativeRequest();
        h0 h0Var = this.f52310b;
        PAGNativeAd.loadAd(h0Var.P, pAGNativeRequest, h0Var.Q);
    }
}
