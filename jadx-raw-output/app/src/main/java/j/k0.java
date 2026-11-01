package j;

import android.view.View;
import com.yk.e.callBack.MainMaterialCallback;

/* JADX INFO: loaded from: classes8.dex */
public final class k0 implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f61528b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ l1 f61529c;

    public k0(l1 l1Var, View view) {
        this.f61529c = l1Var;
        this.f61528b = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        MainMaterialCallback mainMaterialCallback = this.f61529c.f61562b;
        if (mainMaterialCallback != null) {
            mainMaterialCallback.onAdLoaded(this.f61528b);
        }
        MainMaterialCallback mainMaterialCallback2 = this.f61529c.f61563c.f61469g;
        if (mainMaterialCallback2 != null) {
            mainMaterialCallback2.onAdLoaded(this.f61528b);
        }
    }
}
