package com.unity3d.ads.core.domain;

import ck.p;
import com.unity3d.ads.core.data.repository.CacheRepository;
import com.unity3d.ads.core.extensions.TimeExtensionsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import mj.h;
import mj.r;
import mk.j;
import nj.l0;
import rj.c;
import tj.d;

/* JADX INFO: compiled from: CommonCleanAssets.kt */
/* JADX INFO: loaded from: classes7.dex */
public final class CommonCleanAssets implements CleanAssets {
    private final CacheRepository cacheRepository;
    private final SendDiagnosticEvent sendDiagnosticEvent;

    /* JADX INFO: renamed from: com.unity3d.ads.core.domain.CommonCleanAssets$invoke$1, reason: invalid class name */
    /* JADX INFO: compiled from: CommonCleanAssets.kt */
    @d(c = "com.unity3d.ads.core.domain.CommonCleanAssets", f = "CommonCleanAssets.kt", l = {18, 19}, m = "invoke")
    public static final class AnonymousClass1 extends ContinuationImpl {
        public long J$0;
        public long J$1;
        public Object L$0;
        public int label;
        public /* synthetic */ Object result;

        public AnonymousClass1(c<? super AnonymousClass1> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return CommonCleanAssets.this.invoke(this);
        }
    }

    public CommonCleanAssets(CacheRepository cacheRepository, SendDiagnosticEvent sendDiagnosticEvent) {
        p.j(cacheRepository, "cacheRepository");
        p.j(sendDiagnosticEvent, "sendDiagnosticEvent");
        this.cacheRepository = cacheRepository;
        this.sendDiagnosticEvent = sendDiagnosticEvent;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.unity3d.ads.core.domain.CleanAssets
    public Object invoke(c<? super r> cVar) throws Throwable {
        AnonymousClass1 anonymousClass1;
        CommonCleanAssets commonCleanAssets;
        long j10;
        CommonCleanAssets commonCleanAssets2;
        long j11;
        long j12;
        if (cVar instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) cVar;
            int i10 = anonymousClass1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label = i10 - Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(cVar);
            }
        } else {
            anonymousClass1 = new AnonymousClass1(cVar);
        }
        Object cacheSize = anonymousClass1.result;
        Object objF = sj.a.f();
        int i11 = anonymousClass1.label;
        if (i11 != 0) {
            if (i11 == 1) {
                j10 = anonymousClass1.J$0;
                commonCleanAssets = (CommonCleanAssets) anonymousClass1.L$0;
                kotlin.c.b(cacheSize);
            } else {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                j12 = anonymousClass1.J$1;
                j11 = anonymousClass1.J$0;
                commonCleanAssets2 = (CommonCleanAssets) anonymousClass1.L$0;
                kotlin.c.b(cacheSize);
            }
            SendDiagnosticEvent.DefaultImpls.invoke$default(commonCleanAssets2.sendDiagnosticEvent, "native_clean_assets_task_success_time", tj.a.b(TimeExtensionsKt.elapsedMillis(j.a.b(j11))), null, l0.g(h.a("size_kb", tj.a.d((int) (j12 / ((long) 1024))))), null, null, 52, null);
            return r.f64562a;
        }
        kotlin.c.b(cacheSize);
        long jB = j.f64572a.b();
        CacheRepository cacheRepository = this.cacheRepository;
        anonymousClass1.L$0 = this;
        anonymousClass1.J$0 = jB;
        anonymousClass1.label = 1;
        cacheSize = cacheRepository.getCacheSize(anonymousClass1);
        if (cacheSize == objF) {
            return objF;
        }
        commonCleanAssets = this;
        j10 = jB;
        long jLongValue = ((Number) cacheSize).longValue();
        CacheRepository cacheRepository2 = commonCleanAssets.cacheRepository;
        anonymousClass1.L$0 = commonCleanAssets;
        anonymousClass1.J$0 = j10;
        anonymousClass1.J$1 = jLongValue;
        anonymousClass1.label = 2;
        if (cacheRepository2.clearCache(anonymousClass1) == objF) {
            return objF;
        }
        commonCleanAssets2 = commonCleanAssets;
        j11 = j10;
        j12 = jLongValue;
        SendDiagnosticEvent.DefaultImpls.invoke$default(commonCleanAssets2.sendDiagnosticEvent, "native_clean_assets_task_success_time", tj.a.b(TimeExtensionsKt.elapsedMillis(j.a.b(j11))), null, l0.g(h.a("size_kb", tj.a.d((int) (j12 / ((long) 1024))))), null, null, 52, null);
        return r.f64562a;
    }
}
