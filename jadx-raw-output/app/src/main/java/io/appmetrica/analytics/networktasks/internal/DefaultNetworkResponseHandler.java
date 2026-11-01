package io.appmetrica.analytics.networktasks.internal;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public class DefaultNetworkResponseHandler implements NetworkResponseHandler<DefaultResponseParser.Response> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final DefaultResponseParser f58260a;

    public DefaultNetworkResponseHandler() {
        this(new DefaultResponseParser());
    }

    public DefaultNetworkResponseHandler(DefaultResponseParser defaultResponseParser) {
        this.f58260a = defaultResponseParser;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // io.appmetrica.analytics.networktasks.internal.NetworkResponseHandler
    @Nullable
    public DefaultResponseParser.Response handle(@NonNull ResponseDataHolder responseDataHolder) {
        if (200 == responseDataHolder.getResponseCode()) {
            return this.f58260a.parse(responseDataHolder.getResponseData());
        }
        return null;
    }
}
