package j;

import android.view.View;
import com.yk.e.callBack.MainNativeAdCallBack;

/* JADX INFO: loaded from: classes2.dex */
public final class r0 implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f61631b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ z f61632c;

    public r0(z zVar, View view) {
        this.f61632c = zVar;
        this.f61631b = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        MainNativeAdCallBack mainNativeAdCallBack = this.f61632c.f61673b;
        if (mainNativeAdCallBack != null) {
            mainNativeAdCallBack.onAdLoaded(this.f61631b);
        }
        MainNativeAdCallBack mainNativeAdCallBack2 = this.f61632c.f61674c.f61642e;
        if (mainNativeAdCallBack2 != null) {
            mainNativeAdCallBack2.onAdLoaded(this.f61631b);
        }
    }
}
