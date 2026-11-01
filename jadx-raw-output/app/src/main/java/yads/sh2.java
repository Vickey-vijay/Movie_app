package yads;

import android.content.Context;
import com.monetization.ads.mediation.base.prefetch.MediatedAdapterPrefetcher;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.TimeoutKt;

/* JADX INFO: loaded from: classes9.dex */
public final class sh2 extends SuspendLambda implements bk.p {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public qq1 f82643b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public MediatedAdapterPrefetcher f82644c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f82645d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ xh2 f82646e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ cs1 f82647f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Context f82648g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ e00 f82649h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ long f82650i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ a03 f82651j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sh2(xh2 xh2Var, cs1 cs1Var, Context context, e00 e00Var, long j10, a03 a03Var, rj.c cVar) {
        super(2, cVar);
        this.f82646e = xh2Var;
        this.f82647f = cs1Var;
        this.f82648g = context;
        this.f82649h = e00Var;
        this.f82650i = j10;
        this.f82651j = a03Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final rj.c create(Object obj, rj.c cVar) {
        return new sh2(this.f82646e, this.f82647f, this.f82648g, this.f82649h, this.f82650i, this.f82651j, cVar);
    }

    @Override // bk.p
    /* JADX INFO: renamed from: invoke */
    public final Object mo1invoke(Object obj, Object obj2) {
        return ((sh2) create((nk.l0) obj, (rj.c) obj2)).invokeSuspend(mj.r.f64562a);
    }

    /* JADX WARN: Code duplicated, block: B:30:0x00c2 A[Catch: all -> 0x001a, Exception -> 0x00d1, TRY_LEAVE, TryCatch #3 {all -> 0x001a, blocks: (B:6:0x0012, B:28:0x00a9, B:30:0x00c2, B:38:0x00d9), top: B:47:0x0012 }] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        MediatedAdapterPrefetcher mediatedAdapterPrefetcher;
        qq1 qq1Var;
        MediatedAdapterPrefetcher mediatedAdapterPrefetcher2;
        Object objC;
        qq1 qq1Var2;
        ih2 ih2VarA;
        Long lA;
        Object objF = sj.a.f();
        int i10 = this.f82645d;
        if (i10 == 0) {
            kotlin.c.b(obj);
            nh2 nh2Var = this.f82646e.f84601e;
            cs1 cs1Var = this.f82647f;
            nh2Var.getClass();
            String str = cs1Var.f76414b;
            qq1 qq1Var3 = new qq1(str, cs1Var.f76415c, null, null, null, null, null);
            try {
                xh2.a(this.f82646e, qq1Var3);
                Object objA = this.f82646e.f84599c.a(this.f82648g, qq1Var3, com.monetization.ads.mediation.base.a.class);
                mediatedAdapterPrefetcher = objA instanceof MediatedAdapterPrefetcher ? (MediatedAdapterPrefetcher) objA : null;
                if (mediatedAdapterPrefetcher == null) {
                    ih2 ih2VarA2 = jq1.a(str);
                    this.f82646e.f84597a.a(this.f82648g, this.f82649h, ih2VarA2, null);
                    return ih2VarA2;
                }
                mv mvVar = this.f82646e.f84598b;
                mvVar.f80398a.a();
                mvVar.f80398a.a(mvVar.f80400c, null);
                try {
                    long j10 = this.f82650i;
                    rh2 rh2Var = new rh2(this.f82646e, this.f82648g, this.f82651j, qq1Var3, mediatedAdapterPrefetcher, null);
                    this.f82643b = qq1Var3;
                    this.f82644c = mediatedAdapterPrefetcher;
                    this.f82645d = 1;
                    objC = TimeoutKt.c(j10, rh2Var, this);
                    if (objC == objF) {
                        return objF;
                    }
                    MediatedAdapterPrefetcher mediatedAdapterPrefetcher3 = mediatedAdapterPrefetcher;
                    qq1Var2 = qq1Var3;
                    mediatedAdapterPrefetcher2 = mediatedAdapterPrefetcher3;
                    ih2VarA = (ih2) objC;
                    mv mvVar2 = this.f82646e.f84598b;
                    mvVar2.f80398a.a(mvVar2.f80400c, mvVar2.f80399b, null);
                    lA = this.f82646e.f84598b.a();
                    if (ih2VarA != null) {
                        this.f82646e.f84597a.a(this.f82648g, this.f82649h, ih2VarA, lA);
                    }
                    mediatedAdapterPrefetcher2.onInvalidate();
                } catch (Exception e10) {
                    e = e10;
                    qq1Var = qq1Var3;
                    mediatedAdapterPrefetcher2 = mediatedAdapterPrefetcher;
                    mv mvVar3 = this.f82646e.f84598b;
                    mvVar3.f80398a.a(mvVar3.f80400c, mvVar3.f80399b, null);
                    Long lA2 = this.f82646e.f84598b.a();
                    ih2VarA = jq1.a(qq1Var.f81930b, e);
                    this.f82646e.f84597a.a(this.f82648g, this.f82649h, ih2VarA, lA2);
                    mediatedAdapterPrefetcher2.onInvalidate();
                    return ih2VarA;
                } catch (Throwable th2) {
                    th = th2;
                    mediatedAdapterPrefetcher.onInvalidate();
                    throw th;
                }
            } catch (IllegalArgumentException e11) {
                return jq1.a(qq1Var3.f81930b, e11);
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            mediatedAdapterPrefetcher2 = this.f82644c;
            qq1Var = this.f82643b;
            try {
                try {
                    kotlin.c.b(obj);
                    qq1Var2 = qq1Var;
                    objC = obj;
                    try {
                        ih2VarA = (ih2) objC;
                        mv mvVar4 = this.f82646e.f84598b;
                        mvVar4.f80398a.a(mvVar4.f80400c, mvVar4.f80399b, null);
                        lA = this.f82646e.f84598b.a();
                        if (ih2VarA != null) {
                            this.f82646e.f84597a.a(this.f82648g, this.f82649h, ih2VarA, lA);
                        }
                        mediatedAdapterPrefetcher2.onInvalidate();
                    } catch (Exception e12) {
                        e = e12;
                        qq1Var = qq1Var2;
                        mv mvVar5 = this.f82646e.f84598b;
                        mvVar5.f80398a.a(mvVar5.f80400c, mvVar5.f80399b, null);
                        Long lA3 = this.f82646e.f84598b.a();
                        ih2VarA = jq1.a(qq1Var.f81930b, e);
                        this.f82646e.f84597a.a(this.f82648g, this.f82649h, ih2VarA, lA3);
                        mediatedAdapterPrefetcher2.onInvalidate();
                    }
                } catch (Exception e13) {
                    e = e13;
                    mv mvVar6 = this.f82646e.f84598b;
                    mvVar6.f80398a.a(mvVar6.f80400c, mvVar6.f80399b, null);
                    Long lA4 = this.f82646e.f84598b.a();
                    ih2VarA = jq1.a(qq1Var.f81930b, e);
                    this.f82646e.f84597a.a(this.f82648g, this.f82649h, ih2VarA, lA4);
                    mediatedAdapterPrefetcher2.onInvalidate();
                    return ih2VarA;
                }
            } catch (Throwable th3) {
                th = th3;
                mediatedAdapterPrefetcher = mediatedAdapterPrefetcher2;
                mediatedAdapterPrefetcher.onInvalidate();
                throw th;
            }
        }
        return ih2VarA;
    }
}
