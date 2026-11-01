package com.inmobi.media;

import android.os.Looper;
import androidx.media3.exoplayer.ExoPlayer;
import java.util.ArrayList;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes6.dex */
public final class C7 extends SuspendLambda implements bk.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f22451a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ N7 f22452b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ArrayList f22453c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7(N7 n10, ArrayList arrayList, rj.c cVar) {
        super(2, cVar);
        this.f22452b = n10;
        this.f22453c = arrayList;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final rj.c create(Object obj, rj.c cVar) {
        return new C7(this.f22452b, this.f22453c, cVar);
    }

    @Override // bk.p
    /* JADX INFO: renamed from: invoke */
    public final Object mo1invoke(Object obj, Object obj2) {
        return new C7(this.f22452b, this.f22453c, (rj.c) obj2).invokeSuspend(mj.r.f64562a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objF = sj.a.f();
        int i10 = this.f22451a;
        if (i10 != 0) {
            if (i10 == 1) {
                kotlin.c.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            kotlin.c.b(obj);
            N7 n10 = this.f22452b;
            if (!n10.f23201f.get()) {
                n10.f23201f.set(true);
                if (!ck.p.e(Looper.myLooper(), Looper.getMainLooper())) {
                    nk.j.d(n10.f23198c, null, null, new C3175s7(null, n10), 3, null);
                } else {
                    n10.f23211p.addListener(n10.B);
                }
            }
            this.f22452b.f23216u = System.currentTimeMillis();
            N7 n11 = this.f22452b;
            ExoPlayer exoPlayer = n11.f23211p;
            ArrayList arrayList = this.f22453c;
            InterfaceC3028m9 interfaceC3028m9 = n11.f23197b;
            K2 k10 = n11.f23218w;
            boolean zIsCache = n11.f23196a.isCache();
            this.f22451a = 1;
            obj = Mm.a(exoPlayer, arrayList, interfaceC3028m9, k10, zIsCache, this);
            if (obj == objF) {
                return objF;
            }
        }
        this.f22452b.a((AbstractC2826e8) obj);
        return mj.r.f64562a;
    }
}
