package io.bidmachine.iab.vast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.bidmachine.iab.IabError;
import io.bidmachine.iab.utils.IabClickCallback;
import io.bidmachine.iab.vast.activity.VastView;

/* JADX INFO: loaded from: classes2.dex */
public interface VastViewListener {
    void onClick(@NonNull VastView vastView, @NonNull VastRequest vastRequest, @NonNull IabClickCallback iabClickCallback, @NonNull String str);

    void onComplete(@NonNull VastView vastView, @NonNull VastRequest vastRequest);

    void onFinish(@NonNull VastView vastView, @NonNull VastRequest vastRequest, boolean z10);

    void onOrientationRequested(@NonNull VastView vastView, @NonNull VastRequest vastRequest, int i10);

    void onShowFailed(@NonNull VastView vastView, @Nullable VastRequest vastRequest, @NonNull IabError iabError);

    void onShown(@NonNull VastView vastView, @NonNull VastRequest vastRequest);
}
