package io.bidmachine.rendering.measurer;

import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.bidmachine.rendering.model.Error;
import java.io.Serializable;

/* JADX INFO: loaded from: classes8.dex */
public interface Measurer<ViewType extends View> extends Serializable {
    void destroy(@Nullable Runnable runnable);

    void onClicked();

    void onError(@NonNull Error error);

    void onShown();

    void onViewAddedToContainer(@NonNull ViewType viewtype, @NonNull ViewGroup viewGroup);

    void onViewCreated(@NonNull ViewType viewtype);

    void onViewReady(@NonNull ViewType viewtype);
}
