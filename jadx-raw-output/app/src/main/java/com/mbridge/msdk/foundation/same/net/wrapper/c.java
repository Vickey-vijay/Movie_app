package com.mbridge.msdk.foundation.same.net.wrapper;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import androidx.browser.trusted.sharing.ShareTarget;
import androidx.core.app.NotificationCompat;
import com.ironsource.C3426d4;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.same.DomainNameUtils;
import com.mbridge.msdk.foundation.same.net.Aa;
import com.mbridge.msdk.foundation.tools.SameMD5;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.interstitial.view.MBInterstitialActivity;
import com.mbridge.msdk.out.CustomInfoManager;
import com.mbridge.msdk.out.MBConfiguration;
import com.mbridge.msdk.tracker.network.k;
import com.mbridge.msdk.tracker.network.l;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: compiled from: CommonAsyncHttpRequest.java */
/* JADX INFO: loaded from: classes10.dex */
public class c {
    private static final String TAG = "c";
    public Context mContext;

    private String asUrlParams(Map<String, String> map) {
        if (map != null && map.size() != 0) {
            StringBuilder sb2 = new StringBuilder();
            try {
                for (String str : map.keySet()) {
                    if (!TextUtils.isEmpty(str)) {
                        String str2 = map.get(str);
                        if (TextUtils.isEmpty(str2)) {
                            str2 = "";
                        }
                        sb2.append(C3426d4.j.f28584c);
                        sb2.append(str);
                        sb2.append("=");
                        sb2.append(str2);
                    }
                }
            } catch (Exception e10) {
                if (MBridgeConstans.DEBUG) {
                    q0.b(TAG, e10.getMessage());
                }
                sb2 = null;
            }
            if (sb2 != null && sb2.length() > 0) {
                return sb2.toString();
            }
        }
        return null;
    }

    private static com.mbridge.msdk.tracker.network.h<?> createRequest(int i10, int i11, String str, com.mbridge.msdk.foundation.same.net.b bVar, String str2, long j10) {
        if (i10 == 0) {
            return new k(i11, str, str2, j10, new i(bVar));
        }
        if (i10 != 1) {
            return null;
        }
        return new com.mbridge.msdk.tracker.network.i(i11, str, str2, j10, new i(bVar));
    }

