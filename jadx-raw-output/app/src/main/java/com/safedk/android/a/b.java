package com.safedk.android.a;

import com.mbridge.msdk.foundation.download.Command;
import com.safedk.android.SafeDK;
import com.safedk.android.analytics.reporters.CrashReporter;
import com.safedk.android.utils.Logger;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.InterruptedIOException;
import java.net.HttpRetryException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.UnknownHostException;

/* JADX INFO: loaded from: classes7.dex */
public class b implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f43407a = "ConfigDownload";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int f43408b = 2;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int[] f43409c = {60000, 300000};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private d f43410d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f43411e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final String f43412f;

    public b(d dVar, String str, String str2) {
        this.f43410d = new d();
        this.f43410d = dVar;
        this.f43411e = str;
        this.f43412f = str2;
    }

    /* JADX WARN: Code duplicated, block: B:32:0x00c9  */
    @Override // java.lang.Runnable
    public void run() throws Throwable {
        e eVar;
        Throwable th2;
        e eVar2 = null;
        String userId = SafeDK.getInstance().getUserId();
        int i10 = 0;
        while (i10 <= 2) {
            try {
                URL url = new URL(this.f43411e);
                Logger.d(f43407a, "Config url: " + url);
                eVar = new e(url.openConnection());
                try {
                    eVar.a(false);
                    if (userId != null) {
                        eVar.a("Cookie", "user_id=" + userId);
                    }
                    if (this.f43412f != null) {
                        eVar.a("If-None-Match", this.f43412f);
                    }
                    eVar.f();
                    a(eVar);
                    if (eVar != null) {
                        eVar.d();
                        return;
                    }
                    return;
                } catch (Exception e10) {
                    e = e10;
                    try {
                        Logger.e(f43407a, "Failed to download configuration", e);
                        this.f43410d.b(e.getMessage());
                        if (i10 >= 2 || !a(e)) {
                            if (eVar != null) {
                                eVar.d();
                                return;
                            }
                            return;
                        }
                        int iA = a(i10);
                        try {
                            Logger.d(f43407a, "Next retry in " + iA + " ms");
                            Thread.sleep(iA);
                        } catch (InterruptedException e11) {
                            Logger.e(f43407a, "Thread interrupted while sleeping: ", e11);
                            Thread.currentThread().interrupt();
                        }
                        if (eVar != null) {
                            eVar.d();
                        }
                        i10++;
                        eVar2 = eVar;
                    } catch (Throwable th3) {
                        th2 = th3;
                        eVar2 = eVar;
                        if (eVar2 != null) {
                            eVar2.d();
                        }
                        throw th2;
                    }
                } catch (Throwable th4) {
                    th = th4;
                    Logger.e(f43407a, "Caught exception", th);
                    new CrashReporter().caughtException(th);
                    if (eVar != null) {
                        eVar.d();
                    }
                    i10++;
                    eVar2 = eVar;
                }
            } catch (Exception e12) {
                e = e12;
                eVar = eVar2;
            } catch (Throwable th5) {
                th = th5;
                eVar = eVar2;
            }
        }
    }

    private String a(InputStream inputStream) throws IOException {
        if (inputStream == null) {
            return null;
        }
        StringBuilder sb2 = new StringBuilder();
        try {
            InputStreamReader inputStreamReader = new InputStreamReader(inputStream, "UTF-8");
            char[] cArr = new char[65536];
            while (true) {
                int i10 = inputStreamReader.read(cArr);
                if (i10 == -1) {
                    break;
                }
                sb2.append(cArr, 0, i10);
            }
        } catch (ArrayIndexOutOfBoundsException e10) {
            Logger.e(f43407a, "Failed to read configuration from input stream", e10);
        }
        return sb2.toString();
    }

    private int a(e eVar) throws IOException {
        InputStream inputStreamE = null;
        int iB = eVar.b();
        Logger.d(f43407a, "response code = " + iB);
        try {
            if (iB < 300) {
                inputStreamE = eVar.e();
                String strA = a(inputStreamE);
                Logger.d(f43407a, "response = " + strA);
                this.f43410d.a(strA, b(eVar));
            } else {
                if (iB != 304) {
                    InputStream inputStreamG = eVar.g();
                    String strA2 = a(inputStreamG);
                    this.f43410d.a(strA2);
                    if (inputStreamG != null) {
                        inputStreamG.close();
                    }
                    throw new HttpRetryException(strA2, iB);
                }
                this.f43410d.a(null, b(eVar));
            }
        } catch (IOException e10) {
            Logger.e(f43407a, "Failed to get response from server", e10);
            this.f43410d.a("Failed to read data from connection");
        } catch (Throwable th2) {
            Logger.e(f43407a, "Caught exception", th2);
            new CrashReporter().caughtException(th2);
        } finally {
            if (inputStreamE != null) {
                inputStreamE.close();
            }
        }
        return iB;
    }

    private int a(int i10) {
        return f43409c[i10];
    }

    private boolean a(Exception exc) {
        return (exc.getClass().isInstance(InterruptedIOException.class) || exc.getClass().isInstance(UnknownHostException.class) || exc.getClass().isInstance(MalformedURLException.class)) ? false : true;
    }

    private String b(e eVar) {
        return eVar.b(Command.HTTP_HEADER_ETAG);
    }
}
