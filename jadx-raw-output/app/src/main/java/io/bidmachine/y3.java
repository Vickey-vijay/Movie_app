package io.bidmachine;

import android.content.Context;
import android.os.Build;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: compiled from: HwInfoCache.java */
/* JADX INFO: loaded from: classes2.dex */
public final class y3 {

    @NonNull
    private static final String KEY_HW = Build.MANUFACTURER + Build.MODEL;

    @Nullable
    public String read(@NonNull Context context, @NonNull String str) {
        return o2.getHwInfo(context, str + KEY_HW);
    }

    public void store(@NonNull Context context, @NonNull String str, @Nullable String str2) {
        o2.setHwInfo(context, str + KEY_HW, str2);
    }
}
