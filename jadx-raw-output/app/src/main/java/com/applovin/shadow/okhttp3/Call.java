package com.applovin.shadow.okhttp3;

import com.applovin.shadow.okio.Timeout;
import java.io.IOException;

/* JADX INFO: compiled from: Call.kt */
/* JADX INFO: loaded from: classes5.dex */
public interface Call extends Cloneable {

    /* JADX INFO: compiled from: Call.kt */
    public interface Factory {
        Call newCall(Request request);
    }

    void cancel();

    Call clone();

    void enqueue(Callback callback);

    Response execute() throws IOException;

    boolean isCanceled();

    boolean isExecuted();

    Request request();

    Timeout timeout();
}
