package androidx.activity.result;

import androidx.activity.result.contract.ActivityResultContract;
import androidx.annotation.MainThread;
import androidx.core.app.ActivityOptionsCompat;

/* JADX INFO: compiled from: ActivityResultLauncher.kt */
/* JADX INFO: loaded from: classes8.dex */
public abstract class ActivityResultLauncher<I> {
    public abstract ActivityResultContract<I, ?> getContract();

    public void launch(I i10) {
        launch(i10, null);
    }

    public abstract void launch(I i10, ActivityOptionsCompat activityOptionsCompat);

    @MainThread
    public abstract void unregister();
}
