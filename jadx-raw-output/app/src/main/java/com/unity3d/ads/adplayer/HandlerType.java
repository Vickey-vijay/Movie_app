package com.unity3d.ads.adplayer;

/* JADX INFO: compiled from: HandlerType.kt */
/* JADX INFO: loaded from: classes8.dex */
public enum HandlerType {
    CALLBACK("handleCallback"),
    INVOCATION("handleInvocation"),
    EVENT("handleEvent");

    private final String jsPath;

    public final String getJsPath() {
        return this.jsPath;
    }

    HandlerType(String str) {
        this.jsPath = str;
    }
}
