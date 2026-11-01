package com.bytedance.adsdk.vt.yu;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

/* JADX INFO: loaded from: classes10.dex */
public final class vt implements le {
    @Override // com.bytedance.adsdk.vt.yu.le
    public final yu ouw(String str) throws IOException {
        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
        httpURLConnection.setRequestMethod("GET");
        httpURLConnection.connect();
        return new ouw(httpURLConnection);
    }
}
