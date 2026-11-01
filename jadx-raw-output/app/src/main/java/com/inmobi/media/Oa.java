package com.inmobi.media;

import java.util.LinkedHashMap;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes6.dex */
public final class Oa extends SuspendLambda implements bk.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ LinkedHashMap f23280a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Na f23281b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Oa(LinkedHashMap linkedHashMap, Na na2, rj.c cVar) {
        super(2, cVar);
        this.f23280a = linkedHashMap;
        this.f23281b = na2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final rj.c create(Object obj, rj.c cVar) {
        return new Oa(this.f23280a, this.f23281b, cVar);
    }

    @Override // bk.p
    /* JADX INFO: renamed from: invoke */
    public final Object mo1invoke(Object obj, Object obj2) {
        return new Oa(this.f23280a, this.f23281b, (rj.c) obj2).invokeSuspend(mj.r.f64562a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        sj.a.f();
        kotlin.c.b(obj);
        this.f23280a.put("networkType", C3298x5.m());
        String str = this.f23281b.f23232a;
        LinkedHashMap linkedHashMap = this.f23280a;
        Wj wj2 = Wj.f23753a;
        Wj.b(str, linkedHashMap, EnumC2735ak.SDK);
        return mj.r.f64562a;
    }
}
