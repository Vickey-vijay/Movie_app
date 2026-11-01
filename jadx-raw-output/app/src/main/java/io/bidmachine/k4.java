package io.bidmachine;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.WorkerThread;
import com.android.installreferrer.api.InstallReferrerClient;
import com.android.installreferrer.api.InstallReferrerStateListener;
import io.bidmachine.core.Logger;
import io.bidmachine.internal.utils.LogSafeRunnable;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: compiled from: InstallInfoProvider.java */
/* JADX INFO: loaded from: classes2.dex */
public class k4 {

    @NonNull
    private static final AtomicLong INSTALL_TIME_MS = new AtomicLong(0);

    /* JADX INFO: compiled from: InstallInfoProvider.java */
    public static class b {

        @NonNull
        private final InstallReferrerClient client;

        /* JADX INFO: compiled from: InstallInfoProvider.java */
        public class a implements InstallReferrerStateListener {
            private a() {
            }

            @Override // com.android.installreferrer.api.InstallReferrerStateListener
            public void onInstallReferrerServiceDisconnected() {
            }

            /* JADX INFO: Access modifiers changed from: private */
            /* JADX INFO: renamed from: onInstallReferrerSetupFinishedSync, reason: merged with bridge method [inline-methods] */
            public void lambda$onInstallReferrerSetupFinished$0(int i10) {
                if (i10 == 0) {
                    AtomicLong atomicLong = k4.INSTALL_TIME_MS;
                    b bVar = b.this;
                    atomicLong.set(bVar.getInstallTimeMs(bVar.client));
                }
                b.this.client.endConnection();
            }

            @Override // com.android.installreferrer.api.InstallReferrerStateListener
            public void onInstallReferrerSetupFinished(final int i10) {
                new Thread(new LogSafeRunnable() { // from class: io.bidmachine.l4
                    @Override // io.bidmachine.internal.utils.LogSafeRunnable, io.bidmachine.utils.SafeRunnable
                    public final void onRun() throws Throwable {
                        this.f59757b.lambda$onInstallReferrerSetupFinished$0(i10);
                    }
                }).start();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public long getInstallTimeMs(@NonNull InstallReferrerClient installReferrerClient) {
            try {
                long installBeginTimestampSeconds = installReferrerClient.getInstallReferrer().getInstallBeginTimestampSeconds();
                if (installBeginTimestampSeconds != 0) {
                    return installBeginTimestampSeconds * 1000;
                }
            } catch (Exception e10) {
                Logger.w(e10);
            }
            return 0L;
        }

        public void retrieve() {
            try {
                this.client.startConnection(new a());
            } catch (Throwable th2) {
                Logger.w(th2);
            }
        }

        public b(@NonNull Context context) {
            this.client = InstallReferrerClient.newBuilder(context).build();
        }
    }

    public static long getInstallTimeMs() {
        return INSTALL_TIME_MS.get();
    }

    @WorkerThread
    public static void initialize(@NonNull final Context context) {
        new Thread(new LogSafeRunnable() { // from class: io.bidmachine.j4
            @Override // io.bidmachine.internal.utils.LogSafeRunnable, io.bidmachine.utils.SafeRunnable
            public final void onRun() throws Throwable {
                k4.lambda$initialize$0(context);
            }
        }).start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$initialize$0(Context context) throws Throwable {
        new b(context).retrieve();
    }
}
