package com.inmobi.media;

import android.graphics.Bitmap;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: renamed from: com.inmobi.media.uj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C3237uj extends SuspendLambda implements bk.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C3287wj f25487a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3237uj(C3287wj c3287wj, rj.c cVar) {
        super(2, cVar);
        this.f25487a = c3287wj;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final rj.c create(Object obj, rj.c cVar) {
        return new C3237uj(this.f25487a, cVar);
    }

    @Override // bk.p
    /* JADX INFO: renamed from: invoke */
    public final Object mo1invoke(Object obj, Object obj2) {
        return new C3237uj(this.f25487a, (rj.c) obj2).invokeSuspend(mj.r.f64562a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        sj.a.f();
        kotlin.c.b(obj);
        if (AbstractC3323y5.a(this.f25487a.f24579a)) {
            return Bitmap.Config.RGB_565;
        }
        return Bitmap.Config.ARGB_8888;
    }
}
