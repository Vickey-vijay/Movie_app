package f;

import android.app.Activity;
import com.bytedance.sdk.openadsdk.api.init.PAGSdk;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAd;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeRequest;

/* JADX INFO: loaded from: classes4.dex */
public final class c implements PAGSdk.PAGInitCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Activity f52734a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ s f52735b;

    public c(s sVar, Activity activity) {
        this.f52735b = sVar;
        this.f52734a = activity;
    }

    @Override // com.bytedance.sdk.openadsdk.api.init.PAGSdk.PAGInitCallback
    public final void fail(int i10, String str) {
        this.f52735b.x(i10 + ", " + str);
    }

    @Override // com.bytedance.sdk.openadsdk.api.init.PAGSdk.PAGInitCallback
    public final void success() {
        this.f52735b.E.a(this.f52734a);
        PAGNativeRequest pAGNativeRequest = new PAGNativeRequest();
        s sVar = this.f52735b;
        PAGNativeAd.loadAd(sVar.G, pAGNativeRequest, sVar.H);
    }
}
