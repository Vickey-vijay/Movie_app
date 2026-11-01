package com.inmobi.media;

import com.inmobi.media.core.config.models.RootConfig;
import java.util.List;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: renamed from: com.inmobi.media.yh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C3335yh extends SuspendLambda implements bk.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f25799a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f25800b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ List f25801c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Bh f25802d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f25803e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ RootConfig f25804f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3335yh(List list, Bh bh2, String str, RootConfig rootConfig, rj.c cVar) {
        super(2, cVar);
        this.f25801c = list;
        this.f25802d = bh2;
        this.f25803e = str;
        this.f25804f = rootConfig;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final rj.c create(Object obj, rj.c cVar) {
        C3335yh c3335yh = new C3335yh(this.f25801c, this.f25802d, this.f25803e, this.f25804f, cVar);
        c3335yh.f25800b = obj;
        return c3335yh;
    }

    @Override // bk.p
    /* JADX INFO: renamed from: invoke */
    public final Object mo1invoke(Object obj, Object obj2) {
        return ((C3335yh) create((pk.n) obj, (rj.c) obj2)).invokeSuspend(mj.r.f64562a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objF = sj.a.f();
        int i10 = this.f25799a;
        if (i10 != 0) {
            if (i10 == 1) {
                kotlin.c.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            kotlin.c.b(obj);
            C3310xh c3310xh = new C3310xh(this.f25801c, this.f25802d, this.f25803e, this.f25804f, (pk.n) this.f25800b, null);
            this.f25799a = 1;
            if (nk.j2.c(c3310xh, this) == objF) {
                return objF;
            }
        }
        return mj.r.f64562a;
    }
}
