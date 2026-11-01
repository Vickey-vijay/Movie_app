package io.bidmachine.models;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes10.dex */
public interface IBlockedParams<SelfType> {
    SelfType addBlockedAdvertiserDomain(@NonNull String str);

    SelfType addBlockedAdvertiserIABCategory(@NonNull String str);

    SelfType addBlockedApplication(@NonNull String str);
}
