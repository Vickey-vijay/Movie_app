package com.squareup.picasso;

import android.net.NetworkInfo;
import java.io.IOException;
import okhttp3.CacheControl;
import okhttp3.Response;
import okhttp3.ResponseBody;

/* JADX INFO: loaded from: classes7.dex */
class NetworkRequestHandler extends RequestHandler {
    private static final String SCHEME_HTTP = "http";
    private static final String SCHEME_HTTPS = "https";
    private final Downloader downloader;
    private final Stats stats;

    public static final class ResponseException extends IOException {
        public final int code;
        public final int networkPolicy;

        public ResponseException(int i10, int i11) {
            super("HTTP " + i10);
            this.code = i10;
            this.networkPolicy = i11;
        }
    }

    @Override // com.squareup.picasso.RequestHandler
    public int getRetryCount() {
        return 2;
    }

    @Override // com.squareup.picasso.RequestHandler
    public boolean supportsReplay() {
        return true;
    }

    public static class ContentLengthException extends IOException {
        public ContentLengthException(String str) {
            super(str);
        }
    }

    private static okhttp3.Request createRequest(Request request, int i10) {
        CacheControl cacheControlBuild;
        if (i10 == 0) {
            cacheControlBuild = null;
        } else if (NetworkPolicy.isOfflineOnly(i10)) {
            cacheControlBuild = CacheControl.FORCE_CACHE;
        } else {
            CacheControl.Builder builder = new CacheControl.Builder();
            if (!NetworkPolicy.shouldReadFromDiskCache(i10)) {
                builder.noCache();
            }
            if (!NetworkPolicy.shouldWriteToDiskCache(i10)) {
                builder.noStore();
            }
            cacheControlBuild = builder.build();
        }
        okhttp3.Request.Builder builderUrl = new okhttp3.Request.Builder().url(request.uri.toString());
        if (cacheControlBuild != null) {
            builderUrl.cacheControl(cacheControlBuild);
        }
        return builderUrl.build();
    }

    @Override // com.squareup.picasso.RequestHandler
    public boolean canHandleRequest(Request request) {
        String scheme = request.uri.getScheme();
        return "http".equals(scheme) || "https".equals(scheme);
    }

    @Override // com.squareup.picasso.RequestHandler
    public boolean shouldRetry(boolean z10, NetworkInfo networkInfo) {
        return networkInfo == null || networkInfo.isConnected();
    }

    public NetworkRequestHandler(Downloader downloader, Stats stats) {
        this.downloader = downloader;
        this.stats = stats;
    }

    @Override // com.squareup.picasso.RequestHandler
    public RequestHandler.Result load(Request request, int i10) throws IOException {
        Picasso.LoadedFrom loadedFrom;
        Response responseLoad = this.downloader.load(createRequest(request, i10));
        ResponseBody responseBodyBody = responseLoad.body();
        if (responseLoad.isSuccessful()) {
            if (responseLoad.cacheResponse() == null) {
                loadedFrom = Picasso.LoadedFrom.NETWORK;
            } else {
                loadedFrom = Picasso.LoadedFrom.DISK;
            }
            if (loadedFrom == Picasso.LoadedFrom.DISK && responseBodyBody.contentLength() == 0) {
                responseBodyBody.close();
                throw new ContentLengthException("Received response with 0 content-length header.");
            }
            if (loadedFrom == Picasso.LoadedFrom.NETWORK && responseBodyBody.contentLength() > 0) {
                this.stats.dispatchDownloadFinished(responseBodyBody.contentLength());
            }
            return new RequestHandler.Result(responseBodyBody.source(), loadedFrom);
        }
        responseBodyBody.close();
        throw new ResponseException(responseLoad.code(), request.networkPolicy);
    }
}
