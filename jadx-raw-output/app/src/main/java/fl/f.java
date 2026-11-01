package fl;

import com.yk.e.callBack.MainThirdBannerCallBack;
import gl.r0;
import j.l2;

/* JADX INFO: loaded from: classes10.dex */
public final class f implements l2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ i f52970a;

    public f(i iVar) {
        this.f52970a = iVar;
    }

    @Override // j.l2
    public final void a() {
        i iVar = this.f52970a;
        iVar.E.onAdShow(r0.b(null, iVar.f61585f));
        this.f52970a.o(new Runnable() { // from class: fl.e
            @Override // java.lang.Runnable
            public final void run() {
                this.f52969b.b();
            }
        });
    }

    public final /* synthetic */ void b() {
        MainThirdBannerCallBack mainThirdBannerCallBack = this.f52970a.E;
        if (mainThirdBannerCallBack != null) {
            mainThirdBannerCallBack.onAdClick();
        }
    }
}
