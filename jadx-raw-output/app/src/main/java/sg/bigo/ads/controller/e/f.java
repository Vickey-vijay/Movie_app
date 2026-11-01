package sg.bigo.ads.controller.e;

import android.os.Build;
import android.util.Base64;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.ironsource.Q6;
import com.mbridge.msdk.MBridgeConstans;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.zip.GZIPOutputStream;
import org.json.JSONException;
import org.json.JSONObject;
import sg.bigo.ads.common.utils.q;
import sg.bigo.ads.controller.c.p;

/* JADX INFO: loaded from: classes2.dex */
public class f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static boolean f70855b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f70856a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f70858d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f70859e = 1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f70860f = 2;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f70861g = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f70857c = 0;

    private String c(d dVar) {
        sg.bigo.ads.api.a.h hVar = sg.bigo.ads.api.a.i.f69318a;
        this.f70856a = (hVar == null || hVar.v() != 1) ? d(dVar) : e(dVar);
        this.f70857c = System.currentTimeMillis();
        return this.f70856a;
    }

    @Nullable
    private static String d(d dVar) {
        String string;
        if (dVar == null) {
            sg.bigo.ads.common.t.a.a(0, "BigoAdSdk", "Failed to generate a token due to uninitialized provider.");
            return null;
        }
        String appKey = dVar.f70804a.getAppKey();
        String str = dVar.f70807d;
        String str2 = dVar.f70808e;
        int i10 = dVar.f70809f;
        String channel = dVar.f70804a.getChannel();
        String str3 = Build.VERSION.RELEASE;
        String str4 = dVar.f70810g;
        String str5 = dVar.f70811h;
        String str6 = dVar.f70812i;
        String str7 = dVar.f70814k;
        int i11 = dVar.f70815l;
        String str8 = dVar.f70816m;
        String strR = dVar.r();
        String strU = dVar.U();
        String strA = dVar.A();
        String strA2 = sg.bigo.ads.common.b.a.a(dVar.f70805b);
        String strF = dVar.f70806c.F();
        String strD = q.d(sg.bigo.ads.common.utils.c.a());
        int iD = dVar.D();
        String strJ = dVar.f70806c.j();
        String strG = dVar.G();
        String strR2 = dVar.R();
        String strS = dVar.S();
        String strA3 = sg.bigo.ads.controller.g.d.a(null, dVar);
        String strR3 = sg.bigo.ads.common.x.a.r();
        sg.bigo.ads.common.b bVarAc = dVar.ac();
        String strValueOf = bVarAc != null ? String.valueOf(bVarAc.f69491c) : "";
        String strValueOf2 = bVarAc != null ? String.valueOf(bVarAc.f69489a) : "";
        String strValueOf3 = bVarAc != null ? String.valueOf(bVarAc.f69490b) : "";
        int i12 = dVar.f70822s;
        String strE = sg.bigo.ads.common.m.b.e();
        int iO = sg.bigo.ads.common.x.a.o();
        int iN = sg.bigo.ads.common.x.a.n();
        int iP = sg.bigo.ads.common.x.a.p();
        int iB = sg.bigo.ads.core.d.b.b();
        String strAe = dVar.ae();
        boolean z10 = dVar.z();
        boolean zF = dVar.F();
        boolean zAd = dVar.ad();
        boolean zK = sg.bigo.ads.common.aa.b.k(dVar.f70805b);
        int iL = sg.bigo.ads.common.aa.b.l(dVar.f70805b);
        boolean zC = sg.bigo.ads.common.aa.b.c();
        int i13 = dVar.f70824u;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.putOpt(MBridgeConstans.APP_KEY, appKey);
            jSONObject.putOpt("pkg_name", str);
            jSONObject.putOpt("pkg_ver", str2);
            jSONObject.putOpt("pkg_vc", Integer.valueOf(i10));
            jSONObject.putOpt("pkg_ch", channel);
            jSONObject.putOpt(Q6.F, "android");
            jSONObject.putOpt("os_ver", str3);
            jSONObject.putOpt("os_lang", str4);
            jSONObject.putOpt("vendor", str5);
            jSONObject.putOpt("model", str6);
            jSONObject.putOpt("resolution", str7);
            jSONObject.putOpt("dpi", Integer.valueOf(i11));
            jSONObject.putOpt("dpi_f", str8);
            jSONObject.putOpt("net", strR);
            jSONObject.putOpt("country", strU);
            jSONObject.putOpt("sdk_ver", "5.6.2");
            jSONObject.putOpt("sdk_vc", 50602);
            jSONObject.putOpt(Q6.V0, strA);
            jSONObject.putOpt("af_id", strA2);
            jSONObject.putOpt("uid", strF);
            jSONObject.putOpt("timezone", strD);
            jSONObject.putOpt("timestamp", Integer.valueOf(iD));
            jSONObject.putOpt("abflags", strJ);
            jSONObject.putOpt("hw_id", strG);
            jSONObject.putOpt("sim_country", strR2);
            jSONObject.putOpt("system_country", strS);
            jSONObject.putOpt("ad_info", strA3);
            jSONObject.putOpt(CommonUrlParts.UUID, strR3);
            jSONObject.putOpt("bat_stat", strValueOf);
            jSONObject.putOpt("bat_num", strValueOf2);
            jSONObject.putOpt("bat_scale", strValueOf3);
            jSONObject.putOpt("simulator_file", Integer.valueOf(i12));
            jSONObject.putOpt("tc_string", strE);
            jSONObject.putOpt("fire_id", strAe);
            jSONObject.putOpt("lat_enable", Integer.valueOf(z10 ? 1 : 0));
            jSONObject.putOpt("hw_lat_enable", Integer.valueOf(zF ? 1 : 0));
            jSONObject.putOpt("fire_lat_enable", Integer.valueOf(zAd ? 1 : 0));
            jSONObject.putOpt("lgdp", Integer.valueOf(iO));
            jSONObject.putOpt("ccpa", Integer.valueOf(iN));
            jSONObject.putOpt("coppa", Integer.valueOf(iP));
            jSONObject.putOpt("consent_status", Integer.valueOf(iB));
            jSONObject.putOpt("batsa", Integer.valueOf(zK ? 1 : 0));
            jSONObject.putOpt("datasa", Integer.valueOf(iL));
            jSONObject.putOpt("root", Integer.valueOf(zC ? 1 : 0));
            jSONObject.putOpt("imp_pattern", Integer.valueOf(dVar.av()));
            jSONObject.putOpt("gp_vc", Integer.valueOf(i13));
            string = jSONObject.toString();
        } catch (Exception unused) {
            sg.bigo.ads.common.t.a.a(0, "BigoAdSdk", "Failed to generate a token due to unknown error.");
            string = null;
        }
        if (string == null) {
            return null;
        }
        return sg.bigo.ads.common.j.a.a(string, "FEFFFFFFFFFAFFFDCBFFFFFFFFFFFF4F") + "a2";
    }

    private static String e(d dVar) {
        if (dVar == null) {
            sg.bigo.ads.common.t.a.a(0, "BigoAdSdk", "Failed to generate a token due to uninitialized provider.");
            return null;
        }
        String strF = f(dVar);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("ver", 1);
            jSONObject.put("token", strF);
        } catch (JSONException unused) {
        }
        return jSONObject.toString();
    }

    private static String f(@NonNull d dVar) {
        p pVar = new p();
        pVar.a(dVar.f70804a.getAppKey());
        pVar.a(dVar.f70807d);
        pVar.a(dVar.f70808e);
        pVar.a(dVar.f70809f);
        pVar.a(dVar.f70804a.getChannel());
        pVar.a("android");
        pVar.a(Build.VERSION.RELEASE);
        pVar.a(dVar.f70810g);
        pVar.a(dVar.f70811h);
        pVar.a(dVar.f70812i);
        pVar.a(dVar.f70814k);
        pVar.a(dVar.f70815l);
        pVar.a(dVar.f70816m);
        pVar.a(dVar.r());
        pVar.a(dVar.U());
        pVar.a("5.6.2");
        pVar.a(50602);
        pVar.a(dVar.A());
        pVar.a(sg.bigo.ads.common.b.a.a(dVar.f70805b));
        pVar.a(dVar.f70806c.F());
        pVar.a(q.d(sg.bigo.ads.common.utils.c.a()));
        pVar.a(dVar.D());
        pVar.a(dVar.f70806c.j());
        pVar.a(dVar.G());
        pVar.a(dVar.R());
        pVar.a(dVar.S());
        pVar.a(sg.bigo.ads.controller.g.d.a(null, dVar));
        pVar.a(sg.bigo.ads.common.x.a.r());
        sg.bigo.ads.common.b bVarAc = dVar.ac();
        String strValueOf = bVarAc != null ? String.valueOf(bVarAc.f69491c) : "";
        String strValueOf2 = bVarAc != null ? String.valueOf(bVarAc.f69489a) : "";
        String strValueOf3 = bVarAc != null ? String.valueOf(bVarAc.f69490b) : "";
        pVar.a(strValueOf);
        pVar.a(strValueOf2);
        pVar.a(strValueOf3);
        pVar.a(dVar.f70822s);
        pVar.a(sg.bigo.ads.common.m.b.e());
        pVar.a(dVar.ae());
        pVar.a(dVar.z() ? 1 : 0);
        pVar.a(dVar.F() ? 1 : 0);
        pVar.a(dVar.ad() ? 1 : 0);
        pVar.a(sg.bigo.ads.common.x.a.o());
        pVar.a(sg.bigo.ads.common.x.a.n());
        pVar.a(sg.bigo.ads.common.x.a.p());
        pVar.a(sg.bigo.ads.core.d.b.b());
        pVar.a(sg.bigo.ads.common.aa.b.k(dVar.f70805b) ? 1 : 0);
        pVar.a(sg.bigo.ads.common.aa.b.l(dVar.f70805b));
        pVar.a(sg.bigo.ads.common.aa.b.c() ? 1 : 0);
        pVar.a("");
        pVar.a("");
        pVar.a("");
        pVar.a(dVar.av());
        pVar.a(dVar.f70824u);
        int iA = 0;
        for (int i10 = 0; i10 < pVar.f70706a.size(); i10++) {
            iA += pVar.f70706a.get(i10).a();
        }
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(iA);
        byteBufferAllocate.order(ByteOrder.LITTLE_ENDIAN);
        for (int i11 = 0; i11 < pVar.f70706a.size(); i11++) {
            pVar.f70706a.get(i11).a(byteBufferAllocate);
        }
        byte[] bArrArray = byteBufferAllocate.array();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            gZIPOutputStream.write(bArrArray);
            gZIPOutputStream.close();
            String strEncodeToString = Base64.encodeToString(byteArrayOutputStream.toByteArray(), 2);
            byteArrayOutputStream.close();
            return strEncodeToString;
        } catch (IOException unused) {
            return null;
        }
    }

    public final String a(d dVar) {
        String str = this.f70856a;
        if (str != null) {
            return str;
        }
        synchronized (f.class) {
            String str2 = this.f70856a;
            if (str2 != null) {
                return str2;
            }
            String strC = c(dVar);
            this.f70856a = strC;
            return strC;
        }
    }

    public final synchronized String b(d dVar) {
        String strC;
        strC = c(dVar);
        this.f70856a = strC;
        return strC;
    }
}
