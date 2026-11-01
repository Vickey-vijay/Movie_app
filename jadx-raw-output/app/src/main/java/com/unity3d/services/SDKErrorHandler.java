package com.unity3d.services;

import bk.p;
import ck.i;
import com.google.protobuf.ByteString;
import com.unity3d.ads.core.configuration.AlternativeFlowReader;
import com.unity3d.ads.core.data.model.CoroutineOpportunity;
import com.unity3d.ads.core.domain.SendDiagnosticEvent;
import com.unity3d.ads.core.extensions.ExceptionExtensionsKt;
import com.unity3d.ads.core.extensions.ProtobufExtensionsKt;
import com.unity3d.services.core.log.DeviceLog;
import com.unity3d.services.core.request.metrics.Metric;
import com.unity3d.services.core.request.metrics.SDKMetricsSender;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import java.util.Map;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import mj.r;
import nk.h0;
import nk.i0;
import nk.j;
import nk.k0;
import nk.l0;
import rj.c;
import sj.a;
import tj.d;

/* JADX INFO: compiled from: SDKErrorHandler.kt */
/* JADX INFO: loaded from: classes7.dex */
public final class SDKErrorHandler implements i0 {
    public static final Companion Companion = new Companion(null);
    public static final String UNITY_PACKAGE = "com.unity3d";
    public static final String UNKNOWN_FILE = "unknown";
    private final AlternativeFlowReader alternativeFlowReader;
    private final h0 ioDispatcher;
    private final i0.b key;
    private final l0 scope;
    private final SDKMetricsSender sdkMetricsSender;
    private final SendDiagnosticEvent sendDiagnosticEvent;

