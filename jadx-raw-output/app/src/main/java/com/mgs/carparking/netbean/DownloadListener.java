package com.mgs.carparking.netbean;

/* JADX INFO: compiled from: DownloadListener.kt */
/* JADX INFO: loaded from: classes10.dex */
public interface DownloadListener {
    long getLength();

    String getLocalPath();

    String getUrl();

    void onCanceled();

    void onFailed();

    void onPaused();

    void onSuccess();

    void setLength(long j10);

    void setProgress(int i10);
}
