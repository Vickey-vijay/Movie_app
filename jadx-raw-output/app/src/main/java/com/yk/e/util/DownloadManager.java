package com.yk.e.util;

import android.app.Activity;
import com.yk.e.inf.IDownloadManager;
import com.yk.e.object.MainParams;

/* JADX INFO: loaded from: classes5.dex */
public class DownloadManager implements IDownloadManager {
    @Override // com.yk.e.inf.IDownloadManager
    public void page(Activity activity, MainParams mainParams, String str) {
        CurUtil.adClick(activity, !mainParams.isUserWebUrl, mainParams.realClickUlr);
    }

    @Override // com.yk.e.inf.IDownloadManager
    public void get(Activity activity, MainParams mainParams, String str, String str2) {
        CoreUtils.openBrowser(activity, str2);
    }

    @Override // com.yk.e.inf.IDownloadManager
    public void start(Activity activity, String str) {
        CoreUtils.openBrowser(activity, str);
    }
}
