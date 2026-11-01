package yads;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes7.dex */
public final class vh2 extends SuspendLambda implements bk.p {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f83912b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ List f83913c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xh2 f83914d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Context f83915e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ e00 f83916f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ a03 f83917g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ long f83918h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vh2(long j10, Context context, e00 e00Var, a03 a03Var, xh2 xh2Var, List list, rj.c cVar) {
        super(2, cVar);
        this.f83913c = list;
        this.f83914d = xh2Var;
        this.f83915e = context;
        this.f83916f = e00Var;
        this.f83917g = a03Var;
        this.f83918h = j10;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final rj.c create(Object obj, rj.c cVar) {
        List list = this.f83913c;
        xh2 xh2Var = this.f83914d;
        vh2 vh2Var = new vh2(this.f83918h, this.f83915e, this.f83916f, this.f83917g, xh2Var, list, cVar);
        vh2Var.f83912b = obj;
        return vh2Var;
    }

    @Override // bk.p
    /* JADX INFO: renamed from: invoke */
    public final Object mo1invoke(Object obj, Object obj2) {
        return ((vh2) create((nk.l0) obj, (rj.c) obj2)).invokeSuspend(mj.r.f64562a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        sj.a.f();
        kotlin.c.b(obj);
        nk.l0 l0Var = (nk.l0) this.f83912b;
        List<cs1> list = this.f83913c;
        xh2 xh2Var = this.f83914d;
        Context context = this.f83915e;
        e00 e00Var = this.f83916f;
        a03 a03Var = this.f83917g;
        long j10 = this.f83918h;
        ArrayList arrayList = new ArrayList(nj.t.v(list, 10));
        for (cs1 cs1Var : list) {
            xh2Var.getClass();
            ArrayList arrayList2 = arrayList;
            arrayList2.add(nk.j.b(l0Var, null, null, new sh2(xh2Var, cs1Var, context, e00Var, j10, a03Var, null), 3, null));
            arrayList = arrayList2;
            j10 = j10;
        }
        return arrayList;
    }
}
