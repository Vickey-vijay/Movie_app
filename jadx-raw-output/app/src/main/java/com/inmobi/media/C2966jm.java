package com.inmobi.media;

import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.Map;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: renamed from: com.inmobi.media.jm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C2966jm extends SuspendLambda implements bk.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f24632a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f24633b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C3091om f24634c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2966jm(C3091om c3091om, rj.c cVar) {
        super(2, cVar);
        this.f24634c = c3091om;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final rj.c create(Object obj, rj.c cVar) {
        C2966jm c2966jm = new C2966jm(this.f24634c, cVar);
        c2966jm.f24633b = obj;
        return c2966jm;
    }

    @Override // bk.p
    /* JADX INFO: renamed from: invoke */
    public final Object mo1invoke(Object obj, Object obj2) {
        C2966jm c2966jm = new C2966jm(this.f24634c, (rj.c) obj2);
        c2966jm.f24633b = (Rl) obj;
        return c2966jm.invokeSuspend(mj.r.f64562a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object obj2;
        Object objF = sj.a.f();
        int i10 = this.f24632a;
        if (i10 != 0) {
            if (i10 == 1) {
                obj2 = (Rl) this.f24633b;
                kotlin.c.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            kotlin.c.b(obj);
            Rl rl2 = (Rl) this.f24633b;
            qk.k kVar = this.f24634c.f25011d;
            this.f24633b = rl2;
            this.f24632a = 1;
            if (kVar.emit(rl2, this) == objF) {
                return objF;
            }
            obj2 = rl2;
        }
        C3142qn c3142qn = this.f24634c.f25010c.f25102g;
        ck.p.j(obj2, "mediaEvent");
        if (obj2 instanceof Bm) {
            Map mapA = AbstractC2939ik.a(c3142qn.f25204a);
            Wj wj2 = Wj.f23753a;
            Wj.b("VideoLoadStarted", mapA, EnumC2735ak.SDK);
        } else if (obj2 instanceof Em) {
            Map mapA2 = AbstractC2939ik.a(c3142qn.f25204a);
            Wj wj3 = Wj.f23753a;
            Wj.b("VideoLoadSuccess", mapA2, EnumC2735ak.SDK);
        } else if (obj2 instanceof C2992kn) {
            boolean[] zArr = c3142qn.f25205b;
            if (!zArr[0]) {
                zArr[0] = true;
                Map mapA3 = AbstractC2939ik.a(c3142qn.f25204a);
                Wj wj4 = Wj.f23753a;
                Wj.b("VideoStart", mapA3, EnumC2735ak.SDK);
            }
        } else if (obj2 instanceof C3315xm) {
            boolean[] zArr2 = c3142qn.f25205b;
            if (!zArr2[1]) {
                zArr2[1] = true;
                Map mapA4 = AbstractC2939ik.a(c3142qn.f25204a);
                Wj wj5 = Wj.f23753a;
                Wj.b("VideoFirstQuartile", mapA4, EnumC2735ak.SDK);
            }
        } else if (obj2 instanceof C2942in) {
            boolean[] zArr3 = c3142qn.f25205b;
            if (!zArr3[2]) {
                zArr3[2] = true;
                Map mapA5 = AbstractC2939ik.a(c3142qn.f25204a);
                Wj wj6 = Wj.f23753a;
                Wj.b("VideoSecondQuartile", mapA5, EnumC2735ak.SDK);
            }
        } else if (obj2 instanceof C3166rn) {
            boolean[] zArr4 = c3142qn.f25205b;
            if (!zArr4[3]) {
                zArr4[3] = true;
                Map mapA6 = AbstractC2939ik.a(c3142qn.f25204a);
                Wj wj7 = Wj.f23753a;
                Wj.b("VideoThirdQuartile", mapA6, EnumC2735ak.SDK);
            }
        } else if (obj2 instanceof Pl) {
            boolean[] zArr5 = c3142qn.f25205b;
            if (!zArr5[4]) {
                zArr5[4] = true;
                Map mapA7 = AbstractC2939ik.a(c3142qn.f25204a);
                Wj wj8 = Wj.f23753a;
                Wj.b("VideoComplete", mapA7, EnumC2735ak.SDK);
            }
        } else if (obj2 instanceof Ql) {
            ((Ql) obj2).getClass();
            Map mapB = kotlin.collections.a.B(AbstractC2939ik.a(c3142qn.f25204a));
            mapB.put(IronSourceConstants.EVENTS_ERROR_CODE, (short) 66);
            Wj wj9 = Wj.f23753a;
            Wj.b("VideoLoadFailure", mapB, EnumC2735ak.SDK);
        }
        Ml ml2 = this.f24634c.f25010c.f25101f;
        ck.p.j(obj2, "mediaEvent");
        if (obj2 instanceof Em) {
            ml2.f23179a.f23158d = AbstractC2916hl.a(((Em) obj2).f22607a);
            ml2.f23180b.f23104f.a(Te.f23560a);
        } else if (obj2 instanceof Ql) {
            ((Ql) obj2).getClass();
            ml2.f23180b.f23110l.a(new Fo(nj.l0.g(mj.h.a("[ERRORCODE]", String.valueOf(405))), null, 2));
        } else if (obj2 instanceof C2992kn) {
            ml2.f23180b.f23105g.a(Te.f23560a);
        } else if (obj2 instanceof C2918hn) {
            ml2.f23180b.f23109k.a(Te.f23560a);
        } else if (obj2 instanceof Om) {
            ml2.f23180b.f23108j.a(Te.f23560a);
        } else if (obj2 instanceof C3315xm) {
            ml2.f23180b.f23100b.a(Te.f23560a);
        } else if (obj2 instanceof C2942in) {
            ml2.f23180b.f23101c.a(Te.f23560a);
        } else if (obj2 instanceof C3166rn) {
            ml2.f23180b.f23102d.a(Te.f23560a);
        } else if (obj2 instanceof Pl) {
            ml2.f23180b.f23103e.a(Te.f23560a);
        } else if (obj2 instanceof Xm) {
            ml2.f23179a.f23159e = ((Xm) obj2).f23806a;
            ml2.f23180b.f23111m.a(Te.f23560a);
        } else if (obj2 instanceof S1) {
            if (((S1) obj2).f23476a) {
                ml2.f23180b.f23106h.a(Te.f23560a);
            } else {
                ml2.f23180b.f23107i.a(Te.f23560a);
            }
        } else if (obj2 instanceof W3) {
            ml2.f23180b.f23112n.a(new Fo(null, ((W3) obj2).f23723a, 1));
        }
        return mj.r.f64562a;
    }
}
