package androidx.work;

import android.content.Context;
import androidx.annotation.NonNull;
import java.util.UUID;
import q5.i;

/* JADX INFO: loaded from: classes6.dex */
public interface ForegroundUpdater {
    @NonNull
    i<Void> setForegroundAsync(@NonNull Context context, @NonNull UUID uuid, @NonNull ForegroundInfo foregroundInfo);
}
