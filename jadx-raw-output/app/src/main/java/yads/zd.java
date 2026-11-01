package yads;

import android.content.Context;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.TimeoutKt;

/* JADX INFO: loaded from: classes11.dex */
public final class zd extends SuspendLambda implements bk.p {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f85345b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Context f85346c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zd(Context context, rj.c cVar) {
        super(2, cVar);
        this.f85346c = context;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final rj.c create(Object obj, rj.c cVar) {
        return new zd(this.f85346c, cVar);
    }

    @Override // bk.p
    /* JADX INFO: renamed from: invoke */
    public final Object mo1invoke(Object obj, Object obj2) {
        return new zd(this.f85346c, (rj.c) obj2).invokeSuspend(mj.r.f64562a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        yd ydVar;
        Object objF = sj.a.f();
        int i10 = this.f85345b;
        if (i10 != 0) {
            if (i10 == 1) {
                kotlin.c.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            kotlin.c.b(obj);
            Object obj2 = yd.f84887d;
            Context context = this.f85346c;
            yd ydVar2 = yd.f84888e;
            if (ydVar2 == null) {
                synchronized (yd.f84887d) {
                    ydVar = yd.f84888e;
                    if (ydVar == null) {
                        ydVar = new yd(kotlinx.coroutines.d.a(nk.j2.b(null, 1, null).plus(nk.w0.b()).plus(new x10())), new le(), new ie(context));
                        yd.f84888e = ydVar;
                    }
                }
                ydVar2 = ydVar;
            }
            this.f85345b = 1;
            obj = TimeoutKt.d(((Number) ydVar2.f84890b.f78160b.getValue()).longValue(), new xd(ydVar2, null), this);
            if (obj == objF) {
                return objF;
            }
        }
        return obj;
    }
}
