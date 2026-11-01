package yads;

import android.content.Context;
import android.util.Log;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import kotlin.Result;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class a42 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final jf1 f75390a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final lj f75391b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final sa3 f75392c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final v51 f75393d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final li0 f75394e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final dg0 f75395f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final w42 f75396g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ry2 f75397h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final uj1 f75398i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ic f75399j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final bf f75400k;

    public /* synthetic */ a42(Context context, at1 at1Var) {
        jf1 jf1Var = new jf1(context, at1Var);
        this(jf1Var, new lj(context, at1Var, jf1Var, 8), new sa3(), new v51(), new li0(at1Var), new dg0(), new w42(), new ry2(), new uj1(), new ic(at1Var), new bf());
    }

    public final py2 a(JSONObject jSONObject) throws JSONException, z02 {
        Object objM3458constructorimpl;
        Object objM3458constructorimpl2;
        Object objM3458constructorimpl3;
        qy2 qy2Var;
        if (!b42.a(jSONObject, "delay", "url")) {
            throw new z02("Native Ad json has not required attributes");
        }
        long j10 = jSONObject.getLong("delay");
        this.f75392c.getClass();
        String strA = sa3.a("url", jSONObject);
        try {
            Result.a aVar = Result.Companion;
            objM3458constructorimpl = Result.m3458constructorimpl(Double.valueOf(jSONObject.optInt("visibilityPercent", 0)));
        } catch (Throwable th2) {
            Result.a aVar2 = Result.Companion;
            objM3458constructorimpl = Result.m3458constructorimpl(kotlin.c.a(th2));
        }
        if (Result.m3463isFailureimpl(objM3458constructorimpl)) {
            objM3458constructorimpl = null;
        }
        Double d10 = (Double) objM3458constructorimpl;
        int i10 = (int) ik.k.i(d10 != null ? d10.doubleValue() : 0.0d, 0.0d, 100.0d);
        try {
            objM3458constructorimpl2 = Result.m3458constructorimpl(jSONObject.getString("type"));
        } catch (Throwable th3) {
            Result.a aVar3 = Result.Companion;
            objM3458constructorimpl2 = Result.m3458constructorimpl(kotlin.c.a(th3));
        }
        if (Result.m3463isFailureimpl(objM3458constructorimpl2)) {
            objM3458constructorimpl2 = null;
        }
        String str = (String) objM3458constructorimpl2;
        if (str != null) {
            try {
                String upperCase = str.toUpperCase(Locale.ROOT);
                ck.p.i(upperCase, "toUpperCase(...)");
                objM3458constructorimpl3 = Result.m3458constructorimpl(qy2.valueOf(upperCase));
            } catch (Throwable th4) {
                Result.a aVar4 = Result.Companion;
                objM3458constructorimpl3 = Result.m3458constructorimpl(kotlin.c.a(th4));
            }
            if (Result.m3463isFailureimpl(objM3458constructorimpl3)) {
                objM3458constructorimpl3 = null;
            }
            qy2Var = (qy2) objM3458constructorimpl3;
        } else {
            qy2Var = null;
        }
        if (qy2Var == null) {
            this.f75397h.getClass();
            if (lk.a0.X(strA, "/rtbcount/", false, 2, null)) {
                qy2Var = qy2.f82039c;
            } else {
                qy2Var = lk.a0.X(strA, "/count/", false, 2, null) ? qy2.f82038b : qy2.f82040d;
            }
        }
        return new py2(i10, j10, qy2Var, strA);
    }

    public a42(jf1 jf1Var, lj ljVar, sa3 sa3Var, v51 v51Var, li0 li0Var, dg0 dg0Var, w42 w42Var, ry2 ry2Var, uj1 uj1Var, ic icVar, bf bfVar) {
        this.f75390a = jf1Var;
        this.f75391b = ljVar;
        this.f75392c = sa3Var;
        this.f75393d = v51Var;
        this.f75394e = li0Var;
        this.f75395f = dg0Var;
        this.f75396g = w42Var;
        this.f75397h = ry2Var;
        this.f75398i = uj1Var;
        this.f75399j = icVar;
        this.f75400k = bfVar;
    }

    /* JADX WARN: Code duplicated, block: B:71:0x0164  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final d12 a(String str, kn knVar) throws JSONException, z02 {
        String str2;
        List list;
        List list2;
        JSONObject jSONObject;
        String str3;
        List list3;
        List list4;
        List list5;
        List list6;
        yz2 yz2Var;
        List listK;
        int i10;
        k7 k7Var;
        l7 l7Var;
        p03 p03Var;
        r03 r03Var;
        JSONObject jSONObject2;
        ArrayList arrayList;
        cq2 cq2Var;
        ArrayList arrayList2;
        String str4;
        String str5;
        String str6;
        JSONObject jSONObjectOptJSONObject;
        knVar = knVar;
        JSONObject jSONObject3 = new JSONObject(str).getJSONObject("native");
        String str7 = com.mbridge.msdk.foundation.entity.b.JSON_KEY_ADS;
        String str8 = "Native Ad json has not required attributes";
        if (b42.a(jSONObject3, com.mbridge.msdk.foundation.entity.b.JSON_KEY_ADS)) {
            List listK2 = nj.s.k();
            List listK3 = nj.s.k();
            List listK4 = nj.s.k();
            List listK5 = nj.s.k();
            List listK6 = nj.s.k();
            Iterator<String> itKeys = jSONObject3.keys();
            List listA = listK2;
            List list7 = listK3;
            List list8 = listK4;
            List list9 = listK5;
            List list10 = listK6;
            j5 j5Var = null;
            String str9 = null;
            my2 my2Var = null;
            c7 c7Var = null;
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                if (next != null) {
                    String str10 = "assets";
                    String str11 = "renderTrackingUrls";
                    itKeys = itKeys;
                    String str12 = "showNotices";
                    List list11 = list8;
                    list = listA;
                    switch (next.hashCode()) {
                        case -1777460514:
                            str2 = str7;
                            str3 = str8;
                            jSONObject = jSONObject3;
                            list6 = list11;
                            if (next.equals("showNotices")) {
                                ArrayList arrayList3 = new ArrayList();
                                JSONArray jSONArray = jSONObject.getJSONArray("showNotices");
                                int length = jSONArray.length();
                                for (int i11 = 0; i11 < length; i11++) {
                                    arrayList3.add(a(jSONArray.getJSONObject(i11)));
                                }
                                list10 = arrayList3;
                                list5 = list11;
                            } else {
                                list5 = list6;
                            }
                            jSONObject3 = jSONObject;
                            str8 = str3;
                            list4 = list7;
                            list3 = list5;
                            itKeys = itKeys;
                            list8 = list3;
                            listA = list;
                            list7 = list4;
                            str7 = str2;
                            break;
                        case -1422646231:
                            str2 = str7;
                            jSONObject = jSONObject3;
                            list2 = list11;
                            if (next.equals("ad_pod")) {
                                JSONObject jSONObject4 = jSONObject.getJSONObject("ad_pod");
                                JSONArray jSONArrayOptJSONArray = jSONObject4.optJSONArray("items");
                                if (jSONArrayOptJSONArray != null) {
                                    int length2 = jSONArrayOptJSONArray.length();
                                    ArrayList arrayList4 = new ArrayList(length2);
                                    int i12 = 0;
                                    while (i12 < length2) {
                                        JSONObject jSONObjectOptJSONObject2 = jSONArrayOptJSONArray.optJSONObject(i12);
                                        long jOptLong = jSONObjectOptJSONObject2.optLong("duration");
                                        JSONObject jSONObjectOptJSONObject3 = jSONObjectOptJSONObject2.optJSONObject("skip");
                                        if (jSONObjectOptJSONObject3 != null) {
                                            String strOptString = jSONObjectOptJSONObject3.optString("transition_strategy");
                                            p03[] p03VarArrValues = p03.values();
                                            int length3 = p03VarArrValues.length;
                                            int i13 = 0;
                                            while (true) {
                                                if (i13 < length3) {
                                                    int i14 = length3;
                                                    p03Var = p03VarArrValues[i13];
                                                    i10 = length2;
                                                    if (!ck.p.e(p03Var.f81199b, strOptString)) {
                                                        i13++;
                                                        length3 = i14;
                                                        length2 = i10;
                                                    }
                                                } else {
                                                    i10 = length2;
                                                    p03Var = null;
                                                }
                                            }
                                            String strOptString2 = jSONObjectOptJSONObject3.optString("visibility");
                                            r03[] r03VarArrValues = r03.values();
                                            int length4 = r03VarArrValues.length;
                                            int i15 = 0;
                                            while (true) {
                                                if (i15 < length4) {
                                                    int i16 = length4;
                                                    r03Var = r03VarArrValues[i15];
                                                    r03[] r03VarArr = r03VarArrValues;
                                                    if (!ck.p.e(r03Var.f82066b, strOptString2)) {
                                                        i15++;
                                                        length4 = i16;
                                                        r03VarArrValues = r03VarArr;
                                                    }
                                                } else {
                                                    r03Var = null;
                                                }
                                            }
                                            k7Var = new k7(p03Var, r03Var, jSONObjectOptJSONObject3.optLong("delay"));
                                        } else {
                                            i10 = length2;
                                            k7Var = null;
                                        }
                                        String strOptString3 = jSONObjectOptJSONObject2.optString("transition_policy");
                                        l7[] l7VarArrValues = l7.values();
                                        int length5 = l7VarArrValues.length;
                                        int i17 = 0;
                                        while (true) {
                                            if (i17 >= length5) {
                                                l7Var = null;
                                            }
                                            l7Var = l7VarArrValues[i17];
                                            if (ck.p.e(l7Var.f79718b, strOptString3)) {
                                            }
                                            i17++;
                                            break;
                                            break;
                                        }
                                        arrayList4.add(new j7(jOptLong, k7Var, l7Var));
                                        i12++;
                                        str8 = str8;
                                        jSONArrayOptJSONArray = jSONArrayOptJSONArray;
                                        length2 = i10;
                                    }
                                    str3 = str8;
                                    listK = arrayList4;
                                } else {
                                    str3 = str8;
                                    listK = nj.s.k();
                                }
                                c7Var = new c7(listK, jSONObject4.optInt("closable_ad_position"), jSONObject4.optInt("reward_ad_position", ik.k.d(nj.s.m(listK), 0)));
                                list5 = list11;
                            }
                            jSONObject3 = jSONObject;
                            str8 = str3;
                            list4 = list7;
                            list3 = list5;
                            itKeys = itKeys;
                            list8 = list3;
                            listA = list;
                            list7 = list4;
                            str7 = str2;
                            break;
                        case -1408207997:
                            str2 = str7;
                            jSONObject = jSONObject3;
                            list2 = list11;
                            if (next.equals("assets")) {
                                listA = this.f75391b.a(jSONObject, knVar);
                                jSONObject3 = jSONObject;
                                itKeys = itKeys;
                                list8 = list11;
                                list7 = list7;
                            }
                            str7 = str2;
                            break;
                        case -113850029:
                            JSONObject jSONObject5 = jSONObject3;
                            str2 = str7;
                            if (next.equals("impressionData")) {
                                this.f75393d.getClass();
                                try {
                                    cl.a aVar = ge1.f77787a;
                                    jSONObject2 = jSONObject5;
                                    try {
                                        String string = jSONObject2.getString("impressionData");
                                        if (string.length() != 0 && !ck.p.e("null", string)) {
                                            j5Var = new j5(string);
                                            jSONObject3 = jSONObject2;
                                            list4 = list7;
                                            list3 = list11;
                                            itKeys = itKeys;
                                            list8 = list3;
                                            listA = list;
                                            list7 = list4;
                                            str7 = str2;
                                        } else {
                                            throw new JSONException("Json has not required attributes");
                                        }
                                    } catch (Exception e10) {
                                        e = e10;
                                        Log.e("ImpressionDataParser", String.valueOf(e.getMessage()));
                                        jSONObject3 = jSONObject2;
                                        itKeys = itKeys;
                                        list8 = list11;
                                        listA = list;
                                        str7 = str2;
                                        j5Var = null;
                                    }
                                } catch (Exception e11) {
                                    e = e11;
                                    jSONObject2 = jSONObject5;
                                }
                            } else {
                                str3 = str8;
                                jSONObject = jSONObject5;
                                list6 = list11;
                                list5 = list6;
                                jSONObject3 = jSONObject;
                                str8 = str3;
                                list4 = list7;
                                list3 = list5;
                                itKeys = itKeys;
                                list8 = list3;
                                listA = list;
                                list7 = list4;
                                str7 = str2;
                            }
                            break;
                        case 96432:
                            if (next.equals(str7)) {
                                ArrayList arrayList5 = new ArrayList();
                                JSONArray jSONArray2 = jSONObject3.getJSONArray(str7);
                                int length6 = jSONArray2.length();
                                str2 = str7;
                                int i18 = 0;
                                while (i18 < length6) {
                                    int i19 = length6;
                                    JSONObject jSONObject6 = jSONArray2.getJSONObject(i18);
                                    JSONArray jSONArray3 = jSONArray2;
                                    String str13 = "link";
                                    JSONObject jSONObject7 = jSONObject3;
                                    if (b42.a(jSONObject6, "adType", str10, "link")) {
                                        this.f75396g.getClass();
                                        String strOptString4 = jSONObject6.optString("adType");
                                        if (strOptString4 != null && strOptString4.length() != 0 && !ck.p.e(strOptString4, "null")) {
                                            cq2[] cq2VarArrValues = cq2.values();
                                            String str14 = str10;
                                            int length7 = cq2VarArrValues.length;
                                            int i20 = i18;
                                            int i21 = 0;
                                            while (true) {
                                                if (i21 < length7) {
                                                    int i22 = length7;
                                                    cq2Var = cq2VarArrValues[i21];
                                                    cq2[] cq2VarArr = cq2VarArrValues;
                                                    if (!ck.p.e(cq2Var.f76407b, strOptString4)) {
                                                        arrayList = arrayList5;
                                                        i21++;
                                                        length7 = i22;
                                                        cq2VarArrValues = cq2VarArr;
                                                    }
                                                } else {
                                                    arrayList = arrayList5;
                                                    cq2Var = null;
                                                }
                                            }
                                            if (cq2Var != null) {
                                                arrayList = arrayList5;
                                                ArrayList arrayListA = this.f75391b.a(jSONObject6, knVar);
                                                HashSet hashSet = new HashSet();
                                                ArrayList arrayList6 = arrayList;
                                                HashSet hashSet2 = new HashSet();
                                                Iterator<String> itKeys2 = jSONObject6.keys();
                                                String strOptString5 = null;
                                                String strOptString6 = null;
                                                j5 j5Var2 = null;
                                                gc gcVar = null;
                                                String strOptString7 = null;
                                                String strOptString8 = null;
                                                LinkedHashMap linkedHashMap = null;
                                                if1 if1VarA = null;
                                                while (itKeys2.hasNext()) {
                                                    String next2 = itKeys2.next();
                                                    if (next2 != null) {
                                                        arrayList2 = arrayListA;
                                                        switch (next2.hashCode()) {
                                                            case -1777460514:
                                                                str4 = str12;
                                                                str5 = str11;
                                                                if (next2.equals(str4)) {
                                                                    ArrayList arrayList7 = new ArrayList();
                                                                    JSONArray jSONArray4 = jSONObject6.getJSONArray(str4);
                                                                    int i23 = 0;
                                                                    for (int length8 = jSONArray4.length(); i23 < length8; length8 = length8) {
                                                                        arrayList7.add(a(jSONArray4.getJSONObject(i23)));
                                                                        i23++;
                                                                    }
                                                                    hashSet2.addAll(arrayList7);
                                                                }
                                                                str12 = str4;
                                                                str13 = str13;
                                                                arrayListA = arrayList2;
                                                                str11 = str5;
                                                                break;
                                                            case -974297739:
                                                                str6 = str12;
                                                                str5 = str11;
                                                                if (next2.equals("additionalInfo")) {
                                                                    ic icVar = this.f75399j;
                                                                    icVar.getClass();
                                                                    try {
                                                                        JSONObject jSONObject8 = jSONObject6.getJSONObject("additionalInfo");
                                                                        cq2 cq2Var2 = cq2.f76405e;
                                                                        Object objInvoke = new hc(jSONObject8).invoke();
                                                                        if (cq2Var == cq2Var2 && objInvoke == null) {
                                                                            throw new z02(str8);
                                                                        }
                                                                        gcVar = new gc((String) objInvoke, ic.a(jSONObject8));
                                                                        arrayListA = arrayList2;
                                                                        str11 = str5;
                                                                        str12 = str6;
                                                                    } catch (Exception e12) {
                                                                        icVar.f78571a.reportError("Failed to create AdInfo", e12);
                                                                        arrayListA = arrayList2;
                                                                        str11 = str5;
                                                                        str12 = str6;
                                                                        gcVar = null;
                                                                    }
                                                                } else {
                                                                    str4 = str6;
                                                                    str12 = str4;
                                                                    str13 = str13;
                                                                    arrayListA = arrayList2;
                                                                    str11 = str5;
                                                                }
                                                                break;
                                                            case -113850029:
                                                                str6 = str12;
                                                                str5 = str11;
                                                                if (next2.equals("impressionData")) {
                                                                    this.f75393d.getClass();
                                                                    try {
                                                                        cl.a aVar2 = ge1.f77787a;
                                                                        String string2 = jSONObject6.getString("impressionData");
                                                                        if (string2.length() != 0 && !ck.p.e("null", string2)) {
                                                                            j5Var2 = new j5(string2);
                                                                            arrayListA = arrayList2;
                                                                            str11 = str5;
                                                                            str12 = str6;
                                                                        } else {
                                                                            throw new JSONException("Json has not required attributes");
                                                                        }
                                                                    } catch (Exception e13) {
                                                                        Log.e("ImpressionDataParser", String.valueOf(e13.getMessage()));
                                                                        arrayListA = arrayList2;
                                                                        str11 = str5;
                                                                        str12 = str6;
                                                                        j5Var2 = null;
                                                                    }
                                                                } else {
                                                                    str4 = str6;
                                                                    str12 = str4;
                                                                    str13 = str13;
                                                                    arrayListA = arrayList2;
                                                                    str11 = str5;
                                                                }
                                                                break;
                                                            case 3355:
                                                                str6 = str12;
                                                                str5 = str11;
                                                                if (next2.equals("id")) {
                                                                    strOptString5 = jSONObject6.optString("id", "");
                                                                    if (strOptString5.length() > 0) {
                                                                        arrayListA = arrayList2;
                                                                        str11 = str5;
                                                                        str12 = str6;
                                                                    } else {
                                                                        arrayListA = arrayList2;
                                                                        str11 = str5;
                                                                        str12 = str6;
                                                                        strOptString5 = null;
                                                                    }
                                                                } else {
                                                                    str4 = str6;
                                                                    str12 = str4;
                                                                    str13 = str13;
                                                                    arrayListA = arrayList2;
                                                                    str11 = str5;
                                                                }
                                                                break;
                                                            case 98494:
                                                                str6 = str12;
                                                                str5 = str11;
                                                                if (next2.equals("cid")) {
                                                                    strOptString8 = jSONObject6.optString("cid", "");
                                                                    if (strOptString8.length() > 0) {
                                                                        arrayListA = arrayList2;
                                                                        str11 = str5;
                                                                        str12 = str6;
                                                                    } else {
                                                                        arrayListA = arrayList2;
                                                                        str11 = str5;
                                                                        str12 = str6;
                                                                        strOptString8 = null;
                                                                    }
                                                                } else {
                                                                    str4 = str6;
                                                                    str12 = str4;
                                                                    str13 = str13;
                                                                    arrayListA = arrayList2;
                                                                    str11 = str5;
                                                                }
                                                                break;
                                                            case 3062218:
                                                                str6 = str12;
                                                                str5 = str11;
                                                                if (next2.equals("crid")) {
                                                                    strOptString7 = jSONObject6.optString("crid", "");
                                                                    if (strOptString7.length() > 0) {
                                                                        arrayListA = arrayList2;
                                                                        str11 = str5;
                                                                        str12 = str6;
                                                                    } else {
                                                                        arrayListA = arrayList2;
                                                                        str11 = str5;
                                                                        str12 = str6;
                                                                        strOptString7 = null;
                                                                    }
                                                                } else {
                                                                    str4 = str6;
                                                                    str12 = str4;
                                                                    str13 = str13;
                                                                    arrayListA = arrayList2;
                                                                    str11 = str5;
                                                                }
                                                                break;
                                                            case 3237038:
                                                                str6 = str12;
                                                                str5 = str11;
                                                                if (next2.equals("info")) {
                                                                    strOptString6 = jSONObject6.optString(next2, "");
                                                                    if (strOptString6.length() > 0) {
                                                                        arrayListA = arrayList2;
                                                                        str11 = str5;
                                                                        str12 = str6;
                                                                    } else {
                                                                        arrayListA = arrayList2;
                                                                        str11 = str5;
                                                                        str12 = str6;
                                                                        strOptString6 = null;
                                                                    }
                                                                } else {
                                                                    str4 = str6;
                                                                    str12 = str4;
                                                                    str13 = str13;
                                                                    arrayListA = arrayList2;
                                                                    str11 = str5;
                                                                }
                                                                break;
                                                            case 3321850:
                                                                str6 = str12;
                                                                str5 = str11;
                                                                if (next2.equals(str13)) {
                                                                    if1VarA = this.f75390a.a(jSONObject6.getJSONObject(next2), knVar);
                                                                    arrayListA = arrayList2;
                                                                    str11 = str5;
                                                                    str12 = str6;
                                                                } else {
                                                                    str4 = str6;
                                                                    str12 = str4;
                                                                    str13 = str13;
                                                                    arrayListA = arrayList2;
                                                                    str11 = str5;
                                                                }
                                                                break;
                                                            case 458247106:
                                                                str6 = str12;
                                                                str5 = str11;
                                                                if (next2.equals("renderTrackingUrl")) {
                                                                    this.f75392c.getClass();
                                                                    hashSet.add(sa3.a(next2, jSONObject6));
                                                                }
                                                                str4 = str6;
                                                                str12 = str4;
                                                                str13 = str13;
                                                                arrayListA = arrayList2;
                                                                str11 = str5;
                                                                break;
                                                            case 635399221:
                                                                str6 = str12;
                                                                str5 = str11;
                                                                if (next2.equals("showNotice")) {
                                                                    hashSet2.add(a(jSONObject6.getJSONObject(next2)));
                                                                }
                                                                str4 = str6;
                                                                str12 = str4;
                                                                str13 = str13;
                                                                arrayListA = arrayList2;
                                                                str11 = str5;
                                                                break;
                                                            case 833620496:
                                                                str6 = str12;
                                                                str5 = str11;
                                                                if (next2.equals("analyticsParameters") && (jSONObjectOptJSONObject = jSONObject6.optJSONObject(next2)) != null) {
                                                                    this.f75400k.getClass();
                                                                    kk.i iVarG = kk.r.g(jSONObjectOptJSONObject.keys());
                                                                    LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                                                                    for (Iterator it = iVarG.iterator(); it.hasNext(); it = it) {
                                                                        Object next3 = it.next();
                                                                        linkedHashMap2.put(next3, jSONObjectOptJSONObject.get((String) next3));
                                                                    }
                                                                    linkedHashMap = linkedHashMap2;
                                                                    arrayListA = arrayList2;
                                                                    str11 = str5;
                                                                    str12 = str6;
                                                                } else {
                                                                    str4 = str6;
                                                                    str12 = str4;
                                                                    str13 = str13;
                                                                    arrayListA = arrayList2;
                                                                    str11 = str5;
                                                                }
                                                                break;
                                                            case 1320758513:
                                                                if (next2.equals(str11)) {
                                                                    ArrayList arrayList8 = new ArrayList();
                                                                    JSONArray jSONArray5 = jSONObject6.getJSONArray(str11);
                                                                    str5 = str11;
                                                                    str6 = str12;
                                                                    int i24 = 0;
                                                                    for (int length9 = jSONArray5.length(); i24 < length9; length9 = length9) {
                                                                        arrayList8.add(jSONArray5.getString(i24));
                                                                        i24++;
                                                                    }
                                                                    hashSet.addAll(arrayList8);
                                                                    str4 = str6;
                                                                }
                                                                str12 = str4;
                                                                str13 = str13;
                                                                arrayListA = arrayList2;
                                                                str11 = str5;
                                                                break;
                                                            default:
                                                                break;
                                                        }
                                                    } else {
                                                        arrayList2 = arrayListA;
                                                    }
                                                    str4 = str12;
                                                    str5 = str11;
                                                    str12 = str4;
                                                    str13 = str13;
                                                    arrayListA = arrayList2;
                                                    str11 = str5;
                                                }
                                                ArrayList arrayList9 = arrayListA;
                                                String str15 = str12;
                                                String str16 = str11;
                                                fy1 fy1Var = new fy1(cq2Var, arrayList9, strOptString5, strOptString6, if1VarA, j5Var2, nj.b0.O0(hashSet), nj.b0.O0(hashSet2), gcVar, strOptString7, strOptString8, linkedHashMap);
                                                if ((!arrayList9.isEmpty()) && if1VarA != null) {
                                                    arrayList6.add(fy1Var);
                                                    str12 = str15;
                                                    arrayList = arrayList6;
                                                    length6 = i19;
                                                    jSONArray2 = jSONArray3;
                                                    jSONObject3 = jSONObject7;
                                                    str10 = str14;
                                                    str11 = str16;
                                                    i18 = i20 + 1;
                                                } else {
                                                    throw new z02(str8);
                                                }
                                            } else {
                                                arrayList = arrayList5;
                                                throw new z02(str8);
                                            }
                                        } else {
                                            arrayList = arrayList5;
                                            throw new z02(str8);
                                        }
                                    } else {
                                        arrayList = arrayList5;
                                        throw new z02(str8);
                                    }
                                }
                                arrayList = arrayList5;
                                list4 = arrayList;
                                list3 = list11;
                            } else {
                                str2 = str7;
                                str3 = str8;
                                jSONObject = jSONObject3;
                                list6 = list11;
                                list5 = list6;
                                jSONObject3 = jSONObject;
                                str8 = str3;
                                list4 = list7;
                                list3 = list5;
                            }
                            itKeys = itKeys;
                            list8 = list3;
                            listA = list;
                            list7 = list4;
                            str7 = str2;
                            break;
                        case 116643:
                            if (!next.equals("ver")) {
                                str2 = str7;
                                str3 = str8;
                                jSONObject = jSONObject3;
                                list6 = list11;
                                list5 = list6;
                                jSONObject3 = jSONObject;
                                str8 = str3;
                                list4 = list7;
                                list3 = list5;
                                itKeys = itKeys;
                                list8 = list3;
                                listA = list;
                                list7 = list4;
                                str7 = str2;
                            } else {
                                String strOptString9 = jSONObject3.optString(next);
                                if (strOptString9 == null || strOptString9.length() == 0 || ck.p.e(strOptString9, "null")) {
                                    throw new z02(str8);
                                }
                                str9 = strOptString9;
                                list8 = list11;
                                listA = list;
                            }
                            break;
                        case 1320758513:
                            if (next.equals("renderTrackingUrls")) {
                                ArrayList arrayList10 = new ArrayList();
                                JSONArray jSONArray6 = jSONObject3.getJSONArray("renderTrackingUrls");
                                int length10 = jSONArray6.length();
                                for (int i25 = 0; i25 < length10; i25++) {
                                    arrayList10.add(jSONArray6.getString(i25));
                                }
                                list8 = arrayList10;
                                listA = list;
                            } else {
                                str2 = str7;
                                str3 = str8;
                                jSONObject = jSONObject3;
                                list6 = list11;
                                list5 = list6;
                                jSONObject3 = jSONObject;
                                str8 = str3;
                                list4 = list7;
                                list3 = list5;
                                itKeys = itKeys;
                                list8 = list3;
                                listA = list;
                                list7 = list4;
                                str7 = str2;
                            }
                            break;
                        case 1434631203:
                            if (next.equals("settings")) {
                                JSONObject jSONObject9 = jSONObject3.getJSONObject("settings");
                                Iterator<String> itKeys3 = jSONObject9.keys();
                                JSONObject jSONObject10 = null;
                                String strOptString10 = null;
                                Long lValueOf = null;
                                boolean z10 = false;
                                boolean zOptBoolean = false;
                                while (itKeys3.hasNext()) {
                                    String next4 = itKeys3.next();
                                    if (next4 != null) {
                                        switch (next4.hashCode()) {
                                            case -975961388:
                                                if (next4.equals("templateType") && ((strOptString10 = jSONObject9.optString(next4)) == null || strOptString10.length() == 0 || ck.p.e(strOptString10, "null"))) {
                                                    throw new z02(str8);
                                                }
                                                break;
                                            case 370967731:
                                                if (next4.equals("highlightingEnabled")) {
                                                    z10 = jSONObject9.getBoolean(next4);
                                                }
                                                break;
                                            case 1352271078:
                                                if (next4.equals("multiBannerAutoScrollInterval")) {
                                                    lValueOf = Long.valueOf(jSONObject9.getLong(next4));
                                                }
                                                break;
                                            case 1971060391:
                                                if (next4.equals("isLoopingVideo")) {
                                                    zOptBoolean = jSONObject9.optBoolean(next4);
                                                }
                                                break;
                                            case 2028941137:
                                                if (next4.equals("mediaAssetImageFallback")) {
                                                    jSONObject10 = jSONObject9.getJSONObject(next4);
                                                }
                                                break;
                                        }
                                    }
                                }
                                if (jSONObject10 != null) {
                                    this.f75398i.getClass();
                                    if (jSONObject10.has("width") && jSONObject10.has("height")) {
                                        yz2Var = new yz2(jSONObject10.getInt("width"), jSONObject10.getInt("height"));
                                    } else {
                                        yz2Var = null;
                                    }
                                } else {
                                    yz2Var = null;
                                }
                                my2Var = new my2(strOptString10, lValueOf, z10, zOptBoolean, yz2Var);
                                list8 = list11;
                                listA = list;
                            } else {
                                str2 = str7;
                                str3 = str8;
                                jSONObject = jSONObject3;
                                list6 = list11;
                                list5 = list6;
                                jSONObject3 = jSONObject;
                                str8 = str3;
                                list4 = list7;
                                list3 = list5;
                                itKeys = itKeys;
                                list8 = list3;
                                listA = list;
                                list7 = list4;
                                str7 = str2;
                            }
                            break;
                        case 1557034613:
                            if (next.equals("designs")) {
                                boolean z11 = knVar.f79481b;
                                ArrayList arrayList11 = new ArrayList();
                                JSONArray jSONArray7 = jSONObject3.getJSONArray("designs");
                                int length11 = jSONArray7.length();
                                for (int i26 = 0; i26 < length11; i26++) {
                                    xf0 xf0VarA = this.f75395f.a(jSONArray7.getJSONObject(i26));
                                    gi0 gi0VarA = xf0VarA != null ? this.f75394e.a(xf0VarA, z11) : null;
                                    if (gi0VarA != null) {
                                        arrayList11.add(gi0VarA);
                                    }
                                }
                                list9 = arrayList11;
                                list8 = list11;
                                listA = list;
                            } else {
                                str2 = str7;
                                str3 = str8;
                                jSONObject = jSONObject3;
                                list6 = list11;
                                list5 = list6;
                                jSONObject3 = jSONObject;
                                str8 = str3;
                                list4 = list7;
                                list3 = list5;
                                itKeys = itKeys;
                                list8 = list3;
                                listA = list;
                                list7 = list4;
                                str7 = str2;
                            }
                            break;
                        default:
                            str2 = str7;
                            str3 = str8;
                            jSONObject = jSONObject3;
                            list6 = list11;
                            list5 = list6;
                            jSONObject3 = jSONObject;
                            str8 = str3;
                            list4 = list7;
                            list3 = list5;
                            itKeys = itKeys;
                            list8 = list3;
                            listA = list;
                            list7 = list4;
                            str7 = str2;
                            break;
                    }
                } else {
                    str2 = str7;
                    itKeys = itKeys;
                    list = listA;
                    list2 = list8;
                    jSONObject = jSONObject3;
                }
                str3 = str8;
                list6 = list2;
                list5 = list6;
                jSONObject3 = jSONObject;
                str8 = str3;
                list4 = list7;
                list3 = list5;
                itKeys = itKeys;
                list8 = list3;
                listA = list;
                list7 = list4;
                str7 = str2;
            }
            List list12 = listA;
            List list13 = list8;
            String str17 = str8;
            if (!list7.isEmpty()) {
                return new d12(list7, list12, list13, j5Var, nj.l0.g(mj.h.a("status", do2.f76756c)), list9, list10, str9, my2Var, c7Var);
            }
            throw new z02(str17);
        }
        throw new z02("Native Ad json has not required attributes");
    }
}
