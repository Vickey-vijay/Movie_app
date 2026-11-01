package com.ironsource.mediationsdk;

import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import com.ironsource.C3450ea;
import com.ironsource.C3605n2;
import com.ironsource.C3641p2;
import com.ironsource.C3644p5;
import com.ironsource.C3676r4;
import com.ironsource.N9;
import com.ironsource.S1;
import com.ironsource.T1;
import com.ironsource.Y1;
import com.ironsource.environment.thread.IronSourceThreadManager;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import com.safedk.android.internal.partials.IronSourceNetworkBridge;
import com.safedk.android.internal.partials.IronSourceVideoBridge;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.SocketTimeoutException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f29770a = "1";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f29771b = "102";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f29772c = "102";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f29773d = "GenericNotifications";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private f f29774e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private IronSource.a f29775f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private C3641p2 f29776g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private S1 f29777h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private ISBannerSize f29778i;

    public e(f fVar) {
        this.f29774e = fVar;
    }

    @Deprecated
    public void a(Context context, Map<String, Object> map, List<String> list, h hVar, int i10, C3450ea c3450ea, ISBannerSize iSBannerSize) {
        this.f29778i = iSBannerSize;
        a(context, map, list, hVar, i10, c3450ea);
    }

    public static class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public S1 f29779a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public d.a f29780b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f29781c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public String f29782d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public long f29783e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f29784f;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private int f29786h;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private final URL f29789k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private final JSONObject f29790l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private final boolean f29791m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final int f29792n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private final long f29793o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private final boolean f29794p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private final boolean f29795q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private final boolean f29796r;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public String f29787i = "";

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public int f29788j = 0;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public String f29785g = a((Integer) null);

        private void a(long j10, long j11) {
            long time = j10 - (new Date().getTime() - j11);
            if (time > 0) {
                SystemClock.sleep(time);
            }
        }

        public boolean b() {
            this.f29783e = new Date().getTime();
            try {
                this.f29786h = this.f29788j == 1015 ? 1 : this.f29786h;
                this.f29784f = 0;
                HttpURLConnection httpURLConnectionA = null;
                while (true) {
                    int i10 = this.f29784f;
                    int i11 = this.f29792n;
                    if (i10 >= i11) {
                        this.f29784f = i11 - 1;
                        this.f29785g = a(Integer.valueOf(this.f29781c));
                        return false;
                    }
                    try {
                        long time = new Date().getTime();
                        String str = "Auction Handler: auction trial " + (this.f29784f + 1) + " out of " + this.f29792n + " max trials";
                        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.INTERNAL, str, 0);
                        IronSourceUtils.i(str);
                        httpURLConnectionA = a(this.f29789k, this.f29793o);
                        IronLog ironLog = IronLog.INTERNAL;
                        ironLog.verbose("parameters for auction url: " + this.f29789k.getQuery());
                        ironLog.verbose("parameters for auction POST data: " + this.f29790l);
                        a(httpURLConnectionA, this.f29790l, this.f29794p);
                        int iHttpUrlConnectionGetResponseCode = IronSourceNetworkBridge.httpUrlConnectionGetResponseCode(httpURLConnectionA);
                        if (iHttpUrlConnectionGetResponseCode == 200 || iHttpUrlConnectionGetResponseCode == 204) {
                            try {
                                a(a(httpURLConnectionA), this.f29791m, this.f29795q);
                                IronSourceNetworkBridge.httpUrlConnectionDisconnect(httpURLConnectionA);
                                return true;
                            } catch (JSONException e10) {
                                C3676r4.d().a(e10);
                                if (e10.getMessage() != null && e10.getMessage().equalsIgnoreCase("decryption error")) {
                                    this.f29781c = 1003;
                                    this.f29782d = T1.f27644f;
                                } else if (e10.getMessage() == null || !e10.getMessage().equalsIgnoreCase("decompression error")) {
                                    this.f29781c = 1002;
                                    this.f29782d = T1.f27643e;
                                } else {
                                    this.f29781c = 1008;
                                    this.f29782d = T1.f27645g;
                                }
                                this.f29785g = a(Integer.valueOf(this.f29781c));
                                IronLog.INTERNAL.error("Auction handle response exception " + e10.getMessage());
                                IronSourceNetworkBridge.httpUrlConnectionDisconnect(httpURLConnectionA);
                                return false;
                            }
                        }
                        this.f29781c = 1001;
                        String str2 = "Auction response code not valid, error code response from server - " + iHttpUrlConnectionGetResponseCode;
                        this.f29782d = str2;
                        ironLog.error(str2);
                        IronSourceNetworkBridge.httpUrlConnectionDisconnect(httpURLConnectionA);
                        if (this.f29784f < this.f29792n - 1) {
                            a(this.f29793o, time);
                        }
                        this.f29784f++;
                    } catch (SocketTimeoutException e11) {
                        C3676r4.d().a(e11);
                        if (httpURLConnectionA != null) {
                            IronSourceNetworkBridge.httpUrlConnectionDisconnect(httpURLConnectionA);
                        }
                        this.f29781c = 1006;
                        this.f29782d = T1.f27646h;
                        IronLog.INTERNAL.error("Auction socket timeout exception " + e11.getMessage());
                    } catch (Throwable th2) {
                        C3676r4.d().a(th2);
                        IronLog.INTERNAL.error("getting exception " + th2);
                        if (httpURLConnectionA != null) {
                            IronSourceNetworkBridge.httpUrlConnectionDisconnect(httpURLConnectionA);
                        }
                        this.f29781c = 1000;
                        this.f29782d = th2.getMessage();
                        this.f29785g = a(Integer.valueOf(this.f29781c));
                        return false;
                    }
                }
            } catch (Exception e12) {
                C3676r4.d().a(e12);
                this.f29781c = 1007;
                this.f29782d = e12.getMessage();
                this.f29784f = 0;
                this.f29785g = a(Integer.valueOf(this.f29781c));
                IronLog.INTERNAL.error("Auction request exception " + e12.getMessage());
                return false;
            }
        }

        public a(S1 s10, URL url, JSONObject jSONObject, boolean z10, C3641p2 c3641p2) {
            this.f29779a = s10;
            this.f29789k = url;
            this.f29790l = jSONObject;
            this.f29791m = z10;
            this.f29792n = c3641p2.g();
            this.f29793o = c3641p2.m();
            this.f29794p = c3641p2.o();
            this.f29795q = c3641p2.p();
            this.f29786h = c3641p2.d();
            this.f29796r = c3641p2.n();
        }

        @Override // java.lang.Runnable
        public void run() {
            boolean zB = b();
            S1 s10 = this.f29779a;
            if (s10 == null) {
                return;
            }
            a(zB, s10, new Date().getTime() - this.f29783e);
        }

        private String a() {
            if (this.f29786h == 2) {
                return C3644p5.b().d();
            }
            return C3644p5.b().c();
        }

        private void a(HttpURLConnection httpURLConnection, JSONObject jSONObject, boolean z10) throws Exception {
            String strA;
            String strE;
            String str;
            OutputStream outputStreamUrlConnectionGetOutputStream = IronSourceNetworkBridge.urlConnectionGetOutputStream(httpURLConnection);
            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(outputStreamUrlConnectionGetOutputStream, "UTF-8");
            BufferedWriter bufferedWriter = new BufferedWriter(outputStreamWriter);
            if (this.f29786h == 2) {
                try {
                    strA = C3644p5.b().a();
                } catch (JSONException e10) {
                    C3676r4.d().a(e10);
                    this.f29787i = e10.getLocalizedMessage();
                    this.f29788j = 1015;
                    this.f29786h = 1;
                    IronLog.INTERNAL.error("get encrypted session key exception " + e10.getMessage());
                    strA = "";
                }
            } else {
                strA = "";
            }
            String string = jSONObject.toString();
            String strA2 = a();
            if (z10) {
                IronLog.INTERNAL.verbose("compressing and encrypting auction request");
                strE = N9.a(strA2, string);
            } else {
                strE = N9.e(strA2, string);
            }
            if (this.f29786h == 2) {
                str = String.format(T1.f27642d, strA, strE);
            } else {
                str = String.format(T1.f27641c, strE);
            }
            bufferedWriter.write(str);
            bufferedWriter.flush();
            bufferedWriter.close();
            outputStreamWriter.close();
            outputStreamUrlConnectionGetOutputStream.close();
        }

        private HttpURLConnection a(URL url, long j10) throws IOException {
            HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
            httpURLConnection.setRequestMethod("POST");
            httpURLConnection.setRequestProperty("Content-Type", "application/json; charset=utf-8");
            httpURLConnection.setReadTimeout((int) j10);
            httpURLConnection.setDoInput(true);
            httpURLConnection.setDoOutput(true);
            return httpURLConnection;
        }

        public JSONObject a(JSONObject jSONObject, boolean z10) throws JSONException {
            String strA = a();
            String string = jSONObject.getString(this.f29786h == 2 ? T1.f27640b : "response");
            if (z10) {
                return b(strA, string);
            }
            return a(strA, string);
        }

        public void a(String str, boolean z10, boolean z11) throws JSONException {
            if (!TextUtils.isEmpty(str)) {
                JSONObject jSONObjectJsonObjectInit = IronSourceVideoBridge.jsonObjectInit(str);
                if (z10) {
                    jSONObjectJsonObjectInit = a(jSONObjectJsonObjectInit, z11);
                }
                d.a aVarA = d.b().a(jSONObjectJsonObjectInit);
                this.f29780b = aVarA;
                this.f29781c = aVarA.c();
                this.f29782d = this.f29780b.d();
                return;
            }
            throw new JSONException("empty response");
        }

        private JSONObject a(String str, String str2) throws JSONException {
            String strB = N9.b(str, str2);
            if (!TextUtils.isEmpty(strB)) {
                return IronSourceVideoBridge.jsonObjectInit(strB);
            }
            throw new JSONException("decryption error");
        }

        private String a(HttpURLConnection httpURLConnection) throws IOException {
            InputStreamReader inputStreamReader = new InputStreamReader(IronSourceNetworkBridge.urlConnectionGetInputStream(httpURLConnection));
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
            StringBuilder sb2 = new StringBuilder();
            while (true) {
                String line = bufferedReader.readLine();
                if (line != null) {
                    sb2.append(line);
                } else {
                    bufferedReader.close();
                    inputStreamReader.close();
                    return sb2.toString();
                }
            }
        }

        private JSONObject b(String str, String str2) throws JSONException {
            IronLog.INTERNAL.verbose("decrypting and decompressing auction response");
            String strD = N9.d(str, str2);
            if (strD != null) {
                return IronSourceVideoBridge.jsonObjectInit(strD);
            }
            throw new JSONException("decompression error");
        }

        public void a(boolean z10, S1 s10, long j10) {
            if (z10) {
                s10.a(this.f29780b.h(), this.f29780b.a(), this.f29780b.e(), this.f29780b.f(), this.f29780b.b(), this.f29784f + 1, j10, this.f29788j, this.f29787i);
            } else {
                s10.a(this.f29781c, this.f29782d, this.f29784f + 1, this.f29785g, j10);
            }
        }

        private String a(Integer num) {
            return Y1.f27889a.a(this.f29796r, num);
        }
    }

    public void a(Context context, i iVar, S1 s10) {
        try {
            IronSourceThreadManager.INSTANCE.postMediationBackgroundTask(this.f29774e.a(context, iVar, s10));
        } catch (Exception e10) {
            C3676r4.d().a(e10);
            IronLog.INTERNAL.error("execute auction exception " + e10.getMessage());
            if (s10 != null) {
                s10.a(1000, e10.getMessage(), 0, Y1.f27889a.a(this.f29774e.a(), 1000), 0L);
            }
        }
    }

    @Deprecated
    public e(IronSource.a aVar, C3641p2 c3641p2, S1 s10) {
        this.f29775f = aVar;
        this.f29776g = c3641p2;
        this.f29777h = s10;
    }

    @Deprecated
    public void a(Context context, Map<String, Object> map, List<String> list, h hVar, int i10, C3450ea c3450ea) {
        try {
            boolean zG = IronSourceUtils.g();
            IronSourceThreadManager.INSTANCE.postMediationBackgroundTask(new a(this.f29777h, new URL(this.f29776g.a(false)), a(map, list, hVar, i10, zG, c3450ea), zG, this.f29776g));
        } catch (Exception e10) {
            C3676r4.d().a(e10);
            IronLog.INTERNAL.error("execute auction exception " + e10.getMessage());
            this.f29777h.a(1000, e10.getMessage(), 0, Y1.f27889a.a(this.f29776g.n(), 1000), 0L);
        }
    }

    public void a(C3605n2 c3605n2, int i10, C3605n2 c3605n3, String str) {
        Iterator<String> it = c3605n2.b().iterator();
        while (it.hasNext()) {
            d.b().a("reportImpression", c3605n2.c(), d.b().a(it.next(), i10, c3605n2, "", "", str));
        }
        if (c3605n3 != null) {
            Iterator<String> it2 = c3605n3.b().iterator();
            while (it2.hasNext()) {
                d.b().a("reportImpression", "GenericNotifications", d.b().a(it2.next(), i10, c3605n2, "", "102", str));
            }
        }
    }

    public void a(C3605n2 c3605n2, int i10, C3605n2 c3605n3) {
        Iterator<String> it = c3605n2.h().iterator();
        while (it.hasNext()) {
            d.b().a("reportLoadSuccess", c3605n2.c(), d.b().a(it.next(), i10, c3605n2, "", "", ""));
        }
        if (c3605n3 != null) {
            Iterator<String> it2 = c3605n3.h().iterator();
            while (it2.hasNext()) {
                d.b().a("reportLoadSuccess", "GenericNotifications", d.b().a(it2.next(), i10, c3605n2, "", "102", ""));
            }
        }
    }

    public void a(CopyOnWriteArrayList<A> copyOnWriteArrayList, ConcurrentHashMap<String, C3605n2> concurrentHashMap, int i10, C3605n2 c3605n2, C3605n2 c3605n3) {
        ArrayList<String> arrayList = new ArrayList<>();
        Iterator<A> it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().c());
        }
        a(arrayList, concurrentHashMap, i10, c3605n2, c3605n3);
    }

    public void a(ArrayList<String> arrayList, ConcurrentHashMap<String, C3605n2> concurrentHashMap, int i10, C3605n2 c3605n2, C3605n2 c3605n3) {
        int iJ = c3605n3.j();
        for (String str : arrayList) {
            if (!str.equals(c3605n3.c())) {
                C3605n2 c3605n4 = concurrentHashMap.get(str);
                int iJ2 = c3605n4.j();
                String strI = c3605n4.i();
                String str2 = iJ2 < iJ ? "1" : "102";
                IronLog.INTERNAL.verbose("instance=" + c3605n4.c() + ", instancePriceOrder= " + iJ2 + ", loseReasonCode=" + str2 + ", winnerInstance=" + c3605n3.c() + ", winnerInstancePriceOrder=" + iJ);
                Iterator<String> it = c3605n4.g().iterator();
                while (it.hasNext()) {
                    d.b().a("reportAuctionLose", c3605n4.c(), d.b().a(it.next(), i10, c3605n3, strI, str2, ""));
                }
            }
        }
        if (c3605n2 != null) {
            Iterator<String> it2 = c3605n2.g().iterator();
            while (it2.hasNext()) {
                d.b().a("reportAuctionLose", "GenericNotifications", d.b().a(it2.next(), i10, c3605n3, "", "102", ""));
            }
        }
    }

    private JSONObject a(Map<String, Object> map, List<String> list, h hVar, int i10, boolean z10, C3450ea c3450ea) throws JSONException {
        i iVar = new i(this.f29775f);
        iVar.a(map);
        iVar.a(list);
        iVar.a(hVar);
        iVar.a(i10);
        iVar.a(this.f29778i);
        iVar.a(c3450ea);
        iVar.b(z10);
        return d.b().a(iVar);
    }

    public boolean a() {
        return this.f29774e.b();
    }
}
