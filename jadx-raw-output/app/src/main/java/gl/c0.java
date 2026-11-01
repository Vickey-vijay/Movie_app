package gl;

import com.yk.e.object.MainParams;
import com.yk.e.util.AdLog;
import com.yk.e.util.Constant;

/* JADX INFO: loaded from: classes3.dex */
public final class c0 implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a0 f53462b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f53463c;

    public c0(a0 a0Var, int i10) {
        this.f53462b = a0Var;
        this.f53463c = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        a0 a0Var = this.f53462b;
        if (a0Var != null) {
            int i10 = this.f53463c;
            AdLog.d("checkGpDetailsUlr code = " + i10 + ", time = " + (System.currentTimeMillis() - a0Var.f53437a) + "ms");
            j.r rVar = a0Var.f53438b;
            if (rVar != null) {
                boolean z10 = i10 != 200;
                Constant.clickUrlHashMap.put(rVar.f61630a.f61589j.clickUrl, Boolean.valueOf(z10));
                String str = "checkClickUrl 是否使用备用地址：" + z10;
                AdLog.d("BaseMainAd", "TaskFinish, platform = " + rVar.f61630a.f61587h + ", task = " + str);
                j.n0 n0Var = rVar.f61630a;
                MainParams mainParams = n0Var.f61589j;
                mainParams.realClickUlr = z10 ? mainParams.webUrl : mainParams.clickUrl;
                mainParams.isUserWebUrl = z10;
                AdLog.d("BaseMainAd", "onCheckUrlFinish");
                n0Var.A.sendEmptyMessage(0);
            }
        }
    }
}
