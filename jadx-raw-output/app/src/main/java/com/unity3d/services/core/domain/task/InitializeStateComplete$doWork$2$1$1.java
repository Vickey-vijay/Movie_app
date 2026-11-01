package com.unity3d.services.core.domain.task;

import bk.p;
import com.unity3d.ads.datastore.ByteStringStoreOuterClass;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import mj.r;
import rj.c;
import sj.a;
import tj.d;

/* JADX INFO: compiled from: InitializeStateComplete.kt */
/* JADX INFO: loaded from: classes6.dex */
@d(c = "com.unity3d.services.core.domain.task.InitializeStateComplete$doWork$2$1$1", f = "InitializeStateComplete.kt", l = {}, m = "invokeSuspend")
public final class InitializeStateComplete$doWork$2$1$1 extends SuspendLambda implements p<ByteStringStoreOuterClass.ByteStringStore, c<? super ByteStringStoreOuterClass.ByteStringStore>, Object> {
    public /* synthetic */ Object L$0;
    public int label;

    public InitializeStateComplete$doWork$2$1$1(c<? super InitializeStateComplete$doWork$2$1$1> cVar) {
        super(2, cVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final c<r> create(Object obj, c<?> cVar) {
        InitializeStateComplete$doWork$2$1$1 initializeStateComplete$doWork$2$1$1 = new InitializeStateComplete$doWork$2$1$1(cVar);
        initializeStateComplete$doWork$2$1$1.L$0 = obj;
        return initializeStateComplete$doWork$2$1$1;
    }

    @Override // bk.p
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public final Object mo1invoke(ByteStringStoreOuterClass.ByteStringStore byteStringStore, c<? super ByteStringStoreOuterClass.ByteStringStore> cVar) {
        return ((InitializeStateComplete$doWork$2$1$1) create(byteStringStore, cVar)).invokeSuspend(r.f64562a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        a.f();
        if (this.label == 0) {
            kotlin.c.b(obj);
            ByteStringStoreOuterClass.ByteStringStore byteStringStoreBuild = ((ByteStringStoreOuterClass.ByteStringStore) this.L$0).toBuilder().clear().build();
            ck.p.i(byteStringStoreBuild, "it.toBuilder().clear().build()");
            return byteStringStoreBuild;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
