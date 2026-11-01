package yads;

import android.graphics.Bitmap;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Result;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.sequences.SequencesKt___SequencesKt;

/* JADX INFO: loaded from: classes2.dex */
public final class f42 extends SuspendLambda implements bk.p {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f77297b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ j42 f77298c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ry1 f77299d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ mi2 f77300e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f42(j42 j42Var, ry1 ry1Var, mi2 mi2Var, rj.c cVar) {
        super(2, cVar);
        this.f77298c = j42Var;
        this.f77299d = ry1Var;
        this.f77300e = mi2Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final rj.c create(Object obj, rj.c cVar) {
        return new f42(this.f77298c, this.f77299d, this.f77300e, cVar);
    }

    @Override // bk.p
    /* JADX INFO: renamed from: invoke */
    public final Object mo1invoke(Object obj, Object obj2) {
        return ((f42) create((nk.l0) obj, (rj.c) obj2)).invokeSuspend(mj.r.f64562a);
    }

    /* JADX WARN: Code duplicated, block: B:70:0x0193  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Bitmap bitmapA;
        Object objM3458constructorimpl;
        Object objF = sj.a.f();
        int i10 = this.f77297b;
        if (i10 == 0) {
            kotlin.c.b(obj);
            z32 z32Var = this.f77298c.f78912a;
            ry1 ry1Var = this.f77299d;
            mi2 mi2Var = this.f77300e;
            this.f77297b = 1;
            n41 n41Var = (n41) z32Var.f85194g.invoke(mi2Var);
            g51 g51Var = z32Var.f85193f;
            g51Var.getClass();
            v9 v9Var = ry1Var.f82467b;
            d12 d12Var = ry1Var.f82466a;
            List list = d12Var.f76509a;
            b51 b51Var = g51Var.f77636a;
            b51Var.getClass();
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                nj.x.C(linkedHashSet, b51Var.a(((fy1) it.next()).f77546b));
            }
            g51Var.f77636a.getClass();
            List list2 = d12Var.f76514f;
            LinkedHashSet linkedHashSet2 = new LinkedHashSet();
            Iterator it2 = list2.iterator();
            while (it2.hasNext()) {
                List listK = ((gi0) it2.next()).f77810d;
                if (listK == null) {
                    listK = nj.s.k();
                }
                nj.x.C(linkedHashSet2, listK);
            }
            Set setM = nj.r0.m(linkedHashSet, linkedHashSet2);
            d72 d72Var = g51Var.f77637b;
            d72Var.getClass();
            Set setV = SequencesKt___SequencesKt.V(SequencesKt___SequencesKt.L(SequencesKt___SequencesKt.L(SequencesKt___SequencesKt.E(nj.b0.S(d12Var.f76509a), new a72(d72Var)), b72.f75752b), c72.f76199b));
            Set setM2 = nj.r0.m(setM, setV);
            if (!v9Var.B) {
                setM = null;
            }
            if (setM == null) {
                setM = nj.q0.f();
            }
            Set setM3 = nj.r0.m(setV, setM);
            HashSet hashSet = new HashSet();
            for (Object obj2 : setM3) {
                if (((u41) obj2).f83371f) {
                    hashSet.add(obj2);
                }
            }
            Set setK = nj.r0.k(setM2, hashSet);
            n41Var.getClass();
            ArrayList<u41> arrayList = new ArrayList();
            for (Object obj3 : setM2) {
                String str = ((u41) obj3).f83372g;
                if (str != null && (!lk.a0.n0(str))) {
                    arrayList.add(obj3);
                }
            }
            for (u41 u41Var : arrayList) {
                mi2 mi2Var2 = n41Var.f80551a;
                mi2Var2.getClass();
                String str2 = u41Var.f83372g;
                li2 li2Var = str2 != null ? new li2(str2, new yz2(u41Var.f83366a, u41Var.f83367b)) : null;
                if ((li2Var != null ? (Bitmap) mi2Var2.f80184c.get(li2Var) : null) == null && n41Var.f80551a.a(u41Var) == null) {
                    m41 m41Var = n41Var.f80552b;
                    m41Var.getClass();
                    String str3 = u41Var.f83372g;
                    if (str3 == null) {
                        bitmapA = null;
                    } else {
                        m41Var.f80079a.getClass();
                        Bitmap bitmapA2 = si2.a(str3);
                        if (bitmapA2 != null) {
                            try {
                                Result.a aVar = Result.Companion;
                                objM3458constructorimpl = Result.m3458constructorimpl(m41Var.f80080b.a(bitmapA2, u41Var));
                            } catch (Throwable th2) {
                                Result.a aVar2 = Result.Companion;
                                objM3458constructorimpl = Result.m3458constructorimpl(kotlin.c.a(th2));
                            }
                            if (Result.m3463isFailureimpl(objM3458constructorimpl)) {
                                objM3458constructorimpl = null;
                            }
                            bitmapA = (Bitmap) objM3458constructorimpl;
                        } else {
                            bitmapA = null;
                        }
                        if (bitmapA != null) {
                            m41Var.f80081c.getClass();
                            try {
                                bitmapA = kq.a(bitmapA, 1.0d);
                            } catch (Throwable unused) {
                            }
                        } else {
                            bitmapA = null;
                        }
                    }
                    if (bitmapA != null) {
                        mi2 mi2Var3 = n41Var.f80551a;
                        mi2Var3.getClass();
                        String str4 = u41Var.f83372g;
                        li2 li2Var2 = str4 != null ? new li2(str4, new yz2(u41Var.f83366a, u41Var.f83367b)) : null;
                        if (li2Var2 != null) {
                            mi2Var3.f80184c.put(li2Var2, bitmapA);
                        }
                    }
                }
            }
            String str5 = ry1Var.f82467b.f83831w;
            r32 r32Var = r32.f82092c;
            if (ck.p.e(str5, "loading_on_back")) {
                c41 c41Var = z32Var.f85192e;
                c41Var.getClass();
                nk.j.d(z32Var.f85188a, null, null, new y32(qk.e.e(new a41(c41Var, setK, null)), mi2Var, null), 3, null);
            }
            Object objA = z32Var.a(hashSet, mi2Var, ry1Var, this);
            if (objA != sj.a.f()) {
                objA = mj.r.f64562a;
            }
            if (objA == objF) {
                return objF;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.c.b(obj);
        }
        return mj.r.f64562a;
    }
}
