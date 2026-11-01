package f;

import com.yk.e.callBack.MainBannerCallBack;
import gl.r0;
import j.l2;

/* JADX INFO: loaded from: classes4.dex */
public final class j0 implements l2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ g f52747a;

    public j0(g gVar) {
        this.f52747a = gVar;
    }

    @Override // j.l2
    public final void a() {
        g gVar = this.f52747a;
        gVar.D.onAdShow(r0.b(null, gVar.f61585f));
        this.f52747a.o(new Runnable() { // from class: f.i0
            @Override // java.lang.Runnable
            public final void run() {
                this.f52746b.b();
            }
        });
    }

    public final /* synthetic */ void b() {
        MainBannerCallBack mainBannerCallBack = this.f52747a.D;
        if (mainBannerCallBack != null) {
            mainBannerCallBack.onAdClick();
        }
    }
}
