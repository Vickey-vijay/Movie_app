package j;

import com.yk.e.callBack.MainFloatViewCallback;
import com.yk.e.subad.MainFloatViewLoader;
import com.yk.e.util.AdLog;

/* JADX INFO: loaded from: classes2.dex */
public final class o1 implements gl.s0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ MainFloatViewLoader f61612a;

    public o1(MainFloatViewLoader mainFloatViewLoader) {
        this.f61612a = mainFloatViewLoader;
    }

    @Override // gl.s0
    public final void a(Object... objArr) {
        this.f61612a.startLoadData(objArr);
    }

    @Override // gl.s0
    public final void b(int i10, String str) {
        MainFloatViewLoader mainFloatViewLoader = this.f61612a;
        MainFloatViewCallback mainFloatViewCallback = mainFloatViewLoader.f3368;
        mainFloatViewLoader.iIlLiL = false;
        AdLog.subAd(mainFloatViewLoader.curAdType + " sdk获取数据失败");
        if (mainFloatViewCallback != null) {
            mainFloatViewCallback.onAdFail(i10, str);
        }
    }
}
