package j;

import com.yk.e.callBack.MainMaterialCallback;

/* JADX INFO: loaded from: classes2.dex */
public final class r1 implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l1 f61633b;

    public r1(l1 l1Var) {
        this.f61633b = l1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        MainMaterialCallback mainMaterialCallback = this.f61633b.f61562b;
        if (mainMaterialCallback != null) {
            mainMaterialCallback.onAdVideoComplete();
        }
        MainMaterialCallback mainMaterialCallback2 = this.f61633b.f61563c.f61469g;
        if (mainMaterialCallback2 != null) {
            mainMaterialCallback2.onAdVideoComplete();
        }
    }
}
