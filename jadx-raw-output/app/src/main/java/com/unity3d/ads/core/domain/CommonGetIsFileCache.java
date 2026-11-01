package com.unity3d.ads.core.domain;

import ck.p;
import com.unity3d.ads.core.data.repository.CacheRepository;
import com.unity3d.ads.core.extensions.TimeExtensionsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import lk.a0;
import mk.j;
import rj.c;
import tj.d;

/* JADX INFO: compiled from: CommonGetIsFileCache.kt */
/* JADX INFO: loaded from: classes9.dex */
public final class CommonGetIsFileCache implements GetIsFileCache {
    private final CacheRepository cacheRepository;
    private final SendDiagnosticEvent sendDiagnosticEvent;

    /* JADX INFO: renamed from: com.unity3d.ads.core.domain.CommonGetIsFileCache$invoke$1, reason: invalid class name */
    /* JADX INFO: compiled from: CommonGetIsFileCache.kt */
    @d(c = "com.unity3d.ads.core.domain.CommonGetIsFileCache", f = "CommonGetIsFileCache.kt", l = {18}, m = "invoke")
    public static final class AnonymousClass1 extends ContinuationImpl {
        public long J$0;
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
            return CommonGetIsFileCache.this.invoke(null, this);
        }
    }

    public CommonGetIsFileCache(CacheRepository cacheRepository, SendDiagnosticEvent sendDiagnosticEvent) {
        p.j(cacheRepository, "cacheRepository");
        p.j(sendDiagnosticEvent, "sendDiagnosticEvent");
        this.cacheRepository = cacheRepository;
        this.sendDiagnosticEvent = sendDiagnosticEvent;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.unity3d.ads.core.domain.GetIsFileCache
    public Object invoke(String str, c<? super Boolean> cVar) throws Throwable {
        AnonymousClass1 anonymousClass1;
        CommonGetIsFileCache commonGetIsFileCache;
        long j10;
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
        Object objDoesFileExist = anonymousClass1.result;
        Object objF = sj.a.f();
        int i11 = anonymousClass1.label;
        if (i11 == 0) {
            kotlin.c.b(objDoesFileExist);
            long jB = j.f64572a.b();
            String strA1 = a0.a1(str, "/", null, 2, null);
            CacheRepository cacheRepository = this.cacheRepository;
            anonymousClass1.L$0 = this;
            anonymousClass1.J$0 = jB;
            anonymousClass1.label = 1;
            objDoesFileExist = cacheRepository.doesFileExist(strA1, anonymousClass1);
            if (objDoesFileExist == objF) {
                return objF;
            }
            commonGetIsFileCache = this;
            j10 = jB;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j10 = anonymousClass1.J$0;
            commonGetIsFileCache = (CommonGetIsFileCache) anonymousClass1.L$0;
            kotlin.c.b(objDoesFileExist);
        }
        boolean zBooleanValue = ((Boolean) objDoesFileExist).booleanValue();
        SendDiagnosticEvent.DefaultImpls.invoke$default(commonGetIsFileCache.sendDiagnosticEvent, zBooleanValue ? "native_show_is_file_cached_success_time" : "native_show_is_file_cached_failure_time", tj.a.b(TimeExtensionsKt.elapsedMillis(j.a.b(j10))), null, null, null, null, 60, null);
        return tj.a.a(zBooleanValue);
    }
}
