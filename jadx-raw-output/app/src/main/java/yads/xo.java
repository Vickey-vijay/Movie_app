package yads;

import android.os.SystemClock;
import com.ironsource.C3426d4;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.SocketTimeoutException;
import java.text.SimpleDateFormat;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;

/* JADX INFO: loaded from: classes11.dex */
public final class xo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ho f84652a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final gr f84653b;

    public final e82 a(po2 po2Var) throws im3 {
        p82 p82Var;
        p82 p82Var2;
        int i10;
        Map mapEmptyMap;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        while (true) {
            Collections.emptyList();
            y11 y11Var = null;
            try {
                lr lrVar = po2Var.f81502p;
                if (lrVar == null) {
                    mapEmptyMap = Collections.emptyMap();
                } else {
                    HashMap map = new HashMap();
                    String str = lrVar.f79884b;
                    if (str != null) {
                        map.put("If-None-Match", str);
                    }
                    long j10 = lrVar.f79886d;
                    if (j10 > 0) {
                        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss 'GMT'", Locale.US);
                        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
                        map.put("If-Modified-Since", simpleDateFormat.format(new Date(j10)));
                    }
                    mapEmptyMap = map;
                }
                y11 y11VarA = this.f84652a.a(po2Var, mapEmptyMap);
                try {
                    int i11 = y11VarA.f84785a;
                    List listUnmodifiableList = Collections.unmodifiableList(y11VarA.f84786b);
                    if (i11 == 304) {
                        return q82.a(po2Var, SystemClock.elapsedRealtime() - jElapsedRealtime, listUnmodifiableList);
                    }
                    InputStream byteArrayInputStream = y11VarA.f84788d;
                    if (byteArrayInputStream == null) {
                        byteArrayInputStream = y11VarA.f84789e != null ? new ByteArrayInputStream(y11VarA.f84789e) : null;
                    }
                    byte[] bArrA = byteArrayInputStream != null ? q82.a(byteArrayInputStream, y11VarA.f84787c, this.f84653b) : new byte[0];
                    long jElapsedRealtime2 = SystemClock.elapsedRealtime() - jElapsedRealtime;
                    if (lm3.f79855a || jElapsedRealtime2 > 3000) {
                        int i12 = po2Var.f81501o.f81837b;
                        boolean z10 = ad1.f75480a;
                    }
                    if (i11 < 200 || i11 > 299) {
                        throw new IOException();
                    }
                    SystemClock.elapsedRealtime();
                    return new e82(i11, bArrA, e82.a(listUnmodifiableList), listUnmodifiableList, false);
                } catch (IOException e10) {
                    y11Var = y11VarA;
                    e = e10;
                    if (e instanceof SocketTimeoutException) {
                        p82Var = new p82("socket", new v63());
                    } else {
                        if (e instanceof MalformedURLException) {
                            throw new RuntimeException("Bad URL " + po2Var.g(), e);
                        }
                        if (y11Var != null) {
                            int i13 = y11Var.f84785a;
                            po2Var.g();
                            boolean z11 = lm3.f79855a;
                            boolean z12 = ad1.f75480a;
                            if (y11Var != 0) {
                                List listUnmodifiableList2 = Collections.unmodifiableList(y11Var.f84786b);
                                SystemClock.elapsedRealtime();
                                e82 e82Var = new e82(i13, 0, e82.a(listUnmodifiableList2), listUnmodifiableList2, false);
                                if (i13 == 401 || i13 == 403) {
                                    p82Var2 = new p82("auth", new pl(e82Var));
                                } else {
                                    if (i13 >= 400 && i13 <= 499) {
                                        throw new ov(e82Var);
                                    }
                                    if (i13 < 500 || i13 > 599 || !po2Var.f81499m) {
                                        throw new sx2(e82Var);
                                    }
                                    p82Var2 = new p82("server", new sx2(e82Var));
                                }
                                p82Var = p82Var2;
                            } else {
                                p82Var = new p82("network", new b82());
                            }
                        } else {
                            if (!po2Var.f81500n) {
                                throw new b92(e);
                            }
                            p82Var = new p82("connection", new b92());
                        }
                    }
                    qe0 qe0Var = po2Var.f81501o;
                    i10 = qe0Var.f81836a;
                    try {
                        im3 im3Var = p82Var.f81308b;
                        int i14 = qe0Var.f81837b + 1;
                        qe0Var.f81837b = i14;
                        qe0Var.f81836a = ((int) (i10 * qe0Var.f81839d)) + i10;
                        if (i14 > qe0Var.f81838c) {
                            throw im3Var;
                        }
                        po2Var.a(p82Var.f81307a + "-retry [timeout=" + i10 + C3426d4.j.f28588e);
                    } catch (im3 e11) {
                        po2Var.a(p82Var.f81307a + "-timeout-giveup [timeout=" + i10 + C3426d4.j.f28588e);
                        throw e11;
                    }
                }
            } catch (IOException e12) {
                e = e12;
            }
            po2Var.a(p82Var.f81307a + "-retry [timeout=" + i10 + C3426d4.j.f28588e);
        }
    }

    public xo(a21 a21Var, gr grVar) {
        this.f84652a = a21Var;
        this.f84653b = grVar;
    }
}
