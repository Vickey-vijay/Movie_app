package io.appmetrica.analytics.networktasks.internal;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.io.Compressor;
import io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider;
import io.appmetrica.analytics.coreutils.internal.time.TimeProvider;
import java.io.IOException;

/* JADX INFO: loaded from: classes9.dex */
public class SendingDataTaskHelper {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final RequestBodyEncrypter f58300a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Compressor f58301b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final TimeProvider f58302c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final RequestDataHolder f58303d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ResponseDataHolder f58304e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final NetworkResponseHandler f58305f;

    public SendingDataTaskHelper(@NonNull RequestBodyEncrypter requestBodyEncrypter, @NonNull Compressor compressor, @NonNull RequestDataHolder requestDataHolder, @NonNull ResponseDataHolder responseDataHolder, @NonNull NetworkResponseHandler<DefaultResponseParser.Response> networkResponseHandler) {
        this(requestBodyEncrypter, compressor, new SystemTimeProvider(), requestDataHolder, responseDataHolder, networkResponseHandler);
    }

    public boolean prepareAndSetPostData(@NonNull byte[] bArr) {
        byte[] bArrEncrypt;
        try {
            byte[] bArrCompress = this.f58301b.compress(bArr);
            if (bArrCompress == null || (bArrEncrypt = this.f58300a.encrypt(bArrCompress)) == null) {
                return false;
            }
            this.f58303d.setPostData(bArrEncrypt);
            return true;
        } catch (IOException unused) {
            return false;
        }
    }

    public SendingDataTaskHelper(@NonNull RequestBodyEncrypter requestBodyEncrypter, @NonNull Compressor compressor, @NonNull TimeProvider timeProvider, @NonNull RequestDataHolder requestDataHolder, @NonNull ResponseDataHolder responseDataHolder, @NonNull NetworkResponseHandler<DefaultResponseParser.Response> networkResponseHandler) {
        this.f58300a = requestBodyEncrypter;
        this.f58301b = compressor;
        this.f58302c = timeProvider;
        this.f58303d = requestDataHolder;
        this.f58304e = responseDataHolder;
        this.f58305f = networkResponseHandler;
    }

    public boolean isResponseValid() {
        DefaultResponseParser.Response response = (DefaultResponseParser.Response) this.f58305f.handle(this.f58304e);
        return response != null && "accepted".equals(response.mStatus);
    }

    public void onPerformRequest() {
        this.f58303d.applySendTime(this.f58302c.currentTimeMillis());
    }
}
