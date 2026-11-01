package j;

import com.yk.e.callBack.MainNativeAdCallBack;
import com.yk.e.object.AdInfo;

/* JADX INFO: loaded from: classes2.dex */
public final class e implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AdInfo f61479b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ z f61480c;

    public e(z zVar, AdInfo adInfo) {
        this.f61480c = zVar;
        this.f61479b = adInfo;
    }

    @Override // java.lang.Runnable
    public final void run() {
        MainNativeAdCallBack mainNativeAdCallBack = this.f61480c.f61673b;
        if (mainNativeAdCallBack != null) {
            mainNativeAdCallBack.onAdShow(this.f61479b);
        }
        MainNativeAdCallBack mainNativeAdCallBack2 = this.f61480c.f61674c.f61642e;
        if (mainNativeAdCallBack2 != null) {
            mainNativeAdCallBack2.onAdShow(this.f61479b);
        }
    }
}
