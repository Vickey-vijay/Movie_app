package j;

import com.yk.e.callBack.MainMaterialCallback;

/* JADX INFO: loaded from: classes3.dex */
public final class u implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l1 f61651b;

    public u(l1 l1Var) {
        this.f61651b = l1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        MainMaterialCallback mainMaterialCallback = this.f61651b.f61562b;
        if (mainMaterialCallback != null) {
            mainMaterialCallback.onAdVideoStart();
        }
        MainMaterialCallback mainMaterialCallback2 = this.f61651b.f61563c.f61469g;
        if (mainMaterialCallback2 != null) {
            mainMaterialCallback2.onAdVideoStart();
        }
    }
}
