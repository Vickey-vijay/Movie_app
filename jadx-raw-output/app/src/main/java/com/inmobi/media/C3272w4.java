package com.inmobi.media;

import com.safedk.android.internal.partials.InMobiNetworkBridge;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import okhttp3.Call;
import okhttp3.OkHttpClient;
import okhttp3.Request;

/* JADX INFO: renamed from: com.inmobi.media.w4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C3272w4 extends SuspendLambda implements bk.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f25622a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ OkHttpClient f25623b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Request f25624c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3272w4(OkHttpClient okHttpClient, Request request, rj.c cVar) {
        super(2, cVar);
        this.f25623b = okHttpClient;
        this.f25624c = request;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final rj.c create(Object obj, rj.c cVar) {
        return new C3272w4(this.f25623b, this.f25624c, cVar);
    }

    @Override // bk.p
    /* JADX INFO: renamed from: invoke */
    public final Object mo1invoke(Object obj, Object obj2) {
        return new C3272w4(this.f25623b, this.f25624c, (rj.c) obj2).invokeSuspend(mj.r.f64562a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objF = sj.a.f();
        int i10 = this.f25622a;
        if (i10 != 0) {
            if (i10 == 1) {
                kotlin.c.b(obj);
                return obj;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.c.b(obj);
        Call callNewCall = this.f25623b.newCall(this.f25624c);
        ck.p.i(callNewCall, "newCall(...)");
        this.f25622a = 1;
        kotlinx.coroutines.c cVar = new kotlinx.coroutines.c(IntrinsicsKt__IntrinsicsJvmKt.c(this), 1);
        cVar.J();
        cVar.p(new C2788cl(callNewCall));
        InMobiNetworkBridge.okhttp3CallEnqueue(callNewCall, new C2814dl(cVar));
        Object objB = cVar.B();
        if (objB == sj.a.f()) {
            tj.f.c(this);
        }
        if (objB == objF) {
            return objF;
        }
        return objB;
    }
}
