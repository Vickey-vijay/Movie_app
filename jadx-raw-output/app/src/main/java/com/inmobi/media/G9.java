package com.inmobi.media;

import com.inmobi.unifiedId.InMobiUnifiedIdInterface;
import com.inmobi.unifiedId.InMobiUnifiedIdService;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes5.dex */
public final class G9 extends SuspendLambda implements bk.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f22722a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InMobiUnifiedIdInterface f22723b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public G9(InMobiUnifiedIdInterface inMobiUnifiedIdInterface, rj.c cVar) {
        super(2, cVar);
        this.f22723b = inMobiUnifiedIdInterface;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final rj.c create(Object obj, rj.c cVar) {
        return new G9(this.f22723b, cVar);
    }

    @Override // bk.p
    /* JADX INFO: renamed from: invoke */
    public final Object mo1invoke(Object obj, Object obj2) {
        return new G9(this.f22723b, (rj.c) obj2).invokeSuspend(mj.r.f64562a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objF = sj.a.f();
        int i10 = this.f22722a;
        if (i10 != 0) {
            if (i10 == 1) {
                kotlin.c.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            kotlin.c.b(obj);
            InMobiUnifiedIdInterface inMobiUnifiedIdInterface = this.f22723b;
            this.f22722a = 1;
            if (InMobiUnifiedIdService.fetchUnifiedIdsInternal$media_release(inMobiUnifiedIdInterface, this) == objF) {
                return objF;
            }
        }
        return mj.r.f64562a;
    }
}
