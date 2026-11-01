package com.inmobi.media;

import android.graphics.Bitmap;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: renamed from: com.inmobi.media.mj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C3038mj extends SuspendLambda implements bk.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C3063nj f24843a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3038mj(C3063nj c3063nj, rj.c cVar) {
        super(2, cVar);
        this.f24843a = c3063nj;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final rj.c create(Object obj, rj.c cVar) {
        return new C3038mj(this.f24843a, cVar);
    }

    @Override // bk.p
    /* JADX INFO: renamed from: invoke */
    public final Object mo1invoke(Object obj, Object obj2) {
        return new C3038mj(this.f24843a, (rj.c) obj2).invokeSuspend(mj.r.f64562a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        sj.a.f();
        kotlin.c.b(obj);
        if (AbstractC3323y5.a(this.f24843a.f24906a)) {
            return Bitmap.Config.RGB_565;
        }
        return Bitmap.Config.ARGB_8888;
    }
}
