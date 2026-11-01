package com.unity3d.services.core.webview.bridge;

/* JADX INFO: compiled from: IEventSender.kt */
/* JADX INFO: loaded from: classes5.dex */
public interface IEventSender {
    boolean canSend();

    boolean sendEvent(Enum<?> r10, Enum<?> r11, Object... objArr);
}
