package l;

import com.yk.e.callBack.MainNativeAdCallBack;
import gl.r0;
import j.l2;

/* JADX INFO: loaded from: classes9.dex */
public final class c implements l2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ e0 f63319a;

    public c(e0 e0Var) {
        this.f63319a = e0Var;
    }

    @Override // j.l2
    public final void a() {
        e0 e0Var = this.f63319a;
        e0Var.B.onAdShow(r0.b(null, e0Var.f61585f));
        this.f63319a.o(new Runnable() { // from class: l.b
            @Override // java.lang.Runnable
            public final void run() {
                this.f63317b.b();
            }
        });
    }

    public final /* synthetic */ void b() {
        MainNativeAdCallBack mainNativeAdCallBack = this.f63319a.B;
        if (mainNativeAdCallBack != null) {
            mainNativeAdCallBack.onAdClick();
        }
    }
}
