package sg.bigo.ads.core.b;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;
import sg.bigo.ads.api.a.i;
import sg.bigo.ads.api.a.l;
import sg.bigo.ads.api.b.c;
import sg.bigo.ads.common.utils.j;
import sg.bigo.ads.common.utils.q;

/* JADX INFO: loaded from: classes11.dex */
public final class a {
    /* JADX WARN: Multi-variable type inference failed */
    @NonNull
    public static Map<String, Object> a(@NonNull String str, @NonNull l lVar, @NonNull sg.bigo.ads.api.b bVar, @Nullable sg.bigo.ads.api.core.b bVar2, @Nullable Integer num) {
        sg.bigo.ads.api.core.b bVarI;
        HashMap map = new HashMap();
        map.put("action", str);
        map.put("slot", lVar.l());
        map.put("config_id", Long.valueOf(i.f69318a.i()));
        map.put(FacebookMediationAdapter.RTB_PLACEMENT_PARAMETER, lVar.n());
        map.put("strategy_id", lVar.a());
        map.put("ad_type", Integer.valueOf(lVar.b()));
        map.put("abflags", q.a(i.f69318a.j(), lVar.o()));
        map.put("ts", Long.valueOf(System.currentTimeMillis()));
        map.put("begin_ts", Long.valueOf(bVar.f69326h.f69332f));
        map.put("banner_type", Integer.valueOf(bVar.f69321c));
        map.put("adn_name", "bigoad");
        JSONObject jSONObject = new JSONObject();
        sg.bigo.ads.api.b.a aVar = bVar.f69326h;
        j.a(jSONObject, "session_id", aVar.c());
        j.a(jSONObject, "gps_country", aVar.d());
        j.a(jSONObject, "sim_country", aVar.e());
        j.a(jSONObject, "system_country", aVar.f());
        j.a(jSONObject, "req_status", Integer.valueOf(aVar.h()));
        if (bVar2 != null) {
            j.a(jSONObject, "adx_country", bVar2.m());
        }
        if (lVar.w()) {
            j.a(jSONObject, "config_country", i.f69318a.k());
        }
        String strG = aVar.g();
        if (!q.a((CharSequence) strG)) {
            j.a(jSONObject, "load_ext", strG);
        }
        if (num != null) {
            j.a(jSONObject, "auc_mode", num);
        }
        if ((bVar instanceof sg.bigo.ads.api.b.b) && (bVarI = ((sg.bigo.ads.api.b.b) bVar).i()) != null) {
            j.a(jSONObject, "host_slot", bVarI.b());
            j.a(jSONObject, "host_placement", bVarI.c());
            j.a(jSONObject, "host_sid", Long.valueOf(bVarI.y()));
            j.a(jSONObject, "host_ad_id", bVarI.r());
        }
        if (bVar instanceof c) {
            j.a(jSONObject, "icon_req_num", Integer.valueOf(((c) bVar).j()));
        }
        map.put("extra_json", jSONObject.toString());
        return map;
    }

    /* JADX WARN: Code restructure failed: missing block: B:63:0x01b2, code lost:
    
        if (r0.bn() > 0) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x01c0, code lost:
    
        if (r0.bn() > 0) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x01c2, code lost:
    
        r0 = r0.bn();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.Map<java.lang.String, java.lang.Object> a(@androidx.annotation.NonNull java.lang.String r20, @androidx.annotation.NonNull sg.bigo.ads.api.a.l r21, @androidx.annotation.NonNull sg.bigo.ads.api.b r22, @androidx.annotation.Nullable sg.bigo.ads.api.core.b r23, @androidx.annotation.Nullable java.lang.Integer r24, @androidx.annotation.Nullable java.lang.String r25, @androidx.annotation.Nullable java.lang.String r26, @androidx.annotation.Nullable sg.bigo.ads.api.b.a r27) {
        /*
            Method dump skipped, instruction units count: 540
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: sg.bigo.ads.core.b.a.a(java.lang.String, sg.bigo.ads.api.a.l, sg.bigo.ads.api.b, sg.bigo.ads.api.core.b, java.lang.Integer, java.lang.String, java.lang.String, sg.bigo.ads.api.b.a):java.util.Map");
    }
}
