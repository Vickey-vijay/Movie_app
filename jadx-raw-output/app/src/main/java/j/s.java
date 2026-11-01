package j;

import com.yk.e.callBack.MainMRECCallBack;

/* JADX INFO: loaded from: classes3.dex */
public final class s implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f61635b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f61636c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ z1 f61637d;

    public s(z1 z1Var, int i10, String str) {
        this.f61637d = z1Var;
        this.f61635b = i10;
        this.f61636c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        z1 z1Var = this.f61637d;
        z1Var.f61678c.IL1Iii(this.f61635b, this.f61636c, z1Var.f61677b);
        MainMRECCallBack mainMRECCallBack = this.f61637d.f61678c.f61458e;
        if (mainMRECCallBack != null) {
            mainMRECCallBack.onAdFail(this.f61635b, this.f61636c);
        }
    }
}
