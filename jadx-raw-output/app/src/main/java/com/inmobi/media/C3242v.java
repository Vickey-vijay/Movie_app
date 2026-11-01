package com.inmobi.media;

import android.graphics.Bitmap;
import com.squareup.picasso.Picasso;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: renamed from: com.inmobi.media.v, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C3242v extends SuspendLambda implements bk.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f25501a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C3267w f25502b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f25503c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Cj f25504d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3242v(C3267w c3267w, String str, Cj cj2, rj.c cVar) {
        super(2, cVar);
        this.f25502b = c3267w;
        this.f25503c = str;
        this.f25504d = cj2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final rj.c create(Object obj, rj.c cVar) {
        return new C3242v(this.f25502b, this.f25503c, this.f25504d, cVar);
    }

    @Override // bk.p
    /* JADX INFO: renamed from: invoke */
    public final Object mo1invoke(Object obj, Object obj2) {
        return ((C3242v) create((nk.l0) obj, (rj.c) obj2)).invokeSuspend(mj.r.f64562a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objF = sj.a.f();
        int i10 = this.f25501a;
        if (i10 != 0) {
            if (i10 == 1) {
                kotlin.c.b(obj);
                return obj;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.c.b(obj);
        C3267w c3267w = this.f25502b;
        String str = this.f25503c;
        Cj cj2 = this.f25504d;
        this.f25501a = 1;
        kotlinx.coroutines.c cVar = new kotlinx.coroutines.c(IntrinsicsKt__IntrinsicsJvmKt.c(this), 1);
        cVar.J();
        cVar.p(new C3192t(c3267w));
        Picasso picasso = Qf.f23387a;
        Qf.b(c3267w.f25601a).load(str).tag(c3267w.f25605e).transform(new Lf(Bitmap.Config.RGB_565)).into(cj2, new C3217u(c3267w, cVar));
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
