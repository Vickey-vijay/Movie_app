package j;

import com.yk.e.callBack.MainNativeAdCallBack;

/* JADX INFO: loaded from: classes7.dex */
public final class a2 implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f61441b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f61442c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ z f61443d;

    public a2(z zVar, int i10, String str) {
        this.f61443d = zVar;
        this.f61441b = i10;
        this.f61442c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        z zVar = this.f61443d;
        zVar.f61674c.IL1Iii(this.f61441b, this.f61442c, zVar.f61673b);
        MainNativeAdCallBack mainNativeAdCallBack = this.f61443d.f61674c.f61642e;
        if (mainNativeAdCallBack != null) {
            mainNativeAdCallBack.onAdFail(this.f61441b, this.f61442c);
        }
    }
}