    /* JADX WARN: Code duplicated, block: B:100:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:101:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:18:0x005b  */
    /* JADX WARN: Code duplicated, block: B:20:0x006e  */
    /* JADX WARN: Code duplicated, block: B:25:0x0087 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:32:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:35:0x00af A[Catch: Exception -> 0x00fe, TRY_ENTER, TryCatch #0 {Exception -> 0x00fe, blocks: (B:35:0x00af, B:37:0x00b5, B:41:0x00c0, B:48:0x00e3, B:53:0x0102), top: B:91:0x00ad }] */
    /* JADX WARN: Code duplicated, block: B:37:0x00b5 A[Catch: Exception -> 0x00fe, TryCatch #0 {Exception -> 0x00fe, blocks: (B:35:0x00af, B:37:0x00b5, B:41:0x00c0, B:48:0x00e3, B:53:0x0102), top: B:91:0x00ad }] */
    /* JADX WARN: Code duplicated, block: B:39:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:43:0x00db A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:44:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:52:0x0100 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:53:0x0102 A[Catch: Exception -> 0x00fe, TRY_LEAVE, TryCatch #0 {Exception -> 0x00fe, blocks: (B:35:0x00af, B:37:0x00b5, B:41:0x00c0, B:48:0x00e3, B:53:0x0102), top: B:91:0x00ad }] */
    /* JADX WARN: Code duplicated, block: B:56:0x0122  */
    /* JADX WARN: Code duplicated, block: B:58:0x012e  */
    /* JADX WARN: Code duplicated, block: B:66:0x0167  */
    /* JADX WARN: Code duplicated, block: B:68:0x0173 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:69:0x0175  */
    /* JADX WARN: Code duplicated, block: B:70:0x018e  */
    /* JADX WARN: Code duplicated, block: B:73:0x0199  */
    /* JADX WARN: Code duplicated, block: B:78:0x01b8  */
    /* JADX WARN: Code duplicated, block: B:79:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:83:0x01d2  */
    /* JADX WARN: Code duplicated, block: B:87:0x01eb  */
    /* JADX WARN: Code duplicated, block: B:98:0x0081 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:69:0x0175, please report this as an issue */
    private void post(int i10, String str, e eVar, com.mbridge.msdk.foundation.same.net.b bVar, boolean z10, boolean z11, String str2, long j10) {
        e eVar2;
        e eVar3;
        String str3;
        JSONArray jSONArrayB;
        String str4;
        com.mbridge.msdk.setting.g gVarD;
        com.mbridge.msdk.setting.a aVarJ;
        com.mbridge.msdk.tracker.network.h<?> hVarCreateRequest;
        String str5;
        com.mbridge.msdk.setting.g gVarD2;
        int iZ0;
        String strK;
        String str6;
        int iK;
        if (eVar == null) {
            try {
                eVar2 = new e();
            } catch (Exception e10) {
                e = e10;
                eVar2 = eVar;
                q0.a(TAG, e.getMessage());
                eVar3 = eVar2;
                q0.c(TAG, "post url = " + str);
                if (str.contains(com.mbridge.msdk.foundation.same.net.utils.d.h().f35030d)) {
                    gVarD2 = com.mbridge.msdk.setting.h.b().d(com.mbridge.msdk.foundation.controller.c.n().b());
                    if (gVarD2 != null) {
                        iK = gVarD2.K();
                        try {
                            str6 = eVar3.a().get("data");
                            if (!z11) {
                                try {
                                    if (!com.mbridge.msdk.foundation.same.report.b.a(gVarD2, str6)) {
                                        return;
                                    }
                                } catch (Exception e11) {
                                    e = e11;
                                    e.printStackTrace();
                                }
                            }
                        } catch (Exception e12) {
                            e = e12;
                            str6 = "";
                        }
                        strK = gVarD2.k();
                        iZ0 = gVarD2.z0();
                        eVar3.a("a_stid", gVarD2.a());
                    } else {
                        iZ0 = 0;
                        strK = "UNKNOWN";
                        str6 = "";
                        iK = 1;
                    }
                    eVar3.a("country_code", strK);
                    try {
                        if (iK == 2) {
                            if (!TextUtils.isEmpty(str6)) {
                                return;
                            }
                            if (com.mbridge.msdk.foundation.same.report.b.a(gVarD2, str6)) {
                                if (iZ0 != 1) {
                                }
                                com.mbridge.msdk.foundation.same.net.f.b().a(com.mbridge.msdk.foundation.same.net.utils.d.h().f35039j, com.mbridge.msdk.foundation.same.net.utils.d.h().f35043n, eVar3.toString(), false, bVar);
                                return;
                            } else if (z11) {
                                if (iZ0 != 1) {
                                    return;
                                }
                                com.mbridge.msdk.foundation.same.net.f.b().a(com.mbridge.msdk.foundation.same.net.utils.d.h().f35039j, com.mbridge.msdk.foundation.same.net.utils.d.h().f35043n, eVar3.toString(), false, bVar);
                                return;
                            }
                        } else if (iK == 1) {
                            com.mbridge.msdk.foundation.same.net.f.b().a(com.mbridge.msdk.foundation.same.net.utils.d.h().f35039j, com.mbridge.msdk.foundation.same.net.utils.d.h().f35043n, eVar3.toString(), false, bVar);
                            return;
                        }
                    } catch (Exception e13) {
                        e13.printStackTrace();
                    }
                } else {
                    if (str.contains(com.mbridge.msdk.foundation.same.net.utils.d.h().f35037h)) {
                        if (str.contains(com.mbridge.msdk.foundation.same.net.utils.d.h().f35031d0)) {
                            if (eVar3 != null) {
                                str3 = str + "?" + eVar3.toString();
                            } else {
                                str3 = str;
                            }
                            jSONArrayB = com.mbridge.msdk.foundation.db.middle.b.a().b();
                            if (jSONArrayB != null) {
                                String string = jSONArrayB.toString();
                                eVar3 = new e();
                                eVar3.a(e.f35066k, string);
                            }
                            str4 = str3;
                        }
                        hVarCreateRequest = createRequest(i10, 1, str4, bVar, str2, j10);
                        if (hVarCreateRequest != null) {
                            if (eVar3 != null) {
                                str5 = eVar3.a().get(CampaignEx.JSON_KEY_LOCAL_REQUEST_ID);
                                if (TextUtils.isEmpty(str5)) {
                                    str5 = "";
                                }
                                hVarCreateRequest.a("local_id", str5);
                                String str7 = eVar3.a().get("ad_type");
                                hVarCreateRequest.a("ad_type", TextUtils.isEmpty(str7) ? "" : str7);
                                hVarCreateRequest.a(eVar3.a());
                            }
                            hVarCreateRequest.d(canTrack());
                            hVarCreateRequest.b("Content-Type", ShareTarget.ENCODING_TYPE_URL_ENCODED);
                            l.a().b().a(hVarCreateRequest);
                        }
                    }
                    gVarD = com.mbridge.msdk.setting.h.b().d(com.mbridge.msdk.foundation.controller.c.n().b());
                    if (gVarD != null) {
                        com.mbridge.msdk.foundation.same.net.f.b().a(com.mbridge.msdk.foundation.same.net.utils.d.h().f35041l, com.mbridge.msdk.foundation.same.net.utils.d.h().f35045p, eVar3.toString(), false, bVar);
                        return;
                    }
                }
                str4 = str;
                hVarCreateRequest = createRequest(i10, 1, str4, bVar, str2, j10);
                if (hVarCreateRequest != null) {
                    if (eVar3 != null) {
                        str5 = eVar3.a().get(CampaignEx.JSON_KEY_LOCAL_REQUEST_ID);
                        if (TextUtils.isEmpty(str5)) {
                            str5 = "";
                        }
                        hVarCreateRequest.a("local_id", str5);
                        String str8 = eVar3.a().get("ad_type");
                        hVarCreateRequest.a("ad_type", TextUtils.isEmpty(str8) ? "" : str8);
                        hVarCreateRequest.a(eVar3.a());
                    }
                    hVarCreateRequest.d(canTrack());
                    hVarCreateRequest.b("Content-Type", ShareTarget.ENCODING_TYPE_URL_ENCODED);
                    l.a().b().a(hVarCreateRequest);
                }
            }
        } else {
            eVar2 = eVar;
        }
        try {
            addExtraParams(str, eVar2);
            f.k(eVar2);
            com.mbridge.msdk.foundation.same.net.e eVarA = com.mbridge.msdk.foundation.same.net.utils.c.b().a(eVar2);
            if (eVarA != null && bVar != null) {
                bVar.onSuccess(eVarA);
                return;
            }
        } catch (Exception e14) {
            e = e14;
            q0.a(TAG, e.getMessage());
        }
        eVar3 = eVar2;
        q0.c(TAG, "post url = " + str);
        if (str.contains(com.mbridge.msdk.foundation.same.net.utils.d.h().f35030d)) {
            gVarD2 = com.mbridge.msdk.setting.h.b().d(com.mbridge.msdk.foundation.controller.c.n().b());
            if (gVarD2 != null) {
                iK = gVarD2.K();
                str6 = eVar3.a().get("data");
                if (!z11) {
                    if (!com.mbridge.msdk.foundation.same.report.b.a(gVarD2, str6)) {
                        return;
                    }
                }
                strK = gVarD2.k();
                iZ0 = gVarD2.z0();
                eVar3.a("a_stid", gVarD2.a());
            } else {
                iZ0 = 0;
                strK = "UNKNOWN";
                str6 = "";
                iK = 1;
            }
            eVar3.a("country_code", strK);
            if (iK == 2) {
                if (!TextUtils.isEmpty(str6)) {
                    return;
                }
                if (com.mbridge.msdk.foundation.same.report.b.a(gVarD2, str6)) {
                    if (iZ0 != 1 || iZ0 == 3) {
                        com.mbridge.msdk.foundation.same.net.f.b().a(com.mbridge.msdk.foundation.same.net.utils.d.h().f35039j, com.mbridge.msdk.foundation.same.net.utils.d.h().f35043n, eVar3.toString(), false, bVar);
                        return;
                    }
                } else if (z11) {
                    if (iZ0 != 1 && iZ0 != 3) {
                        return;
                    }
                    com.mbridge.msdk.foundation.same.net.f.b().a(com.mbridge.msdk.foundation.same.net.utils.d.h().f35039j, com.mbridge.msdk.foundation.same.net.utils.d.h().f35043n, eVar3.toString(), false, bVar);
                    return;
                }
            } else if (iK == 1) {
                com.mbridge.msdk.foundation.same.net.f.b().a(com.mbridge.msdk.foundation.same.net.utils.d.h().f35039j, com.mbridge.msdk.foundation.same.net.utils.d.h().f35043n, eVar3.toString(), false, bVar);
                return;
            }
        } else {
            if (str.contains(com.mbridge.msdk.foundation.same.net.utils.d.h().f35037h)) {
                if (str.contains(com.mbridge.msdk.foundation.same.net.utils.d.h().f35031d0)) {
                    if (eVar3 != null) {
                        str3 = str + "?" + eVar3.toString();
                    } else {
                        str3 = str;
                    }
                    jSONArrayB = com.mbridge.msdk.foundation.db.middle.b.a().b();
                    if (jSONArrayB != null) {
                        String string2 = jSONArrayB.toString();
                        eVar3 = new e();
                        eVar3.a(e.f35066k, string2);
                    }
                    str4 = str3;
                }
                hVarCreateRequest = createRequest(i10, 1, str4, bVar, str2, j10);
                if (hVarCreateRequest != null) {
                    if (eVar3 != null && eVar3.a() != null) {
                        str5 = eVar3.a().get(CampaignEx.JSON_KEY_LOCAL_REQUEST_ID);
                        if (TextUtils.isEmpty(str5)) {
                            str5 = "";
                        }
                        hVarCreateRequest.a("local_id", str5);
                        String str9 = eVar3.a().get("ad_type");
                        hVarCreateRequest.a("ad_type", TextUtils.isEmpty(str9) ? "" : str9);
                        hVarCreateRequest.a(eVar3.a());
                    }
                    hVarCreateRequest.d(canTrack());
                    hVarCreateRequest.b("Content-Type", ShareTarget.ENCODING_TYPE_URL_ENCODED);
                    l.a().b().a(hVarCreateRequest);
                }
            }
            gVarD = com.mbridge.msdk.setting.h.b().d(com.mbridge.msdk.foundation.controller.c.n().b());
            if (gVarD != null && (aVarJ = gVarD.j()) != null && aVarJ.h() == 1) {
                com.mbridge.msdk.foundation.same.net.f.b().a(com.mbridge.msdk.foundation.same.net.utils.d.h().f35041l, com.mbridge.msdk.foundation.same.net.utils.d.h().f35045p, eVar3.toString(), false, bVar);
                return;
            }
        }
        str4 = str;
        hVarCreateRequest = createRequest(i10, 1, str4, bVar, str2, j10);
        if (hVarCreateRequest != null) {
            if (eVar3 != null) {
                str5 = eVar3.a().get(CampaignEx.JSON_KEY_LOCAL_REQUEST_ID);
                if (TextUtils.isEmpty(str5)) {
                    str5 = "";
                }
                hVarCreateRequest.a("local_id", str5);
                String str10 = eVar3.a().get("ad_type");
                hVarCreateRequest.a("ad_type", TextUtils.isEmpty(str10) ? "" : str10);
                hVarCreateRequest.a(eVar3.a());
            }
            hVarCreateRequest.d(canTrack());
            hVarCreateRequest.b("Content-Type", ShareTarget.ENCODING_TYPE_URL_ENCODED);
            l.a().b().a(hVarCreateRequest);
        }
    }

