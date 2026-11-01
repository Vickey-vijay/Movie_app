package com.ironsource;

import android.net.Uri;
import android.util.Log;
import android.util.Pair;
import com.safedk.android.internal.partials.IronSourceNetworkBridge;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.net.HttpURLConnection;
import java.net.ProtocolException;
import java.net.URL;
import java.security.InvalidParameterException;
import java.util.ArrayList;
import java.util.List;
import javax.net.ssl.SSLException;

/* JADX INFO: renamed from: com.ironsource.g8, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public class C3484g8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f28987a = "POST";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f28988b = "GET";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f28989c = "ISHttpService";

    /* JADX INFO: renamed from: com.ironsource.g8$a */
    public static class a {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private static final int f28990h = 15000;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private static final int f28991i = 15000;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private static final String f28992j = "UTF-8";

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f28993a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f28994b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f28995c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f28996d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f28997e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final String f28998f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public ArrayList<Pair<String, String>> f28999g;

        /* JADX INFO: renamed from: com.ironsource.g8$a$a, reason: collision with other inner class name */
        public static class C0268a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public String f29001b;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public String f29003d;

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public List<Pair<String, String>> f29000a = new ArrayList();

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public String f29002c = "POST";

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public int f29004e = 15000;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public int f29005f = 15000;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            public String f29006g = "UTF-8";

            public C0268a a(String str) {
                this.f29003d = str;
                return this;
            }

            public C0268a b(String str) {
                this.f29006g = str;
                return this;
            }

            public C0268a a(int i10) {
                this.f29004e = i10;
                return this;
            }

            public C0268a b(int i10) {
                this.f29005f = i10;
                return this;
            }

            public C0268a c(String str) {
                this.f29001b = str;
                return this;
            }

            public C0268a d(String str) {
                this.f29002c = str;
                return this;
            }

            public C0268a a(Pair<String, String> pair) {
                this.f29000a.add(pair);
                return this;
            }

            public C0268a a(List<Pair<String, String>> list) {
                this.f29000a.addAll(list);
                return this;
            }

            public a a() {
                return new a(this);
            }
        }

        public boolean a() {
            return "POST".equals(this.f28994b);
        }

        public a(C0268a c0268a) {
            this.f28993a = c0268a.f29001b;
            this.f28994b = c0268a.f29002c;
            this.f28995c = c0268a.f29003d;
            this.f28999g = new ArrayList<>(c0268a.f29000a);
            this.f28996d = c0268a.f29004e;
            this.f28997e = c0268a.f29005f;
            this.f28998f = c0268a.f29006g;
        }
    }

    public static Gd a(String str, String str2, List<Pair<String, String>> list) throws Exception {
        Uri uriBuild = Uri.parse(str).buildUpon().encodedQuery(str2).build();
        a.C0268a c0268a = new a.C0268a();
        c0268a.c(uriBuild.toString()).a(str2).d("GET").a(list);
        return b(c0268a.a());
    }

    public static Gd b(String str, String str2, List<Pair<String, String>> list) throws Exception {
        a.C0268a c0268a = new a.C0268a();
        c0268a.c(str).a(str2).d("POST").a(list);
        return b(c0268a.a());
    }

    /* JADX WARN: Not initialized variable reg: 4, insn: 0x00a0: MOVE (r8 I:??[OBJECT, ARRAY]) = (r4 I:??[OBJECT, ARRAY]), block:B:42:0x00a0 */
    public static Gd b(a aVar) throws Exception {
        HttpURLConnection httpURLConnectionA;
        InputStream inputStream;
        InputStream inputStream2;
        if (a(aVar.f28993a, aVar.f28995c)) {
            Gd gd2 = new Gd();
            InputStream inputStreamUrlConnectionGetInputStream = null;
            inputStreamUrlConnectionGetInputStream = null;
            inputStreamUrlConnectionGetInputStream = null;
            inputStreamUrlConnectionGetInputStream = null;
            inputStreamUrlConnectionGetInputStream = null;
            HttpURLConnection httpURLConnection = null;
            try {
                try {
                    httpURLConnectionA = a(aVar);
                    try {
                        a(httpURLConnectionA, aVar.f28999g);
                        a(httpURLConnectionA, aVar);
                        inputStreamUrlConnectionGetInputStream = IronSourceNetworkBridge.urlConnectionGetInputStream(httpURLConnectionA);
                        gd2.f26675a = IronSourceNetworkBridge.httpUrlConnectionGetResponseCode(httpURLConnectionA);
                        if (inputStreamUrlConnectionGetInputStream != null) {
                            gd2.f26676b = C3510hg.a(inputStreamUrlConnectionGetInputStream);
                        }
                        if (inputStreamUrlConnectionGetInputStream != null) {
                            inputStreamUrlConnectionGetInputStream.close();
                        }
                    } catch (InterruptedIOException e10) {
                        e = e10;
                        Log.d(f28989c, "Failed post to " + aVar.f28993a + " exception: " + e.getMessage());
                        throw e;
                    } catch (SSLException e11) {
                        e = e11;
                        Log.d(f28989c, "Failed post to " + aVar.f28993a + " exception: " + e.getMessage());
                        throw e;
                    } catch (IOException e12) {
                        e = e12;
                        inputStream = inputStreamUrlConnectionGetInputStream;
                        httpURLConnection = httpURLConnectionA;
                        C3676r4.d().a(e);
                        if (httpURLConnection != null && httpURLConnection.getHeaderFields().isEmpty()) {
                            throw new Fc(e);
                        }
                        if (httpURLConnection != null) {
                            int iHttpUrlConnectionGetResponseCode = IronSourceNetworkBridge.httpUrlConnectionGetResponseCode(httpURLConnection);
                            gd2.f26675a = iHttpUrlConnectionGetResponseCode;
                            if (iHttpUrlConnectionGetResponseCode >= 400) {
                                Log.d(f28989c, "Failed post to " + aVar.f28993a + " StatusCode: " + gd2.f26675a);
                                if (inputStream != null) {
                                    InputStream inputStream3 = inputStream;
                                    httpURLConnectionA = httpURLConnection;
                                    inputStreamUrlConnectionGetInputStream = inputStream3;
                                    inputStreamUrlConnectionGetInputStream.close();
                                } else {
                                    httpURLConnectionA = httpURLConnection;
                                }
                            }
                        }
                        throw e;
                    } catch (Throwable th2) {
                        th = th2;
                        if (inputStreamUrlConnectionGetInputStream != null) {
                            inputStreamUrlConnectionGetInputStream.close();
                        }
                        if (httpURLConnectionA != null) {
                            IronSourceNetworkBridge.httpUrlConnectionDisconnect(httpURLConnectionA);
                        }
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    httpURLConnectionA = null;
                    inputStreamUrlConnectionGetInputStream = inputStream2;
                }
            } catch (InterruptedIOException e13) {
                e = e13;
                Log.d(f28989c, "Failed post to " + aVar.f28993a + " exception: " + e.getMessage());
                throw e;
            } catch (SSLException e14) {
                e = e14;
                Log.d(f28989c, "Failed post to " + aVar.f28993a + " exception: " + e.getMessage());
                throw e;
            } catch (IOException e15) {
                e = e15;
                inputStream = null;
            } catch (Throwable th4) {
                th = th4;
                httpURLConnectionA = null;
            }
            IronSourceNetworkBridge.httpUrlConnectionDisconnect(httpURLConnectionA);
            return gd2;
        }
        throw new InvalidParameterException("not valid params");
    }

    private static void a(HttpURLConnection httpURLConnection, a aVar) throws Exception {
        if (aVar.a()) {
            byte[] bytes = aVar.f28995c.getBytes(aVar.f28998f);
            httpURLConnection.setRequestProperty("Content-Length", Integer.toString(bytes.length));
            a(httpURLConnection, bytes);
        }
    }

    private static void a(HttpURLConnection httpURLConnection, List<Pair<String, String>> list) throws ProtocolException {
        for (Pair<String, String> pair : list) {
            httpURLConnection.setRequestProperty((String) pair.first, (String) pair.second);
        }
    }

    private static void a(HttpURLConnection httpURLConnection, byte[] bArr) throws Exception {
        httpURLConnection.setDoOutput(true);
        DataOutputStream dataOutputStream = new DataOutputStream(IronSourceNetworkBridge.urlConnectionGetOutputStream(httpURLConnection));
        try {
            dataOutputStream.write(bArr);
            dataOutputStream.flush();
        } finally {
            dataOutputStream.close();
        }
    }

    private static boolean a(String str, String str2) {
        return (str == null || str.isEmpty() || str2 == null || str2.isEmpty()) ? false : true;
    }

    private static HttpURLConnection a(a aVar) throws IOException {
        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(aVar.f28993a).openConnection();
        httpURLConnection.setConnectTimeout(aVar.f28996d);
        httpURLConnection.setReadTimeout(aVar.f28997e);
        httpURLConnection.setRequestMethod(aVar.f28994b);
        return httpURLConnection;
    }
}
