package io.appmetrica.analytics.modulesapi.internal.network;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(bv = {}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&J\b\u0010\b\u001a\u00020\u0006H&J\b\u0010\t\u001a\u00020\u0006H&R\u0016\u0010\u0003\u001a\u0004\u0018\u00010\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lio/appmetrica/analytics/modulesapi/internal/network/NetworkClientWithCacheControl;", "", "", "eTag", "", "response", "Lmj/r;", "onResponse", "onNotModified", "onError", "getETag", "()Ljava/lang/String;", "modules-api_release"}, k = 1, mv = {1, 6, 0})
public interface NetworkClientWithCacheControl {
    String getETag();

    void onError();

    void onNotModified();

    void onResponse(String str, byte[] bArr);
}
