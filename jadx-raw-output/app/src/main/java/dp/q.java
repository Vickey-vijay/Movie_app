package dp;

import com.yk.e.callBack.MainMaterialCallback;

/* JADX INFO: loaded from: classes2.dex */
public final class q implements d.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ n f52271a;

    public q(n nVar) {
        this.f52271a = nVar;
    }

    public final /* synthetic */ void a() {
        MainMaterialCallback mainMaterialCallback = this.f52271a.F;
        if (mainMaterialCallback != null) {
            mainMaterialCallback.onAdClick();
        }
    }

    public final void b() {
        this.f52271a.F.onAdVideoStart();
        this.f52271a.o(new Runnable() { // from class: dp.p
            @Override // java.lang.Runnable
            public final void run() {
                this.f52268b.a();
            }
        });
    }
}
