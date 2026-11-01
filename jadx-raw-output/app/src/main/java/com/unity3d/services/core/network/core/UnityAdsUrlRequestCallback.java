package com.unity3d.services.core.network.core;

import ck.i;
import ck.p;
import com.vungle.ads.internal.ui.AdActivity;
import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.Channels;
import java.nio.channels.WritableByteChannel;
import kotlin.Result;
import kotlin.c;
import mj.r;
import org.chromium.net.UrlRequest;
import org.chromium.net.UrlResponseInfo;

/* JADX INFO: compiled from: UnityAdsUrlRequestCallback.kt */
/* JADX INFO: loaded from: classes4.dex */
public abstract class UnityAdsUrlRequestCallback extends UrlRequest.Callback {
    private static final int BYTE_BUFFER_CAPACITY_BYTES = 16384;
    public static final Companion Companion = new Companion(null);
    private final ByteArrayOutputStream bytesReceived;
    private final WritableByteChannel receiveChannel;

    /* JADX INFO: compiled from: UnityAdsUrlRequestCallback.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(i iVar) {
            this();
        }
    }

    public abstract void onSucceeded(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo, byte[] bArr);

    @Override // org.chromium.net.UrlRequest.Callback
    public void onReadCompleted(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo, ByteBuffer byteBuffer) {
        Object objM3458constructorimpl;
        p.j(urlRequest, AdActivity.REQUEST_KEY_EXTRA);
        p.j(urlResponseInfo, "info");
        p.j(byteBuffer, "byteBuffer");
        byteBuffer.flip();
        try {
            Result.a aVar = Result.Companion;
            this.receiveChannel.write(byteBuffer);
            byteBuffer.clear();
            urlRequest.read(byteBuffer);
            objM3458constructorimpl = Result.m3458constructorimpl(r.f64562a);
        } catch (Throwable th2) {
            Result.a aVar2 = Result.Companion;
            objM3458constructorimpl = Result.m3458constructorimpl(c.a(th2));
        }
        if (Result.m3461exceptionOrNullimpl(objM3458constructorimpl) != null) {
            urlRequest.cancel();
            onFailed(urlRequest, urlResponseInfo, null);
        }
    }

    @Override // org.chromium.net.UrlRequest.Callback
    public void onRedirectReceived(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo, String str) {
        p.j(urlRequest, AdActivity.REQUEST_KEY_EXTRA);
        urlRequest.followRedirect();
    }

    @Override // org.chromium.net.UrlRequest.Callback
    public final void onResponseStarted(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo) {
        p.j(urlRequest, AdActivity.REQUEST_KEY_EXTRA);
        p.j(urlResponseInfo, "info");
        urlRequest.read(ByteBuffer.allocateDirect(16384));
    }

    @Override // org.chromium.net.UrlRequest.Callback
    public final void onSucceeded(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo) {
        Object objM3458constructorimpl;
        p.j(urlRequest, AdActivity.REQUEST_KEY_EXTRA);
        p.j(urlResponseInfo, "info");
        try {
            Result.a aVar = Result.Companion;
            objM3458constructorimpl = Result.m3458constructorimpl(this.bytesReceived.toByteArray());
        } catch (Throwable th2) {
            Result.a aVar2 = Result.Companion;
            objM3458constructorimpl = Result.m3458constructorimpl(c.a(th2));
        }
        if (Result.m3464isSuccessimpl(objM3458constructorimpl)) {
            byte[] bArr = (byte[]) objM3458constructorimpl;
            p.i(bArr, "bodyBytes");
            onSucceeded(urlRequest, urlResponseInfo, bArr);
        }
        if (Result.m3461exceptionOrNullimpl(objM3458constructorimpl) != null) {
            onFailed(urlRequest, urlResponseInfo, null);
        }
    }

    public UnityAdsUrlRequestCallback() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        this.bytesReceived = byteArrayOutputStream;
        this.receiveChannel = Channels.newChannel(byteArrayOutputStream);
    }
}
