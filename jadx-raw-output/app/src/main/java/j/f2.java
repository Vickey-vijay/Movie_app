package j;

import com.yk.e.callBack.MainMaterialCallback;

/* JADX INFO: loaded from: classes7.dex */
public final class f2 implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l1 f61495b;

    public f2(l1 l1Var) {
        this.f61495b = l1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        MainMaterialCallback mainMaterialCallback = this.f61495b.f61562b;
        if (mainMaterialCallback != null) {
            mainMaterialCallback.onAdClose();
        }
        MainMaterialCallback mainMaterialCallback2 = this.f61495b.f61563c.f61469g;
        if (mainMaterialCallback2 != null) {
            mainMaterialCallback2.onAdClose();
        }
    }
}
