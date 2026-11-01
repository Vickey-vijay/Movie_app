package com.unity3d.ads.core.domain;

import ck.i;
import ck.p;
import com.unity3d.ads.adplayer.AndroidWebViewContainer;
import com.unity3d.ads.adplayer.CommonWebViewBridge;
import com.unity3d.ads.adplayer.WebViewBridge;
import com.unity3d.ads.core.log.Logger;
import nk.h0;
import nk.l0;
import nk.w0;

/* JADX INFO: compiled from: CommonGetWebViewBridgeUseCase.kt */
/* JADX INFO: loaded from: classes7.dex */
public final class CommonGetWebViewBridgeUseCase implements GetWebViewBridgeUseCase {
    private final h0 dispatcher;
    private final Logger logger;
    private final SendDiagnosticEvent sendDiagnosticEvent;

    public CommonGetWebViewBridgeUseCase(h0 h0Var, SendDiagnosticEvent sendDiagnosticEvent, Logger logger) {
        p.j(h0Var, "dispatcher");
        p.j(sendDiagnosticEvent, "sendDiagnosticEvent");
        p.j(logger, "logger");
        this.dispatcher = h0Var;
        this.sendDiagnosticEvent = sendDiagnosticEvent;
        this.logger = logger;
    }

    @Override // com.unity3d.ads.core.domain.GetWebViewBridgeUseCase
    public WebViewBridge invoke(AndroidWebViewContainer androidWebViewContainer, l0 l0Var) {
        p.j(androidWebViewContainer, "webViewContainer");
        p.j(l0Var, "adPlayerScope");
        return new CommonWebViewBridge(this.dispatcher, androidWebViewContainer, l0Var, this.sendDiagnosticEvent, this.logger);
    }

    public /* synthetic */ CommonGetWebViewBridgeUseCase(h0 h0Var, SendDiagnosticEvent sendDiagnosticEvent, Logger logger, int i10, i iVar) {
        this((i10 & 1) != 0 ? w0.a() : h0Var, sendDiagnosticEvent, logger);
    }
}
