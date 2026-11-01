package com.inmobi.media;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.location.Location;
import com.inmobi.media.core.config.models.AdConfig;
import com.ironsource.C3426d4;
import com.safedk.android.analytics.brandsafety.ImpressionLog;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.inmobi.media.w9, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public abstract class AbstractC3277w9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f25628a;

    /* JADX WARN: Code duplicated, block: B:7:0x0026  */
    public static void a(LinkedHashMap linkedHashMap) {
        boolean z10;
        ck.p.j(linkedHashMap, "<this>");
        if (AbstractC2875g5.a(Ji.f22951a) != null) {
            C2924i4 c2924i4 = Y3.f23815a;
            ck.p.j(AdConfig.class, "clazz");
            if (((AdConfig) Y3.f23815a.a(AdConfig.class)).isCCTEnabled()) {
                z10 = true;
            } else {
                z10 = false;
            }
        } else {
            z10 = false;
        }
        linkedHashMap.put("cct-enabled", String.valueOf(z10));
    }

    public AbstractC3277w9(String str) {
        ck.p.j(str, "url");
        ck.p.j(str, "url");
        this.f25628a = str;
    }

    public static void b(LinkedHashMap linkedHashMap) {
        Pair pair;
        ck.p.j(linkedHashMap, "<this>");
        C3298x5.f25687a.getClass();
        Pair pairH = C3298x5.h();
        ck.p.j(linkedHashMap, "<this>");
        if (pairH != null) {
            linkedHashMap.put(pairH.getFirst(), pairH.getSecond());
        }
        Pair pairJ = C3298x5.j();
        ck.p.j(linkedHashMap, "<this>");
        if (pairJ != null) {
            linkedHashMap.put(pairJ.getFirst(), pairJ.getSecond());
        }
        Pair pair2 = C3298x5.f25695i;
        ck.p.j(linkedHashMap, "<this>");
        if (pair2 != null) {
            linkedHashMap.put(pair2.getFirst(), pair2.getSecond());
        }
        Context context = Ji.f22951a;
        Pair pair3 = null;
        if (context == null) {
            pair = null;
        } else {
            Intent intentA = F3.a(context, (BroadcastReceiver) null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
            pair = new Pair("d-bat-chrg", (intentA != null ? intentA.getIntExtra("status", -1) : -1) == 2 ? "1" : "0");
        }
        ck.p.j(linkedHashMap, "<this>");
        if (pair != null) {
            linkedHashMap.put(pair.getFirst(), pair.getSecond());
        }
        Pair pairO = C3298x5.o();
        ck.p.j(linkedHashMap, "<this>");
        if (pairO != null) {
            linkedHashMap.put(pairO.getFirst(), pairO.getSecond());
        }
        Pair pairE = C3298x5.e();
        ck.p.j(linkedHashMap, "<this>");
        if (pairE != null) {
            linkedHashMap.put(pairE.getFirst(), pairE.getSecond());
        }
        Context context2 = Ji.f22951a;
        if (context2 != null) {
            Intent intentA2 = F3.a(context2, (BroadcastReceiver) null, new IntentFilter("android.intent.action.HEADSET_PLUG"));
            pair3 = (intentA2 == null || intentA2.getIntExtra("state", 0) != 1) ? new Pair("d-w-h", "0") : new Pair("d-w-h", "1");
        }
        ck.p.j(linkedHashMap, "<this>");
        if (pair3 != null) {
            linkedHashMap.put(pair3.getFirst(), pair3.getSecond());
        }
        Pair pairF = C3298x5.f();
        ck.p.j(linkedHashMap, "<this>");
        if (pairF != null) {
            linkedHashMap.put(pairF.getFirst(), pairF.getSecond());
        }
        Pair pairG = C3298x5.g();
        ck.p.j(linkedHashMap, "<this>");
        if (pairG != null) {
            linkedHashMap.put(pairG.getFirst(), pairG.getSecond());
        }
        Pair pairD = C3298x5.d();
        ck.p.j(linkedHashMap, "<this>");
        if (pairD != null) {
            linkedHashMap.put(pairD.getFirst(), pairD.getSecond());
        }
        Pair pairI = C3298x5.i();
        ck.p.j(linkedHashMap, "<this>");
        if (pairI != null) {
            linkedHashMap.put(pairI.getFirst(), pairI.getSecond());
        }
    }

    public static void c(LinkedHashMap linkedHashMap) {
        SharedPreferences sharedPreferencesA;
        ck.p.j(linkedHashMap, "<this>");
        String strValueOf = "";
        if (Ji.f22951a != null && (sharedPreferencesA = Ri.a()) != null && sharedPreferencesA.contains(io.bidmachine.z3.IAB_GPP_HDR_STRING)) {
            strValueOf = String.valueOf(sharedPreferencesA.getString(io.bidmachine.z3.IAB_GPP_HDR_STRING, ""));
        }
        if (F3.a(strValueOf)) {
            linkedHashMap.put("gpp", strValueOf);
        }
    }

    public static void d(LinkedHashMap linkedHashMap) {
        ck.p.j(linkedHashMap, "<this>");
        C3030mb c3030mb = C3030mb.f24820a;
        HashMap map = new HashMap();
        C3136qh c3136qh = Yi.f23856a;
        Location locationA = (Ji.b() == null || Yi.a().isLocationEnabled()) ? C3030mb.a() : null;
        HashMap mapA = locationA != null ? C3030mb.a(locationA, true, Kf.a(Ji.f22951a, "android.permission.ACCESS_FINE_LOCATION") ? C3030mb.a(1, 3) : null) : C3030mb.a(Tg.b(), false, null);
        for (Map.Entry entry : mapA.entrySet()) {
            map.put((String) entry.getKey(), entry.getValue().toString());
        }
        linkedHashMap.putAll(map);
        C3030mb c3030mb2 = C3030mb.f24820a;
        HashMap map2 = new HashMap();
        String str = "DENIED";
        if (C3030mb.d() && C3030mb.e()) {
            str = "AUTHORISED";
        }
        Locale locale = Locale.ENGLISH;
        ck.p.i(locale, "ENGLISH");
        String lowerCase = str.toLowerCase(locale);
        ck.p.i(lowerCase, "toLowerCase(...)");
        map2.put("loc-consent-status", lowerCase);
        linkedHashMap.putAll(map2);
    }

    public static void e(LinkedHashMap linkedHashMap) {
        JSONObject jSONObject;
        ck.p.j(linkedHashMap, "<this>");
        Qi qi2 = Qi.f23392a;
        qi2.getClass();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        if (Qi.a(0)) {
            linkedHashMap2.put("st", Long.valueOf(Qi.f23397f));
        }
        if (Qi.a(5)) {
            I1 i10 = Qi.f23401j;
            jk.k[] kVarArr = Qi.f23393b;
            if (((Number) i10.getValue(qi2, kVarArr[0])).intValue() != -1) {
                linkedHashMap2.put(ImpressionLog.M, Integer.valueOf(((Number) i10.getValue(qi2, kVarArr[0])).intValue()));
            }
        }
        if (Qi.a(6)) {
            I1 i11 = Qi.f23402k;
            jk.k[] kVarArr2 = Qi.f23393b;
            if (((Number) i11.getValue(qi2, kVarArr2[1])).intValue() != -1) {
                linkedHashMap2.put("u-ret", Integer.valueOf(((Number) i11.getValue(qi2, kVarArr2[1])).intValue()));
            }
        }
        List listR0 = nj.b0.R0(Qi.f23398g);
        if (!Qi.a(1)) {
            listR0.set(0, -1);
        }
        if (!Qi.a(2)) {
            listR0.set(1, -1);
        }
        if (!Qi.a(3)) {
            listR0.set(2, -1);
        }
        if (!Qi.a(4)) {
            listR0.set(3, -1);
        }
        if (!(listR0 instanceof Collection) || !listR0.isEmpty()) {
            Iterator it = listR0.iterator();
            while (it.hasNext()) {
                if (((Number) it.next()).intValue() != -1) {
                    linkedHashMap2.put("dep", listR0);
                    break;
                }
            }
        }
        try {
            jSONObject = new JSONObject(linkedHashMap2);
        } catch (Exception unused) {
            jSONObject = new JSONObject();
        }
        if (jSONObject.length() > 0) {
            String string = jSONObject.toString();
            ck.p.i(string, "toString(...)");
            linkedHashMap.put("sData", string);
        }
    }

    public static JSONObject a(String str) throws JSONException {
        if (ck.p.e(str, "banner")) {
            return W8.f23730c.a();
        }
        if (ck.p.e("audio", str)) {
            T8 t10 = T8.f23553c;
            JSONObject jSONObject = new JSONObject();
            long j10 = t10.f24331a / 1000;
            if (j10 != 0) {
                jSONObject.put("a-lastAudioPlayedTs", String.valueOf(j10));
            }
            int i10 = t10.f24332b;
            if (i10 > 0) {
                jSONObject.put("a-audioFreq", String.valueOf(i10));
            }
            Context context = Ji.f22951a;
            if (context != null) {
                ConcurrentHashMap concurrentHashMap = Ea.f22576b;
                Ea eaA = Da.a(context, "audio_pref_file");
                ck.p.j("user_mute_count", C3426d4.i.W);
                int i11 = eaA.f22577a.getInt("user_mute_count", -1);
                if (i11 > 0) {
                    jSONObject.put("a-umc", String.valueOf(i11));
                }
            }
            return jSONObject;
        }
        return new JSONObject();
    }
}
