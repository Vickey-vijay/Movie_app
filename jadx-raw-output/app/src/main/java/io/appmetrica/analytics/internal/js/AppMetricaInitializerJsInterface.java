package io.appmetrica.analytics.internal.js;

import android.webkit.JavascriptInterface;
import androidx.annotation.NonNull;
import io.appmetrica.analytics.impl.C4558u1;

/* JADX INFO: loaded from: classes11.dex */
public class AppMetricaInitializerJsInterface {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C4558u1 f58088a;

    @JavascriptInterface
    public void init(String str) {
        this.f58088a.c(str);
    }

    public AppMetricaInitializerJsInterface(@NonNull C4558u1 c4558u1) {
        this.f58088a = c4558u1;
    }
}
