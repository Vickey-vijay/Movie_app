package com.vungle.ads;

import kotlin.Metadata;

/* JADX INFO: compiled from: InitializationListener.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H&J\u0010\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&¨\u0006\u0007"}, d2 = {"Lcom/vungle/ads/InitializationListener;", "", "Lmj/r;", "onSuccess", "Lcom/vungle/ads/VungleError;", "vungleError", "onError", "vungle-ads_release"}, k = 1, mv = {1, 7, 1})
public interface InitializationListener {
    void onError(VungleError vungleError);

    void onSuccess();
}
