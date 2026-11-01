package androidx.core.app;

import androidx.core.util.Consumer;

/* JADX INFO: compiled from: OnPictureInPictureModeChangedProvider.kt */
/* JADX INFO: loaded from: classes9.dex */
public interface OnPictureInPictureModeChangedProvider {
    void addOnPictureInPictureModeChangedListener(Consumer<PictureInPictureModeChangedInfo> consumer);

    void removeOnPictureInPictureModeChangedListener(Consumer<PictureInPictureModeChangedInfo> consumer);
}
