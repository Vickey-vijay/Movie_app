package l;

import android.app.Activity;
import com.bytedance.sdk.openadsdk.api.init.PAGSdk;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAd;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeRequest;

/* JADX INFO: loaded from: classes9.dex */
public final class s implements PAGSdk.PAGInitCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Activity f63348a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m f63349b;

    public s(m mVar, Activity activity) {
        this.f63349b = mVar;
        this.f63348a = activity;
    }

    @Override // com.bytedance.sdk.openadsdk.api.init.PAGSdk.PAGInitCallback
    public final void fail(int i10, String str) {
        this.f63349b.x(i10 + ", " + str);
    }

    @Override // com.bytedance.sdk.openadsdk.api.init.PAGSdk.PAGInitCallback
    public final void success() {
        this.f63349b.C.a(this.f63348a);
        PAGNativeRequest pAGNativeRequest = new PAGNativeRequest();
        m mVar = this.f63349b;
        PAGNativeAd.loadAd(mVar.G, pAGNativeRequest, mVar.H);
    }
}
