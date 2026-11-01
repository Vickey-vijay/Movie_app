package il;

import com.yk.e.callBack.MainFloatViewCallback;

/* JADX INFO: loaded from: classes11.dex */
public final class b implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f54224b;

    public b(e eVar) {
        this.f54224b = eVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        MainFloatViewCallback mainFloatViewCallback;
        e eVar = this.f54224b;
        if (eVar.D || (mainFloatViewCallback = eVar.C) == null) {
            return;
        }
        mainFloatViewCallback.onAdClick();
    }
}
