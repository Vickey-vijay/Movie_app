package com.unity3d.ads.core.domain;

import android.content.Context;
import ck.p;
import com.google.protobuf.ByteString;
import com.unity3d.ads.adplayer.AdPlayer;
import com.unity3d.ads.adplayer.AndroidEmbeddableWebViewAdPlayer;
import com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer;
import com.unity3d.ads.adplayer.AndroidWebViewContainer;
import com.unity3d.ads.adplayer.WebViewAdPlayer;
import com.unity3d.ads.adplayer.WebViewBridge;
import com.unity3d.ads.core.data.datasource.LifecycleDataSource;
import com.unity3d.ads.core.data.manager.OfferwallManager;
import com.unity3d.ads.core.data.manager.ScarManager;
import com.unity3d.ads.core.data.model.CoroutineOpportunity;
import com.unity3d.ads.core.data.repository.AdRepository;
import com.unity3d.ads.core.data.repository.DeviceInfoRepository;
import com.unity3d.ads.core.data.repository.OpenMeasurementRepository;
import com.unity3d.ads.core.data.repository.OrientationRepository;
import com.unity3d.ads.core.data.repository.SessionRepository;
import com.unity3d.ads.core.extensions.ProtobufExtensionsKt;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import kotlinx.coroutines.d;
import nk.h0;
import nk.l0;

/* JADX INFO: compiled from: CommonGetAdPlayer.kt */
/* JADX INFO: loaded from: classes11.dex */
public final class CommonGetAdPlayer implements GetAdPlayer {
    private final l0 adPlayerScope;
    private final AdRepository adRepository;
    private final Context context;
    private final h0 defaultDispatcher;
    private final DeviceInfoRepository deviceInfoRepository;
    private final LifecycleDataSource lifecycleDataSource;
    private final OfferwallManager offerwallManager;
    private final OpenMeasurementRepository openMeasurementRepository;
    private final OrientationRepository orientationRepository;
    private final ScarManager scarManager;
    private final SendDiagnosticEvent sendDiagnosticEvent;
    private final SessionRepository sessionRepository;

    public CommonGetAdPlayer(DeviceInfoRepository deviceInfoRepository, SessionRepository sessionRepository, SendDiagnosticEvent sendDiagnosticEvent, h0 h0Var, l0 l0Var, OpenMeasurementRepository openMeasurementRepository, ScarManager scarManager, OfferwallManager offerwallManager, AdRepository adRepository, LifecycleDataSource lifecycleDataSource, OrientationRepository orientationRepository, Context context) {
        p.j(deviceInfoRepository, "deviceInfoRepository");
        p.j(sessionRepository, "sessionRepository");
        p.j(sendDiagnosticEvent, "sendDiagnosticEvent");
        p.j(h0Var, "defaultDispatcher");
        p.j(l0Var, "adPlayerScope");
        p.j(openMeasurementRepository, "openMeasurementRepository");
        p.j(scarManager, "scarManager");
        p.j(offerwallManager, "offerwallManager");
        p.j(adRepository, "adRepository");
        p.j(lifecycleDataSource, "lifecycleDataSource");
        p.j(orientationRepository, "orientationRepository");
        p.j(context, GAMConfig.KEY_CONTEXT);
        this.deviceInfoRepository = deviceInfoRepository;
        this.sessionRepository = sessionRepository;
        this.sendDiagnosticEvent = sendDiagnosticEvent;
        this.defaultDispatcher = h0Var;
        this.adPlayerScope = l0Var;
        this.openMeasurementRepository = openMeasurementRepository;
        this.scarManager = scarManager;
        this.offerwallManager = offerwallManager;
        this.adRepository = adRepository;
        this.lifecycleDataSource = lifecycleDataSource;
        this.orientationRepository = orientationRepository;
        this.context = context;
    }

    @Override // com.unity3d.ads.core.domain.GetAdPlayer
    public AdPlayer invoke(WebViewBridge webViewBridge, AndroidWebViewContainer androidWebViewContainer, ByteString byteString, DiagnosticEventRequestOuterClass.DiagnosticAdType diagnosticAdType) {
        p.j(webViewBridge, "webviewBridge");
        p.j(androidWebViewContainer, "webviewContainer");
        p.j(byteString, "opportunityId");
        p.j(diagnosticAdType, "adType");
        WebViewAdPlayer webViewAdPlayer = new WebViewAdPlayer(webViewBridge, this.deviceInfoRepository, this.sessionRepository, this.defaultDispatcher, this.sendDiagnosticEvent, androidWebViewContainer, d.h(this.adPlayerScope, new CoroutineOpportunity(byteString)));
        if (diagnosticAdType != DiagnosticEventRequestOuterClass.DiagnosticAdType.DIAGNOSTIC_AD_TYPE_FULLSCREEN) {
            String string = ProtobufExtensionsKt.toUUID(byteString).toString();
            OpenMeasurementRepository openMeasurementRepository = this.openMeasurementRepository;
            ScarManager scarManager = this.scarManager;
            LifecycleDataSource lifecycleDataSource = this.lifecycleDataSource;
            Context context = this.context;
            p.i(string, "toString()");
            return new AndroidEmbeddableWebViewAdPlayer(webViewAdPlayer, string, androidWebViewContainer, openMeasurementRepository, scarManager, lifecycleDataSource, context);
        }
        String string2 = ProtobufExtensionsKt.toUUID(byteString).toString();
        DeviceInfoRepository deviceInfoRepository = this.deviceInfoRepository;
        SessionRepository sessionRepository = this.sessionRepository;
        OpenMeasurementRepository openMeasurementRepository2 = this.openMeasurementRepository;
        ScarManager scarManager2 = this.scarManager;
        OfferwallManager offerwallManager = this.offerwallManager;
        SendDiagnosticEvent sendDiagnosticEvent = this.sendDiagnosticEvent;
        AdRepository adRepository = this.adRepository;
        OrientationRepository orientationRepository = this.orientationRepository;
        Context context2 = this.context;
        p.i(string2, "toString()");
        return new AndroidFullscreenWebViewAdPlayer(webViewAdPlayer, string2, androidWebViewContainer, deviceInfoRepository, sessionRepository, openMeasurementRepository2, scarManager2, offerwallManager, sendDiagnosticEvent, adRepository, orientationRepository, context2);
    }
}
