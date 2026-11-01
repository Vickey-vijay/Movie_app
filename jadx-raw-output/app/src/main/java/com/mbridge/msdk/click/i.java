package com.mbridge.msdk.click;

import android.text.TextUtils;
import android.webkit.URLUtil;
import com.ironsource.Z7;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.same.net.MBridgeHostnameVerifier;
import com.mbridge.msdk.foundation.tools.m0;
import com.mbridge.msdk.foundation.tools.q0;
import com.safedk.android.internal.partials.MintegralNetworkBridge;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.zip.GZIPInputStream;
import javax.net.ssl.HttpsURLConnection;

/* JADX INFO: compiled from: JavaHttpSpider.java */
/* JADX INFO: loaded from: classes9.dex */
public class i {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final String f32831f = "i";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private com.mbridge.msdk.setting.g f32832a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f32833b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f32834c = true;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f32835d = 3145728;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private com.mbridge.msdk.click.entity.a f32836e;

    public com.mbridge.msdk.click.entity.a a(String str, boolean z10, boolean z11, CampaignEx campaignEx) {
        int i10;
        HttpsURLConnection httpsURLConnection = null;
        if (!URLUtil.isNetworkUrl(str)) {
            return null;
        }
        String strReplace = str.replace(Z7.f27998r, "%20");
        this.f32836e = new com.mbridge.msdk.click.entity.a();
        try {
            HttpsURLConnection httpsURLConnection2 = (HttpsURLConnection) new URL(strReplace).openConnection();
            try {
                httpsURLConnection2.setHostnameVerifier(new MBridgeHostnameVerifier(strReplace));
                httpsURLConnection2.setRequestMethod("GET");
                if ((!z10 && !z11) || campaignEx == null) {
                    httpsURLConnection2.setRequestProperty("User-Agent", m0.i());
                }
                if (z10 && campaignEx != null && campaignEx.getcUA() == 1) {
                    httpsURLConnection2.setRequestProperty("User-Agent", m0.i());
                }
                if (z11 && campaignEx != null && campaignEx.getImpUA() == 1) {
                    httpsURLConnection2.setRequestProperty("User-Agent", m0.i());
                }
                httpsURLConnection2.setRequestProperty("Accept-Encoding", "gzip");
                if (this.f32832a.J0() && !TextUtils.isEmpty(this.f32833b)) {
                    httpsURLConnection2.setRequestProperty("referer", this.f32833b);
                }
                httpsURLConnection2.setConnectTimeout(60000);
                httpsURLConnection2.setReadTimeout(60000);
                httpsURLConnection2.setInstanceFollowRedirects(false);
                httpsURLConnection2.connect();
                this.f32836e.f32809a = httpsURLConnection2.getHeaderField("Location");
                this.f32836e.f32812d = httpsURLConnection2.getHeaderField("Referer");
                this.f32836e.f32814f = MintegralNetworkBridge.httpUrlConnectionGetResponseCode(httpsURLConnection2);
                this.f32836e.f32810b = httpsURLConnection2.getContentType();
                this.f32836e.f32813e = httpsURLConnection2.getContentLength();
                this.f32836e.f32811c = httpsURLConnection2.getContentEncoding();
                boolean zEqualsIgnoreCase = "gzip".equalsIgnoreCase(this.f32836e.f32811c);
                com.mbridge.msdk.click.entity.a aVar = this.f32836e;
                if (aVar.f32814f == 200 && this.f32834c && (i10 = aVar.f32813e) > 0 && i10 < 3145728 && !TextUtils.isEmpty(strReplace)) {
                    try {
                        String strA = a(MintegralNetworkBridge.urlConnectionGetInputStream(httpsURLConnection2), zEqualsIgnoreCase);
                        if (!TextUtils.isEmpty(strA)) {
                            byte[] bytes = strA.getBytes();
                            if (bytes.length > 0 && bytes.length < 3145728) {
                                this.f32836e.f32815g = strA.trim();
                            }
                        }
                    } catch (Throwable th2) {
                        q0.b(f32831f, th2.getMessage());
                    }
                }
                this.f32833b = strReplace;
                MintegralNetworkBridge.httpUrlConnectionDisconnect(httpsURLConnection2);
                return this.f32836e;
            } catch (Throwable th3) {
                th = th3;
                httpsURLConnection = httpsURLConnection2;
                try {
                    this.f32836e.f32816h = th.getMessage();
                    return this.f32836e;
                } finally {
                    if (httpsURLConnection != null) {
                        MintegralNetworkBridge.httpUrlConnectionDisconnect(httpsURLConnection);
                    }
                }
            }
        } catch (Throwable th4) {
            th = th4;
        }
    }

