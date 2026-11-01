package io.bidmachine;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.explorestack.protobuf.openrtb.Response;
import io.bidmachine.core.Logger;
import io.bidmachine.core.NetworkRequest;
import io.bidmachine.utils.BMError;
import io.bidmachine.utils.Tag;
import java.lang.ref.WeakReference;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: AdResponseLoader.java */
/* JADX INFO: loaded from: classes8.dex */
public class s0 {
    private b callback;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    private final String f60956id;
    private a listener;
    private final Tag tag;

    /* JADX INFO: compiled from: AdResponseLoader.java */
    public interface a {
        void onCancel();

        void onFail(@Nullable BMError bMError);

        void onSuccess(@NonNull u uVar);
    }

    /* JADX INFO: compiled from: AdResponseLoader.java */
    public static class b implements NetworkRequest.Callback<Response, BMError>, NetworkRequest.CancelCallback {

        @NonNull
        private final AdRequestParameters adRequestParameters;

        /* JADX INFO: renamed from: id, reason: collision with root package name */
        @NonNull
        private final String f60957id;

        @NonNull
        private final NetworkAdUnitManager networkAdUnitManager;

        @NonNull
        private final String url;

        @NonNull
        private final WeakReference<a> weakListener;

        @NonNull
        private final AtomicBoolean isSent = new AtomicBoolean(false);

        @NonNull
        private final AtomicBoolean isCleared = new AtomicBoolean(false);

        /* JADX INFO: compiled from: AdResponseLoader.java */
        public class a implements c5.a<u> {
            public a() {
            }

            @Override // io.bidmachine.c5.a
            public void onFail(@NonNull BMError bMError) {
                b.this.networkAdUnitManager.notifyNetworkAuctionResult(null);
                b.this.networkAdUnitManager.notifyNetworkClearAuction();
                b.this.sendFail(bMError);
            }

            @Override // io.bidmachine.c5.a
            public void onSuccess(@NonNull u uVar) {
                boolean zCantSend = b.this.cantSend();
                uVar.setStatus(zCantSend ? AdResponseStatus.Idle : AdResponseStatus.Busy);
                w0.get().store(uVar);
                if (zCantSend) {
                    uVar.release();
                } else {
                    b.this.networkAdUnitManager.notifyNetworkAuctionResult(uVar.getWinnerNetworkAdUnit());
                    b.this.sendSuccess(uVar);
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean cantSend() {
            return this.isCleared.get() || this.isSent.get() || this.weakListener.get() == null;
        }

        public void clear() {
            this.isCleared.set(true);
            this.weakListener.clear();
        }

        @Override // io.bidmachine.core.NetworkRequest.Callback
        public void onFail(@Nullable BMError bMError) {
            z4.get().remove(this.f60957id);
            this.networkAdUnitManager.notifyNetworkAuctionResult(null);
            this.networkAdUnitManager.notifyNetworkClearAuction();
            u uVarReceive = w0.get().receive(this.adRequestParameters);
            if (uVarReceive != null) {
                sendSuccess(uVarReceive);
            } else {
                sendFail(bMError);
            }
        }

        @Override // io.bidmachine.core.NetworkRequest.Callback
        public void onSuccess(@Nullable Response response) {
            z4.get().remove(this.f60957id);
            UrlProvider.setAuctionUrlFromSuccessRequest(this.url);
            c5.toAdResponse(this.adRequestParameters, this.networkAdUnitManager, response, new a());
        }

        public b(@NonNull String str, @NonNull String str2, @NonNull AdRequestParameters adRequestParameters, @NonNull NetworkAdUnitManager networkAdUnitManager, @NonNull a aVar) {
            this.f60957id = str;
            this.url = str2;
            this.adRequestParameters = adRequestParameters;
            this.networkAdUnitManager = networkAdUnitManager;
            this.weakListener = new WeakReference<>(aVar);
        }

        @Nullable
        private a prepareForSend() {
            if (cantSend()) {
                return null;
            }
            this.isSent.set(true);
            return this.weakListener.get();
        }

        private void sendCancel() {
            a aVarPrepareForSend = prepareForSend();
            if (aVarPrepareForSend != null) {
                aVarPrepareForSend.onCancel();
            }
            clear();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void sendFail(@Nullable BMError bMError) {
            a aVarPrepareForSend = prepareForSend();
            if (aVarPrepareForSend != null) {
                aVarPrepareForSend.onFail(bMError);
            }
            clear();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void sendSuccess(@NonNull u uVar) {
            a aVarPrepareForSend = prepareForSend();
            if (aVarPrepareForSend != null) {
                aVarPrepareForSend.onSuccess(uVar);
            } else {
                uVar.setStatus(AdResponseStatus.Idle);
            }
            clear();
        }

        @Override // io.bidmachine.core.NetworkRequest.CancelCallback
        public void onCanceled() {
            z4.get().remove(this.f60957id);
            this.networkAdUnitManager.notifyNetworkClearAuction();
            sendCancel();
        }
    }

    public s0() {
        this(UUID.randomUUID().toString());
    }

    public s0(@NonNull String str) {
        this.tag = new Tag("AdResponseLoader");
        this.f60956id = str;
    }

    public void cancel() {
        Logger.d(this.tag, "cancel");
        this.listener = null;
        b bVar = this.callback;
        if (bVar != null) {
            bVar.clear();
            this.callback = null;
        }
    }

    public String getId() {
        return this.f60956id;
    }

    public void load(@NonNull AdRequestParameters adRequestParameters, @NonNull NetworkAdUnitManager networkAdUnitManager, @NonNull ApiRequest.Builder<?, Response> builder, @NonNull a aVar) {
        Logger.d(this.tag, "load");
        b bVar = this.callback;
        if (bVar != null) {
            bVar.clear();
        }
        this.listener = aVar;
        b bVar2 = new b(this.f60956id, builder.getUrl(), adRequestParameters, networkAdUnitManager, aVar);
        this.callback = bVar2;
        builder.setCallback(bVar2);
        builder.setCancelCallback(this.callback);
        z4.get().add(this.f60956id, builder.request());
    }
}
