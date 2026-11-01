package yads;

import java.util.List;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes4.dex */
public final class wh2 extends SuspendLambda implements bk.p {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f84213b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ List f84214c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wh2(List list, rj.c cVar) {
        super(2, cVar);
        this.f84214c = list;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final rj.c create(Object obj, rj.c cVar) {
        return new wh2(this.f84214c, cVar);
    }

    @Override // bk.p
    /* JADX INFO: renamed from: invoke */
    public final Object mo1invoke(Object obj, Object obj2) {
        return new wh2(this.f84214c, (rj.c) obj2).invokeSuspend(mj.r.f64562a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objF = sj.a.f();
        int i10 = this.f84213b;
        if (i10 != 0) {
            if (i10 == 1) {
                kotlin.c.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            kotlin.c.b(obj);
            List list = this.f84214c;
            this.f84213b = 1;
            obj = nk.e.a(list, this);
            if (obj == objF) {
                return objF;
            }
        }
        return nj.b0.c0((Iterable) obj);
    }
}
