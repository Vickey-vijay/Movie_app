package com.inmobi.media;

import android.os.Message;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: renamed from: com.inmobi.media.f3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C2847f3 extends SuspendLambda implements bk.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f24333a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ HandlerC2873g3 f24334b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2847f3(HandlerC2873g3 handlerC2873g3, rj.c cVar) {
        super(2, cVar);
        this.f24334b = handlerC2873g3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final rj.c create(Object obj, rj.c cVar) {
        return new C2847f3(this.f24334b, cVar);
    }

    @Override // bk.p
    /* JADX INFO: renamed from: invoke */
    public final Object mo1invoke(Object obj, Object obj2) {
        return new C2847f3(this.f24334b, (rj.c) obj2).invokeSuspend(mj.r.f64562a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objF = sj.a.f();
        int i10 = this.f24333a;
        if (i10 != 0) {
            if (i10 == 1) {
                kotlin.c.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            kotlin.c.b(obj);
            W2 w10 = (W2) C3271w3.f25611b.getValue();
            this.f24333a = 1;
            obj = w10.a(this);
            if (obj == objF) {
                return objF;
            }
        }
        if (((Boolean) obj).booleanValue()) {
            Message messageObtain = Message.obtain();
            messageObtain.what = 1;
            return tj.a.a(this.f24334b.sendMessage(messageObtain));
        }
        C3271w3 c3271w3 = C3271w3.f25610a;
        ck.p.i("w3", "access$getTAG$p(...)");
        C3271w3.f25616g.set(false);
        return mj.r.f64562a;
    }
}
