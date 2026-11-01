package com.unity3d.ads.core.domain.om;

import android.content.Context;
import ck.p;
import com.unity3d.ads.core.data.model.OMResult;
import com.unity3d.ads.core.data.repository.OpenMeasurementRepository;
import com.unity3d.ads.core.data.repository.SessionRepository;
import com.unity3d.ads.core.domain.SendDiagnosticEvent;
import com.unity3d.ads.core.extensions.TimeExtensionsKt;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import java.util.Map;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import mj.r;
import mk.j;
import nj.l0;
import rj.c;
import sj.a;
import tj.d;

/* JADX INFO: compiled from: AndroidInitializeOMSDK.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class AndroidInitializeOMSDK implements InitializeOMSDK {
    private final Context context;
    private final OpenMeasurementRepository omRepository;
    private final SendDiagnosticEvent sendDiagnosticEvent;
    private final SessionRepository sessionRepository;

    /* JADX INFO: renamed from: com.unity3d.ads.core.domain.om.AndroidInitializeOMSDK$invoke$1, reason: invalid class name */
    /* JADX INFO: compiled from: AndroidInitializeOMSDK.kt */
    @d(c = "com.unity3d.ads.core.domain.om.AndroidInitializeOMSDK", f = "AndroidInitializeOMSDK.kt", l = {27}, m = "invoke")
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
            return AndroidInitializeOMSDK.this.invoke(this);
        }
    }

    public AndroidInitializeOMSDK(Context context, SendDiagnosticEvent sendDiagnosticEvent, SessionRepository sessionRepository, OpenMeasurementRepository openMeasurementRepository) {
        p.j(context, GAMConfig.KEY_CONTEXT);
        p.j(sendDiagnosticEvent, "sendDiagnosticEvent");
        p.j(sessionRepository, "sessionRepository");
        p.j(openMeasurementRepository, "omRepository");
        this.context = context;
        this.sendDiagnosticEvent = sendDiagnosticEvent;
        this.sessionRepository = sessionRepository;
        this.omRepository = openMeasurementRepository;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    @Override // com.unity3d.ads.core.domain.om.InitializeOMSDK
    public Object invoke(c<? super r> cVar) throws Throwable {
        AnonymousClass1 anonymousClass1;
        AndroidInitializeOMSDK androidInitializeOMSDK;
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
        Object objActivateOM = anonymousClass1.result;
        Object objF = a.f();
        int i11 = anonymousClass1.label;
        if (i11 == 0) {
            kotlin.c.b(objActivateOM);
            if (this.sessionRepository.isOmEnabled()) {
                long jB = j.f64572a.b();
                SendDiagnosticEvent.DefaultImpls.invoke$default(this.sendDiagnosticEvent, "om_activate_started", null, null, null, null, null, 62, null);
                OpenMeasurementRepository openMeasurementRepository = this.omRepository;
                Context context = this.context;
                anonymousClass1.L$0 = this;
                anonymousClass1.J$0 = jB;
                anonymousClass1.label = 1;
                objActivateOM = openMeasurementRepository.activateOM(context, anonymousClass1);
                if (objActivateOM == objF) {
                    return objF;
                }
                androidInitializeOMSDK = this;
                j10 = jB;
            }
            return r.f64562a;
        }
        if (i11 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        j10 = anonymousClass1.J$0;
        androidInitializeOMSDK = (AndroidInitializeOMSDK) anonymousClass1.L$0;
        kotlin.c.b(objActivateOM);
        OMResult oMResult = (OMResult) objActivateOM;
        if (oMResult instanceof OMResult.Success) {
            SendDiagnosticEvent.DefaultImpls.invoke$default(androidInitializeOMSDK.sendDiagnosticEvent, "om_activate_success_time", tj.a.b(TimeExtensionsKt.elapsedMillis(j.a.b(j10))), null, null, null, null, 60, null);
        } else if (oMResult instanceof OMResult.Failure) {
            SendDiagnosticEvent sendDiagnosticEvent = androidInitializeOMSDK.sendDiagnosticEvent;
            Double dB = tj.a.b(TimeExtensionsKt.elapsedMillis(j.a.b(j10)));
            Map mapD = l0.d();
            OMResult.Failure failure = (OMResult.Failure) oMResult;
            mapD.put("reason", failure.getReason());
            if (failure.getReasonDebug() != null) {
                mapD.put("reason_debug", failure.getReasonDebug());
            }
            r rVar = r.f64562a;
            SendDiagnosticEvent.DefaultImpls.invoke$default(sendDiagnosticEvent, "om_activate_failure_time", dB, l0.c(mapD), null, null, null, 56, null);
        }
        return r.f64562a;
    }
}
