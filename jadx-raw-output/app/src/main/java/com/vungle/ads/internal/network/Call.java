package com.vungle.ads.internal.network;

import kotlin.Metadata;

/* JADX INFO: compiled from: Call.kt */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(bv = {}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\bf\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002J\u0010\u0010\u0004\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0003H&J\u0016\u0010\b\u001a\u00020\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005H&J\b\u0010\t\u001a\u00020\u0007H&J\b\u0010\u000b\u001a\u00020\nH&¨\u0006\f"}, d2 = {"Lcom/vungle/ads/internal/network/Call;", "T", "", "Lcom/vungle/ads/internal/network/Response;", "execute", "Lcom/vungle/ads/internal/network/Callback;", "callback", "Lmj/r;", "enqueue", "cancel", "", "isCanceled", "vungle-ads_release"}, k = 1, mv = {1, 7, 1})
public interface Call<T> {
    void cancel();

    void enqueue(Callback<T> callback);

    Response<T> execute();

    boolean isCanceled();
}
