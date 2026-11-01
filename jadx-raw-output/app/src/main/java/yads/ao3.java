package yads;

import android.content.Context;
import android.webkit.WebSettings;
import kotlin.Result;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes10.dex */
public final class ao3 extends SuspendLambda implements bk.p {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f75589b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Context f75590c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ao3(Context context, rj.c cVar) {
        super(2, cVar);
        this.f75590c = context;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final rj.c create(Object obj, rj.c cVar) {
        ao3 ao3Var = new ao3(this.f75590c, cVar);
        ao3Var.f75589b = obj;
        return ao3Var;
    }

    @Override // bk.p
    /* JADX INFO: renamed from: invoke */
    public final Object mo1invoke(Object obj, Object obj2) {
        ao3 ao3Var = new ao3(this.f75590c, (rj.c) obj2);
        ao3Var.f75589b = (nk.l0) obj;
        return ao3Var.invokeSuspend(mj.r.f64562a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM3458constructorimpl;
        sj.a.f();
        kotlin.c.b(obj);
        Context context = this.f75590c;
        try {
            Result.a aVar = Result.Companion;
            objM3458constructorimpl = Result.m3458constructorimpl(WebSettings.getDefaultUserAgent(context.getApplicationContext()));
        } catch (Throwable th2) {
            Result.a aVar2 = Result.Companion;
            objM3458constructorimpl = Result.m3458constructorimpl(kotlin.c.a(th2));
        }
        return Result.m3457boximpl(objM3458constructorimpl);
    }
}
