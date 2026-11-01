package io.appmetrica.analytics.internal.js;

import android.webkit.JavascriptInterface;
import androidx.annotation.NonNull;
import io.appmetrica.analytics.impl.C4558u1;

/* JADX INFO: loaded from: classes2.dex */
public class AppMetricaJsInterface {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C4558u1 f58089a;

    @JavascriptInterface
    public void reportEvent(String str, String str2) {
        this.f58089a.d(str, str2);
    }

    public AppMetricaJsInterface(@NonNull C4558u1 c4558u1) {
        this.f58089a = c4558u1;
    }
}
