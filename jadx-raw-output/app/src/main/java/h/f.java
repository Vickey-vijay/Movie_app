package h;

import com.yk.e.callBack.MainMRECCallBack;
import gl.r0;
import j.l2;

/* JADX INFO: loaded from: classes10.dex */
public final class f implements l2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ i f53652a;

    public f(i iVar) {
        this.f53652a = iVar;
    }

    @Override // j.l2
    public final void a() {
        i iVar = this.f53652a;
        iVar.E.onAdShow(r0.b(null, iVar.f61585f));
        this.f53652a.o(new Runnable() { // from class: h.e
            @Override // java.lang.Runnable
            public final void run() {
                this.f53651b.b();
            }
        });
    }

    public final /* synthetic */ void b() {
        MainMRECCallBack mainMRECCallBack = this.f53652a.E;
        if (mainMRECCallBack != null) {
            mainMRECCallBack.onAdClick();
        }
    }
}
