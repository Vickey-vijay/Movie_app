package com.unity3d.ads.adplayer;

import com.unity3d.ads.adplayer.model.WebViewEvent;
import mj.r;
import qk.p;

/* JADX INFO: compiled from: WebViewBridge.kt */
/* JADX INFO: loaded from: classes11.dex */
public interface WebViewBridge {
    p<Invocation> getOnInvocation();

    void handleCallback(String str, String str2, String str3);

    void handleInvocation(String str);

    Object request(String str, String str2, Object[] objArr, rj.c<? super Object[]> cVar);

    Object sendEvent(WebViewEvent webViewEvent, rj.c<? super r> cVar);
}
