package com.mbridge.msdk.mbsignalcommon.webEnvCheck;

import android.content.Context;
import com.ironsource.G5;
import com.mbridge.msdk.mbsignalcommon.windvane.WindVaneWebView;
import com.mbridge.msdk.setting.util.b;
import com.safedk.android.internal.partials.MintegralNetworkBridge;

/* JADX INFO: loaded from: classes2.dex */
public class WebEnvCheckEntry {
    public void check(Context context) {
        MintegralNetworkBridge.webviewLoadDataWithBaseURL(new WindVaneWebView(context), null, "<html><script>" + b.c().d() + "</script></html>", "text/html", G5.N, null);
    }
}
