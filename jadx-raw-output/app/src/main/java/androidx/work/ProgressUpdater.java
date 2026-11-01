package androidx.work;

import android.content.Context;
import androidx.annotation.NonNull;
import java.util.UUID;
import q5.i;

/* JADX INFO: loaded from: classes11.dex */
public interface ProgressUpdater {
    @NonNull
    i<Void> updateProgress(@NonNull Context context, @NonNull UUID uuid, @NonNull Data data);
}
