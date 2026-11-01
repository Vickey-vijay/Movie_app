package nk;

import kotlinx.coroutines.JobSupport;

/* JADX INFO: compiled from: JobSupport.kt */
/* JADX INFO: loaded from: classes3.dex */
public class s1 extends JobSupport implements x {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f64822d;

    public s1(kotlinx.coroutines.g gVar) {
        super(true);
        y0(gVar);
        this.f64822d = e1();
    }

    @Override // kotlinx.coroutines.JobSupport
    public boolean p0() {
        return true;
    }

    @Override // nk.x
    public boolean complete() {
        return E0(mj.r.f64562a);
    }

    @Override // kotlinx.coroutines.JobSupport
    public boolean n0() {
        return this.f64822d;
    }

    public final boolean e1() {
        s sVar;
        JobSupport jobSupportT;
        s sVar2;
        r rVarS0 = s0();
        if (rVarS0 instanceof s) {
            sVar = (s) rVarS0;
        } else {
            sVar = null;
        }
        if (sVar != null && (jobSupportT = sVar.t()) != null) {
            while (!jobSupportT.n0()) {
                r rVarS1 = jobSupportT.s0();
                if (rVarS1 instanceof s) {
                    sVar2 = (s) rVarS1;
                } else {
                    sVar2 = null;
                }
                if (sVar2 == null || (jobSupportT = sVar2.t()) == null) {
                }
            }
            return true;
        }
        return false;
    }
}
