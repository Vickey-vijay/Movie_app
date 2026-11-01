package io.bidmachine.nativead;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.bidmachine.nativead.view.NativeMediaView;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public interface NativeContainer {
    @Nullable
    View getProviderView(@NonNull Context context);

    boolean isViewRegistered();

    void registerView(@NonNull ViewGroup viewGroup, @Nullable View view, @Nullable NativeMediaView nativeMediaView, @Nullable Set<View> set);

    void unregisterView();
}
