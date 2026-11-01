package io.bidmachine;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes2.dex */
public interface InternalNetworkInitializationCallback {
    void onFail(@NonNull NetworkAdapter networkAdapter, @NonNull String str);

    void onSuccess(@NonNull NetworkAdapter networkAdapter);
}
