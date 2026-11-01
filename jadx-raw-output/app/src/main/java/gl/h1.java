package gl;

import com.yk.e.callBack.MainInitSdkCallback;
import com.yk.e.object.AdSdkStateCode;

/* JADX INFO: loaded from: classes3.dex */
public final class h1 extends i1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ c1 f53500a;

    public h1(c1 c1Var) {
        this.f53500a = c1Var;
    }

    @Override // gl.i1
    public final void a() {
        d dVar = this.f53500a.f53464a;
        MainInitSdkCallback mainInitSdkCallback = dVar.f53468d;
        if (mainInitSdkCallback == null || dVar.f53467c) {
            return;
        }
        mainInitSdkCallback.onInitFailed(AdSdkStateCode.INIT_FAILED, "请求初始化接口失败, msg = 网络错误");
    }

    @Override // gl.i1
    public final void b() {
        d dVar = this.f53500a.f53464a;
        a1.g(dVar.f53469e, dVar.f53466b, dVar.f53465a, dVar.f53468d);
    }
}
