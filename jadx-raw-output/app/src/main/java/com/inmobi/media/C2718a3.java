package com.inmobi.media;

import android.os.Message;
import com.inmobi.media.core.config.models.AdConfig;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: renamed from: com.inmobi.media.a3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C2718a3 extends SuspendLambda implements bk.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f23936a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ W2 f23937b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ HandlerC2873g3 f23938c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ AdConfig.ImaiConfig f23939d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2718a3(W2 w10, HandlerC2873g3 handlerC2873g3, AdConfig.ImaiConfig imaiConfig, rj.c cVar) {
        super(2, cVar);
        this.f23937b = w10;
        this.f23938c = handlerC2873g3;
        this.f23939d = imaiConfig;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final rj.c create(Object obj, rj.c cVar) {
        return new C2718a3(this.f23937b, this.f23938c, this.f23939d, cVar);
    }

    @Override // bk.p
    /* JADX INFO: renamed from: invoke */
    public final Object mo1invoke(Object obj, Object obj2) {
        return ((C2718a3) create((nk.l0) obj, (rj.c) obj2)).invokeSuspend(mj.r.f64562a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objF = sj.a.f();
        int i10 = this.f23936a;
        if (i10 != 0) {
            if (i10 == 1) {
                kotlin.c.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            kotlin.c.b(obj);
            W2 w10 = this.f23937b;
            this.f23936a = 1;
            obj = w10.a(this);
            if (obj == objF) {
                return objF;
            }
        }
        if (((Boolean) obj).booleanValue()) {
            Message messageObtain = Message.obtain();
            messageObtain.what = 1;
            return tj.a.a(this.f23938c.sendMessageDelayed(messageObtain, this.f23939d.getPingInterval() * 1000));
        }
        C3271w3.f25616g.set(false);
        return mj.r.f64562a;
    }
}
