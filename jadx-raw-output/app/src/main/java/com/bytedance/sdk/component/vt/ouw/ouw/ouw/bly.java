package com.bytedance.sdk.component.vt.ouw.ouw.ouw;

import com.bytedance.sdk.component.vt.ouw.ko;
import com.safedk.android.internal.partials.PangleNetworkBridge;
import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;

/* JADX INFO: loaded from: classes11.dex */
public final class bly extends ko {
    public HttpURLConnection ouw;
    public InputStream vt;

    public bly(HttpURLConnection httpURLConnection) throws IOException {
        this.ouw = httpURLConnection;
        this.vt = new ra(PangleNetworkBridge.urlConnectionGetInputStream(httpURLConnection), httpURLConnection);
    }

    @Override // com.bytedance.sdk.component.vt.ouw.ko, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        try {
            this.vt.close();
            PangleNetworkBridge.httpUrlConnectionDisconnect(this.ouw);
        } catch (Exception unused) {
        }
    }

    @Override // com.bytedance.sdk.component.vt.ouw.ko
    public final com.bytedance.sdk.component.vt.ouw.bly fkw() {
        if (this.ouw.getContentType() != null) {
            return com.bytedance.sdk.component.vt.ouw.bly.ouw(this.ouw.getContentType());
        }
        return null;
    }

    @Override // com.bytedance.sdk.component.vt.ouw.ko
    public final InputStream lh() {
        return this.vt;
    }

    @Override // com.bytedance.sdk.component.vt.ouw.ko
    public final long ouw() {
        try {
            return this.ouw.getContentLength();
        } catch (Exception unused) {
            return 0L;
        }
    }

    @Override // com.bytedance.sdk.component.vt.ouw.ko
    public final String vt() {
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(this.vt));
            StringBuffer stringBuffer = new StringBuffer();
            while (true) {
                String line = bufferedReader.readLine();
                if (line == null) {
                    String string = stringBuffer.toString();
                    close();
                    return string;
                }
                stringBuffer.append(line + "\n");
            }
        } catch (Exception unused) {
            return "";
        }
    }

    @Override // com.bytedance.sdk.component.vt.ouw.ko
    public final byte[] yu() {
        try {
            byte[] bArr = new byte[1024];
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            while (true) {
                int i10 = this.vt.read(bArr);
                if (i10 == -1) {
                    return byteArrayOutputStream.toByteArray();
                }
                byteArrayOutputStream.write(bArr, 0, i10);
            }
        } catch (Exception unused) {
            return new byte[0];
        }
    }

    public bly(HttpURLConnection httpURLConnection, InputStream inputStream) {
        this.ouw = httpURLConnection;
        this.vt = new ra(inputStream, httpURLConnection);
    }
}
