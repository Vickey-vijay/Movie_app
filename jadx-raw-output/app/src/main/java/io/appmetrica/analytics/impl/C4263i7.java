package io.appmetrica.analytics.impl;

import android.content.Context;
import android.location.Location;
import android.net.ConnectivityManager;
import io.appmetrica.analytics.coreapi.internal.system.NetworkType;
import io.appmetrica.analytics.coreutils.internal.system.SystemServiceUtils;
import kotlin.jvm.internal.Ref$ObjectRef;
import org.json.JSONObject;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.i7, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C4263i7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f56945a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f56946b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final yo f56947c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final A8 f56948d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final C4256i0 f56949e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final K8 f56950f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final C4340l7 f56951g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Q5 f56952h;

    public C4263i7(Context context, Uk uk2, int i10, yo yoVar, A8 a10, C4256i0 c4256i0, K8 k10, C4340l7 c4340l7) {
        this.f56945a = context;
        this.f56946b = i10;
        this.f56947c = yoVar;
        this.f56948d = a10;
        this.f56949e = c4256i0;
        this.f56950f = k10;
        this.f56951g = c4340l7;
        this.f56952h = a10.f54952a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static String b() {
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        C4456pn c4456pnC = C4418oa.I.C();
        C4237h7 c4237h7 = new C4237h7(ref$ObjectRef);
        synchronized (c4456pnC) {
            c4456pnC.f57528b.a(c4237h7);
        }
        return (String) ref$ObjectRef.element;
    }

    public final C4159e7 a() {
        long jOptLong;
        Jo jo2;
        Integer numValueOf = Integer.valueOf(this.f56952h.f55777e);
        String name = this.f56952h.getName();
        String value = this.f56952h.getValue();
        yo yoVar = this.f56947c;
        int i10 = this.f56946b;
        synchronized (yoVar) {
            JSONObject jSONObjectA = yoVar.f58037a.a();
            JSONObject jSONObjectOptJSONObject = jSONObjectA.optJSONObject("numbers_of_type");
            if (jSONObjectOptJSONObject == null) {
                jSONObjectOptJSONObject = new JSONObject();
            }
            jOptLong = jSONObjectOptJSONObject.optLong(String.valueOf(i10));
            jSONObjectOptJSONObject.put(String.valueOf(i10), 1 + jOptLong);
            yoVar.f58037a.a(jSONObjectA.put("numbers_of_type", jSONObjectOptJSONObject));
        }
        Long lValueOf = Long.valueOf(jOptLong);
        C4340l7 c4340l7 = this.f56951g;
        c4340l7.getClass();
        Lb lbM = C4418oa.I.m();
        Location userLocation = lbM.getUserLocation();
        if (userLocation != null) {
            int i11 = Jo.f55439b;
            Location location = new Location(userLocation);
            String provider = location.getProvider();
            location.setProvider("");
            jo2 = new Jo(location, provider);
        } else {
            Location systemLocation = lbM.getSystemLocation();
            jo2 = systemLocation != null ? new Jo(new Location(systemLocation), "") : null;
        }
        boolean z10 = c4340l7.f57176a.f57200d;
        Double dValueOf = jo2 != null ? Double.valueOf(jo2.getLatitude()) : null;
        Double dValueOf2 = jo2 != null ? Double.valueOf(jo2.getLongitude()) : null;
        Long lValueOf2 = jo2 != null ? Long.valueOf(jo2.getTime()) : null;
        Integer numValueOf2 = jo2 != null ? Integer.valueOf((int) jo2.getAccuracy()) : null;
        Integer numValueOf3 = jo2 != null ? Integer.valueOf((int) jo2.getBearing()) : null;
        Integer numValueOf4 = jo2 != null ? Integer.valueOf((int) jo2.getSpeed()) : null;
        C4288j7 c4288j7 = new C4288j7(Boolean.valueOf(z10), dValueOf2, dValueOf, jo2 != null ? Integer.valueOf((int) jo2.getAltitude()) : null, numValueOf3, numValueOf2, numValueOf4, lValueOf2, jo2 != null ? jo2.getProvider() : null, jo2 != null ? jo2.f55440a : null);
        String str = this.f56952h.f55775c;
        C4256i0 c4256i0 = this.f56949e;
        String str2 = c4256i0.f56933a;
        Long lValueOf3 = Long.valueOf(c4256i0.f56934b);
        Integer numValueOf5 = Integer.valueOf(this.f56952h.f55779g);
        Context context = this.f56945a;
        De de2 = He.f55301a;
        Integer numValueOf6 = Integer.valueOf(((Integer) He.f55303c.a((NetworkType) SystemServiceUtils.accessSystemServiceSafelyOrDefault((ConnectivityManager) context.getSystemService("connectivity"), "getting connection type", "ConnectivityManager", NetworkType.UNDEFINED, new Ge()))).intValue());
        String strB = b();
        J8 j10 = this.f56948d.f54953b;
        Q5 q10 = this.f56952h;
        return new C4159e7(numValueOf, name, value, lValueOf, c4288j7, str, str2, lValueOf3, numValueOf5, numValueOf6, strB, j10, q10.f55780h, q10.f55783k, q10.f55784l, q10.f55786n, q10.f55787o, this.f56950f.fromModel(q10.f55788p));
    }

    public /* synthetic */ C4263i7(Context context, Uk uk2, int i10, yo yoVar, A8 a10, C4350lh c4350lh, C4256i0 c4256i0) {
        this(context, uk2, i10, yoVar, a10, c4256i0, new K8(), new C4340l7(c4350lh));
    }
}
