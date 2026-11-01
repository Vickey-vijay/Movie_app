package com.applovin.shadow.okhttp3;

import java.net.Socket;

/* JADX INFO: compiled from: Connection.kt */
/* JADX INFO: loaded from: classes3.dex */
public interface Connection {
    Handshake handshake();

    Protocol protocol();

    Route route();

    Socket socket();
}
