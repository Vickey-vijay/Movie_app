package gl;

import com.yk.e.object.AdSdkStateCode;
import com.yk.e.util.IDUtil;

/* JADX INFO: loaded from: classes11.dex */
public final class t extends i1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ y f53593a;

    public t(y yVar) {
        this.f53593a = yVar;
    }

    @Override // gl.i1
    public final void a() {
        String string = IDUtil.getString(this.f53593a.f53612a, "main_load_data_fail");
        y yVar = this.f53593a;
        if (!yVar.f53614c) {
            yVar.f53615d.b(AdSdkStateCode.API_REQUEST_FAILED, string);
        }
        y yVar2 = this.f53593a;
        yVar2.f53621j.f(yVar2.f53612a, yVar2.f53616e, "", string + ", msg = 网络错误", "0", "0", null);
    }

    @Override // gl.i1
    public final void b() {
        y yVar = this.f53593a;
        yVar.f53621j.k(yVar.f53612a, yVar.f53617f, yVar.f53618g, yVar.f53616e, yVar.f53619h, yVar.f53620i, yVar.f53615d);
    }
}