    public i() {
        com.mbridge.msdk.setting.g gVarD = com.mbridge.msdk.setting.h.b().d(com.mbridge.msdk.foundation.controller.c.n().b());
        this.f32832a = gVarD;
        if (gVarD == null) {
            this.f32832a = com.mbridge.msdk.setting.h.b().a();
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0034 A[Catch: all -> 0x002d, TryCatch #5 {all -> 0x002d, blocks: (B:4:0x0008, B:5:0x000e, B:21:0x0030, B:23:0x0034, B:24:0x0041), top: B:38:0x0008 }] */
    /* JADX WARN: Code duplicated, block: B:26:0x004c A[Catch: Exception -> 0x0026, TRY_ENTER, TRY_LEAVE, TryCatch #3 {Exception -> 0x0026, blocks: (B:10:0x0022, B:26:0x004c), top: B:41:0x0006 }] */
    /* JADX WARN: Code duplicated, block: B:43:0x0061 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    private String a(InputStream inputStream, boolean z10) throws Throwable {
        BufferedReader bufferedReader;
        Throwable th2;
        Exception e10;
        StringBuilder sb2 = new StringBuilder();
        BufferedReader bufferedReader2 = null;
        try {
            if (z10) {
                try {
                    try {
                        inputStream = new GZIPInputStream(inputStream);
                    } catch (Exception e11) {
                        e10 = e11;
                        if (this.f32836e == null) {
                            com.mbridge.msdk.click.entity.a aVar = new com.mbridge.msdk.click.entity.a();
                            this.f32836e = aVar;
                            aVar.f32816h = e10.getMessage();
                        }
                        q0.b(f32831f, e10.getMessage());
                        if (bufferedReader2 != null) {
                            bufferedReader2.close();
                        }
                        return sb2.toString();
                    }
                } catch (Throwable th3) {
                    th2 = th3;
                    bufferedReader = bufferedReader2;
                    if (bufferedReader != null) {
                        try {
                            bufferedReader.close();
                        } catch (Exception e12) {
                            q0.b(f32831f, e12.getMessage());
                        }
                    }
                    throw th2;
                }
            }
            bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
            while (true) {
                try {
                    String line = bufferedReader.readLine();
                    if (line == null) {
                        break;
                    }
                    sb2.append(line);
                } catch (Exception e13) {
                    e10 = e13;
                    bufferedReader2 = bufferedReader;
                    if (this.f32836e == null) {
                        com.mbridge.msdk.click.entity.a aVar2 = new com.mbridge.msdk.click.entity.a();
                        this.f32836e = aVar2;
                        aVar2.f32816h = e10.getMessage();
                    }
                    q0.b(f32831f, e10.getMessage());
                    if (bufferedReader2 != null) {
                        bufferedReader2.close();
                    }
                    return sb2.toString();
                } catch (Throwable th4) {
                    th2 = th4;
                    if (bufferedReader != null) {
                        bufferedReader.close();
                    }
                    throw th2;
                }
            }
            bufferedReader.close();
        } catch (Exception e14) {
            q0.b(f32831f, e14.getMessage());
        }
        return sb2.toString();
    }
}
