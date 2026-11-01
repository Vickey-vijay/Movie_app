package com.inmobi.media;

import com.inmobi.media.core.config.models.AdConfig;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: renamed from: com.inmobi.media.tm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C3215tm extends SuspendLambda implements bk.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public C3115pl f25405a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f25406b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C3115pl f25407c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ double f25408d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Pe f25409e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f25410f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ AdConfig.VastVideoConfig f25411g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3215tm(C3115pl c3115pl, double d10, Pe pe2, int i10, AdConfig.VastVideoConfig vastVideoConfig, rj.c cVar) {
        super(2, cVar);
        this.f25407c = c3115pl;
        this.f25408d = d10;
        this.f25409e = pe2;
        this.f25410f = i10;
        this.f25411g = vastVideoConfig;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final rj.c create(Object obj, rj.c cVar) {
        return new C3215tm(this.f25407c, this.f25408d, this.f25409e, this.f25410f, this.f25411g, cVar);
    }

    @Override // bk.p
    /* JADX INFO: renamed from: invoke */
    public final Object mo1invoke(Object obj, Object obj2) {
        return ((C3215tm) create((nk.l0) obj, (rj.c) obj2)).invokeSuspend(mj.r.f64562a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C3115pl c3115pl;
        Object objF = sj.a.f();
        int i10 = this.f25406b;
        if (i10 != 0) {
            if (i10 == 1) {
                c3115pl = this.f25405a;
                kotlin.c.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            kotlin.c.b(obj);
            C3115pl c3115pl2 = this.f25407c;
            double d10 = this.f25408d;
            Pe pe2 = this.f25409e;
            int i11 = this.f25410f;
            AdConfig.VastVideoConfig vastVideoConfig = this.f25411g;
            this.f25405a = c3115pl2;
            this.f25406b = 1;
            Object objA = AbstractC3290wm.a(c3115pl2, d10, pe2, i11, vastVideoConfig, this);
            if (objA == objF) {
                return objF;
            }
            c3115pl = c3115pl2;
            obj = objA;
        }
        return mj.h.a(c3115pl, obj);
    }
}
