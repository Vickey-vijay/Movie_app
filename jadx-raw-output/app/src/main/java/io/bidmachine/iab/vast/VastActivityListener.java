package io.bidmachine.iab.vast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.bidmachine.iab.IabError;
import io.bidmachine.iab.utils.IabClickCallback;
import io.bidmachine.iab.vast.activity.VastActivity;

/* JADX INFO: loaded from: classes.dex */
public interface VastActivityListener {
    void onVastClick(@NonNull VastActivity vastActivity, @NonNull VastRequest vastRequest, @NonNull IabClickCallback iabClickCallback, @NonNull String str);

    void onVastComplete(@NonNull VastActivity vastActivity, @NonNull VastRequest vastRequest);

    void onVastDismiss(@NonNull VastActivity vastActivity, @Nullable VastRequest vastRequest, boolean z10);

    void onVastShowFailed(@Nullable VastRequest vastRequest, @NonNull IabError iabError);

    void onVastShown(@NonNull VastActivity vastActivity, @NonNull VastRequest vastRequest);
}
