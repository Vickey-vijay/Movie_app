package sg.bigo.ads.core.player.a;

import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.net.HttpURLConnection;
import java.net.URL;

/* JADX INFO: loaded from: classes2.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public HttpURLConnection f71785a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public InputStream f71786b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f71787c;

    public g(String str) {
        this.f71787c = str;
    }

    public final int a(byte[] bArr) {
        StringBuilder sb2;
        String str;
        InputStream inputStream = this.f71786b;
        if (inputStream == null) {
            sg.bigo.ads.common.t.a.a(0, "ProxyCache", "Error reading data from " + this.f71787c + ": connection is absent!");
            return 0;
        }
        try {
            return inputStream.read(bArr, 0, bArr.length);
        } catch (InterruptedIOException e10) {
            e = e10;
            sb2 = new StringBuilder("Reading source ");
            sb2.append(this.f71787c);
            str = " is interrupted, error message is : ";
            sb2.append(str);
            sb2.append(e.toString());
            sg.bigo.ads.common.t.a.a(0, "ProxyCache", sb2.toString());
            return 0;
        } catch (IOException e11) {
            e = e11;
            sb2 = new StringBuilder("Error reading data from ");
            sb2.append(this.f71787c);
            str = ", error message is : ";
            sb2.append(str);
            sb2.append(e.toString());
            sg.bigo.ads.common.t.a.a(0, "ProxyCache", sb2.toString());
            return 0;
        }
    }

    public final void a() {
        HttpURLConnection httpURLConnection = this.f71785a;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (ArrayIndexOutOfBoundsException e10) {
                sg.bigo.ads.common.t.a.a(0, "ProxyCache", "Error closing connection correctly, the error message is : " + e10.toString());
            } catch (IllegalArgumentException e11) {
                e = e11;
                sg.bigo.ads.common.t.a.a(0, "ProxyCache", "connection disconnect error..., the error message is : " + e.toString());
            } catch (NullPointerException e12) {
                e = e12;
                sg.bigo.ads.common.t.a.a(0, "ProxyCache", "connection disconnect error..., the error message is : " + e.toString());
            }
        }
    }

    public final HttpURLConnection b() {
        String headerField = this.f71787c;
        HttpURLConnection httpURLConnection = null;
        int i10 = 0;
        while (true) {
            try {
                sg.bigo.ads.common.t.a.a(0, 3, "ProxyCache", "Open connection  to " + headerField);
                HttpURLConnection httpURLConnection2 = (HttpURLConnection) new URL(headerField).openConnection();
                if (httpURLConnection2 == null) {
                    return httpURLConnection2;
                }
                try {
                    int responseCode = httpURLConnection2.getResponseCode();
                    boolean z10 = responseCode == 301 || responseCode == 302 || responseCode == 303;
                    if (z10) {
                        headerField = httpURLConnection2.getHeaderField("Location");
                        i10++;
                        httpURLConnection2.disconnect();
                    }
                    if (i10 > 5) {
                        sg.bigo.ads.common.t.a.a(0, "ProxyCache", "Too many redirects: ".concat(String.valueOf(i10)));
                    }
                    if (!z10) {
                        return httpURLConnection2;
                    }
                    httpURLConnection = httpURLConnection2;
                } catch (IOException e10) {
                    e = e10;
                    httpURLConnection = httpURLConnection2;
                    sg.bigo.ads.common.t.a.a(0, "ProxyCache", "PingHttpUrlSource#openConnection, error message is : " + e.toString());
                    return httpURLConnection;
                }
            } catch (IOException e11) {
                e = e11;
            }
        }
    }
}
