package io.bidmachine;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.annotation.WorkerThread;
import io.bidmachine.protobuf.InitResponse;
import io.bidmachine.utils.BMError;
import java.util.Objects;

/* JADX INFO: compiled from: InitialRequestLoader.java */
/* JADX INFO: loaded from: classes8.dex */
public final class g4 {

    @NonNull
    private final Context context;

    @NonNull
    private final d listener;

    @Nullable
    @VisibleForTesting
    public e4 request;

    @NonNull
    @VisibleForTesting
    public e4.c requestListener;

    @NonNull
    private final Object requestLock;

    @NonNull
    private final String sellerId;

    @NonNull
    @VisibleForTesting
    public final SessionManager.a sessionObserver;

    /* JADX INFO: compiled from: InitialRequestLoader.java */
    public static class b {

        @NonNull
        private final InitResponse response;

        @NonNull
        private final String sessionId;

        @NonNull
        public InitResponse getResponse() {
            return this.response;
        }

        @NonNull
        public String getSessionId() {
            return this.sessionId;
        }

        public b(@NonNull InitResponse initResponse, @NonNull String str) {
            this.response = initResponse;
            this.sessionId = str;
        }
    }

    /* JADX INFO: compiled from: InitialRequestLoader.java */
    public class c implements e4.c {

        @NonNull
        private final String sessionId;

        public c(String str) {
            this.sessionId = str;
        }

        @Override // io.bidmachine.e4.c, io.bidmachine.core.NetworkRequest.Callback
        public void onFail(@Nullable BMError bMError) {
            g4 g4Var = g4.this;
            final d dVar = g4Var.listener;
            Objects.requireNonNull(dVar);
            g4Var.loadStored(new Executable() { // from class: io.bidmachine.h4
                @Override // io.bidmachine.Executable
                public final void execute(Object obj) {
                    dVar.onLoadFromRemoteFailed((g4.b) obj);
                }
            });
        }

        @Override // io.bidmachine.e4.c, io.bidmachine.core.NetworkRequest.Callback
        public void onSuccess(@Nullable InitResponse initResponse) {
            g4.this.destroyRequest();
            if (initResponse == null) {
                return;
            }
            o2.storeInitResponse(g4.this.context, initResponse, this.sessionId);
            g4.this.listener.onLoadFromRemoteSuccess(new b(initResponse, this.sessionId));
        }
    }

    /* JADX INFO: compiled from: InitialRequestLoader.java */
    public interface d {
        void onLoadFromRemoteFailed(@NonNull b bVar);

        void onLoadFromRemoteSuccess(@NonNull b bVar);

        void onLoadFromStoreSuccess(@NonNull b bVar);
    }

    /* JADX INFO: compiled from: InitialRequestLoader.java */
    public class e implements SessionManager.a {
        private e() {
        }

        @Override // io.bidmachine.SessionManager.a
        public void onSessionEvent(@NonNull SessionManager.Status status) {
            if (status != SessionManager.Status.START) {
                return;
            }
            g4.this.loadRemote();
        }
    }

    @WorkerThread
    public void loadStored() {
        final d dVar = this.listener;
        Objects.requireNonNull(dVar);
        loadStored(new Executable() { // from class: io.bidmachine.f4
            @Override // io.bidmachine.Executable
            public final void execute(Object obj) {
                dVar.onLoadFromStoreSuccess((g4.b) obj);
            }
        });
    }

    @NonNull
    @VisibleForTesting
    public e4 createRequest() {
        return new e4(this.context, this.sellerId, UrlProvider.getInitUrlQueue());
    }

    @VisibleForTesting
    public void destroyRequest() {
        synchronized (this.requestLock) {
            e4 e4Var = this.request;
            if (e4Var == null) {
                return;
            }
            e4Var.destroy();
            this.request = null;
        }
    }

    @WorkerThread
    public void loadRemote() {
        synchronized (this.requestLock) {
            destroyRequest();
            e4 e4VarCreateRequest = createRequest();
            this.request = e4VarCreateRequest;
            e4VarCreateRequest.setListener(this.requestListener);
            this.request.request();
        }
    }

    @VisibleForTesting
    public void loadStored(@NonNull Executable<b> executable) {
        InitResponse initResponse = o2.getInitResponse(this.context);
        String initResponseSessionId = o2.getInitResponseSessionId(this.context);
        if (initResponse != null) {
            executable.execute(new b(initResponse, initResponseSessionId));
        }
    }

    public g4(@NonNull Context context, @NonNull String str, @NonNull d dVar) {
        e eVar = new e();
        this.sessionObserver = eVar;
        this.request = null;
        this.requestLock = new Object();
        SessionManager sessionManager = SessionManager.get();
        this.context = context;
        this.sellerId = str;
        this.listener = dVar;
        this.requestListener = new c(sessionManager.getSessionId());
        sessionManager.addObserver(eVar);
    }
}
