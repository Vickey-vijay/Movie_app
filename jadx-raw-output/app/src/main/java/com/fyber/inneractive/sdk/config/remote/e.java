package com.fyber.inneractive.sdk.config.remote;

import android.text.TextUtils;
import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.mbridge.msdk.MBridgeConstans;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public a f15162a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public List f15163b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f15164c;

    /* JADX WARN: Code duplicated, block: B:28:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:49:0x016b  */
    public static e a(JSONObject jSONObject) {
        a aVar;
        String str;
        e eVar;
        String str2;
        Object obj;
        String str3;
        ArrayList arrayList;
        g gVar;
        String str4 = null;
        String strOptString = jSONObject.optString("updateHash", null);
        if (TextUtils.isEmpty(strOptString)) {
            return null;
        }
        e eVar2 = new e();
        eVar2.f15164c = strOptString;
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(MBridgeConstans.DYNAMIC_VIEW_WX_APP);
        int iOptInt = jSONObjectOptJSONObject == null ? -1 : jSONObjectOptJSONObject.optInt("id", -1);
        String str5 = "isActive";
        if (iOptInt == -1) {
            aVar = null;
        } else {
            aVar = new a();
            aVar.f15151a = String.valueOf(iOptInt);
            aVar.f15152b = jSONObjectOptJSONObject.optString("publisherId", null);
            aVar.f15153c = f.a(jSONObjectOptJSONObject.optJSONObject("monitor"));
            aVar.f15154d = j.a(jSONObjectOptJSONObject.optJSONObject("video"));
            aVar.f15155e = b.a(jSONObjectOptJSONObject.optJSONObject("display"));
            aVar.f15156f = k.a(jSONObjectOptJSONObject.optJSONObject("viewability"));
            aVar.f15157g = jSONObjectOptJSONObject.optString("isActive", null);
            JSONObject jSONObjectOptJSONObject2 = jSONObjectOptJSONObject.optJSONObject("native");
            if (jSONObjectOptJSONObject2 != null) {
                UnitDisplayType.fromValue(jSONObjectOptJSONObject2.optString("unitDisplayType"));
            }
        }
        if (aVar == null) {
            return null;
        }
        eVar2.f15162a = aVar;
        ArrayList arrayList2 = new ArrayList();
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("spots");
        if (jSONArrayOptJSONArray != null) {
            int i10 = 0;
            while (i10 < jSONArrayOptJSONArray.length()) {
                JSONObject jSONObjectOptJSONObject3 = jSONArrayOptJSONArray.optJSONObject(i10);
                if (jSONObjectOptJSONObject3 == null) {
                    jSONArrayOptJSONArray = jSONArrayOptJSONArray;
                    String str6 = str4;
                    str = str6;
                    eVar = eVar2;
                    str2 = str5;
                    obj = str6;
                } else {
                    String strOptString2 = jSONObjectOptJSONObject3.optString("id", str4);
                    if (TextUtils.isEmpty(strOptString2)) {
                        jSONArrayOptJSONArray = jSONArrayOptJSONArray;
                        String str7 = str4;
                        str = str7;
                        eVar = eVar2;
                        str2 = str5;
                        obj = str7;
                    } else {
                        h hVar = new h();
                        hVar.f15166a = strOptString2;
                        hVar.f15167b = jSONObjectOptJSONObject3.optString(str5, str4);
                        hVar.f15168c = b.a(jSONObjectOptJSONObject3.optJSONObject("display"));
                        hVar.f15169d = f.a(jSONObjectOptJSONObject3.optJSONObject("monitor"));
                        JSONObject jSONObjectOptJSONObject4 = jSONObjectOptJSONObject3.optJSONObject("native");
                        if (jSONObjectOptJSONObject4 != null) {
                            UnitDisplayType.fromValue(jSONObjectOptJSONObject4.optString("unitDisplayType"));
                        }
                        hVar.f15170e = j.a(jSONObjectOptJSONObject3.optJSONObject("video"));
                        hVar.f15171f = k.a(jSONObjectOptJSONObject3.optJSONObject("viewability"));
                        JSONArray jSONArrayOptJSONArray2 = jSONObjectOptJSONObject3.optJSONArray("units");
                        if (jSONArrayOptJSONArray2 == null || jSONArrayOptJSONArray2.length() == 0) {
                            str3 = str4;
                            eVar = eVar2;
                            str2 = str5;
                            arrayList = new ArrayList();
                        } else {
                            arrayList = new ArrayList();
                            int i11 = 0;
                            while (i11 < jSONArrayOptJSONArray2.length()) {
                                JSONObject jSONObjectOptJSONObject5 = jSONArrayOptJSONArray2.optJSONObject(i11);
                                if (jSONObjectOptJSONObject5 != null) {
                                    i iVar = new i();
                                    iVar.f15173a = jSONObjectOptJSONObject5.optString("id", null);
                                    iVar.f15174b = jSONObjectOptJSONObject5.optString("spotId", null);
                                    iVar.f15175c = b.a(jSONObjectOptJSONObject5.optJSONObject("display"));
                                    iVar.f15176d = f.a(jSONObjectOptJSONObject5.optJSONObject("monitor"));
                                    JSONObject jSONObjectOptJSONObject6 = jSONObjectOptJSONObject5.optJSONObject("native");
                                    if (jSONObjectOptJSONObject6 == null) {
                                        gVar = null;
                                    } else {
                                        g gVar2 = new g();
                                        if (UnitDisplayType.fromValue(jSONObjectOptJSONObject6.optString("unitDisplayType")) != null) {
                                            gVar = gVar2;
                                        } else {
                                            gVar = null;
                                        }
                                    }
                                    iVar.f15177e = gVar;
                                    iVar.f15178f = j.a(jSONObjectOptJSONObject5.optJSONObject("video"));
                                    iVar.f15179g = k.a(jSONObjectOptJSONObject5.optJSONObject("viewability"));
                                    arrayList.add(iVar);
                                }
                                i11++;
                                eVar2 = eVar2;
                                str5 = str5;
                                jSONArrayOptJSONArray2 = jSONArrayOptJSONArray2;
                            }
                            eVar = eVar2;
                            str2 = str5;
                            str3 = null;
                        }
                        hVar.f15172g = arrayList;
                        obj = hVar;
                        str = str3;
                    }
                }
                if (obj != null) {
                    arrayList2.add(obj);
                }
                i10++;
                str4 = str;
                eVar2 = eVar;
                jSONArrayOptJSONArray = jSONArrayOptJSONArray;
                str5 = str2;
            }
        }
        e eVar3 = eVar2;
        eVar3.f15163b = arrayList2;
        return eVar3;
    }
}
