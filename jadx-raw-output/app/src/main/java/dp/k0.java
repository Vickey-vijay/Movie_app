package dp;

import android.app.Activity;
import com.bytedance.sdk.openadsdk.api.init.PAGSdk;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAd;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeRequest;

/* JADX INFO: loaded from: classes10.dex */
public final class k0 implements PAGSdk.PAGInitCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Activity f52260a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b0 f52261b;

    public k0(b0 b0Var, Activity activity) {
        this.f52261b = b0Var;
        this.f52260a = activity;
    }

    @Override // com.bytedance.sdk.openadsdk.api.init.PAGSdk.PAGInitCallback
    public final void fail(int i10, String str) {
        this.f52261b.x(i10 + ", " + str);
    }

    @Override // com.bytedance.sdk.openadsdk.api.init.PAGSdk.PAGInitCallback
    public final void success() {
        this.f52261b.G.a(this.f52260a);
        PAGNativeRequest pAGNativeRequest = new PAGNativeRequest();
        b0 b0Var = this.f52261b;
        PAGNativeAd.loadAd(b0Var.I, pAGNativeRequest, b0Var.J);
    }
}
