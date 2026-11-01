package com.bytedance.sdk.component.fkw.vt;

import android.util.Log;
import com.bytedance.sdk.component.fkw.fkw;
import com.bytedance.sdk.component.fkw.le;
import com.bytedance.sdk.component.utils.tlj;
import com.safedk.android.internal.partials.PangleNetworkBridge;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class ouw implements com.bytedance.sdk.component.fkw.yu<lh> {
    @Override // com.bytedance.sdk.component.fkw.yu
    public final /* synthetic */ le ouw(fkw fkwVar) {
        return vt(fkwVar);
    }

    private static Map<String, String> ouw(HttpURLConnection httpURLConnection) {
        HashMap map = new HashMap();
        Map<String, List<String>> headerFields = httpURLConnection.getHeaderFields();
        for (String str : headerFields.keySet()) {
            List<String> list = headerFields.get(str);
            if (list != null && list.size() > 0) {
                map.put(str, list.get(0));
            }
        }
        return map;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v9, types: [java.io.ByteArrayOutputStream, java.io.Closeable] */
    private static lh<byte[]> vt(fkw fkwVar) throws Throwable {
        InputStream inputStreamUrlConnectionGetInputStream;
        byte[] byteArray;
        ?? byteArrayOutputStream;
        String message;
        ?? r10;
        int i10 = 0;
        InputStream inputStream = null;
        Map<String, String> mapOuw = null;
        try {
            try {
                HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(fkwVar.ouw()).openConnection();
                httpURLConnection.setRequestMethod("GET");
                httpURLConnection.setConnectTimeout(5000);
                httpURLConnection.setReadTimeout(5000);
                httpURLConnection.connect();
                inputStreamUrlConnectionGetInputStream = PangleNetworkBridge.urlConnectionGetInputStream(httpURLConnection);
                try {
                    byte[] bArr = new byte[1024];
                    byteArrayOutputStream = new ByteArrayOutputStream();
                    try {
                        while (true) {
                            try {
                                int i11 = inputStreamUrlConnectionGetInputStream.read(bArr);
                                if (i11 == -1) {
                                    break;
                                }
                                byteArrayOutputStream.write(bArr, 0, i11);
                            } catch (MalformedURLException e10) {
                                e = e10;
                                byteArray = null;
                            } catch (IOException e11) {
                                e = e11;
                                byteArray = null;
                            }
                            Log.w("InternalHttpClient", "MalformedURLException:" + e.getMessage());
                            message = e.getMessage();
                            r10 = byteArrayOutputStream;
                            tlj.ouw(inputStreamUrlConnectionGetInputStream);
                            tlj.ouw(r10);
                            return new lh<>(i10, byteArray, message, mapOuw);
                        }
                        mapOuw = fkwVar.vt() ? ouw(httpURLConnection) : null;
                        tlj.ouw(inputStreamUrlConnectionGetInputStream);
                        tlj.ouw(byteArrayOutputStream);
                        message = "success";
                    } catch (MalformedURLException e12) {
                        e = e12;
                        Log.w("InternalHttpClient", "MalformedURLException:" + e.getMessage());
                        message = e.getMessage();
                        r10 = byteArrayOutputStream;
                        tlj.ouw(inputStreamUrlConnectionGetInputStream);
                        tlj.ouw(r10);
                    } catch (IOException e13) {
                        e = e13;
                        Log.w("InternalHttpClient", "IOException:" + e.getMessage());
                        message = e.getMessage();
                        r10 = byteArrayOutputStream;
                        tlj.ouw(inputStreamUrlConnectionGetInputStream);
                        tlj.ouw(r10);
                    }
                    i10 = 200;
                    byteArray = byteArrayOutputStream.toByteArray();
                } catch (MalformedURLException e14) {
                    e = e14;
                    byteArray = null;
                    byteArrayOutputStream = byteArray;
                } catch (IOException e15) {
                    e = e15;
                    byteArray = null;
                    byteArrayOutputStream = byteArray;
                    Log.w("InternalHttpClient", "IOException:" + e.getMessage());
                    message = e.getMessage();
                    r10 = byteArrayOutputStream;
                    tlj.ouw(inputStreamUrlConnectionGetInputStream);
                    tlj.ouw(r10);
                    return new lh<>(i10, byteArray, message, mapOuw);
                } catch (Throwable th2) {
                    th = th2;
                    inputStream = inputStreamUrlConnectionGetInputStream;
                    tlj.ouw(inputStream);
                    tlj.ouw(0);
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (MalformedURLException e16) {
            e = e16;
            inputStreamUrlConnectionGetInputStream = null;
            byteArray = null;
        } catch (IOException e17) {
            e = e17;
            inputStreamUrlConnectionGetInputStream = null;
            byteArray = null;
        } catch (Throwable th4) {
            th = th4;
            tlj.ouw(inputStream);
            tlj.ouw(0);
            throw th;
        }
        return new lh<>(i10, byteArray, message, mapOuw);
    }
}
