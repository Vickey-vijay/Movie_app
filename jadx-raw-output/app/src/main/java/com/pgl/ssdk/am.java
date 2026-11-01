package com.pgl.ssdk;

import android.content.Context;
import android.text.TextUtils;
import android.util.Pair;
import com.ironsource.Q6;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.URL;
import java.util.Locale;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public abstract class am {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static String f43226a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Context f43228c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f43229d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f43230e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private byte[] f43231f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private HttpURLConnection f43227b = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f43232g = -1;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private byte[] f43233h = null;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f43234i = 10000;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f43235j = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f43236k = 2;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f43237l = true;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private Runnable f43238m = new a();

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (am.this.c() || am.this.f43235j >= am.this.f43236k) {
                return;
            }
            am.c(am.this);
            ar.a(this);
        }
    }

    public static /* synthetic */ int c(am amVar) {
        int i10 = amVar.f43235j;
        amVar.f43235j = i10 + 1;
        return i10;
    }

    public abstract String a();

    public abstract void a(int i10, byte[] bArr);

    public static synchronized void a(String str) {
        if (!TextUtils.isEmpty(str) && !str.equals(f43226a)) {
            f43226a = str;
        }
    }

    private void b() {
        Object obj;
        if (this.f43227b == null) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            if (!TextUtils.isEmpty(f43226a)) {
                jSONObject.put("ipv6", f43226a);
            }
            if (!TextUtils.isEmpty(com.pgl.ssdk.ces.b.c())) {
                jSONObject.put(Q6.V0, com.pgl.ssdk.ces.b.c());
            }
            jSONObject.put("region", an.a());
            Pair<Integer, String> pairA = aq.a(jSONObject.toString());
            if (pairA == null || (obj = pairA.first) == null || pairA.second == null) {
                return;
            }
            this.f43227b.addRequestProperty("cypher", String.valueOf(obj));
            this.f43227b.addRequestProperty("transfer-param", (String) pairA.second);
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:32:0x00b6 A[Catch: all -> 0x00ca, PHI: r0
  0x00b6: PHI (r0v14 java.io.InputStream) = (r0v13 java.io.InputStream), (r0v20 java.io.InputStream) binds: [B:30:0x00b3, B:27:0x00af] A[DONT_GENERATE, DONT_INLINE], TRY_ENTER, TryCatch #2 {all -> 0x00ca, blocks: (B:3:0x0004, B:5:0x0010, B:10:0x001f, B:12:0x0038, B:14:0x0040, B:15:0x0044, B:17:0x004d, B:19:0x0060, B:21:0x007d, B:23:0x0080, B:24:0x0096, B:33:0x00b9, B:32:0x00b6, B:18:0x0058), top: B:48:0x0004 }] */
    public boolean c() {
        InputStream inputStream;
        try {
            String strA = an.a(this.f43228c);
            if (TextUtils.isEmpty(strA)) {
                an.b(this.f43228c);
                HttpURLConnection httpURLConnection = this.f43227b;
                if (httpURLConnection != null) {
                    httpURLConnection.disconnect();
                    this.f43227b = null;
                }
                return false;
            }
            String strConcat = strA + a();
            if (!strConcat.startsWith("https://") && !strConcat.startsWith("http://")) {
                strConcat = "https://".concat(strConcat);
            }
            URL url = new URL(strConcat);
            if (this.f43237l) {
                this.f43227b = (HttpURLConnection) url.openConnection(Proxy.NO_PROXY);
            } else {
                this.f43227b = (HttpURLConnection) url.openConnection();
            }
            this.f43227b.setConnectTimeout(this.f43234i);
            this.f43227b.setReadTimeout(this.f43234i);
            a(this.f43229d);
            b(this.f43230e);
            byte[] bArr = this.f43231f;
            if (bArr != null && bArr.length > 0) {
                this.f43227b.setDoOutput(true);
                OutputStream outputStream = this.f43227b.getOutputStream();
                outputStream.write(this.f43231f);
                outputStream.flush();
                outputStream.close();
            }
            this.f43227b.connect();
            try {
                this.f43232g = this.f43227b.getResponseCode();
                inputStream = this.f43227b.getInputStream();
                try {
                    this.f43233h = a(inputStream);
                    if (inputStream != null) {
                        inputStream.close();
                    }
                } catch (Throwable unused) {
                    if (inputStream != null) {
                        inputStream.close();
                    }
                }
            } catch (Throwable unused2) {
                inputStream = null;
            }
            a(this.f43232g, this.f43233h);
            HttpURLConnection httpURLConnection2 = this.f43227b;
            if (httpURLConnection2 != null) {
                httpURLConnection2.disconnect();
                this.f43227b = null;
            }
            return true;
        } catch (Throwable unused3) {
            HttpURLConnection httpURLConnection3 = this.f43227b;
            if (httpURLConnection3 != null) {
                httpURLConnection3.disconnect();
                this.f43227b = null;
            }
            an.b(this.f43228c);
            return false;
        }
    }

    public am(Context context) {
        this.f43228c = context;
    }

    private void a(int i10) throws ProtocolException {
        String str;
        if (i10 == 1) {
            str = "POST";
        } else if (i10 == 3) {
            str = "PUT";
        } else if (i10 == 4) {
            str = "DELETE";
        } else if (i10 != 5) {
            str = i10 != 6 ? "GET" : "TRACE";
        } else {
            str = "HEAD";
        }
        this.f43227b.setRequestMethod(str);
    }

    private byte[] a(InputStream inputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[1024];
        while (true) {
            int i10 = inputStream.read(bArr, 0, 1024);
            if (i10 > 0) {
                byteArrayOutputStream.write(bArr, 0, i10);
            } else {
                return byteArrayOutputStream.toByteArray();
            }
        }
    }

    public void a(int i10, int i11, byte[] bArr) {
        b(i10, i11, bArr);
        ar.a(this.f43238m);
    }

    private void b(int i10) {
        String str;
        if (i10 != 1) {
            str = i10 != 2 ? "" : "application/octet-stream";
        } else {
            str = "application/json; charset=utf-8";
        }
        if (!str.isEmpty()) {
            this.f43227b.addRequestProperty("Content-Type", str);
        }
        String strB = an.b();
        if (strB != null) {
            this.f43227b.addRequestProperty("x-pangle-target-idc", strB);
        }
        b();
        try {
            String language = Locale.getDefault().getLanguage();
            if (language.equalsIgnoreCase("zh")) {
                this.f43227b.addRequestProperty("Accept-Language", Locale.getDefault().toString() + StringUtils.COMMA + language + ";q=0.9");
                return;
            }
            this.f43227b.addRequestProperty("Accept-Language", Locale.getDefault().toString() + StringUtils.COMMA + language + ";q=0.9,en-US;q=0.6,en;q=0.4");
        } catch (Throwable unused) {
        }
    }

    private void b(int i10, int i11, byte[] bArr) {
        this.f43229d = i10;
        this.f43230e = i11;
        this.f43231f = bArr;
    }
}