    /* JADX INFO: compiled from: SDKErrorHandler.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(i iVar) {
            this();
        }
    }

    /* JADX INFO: renamed from: com.unity3d.services.SDKErrorHandler$sendDiagnostic$1, reason: invalid class name */
    /* JADX INFO: compiled from: SDKErrorHandler.kt */
    @d(c = "com.unity3d.services.SDKErrorHandler$sendDiagnostic$1", f = "SDKErrorHandler.kt", l = {}, m = "invokeSuspend")
    public static final class AnonymousClass1 extends SuspendLambda implements p<l0, c<? super r>, Object> {
        public final /* synthetic */ String $name;
        public final /* synthetic */ ByteString $opportunityId;
        public final /* synthetic */ String $reason;
        public final /* synthetic */ String $scopeName;
        public final /* synthetic */ String $stackTrace;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(String str, String str2, String str3, String str4, ByteString byteString, c<? super AnonymousClass1> cVar) {
            super(2, cVar);
            this.$name = str;
            this.$reason = str2;
            this.$stackTrace = str3;
            this.$scopeName = str4;
            this.$opportunityId = byteString;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final c<r> create(Object obj, c<?> cVar) {
            return SDKErrorHandler.this.new AnonymousClass1(this.$name, this.$reason, this.$stackTrace, this.$scopeName, this.$opportunityId, cVar);
        }

        @Override // bk.p
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final Object mo1invoke(l0 l0Var, c<? super r> cVar) {
            return ((AnonymousClass1) create(l0Var, cVar)).invokeSuspend(r.f64562a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            a.f();
            if (this.label == 0) {
                kotlin.c.b(obj);
                SendDiagnosticEvent sendDiagnosticEvent = SDKErrorHandler.this.sendDiagnosticEvent;
                String str = this.$name;
                String str2 = this.$reason;
                String str3 = this.$stackTrace;
                String str4 = this.$scopeName;
                ByteString byteString = this.$opportunityId;
                Map mapD = nj.l0.d();
                mapD.put("reason", str2);
                mapD.put("reason_debug", str3);
                mapD.put("coroutine_name", str4);
                if (byteString != null) {
                    String string = ProtobufExtensionsKt.toUUID(byteString).toString();
                    ck.p.i(string, "it.toUUID().toString()");
                    mapD.put("impressionOpportunityId", string);
                }
                r rVar = r.f64562a;
                SendDiagnosticEvent.DefaultImpls.invoke$default(sendDiagnosticEvent, str, null, nj.l0.c(mapD), null, null, null, 58, null);
                return r.f64562a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public SDKErrorHandler(h0 h0Var, AlternativeFlowReader alternativeFlowReader, SendDiagnosticEvent sendDiagnosticEvent, SDKMetricsSender sDKMetricsSender) {
        ck.p.j(h0Var, "ioDispatcher");
        ck.p.j(alternativeFlowReader, "alternativeFlowReader");
        ck.p.j(sendDiagnosticEvent, "sendDiagnosticEvent");
        ck.p.j(sDKMetricsSender, "sdkMetricsSender");
        this.ioDispatcher = h0Var;
        this.alternativeFlowReader = alternativeFlowReader;
        this.sendDiagnosticEvent = sendDiagnosticEvent;
        this.sdkMetricsSender = sDKMetricsSender;
        this.scope = kotlinx.coroutines.d.h(kotlinx.coroutines.d.a(h0Var), new k0("SDKErrorHandler"));
        this.key = i0.F8;
    }

    private final String retrieveCoroutineName(kotlin.coroutines.d dVar) {
        String strN;
        k0 k0Var = (k0) dVar.get(k0.f64796c);
        return (k0Var == null || (strN = k0Var.n()) == null) ? "unknown" : strN;
    }

    private final ByteString retrieveOpportunityId(kotlin.coroutines.d dVar) {
        CoroutineOpportunity coroutineOpportunity = (CoroutineOpportunity) dVar.get(CoroutineOpportunity.Key);
        if (coroutineOpportunity != null) {
            return coroutineOpportunity.getValue();
        }
        return null;
    }

    private final void sendDiagnostic(String str, String str2, String str3, String str4, ByteString byteString) {
        j.d(this.scope, null, null, new AnonymousClass1(str, str2, str4, str3, byteString, null), 3, null);
    }

    private final void sendMetric(Metric metric) {
        this.sdkMetricsSender.sendMetric(metric);
    }

    @Override // kotlin.coroutines.d.b
    public i0.b getKey() {
        return this.key;
    }

    @Override // nk.i0
    public void handleException(kotlin.coroutines.d dVar, Throwable th2) {
        String str;
        ck.p.j(dVar, GAMConfig.KEY_CONTEXT);
        ck.p.j(th2, "exception");
        String strRetrieveCoroutineName = retrieveCoroutineName(dVar);
        ByteString byteStringRetrieveOpportunityId = retrieveOpportunityId(dVar);
        if (th2 instanceof NullPointerException) {
            str = "native_exception_npe";
        } else if (th2 instanceof OutOfMemoryError) {
            str = "native_exception_oom";
        } else if (th2 instanceof IllegalStateException) {
            str = "native_exception_ise";
        } else if (th2 instanceof SecurityException) {
            str = "native_exception_se";
        } else {
            str = th2 instanceof RuntimeException ? "native_exception_re" : "native_exception";
        }
        String str2 = str;
        boolean zInvoke = this.alternativeFlowReader.invoke();
        String strRetrieveUnityCrashValue = ExceptionExtensionsKt.retrieveUnityCrashValue(th2);
        DeviceLog.error("Unity Ads SDK encountered an exception: " + strRetrieveUnityCrashValue);
        if (zInvoke) {
            sendDiagnostic(str2, strRetrieveUnityCrashValue, strRetrieveCoroutineName, ExceptionExtensionsKt.getShortenedStackTrace(th2, 15), byteStringRetrieveOpportunityId);
        } else {
            sendMetric(new Metric(str2, strRetrieveUnityCrashValue, null, 4, null));
        }
    }

    @Override // kotlin.coroutines.d
    public <R> R fold(R r10, p<? super R, ? super kotlin.coroutines.d.b, ? extends R> pVar) {
        return (R) i0.a.a(this, r10, pVar);
    }

    @Override // kotlin.coroutines.d.b, kotlin.coroutines.d
    public <E extends kotlin.coroutines.d.b> E get(kotlin.coroutines.d.c<E> cVar) {
        return (E) i0.a.b(this, cVar);
    }

    @Override // kotlin.coroutines.d
    public kotlin.coroutines.d minusKey(kotlin.coroutines.d.c<?> cVar) {
        return i0.a.c(this, cVar);
    }

    @Override // kotlin.coroutines.d
    public kotlin.coroutines.d plus(kotlin.coroutines.d dVar) {
        return i0.a.d(this, dVar);
    }
}
