package com.mgs.carparking.netbean;

import ck.p;

/* JADX INFO: compiled from: DownloadInfoEntry.kt */
/* JADX INFO: loaded from: classes10.dex */
public final class DownloadInfoEntry implements Comparable<DownloadInfoEntry> {
    private int download_percent;
    private long download_rate;
    private long download_size;
    private int download_status;
    private String download_time;
    private int downloading;
    private String resource;

    @Override // java.lang.Comparable
    public int compareTo(DownloadInfoEntry downloadInfoEntry) {
        p.j(downloadInfoEntry, "o");
        String str = this.download_time;
        p.g(str);
        String str2 = downloadInfoEntry.download_time;
        p.g(str2);
        return str.compareTo(str2);
    }

    public final int getDownload_percent() {
        return this.download_percent;
    }

    public final long getDownload_rate() {
        return this.download_rate;
    }

    public final long getDownload_size() {
        return this.download_size;
    }

    public final int getDownload_status() {
        return this.download_status;
    }

    public final String getDownload_time() {
        return this.download_time;
    }

    public final int getDownloading() {
        return this.downloading;
    }

    public final String getResource() {
        return this.resource;
    }

    public final void setDownload_percent(int i10) {
        this.download_percent = i10;
    }

    public final void setDownload_rate(long j10) {
        this.download_rate = j10;
    }

    public final void setDownload_size(long j10) {
        this.download_size = j10;
    }

    public final void setDownload_status(int i10) {
        this.download_status = i10;
    }

    public final void setDownload_time(String str) {
        this.download_time = str;
    }

    public final void setDownloading(int i10) {
        this.downloading = i10;
    }

    public final void setResource(String str) {
        this.resource = str;
    }
}
