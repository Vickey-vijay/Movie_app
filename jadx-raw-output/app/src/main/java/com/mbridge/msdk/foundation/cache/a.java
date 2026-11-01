package com.mbridge.msdk.foundation.cache;

import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.entity.j;
import com.mbridge.msdk.foundation.same.report.metrics.e;
import com.mbridge.msdk.foundation.tools.c1;
import com.mbridge.msdk.foundation.tools.k0;
import com.mbridge.msdk.foundation.tools.q0;
import com.safedk.android.analytics.brandsafety.ImpressionLog;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: BaseCandidateCache.java */
/* JADX INFO: loaded from: classes11.dex */
public class a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static String f34524e = "BaseCandidateCache";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static int f34525f = 4;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public com.mbridge.msdk.foundation.db.c f34526a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private JSONArray f34527b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private JSONObject f34528c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f34529d;

    /* JADX INFO: renamed from: com.mbridge.msdk.foundation.cache.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: BaseCandidateCache.java */
    public class C0319a implements Comparator<b> {
        public C0319a() {
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(b bVar, b bVar2) {
            return Double.compare(bVar.f34532b, bVar2.f34532b);
        }
    }

    /* JADX INFO: compiled from: BaseCandidateCache.java */
    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private com.mbridge.msdk.foundation.cache.b f34531a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private double f34532b;

        public com.mbridge.msdk.foundation.cache.b a() {
            return this.f34531a;
        }

        public b(double d10, com.mbridge.msdk.foundation.cache.b bVar) {
            this.f34532b = d10;
            this.f34531a = bVar;
        }
    }

    public void a(int i10) {
        com.mbridge.msdk.foundation.db.c cVar = this.f34526a;
        if (cVar != null) {
            cVar.a(this.f34529d, i10);
            a(f34525f, 1, null, true, "", "", i10, this.f34529d);
        }
    }

    public double b(String str) {
        c cVarA = a(str);
        if (cVarA != null && cVarA.g() != c.f34545k && cVarA.g() != c.f34543i) {
            try {
                String[] strArrSplit = k0.a(str.split("_")[3]).split("\\|");
                if (strArrSplit.length > 0) {
                    return Double.parseDouble(strArrSplit[0]);
                }
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
        return -1.0d;
    }

    public JSONObject c(String str) {
        JSONArray jSONArray = this.f34527b;
        if (jSONArray == null) {
            return null;
        }
        if (jSONArray.length() <= 1) {
            return this.f34527b.optJSONObject(0);
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        for (int i10 = 0; i10 < this.f34527b.length(); i10++) {
            try {
                JSONObject jSONObjectOptJSONObject = this.f34527b.optJSONObject(i10);
                if (jSONObjectOptJSONObject != null && str.equals(jSONObjectOptJSONObject.getString("g"))) {
                    this.f34528c = jSONObjectOptJSONObject;
                    return jSONObjectOptJSONObject;
                }
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
        return null;
    }

    public void e(String str) {
        this.f34529d = str;
    }

    public String d(String str) {
        c cVarA = a(str);
        if (cVarA != null && cVarA.g() != c.f34545k && cVarA.g() != c.f34543i) {
            String[] strArrSplit = k0.a(str.split("_")[3]).split("\\|");
            if (strArrSplit.length > 1) {
                return strArrSplit[1];
            }
        }
        return "";
    }

    public c a(String str) {
        c cVar = new c();
        if (!TextUtils.isEmpty(str) && str.split("_").length > 3 && !TextUtils.isEmpty(str.split("_")[3])) {
            JSONArray jSONArray = this.f34527b;
            if (jSONArray != null && jSONArray.length() != 0) {
                String strA = k0.a(str.split("_")[3]);
                if (TextUtils.isEmpty(strA)) {
                    cVar.d("bid token exception:decode error");
                    cVar.a(c.f34543i);
                    return cVar;
                }
                String[] strArrSplit = strA.split("\\|");
                if (strArrSplit.length == 0) {
                    cVar.d("bid token can not get bid price");
                    cVar.a(c.f34543i);
                    return cVar;
                }
                if (strArrSplit.length > 0) {
                    try {
                        Double.parseDouble(strArrSplit[0]);
                    } catch (Exception unused) {
                        cVar.d("bid token can not cast bid price");
                        cVar.a(c.f34543i);
                        return cVar;
                    }
                }
                if (TextUtils.isEmpty(this.f34529d)) {
                    cVar.d("unitId is empty");
                    cVar.a(c.f34545k);
                }
                return cVar;
            }
            cVar.d("config is empty");
            cVar.a(c.f34543i);
            return cVar;
        }
        cVar.d("bid token exception");
        cVar.a(c.f34543i);
        return cVar;
    }

    private List<Map<Integer, String>> b(List<Map<Integer, String>> list, int i10, String str, String str2) {
        if (list == null || list.size() == 0) {
            return list;
        }
        ArrayList arrayList = new ArrayList();
        for (int i11 = 0; i11 < list.size(); i11++) {
            Map<Integer, String> map = list.get(i11);
            if (map != null && map.size() > 0) {
                for (Map.Entry<Integer, String> entry : map.entrySet()) {
                    map.put(entry.getKey(), a(entry.getValue(), i10, str, str2));
                }
                arrayList.add(map);
            }
        }
        return arrayList;
    }

    public void a(JSONArray jSONArray) {
        this.f34527b = jSONArray;
    }

    public void a(List<CampaignEx> list, com.mbridge.msdk.foundation.same.report.metrics.c cVar, String str, int i10, String str2, int i11, double d10) {
        if (list != null) {
            try {
                if (list.size() > 0) {
                    for (int i12 = 0; i12 < list.size(); i12++) {
                        CampaignEx campaignEx = list.get(i12);
                        campaignEx.setReadyState(0);
                        if (cVar != null) {
                            campaignEx.setNLRid(cVar.t());
                        }
                        campaignEx.setNRid(str);
                        campaignEx.setReasond(str2);
                        campaignEx.setTyped(i10);
                        String strB = k0.b(d10 + "");
                        campaignEx.setNoticeUrl(a(campaignEx.getNoticeUrl(), i11, str, strB));
                        campaignEx.setClickURL(a(campaignEx.getClickURL(), i11, str, strB));
                        campaignEx.setImpressionURL(a(campaignEx.getImpressionURL(), i11, str, strB));
                        campaignEx.setOnlyImpressionURL(a(campaignEx.getOnlyImpressionURL(), i11, str, strB));
                        campaignEx.setAdvImp(a(campaignEx.getAdvImpList(), i11, str, strB));
                        j nativeVideoTracking = campaignEx.getNativeVideoTracking();
                        if (nativeVideoTracking != null) {
                            nativeVideoTracking.d(a(nativeVideoTracking.i(), i11, str, strB));
                            nativeVideoTracking.c(a(nativeVideoTracking.h(), i11, str, strB));
                            nativeVideoTracking.k(a(nativeVideoTracking.p(), i11, str, strB));
                            nativeVideoTracking.s(a(nativeVideoTracking.y(), i11, str, strB));
                            nativeVideoTracking.a(a(nativeVideoTracking.d(), i11, str, strB));
                            nativeVideoTracking.b(a(nativeVideoTracking.g(), i11, str, strB));
                            nativeVideoTracking.e(a(nativeVideoTracking.j(), i11, str, strB));
                            nativeVideoTracking.t(a(nativeVideoTracking.z(), i11, str, strB));
                            nativeVideoTracking.u(a(nativeVideoTracking.z(), i11, str, strB));
                            nativeVideoTracking.v(a(nativeVideoTracking.B(), i11, str, strB));
                            nativeVideoTracking.f(a(nativeVideoTracking.k(), i11, str, strB));
                            nativeVideoTracking.g(a(nativeVideoTracking.l(), i11, str, strB));
                            nativeVideoTracking.h(a(nativeVideoTracking.m(), i11, str, strB));
                            nativeVideoTracking.i(a(nativeVideoTracking.n(), i11, str, strB));
                            nativeVideoTracking.j(a(nativeVideoTracking.o(), i11, str, strB));
                            nativeVideoTracking.l(a(nativeVideoTracking.q(), i11, str, strB));
                            nativeVideoTracking.q(a(nativeVideoTracking.w(), i11, str, strB));
                            nativeVideoTracking.m(a(nativeVideoTracking.r(), i11, str, strB));
                            nativeVideoTracking.r(a(nativeVideoTracking.x(), i11, str, strB));
                            nativeVideoTracking.n(a(nativeVideoTracking.s(), i11, str, strB));
                            nativeVideoTracking.a(b(nativeVideoTracking.t(), i11, str, strB));
                            nativeVideoTracking.p(a(nativeVideoTracking.v(), i11, str, strB));
                            nativeVideoTracking.o(a(nativeVideoTracking.u(), i11, str, strB));
                            campaignEx.setNativeVideoTracking(nativeVideoTracking);
                            campaignEx.setNativeVideoTrackingString(CampaignEx.object2TrackingStr(nativeVideoTracking));
                        }
                        campaignEx.setPv_urls(a(campaignEx.getPv_urls(), i11, str, strB));
                    }
                }
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
    }

    public c a() {
        c cVar = new c();
        try {
            JSONArray jSONArray = this.f34527b;
            if (jSONArray != null && jSONArray.length() != 0) {
                if (this.f34526a == null) {
                    cVar.d("db error");
                    cVar.a(c.f34545k);
                    return cVar;
                }
                return cVar;
            }
            cVar.d("setting config is null");
            cVar.a(c.f34543i);
            return cVar;
        } catch (Exception unused) {
            cVar.d("checkConfigAndDB exception");
            cVar.a(c.f34545k);
        }
    }

    public List<com.mbridge.msdk.foundation.cache.b> a(int i10, long j10) {
        if (i10 >= 0) {
            a(i10);
        }
        com.mbridge.msdk.foundation.db.c cVar = this.f34526a;
        if (cVar != null) {
            return cVar.a(this.f34529d, j10);
        }
        return null;
    }

    public void a(List<b> list, int i10) {
        if (list != null) {
            try {
                if (list.size() > 0) {
                    Collections.sort(list, new C0319a());
                    int size = list.size() - i10;
                    if (size > 0) {
                        List<b> listSubList = list.subList(0, size);
                        if (this.f34526a == null || listSubList.size() <= 0) {
                            return;
                        }
                        for (int i11 = 0; i11 < listSubList.size(); i11++) {
                            com.mbridge.msdk.foundation.cache.b bVar = listSubList.get(i11).f34531a;
                            this.f34526a.a(this.f34529d, bVar.e(), bVar.d());
                            a(f34525f, 1, null, true, bVar.e(), bVar.d(), -1, this.f34529d);
                        }
                    }
                }
            } catch (Exception e10) {
                q0.a(f34524e, e10);
            }
        }
    }

    private String a(String str, int i10, String str2, String str3) {
        if (TextUtils.isEmpty(str) || str.contains("ca_sce") || str.contains("real_rid") || str.contains("real_bp")) {
            return str;
        }
        if (c1.c(str) > 0) {
            return str + "&ca_sce=" + i10 + "&real_rid=" + str2 + "&real_bp=" + str3;
        }
        return str + "?ca_sce=" + i10 + "&real_rid=" + str2 + "&real_bp=" + str3;
    }

    private String a(Map<Integer, String> map, int i10, String str, String str2) {
        if (map == null || map.size() == 0) {
            return null;
        }
        JSONArray jSONArray = new JSONArray();
        try {
            for (Map.Entry<Integer, String> entry : map.entrySet()) {
                String value = entry.getValue();
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(CampaignEx.JSON_AD_IMP_KEY, entry.getKey());
                jSONObject.put("url", a(value, i10, str, str2));
                jSONArray.put(jSONObject);
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        if (jSONArray.length() == 0) {
            return null;
        }
        return jSONArray.toString();
    }

    private String[] a(String[] strArr, int i10, String str, String str2) {
        if (strArr == null || strArr.length == 0) {
            return strArr;
        }
        String[] strArr2 = new String[strArr.length];
        for (int i11 = 0; i11 < strArr.length; i11++) {
            strArr2[i11] = a(strArr[i11], i10, str, str2);
        }
        return strArr2;
    }

    private List<String> a(List<String> list, int i10, String str, String str2) {
        if (list == null || list.size() == 0) {
            return list;
        }
        ArrayList arrayList = new ArrayList();
        for (int i11 = 0; i11 < list.size(); i11++) {
            arrayList.add(a(list.get(i11), i10, str, str2));
        }
        return arrayList;
    }

    public long a(List<CampaignEx> list, String str) {
        if (list == null || list.size() == 0) {
            return 0L;
        }
        String ecppv = list.get(0).getEcppv();
        if (TextUtils.isEmpty(ecppv)) {
            return 0L;
        }
        String strA = k0.a(ecppv);
        if (TextUtils.isEmpty(strA)) {
            return 0L;
        }
        try {
            if (Double.parseDouble(strA) <= 0.0d) {
                return 0L;
            }
            JSONObject jSONObjectC = c(d(str));
            int iOptInt = jSONObjectC != null ? jSONObjectC.optInt("max_cache_num", 20) : 20;
            com.mbridge.msdk.foundation.db.c cVar = this.f34526a;
            if (cVar == null || iOptInt <= 0) {
                return -1L;
            }
            return cVar.a(list, this.f34529d);
        } catch (Exception e10) {
            e10.printStackTrace();
            return -1L;
        }
    }

    public void a(String str, String str2, int i10, String str3) {
        try {
            if (this.f34526a == null || TextUtils.isEmpty(str3)) {
                return;
            }
            if (i10 == 1) {
                this.f34526a.a(str2, str, this.f34529d, i10);
                a(f34525f, 3, null, true, str2, str, -1, this.f34529d);
            } else if (i10 == 2) {
                this.f34526a.a(this.f34529d, str2, str);
                a(f34525f, 1, null, true, str2, str, -1, this.f34529d);
            } else if (i10 == 3) {
                this.f34526a.b(str2, str, this.f34529d);
                a(f34525f, 4, null, true, str2, str, -1, this.f34529d);
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    /* JADX WARN: Code duplicated, block: B:66:0x018e  */
    /* JADX WARN: Code duplicated, block: B:69:0x019c A[Catch: Exception -> 0x01af, TryCatch #2 {Exception -> 0x01af, blocks: (B:3:0x0011, B:7:0x002f, B:9:0x0068, B:12:0x0078, B:14:0x007e, B:17:0x0085, B:19:0x0090, B:22:0x0097, B:24:0x009d, B:26:0x00a5, B:28:0x00b6, B:30:0x0101, B:37:0x0117, B:41:0x0120, B:43:0x0126, B:45:0x0134, B:46:0x0138, B:48:0x0143, B:50:0x0149, B:52:0x0151, B:54:0x015c, B:56:0x016e, B:65:0x018a, B:67:0x0192, B:69:0x019c, B:70:0x01a1, B:57:0x0173, B:31:0x0106), top: B:79:0x0011 }] */
    public void a(int i10, int i11, List<CampaignEx> list, boolean z10, String str, String str2, int i12, String str3) {
        String str4;
        com.mbridge.msdk.foundation.same.report.metrics.c cVar;
        String str5;
        String currentLocalRid;
        com.mbridge.msdk.foundation.db.c cVar2;
        e eVar = new e();
        try {
            eVar.a("type", i11 + "");
            eVar.a("result", z10 ? "1" : "2");
            eVar.a("max_usage_limit", i12 + "");
            eVar.a(MBridgeConstans.PROPERTIES_UNIT_ID, str3 + "");
            eVar.a("scene", "db");
            JSONObject jSONObject = this.f34528c;
            if (jSONObject != null) {
                eVar.a("config", jSONObject.toString());
            }
            String str6 = ImpressionLog.f43648x;
            if (i11 == 1 && TextUtils.isEmpty(str2) && (cVar2 = this.f34526a) != null) {
                try {
                    List<com.mbridge.msdk.foundation.cache.b> listA = cVar2.a(str3, -1, -1L);
                    JSONArray jSONArray = new JSONArray();
                    if (listA != null && listA.size() > 0) {
                        int i13 = 0;
                        while (i13 < listA.size()) {
                            com.mbridge.msdk.foundation.cache.b bVar = listA.get(i13);
                            if (bVar != null) {
                                JSONObject jSONObject2 = new JSONObject();
                                jSONObject2.put(str6, bVar.e());
                                str4 = str6;
                                try {
                                    jSONObject2.put("ts", bVar.h());
                                    jSONObject2.put("lrid", bVar.d());
                                    jSONObject2.put("ecppv", k0.b(bVar.b() + ""));
                                    jSONObject2.put("state", bVar.g());
                                    jSONObject2.put("showCount", bVar.f());
                                    jSONObject2.put("interval_ts", bVar.c());
                                    jSONArray.put(jSONObject2);
                                } catch (JSONException e10) {
                                    e = e10;
                                    e.printStackTrace();
                                    cVar = null;
                                    if (list != null) {
                                        str5 = str4;
                                        currentLocalRid = str2;
                                    } else {
                                        str5 = str4;
                                        currentLocalRid = str2;
                                    }
                                    eVar.a(str5, str);
                                    eVar.a("lrid", currentLocalRid);
                                    if (cVar == null) {
                                        cVar = new com.mbridge.msdk.foundation.same.report.metrics.c();
                                    }
                                    cVar.n(str3);
                                    cVar.a("m_candidate_db", eVar);
                                    com.mbridge.msdk.foundation.same.report.metrics.d.b().a("m_candidate_db", cVar);
                                }
                            } else {
                                str4 = str6;
                            }
                            i13++;
                            str6 = str4;
                        }
                    }
                    str4 = str6;
                    eVar.a("cache", jSONArray.toString());
                } catch (JSONException e11) {
                    e = e11;
                    str4 = str6;
                }
            } else {
                str4 = ImpressionLog.f43648x;
            }
            cVar = null;
            if (list != null || list.size() <= 0) {
                str5 = str4;
                currentLocalRid = str2;
            } else {
                try {
                    JSONArray jSONArray2 = new JSONArray();
                    int i14 = 0;
                    CampaignEx campaignEx = list.get(0);
                    if (campaignEx != null) {
                        currentLocalRid = campaignEx.getCurrentLocalRid();
                        try {
                            cVar = com.mbridge.msdk.foundation.same.report.metrics.d.b().b(currentLocalRid);
                        } catch (JSONException e12) {
                            e = e12;
                            str5 = str4;
                            e.printStackTrace();
                            eVar.a(str5, str);
                            eVar.a("lrid", currentLocalRid);
                            if (cVar == null) {
                                cVar = new com.mbridge.msdk.foundation.same.report.metrics.c();
                            }
                            cVar.n(str3);
                            cVar.a("m_candidate_db", eVar);
                            com.mbridge.msdk.foundation.same.report.metrics.d.b().a("m_candidate_db", cVar);
                        }
                    } else {
                        currentLocalRid = str2;
                    }
                    while (i14 < list.size()) {
                        CampaignEx campaignEx2 = list.get(i14);
                        if (campaignEx2 != null) {
                            JSONObject jSONObject3 = new JSONObject();
                            str5 = str4;
                            try {
                                jSONObject3.put(str5, campaignEx2.getRequestId());
                                jSONObject3.put("rid_n", campaignEx2.getRequestIdNotice());
                                jSONArray2.put(jSONObject3);
                            } catch (JSONException e13) {
                                e = e13;
                                e.printStackTrace();
                                eVar.a(str5, str);
                                eVar.a("lrid", currentLocalRid);
                                if (cVar == null) {
                                    cVar = new com.mbridge.msdk.foundation.same.report.metrics.c();
                                }
                                cVar.n(str3);
                                cVar.a("m_candidate_db", eVar);
                                com.mbridge.msdk.foundation.same.report.metrics.d.b().a("m_candidate_db", cVar);
                            }
                        } else {
                            str5 = str4;
                        }
                        i14++;
                        str4 = str5;
                    }
                    str5 = str4;
                    eVar.a("c_info", jSONArray2.toString());
                } catch (JSONException e14) {
                    e = e14;
                    str5 = str4;
                    currentLocalRid = str2;
                }
            }
            eVar.a(str5, str);
            eVar.a("lrid", currentLocalRid);
            if (cVar == null) {
                cVar = new com.mbridge.msdk.foundation.same.report.metrics.c();
            }
            cVar.n(str3);
            cVar.a("m_candidate_db", eVar);
            com.mbridge.msdk.foundation.same.report.metrics.d.b().a("m_candidate_db", cVar);
        } catch (Exception e15) {
            e15.printStackTrace();
        }
    }
}
