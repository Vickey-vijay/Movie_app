package androidx.activity.result.contract;

import android.content.Context;
import android.content.Intent;
import ck.p;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;

/* JADX INFO: compiled from: ActivityResultContract.kt */
/* JADX INFO: loaded from: classes8.dex */
public abstract class ActivityResultContract<I, O> {

    /* JADX INFO: compiled from: ActivityResultContract.kt */
    public static final class SynchronousResult<T> {
        private final T value;

        public final T getValue() {
            return this.value;
        }

        public SynchronousResult(T t10) {
            this.value = t10;
        }
    }

    public abstract Intent createIntent(Context context, I i10);

    public SynchronousResult<O> getSynchronousResult(Context context, I i10) {
        p.j(context, GAMConfig.KEY_CONTEXT);
        return null;
    }

    public abstract O parseResult(int i10, Intent intent);
}