    public boolean canTrack() {
        return true;
    }

    public void get(int i10, String str, e eVar, com.mbridge.msdk.foundation.same.net.b bVar, String str2, long j10) {
        get(i10, str, eVar, bVar, false, false, str2, j10);
    }

    public void getLoadOrSetting(int i10, String str, e eVar, com.mbridge.msdk.foundation.same.net.b bVar, String str2, long j10) {
        getLoadOrSetting(i10, str, eVar, bVar, true, str2, j10);
    }

    public void postFocusReport(int i10, String str, e eVar, com.mbridge.msdk.foundation.same.net.b bVar, String str2, long j10) {
        post(i10, str, eVar, bVar, false, true, str2, j10);
    }

    public void postV5(int i10, String str, e eVar, com.mbridge.msdk.foundation.same.net.b bVar, String str2, long j10) {
        String str3 = eVar.a().get("sign");
        if (TextUtils.isEmpty(str3)) {
            str3 = "";
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        eVar.a("ts", jCurrentTimeMillis + "");
        eVar.a("st", SameMD5.getMD5(jCurrentTimeMillis + str3));
        post(i10, str, eVar, bVar, false, false, str2, j10);
    }

    public void addExtraParams(String str, e eVar) {
        if (eVar == null) {
            q0.b(TAG, "addExtraParams error, params is null,frame work error");
            return;
        }
        String strA = Aa.a();
        if (strA == null) {
            strA = "";
        }
        eVar.a("channel", strA);
        eVar.a("band_width", com.mbridge.msdk.foundation.same.net.a.b().a() + "");
        eVar.a("open", com.mbridge.msdk.foundation.same.a.S);
        if (com.mbridge.msdk.util.b.a() && !TextUtils.isEmpty(str) && str.contains("setting")) {
            String strB = Aa.b();
            if (!TextUtils.isEmpty(strB)) {
                eVar.a("keyword", strB);
            }
        }
        String str2 = eVar.a().get(MBridgeConstans.PROPERTIES_UNIT_ID);
        if (str2 != null) {
            String customInfoByUnitId = CustomInfoManager.getInstance().getCustomInfoByUnitId(str2, str);
            if (!TextUtils.isEmpty(customInfoByUnitId)) {
                eVar.a("ch_info", customInfoByUnitId);
            }
            com.mbridge.msdk.setting.l lVarE = com.mbridge.msdk.setting.h.b().e(com.mbridge.msdk.foundation.controller.c.n().b(), str2);
            if (lVarE != null && !TextUtils.isEmpty(lVarE.a())) {
                eVar.a("u_stid", lVarE.a());
            }
        }
        if (!com.mbridge.msdk.foundation.controller.authoritycontroller.b.i()) {
            eVar.a("dev_source", "2");
        }
        if (DomainNameUtils.getInstance().isExcludeCNDomain()) {
            eVar.a("re_domain", "1");
        }
    }

    /* JADX WARN: Code duplicated, block: B:50:0x018e  */
    /* JADX WARN: Code duplicated, block: B:52:0x0194  */
    /* JADX WARN: Code duplicated, block: B:54:0x01a6  */
    /* JADX WARN: Code duplicated, block: B:58:0x01bf  */
    /* JADX WARN: Code duplicated, block: B:70:? A[RETURN, SYNTHETIC] */
    public void get(int i10, String str, e eVar, com.mbridge.msdk.foundation.same.net.b bVar, boolean z10, boolean z11, String str2, long j10) {
        e eVar2;
        e eVar3;
        String str3;
        com.mbridge.msdk.setting.g gVarB;
        com.mbridge.msdk.tracker.network.h<?> hVarCreateRequest;
        String str4;
        if (eVar == null) {
            try {
                eVar2 = new e();
            } catch (Exception e10) {
                e = e10;
                eVar2 = eVar;
                q0.a(TAG, e.getMessage());
                eVar3 = eVar2;
                if (str.contains(com.mbridge.msdk.foundation.same.net.utils.d.h().f35038i)) {
                    try {
                        JSONObject jSONObject = new JSONObject();
                        try {
                            jSONObject.put(NotificationCompat.MessagingStyle.Message.KEY_DATA_URI, com.mbridge.msdk.foundation.same.net.utils.d.h().f35042m + Uri.parse(str).getPath());
                            jSONObject.put("data", eVar3.b());
                        } catch (Throwable th2) {
                            q0.b(TAG, th2.getMessage());
                        }
                        com.mbridge.msdk.foundation.same.net.f.b().a(com.mbridge.msdk.foundation.same.net.utils.d.h().f35042m, com.mbridge.msdk.foundation.same.net.utils.d.h().f35046q, jSONObject.toString(), true, bVar);
                        return;
                    } catch (Throwable th3) {
                        q0.b(TAG, th3.getMessage());
                    }
                }
                str3 = str + "?" + eVar3.toString();
                gVarB = com.mbridge.msdk.setting.h.b().b(com.mbridge.msdk.foundation.controller.c.n().b());
                if (str3.length() < gVarB.n0()) {
                }
                if (str3.length() < gVarB.L()) {
                }
                hVarCreateRequest = createRequest(i10, 0, str, bVar, str2, j10);
                if (hVarCreateRequest != null) {
                    if (eVar3.a() != null) {
                        str4 = eVar3.a().get(CampaignEx.JSON_KEY_LOCAL_REQUEST_ID);
                        if (TextUtils.isEmpty(str4)) {
                            str4 = "";
                        }
                        hVarCreateRequest.a("local_id", str4);
                        String str5 = eVar3.a().get("ad_type");
                        hVarCreateRequest.a("ad_type", TextUtils.isEmpty(str5) ? "" : str5);
                        hVarCreateRequest.a(eVar3.a());
                    }
                    hVarCreateRequest.d(canTrack());
                    l.a().b().a(hVarCreateRequest);
                }
            }
        } else {
            eVar2 = eVar;
        }
        try {
            addExtraParams(str, eVar2);
            f.k(eVar2);
            String str6 = eVar2.a().get("sign");
            if (TextUtils.isEmpty(str6)) {
                str6 = "";
            }
            long jCurrentTimeMillis = System.currentTimeMillis();
            eVar2.a("ts", jCurrentTimeMillis + "");
            if (com.mbridge.msdk.util.b.a()) {
                eVar2.a("st", SameMD5.getMD5(str6 + jCurrentTimeMillis));
            } else {
                eVar2.a("st", SameMD5.getMD5(jCurrentTimeMillis + str6));
            }
            com.mbridge.msdk.foundation.same.net.e eVarA = com.mbridge.msdk.foundation.same.net.utils.c.b().a(eVar2);
            if (eVarA != null && bVar != null) {
                bVar.onSuccess(eVarA);
                return;
            }
        } catch (Exception e11) {
            e = e11;
            q0.a(TAG, e.getMessage());
        }
        eVar3 = eVar2;
        if (str.contains(com.mbridge.msdk.foundation.same.net.utils.d.h().f35038i) && com.mbridge.msdk.foundation.same.net.utils.d.h().f35048s) {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put(NotificationCompat.MessagingStyle.Message.KEY_DATA_URI, com.mbridge.msdk.foundation.same.net.utils.d.h().f35042m + Uri.parse(str).getPath());
            jSONObject2.put("data", eVar3.b());
            com.mbridge.msdk.foundation.same.net.f.b().a(com.mbridge.msdk.foundation.same.net.utils.d.h().f35042m, com.mbridge.msdk.foundation.same.net.utils.d.h().f35046q, jSONObject2.toString(), true, bVar);
            return;
        }
        str3 = str + "?" + eVar3.toString();
        gVarB = com.mbridge.msdk.setting.h.b().b(com.mbridge.msdk.foundation.controller.c.n().b());
        if (str3.length() < gVarB.n0() && str3.contains(com.mbridge.msdk.foundation.same.net.utils.d.h().f35038i)) {
            post(i10, str, eVar3, bVar, z11, false, str2, j10);
            return;
        }
        if (str3.length() < gVarB.L() && z10) {
            post(i10, str, eVar3, bVar, z11, false, str2, j10);
            return;
        }
        hVarCreateRequest = createRequest(i10, 0, str, bVar, str2, j10);
        if (hVarCreateRequest != null) {
            if (eVar3.a() != null) {
                str4 = eVar3.a().get(CampaignEx.JSON_KEY_LOCAL_REQUEST_ID);
                if (TextUtils.isEmpty(str4)) {
                    str4 = "";
                }
                hVarCreateRequest.a("local_id", str4);
                String str7 = eVar3.a().get("ad_type");
                hVarCreateRequest.a("ad_type", TextUtils.isEmpty(str7) ? "" : str7);
                hVarCreateRequest.a(eVar3.a());
            }
            hVarCreateRequest.d(canTrack());
            l.a().b().a(hVarCreateRequest);
        }
    }

    public void getLoadOrSetting(int i10, String str, e eVar, com.mbridge.msdk.foundation.same.net.b bVar, boolean z10, String str2, long j10) {
        get(i10, str, eVar, bVar, z10, false, str2, j10);
    }

    public c(Context context) {
        if (context == null) {
            this.mContext = com.mbridge.msdk.foundation.controller.c.n().d();
        } else {
            this.mContext = context.getApplicationContext();
        }
    }

    public void choiceV3OrV5BySetting(int i10, e eVar, com.mbridge.msdk.foundation.same.net.b bVar, String str, long j10) {
        int iB;
        e eVar2;
        com.mbridge.msdk.setting.g gVarB = com.mbridge.msdk.setting.h.b().b(com.mbridge.msdk.foundation.controller.c.n().b());
        if (TextUtils.isEmpty(str)) {
            iB = gVarB.q0();
        } else {
            iB = gVarB.B();
        }
        String strA = com.mbridge.msdk.foundation.same.net.utils.d.h().a(str, iB);
        if (iB < 2) {
            postV5(i10, strA, eVar, bVar, MBInterstitialActivity.INTENT_CAMAPIGN, j10);
            return;
        }
        if (iB % 2 == 0) {
            if (eVar == null) {
                eVar2 = new e();
            } else {
                eVar2 = eVar;
            }
            JSONArray jSONArrayB = com.mbridge.msdk.foundation.db.middle.b.a().b();
            if (jSONArrayB != null) {
                String string = jSONArrayB.toString();
                int i11 = com.mbridge.msdk.foundation.same.net.utils.d.h().i();
                if (i11 > 0 && string.length() > i11) {
                    post(i10, strA, eVar2, bVar, MBInterstitialActivity.INTENT_CAMAPIGN, j10);
                    return;
                }
                eVar2.a(e.f35066k, string);
            }
        } else {
            eVar2 = eVar;
        }
        getLoadOrSetting(i10, strA, eVar2, bVar, MBInterstitialActivity.INTENT_CAMAPIGN, j10);
    }

    public void getCampaign(int i10, String str, e eVar, com.mbridge.msdk.foundation.same.net.b bVar, long j10) {
        int iB;
        e eVar2;
        try {
            com.mbridge.msdk.setting.g gVarB = com.mbridge.msdk.setting.h.b().b(com.mbridge.msdk.foundation.controller.c.n().b());
            if (TextUtils.isEmpty(str)) {
                iB = gVarB.q0();
            } else {
                iB = gVarB.B();
            }
            String strA = com.mbridge.msdk.foundation.same.net.utils.d.h().a(str, iB);
            if (iB < 2) {
                postV5(i10, strA, eVar, bVar, true, MBInterstitialActivity.INTENT_CAMAPIGN, j10);
                return;
            }
            if (iB % 2 == 0) {
                if (eVar == null) {
                    eVar2 = new e();
                } else {
                    eVar2 = eVar;
                }
                JSONArray jSONArrayB = com.mbridge.msdk.foundation.db.middle.b.a().b();
                if (jSONArrayB != null) {
                    String string = jSONArrayB.toString();
                    int i11 = com.mbridge.msdk.foundation.same.net.utils.d.h().i();
                    if (i11 > 0 && string.length() > i11) {
                        post(i10, strA, eVar2, bVar, true, false, MBInterstitialActivity.INTENT_CAMAPIGN, j10);
                        return;
                    }
                    eVar2.a(e.f35066k, string);
                }
            } else {
                eVar2 = eVar;
            }
            get(i10, strA, eVar2, bVar, true, true, MBInterstitialActivity.INTENT_CAMAPIGN, j10);
        } catch (Exception e10) {
            if (MBridgeConstans.DEBUG) {
                q0.b(TAG, e10.getMessage());
            }
        }
    }

    public void postV5(int i10, String str, e eVar, com.mbridge.msdk.foundation.same.net.b bVar, boolean z10, String str2, long j10) {
        String str3 = eVar.a().get("sign");
        if (str3 == null) {
            str3 = "";
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        eVar.a("ts", jCurrentTimeMillis + "");
        eVar.a("st", SameMD5.getMD5(jCurrentTimeMillis + str3));
        post(i10, str, eVar, bVar, z10, false, str2, j10);
    }

    public void get(int i10, String str, Map<String, String> map, com.mbridge.msdk.foundation.same.net.b bVar, String str2, long j10) {
        if (map == null) {
            map = new HashMap<>();
        }
        map.put("app_id", com.mbridge.msdk.foundation.controller.c.n().b());
        map.put("sdk_version", MBConfiguration.SDK_VERSION);
        map.put("platform", "1");
        String strAsUrlParams = asUrlParams(map);
        if (!TextUtils.isEmpty(strAsUrlParams)) {
            str = str + "?" + strAsUrlParams;
        }
        String str3 = str;
        if (MBridgeConstans.DEBUG) {
            q0.a("AppletsModel", "get wx scheme url = " + str3);
        }
        com.mbridge.msdk.tracker.network.h<?> hVarCreateRequest = createRequest(i10, 0, str3, bVar, str2, j10);
        if (hVarCreateRequest != null) {
            String str4 = map.get(CampaignEx.JSON_KEY_LOCAL_REQUEST_ID);
            if (TextUtils.isEmpty(str4)) {
                str4 = "";
            }
            hVarCreateRequest.a("local_id", str4);
            String str5 = map.get("ad_type");
            hVarCreateRequest.a("ad_type", TextUtils.isEmpty(str5) ? "" : str5);
            hVarCreateRequest.a(map);
            hVarCreateRequest.d(canTrack());
            l.a().b().a(hVarCreateRequest);
        }
    }

    public void post(int i10, String str, e eVar, com.mbridge.msdk.foundation.same.net.b bVar, String str2, long j10) {
        post(i10, str, eVar, bVar, false, false, str2, j10);
    }
}
