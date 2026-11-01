package com.unity3d.ads.core.domain;

import com.unity3d.ads.core.data.model.WebViewConfiguration;
import java.io.File;
import java.util.Map;
import mj.r;
import rj.c;

/* JADX INFO: compiled from: CacheWebViewAssets.kt */
/* JADX INFO: loaded from: classes10.dex */
public interface CacheWebViewAssets {
    Map<String, File> getCached();

    Object invoke(WebViewConfiguration webViewConfiguration, c<? super r> cVar);
}
