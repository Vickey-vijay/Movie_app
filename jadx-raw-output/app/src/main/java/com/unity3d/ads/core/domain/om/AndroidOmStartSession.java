package com.unity3d.ads.core.domain.om;

import android.webkit.WebView;
import ck.p;
import com.google.protobuf.ByteString;
import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.data.model.OMResult;
import com.unity3d.ads.core.data.model.OmidOptions;
import com.unity3d.ads.core.data.repository.OpenMeasurementRepository;
import com.unity3d.ads.core.domain.SendDiagnosticEvent;
import java.util.Map;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import mj.r;
import nj.l0;
import org.json.JSONObject;
import rj.c;
import sj.a;
import tj.d;

/* JADX INFO: compiled from: AndroidOmStartSession.kt */
/* JADX INFO: loaded from: classes8.dex */
public final class AndroidOmStartSession extends AndroidOmInteraction {
    private final OpenMeasurementRepository openMeasurementRepository;
    private final SendDiagnosticEvent sendDiagnosticEvent;

    /* JADX INFO: renamed from: com.unity3d.ads.core.domain.om.AndroidOmStartSession$invoke$1, reason: invalid class name */
    /* JADX INFO: compiled from: AndroidOmStartSession.kt */
    @d(c = "com.unity3d.ads.core.domain.om.AndroidOmStartSession", f = "AndroidOmStartSession.kt", l = {18}, m = "invoke")
    public static final class AnonymousClass1 extends ContinuationImpl {
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
            return AndroidOmStartSession.this.invoke(null, null, this);
        }
    }

    public AndroidOmStartSession(OpenMeasurementRepository openMeasurementRepository, SendDiagnosticEvent sendDiagnosticEvent) {
        p.j(openMeasurementRepository, "openMeasurementRepository");
        p.j(sendDiagnosticEvent, "sendDiagnosticEvent");
        this.openMeasurementRepository = openMeasurementRepository;
        this.sendDiagnosticEvent = sendDiagnosticEvent;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.unity3d.ads.core.domain.om.OmInteraction
    public Object invoke(AdObject adObject, JSONObject jSONObject, c<? super r> cVar) throws Throwable {
        AnonymousClass1 anonymousClass1;
        AndroidOmStartSession androidOmStartSession;
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
        Object objStartSession = anonymousClass1.result;
        Object objF = a.f();
        int i11 = anonymousClass1.label;
        if (i11 == 0) {
            kotlin.c.b(objStartSession);
            OpenMeasurementRepository openMeasurementRepository = this.openMeasurementRepository;
            ByteString opportunityId = adObject.getOpportunityId();
            WebView webview = getWebview(adObject);
            OmidOptions oMidOptions = getOMidOptions(jSONObject);
            anonymousClass1.L$0 = this;
            anonymousClass1.L$1 = adObject;
            anonymousClass1.label = 1;
            objStartSession = openMeasurementRepository.startSession(opportunityId, webview, oMidOptions, anonymousClass1);
            if (objStartSession == objF) {
                return objF;
            }
            androidOmStartSession = this;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            adObject = (AdObject) anonymousClass1.L$1;
            androidOmStartSession = (AndroidOmStartSession) anonymousClass1.L$0;
            kotlin.c.b(objStartSession);
        }
        AdObject adObject2 = adObject;
        OMResult oMResult = (OMResult) objStartSession;
        if (oMResult instanceof OMResult.Success) {
            SendDiagnosticEvent.DefaultImpls.invoke$default(androidOmStartSession.sendDiagnosticEvent, "om_session_start_success", null, null, null, adObject2, null, 46, null);
        } else if (oMResult instanceof OMResult.Failure) {
            SendDiagnosticEvent sendDiagnosticEvent = androidOmStartSession.sendDiagnosticEvent;
            Map mapD = l0.d();
            OMResult.Failure failure = (OMResult.Failure) oMResult;
            mapD.put("reason", failure.getReason());
            if (failure.getReasonDebug() != null) {
                mapD.put("reason_debug", failure.getReasonDebug());
            }
            r rVar = r.f64562a;
            SendDiagnosticEvent.DefaultImpls.invoke$default(sendDiagnosticEvent, "om_session_start_failure", null, l0.c(mapD), null, adObject2, null, 42, null);
        }
        return r.f64562a;
    }
}
