package yads;

import kotlin.Result;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes10.dex */
public final class an2 extends Lambda implements bk.l {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ nk.l f75577b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public an2(kotlinx.coroutines.c cVar) {
        super(1);
        this.f75577b = cVar;
    }

    @Override // bk.l
    public final Object invoke(Object obj) {
        this.f75577b.resumeWith(Result.m3458constructorimpl(Result.m3457boximpl(Result.m3458constructorimpl((j80) obj))));
        return mj.r.f64562a;
    }
}
