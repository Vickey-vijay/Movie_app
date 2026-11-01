package sg.bigo.ads.controller.a;

import android.content.Context;
import android.os.Parcel;
import android.text.TextUtils;
import android.util.Log;
import android.webkit.ValueCallback;
import androidx.annotation.NonNull;
import com.safedk.android.analytics.events.CrashEvent;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
import sg.bigo.ads.common.n;
import sg.bigo.ads.common.o;

/* JADX INFO: loaded from: classes2.dex */
public final class a extends sg.bigo.ads.common.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f70331a;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f70332e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f70333f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final sg.bigo.ads.controller.a.a.c f70334g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final sg.bigo.ads.controller.a.a.b f70335h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final sg.bigo.ads.controller.a.a.b f70336i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final sg.bigo.ads.controller.a.a.f f70337j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final sg.bigo.ads.controller.a.a.e f70338k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final sg.bigo.ads.controller.a.a.h f70339l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final sg.bigo.ads.controller.a.a.d f70340m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f70341n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f70342o;

    public a(@NonNull Context context, sg.bigo.ads.api.a.h hVar) {
        super(context);
        this.f70334g = new sg.bigo.ads.controller.a.a.c(sg.bigo.ads.b.a());
        this.f70335h = new sg.bigo.ads.controller.a.a.b(sg.bigo.ads.b.b(), "");
        this.f70336i = new sg.bigo.ads.controller.a.a.b(sg.bigo.ads.b.c(), "");
        this.f70337j = new sg.bigo.ads.controller.a.a.f();
        this.f70338k = new sg.bigo.ads.controller.a.a.e();
        this.f70339l = new sg.bigo.ads.controller.a.a.h();
        this.f70340m = new sg.bigo.ads.controller.a.a.d(hVar);
        this.f70333f = "SDK";
        this.f70342o = false;
    }

    private static JSONObject a(JSONObject jSONObject) {
        return jSONObject != null ? jSONObject : new JSONObject();
    }

    @Override // sg.bigo.ads.common.e
    public final String a() {
        return "bigoad_antiban_config.dat";
    }

    @NonNull
    public final h a(String str, String str2, Map<String, String> map, String str3, int i10) {
        if (TextUtils.isEmpty(str)) {
            return h.a("", false, 4003, "config content is empty");
        }
        String strTrim = str.trim();
        boolean zStartsWith = strTrim.startsWith(com.safedk.android.analytics.brandsafety.creatives.discoveries.h.f44171d);
        final ArrayList arrayList = new ArrayList();
        if (!zStartsWith) {
            String strA = sg.bigo.ads.common.j.a.a(strTrim, "FEFFFFFFFFFAFFFDCBFFFFFFFFFFFF4F", new ValueCallback<Exception>() { // from class: sg.bigo.ads.controller.a.a.1
                @Override // android.webkit.ValueCallback
                public final /* synthetic */ void onReceiveValue(Exception exc) {
                    Exception exc2 = exc;
                    if (exc2 != null) {
                        arrayList.add(exc2);
                    }
                }
            });
            if (TextUtils.isEmpty(strA)) {
                sg.bigo.ads.common.t.a.a(0, "AntiBanUtils", "decrypt error, decrypted content is empty.");
                strTrim = null;
            } else {
                sg.bigo.ads.common.t.a.a(0, 3, "AntiBanUtils", "decrypt, cryptStr=" + strTrim + ", hexStringSecKey=FEFFFFFFFFFAFFFDCBFFFFFFFFFFFF4F, decryptStr=" + strA);
                strTrim = strA;
            }
        }
        String str4 = strTrim;
        if (!sg.bigo.ads.common.utils.k.a((Collection) arrayList)) {
            this.f70332e = true;
            return h.a(str4, zStartsWith, 4004, Log.getStackTraceString((Throwable) arrayList.get(0)));
        }
        try {
            JSONObject jSONObject = new JSONObject(str4);
            int iOptInt = jSONObject.optInt("version", 0);
            int i11 = this.f70341n;
            if (!(iOptInt < i11 ? false : iOptInt == i11 ? this.f70342o : true)) {
                return new h(str4, false, zStartsWith, 0, "local config version is " + this.f70341n + ", remote version is " + iOptInt);
            }
            boolean z10 = iOptInt == i11;
            this.f70341n = iOptInt;
            this.f70331a = zStartsWith;
            this.f70333f = str2;
            this.f70334g.a(a(jSONObject.optJSONObject("cfg_svr")), z10, str3, i10);
            this.f70335h.a(a(jSONObject.optJSONObject("report_svr")), z10, str3, i10);
            this.f70336i.a(a(jSONObject.optJSONObject("ad_svr")), z10, str3, i10);
            if (!z10) {
                this.f70337j.a(a(jSONObject.optJSONObject("third_pay_svr")));
                this.f70338k.a(a(jSONObject.optJSONObject("third_free_svr")));
                sg.bigo.ads.controller.a.a.h hVar = this.f70339l;
                JSONObject jSONObjectA = a(jSONObject.optJSONObject("uri_opt_timeout"));
                synchronized (hVar) {
                    hVar.f70402a = jSONObjectA.optLong("getsdkconfig", 0L) * 1000;
                    hVar.f70403b = jSONObjectA.optLong("getuniad", 0L) * 1000;
                    hVar.f70404c = jSONObjectA.optLong("unicallback", 0L) * 1000;
                    hVar.f70405d = jSONObjectA.optLong("getuniconfig", 0L) * 1000;
                    hVar.f70406e = jSONObjectA.optLong("reportunibaina", 0L) * 1000;
                }
                sg.bigo.ads.controller.a.a.d dVar = this.f70340m;
                JSONObject jSONObjectA2 = a(jSONObject.optJSONObject("req_pool_size"));
                synchronized (dVar) {
                    dVar.f70372a = jSONObjectA2.optInt("sdk_config", 3);
                    dVar.f70373b = jSONObjectA2.optInt(CrashEvent.f44624e, 2);
                    dVar.f70374c = jSONObjectA2.optInt("config_ad", 12);
                    dVar.f70375d = jSONObjectA2.optInt("callback", 3);
                    dVar.f70376e = jSONObjectA2.optInt("vast_wrapper", 3);
                    dVar.f70377f = jSONObjectA2.optInt("tracker", 10);
                    dVar.f70378g = jSONObjectA2.optInt("creative", 5);
                }
                if (!sg.bigo.ads.common.utils.k.a(map)) {
                    for (Map.Entry<String, String> entry : map.entrySet()) {
                        a(entry.getKey(), entry.getValue());
                    }
                }
            }
            this.f70342o = false;
            return new h(str4, zStartsWith);
        } catch (JSONException e10) {
            return h.a(str4, zStartsWith, 4005, Log.getStackTraceString(e10));
        }
    }

    @Override // sg.bigo.ads.common.e
    public final void a(Context context) {
        super.a(context);
        if (this.f69512d) {
            try {
                new File(o.a(context), "bigoad_antiban.dat").deleteOnExit();
                new File(o.a(context), "bigoad_api_antiban.dat").deleteOnExit();
            } catch (Exception unused) {
            }
        }
    }

    @Override // sg.bigo.ads.common.f
    public final void a(@NonNull Parcel parcel) {
        parcel.writeInt(4);
        parcel.writeInt(this.f70341n);
        n.a(parcel, this.f70331a);
        n.a(parcel, this.f70332e);
        parcel.writeString(this.f70333f);
        n.a(parcel, this.f70334g);
        n.a(parcel, this.f70335h);
        n.a(parcel, this.f70336i);
        n.a(parcel, this.f70337j);
        n.a(parcel, this.f70338k);
        n.a(parcel, this.f70339l);
        n.a(parcel, this.f70340m);
        n.a(parcel, this.f70342o);
    }

    public final boolean a(@NonNull String str, @NonNull String str2) {
        return this.f70336i.a(str, str2) | this.f70334g.a(str, str2) | false | this.f70335h.a(str, str2);
    }

    @Override // sg.bigo.ads.common.e
    public final String b() {
        return "AntiBanConfig";
    }

    @Override // sg.bigo.ads.common.f
    public final void b(@NonNull Parcel parcel) {
        if (n.a(parcel, 4) < 4) {
            return;
        }
        this.f70341n = n.a(parcel, 0);
        this.f70331a = n.b(parcel, false);
        this.f70332e = n.b(parcel, false);
        this.f70333f = n.a(parcel, "SDK");
        n.b(parcel, this.f70334g);
        n.b(parcel, this.f70335h);
        n.b(parcel, this.f70336i);
        n.b(parcel, this.f70337j);
        n.b(parcel, this.f70338k);
        n.b(parcel, this.f70339l);
        n.b(parcel, this.f70340m);
        this.f70342o = n.b(parcel, true);
    }

    public final void c() {
        sg.bigo.ads.controller.a.a.c cVar = this.f70334g;
        if (cVar != null) {
            cVar.a();
        }
        sg.bigo.ads.controller.a.a.b bVar = this.f70335h;
        if (bVar != null) {
            bVar.a();
        }
        sg.bigo.ads.controller.a.a.b bVar2 = this.f70336i;
        if (bVar2 != null) {
            bVar2.a();
        }
        a(0L);
    }

    @NonNull
    public final String toString() {
        return super.toString();
    }
}
