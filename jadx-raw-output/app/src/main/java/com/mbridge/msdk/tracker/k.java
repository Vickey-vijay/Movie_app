package com.mbridge.msdk.tracker;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import java.util.List;
import java.util.UUID;
import org.json.JSONObject;

/* JADX INFO: compiled from: Global.java */
/* JADX INFO: loaded from: classes8.dex */
class k {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static volatile String f38134o = "";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f38135a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final m f38136b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Context f38137c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private x f38138d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private JSONObject f38139e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private List<String> f38140f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private List<String> f38141g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private volatile c f38142h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private volatile l f38143i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private volatile d f38144j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private volatile j f38145k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private volatile s f38146l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private volatile boolean f38147m = true;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private volatile o f38148n;

    public void a(Context context) {
        this.f38137c = context;
    }

    public String t() {
        return "event_table";
    }

    public void a(x xVar) {
        this.f38138d = xVar;
    }

    public x b() {
        x xVar = this.f38138d;
        if (xVar != null) {
            return xVar;
        }
        x xVarA = new x.b().a();
        this.f38138d = xVarA;
        return xVarA;
    }

    public Context c() {
        return this.f38137c;
    }

    public c d() {
        if (y.b(this.f38142h)) {
            synchronized (k.class) {
                if (y.b(this.f38142h)) {
                    String strT = t();
                    this.f38142h = new c(new b(c(), e(), strT), strT);
                }
            }
        }
        return this.f38142h;
    }

    public d f() {
        if (y.b(this.f38144j)) {
            this.f38144j = b().f38352h;
        }
        return this.f38144j;
    }

    public l g() {
        if (y.b(this.f38143i)) {
            synchronized (k.class) {
                if (y.b(this.f38143i)) {
                    this.f38143i = new q(new g(d(), p()));
                }
            }
        }
        return this.f38143i;
    }

    public j h() {
        if (y.b(this.f38145k)) {
            synchronized (k.class) {
                if (y.b(this.f38145k)) {
                    this.f38145k = new j();
                }
            }
        }
        return this.f38145k;
    }

    public o m() {
        if (y.b(this.f38148n)) {
            synchronized (k.class) {
                if (y.b(this.f38148n)) {
                    this.f38148n = new o(k(), n(), r(), q());
                }
            }
        }
        return this.f38148n;
    }

    public JSONObject o() {
        JSONObject jSONObject = this.f38139e;
        if (jSONObject != null) {
            return jSONObject;
        }
        JSONObject jSONObject2 = new JSONObject();
        this.f38139e = jSONObject2;
        return jSONObject2;
    }

    public s p() {
        if (y.b(this.f38146l)) {
            synchronized (k.class) {
                if (y.b(this.f38146l)) {
                    this.f38146l = new s(this);
                }
            }
        }
        return this.f38146l;
    }

    public String s() {
        if (!TextUtils.isEmpty(f38134o)) {
            return f38134o;
        }
        String string = UUID.randomUUID().toString();
        f38134o = string;
        return string;
    }

    public m u() {
        return this.f38136b;
    }

    public String v() {
        return this.f38135a;
    }

    public boolean w() {
        return this.f38147m;
    }

    public String x() {
        if (!y.b(this.f38137c) && !y.b(this.f38138d)) {
            try {
                p().j();
                this.f38147m = false;
                if (TextUtils.isEmpty(f38134o)) {
                    f38134o = UUID.randomUUID().toString();
                }
                return f38134o;
            } catch (Exception e10) {
                if (a.f38101a) {
                    Log.e("TrackManager", "start error", e10);
                }
                this.f38147m = true;
            }
        }
        return "";
    }

    public k(String str, m mVar) {
        this.f38135a = str;
        this.f38136b = mVar;
    }

    public void a(JSONObject jSONObject) {
        this.f38139e = jSONObject;
    }

    public String e() {
        if (TextUtils.isEmpty(v())) {
            return String.format("track_manager_%s.db", "default");
        }
        return String.format("track_manager_%s.db", v());
    }

    public int i() {
        if (b().f38345a < 0) {
            return 50;
        }
        return b().f38345a;
    }

    public int j() {
        return Math.max(b().f38349e, 0);
    }

    public int k() {
        if (b().f38348d <= 0) {
            return 2;
        }
        return b().f38348d;
    }

    public int l() {
        return Math.max(b().f38346b, 0);
    }

    public p n() {
        return b().f38351g;
    }

    public int q() {
        return b().f38347c;
    }

    public w r() {
        return b().f38353i;
    }

    public boolean a(e eVar) {
        if (y.b(eVar)) {
            return false;
        }
        f fVar = b().f38354j;
        if (y.a(fVar)) {
            try {
                return fVar.a(eVar);
            } catch (Exception e10) {
                if (a.f38101a) {
                    Log.e("TrackManager", "event filter apply exception", e10);
                }
            }
        }
        String strG = eVar.g();
        if (TextUtils.isEmpty(strG)) {
            return false;
        }
        List<String> list = this.f38141g;
        if (list != null) {
            try {
                return !list.contains(strG);
            } catch (Exception e11) {
                if (a.f38101a) {
                    Log.e("TrackManager", "disallowTrackEventNames contains exception", e11);
                }
            }
        }
        List<String> list2 = this.f38140f;
        if (list2 != null) {
            try {
                return list2.contains(strG);
            } catch (Exception e12) {
                if (a.f38101a) {
                    Log.e("TrackManager", "allowTrackEventNames contains exception", e12);
                }
            }
        }
        return true;
    }

    public boolean a() throws IllegalStateException {
        if (!y.b(b())) {
            if (!y.b(f())) {
                if (!y.b(r())) {
                    if (!y.b(n()) && !y.b(n().b())) {
                        if (TextUtils.isEmpty(n().c())) {
                            throw new IllegalStateException("report url is null");
                        }
                        return true;
                    }
                    throw new IllegalStateException("networkStackConfig or stack can not be null");
                }
                throw new IllegalStateException("responseHandler can not be null");
            }
            throw new IllegalStateException("decorate can not be null");
        }
        throw new IllegalStateException("config can not be null");
    }
}
