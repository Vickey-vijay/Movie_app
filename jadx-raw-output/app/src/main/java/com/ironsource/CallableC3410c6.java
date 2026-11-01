package com.ironsource;

import android.text.TextUtils;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.sdk.utils.IronSourceStorageUtils;
import com.ironsource.sdk.utils.Logger;
import com.safedk.android.internal.partials.IronSourceNetworkBridge;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.SocketTimeoutException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.concurrent.Callable;

/* JADX INFO: renamed from: com.ironsource.c6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
class CallableC3410c6 implements Callable<C3499h5> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f28324d = "FileWorkerThread";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String f28325e = "X-Android-Protocols";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final String f28326f = "http/1.1,h2";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C3481g5 f28327a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f28328b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f28329c;

    public int a(byte[] bArr, String str) throws Exception {
        return IronSourceStorageUtils.saveFile(bArr, str);
    }

    public boolean a(String str, String str2) throws Exception {
        return IronSourceStorageUtils.renameFile(str, str2);
    }

    public CallableC3410c6(C3481g5 c3481g5, String str, long j10) {
        this.f28327a = c3481g5;
        this.f28328b = str;
        this.f28329c = j10;
    }

    public byte[] a(InputStream inputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[8192];
        while (true) {
            int i10 = inputStream.read(bArr, 0, 8192);
            if (i10 != -1) {
                byteArrayOutputStream.write(bArr, 0, i10);
            } else {
                byteArrayOutputStream.flush();
                return byteArrayOutputStream.toByteArray();
            }
        }
    }

    @Override // java.util.concurrent.Callable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public C3499h5 call() throws Throwable {
        if (this.f28329c == 0) {
            this.f28329c = 1L;
        }
        C3499h5 c3499h5A = null;
        for (int i10 = 0; i10 < this.f28329c; i10++) {
            c3499h5A = a(this.f28327a.e(), i10, this.f28327a.a(), this.f28327a.c(), this.f28327a.f());
            int iB = c3499h5A.b();
            if (iB != 1008 && iB != 1009) {
                break;
            }
        }
        if (c3499h5A != null && c3499h5A.a() != null) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.f28328b);
            String str = File.separator;
            sb2.append(str);
            sb2.append(this.f28327a.b().getName());
            String string = sb2.toString();
            String str2 = this.f28327a.d() + str + C3462f4.E + this.f28327a.b().getName();
            try {
                if (a(c3499h5A.a(), str2) == 0) {
                    c3499h5A.a(1006);
                } else if (!a(str2, string)) {
                    c3499h5A.a(1014);
                }
            } catch (FileNotFoundException e10) {
                C3676r4.d().a(e10);
                c3499h5A.a(1018);
            } catch (Error e11) {
                C3676r4.d().a(e11);
                if (!TextUtils.isEmpty(e11.getMessage())) {
                    Logger.i(f28324d, e11.getMessage());
                }
                c3499h5A.a(1019);
            } catch (Exception e12) {
                C3676r4.d().a(e12);
                if (!TextUtils.isEmpty(e12.getMessage())) {
                    Logger.i(f28324d, e12.getMessage());
                }
                c3499h5A.a(1009);
            }
        }
        return c3499h5A;
    }

    /* JADX WARN: Code duplicated, block: B:111:0x0186 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:112:0x0188 A[Catch: all -> 0x0184, TRY_LEAVE, TryCatch #2 {all -> 0x0184, blocks: (B:108:0x0180, B:112:0x0188), top: B:117:0x0180 }] */
    /* JADX WARN: Code duplicated, block: B:117:0x0180 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public C3499h5 a(String str, int i10, int i11, int i12, boolean z10) throws Throwable {
        HttpURLConnection httpURLConnection;
        C3499h5 c3499h5 = new C3499h5();
        if (TextUtils.isEmpty(str)) {
            c3499h5.a(str);
            c3499h5.a(1007);
            return c3499h5;
        }
        InputStream inputStreamUrlConnectionGetInputStream = null;
        int iHttpUrlConnectionGetResponseCode = 0;
        try {
            try {
                try {
                    try {
                        URL url = new URL(str);
                        url.toURI();
                        httpURLConnection = (HttpURLConnection) url.openConnection();
                        try {
                            httpURLConnection.setRequestMethod("GET");
                            if (z10) {
                                try {
                                    httpURLConnection.setRequestProperty(f28325e, f28326f);
                                } catch (IllegalStateException e10) {
                                    C3676r4.d().a(e10);
                                }
                            }
                            httpURLConnection.setConnectTimeout(i11);
                            httpURLConnection.setReadTimeout(i12);
                            httpURLConnection.connect();
                            iHttpUrlConnectionGetResponseCode = IronSourceNetworkBridge.httpUrlConnectionGetResponseCode(httpURLConnection);
                            if (iHttpUrlConnectionGetResponseCode >= 200 && iHttpUrlConnectionGetResponseCode < 400) {
                                inputStreamUrlConnectionGetInputStream = IronSourceNetworkBridge.urlConnectionGetInputStream(httpURLConnection);
                                c3499h5.a(a(inputStreamUrlConnectionGetInputStream));
                            } else {
                                Logger.i(f28324d, " RESPONSE CODE: " + iHttpUrlConnectionGetResponseCode + " URL: " + str + " ATTEMPT: " + i10);
                                iHttpUrlConnectionGetResponseCode = 1011;
                            }
                            if (inputStreamUrlConnectionGetInputStream != null) {
                                inputStreamUrlConnectionGetInputStream.close();
                            }
                            IronSourceNetworkBridge.httpUrlConnectionDisconnect(httpURLConnection);
                        } catch (FileNotFoundException e11) {
                            e = e11;
                            C3676r4.d().a(e);
                            i10 = 1018;
                            if (0 != 0) {
                                inputStreamUrlConnectionGetInputStream.close();
                            }
                            if (httpURLConnection != null) {
                                IronSourceNetworkBridge.httpUrlConnectionDisconnect(httpURLConnection);
                            }
                            c3499h5.a(str);
                            c3499h5.a(i10);
                            return c3499h5;
                        } catch (Error e12) {
                            e = e12;
                            C3676r4.d().a(e);
                            iHttpUrlConnectionGetResponseCode = 1019;
                            if (!TextUtils.isEmpty(e.getMessage())) {
                                Logger.i(f28324d, e.getMessage());
                            }
                            if (0 != 0) {
                                inputStreamUrlConnectionGetInputStream.close();
                            }
                            if (httpURLConnection != null) {
                                IronSourceNetworkBridge.httpUrlConnectionDisconnect(httpURLConnection);
                            }
                        } catch (MalformedURLException e13) {
                            e = e13;
                            C3676r4.d().a(e);
                            i10 = 1004;
                            if (0 != 0) {
                                inputStreamUrlConnectionGetInputStream.close();
                            }
                            if (httpURLConnection != null) {
                                IronSourceNetworkBridge.httpUrlConnectionDisconnect(httpURLConnection);
                            }
                            c3499h5.a(str);
                            c3499h5.a(i10);
                            return c3499h5;
                        } catch (SocketTimeoutException e14) {
                            e = e14;
                            C3676r4.d().a(e);
                            i10 = 1008;
                            if (0 != 0) {
                                inputStreamUrlConnectionGetInputStream.close();
                            }
                            if (httpURLConnection != null) {
                                IronSourceNetworkBridge.httpUrlConnectionDisconnect(httpURLConnection);
                            }
                            c3499h5.a(str);
                            c3499h5.a(i10);
                            return c3499h5;
                        } catch (URISyntaxException e15) {
                            e = e15;
                            C3676r4.d().a(e);
                            i10 = 1010;
                            if (0 != 0) {
                                inputStreamUrlConnectionGetInputStream.close();
                            }
                            if (httpURLConnection != null) {
                                IronSourceNetworkBridge.httpUrlConnectionDisconnect(httpURLConnection);
                            }
                            c3499h5.a(str);
                            c3499h5.a(i10);
                            return c3499h5;
                        } catch (Exception e16) {
                            e = e16;
                            C3676r4.d().a(e);
                            if (!TextUtils.isEmpty(e.getMessage())) {
                                Logger.i(f28324d, e.getMessage());
                            }
                            i10 = 1009;
                            if (0 != 0) {
                                inputStreamUrlConnectionGetInputStream.close();
                            }
                            if (httpURLConnection != null) {
                                IronSourceNetworkBridge.httpUrlConnectionDisconnect(httpURLConnection);
                            }
                            c3499h5.a(str);
                            c3499h5.a(i10);
                            return c3499h5;
                        }
                    } catch (Throwable th2) {
                        C3676r4.d().a(th2);
                        IronLog.INTERNAL.error(th2.toString());
                        c3499h5.a(str);
                        c3499h5.a(i10);
                    }
                } catch (Throwable th3) {
                    th = th3;
                    if (0 != 0) {
                        try {
                            inputStreamUrlConnectionGetInputStream.close();
                            if (0 != 0) {
                                IronSourceNetworkBridge.httpUrlConnectionDisconnect(null);
                            }
                        } catch (Throwable th4) {
                            C3676r4.d().a(th4);
                            IronLog.INTERNAL.error(th4.toString());
                            c3499h5.a(str);
                            c3499h5.a(0);
                            throw th;
                        }
                    } else if (0 != 0) {
                        IronSourceNetworkBridge.httpUrlConnectionDisconnect(null);
                    }
                    c3499h5.a(str);
                    c3499h5.a(0);
                    throw th;
                }
            } catch (FileNotFoundException e17) {
                e = e17;
                httpURLConnection = null;
            } catch (Error e18) {
                e = e18;
                httpURLConnection = null;
            } catch (MalformedURLException e19) {
                e = e19;
                httpURLConnection = null;
            } catch (SocketTimeoutException e20) {
                e = e20;
                httpURLConnection = null;
            } catch (URISyntaxException e21) {
                e = e21;
                httpURLConnection = null;
            } catch (Exception e22) {
                e = e22;
                httpURLConnection = null;
            } catch (Throwable th5) {
                th = th5;
                if (0 != 0) {
                    inputStreamUrlConnectionGetInputStream.close();
                    if (0 != 0) {
                        IronSourceNetworkBridge.httpUrlConnectionDisconnect(null);
                    }
                } else if (0 != 0) {
                    IronSourceNetworkBridge.httpUrlConnectionDisconnect(null);
                }
                c3499h5.a(str);
                c3499h5.a(0);
                throw th;
            }
        } catch (Throwable th6) {
            C3676r4.d().a(th6);
            IronLog.INTERNAL.error(th6.toString());
        }
        c3499h5.a(str);
        c3499h5.a(iHttpUrlConnectionGetResponseCode);
        return c3499h5;
    }
}
