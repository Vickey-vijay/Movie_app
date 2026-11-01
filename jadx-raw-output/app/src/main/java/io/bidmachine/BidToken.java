package io.bidmachine;

import androidx.annotation.NonNull;
import io.bidmachine.utils.task.CancelableTask;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes10.dex */
public class BidToken implements ExpirationHandler.Listener {

    @NonNull
    private final AdRequest<?, ?, ?> adRequest;

    @NonNull
    private final ExpirationHandler expirationHandler;

    @NonNull
    private final ExpirationListener<BidToken> expirationListener;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    @NonNull
    private final String f58492id = UUID.randomUUID().toString();

    public static class b implements ExpirationHandler.TaskScheduler {
        private b() {
        }

        @Override // io.bidmachine.ExpirationHandler.TaskScheduler
        public void scheduleTask(@NonNull CancelableTask cancelableTask, long j10) {
            BidTokenTaskManager.schedule(cancelableTask, j10, TimeUnit.MILLISECONDS);
        }

        @Override // io.bidmachine.ExpirationHandler.TaskScheduler
        public void cancelTask(@NonNull CancelableTask cancelableTask) {
            BidTokenTaskManager.cancel(cancelableTask);
        }
    }

    public void destroyAdRequest() {
        this.adRequest.clearNetworkAdUnits();
        this.adRequest.destroy();
    }

    @NonNull
    public AdRequest<?, ?, ?> getAdRequest() {
        return this.adRequest;
    }

    @NonNull
    public String getId() {
        return this.f58492id;
    }

    @Override // io.bidmachine.ExpirationHandler.Listener
    public void onExpired() {
        this.expirationListener.onExpired(this);
    }

    public void startExpiration() {
        this.expirationHandler.start();
    }

    public void stopExpiration() {
        this.expirationHandler.stop();
    }

    public BidToken(@NonNull AdRequest<?, ?, ?> adRequest, int i10, @NonNull ExpirationListener<BidToken> expirationListener) {
        this.adRequest = adRequest;
        this.expirationHandler = new ExpirationHandler(TimeUnit.SECONDS.toMillis(i10), this, new b());
        this.expirationListener = expirationListener;
    }
}
