package com.inmobi.media;

import com.inmobi.media.core.config.models.RootConfig;
import java.util.List;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: renamed from: com.inmobi.media.wh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C3285wh extends SuspendLambda implements bk.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f25652a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Bh f25653b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f25654c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f25655d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ RootConfig f25656e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ List f25657f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ pk.n f25658g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3285wh(Bh bh2, String str, String str2, RootConfig rootConfig, List list, pk.n nVar, rj.c cVar) {
        super(2, cVar);
        this.f25653b = bh2;
        this.f25654c = str;
        this.f25655d = str2;
        this.f25656e = rootConfig;
        this.f25657f = list;
        this.f25658g = nVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final rj.c create(Object obj, rj.c cVar) {
        return new C3285wh(this.f25653b, this.f25654c, this.f25655d, this.f25656e, this.f25657f, this.f25658g, cVar);
    }

    @Override // bk.p
    /* JADX INFO: renamed from: invoke */
    public final Object mo1invoke(Object obj, Object obj2) {
        return ((C3285wh) create((nk.l0) obj, (rj.c) obj2)).invokeSuspend(mj.r.f64562a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objF = sj.a.f();
        int i10 = this.f25652a;
        try {
            if (i10 != 0) {
                if (i10 == 1) {
                    kotlin.c.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                kotlin.c.b(obj);
                Bh bh2 = this.f25653b;
                String str = this.f25654c;
                String str2 = this.f25655d;
                RootConfig rootConfig = this.f25656e;
                List list = this.f25657f;
                pk.n nVar = this.f25658g;
                this.f25652a = 1;
                if (bh2.a(str, str2, rootConfig, list, nVar, this) == objF) {
                    return objF;
                }
            }
        } catch (Exception e10) {
            mj.g gVar = P9.f23321a;
            AbstractC2929i9.a(e10);
        }
        return mj.r.f64562a;
    }
}
