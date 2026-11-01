package com.safedk.android.internal;

import android.support.annotation.NonNull;
import com.safedk.android.analytics.brandsafety.creatives.AdNetworkConfiguration;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.internal.partials.NetworkBridge;
import com.safedk.android.utils.Logger;
import com.safedk.android.utils.k;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public class f extends InputStream {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f44827a = "SafeDKInputStream";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f44828b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f44829c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f44830d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final InputStream f44831e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private Map<String, List<String>> f44835i;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private HttpURLConnection f44837k;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f44833g = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f44834h = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private ByteArrayOutputStream f44836j = new ByteArrayOutputStream();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final long f44832f = System.currentTimeMillis();

    public f(String str, String str2, InputStream inputStream, Map<String, List<String>> map, boolean z10) {
        this.f44829c = str;
        this.f44830d = str2;
        this.f44831e = inputStream;
        this.f44835i = map;
        this.f44828b = z10;
    }

    public void a(HttpURLConnection httpURLConnection) {
        this.f44837k = httpURLConnection;
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        if (this.f44831e != null) {
            int i10 = this.f44831e.read();
            if (i10 >= 0) {
                try {
                    this.f44836j.write(i10);
                    return i10;
                } catch (Throwable th2) {
                    try {
                        Logger.e(f44827a, th2.getMessage());
                        return i10;
                    } catch (Throwable th3) {
                        return i10;
                    }
                }
            }
            return i10;
        }
        return 0;
    }

    @Override // java.io.InputStream
    public int read(@NonNull byte[] b10) throws IOException {
        if (this.f44831e == null) {
            return 0;
        }
        int i10 = this.f44831e.read(b10);
        a(b10, 0, i10);
        return i10;
    }

    @Override // java.io.InputStream
    public int read(@NonNull byte[] b10, int off, int len) throws IOException {
        if (this.f44831e == null) {
            return 0;
        }
        int i10 = this.f44831e.read(b10, off, len);
        a(b10, off, i10);
        return i10;
    }

    @Override // java.io.InputStream
    public int available() throws IOException {
        if (this.f44831e != null) {
            return this.f44831e.available();
        }
        return 0;
    }

    @Override // java.io.InputStream
    public long skip(long n10) throws IOException {
        if (this.f44831e != null) {
            return this.f44831e.skip(n10);
        }
        return 0L;
    }

    @Override // java.io.InputStream
    public synchronized void reset() throws IOException {
        if (this.f44831e != null) {
            this.f44831e.reset();
        }
    }

    private int a(ByteArrayOutputStream byteArrayOutputStream) {
        if (byteArrayOutputStream != null) {
            return byteArrayOutputStream.size();
        }
        return 0;
    }

    private void b() {
        int i10;
        do {
            try {
                i10 = this.f44831e.read();
                if (i10 > 0) {
                    this.f44836j.write(i10);
                }
            } catch (Exception e10) {
                Logger.d(f44827a, "read all before close - exception= " + e10);
                return;
            }
        } while (i10 > 0);
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        try {
            if (this.f44831e != null) {
                b();
                int iA = a(this.f44836j);
                int iC = c(this.f44835i);
                if (iC == iA) {
                    Logger.d(f44827a, "closing the stream, " + this + ", with amount read: " + iA);
                    this.f44831e.close();
                } else if (iC > -1) {
                    Logger.d(f44827a, "Attempt to close the stream, " + this + ", before reading all of it has been made! amount read: " + iA + ", content size: " + iC + " sdk: " + this.f44829c);
                }
            }
        } catch (Throwable th2) {
            Logger.d(f44827a, "Exception closing input stream : " + th2.getMessage(), th2);
        } finally {
            a("sc");
        }
    }

    @Override // java.io.InputStream
    public boolean markSupported() {
        if (this.f44831e != null) {
            return this.f44831e.markSupported();
        }
        return false;
    }

    public void a() {
        if (!this.f44833g) {
            a("cd");
        }
    }

    private void a(byte[] bArr, int i10, int i11) {
        try {
            Logger.d(f44827a, "handle stream read started. " + this + ", off=" + i10 + ", res=" + i11);
            if (i11 > 0 && this.f44836j != null) {
                this.f44836j.write(bArr, i10, i11);
            }
            if (b(this.f44835i) && i11 == -1) {
                a("sr-lc");
            }
            if (this.f44828b && this.f44836j != null) {
                int iC = c(this.f44835i);
                int size = this.f44836j.size();
                if (iC > -1) {
                    Logger.d(f44827a, "handle stream read, " + this + ", header content size: " + iC + ", current buffer size: " + size);
                    if (iC == size) {
                        Logger.d(f44827a, "handle stream read, " + this + ", header content size == current buffer size, calling handleClose");
                        a("sr-cs");
                    }
                } else if (a(this.f44835i)) {
                    Logger.d(f44827a, "handle stream read, " + this + ", header content size is -1, read bytes: " + i11 + ", previous: " + this.f44834h);
                    if (i11 < this.f44834h) {
                        Logger.d(f44827a, "handle stream read, " + this + ", read bytes < previous read bytes, calling handleClose");
                        a("sr-rb");
                    }
                }
                this.f44834h = i11;
            }
        } catch (Throwable th2) {
            try {
                Logger.e(f44827a, th2.getMessage(), th2);
            } catch (Throwable th3) {
            }
        }
    }

    public void a(String str) {
        String string;
        try {
            if (!b(this.f44835i) && this.f44836j != null && this.f44836j.size() == 0) {
                Logger.d(f44827a, "handle close, " + this + ", streamData.size()=0, exiting.");
                return;
            }
            if (this.f44833g) {
                Logger.d(f44827a, "handle close, " + this + ", already closed, exiting.");
                return;
            }
            this.f44833g = true;
            com.safedk.android.analytics.brandsafety.creatives.a aVarI = CreativeInfoManager.i(this.f44829c);
            boolean zB = aVarI != null ? aVarI.b(AdNetworkConfiguration.SUPPORTS_GZIP_CONTENT) : false;
            Logger.d(f44827a, "handle close, " + this + ", sdk " + this.f44829c + " configuration item SUPPORTS_GZIP_CONTENT is " + zB);
            if (zB && a(this.f44835i)) {
                Logger.d(f44827a, "handle close, " + this + ", gzip content detected");
                string = com.safedk.android.utils.c.a(this.f44836j.toByteArray());
                k.b(f44827a, "handle close, gzipped content (" + (string != null ? string.length() : 0) + ") is " + string);
                if (string == null) {
                    Logger.d(f44827a, "handle close, " + this + ", failed to unzip content, exiting");
                    this.f44833g = false;
                    return;
                }
            } else {
                string = this.f44836j.toString();
            }
            boolean z10 = string == null || string.length() == 0;
            if (!this.f44829c.equals(com.safedk.android.utils.g.f44970p) || !z10) {
                String str2 = this.f44832f + ";" + str + ";" + (System.currentTimeMillis() - this.f44832f);
                Logger.d(f44827a, "handle close, " + this + ", calling onAdFetched, content size is " + string.length() + ", stream close data: (" + str2 + ")");
                CreativeInfoManager.a(this.f44829c, this.f44830d, string, this.f44835i, str2);
            } else {
                Logger.d(f44827a, "handle close, " + this + ", Fyber url with empty body, skipping");
            }
            this.f44836j = null;
            this.f44835i = null;
            if (this.f44837k != null) {
                NetworkBridge.disposeOfConnectionToStreamMapping(this.f44837k);
            }
        } catch (Throwable th2) {
            try {
                Logger.e(f44827a, th2.getMessage());
            } catch (Throwable th3) {
            }
        }
    }

    private static boolean a(Map<String, List<String>> map) {
        if (map == null) {
            return false;
        }
        List<String> list = map.get("Content-Encoding");
        Logger.d(f44827a, "get response content encoding: " + list);
        return list != null && list.contains("gzip");
    }

    private static boolean b(Map<String, List<String>> map) {
        if (map == null) {
            return false;
        }
        List<String> list = map.get("Transfer-Encoding");
        Logger.d(f44827a, "get response transfer encoding: " + list);
        return list != null && list.contains("chunked");
    }

    private static int c(Map<String, List<String>> map) {
        if (map != null) {
            Logger.d(f44827a, "get header content size, headers: " + map);
            List<String> list = map.get("Content-Length");
            Logger.d(f44827a, "get header content size: " + list);
            if (list != null) {
                return Integer.parseInt(list.get(0));
            }
        }
        return -1;
    }
}
