package rj;

import bk.p;
import kotlin.Result;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import mj.r;

/* JADX INFO: compiled from: Continuation.kt */
/* JADX INFO: loaded from: classes11.dex */
public final class d {
    public static final <R, T> void a(p<? super R, ? super c<? super T>, ? extends Object> pVar, R r10, c<? super T> cVar) {
        ck.p.j(pVar, "<this>");
        ck.p.j(cVar, "completion");
        c cVarC = IntrinsicsKt__IntrinsicsJvmKt.c(IntrinsicsKt__IntrinsicsJvmKt.a(pVar, r10, cVar));
        Result.a aVar = Result.Companion;
        cVarC.resumeWith(Result.m3458constructorimpl(r.f64562a));
    }
}
