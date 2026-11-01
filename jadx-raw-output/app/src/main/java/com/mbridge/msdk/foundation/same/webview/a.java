package com.mbridge.msdk.foundation.same.webview;

import android.webkit.DownloadListener;
import com.mbridge.msdk.foundation.entity.CampaignEx;

/* JADX INFO: compiled from: MBDownloadListener.java */
/* JADX INFO: loaded from: classes2.dex */
public class a implements DownloadListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f35211a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private CampaignEx f35212b;

    @Override // android.webkit.DownloadListener
    public void onDownloadStart(String str, String str2, String str3, String str4, long j10) {
    }

    public void a(String str) {
        this.f35211a = str;
    }

    public a(CampaignEx campaignEx) {
        this.f35212b = campaignEx;
    }
}
