package com.mbridge.msdk.foundation.download.core;

import android.text.TextUtils;
import com.mbridge.msdk.foundation.download.DownloadMessage;
import com.mbridge.msdk.foundation.download.DownloadPriority;
import com.mbridge.msdk.foundation.download.OnDownloadStateListener;
import com.mbridge.msdk.foundation.download.OnProgressStateListener;
import com.mbridge.msdk.foundation.download.utils.Objects;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes9.dex */
public class DownloadRequestBuilder<T> implements RequestBuilder<T> {
    public long connectTimeout;
    public String directoryPathExternal;
    public String directoryPathInternal;
    public DownloadMessage<T> downloadMessage;
    public DownloadPriority downloadPriority = DownloadPriority.MEDIUM;
    public OnDownloadStateListener downloadStateListener;
    public Map<String, String> extraMap;
    public HashMap<String, List<String>> headerMap;
    public OnProgressStateListener progressStateListener;
    public long readTimeout;
    public int retry;
    public long timeout;
    public String userAgent;
    public long writeTimeout;

    @Override // com.mbridge.msdk.foundation.download.core.RequestBuilder
    public DownloadRequestBuilder<T> withConnectTimeout(long j10) {
        this.connectTimeout = j10;
        return this;
    }

    @Override // com.mbridge.msdk.foundation.download.core.RequestBuilder
    public RequestBuilder<T> withDirectoryPathExternal(String str) {
        this.directoryPathExternal = str;
        return this;
    }

    @Override // com.mbridge.msdk.foundation.download.core.RequestBuilder
    public RequestBuilder<T> withDirectoryPathInternal(String str) {
        this.directoryPathInternal = str;
        return this;
    }

    @Override // com.mbridge.msdk.foundation.download.core.RequestBuilder
    public RequestBuilder<T> withDownloadPriority(DownloadPriority downloadPriority) {
        this.downloadPriority = downloadPriority;
        return this;
    }

    @Override // com.mbridge.msdk.foundation.download.core.RequestBuilder
    public RequestBuilder<T> withDownloadStateListener(OnDownloadStateListener onDownloadStateListener) {
        this.downloadStateListener = onDownloadStateListener;
        return this;
    }

    @Override // com.mbridge.msdk.foundation.download.core.RequestBuilder
    public DownloadRequestBuilder<T> withHeader(String str, String str2) {
        if (this.headerMap == null) {
            this.headerMap = new HashMap<>(4);
        }
        List<String> arrayList = this.headerMap.get(str);
        if (arrayList == null) {
            arrayList = new ArrayList<>();
            this.headerMap.put(str, arrayList);
        }
        if (!arrayList.contains(str2)) {
            arrayList.add(str2);
        }
        return this;
    }

    @Override // com.mbridge.msdk.foundation.download.core.RequestBuilder
    public DownloadRequestBuilder<T> withHttpRetryCounter(int i10) {
        this.retry = i10;
        return this;
    }

    @Override // com.mbridge.msdk.foundation.download.core.RequestBuilder
    public RequestBuilder<T> withProgressStateListener(OnProgressStateListener onProgressStateListener) {
        this.progressStateListener = onProgressStateListener;
        return this;
    }

    @Override // com.mbridge.msdk.foundation.download.core.RequestBuilder
    public DownloadRequestBuilder<T> withReadTimeout(long j10) {
        this.readTimeout = j10;
        return this;
    }

    @Override // com.mbridge.msdk.foundation.download.core.RequestBuilder
    public RequestBuilder<T> withTimeout(long j10) {
        this.timeout = j10;
        return this;
    }

    @Override // com.mbridge.msdk.foundation.download.core.RequestBuilder
    public DownloadRequestBuilder<T> withUserAgent(String str) {
        this.userAgent = str;
        return this;
    }

    @Override // com.mbridge.msdk.foundation.download.core.RequestBuilder
    public RequestBuilder<T> withWriteTimeout(long j10) {
        this.writeTimeout = j10;
        return this;
    }

    public DownloadRequestBuilder(DownloadMessage<T> downloadMessage) {
        this.downloadMessage = downloadMessage;
    }

    @Override // com.mbridge.msdk.foundation.download.core.RequestBuilder
    public DownloadRequest<T> build() {
        return DownloadRequest.create(this);
    }

    @Override // com.mbridge.msdk.foundation.download.core.RequestBuilder
    public RequestBuilder<T> with(String str, String str2) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            if (Objects.isNull(this.extraMap)) {
                this.extraMap = new HashMap();
            }
            this.extraMap.put(str, str2);
        }
        return this;
    }
}
