package com.unity3d.ads.core.domain;

import ck.p;
import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.data.model.CacheResult;
import com.unity3d.ads.core.data.repository.CacheRepository;
import com.unity3d.ads.core.extensions.TimeExtensionsKt;
import kotlin.Pair;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import mj.h;
import mk.j;
import nj.l0;
import org.json.JSONArray;
import rj.c;
import tj.d;

/* JADX INFO: compiled from: CommonCacheFile.kt */
/* JADX INFO: loaded from: classes11.dex */
public final class CommonCacheFile implements CacheFile {
    private final CacheRepository cacheRepository;
    private final SendDiagnosticEvent sendDiagnosticEvent;

    /* JADX INFO: renamed from: com.unity3d.ads.core.domain.CommonCacheFile$invoke$1, reason: invalid class name */
    /* JADX INFO: compiled from: CommonCacheFile.kt */
    @d(c = "com.unity3d.ads.core.domain.CommonCacheFile", f = "CommonCacheFile.kt", l = {26}, m = "invoke")
    public static final class AnonymousClass1 extends ContinuationImpl {
        public long J$0;
        public Object L$0;
        public Object L$1;
        public int label;
        public /* synthetic */ Object result;

        public AnonymousClass1(c<? super AnonymousClass1> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return CommonCacheFile.this.invoke(null, null, null, 0, this);
        }
    }

    public CommonCacheFile(CacheRepository cacheRepository, SendDiagnosticEvent sendDiagnosticEvent) {
        p.j(cacheRepository, "cacheRepository");
        p.j(sendDiagnosticEvent, "sendDiagnosticEvent");
        this.cacheRepository = cacheRepository;
        this.sendDiagnosticEvent = sendDiagnosticEvent;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    @Override // com.unity3d.ads.core.domain.CacheFile
    public Object invoke(String str, AdObject adObject, JSONArray jSONArray, int i10, c<? super CacheResult> cVar) throws Throwable {
        AnonymousClass1 anonymousClass1;
        CommonCacheFile commonCacheFile;
        AdObject adObject2;
        long j10;
        String message;
        if (cVar instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) cVar;
            int i11 = anonymousClass1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label = i11 - Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(cVar);
            }
        } else {
            anonymousClass1 = new AnonymousClass1(cVar);
        }
        Object file = anonymousClass1.result;
        Object objF = sj.a.f();
        int i12 = anonymousClass1.label;
        if (i12 == 0) {
            kotlin.c.b(file);
            long jB = j.f64572a.b();
            CacheRepository cacheRepository = this.cacheRepository;
            anonymousClass1.L$0 = this;
            anonymousClass1.L$1 = adObject;
            anonymousClass1.J$0 = jB;
            anonymousClass1.label = 1;
            file = cacheRepository.getFile(str, jSONArray, i10, anonymousClass1);
            if (file == objF) {
                return objF;
            }
            commonCacheFile = this;
            adObject2 = adObject;
            j10 = jB;
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j10 = anonymousClass1.J$0;
            AdObject adObject3 = (AdObject) anonymousClass1.L$1;
            commonCacheFile = (CommonCacheFile) anonymousClass1.L$0;
            kotlin.c.b(file);
            adObject2 = adObject3;
        }
        CacheResult cacheResult = (CacheResult) file;
        if (cacheResult instanceof CacheResult.Success) {
            CacheResult.Success success = (CacheResult.Success) cacheResult;
            SendDiagnosticEvent.DefaultImpls.invoke$default(commonCacheFile.sendDiagnosticEvent, "native_load_cache_success_time", tj.a.b(TimeExtensionsKt.elapsedMillis(j.a.b(j10))), kotlin.collections.a.m(h.a("cache_source", success.getSource().toString()), h.a("protocol", success.getCachedFile().getProtocol())), l0.g(h.a("size_kb", tj.a.d((int) (success.getCachedFile().getContentLength() / ((long) 1024))))), adObject2, null, 32, null);
        } else if (cacheResult instanceof CacheResult.Failure) {
            SendDiagnosticEvent sendDiagnosticEvent = commonCacheFile.sendDiagnosticEvent;
            Double dB = tj.a.b(TimeExtensionsKt.elapsedMillis(j.a.b(j10)));
            Pair[] pairArr = new Pair[3];
            CacheResult.Failure failure = (CacheResult.Failure) cacheResult;
            pairArr[0] = h.a("cache_source", failure.getSource().toString());
            pairArr[1] = h.a("reason", failure.getError().toString());
            Throwable reason = failure.getReason();
            if (reason == null || (message = reason.getMessage()) == null) {
                message = "";
            }
            pairArr[2] = h.a("reason_debug", message);
            SendDiagnosticEvent.DefaultImpls.invoke$default(sendDiagnosticEvent, "native_load_cache_failure_time", dB, kotlin.collections.a.m(pairArr), null, adObject2, null, 40, null);
        }
        return cacheResult;
    }
}
