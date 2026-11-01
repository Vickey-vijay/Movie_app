package io.appmetrica.analytics.networktasks.internal;

import android.net.Uri;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes8.dex */
public class NetworkTaskForSendingDataParamsAppender {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final RequestBodyEncrypter f58289a;

    public void appendEncryptedData(@NonNull Uri.Builder builder) {
        if (this.f58289a.getEncryptionMode() == RequestBodyEncryptionMode.AES_RSA) {
            builder.appendQueryParameter(CommonUrlParts.ENCRYPTED_REQUEST, "1");
        }
    }

    public NetworkTaskForSendingDataParamsAppender(@NonNull RequestBodyEncrypter requestBodyEncrypter) {
        this.f58289a = requestBodyEncrypter;
    }
}
