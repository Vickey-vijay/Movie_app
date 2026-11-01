package com.inmobi.media;

import android.graphics.Bitmap;
import com.inmobi.media.C3013lj;
import com.squareup.picasso.Picasso;
import kotlin.Result;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: renamed from: com.inmobi.media.lj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C3013lj extends SuspendLambda implements bk.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f24780a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Cj f24781b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C3063nj f24782c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f24783d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Bitmap.Config f24784e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3013lj(Cj cj2, C3063nj c3063nj, String str, Bitmap.Config config, rj.c cVar) {
        super(2, cVar);
        this.f24781b = cj2;
        this.f24782c = c3063nj;
        this.f24783d = str;
        this.f24784e = config;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final rj.c create(Object obj, rj.c cVar) {
        C3013lj c3013lj = new C3013lj(this.f24781b, this.f24782c, this.f24783d, this.f24784e, cVar);
        c3013lj.f24780a = obj;
        return c3013lj;
    }

    @Override // bk.p
    /* JADX INFO: renamed from: invoke */
    public final Object mo1invoke(Object obj, Object obj2) {
        return ((C3013lj) create((nk.l0) obj, (rj.c) obj2)).invokeSuspend(mj.r.f64562a);
    }

    public static final void a(Cj cj2, Bitmap bitmap) {
        cj2.setImageBitmap(bitmap);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM3458constructorimpl;
        C3053n9 c3053n9;
        sj.a.f();
        kotlin.c.b(obj);
        C3063nj c3063nj = this.f24782c;
        String str = this.f24783d;
        Bitmap.Config config = this.f24784e;
        try {
            Result.a aVar = Result.Companion;
            Picasso picasso = Qf.f23387a;
            objM3458constructorimpl = Result.m3458constructorimpl(Qf.b(c3063nj.f24906a).load(str).tag(c3063nj.f24908c).transform(new Lf(config)).get());
        } catch (Throwable th2) {
            Result.a aVar2 = Result.Companion;
            objM3458constructorimpl = Result.m3458constructorimpl(kotlin.c.a(th2));
        }
        C3063nj c3063nj2 = this.f24782c;
        Throwable thM3461exceptionOrNullimpl = Result.m3461exceptionOrNullimpl(objM3458constructorimpl);
        if (thM3461exceptionOrNullimpl != null && (c3053n9 = c3063nj2.f24907b) != null) {
            c3053n9.b("StaticCompanionLoader", "Companion Load Exception: " + thM3461exceptionOrNullimpl.getMessage());
        }
        if (Result.m3463isFailureimpl(objM3458constructorimpl)) {
            objM3458constructorimpl = null;
        }
        final Bitmap bitmap = (Bitmap) objM3458constructorimpl;
        if (bitmap != null) {
            final Cj cj2 = this.f24781b;
            return tj.a.a(cj2.post(new Runnable() { // from class: b7.m9
                @Override // java.lang.Runnable
                public final void run() {
                    C3013lj.a(cj2, bitmap);
                }
            }));
        }
        throw new C2779cc("Companion Load Error");
    }
}
