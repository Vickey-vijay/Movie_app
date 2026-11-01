package com.inmobi.media;

import android.os.Message;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: renamed from: com.inmobi.media.u3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C3221u3 extends SuspendLambda implements bk.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f25427a;

    public C3221u3(rj.c cVar) {
        super(2, cVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final rj.c create(Object obj, rj.c cVar) {
        return new C3221u3(cVar);
    }

    @Override // bk.p
    /* JADX INFO: renamed from: invoke */
    public final Object mo1invoke(Object obj, Object obj2) {
        return new C3221u3((rj.c) obj2).invokeSuspend(mj.r.f64562a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objF = sj.a.f();
        int i10 = this.f25427a;
        if (i10 != 0) {
            if (i10 == 1) {
                kotlin.c.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            kotlin.c.b(obj);
            W2 w10 = (W2) C3271w3.f25611b.getValue();
            this.f25427a = 1;
            obj = w10.a(this);
            if (obj == objF) {
                return objF;
            }
        }
        if (((Boolean) obj).booleanValue()) {
            Message messageObtain = Message.obtain();
            messageObtain.what = 1;
            HandlerC2873g3 handlerC2873g3 = C3271w3.f25613d;
            if (handlerC2873g3 != null) {
                return tj.a.a(handlerC2873g3.sendMessage(messageObtain));
            }
            return null;
        }
        C3271w3 c3271w3 = C3271w3.f25610a;
        ck.p.i("w3", "access$getTAG$p(...)");
        C3271w3.f25616g.set(false);
        C3271w3.g();
        return mj.r.f64562a;
    }
}
