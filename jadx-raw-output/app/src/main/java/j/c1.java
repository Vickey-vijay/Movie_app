package j;

import com.yk.e.callBack.MainMaterialCallback;

/* JADX INFO: loaded from: classes7.dex */
public final class c1 implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f61459b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f61460c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ l1 f61461d;

    public c1(l1 l1Var, int i10, String str) {
        this.f61461d = l1Var;
        this.f61459b = i10;
        this.f61460c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        l1 l1Var = this.f61461d;
        l1Var.f61563c.IL1Iii(this.f61459b, this.f61460c, l1Var.f61562b);
        MainMaterialCallback mainMaterialCallback = this.f61461d.f61563c.f61469g;
        if (mainMaterialCallback != null) {
            mainMaterialCallback.onAdFail(this.f61459b, this.f61460c);
        }
    }
}
