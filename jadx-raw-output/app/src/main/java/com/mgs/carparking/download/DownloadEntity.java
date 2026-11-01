package com.mgs.carparking.download;

import androidx.databinding.BaseObservable;
import androidx.databinding.Bindable;
import com.mbridge.msdk.foundation.download.database.DownloadModel;
import com.mgs.carparking.dbtable.SearchHistoryEntity;
import com.mgs.carparking.netbean.DownloadListener;
import r9.a;
import zl.b;
import zl.f;

/* JADX INFO: loaded from: classes5.dex */
@f(name = "download_history")
public class DownloadEntity extends BaseObservable implements DownloadListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @b(name = "url")
    public String f41054b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @b(name = DownloadModel.FILE_NAME)
    public String f41055c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @b(name = "origin_file_name")
    public String f41056d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @b(name = "length")
    public long f41057e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @b(name = "progress")
    public int f41058f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @b(name = "curr_position")
    public long f41059g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @b(name = "status")
    public int f41060h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @b(name = "file_type")
    public int f41061i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @b(name = SearchHistoryEntity.CREATE_TIME)
    public long f41062j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @b(name = "local_path")
    public String f41063k;

    @Override // com.mgs.carparking.netbean.DownloadListener
    public void onCanceled() {
        m(5);
    }

    @Override // com.mgs.carparking.netbean.DownloadListener
    public void onFailed() {
        m(2);
    }

    @Override // com.mgs.carparking.netbean.DownloadListener
    public void onPaused() {
        m(4);
    }

    @Override // com.mgs.carparking.netbean.DownloadListener
    public void onSuccess() {
        m(1);
    }

    public long d() {
        return this.f41062j;
    }

    @Bindable
    public long g() {
        return this.f41059g;
    }

    @Override // com.mgs.carparking.netbean.DownloadListener
    public long getLength() {
        return this.f41057e;
    }

    @Override // com.mgs.carparking.netbean.DownloadListener
    public String getLocalPath() {
        return this.f41063k;
    }

    @Override // com.mgs.carparking.netbean.DownloadListener
    public String getUrl() {
        return this.f41054b;
    }

    @Bindable
    public String h() {
        return this.f41055c;
    }

    public int i() {
        return this.f41061i;
    }

    public String j() {
        return this.f41056d;
    }

    @Bindable
    public int k() {
        return this.f41060h;
    }

    public void l(long j10) {
        this.f41059g = j10;
        notifyPropertyChanged(1);
    }

    public void m(int i10) {
        this.f41060h = i10;
        notifyPropertyChanged(5);
        a.a().b(this.f41054b, this.f41055c, i10, this.f41059g, this.f41057e);
    }

    @Override // com.mgs.carparking.netbean.DownloadListener
    public void setLength(long j10) {
        this.f41057e = j10;
    }

    @Override // com.mgs.carparking.netbean.DownloadListener
    public void setProgress(int i10) {
        this.f41058f = i10;
        notifyPropertyChanged(4);
        l((((long) i10) * this.f41057e) / 100);
    }

    public String toString() {
        return "DownloadEntity{fileName='" + this.f41055c + "'}";
    }
}
