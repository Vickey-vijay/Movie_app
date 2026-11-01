package com.inmobi.media;

import android.graphics.drawable.Drawable;
import androidx.core.content.ContextCompat;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: renamed from: com.inmobi.media.i5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C2925i5 extends SuspendLambda implements bk.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f24535a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C2949j5 f24536b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f24537c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f24538d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f24539e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f24540f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f24541g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2925i5(C2949j5 c2949j5, int i10, int i11, int i12, int i13, int i14, rj.c cVar) {
        super(2, cVar);
        this.f24536b = c2949j5;
        this.f24537c = i10;
        this.f24538d = i11;
        this.f24539e = i12;
        this.f24540f = i13;
        this.f24541g = i14;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final rj.c create(Object obj, rj.c cVar) {
        C2925i5 c2925i5 = new C2925i5(this.f24536b, this.f24537c, this.f24538d, this.f24539e, this.f24540f, this.f24541g, cVar);
        c2925i5.f24535a = obj;
        return c2925i5;
    }

    @Override // bk.p
    /* JADX INFO: renamed from: invoke */
    public final Object mo1invoke(Object obj, Object obj2) {
        return ((C2925i5) create((nk.l0) obj, (rj.c) obj2)).invokeSuspend(mj.r.f64562a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        sj.a.f();
        kotlin.c.b(obj);
        Drawable drawable = ContextCompat.getDrawable(this.f24536b.getContext(), this.f24537c);
        if (drawable == null) {
            C2949j5 c2949j5 = this.f24536b;
            InterfaceC3028m9 interfaceC3028m9 = c2949j5.f24587b;
            if (interfaceC3028m9 != null) {
                ((C3053n9) interfaceC3028m9).b("CustomView", "CustomView drawable for " + ((int) c2949j5.f24586a) + " cannot be created");
            }
            return mj.r.f64562a;
        }
        this.f24536b.a(drawable, this.f24538d, this.f24539e, this.f24540f, this.f24541g);
        return mj.r.f64562a;
    }
}
