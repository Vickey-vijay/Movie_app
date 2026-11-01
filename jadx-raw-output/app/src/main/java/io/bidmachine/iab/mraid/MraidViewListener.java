package io.bidmachine.iab.mraid;

import androidx.annotation.NonNull;
import io.bidmachine.iab.IabError;
import io.bidmachine.iab.utils.IabClickCallback;
import io.bidmachine.rendering.model.PrivacySheetParams;

/* JADX INFO: loaded from: classes2.dex */
public interface MraidViewListener {
    void onCalendarEvent(@NonNull MraidView mraidView, @NonNull String str, @NonNull IabClickCallback iabClickCallback);

    void onClose(@NonNull MraidView mraidView);

    void onExpand(@NonNull MraidView mraidView);

    void onExpired(@NonNull MraidView mraidView, @NonNull IabError iabError);

    void onLoadFailed(@NonNull MraidView mraidView, @NonNull IabError iabError);

    void onLoaded(@NonNull MraidView mraidView);

    void onOpenPrivacySheet(@NonNull MraidView mraidView, @NonNull PrivacySheetParams privacySheetParams);

    void onOpenUrl(@NonNull MraidView mraidView, @NonNull String str, @NonNull IabClickCallback iabClickCallback);

    void onPlayVideo(@NonNull MraidView mraidView, @NonNull String str);

    void onShowFailed(@NonNull MraidView mraidView, @NonNull IabError iabError);

    void onShown(@NonNull MraidView mraidView);

    void onStorePicture(@NonNull MraidView mraidView, @NonNull String str, @NonNull IabClickCallback iabClickCallback);
}
