package com.inmobi.media;

import android.os.Message;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: renamed from: com.inmobi.media.b3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C2744b3 extends SuspendLambda implements bk.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f24032a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f24033b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ S2 f24034c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ HandlerC2873g3 f24035d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2744b3(S2 s10, HandlerC2873g3 handlerC2873g3, rj.c cVar) {
        super(2, cVar);
        this.f24034c = s10;
        this.f24035d = handlerC2873g3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final rj.c create(Object obj, rj.c cVar) {
        C2744b3 c2744b3 = new C2744b3(this.f24034c, this.f24035d, cVar);
        c2744b3.f24033b = obj;
        return c2744b3;
    }

    @Override // bk.p
    /* JADX INFO: renamed from: invoke */
    public final Object mo1invoke(Object obj, Object obj2) {
        return ((C2744b3) create((nk.l0) obj, (rj.c) obj2)).invokeSuspend(mj.r.f64562a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objF = sj.a.f();
        int i10 = this.f24032a;
        if (i10 != 0) {
            if (i10 == 1) {
                kotlin.c.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            kotlin.c.b(obj);
            nk.l0 l0Var = (nk.l0) this.f24033b;
            C2972k3 c2972k3 = new C2972k3();
            S2 s10 = this.f24034c;
            this.f24033b = l0Var;
            this.f24032a = 1;
            obj = c2972k3.a(s10, this);
            if (obj == objF) {
                return objF;
            }
        }
        if (((EnumC2721a6) obj) != null) {
            HandlerC2873g3 handlerC2873g3 = this.f24035d;
            S2 s11 = this.f24034c;
            int i11 = HandlerC2873g3.f24402a;
            Message messageObtain = Message.obtain();
            messageObtain.what = 4;
            messageObtain.obj = s11;
            handlerC2873g3.sendMessage(messageObtain);
        } else {
            S2 s12 = this.f24034c;
            HandlerC2873g3 handlerC2873g4 = this.f24035d;
            C3271w3 c3271w3 = C3271w3.f25610a;
            ck.p.i("w3", "access$getTAG$p(...)");
            String str = s12.f23479b;
            C3271w3.b(s12);
            int i12 = HandlerC2873g3.f24402a;
            handlerC2873g4.b(s12);
        }
        return mj.r.f64562a;
    }
}
