package com.apm.insight;

import androidx.annotation.Nullable;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public interface AttachUserData {
    @Nullable
    Map<? extends String, ? extends String> getUserData(CrashType crashType);
}
