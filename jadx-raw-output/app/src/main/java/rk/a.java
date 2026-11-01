package rk;

import java.util.Arrays;
import kotlin.Result;
import qk.u;
import rk.c;

/* JADX INFO: compiled from: AbstractSharedFlow.kt */
/* JADX INFO: loaded from: classes9.dex */
public abstract class a<S extends c<?>> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public S[] f66783b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f66784c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f66785d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public s f66786e;

    public final S e() {
        S s10;
        s sVar;
        synchronized (this) {
            S[] sArr = this.f66783b;
            if (sArr == null) {
                sArr = (S[]) j(2);
                this.f66783b = sArr;
            } else if (this.f66784c >= sArr.length) {
                Object[] objArrCopyOf = Arrays.copyOf(sArr, sArr.length * 2);
                ck.p.i(objArrCopyOf, "copyOf(...)");
                this.f66783b = (S[]) ((c[]) objArrCopyOf);
                sArr = (S[]) ((c[]) objArrCopyOf);
            }
            int i10 = this.f66785d;
            do {
                s10 = sArr[i10];
                if (s10 == null) {
                    s10 = (S) f();
                    sArr[i10] = s10;
                }
                i10++;
                if (i10 >= sArr.length) {
                    i10 = 0;
                }
                ck.p.h(s10, "null cannot be cast to non-null type kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot<kotlin.Any>");
            } while (!s10.a(this));
            this.f66785d = i10;
            this.f66784c++;
            sVar = this.f66786e;
        }
        if (sVar != null) {
            sVar.Z(1);
        }
        return s10;
    }

    public abstract S f();

    public final u<Integer> i() {
        s sVar;
        synchronized (this) {
            sVar = this.f66786e;
            if (sVar == null) {
                sVar = new s(this.f66784c);
                this.f66786e = sVar;
            }
        }
        return sVar;
    }

    public abstract S[] j(int i10);

    public final void k(S s10) {
        s sVar;
        int i10;
        rj.c<mj.r>[] cVarArrB;
        synchronized (this) {
            int i11 = this.f66784c - 1;
            this.f66784c = i11;
            sVar = this.f66786e;
            if (i11 == 0) {
                this.f66785d = 0;
            }
            ck.p.h(s10, "null cannot be cast to non-null type kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot<kotlin.Any>");
            cVarArrB = s10.b(this);
        }
        for (rj.c<mj.r> cVar : cVarArrB) {
            if (cVar != null) {
                Result.a aVar = Result.Companion;
                cVar.resumeWith(Result.m3458constructorimpl(mj.r.f64562a));
            }
        }
        if (sVar != null) {
            sVar.Z(-1);
        }
    }

    public final int l() {
        return this.f66784c;
    }

    public final S[] m() {
        return this.f66783b;
    }
}
