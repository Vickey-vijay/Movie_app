package j;

import com.yk.e.object.AdSdkStateCode;
import com.yk.e.util.AdLog;

/* JADX INFO: loaded from: classes8.dex */
public final class j2 implements gl.t1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ l0 f61526a;

    public j2(l0 l0Var) {
        this.f61526a = l0Var;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0063  */
    /* JADX WARN: Code duplicated, block: B:29:0x0070  */
    /* JADX WARN: Code duplicated, block: B:34:0x0092 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:36:0x0095 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:41:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:43:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:44:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:46:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:47:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:52:0x0056 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // gl.t1
    public final void a() {
        boolean z10;
        l0 l0Var;
        l0 l0Var2;
        l0 l0Var3;
        i.b bVarA;
        l0 l0Var4;
        i.b bVar;
        if (this.f61526a.s()) {
            return;
        }
        if (this.f61526a.f61544j) {
            AdLog.i("BaseSliceLoader", "bid time out from refresh");
            return;
        }
        a.d dVarC = a.d.c();
        int iT = this.f61526a.t();
        String str = this.f61526a.f61536b;
        dVarC.getClass();
        a.a aVarB = a.d.b(iT);
        if (aVarB != null) {
            if (aVarB.g(str) == 0) {
                z10 = false;
            }
            l0Var = this.f61526a;
            if (l0Var.f61560z == null && !z10 && l0Var.A == null) {
                AdLog.i("BaseSliceLoader", "ad cache is null");
            }
            l0Var2 = this.f61526a;
            synchronized (l0Var2) {
                l0Var2.f61551q++;
            }
            l0Var3 = this.f61526a;
            if (l0Var3.f61546l) {
                bVarA = l0Var3.a().a(this.f61526a.f61536b);
            } else {
                bVarA = null;
            }
            AdLog.i("BaseSliceLoader", "is read cache list, state = " + this.f61526a.f61546l);
            l0Var4 = this.f61526a;
            bVar = l0Var4.f61560z;
            if (bVarA != null && bVar == null) {
                bVarA = null;
            } else if (bVarA != null || (bVar != null && bVarA.f54013b <= bVar.f54013b)) {
                bVarA = bVar;
            }
            if (bVarA == null) {
                bVarA = l0Var4.A;
                AdLog.i("BaseSliceLoader", "set backstopCacheData");
            } else {
                l0Var4.A = null;
                AdLog.i("BaseSliceLoader", "destroy backstopCacheData");
            }
            if (bVarA == null) {
                this.f61526a.b(AdSdkStateCode.THIRD_RENDER_FAILED, "load bidding ad time out!");
            } else {
                this.f61526a.m(bVarA, "time out");
            }
        }
        AdLog.i("AdCacheRefreshUtils", "loadNextAd, adCache is null");
        z10 = true;
        l0Var = this.f61526a;
        if (l0Var.f61560z == null) {
            AdLog.i("BaseSliceLoader", "ad cache is null");
        }
        l0Var2 = this.f61526a;
        synchronized (l0Var2) {
            l0Var2.f61551q++;
            l0Var3 = this.f61526a;
            if (l0Var3.f61546l) {
                bVarA = l0Var3.a().a(this.f61526a.f61536b);
            } else {
                bVarA = null;
            }
            AdLog.i("BaseSliceLoader", "is read cache list, state = " + this.f61526a.f61546l);
            l0Var4 = this.f61526a;
            bVar = l0Var4.f61560z;
            if (bVarA != null) {
                if (bVarA != null) {
                    bVarA = bVar;
                } else {
                    bVarA = bVar;
                }
            } else if (bVarA != null) {
                bVarA = bVar;
            } else {
                bVarA = bVar;
            }
            if (bVarA == null) {
                bVarA = l0Var4.A;
                AdLog.i("BaseSliceLoader", "set backstopCacheData");
            } else {
                l0Var4.A = null;
                AdLog.i("BaseSliceLoader", "destroy backstopCacheData");
            }
            if (bVarA == null) {
                this.f61526a.b(AdSdkStateCode.THIRD_RENDER_FAILED, "load bidding ad time out!");
            } else {
                this.f61526a.m(bVarA, "time out");
            }
        }
    }
}
