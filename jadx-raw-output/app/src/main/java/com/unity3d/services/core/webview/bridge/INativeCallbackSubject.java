package com.unity3d.services.core.webview.bridge;

/* JADX INFO: compiled from: INativeCallbackSubject.kt */
/* JADX INFO: loaded from: classes11.dex */
public interface INativeCallbackSubject {
    NativeCallback getCallback(String str);

    void remove(NativeCallback nativeCallback);
}
