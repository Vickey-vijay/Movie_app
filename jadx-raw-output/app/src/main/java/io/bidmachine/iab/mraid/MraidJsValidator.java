package io.bidmachine.iab.mraid;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public interface MraidJsValidator {
    boolean checkParamsForCommand(@NonNull String str, @NonNull Map<String, String> map);

    boolean isValidCommand(@Nullable String str);

    @NonNull
    String removePrefix(@NonNull String str);
}
