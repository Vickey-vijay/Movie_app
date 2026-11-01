package com.unity3d.ads.core.domain;

import android.webkit.WebView;
import ck.p;
import com.unity3d.ads.core.log.LogLevel;
import com.unity3d.ads.core.log.Logger;
import gatewayprotocol.v1.NativeConfigurationOuterClass;

/* JADX INFO: compiled from: HandleDebugSettings.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class HandleDebugSettings {
    private final Logger logger;

    public HandleDebugSettings(Logger logger) {
        p.j(logger, "logger");
        this.logger = logger;
    }

    public final void invoke(NativeConfigurationOuterClass.DebugSettings debugSettings) {
        p.j(debugSettings, "debugSettings");
        if (debugSettings.getEnableTracing()) {
            this.logger.setLogLevel(LogLevel.TRACE);
        }
        WebView.setWebContentsDebuggingEnabled(debugSettings.getWebviewInspectable());
    }
}
