package com.inmobi.media;

import android.content.Context;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.inmobi.media.Gh;
import com.ironsource.C3426d4;
import com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Result;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public final class Gh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f22736a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f22737b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f22738c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f22739d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Cb f22740e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Gi f22741f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final List f22742g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ConcurrentHashMap f22743h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final AtomicBoolean f22744i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f22745j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final AtomicInteger f22746k;

    public final void a(Ab ab2, String str, String str2) throws JSONException {
        ck.p.j(ab2, "logLevel");
        ck.p.j(str, "tag");
        ck.p.j(str2, "message");
        if (this.f22744i.get()) {
            return;
        }
        SimpleDateFormat simpleDateFormat = Db.f22516a;
        ck.p.j(ab2, "logLevel");
        ck.p.j(str, "tag");
        ck.p.j(str2, "message");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("scope", ab2.name());
        jSONObject.put("timestamp", Db.f22516a.format(new Date()));
        jSONObject.put("tag", str);
        jSONObject.put("data", str2);
        nk.l0 l0Var = Sb.f23496a;
        Rb.a(new Eh(this, ab2, jSONObject, null));
    }

    public final void b() {
        Objects.toString(this.f22744i);
        if ((this.f22739d || this.f22741f.a()) && !this.f22744i.getAndSet(true)) {
            nk.l0 l0Var = Sb.f23496a;
            Rb.a(new Dh(this, null));
        }
    }

    public Gh(Context context, double d10, Ab ab2, long j10, int i10) {
        ck.p.j(context, GAMConfig.KEY_CONTEXT);
        ck.p.j(ab2, "logLevel");
        this.f22736a = context;
        this.f22737b = j10;
        this.f22738c = i10;
        this.f22739d = false;
        this.f22740e = new Cb(ab2);
        this.f22741f = new Gi(d10);
        this.f22742g = Collections.synchronizedList(new ArrayList());
        this.f22743h = new ConcurrentHashMap();
        this.f22744i = new AtomicBoolean(false);
        this.f22745j = "";
        this.f22746k = new AtomicInteger(0);
    }

    public final String c() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        synchronized (this.f22743h) {
            for (Map.Entry entry : this.f22743h.entrySet()) {
                jSONObject2.put((String) entry.getKey(), entry.getValue());
            }
            mj.r rVar = mj.r.f64562a;
        }
        jSONObject.put("vitals", jSONObject2);
        jSONObject.put(CreativeInfo.f44317an, d());
        String string = jSONObject.toString();
        ck.p.i(string, "toString(...)");
        return string;
    }

    public final JSONArray d() {
        JSONArray jSONArray = new JSONArray();
        List list = this.f22742g;
        ck.p.i(list, "logData");
        synchronized (list) {
            List list2 = this.f22742g;
            ck.p.i(list2, "logData");
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                jSONArray.put((JSONObject) it.next());
            }
            mj.r rVar = mj.r.f64562a;
        }
        return jSONArray;
    }

    public final boolean e() throws JSONException {
        if (this.f22742g.isEmpty() || this.f22743h.isEmpty()) {
            return true;
        }
        String strC = c();
        ck.p.j(strC, "<this>");
        return ck.p.e(strC, JsonUtils.EMPTY_JSON);
    }

    public final void b(boolean z10) {
        Objects.toString(this.f22744i);
        if (this.f22744i.get()) {
            return;
        }
        this.f22739d = z10;
    }

    public final void a(String str, String str2) {
        ck.p.j(str, C3426d4.i.W);
        ck.p.j(str2, "value");
        Objects.toString(this.f22744i);
        if (this.f22744i.get()) {
            return;
        }
        this.f22743h.put(str, str2);
    }

    public final void a() {
        Objects.toString(this.f22744i);
        if ((this.f22739d || this.f22741f.a()) && !this.f22744i.get()) {
            nk.l0 l0Var = Sb.f23496a;
            Rb.a(new Ch(this, null));
        }
    }

    public final void a(final boolean z10) {
        Objects.toString(this.f22744i);
        nk.l0 l0Var = Sb.f23496a;
        if (Result.m3461exceptionOrNullimpl(Rb.a(new bk.a() { // from class: b7.w0
            @Override // bk.a
            public final Object invoke() {
                return Gh.a(this.f5220b, z10);
            }
        })) != null) {
            try {
                Result.m3458constructorimpl(mj.r.f64562a);
            } catch (Throwable th2) {
                Result.a aVar = Result.Companion;
                Result.m3458constructorimpl(kotlin.c.a(th2));
            }
        }
    }

    public static final mj.r a(Gh gh2, boolean z10) throws InterruptedException {
        if (gh2.e()) {
            return mj.r.f64562a;
        }
        long timeInMillis = Calendar.getInstance().getTimeInMillis();
        if (gh2.f22745j.length() == 0) {
            nk.l0 l0Var = Sb.f23496a;
            gh2.f22745j = Rb.a(gh2.f22736a, timeInMillis);
        }
        if (gh2.a(gh2.f22745j)) {
            nk.i.b(null, new Fh(gh2, timeInMillis, z10, null), 1, null);
        }
        return mj.r.f64562a;
    }

    public final boolean a(String str) {
        return Tb.a("RemoteLogger", c(), str);
    }
}
