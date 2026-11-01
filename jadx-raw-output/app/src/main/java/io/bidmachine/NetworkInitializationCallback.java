package io.bidmachine;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes11.dex */
public interface NetworkInitializationCallback {
    void onFail(@NonNull String str);

    void onSuccess();
}
