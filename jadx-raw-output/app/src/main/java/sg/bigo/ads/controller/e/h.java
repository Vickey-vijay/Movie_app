package sg.bigo.ads.controller.e;

import android.os.SystemClock;
import androidx.annotation.NonNull;
import org.json.JSONException;
import org.json.JSONObject;
import sg.bigo.ads.api.a.n;

/* JADX INFO: loaded from: classes4.dex */
public final class h implements sg.bigo.ads.common.f.a.InterfaceC0703a {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final h f70869f = new h();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f70876h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private long f70877i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private long f70878j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f70870a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f70871b = 5000;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private long f70875g = 21600000;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f70872c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f70873d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    public final a f70874e = new a();

    public class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f70879a = System.currentTimeMillis();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public long f70880b = System.currentTimeMillis();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public long f70881c = System.currentTimeMillis();

        public a() {
        }

        public final String a(String str) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.putOpt("start_ts", Long.valueOf(this.f70881c));
                h hVar = h.this;
                jSONObject.putOpt("total_duration", Long.valueOf(hVar.f70872c + hVar.b()));
                h hVar2 = h.this;
                long jB = hVar2.b();
                if (jB > hVar2.f70871b) {
                    hVar2.f70873d = jB;
                } else {
                    jB = hVar2.f70873d;
                }
                jSONObject.putOpt("close_duration", Long.valueOf(jB));
                g.a aVarA = g.a().a(str);
                jSONObject.putOpt("front_total_req_times", Long.valueOf(g.this.f70864c ? aVarA.f70865a.getAndAdd(1) : aVarA.f70865a.get()));
                g.a aVarA2 = g.a().a(str);
                jSONObject.putOpt("back_total_req_times", Long.valueOf(!g.this.f70864c ? aVarA2.f70866b.getAndAdd(1) : aVarA2.f70866b.get()));
                g.a aVarA3 = g.a().a(str);
                jSONObject.putOpt("close_front_req_times", Long.valueOf(g.this.f70864c ? aVarA3.f70867c.getAndAdd(1) : aVarA3.f70867c.get()));
                jSONObject.putOpt("req_status", Long.valueOf(h.a(h.this)));
            } catch (JSONException unused) {
            }
            return jSONObject.toString();
        }
    }

    private h() {
        sg.bigo.ads.common.f.a.a().f69520d = this;
    }

    public static /* synthetic */ int a(h hVar) {
        return hVar.f70876h ? 1 : 2;
    }

    public static h a() {
        return f70869f;
    }

    @Override // sg.bigo.ads.common.f.a.InterfaceC0703a
    public final void a(long j10, long j11) {
        this.f70876h = true;
        this.f70877i = j10;
        a aVar = this.f70874e;
        aVar.f70880b = j11;
        long j12 = this.f70875g;
        if (j12 > 0) {
            long j13 = this.f70878j;
            if (j13 > 0 && j10 - j13 >= j12) {
                this.f70872c = 0L;
                this.f70873d = 0L;
                aVar.f70881c = System.currentTimeMillis();
                g.a().f70863a.clear();
            }
        }
        a aVar2 = this.f70874e;
        if (aVar2.f70881c == 0) {
            aVar2.f70881c = System.currentTimeMillis();
        }
        g.a().a(true);
    }

    public final void a(n nVar) {
        this.f70870a = nVar.a();
        this.f70871b = nVar.b();
        this.f70875g = nVar.c();
    }

    @Override // sg.bigo.ads.common.f.a.InterfaceC0703a
    public final void a(boolean z10, long j10, long j11, long j12) {
        this.f70876h = false;
        this.f70878j = j11;
        this.f70877i = 0L;
        long j13 = j11 - j10;
        if (j13 > 0 && j13 > this.f70871b) {
            this.f70872c += j13;
            this.f70873d = j13;
            if (this.f70870a) {
                sg.bigo.ads.core.d.b.a(z10 ? 1 : 2, j12, j13);
            }
        }
        g.a().a(false);
    }

    public final long b() {
        long j10 = this.f70877i;
        if (j10 <= 0) {
            return 0L;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime() - j10;
        if (jElapsedRealtime <= 0 || jElapsedRealtime <= this.f70871b) {
            return 0L;
        }
        return jElapsedRealtime;
    }
}
