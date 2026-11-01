package e;

import com.yk.e.callBack.MainWdNativeAdCallback;
import gl.r0;

/* JADX INFO: loaded from: classes10.dex */
public final class e0 implements d.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ a f52291a;

    public e0(a aVar) {
        this.f52291a = aVar;
    }

    public final /* synthetic */ void a() {
        MainWdNativeAdCallback mainWdNativeAdCallback = this.f52291a.L;
        if (mainWdNativeAdCallback != null) {
            mainWdNativeAdCallback.onAdClick();
        }
    }

    public final void b() {
        a aVar = this.f52291a;
        aVar.L.onAdShow(r0.b(null, aVar.f61585f));
        this.f52291a.o(new Runnable() { // from class: e.d0
            @Override // java.lang.Runnable
            public final void run() {
                this.f52289b.a();
            }
        });
    }
}
