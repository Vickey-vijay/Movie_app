package com.unity3d.ads.core.domain.om;

import ck.p;
import com.google.protobuf.ByteString;
import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.data.model.OMResult;
import com.unity3d.ads.core.data.repository.OpenMeasurementRepository;
import com.unity3d.ads.core.domain.SendDiagnosticEvent;
import java.util.Map;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import mj.r;
import nj.l0;
import rj.c;
import sj.a;
import tj.d;

/* JADX INFO: compiled from: AndroidOmImpressionOccurred.kt */
/* JADX INFO: loaded from: classes7.dex */
public final class AndroidOmImpressionOccurred implements OmImpressionOccurred {
    private final OpenMeasurementRepository openMeasurementRepository;
    private final SendDiagnosticEvent sendDiagnosticEvent;

    /* JADX INFO: renamed from: com.unity3d.ads.core.domain.om.AndroidOmImpressionOccurred$invoke$1, reason: invalid class name */
    /* JADX INFO: compiled from: AndroidOmImpressionOccurred.kt */
    @d(c = "com.unity3d.ads.core.domain.om.AndroidOmImpressionOccurred", f = "AndroidOmImpressionOccurred.kt", l = {15}, m = "invoke")
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
            return AndroidOmImpressionOccurred.this.invoke(null, false, this);
        }
    }

    public AndroidOmImpressionOccurred(OpenMeasurementRepository openMeasurementRepository, SendDiagnosticEvent sendDiagnosticEvent) {
        p.j(openMeasurementRepository, "openMeasurementRepository");
        p.j(sendDiagnosticEvent, "sendDiagnosticEvent");
        this.openMeasurementRepository = openMeasurementRepository;
        this.sendDiagnosticEvent = sendDiagnosticEvent;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.unity3d.ads.core.domain.om.OmImpressionOccurred
    public Object invoke(AdObject adObject, boolean z10, c<? super r> cVar) throws Throwable {
        AnonymousClass1 anonymousClass1;
        AndroidOmImpressionOccurred androidOmImpressionOccurred;
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
        Object objImpressionOccurred = anonymousClass1.result;
        Object objF = a.f();
        int i11 = anonymousClass1.label;
        if (i11 == 0) {
            kotlin.c.b(objImpressionOccurred);
            OpenMeasurementRepository openMeasurementRepository = this.openMeasurementRepository;
            ByteString opportunityId = adObject.getOpportunityId();
            anonymousClass1.L$0 = this;
            anonymousClass1.L$1 = adObject;
            anonymousClass1.label = 1;
            objImpressionOccurred = openMeasurementRepository.impressionOccurred(opportunityId, z10, anonymousClass1);
            if (objImpressionOccurred == objF) {
                return objF;
            }
            androidOmImpressionOccurred = this;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            adObject = (AdObject) anonymousClass1.L$1;
            androidOmImpressionOccurred = (AndroidOmImpressionOccurred) anonymousClass1.L$0;
            kotlin.c.b(objImpressionOccurred);
        }
        AdObject adObject2 = adObject;
        OMResult oMResult = (OMResult) objImpressionOccurred;
        if (oMResult instanceof OMResult.Success) {
            SendDiagnosticEvent.DefaultImpls.invoke$default(androidOmImpressionOccurred.sendDiagnosticEvent, "om_impression_occurred_success", null, null, null, adObject2, null, 46, null);
        } else if (oMResult instanceof OMResult.Failure) {
            SendDiagnosticEvent sendDiagnosticEvent = androidOmImpressionOccurred.sendDiagnosticEvent;
            Map mapD = l0.d();
            OMResult.Failure failure = (OMResult.Failure) oMResult;
            mapD.put("reason", failure.getReason());
            if (failure.getReasonDebug() != null) {
                mapD.put("reason_debug", failure.getReasonDebug());
            }
            r rVar = r.f64562a;
            SendDiagnosticEvent.DefaultImpls.invoke$default(sendDiagnosticEvent, "om_impression_occurred_failure", null, l0.c(mapD), null, adObject2, null, 42, null);
        }
        return r.f64562a;
    }
}
