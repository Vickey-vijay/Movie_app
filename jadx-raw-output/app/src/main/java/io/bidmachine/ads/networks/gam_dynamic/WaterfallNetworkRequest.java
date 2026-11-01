package io.bidmachine.ads.networks.gam_dynamic;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.unity3d.ads.gatewayclient.CommonGatewayClient;
import io.bidmachine.core.NetworkRequest;
import io.bidmachine.protobuf.Waterfall;
import io.bidmachine.utils.BMError;
import java.net.SocketTimeoutException;
import java.net.URLConnection;
import java.net.UnknownHostException;
import org.apache.http.conn.ConnectTimeoutException;

/* JADX INFO: loaded from: classes8.dex */
public class WaterfallNetworkRequest extends NetworkRequest<Waterfall.Result, Waterfall.Configuration, BMError> {
    private final int timeOut;

    @NonNull
    private final String url;

    public interface Callback extends NetworkRequest.Callback<Waterfall.Configuration, BMError>, NetworkRequest.CancelCallback {
        @Override // io.bidmachine.core.NetworkRequest.CancelCallback
        /* synthetic */ void onCanceled();

        @Override // io.bidmachine.core.NetworkRequest.Callback
        /* synthetic */ void onFail(@Nullable BMError bMError);

        @Override // io.bidmachine.core.NetworkRequest.Callback
        /* synthetic */ void onSuccess(@Nullable Waterfall.Configuration configuration);
    }

    public static class b extends NetworkRequest.RequestDataBinder<Waterfall.Result, Waterfall.Configuration, BMError> {
        private b() {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // io.bidmachine.core.NetworkRequest.RequestDataBinder
        public Waterfall.Configuration createSuccessResult(NetworkRequest<Waterfall.Result, Waterfall.Configuration, BMError> networkRequest, URLConnection uRLConnection, byte[] bArr) throws Exception {
            return Waterfall.parseFrom(bArr).getResponse();
        }

        @Override // io.bidmachine.core.NetworkRequest.RequestDataBinder
        @Nullable
        public byte[] obtainData(NetworkRequest<Waterfall.Result, Waterfall.Configuration, BMError> networkRequest, URLConnection uRLConnection, @Nullable Waterfall.Result result) throws Exception {
            return Waterfall.newBuilder().setRequest(result).build().toByteArray();
        }

        @Override // io.bidmachine.core.NetworkRequest.RequestDataBinder
        public void prepareHeaders(NetworkRequest<Waterfall.Result, Waterfall.Configuration, BMError> networkRequest, URLConnection uRLConnection) {
            uRLConnection.setRequestProperty("Content-Type", CommonGatewayClient.HEADER_PROTOBUF);
        }
    }

    public WaterfallNetworkRequest(@NonNull String str, @NonNull Waterfall.Result result, int i10) {
        super(NetworkRequest.Method.Post, null, result);
        this.url = str;
        this.timeOut = i10;
        setDataBinder(new b());
    }

    @Override // io.bidmachine.core.NetworkRequest
    public String getBaseUrl() throws Exception {
        return this.url;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // io.bidmachine.core.NetworkRequest
    @NonNull
    public BMError obtainError(@Nullable URLConnection uRLConnection, int i10) {
        BMError bMErrorInternal;
        if (i10 >= 200 && i10 < 300) {
            return BMError.BMServerNoFill;
        }
        if (i10 >= 400 && i10 < 500) {
            bMErrorInternal = BMError.Request;
        } else if (i10 >= 500 && i10 < 600) {
            bMErrorInternal = BMError.Server;
        } else {
            bMErrorInternal = BMError.internal("Unknown server error");
        }
        return new BMError(bMErrorInternal, i10, "Server returned " + i10 + " code");
    }

    @Override // io.bidmachine.core.NetworkRequest
    public void prepareRequestParams(URLConnection uRLConnection) {
        super.prepareRequestParams(uRLConnection);
        uRLConnection.setConnectTimeout(this.timeOut);
        uRLConnection.setReadTimeout(this.timeOut);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // io.bidmachine.core.NetworkRequest
    @NonNull
    public BMError obtainError(@Nullable URLConnection uRLConnection, @Nullable Throwable th2) {
        if (th2 instanceof UnknownHostException) {
            return BMError.NoConnection;
        }
        if (!(th2 instanceof SocketTimeoutException) && !(th2 instanceof ConnectTimeoutException)) {
            return BMError.throwable("Unknown api request error", th2);
        }
        return BMError.TimeoutError;
    }
}
