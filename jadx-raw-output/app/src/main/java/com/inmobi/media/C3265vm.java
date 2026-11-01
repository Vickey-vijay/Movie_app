package com.inmobi.media;

import com.inmobi.media.core.config.models.AdConfig;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: renamed from: com.inmobi.media.vm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C3265vm extends SuspendLambda implements bk.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f25592a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f25593b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ArrayList f25594c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ double f25595d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ AdConfig.VastVideoConfig f25596e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3265vm(ArrayList arrayList, double d10, AdConfig.VastVideoConfig vastVideoConfig, rj.c cVar) {
        super(2, cVar);
        this.f25594c = arrayList;
        this.f25595d = d10;
        this.f25596e = vastVideoConfig;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final rj.c create(Object obj, rj.c cVar) {
        C3265vm c3265vm = new C3265vm(this.f25594c, this.f25595d, this.f25596e, cVar);
        c3265vm.f25593b = obj;
        return c3265vm;
    }

    @Override // bk.p
    /* JADX INFO: renamed from: invoke */
    public final Object mo1invoke(Object obj, Object obj2) {
        return ((C3265vm) create((nk.l0) obj, (rj.c) obj2)).invokeSuspend(mj.r.f64562a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objA;
        Object objF = sj.a.f();
        int i10 = this.f25592a;
        if (i10 == 0) {
            kotlin.c.b(obj);
            nk.l0 l0Var = (nk.l0) this.f25593b;
            if (this.f25594c.isEmpty()) {
                return nj.s.k();
            }
            int iA = AbstractC3323y5.a();
            Pe peA = AbstractC3322y4.a();
            ArrayList arrayList = this.f25594c;
            double d10 = this.f25595d;
            AdConfig.VastVideoConfig vastVideoConfig = this.f25596e;
            ArrayList arrayList2 = new ArrayList(nj.t.v(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ArrayList arrayList3 = arrayList2;
                arrayList3.add(nk.j.b(l0Var, null, null, new C3215tm((C3115pl) it.next(), d10, peA, iA, vastVideoConfig, null), 3, null));
                arrayList2 = arrayList3;
                d10 = d10;
            }
            this.f25592a = 1;
            objA = nk.e.a(arrayList2, this);
            if (objA == objF) {
                return objF;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.c.b(obj);
            objA = obj;
        }
        List listH0 = nj.b0.H0((Iterable) objA, new C3240um());
        ArrayList arrayList4 = new ArrayList(nj.t.v(listH0, 10));
        Iterator it2 = listH0.iterator();
        while (it2.hasNext()) {
            arrayList4.add((C3115pl) ((Pair) it2.next()).getFirst());
        }
        return arrayList4;
    }
}
