package yads;

import android.app.Activity;
import android.content.Context;
import com.monetization.ads.mediation.base.prefetch.MediatedAdapterPrefetcher;
import java.util.HashMap;
import kotlin.Result;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes7.dex */
public final class rh2 extends SuspendLambda implements bk.p {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f82274b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ xh2 f82275c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Context f82276d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ a03 f82277e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ qq1 f82278f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ MediatedAdapterPrefetcher f82279g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rh2(xh2 xh2Var, Context context, a03 a03Var, qq1 qq1Var, MediatedAdapterPrefetcher mediatedAdapterPrefetcher, rj.c cVar) {
        super(2, cVar);
        this.f82275c = xh2Var;
        this.f82276d = context;
        this.f82277e = a03Var;
        this.f82278f = qq1Var;
        this.f82279g = mediatedAdapterPrefetcher;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final rj.c create(Object obj, rj.c cVar) {
        return new rh2(this.f82275c, this.f82276d, this.f82277e, this.f82278f, this.f82279g, cVar);
    }

    @Override // bk.p
    /* JADX INFO: renamed from: invoke */
    public final Object mo1invoke(Object obj, Object obj2) {
        return ((rh2) create((nk.l0) obj, (rj.c) obj2)).invokeSuspend(mj.r.f64562a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objF = sj.a.f();
        int i10 = this.f82274b;
        if (i10 != 0) {
            if (i10 == 1) {
                kotlin.c.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            kotlin.c.b(obj);
            mh2 mh2Var = this.f82275c.f84600d;
            Context context = this.f82276d;
            a03 a03Var = this.f82277e;
            qq1 qq1Var = this.f82278f;
            MediatedAdapterPrefetcher mediatedAdapterPrefetcher = this.f82279g;
            this.f82274b = 1;
            mh2Var.getClass();
            kotlinx.coroutines.c cVar = new kotlinx.coroutines.c(IntrinsicsKt__IntrinsicsJvmKt.c(this), 1);
            cVar.J();
            try {
                Activity activityA = j1.a();
                if (activityA != null) {
                    context = activityA;
                }
                HashMap map = new HashMap(qq1Var.f81931c);
                if (a03Var != null) {
                    map.put("width", String.valueOf(a03Var.getWidth()));
                    map.put("height", String.valueOf(a03Var.getHeight()));
                }
                mediatedAdapterPrefetcher.prefetchAd(context, map, new lh2(mh2Var, qq1Var, cVar));
            } catch (Exception unused) {
                if (cVar.isActive()) {
                    mediatedAdapterPrefetcher.onInvalidate();
                    Result.a aVar = Result.Companion;
                    jh2 jh2Var = mh2Var.f80177a;
                    String str = qq1Var.f81930b;
                    jh2Var.getClass();
                    cVar.resumeWith(Result.m3458constructorimpl(jh2.a(str, null, null)));
                }
            }
            obj = cVar.B();
            if (obj == sj.a.f()) {
                tj.f.c(this);
            }
            if (obj == objF) {
                return objF;
            }
        }
        return obj;
    }
}
