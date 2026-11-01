package j;

import com.yk.e.callBack.MainMaterialCallback;
import com.yk.e.object.AdInfo;

/* JADX INFO: loaded from: classes7.dex */
public final class a1 implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AdInfo f61439b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ l1 f61440c;

    public a1(l1 l1Var, AdInfo adInfo) {
        this.f61440c = l1Var;
        this.f61439b = adInfo;
    }

    @Override // java.lang.Runnable
    public final void run() {
        MainMaterialCallback mainMaterialCallback = this.f61440c.f61562b;
        if (mainMaterialCallback != null) {
            mainMaterialCallback.onAdShow(this.f61439b);
        }
        MainMaterialCallback mainMaterialCallback2 = this.f61440c.f61563c.f61469g;
        if (mainMaterialCallback2 != null) {
            mainMaterialCallback2.onAdShow(this.f61439b);
        }
    }
}
