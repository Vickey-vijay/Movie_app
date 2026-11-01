package com.unity3d.ads.adplayer;

import android.view.InputEvent;
import mj.r;
import org.json.JSONArray;
import qk.u;

/* JADX INFO: compiled from: WebViewContainer.kt */
/* JADX INFO: loaded from: classes3.dex */
public interface WebViewContainer {
    Object addJavascriptInterface(WebViewBridge webViewBridge, String str, rj.c<? super r> cVar);

    Object destroy(rj.c<? super r> cVar);

    Object evaluateJavascript(HandlerType handlerType, JSONArray jSONArray, rj.c<? super r> cVar);

    u<InputEvent> getLastInputEvent();

    Object loadUrl(String str, rj.c<? super r> cVar);
}
