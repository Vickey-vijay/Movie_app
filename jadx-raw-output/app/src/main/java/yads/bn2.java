package yads;

import kotlin.Result;
import kotlin.jvm.internal.Lambda;
import kotlinx.serialization.SerializationException;

/* JADX INFO: loaded from: classes11.dex */
public final class bn2 extends Lambda implements bk.l {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ nk.l f75914b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bn2(kotlinx.coroutines.c cVar) {
        super(1);
        this.f75914b = cVar;
    }

    @Override // bk.l
    public final Object invoke(Object obj) throws im3 {
        im3 im3Var = (im3) obj;
        if (im3Var.getCause() instanceof SerializationException) {
            throw im3Var;
        }
        nk.l lVar = this.f75914b;
        Result.a aVar = Result.Companion;
        lVar.resumeWith(Result.m3458constructorimpl(Result.m3457boximpl(Result.m3458constructorimpl(kotlin.c.a(im3Var)))));
        return mj.r.f64562a;
    }
}
