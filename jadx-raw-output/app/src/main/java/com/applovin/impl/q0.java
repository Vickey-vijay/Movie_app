package com.applovin.impl;

import android.os.SystemClock;
import android.text.TextUtils;
import androidx.core.util.Consumer;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.AppLovinErrorCodes;
import com.vungle.ads.internal.ui.AdActivity;
import java.net.MalformedURLException;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class q0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final List f8830e = Arrays.asList("5.0/i", "4.0/ad", "1.0/mediate");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.sdk.k f8831a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.applovin.impl.sdk.o f8832b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final b4 f8833c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private d f8834d;

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private long f8835a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private long f8836b;

        public long a() {
            return this.f8835a;
        }

        public long b() {
            return this.f8836b;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void a(long j10) {
            this.f8835a = j10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void b(long j10) {
            this.f8836b = j10;
        }
    }

    public class c implements Consumer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f8837a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final com.applovin.impl.sdk.network.a f8838b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final String f8839c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final Object f8840d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final boolean f8841e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final b f8842f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final e f8843g;

        private c(String str, com.applovin.impl.sdk.network.a aVar, String str2, Object obj, boolean z10, b bVar, e eVar) {
            this.f8837a = str;
            this.f8838b = aVar;
            this.f8839c = str2;
            this.f8840d = obj;
            this.f8841e = z10;
            this.f8842f = bVar;
            this.f8843g = eVar;
        }

        @Override // androidx.core.util.Consumer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void accept(b4.d dVar) {
            int i10;
            String str;
            long jE = dVar.e();
            Object objA = null;
            try {
                try {
                    int iC = dVar.c();
                    try {
                        if (iC <= 0) {
                            q0.this.a(this.f8839c, this.f8837a, iC, jE, (Throwable) null);
                            this.f8843g.a(this.f8837a, iC, null, null);
                            return;
                        }
                        if (iC >= 200 && iC < 400) {
                            b bVar = this.f8842f;
                            if (bVar != null) {
                                bVar.a(jE);
                            }
                            q0.this.a(this.f8839c, this.f8837a, iC, jE);
                            byte[] bArrD = dVar.d();
                            if (n7.h(com.applovin.impl.sdk.k.o()) && (!this.f8841e || u4.b(bArrD) != u4.a.V2)) {
                                String string = "";
                                if (bArrD == null) {
                                    str = "";
                                } else {
                                    str = new String(dVar.d(), Charset.forName("UTF-8"));
                                }
                                if (this.f8838b.b() != null) {
                                    string = this.f8838b.b().toString();
                                }
                                q0.this.f8831a.t().a(str, this.f8837a, string);
                            }
                            if (bArrD != null) {
                                String str2 = new String(dVar.d(), Charset.forName("UTF-8"));
                                b bVar2 = this.f8842f;
                                if (bVar2 != null) {
                                    bVar2.b(bArrD.length);
                                    if (this.f8838b.r()) {
                                        q0.this.f8834d = new d(this.f8838b.f(), bArrD.length, jE);
                                    }
                                }
                                if (this.f8841e) {
                                    String strB = u4.b(bArrD, q0.this.f8831a.i0(), q0.this.f8831a);
                                    if (strB == null) {
                                        HashMap map = new HashMap(2);
                                        map.put(AdActivity.REQUEST_KEY_EXTRA, StringUtils.getHostAndPath(this.f8837a));
                                        map.put("response", str2);
                                        q0.this.f8831a.F().trackEvent("rdf", map);
                                    }
                                    str2 = strB;
                                }
                                try {
                                    this.f8843g.a(this.f8837a, q0.this.a(str2, this.f8840d), iC);
                                    return;
                                } catch (Throwable th2) {
                                    String str3 = "Unable to parse response from " + StringUtils.getHostAndPath(this.f8837a) + " because of " + th2.getClass().getName() + " : " + th2.getMessage();
                                    com.applovin.impl.sdk.o unused = q0.this.f8832b;
                                    if (com.applovin.impl.sdk.o.a()) {
                                        q0.this.f8832b.a("ConnectionManager", str3, th2);
                                    }
                                    q0.this.f8831a.D().a("ConnectionManager", "failedToParseResponse", th2, CollectionUtils.hashMap("url", StringUtils.getHostAndPath(this.f8837a)));
                                    this.f8843g.a(this.f8837a, AppLovinErrorCodes.INVALID_RESPONSE, str3, null);
                                    return;
                                }
                            }
                            this.f8843g.a(this.f8837a, this.f8840d, iC);
                            return;
                        }
                        this.f8843g.a(this.f8837a, iC, null, null);
                    } catch (MalformedURLException e10) {
                        e = e10;
                        i10 = iC;
                        if (this.f8840d == null) {
                            q0.this.a(this.f8839c, this.f8837a, i10, jE);
                            this.f8843g.a(this.f8837a, this.f8840d, -901);
                        } else {
                            q0.this.a(this.f8839c, this.f8837a, i10, jE, e);
                            this.f8843g.a(this.f8837a, -901, e.getMessage(), null);
                        }
                    }
                } catch (Throwable th3) {
                    int iB = dVar.b();
                    try {
                        byte[] bArrF = dVar.f();
                        String str4 = new String(bArrF);
                        if (bArrF != null) {
                            if (this.f8841e) {
                                str4 = u4.b(bArrF, q0.this.f8831a.i0(), q0.this.f8831a);
                            }
                            objA = q0.this.a(str4, this.f8840d);
                        }
                    } catch (Throwable unused2) {
                    }
                    q0.this.a(this.f8839c, this.f8837a, iB, jE, th3);
                    this.f8843g.a(this.f8837a, iB, th3.getMessage(), objA);
                }
            } catch (MalformedURLException e11) {
                e = e11;
                i10 = 0;
            }
        }
    }

    public static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final long f8845a = System.currentTimeMillis();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f8846b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final long f8847c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final long f8848d;

        public boolean a(Object obj) {
            return obj instanceof d;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            if (!dVar.a(this) || c() != dVar.c() || b() != dVar.b() || a() != dVar.a()) {
                return false;
            }
            String strD = d();
            String strD2 = dVar.d();
            return strD != null ? strD.equals(strD2) : strD2 == null;
        }

        public long a() {
            return this.f8848d;
        }

        public long b() {
            return this.f8847c;
        }

        public long c() {
            return this.f8845a;
        }

        public String d() {
            return this.f8846b;
        }

        public String toString() {
            return "ConnectionManager.RequestMeasurement(timestampMillis=" + c() + ", urlHostAndPathString=" + d() + ", responseSizeBytes=" + b() + ", connectionTimeMillis=" + a() + ")";
        }

        public d(String str, long j10, long j11) {
            this.f8846b = str;
            this.f8847c = j10;
            this.f8848d = j11;
        }

        public int hashCode() {
            int iHashCode;
            long jC = c();
            long jB = b();
            int i10 = ((((int) (jC ^ (jC >>> 32))) + 59) * 59) + ((int) (jB ^ (jB >>> 32)));
            long jA = a();
            String strD = d();
            int i11 = ((i10 * 59) + ((int) ((jA >>> 32) ^ jA))) * 59;
            if (strD == null) {
                iHashCode = 43;
            } else {
                iHashCode = strD.hashCode();
            }
            return i11 + iHashCode;
        }
    }

    public interface e {
        void a(String str, int i10, String str2, Object obj);

        void a(String str, Object obj, int i10);
    }

    public q0(com.applovin.impl.sdk.k kVar) {
        this.f8831a = kVar;
        this.f8832b = kVar.O();
        b4 b4Var = new b4(kVar);
        this.f8833c = b4Var;
        b4Var.a();
    }

    /* JADX WARN: Code duplicated, block: B:72:0x0215 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:73:0x0217 A[Catch: all -> 0x026d, TryCatch #2 {all -> 0x026d, blocks: (B:36:0x00f8, B:38:0x0108, B:42:0x0134, B:41:0x0130, B:43:0x0143, B:46:0x0168, B:48:0x0184, B:52:0x01a5, B:68:0x01fd, B:71:0x020c, B:73:0x0217, B:54:0x01a9, B:57:0x01b1, B:63:0x01c9, B:65:0x01cf, B:66:0x01e9, B:49:0x0192, B:74:0x021a, B:76:0x0220, B:77:0x0234, B:59:0x01c2), top: B:99:0x00f8, inners: #0 }] */
    public void a(com.applovin.impl.sdk.network.a aVar, b bVar, e eVar) {
        byte[] bytes;
        byte[] bArrA;
        if (aVar != null) {
            String strF = aVar.f();
            String strH = aVar.h();
            if (strF == null) {
                throw new IllegalArgumentException("No endpoint specified");
            }
            if (strH == null) {
                throw new IllegalArgumentException("No method specified");
            }
            if (eVar != null) {
                if (!strF.toLowerCase().startsWith("http")) {
                    String str = "Requested postback submission to non HTTP endpoint " + strF + "; skipping...";
                    com.applovin.impl.sdk.o.h("ConnectionManager", str);
                    eVar.a(strF, AppLovinErrorCodes.INVALID_URL, str, null);
                    return;
                }
                String httpsString = StringUtils.toHttpsString(strF);
                HashMap map = new HashMap(2);
                boolean zM = aVar.m();
                u4.a aVarA = ((Boolean) this.f8831a.a(x4.f10003o5)).booleanValue() ? u4.a.a(((Integer) this.f8831a.a(x4.f9978l5)).intValue()) : aVar.e();
                long jA = n7.a(this.f8831a);
                if ((aVar.i() != null && !aVar.i().isEmpty()) || aVar.c() > 0) {
                    Map mapI = aVar.i();
                    Boolean bool = (Boolean) this.f8831a.a(x4.f9949i3);
                    if (mapI != null && aVar.c() > 0) {
                        mapI.put("current_retry_attempt", String.valueOf(aVar.c()));
                    }
                    if (zM) {
                        String strA = n7.a(mapI, bool.booleanValue());
                        String strB = u4.b(strA, jA, aVarA, this.f8831a.i0(), this.f8831a);
                        if (StringUtils.isValidString(strA) && TextUtils.isEmpty(strB)) {
                            map.put("query", strA);
                        }
                        httpsString = StringUtils.appendQueryParameter(httpsString, "p", strB);
                    } else {
                        httpsString = StringUtils.appendQueryParameters(httpsString, mapI, bool.booleanValue());
                    }
                }
                String str2 = httpsString;
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                try {
                    Boolean boolEndsWith = StringUtils.endsWith(StringUtils.getHostAndPath(str2), f8830e);
                    if (com.applovin.impl.sdk.o.a()) {
                        com.applovin.impl.sdk.o oVar = this.f8832b;
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("Sending ");
                        sb2.append(strH);
                        sb2.append(" request to id=#");
                        sb2.append(str2.hashCode());
                        sb2.append(" \"");
                        sb2.append(boolEndsWith.booleanValue() ? str2 : StringUtils.getHostAndPath(str2));
                        sb2.append("\"...");
                        oVar.d("ConnectionManager", sb2.toString());
                    }
                    b4.c.a aVarA2 = new b4.c.a().a(str2).b(strH).a(aVar.g()).a(aVar.l());
                    if (aVar.b() != null) {
                        if (zM) {
                            bytes = u4.a(aVar.b().toString(), jA, aVarA, this.f8831a.i0(), this.f8831a);
                            if (bytes == null) {
                                map.put("body", aVar.b().toString());
                            }
                        } else {
                            bytes = aVar.b().toString().getBytes("UTF-8");
                        }
                        byte[] bArr = bytes;
                        if ((!zM || aVarA != u4.a.V2) && aVar.o() && bArr != null && bArr.length > ((Integer) this.f8831a.a(x4.J5)).intValue()) {
                            try {
                                bArrA = n7.a(bArr);
                            } catch (Throwable th2) {
                                if (com.applovin.impl.sdk.o.a()) {
                                    this.f8832b.a("ConnectionManager", "Failed to gzip POST body for request " + a(str2), th2);
                                }
                                this.f8831a.D().a("ConnectionManager", "gzip", th2, CollectionUtils.hashMap("url", StringUtils.getHostAndPath(str2)));
                                bArrA = null;
                            }
                            aVarA2.a("Content-Type", "application/json; charset=utf-8");
                            if (!aVar.o() && bArrA != null) {
                                aVarA2.a("Content-Encoding", "gzip");
                                aVarA2.a(bArrA);
                            } else if (bArr != null) {
                                aVarA2.a(bArr);
                            }
                        } else {
                            bArrA = null;
                            aVarA2.a("Content-Type", "application/json; charset=utf-8");
                            if (!aVar.o()) {
                                if (bArr != null) {
                                    aVarA2.a(bArr);
                                }
                            } else if (bArr != null) {
                                aVarA2.a(bArr);
                            }
                        }
                        a(strH, str2, 0, SystemClock.elapsedRealtime() - jElapsedRealtime, th);
                        eVar.a(str2, 0, th.getMessage(), null);
                        return;
                    }
                    if (!map.isEmpty()) {
                        map.put(AdActivity.REQUEST_KEY_EXTRA, StringUtils.getHostAndPath(str2));
                        this.f8831a.F().trackEvent("ref", map);
                    }
                    try {
                        this.f8833c.a(aVarA2.a(new c(str2, aVar, strH, aVar.d(), zM, bVar, eVar)).a(this.f8831a.q0().c()).a());
                    } catch (Throwable th3) {
                        th = th3;
                    }
                } catch (Throwable th4) {
                    th = th4;
                }
            } else {
                throw new IllegalArgumentException("No callback specified");
            }
        } else {
            throw new IllegalArgumentException("No request specified");
        }
    }

    public d a() {
        return this.f8834d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Object a(String str, Object obj) {
        if (obj == null) {
            return str;
        }
        if (str != null && str.length() >= 3) {
            if (obj instanceof JSONObject) {
                return new JSONObject(str);
            }
            if (obj instanceof p8) {
                return q8.a(str, this.f8831a);
            }
            if (obj instanceof String) {
                return str;
            }
            if (com.applovin.impl.sdk.o.a()) {
                this.f8832b.b("ConnectionManager", "Failed to process response of type '" + obj.getClass().getName() + "'");
            }
        }
        return obj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, String str2, int i10, long j10) {
        if (com.applovin.impl.sdk.o.a()) {
            this.f8832b.d("ConnectionManager", "Successful " + str + " returned " + i10 + " in " + (j10 / 1000.0f) + " s over " + r0.g(this.f8831a) + " to " + a(str2));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, String str2, int i10, long j10, Throwable th2) {
        if (com.applovin.impl.sdk.o.a()) {
            this.f8832b.a("ConnectionManager", "Failed " + str + " returned " + i10 + " in " + (j10 / 1000.0f) + " s over " + r0.g(this.f8831a) + " to " + a(str2), th2);
        }
    }

    private String a(String str) {
        return "#" + str.hashCode() + " \"" + StringUtils.getHostAndPath(str) + "\"";
    }
}
