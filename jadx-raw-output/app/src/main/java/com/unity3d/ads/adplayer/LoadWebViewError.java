package com.unity3d.ads.adplayer;

import ck.p;
import com.unity3d.ads.adplayer.model.WebViewClientError;
import java.util.List;

/* JADX INFO: compiled from: AdPlayerError.kt */
/* JADX INFO: loaded from: classes7.dex */
public final class LoadWebViewError extends AdPlayerError {
    private final List<WebViewClientError> errors;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LoadWebViewError(List<WebViewClientError> list) {
        super("AdPlayer was not able to load the webview.", null);
        p.j(list, "errors");
        this.errors = list;
    }

    public final List<WebViewClientError> getErrors() {
        return this.errors;
    }
}
