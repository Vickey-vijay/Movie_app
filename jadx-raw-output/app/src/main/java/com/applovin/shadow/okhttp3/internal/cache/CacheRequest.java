package com.applovin.shadow.okhttp3.internal.cache;

import com.applovin.shadow.okio.Sink;
import java.io.IOException;

/* JADX INFO: compiled from: CacheRequest.kt */
/* JADX INFO: loaded from: classes10.dex */
public interface CacheRequest {
    void abort();

    Sink body() throws IOException;
}
