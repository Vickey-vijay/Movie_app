package com.applovin.shadow.okhttp3;

import com.applovin.shadow.okio.ByteString;

/* JADX INFO: compiled from: WebSocket.kt */
/* JADX INFO: loaded from: classes10.dex */
public interface WebSocket {

    /* JADX INFO: compiled from: WebSocket.kt */
    public interface Factory {
        WebSocket newWebSocket(Request request, WebSocketListener webSocketListener);
    }

    void cancel();

    boolean close(int i10, String str);

    long queueSize();

    Request request();

    boolean send(ByteString byteString);

    boolean send(String str);
}
