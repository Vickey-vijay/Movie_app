package yads;

import kotlin.Result;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes10.dex */
public final class sf0 extends Lambda implements bk.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ nk.l f82628b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sf0(kotlinx.coroutines.c cVar) {
        super(0);
        this.f82628b = cVar;
    }

    @Override // bk.a
    public final Object invoke() {
        if (this.f82628b.isActive()) {
            nk.l lVar = this.f82628b;
            Result.a aVar = Result.Companion;
            lVar.resumeWith(Result.m3458constructorimpl(Result.m3457boximpl(Result.m3458constructorimpl(mj.r.f64562a))));
        }
        return mj.r.f64562a;
    }
}
