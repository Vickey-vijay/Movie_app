package io.bidmachine;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.UiThread;
import com.google.android.gms.appset.AppSet;
import com.google.android.gms.appset.AppSetIdInfo;
import com.google.android.gms.tasks.OnSuccessListener;
import io.bidmachine.internal.utils.LogSafeRunnable;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: AppIdDataManager.java */
/* JADX INFO: loaded from: classes7.dex */
public class z0 {

    @Nullable
    private volatile String ifv;

    @NonNull
    private final AtomicBoolean isUpdateExecuted = new AtomicBoolean(false);

    /* JADX INFO: compiled from: AppIdDataManager.java */
    public class a implements OnSuccessListener<AppSetIdInfo> {
        public a() {
        }

        @Override // com.google.android.gms.tasks.OnSuccessListener
        @UiThread
        public void onSuccess(AppSetIdInfo appSetIdInfo) {
            if (appSetIdInfo.getScope() == 2) {
                z0.this.ifv = appSetIdInfo.getId();
            }
        }
    }

    @Nullable
    public String getIfv() {
        return this.ifv;
    }

    public void updateIfv(@NonNull final Context context) {
        if (this.isUpdateExecuted.compareAndSet(false, true)) {
            x2.get().execute(new LogSafeRunnable() { // from class: io.bidmachine.y0
                @Override // io.bidmachine.internal.utils.LogSafeRunnable, io.bidmachine.utils.SafeRunnable
                public final void onRun() throws Throwable {
                    this.f60996b.lambda$updateIfv$0(context);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$updateIfv$0(Context context) throws Throwable {
        AppSet.getClient(context).getAppSetIdInfo().addOnSuccessListener(new a());
    }
}
