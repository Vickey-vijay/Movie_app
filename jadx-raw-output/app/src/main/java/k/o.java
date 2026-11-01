package k;

import com.bytedance.sdk.openadsdk.api.init.PAGSdk;
import com.bytedance.sdk.openadsdk.api.open.PAGAppOpenAd;
import com.bytedance.sdk.openadsdk.api.open.PAGAppOpenRequest;

/* JADX INFO: loaded from: classes7.dex */
public final class o implements PAGSdk.PAGInitCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ q0 f62020a;

    public o(q0 q0Var) {
        this.f62020a = q0Var;
    }

    @Override // com.bytedance.sdk.openadsdk.api.init.PAGSdk.PAGInitCallback
    public final void fail(int i10, String str) {
        this.f62020a.v(i10 + ", " + str);
    }

    @Override // com.bytedance.sdk.openadsdk.api.init.PAGSdk.PAGInitCallback
    public final void success() {
        PAGAppOpenRequest pAGAppOpenRequest = new PAGAppOpenRequest();
        pAGAppOpenRequest.setTimeout(this.f62020a.E);
        q0 q0Var = this.f62020a;
        PAGAppOpenAd.loadAd(q0Var.H, pAGAppOpenRequest, q0Var.I);
    }
}
