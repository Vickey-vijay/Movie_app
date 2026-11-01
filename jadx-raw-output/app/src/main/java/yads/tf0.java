package yads;

import kotlin.Result;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes2.dex */
public final class tf0 extends Lambda implements bk.l {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ nk.l f83009b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tf0(kotlinx.coroutines.c cVar) {
        super(1);
        this.f83009b = cVar;
    }

    @Override // bk.l
    public final Object invoke(Object obj) {
        Throwable th2 = (Throwable) obj;
        if (this.f83009b.isActive()) {
            nk.l lVar = this.f83009b;
            Result.a aVar = Result.Companion;
            lVar.resumeWith(Result.m3458constructorimpl(kotlin.c.a(th2)));
        }
        return mj.r.f64562a;
    }
}
