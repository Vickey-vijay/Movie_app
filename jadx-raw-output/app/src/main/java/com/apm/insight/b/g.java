package com.apm.insight.b;

import android.os.Looper;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import com.apm.insight.runtime.p;
import com.ironsource.Z7;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: LooperDispatchMonitor.java */
/* JADX INFO: loaded from: classes9.dex */
public final class g {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static int f6287r = 2;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private c f6288a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f6289b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private volatile int f6290c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f6291d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f6292e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private f f6293f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private long f6294g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f6295h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f6296i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private long f6297j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private String f6298k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private String f6299l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private com.apm.insight.b.e f6300m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private volatile boolean f6301n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f6302o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final p f6303p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private volatile boolean f6304q;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private Runnable f6305s;

    /* JADX INFO: compiled from: LooperDispatchMonitor.java */
    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public a f6320a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f6321b;

        public final void a(a aVar) {
            throw null;
        }
    }

    /* JADX INFO: compiled from: LooperDispatchMonitor.java */
    public interface c {
    }

    /* JADX INFO: compiled from: LooperDispatchMonitor.java */
    public static class d {
    }

    /* JADX INFO: compiled from: LooperDispatchMonitor.java */
    public static class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public long f6322a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public long f6323b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public long f6324c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f6325d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f6326e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public long f6327f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public long f6328g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public String f6329h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public String f6330i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private String f6331j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private d f6332k;

        public final void b() {
            this.f6325d = -1;
            this.f6326e = -1;
            this.f6327f = -1L;
            this.f6329h = null;
            this.f6331j = null;
            this.f6332k = null;
            this.f6330i = null;
        }

        public final JSONObject a() {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put(NotificationCompat.CATEGORY_MESSAGE, g.a(this.f6329h));
                jSONObject.put("cpuDuration", this.f6328g);
                jSONObject.put("duration", this.f6327f);
                jSONObject.put("type", this.f6325d);
                jSONObject.put("count", this.f6326e);
                jSONObject.put("messageCount", this.f6326e);
                jSONObject.put("lastDuration", this.f6323b - this.f6324c);
                jSONObject.put("start", this.f6322a);
                jSONObject.put("end", this.f6323b);
                jSONObject.put("block_uuid", (Object) null);
                jSONObject.put("sblock_uuid", (Object) null);
                jSONObject.put("belong_frame", false);
            } catch (JSONException e10) {
                e10.printStackTrace();
            }
            return jSONObject;
        }
    }

    public g() {
        this((byte) 0);
    }

    public static /* synthetic */ b c() {
        return null;
    }

    public static /* synthetic */ p e() {
        return null;
    }

    /* JADX INFO: compiled from: LooperDispatchMonitor.java */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public long f6314a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public long f6315b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public long f6316c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f6317d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f6318e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public StackTraceElement[] f6319f;

        private a() {
        }

        public /* synthetic */ a(byte b10) {
            this();
        }
    }

    /* JADX INFO: compiled from: LooperDispatchMonitor.java */
    public static class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f6333a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f6334b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private e f6335c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private List<e> f6336d = new ArrayList();

        public final e a(int i10) {
            e eVar = this.f6335c;
            if (eVar != null) {
                eVar.f6325d = i10;
                this.f6335c = null;
                return eVar;
            }
            e eVar2 = new e();
            eVar2.f6325d = i10;
            return eVar2;
        }

        public f(int i10) {
            this.f6333a = i10;
        }

        public final void a(e eVar) {
            int size = this.f6336d.size();
            int i10 = this.f6333a;
            if (size < i10) {
                this.f6336d.add(eVar);
                this.f6334b = this.f6336d.size();
                return;
            }
            int i11 = this.f6334b % i10;
            this.f6334b = i11;
            e eVar2 = this.f6336d.set(i11, eVar);
            eVar2.b();
            this.f6335c = eVar2;
            this.f6334b++;
        }

        public final List<e> a() {
            ArrayList arrayList = new ArrayList();
            int i10 = 0;
            if (this.f6336d.size() == this.f6333a) {
                for (int i11 = this.f6334b; i11 < this.f6336d.size(); i11++) {
                    arrayList.add(this.f6336d.get(i11));
                }
                while (i10 < this.f6334b - 1) {
                    arrayList.add(this.f6336d.get(i10));
                    i10++;
                }
            } else {
                while (i10 < this.f6336d.size()) {
                    arrayList.add(this.f6336d.get(i10));
                    i10++;
                }
            }
            return arrayList;
        }
    }

    private g(byte b10) {
        this.f6289b = 0;
        this.f6290c = 0;
        this.f6291d = 100;
        this.f6292e = 200;
        this.f6294g = -1L;
        this.f6295h = -1L;
        this.f6296i = -1;
        this.f6297j = -1L;
        this.f6301n = false;
        this.f6302o = false;
        this.f6304q = false;
        this.f6305s = new Runnable() { // from class: com.apm.insight.b.g.2

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private long f6308b;

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private long f6307a = 0;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private int f6309c = -1;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private int f6310d = 0;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            private int f6311e = 0;

            @Override // java.lang.Runnable
            public final void run() {
                long jUptimeMillis = SystemClock.uptimeMillis();
                if (g.c().f6320a == null) {
                    a aVar = new a((byte) 0);
                    if (this.f6309c == g.this.f6290c) {
                        this.f6310d++;
                    } else {
                        this.f6310d = 0;
                        this.f6311e = 0;
                        this.f6308b = jUptimeMillis;
                    }
                    this.f6309c = g.this.f6290c;
                    int i10 = this.f6310d;
                    if (i10 > 0 && i10 - this.f6311e >= g.f6287r && this.f6307a != 0 && jUptimeMillis - this.f6308b > 700 && g.this.f6304q) {
                        aVar.f6319f = Looper.getMainLooper().getThread().getStackTrace();
                        this.f6311e = this.f6310d;
                    }
                    aVar.f6317d = g.this.f6304q;
                    aVar.f6316c = (jUptimeMillis - this.f6307a) - 300;
                    aVar.f6314a = jUptimeMillis;
                    long jUptimeMillis2 = SystemClock.uptimeMillis();
                    this.f6307a = jUptimeMillis2;
                    aVar.f6315b = jUptimeMillis2 - jUptimeMillis;
                    aVar.f6318e = g.this.f6290c;
                    g.e().a(g.this.f6305s, 300L);
                    g.c().a(aVar);
                    return;
                }
                throw null;
            }
        };
        this.f6288a = new c() { // from class: com.apm.insight.b.g.1
        };
        this.f6303p = null;
    }

    public static /* synthetic */ int d(g gVar) {
        int i10 = gVar.f6289b;
        gVar.f6289b = i10 + 1;
        return i10;
    }

    public final JSONArray b() {
        JSONArray jSONArray = new JSONArray();
        try {
            int i10 = 0;
            for (e eVar : this.f6293f.a()) {
                if (eVar != null) {
                    i10++;
                    jSONArray.put(eVar.a().put("id", i10));
                }
            }
        } catch (Throwable unused) {
        }
        return jSONArray;
    }

    public final void a() {
        if (this.f6301n) {
            return;
        }
        this.f6301n = true;
        this.f6291d = 100;
        this.f6292e = com.safedk.android.internal.d.f44769a;
        this.f6293f = new f(100);
        this.f6300m = new com.apm.insight.b.e() { // from class: com.apm.insight.b.g.3
            @Override // com.apm.insight.b.e
            public final boolean a() {
                return true;
            }

            @Override // com.apm.insight.b.e
            public final void a(String str) {
                g.this.f6304q = true;
                g.this.f6299l = str;
                super.a(str);
                g.a(g.this, true, com.apm.insight.b.e.f6281a);
            }

            @Override // com.apm.insight.b.e
            public final void b(String str) {
                super.b(str);
                g.d(g.this);
                g.a(g.this, false, com.apm.insight.b.e.f6281a);
                g gVar = g.this;
                gVar.f6298k = gVar.f6299l;
                g.this.f6299l = "no message running";
                g.this.f6304q = false;
            }
        };
        h.a();
        h.a(this.f6300m);
        j.a(j.a());
    }

    private void a(int i10, long j10, String str) {
        a(i10, j10, str, true);
    }

    private void a(int i10, long j10, String str, boolean z10) {
        this.f6302o = true;
        e eVarA = this.f6293f.a(i10);
        eVarA.f6327f = j10 - this.f6294g;
        if (z10) {
            long jCurrentThreadTimeMillis = SystemClock.currentThreadTimeMillis();
            eVarA.f6328g = jCurrentThreadTimeMillis - this.f6297j;
            this.f6297j = jCurrentThreadTimeMillis;
        } else {
            eVarA.f6328g = -1L;
        }
        eVarA.f6326e = this.f6289b;
        eVarA.f6329h = str;
        eVarA.f6330i = this.f6298k;
        eVarA.f6322a = this.f6294g;
        eVarA.f6323b = j10;
        eVarA.f6324c = this.f6295h;
        this.f6293f.a(eVarA);
        this.f6289b = 0;
        this.f6294g = j10;
    }

    public final e a(long j10) {
        e eVar = new e();
        eVar.f6329h = this.f6299l;
        eVar.f6330i = this.f6298k;
        eVar.f6327f = j10 - this.f6295h;
        eVar.f6328g = 0 - this.f6297j;
        eVar.f6326e = this.f6289b;
        return eVar;
    }

    public static String a(String str) {
        String str2;
        if (TextUtils.isEmpty(str)) {
            return "unknown message";
        }
        try {
            String[] strArrSplit = str.split(StringUtils.PROCESS_POSTFIX_DELIMITER);
            String str3 = strArrSplit.length == 2 ? strArrSplit[1] : "";
            if (str.contains(com.safedk.android.analytics.brandsafety.creatives.discoveries.h.f44171d) && str.contains(com.safedk.android.analytics.brandsafety.creatives.discoveries.h.f44172e)) {
                str2 = str.split("\\{")[0];
                try {
                    str = str2 + str.split("\\}")[1];
                } catch (Throwable unused) {
                    return str2;
                }
            } else {
                str2 = str;
            }
            if (str.contains("@")) {
                String[] strArrSplit2 = str.split("@");
                if (strArrSplit2.length > 1) {
                    str = strArrSplit2[0];
                }
            }
            if (str.contains("(") && str.contains(")") && !str.endsWith(" null")) {
                String[] strArrSplit3 = str.split("\\(");
                if (strArrSplit3.length > 1) {
                    str = strArrSplit3[1];
                }
                str = str.replace(")", "");
            }
            if (str.startsWith(Z7.f27998r)) {
                str = str.replace(Z7.f27998r, "");
            }
            return str + str3;
        } catch (Throwable unused2) {
            return str;
        }
    }

    public static /* synthetic */ void a(g gVar, boolean z10, long j10) {
        int i10 = gVar.f6290c + 1;
        gVar.f6290c = i10;
        gVar.f6290c = i10 & 65535;
        gVar.f6302o = false;
        if (gVar.f6294g < 0) {
            gVar.f6294g = j10;
        }
        if (gVar.f6295h < 0) {
            gVar.f6295h = j10;
        }
        if (gVar.f6296i < 0) {
            gVar.f6296i = Process.myTid();
            gVar.f6297j = SystemClock.currentThreadTimeMillis();
        }
        long j11 = j10 - gVar.f6294g;
        int i11 = gVar.f6292e;
        if (j11 > i11) {
            long j12 = gVar.f6295h;
            if (j10 - j12 <= i11) {
                gVar.a(9, j10, gVar.f6299l);
            } else if (z10) {
                if (gVar.f6289b == 0) {
                    gVar.a(1, j10, "no message running");
                } else {
                    gVar.a(9, j12, gVar.f6298k);
                    gVar.a(1, j10, "no message running", false);
                }
            } else if (gVar.f6289b == 0) {
                gVar.a(8, j10, gVar.f6299l, true);
            } else {
                gVar.a(9, j12, gVar.f6298k, false);
                gVar.a(8, j10, gVar.f6299l, true);
            }
        }
        gVar.f6295h = j10;
    }
}
