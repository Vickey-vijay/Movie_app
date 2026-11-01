package com.bytedance.sdk.openadsdk.core.cf.ouw;

import android.text.TextUtils;
import com.bytedance.sdk.component.pno.pno;
import com.bytedance.sdk.component.utils.ko;
import com.bytedance.sdk.openadsdk.core.bly;
import com.bytedance.sdk.openadsdk.core.zih;
import com.bytedance.sdk.openadsdk.utils.bs;
import com.safedk.android.internal.partials.PangleVideoBridge;
import java.io.IOException;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class vt {
    private static volatile vt ouw;

    public interface ouw {
        void ouw(int i10, String str, String str2);

        void ouw(JSONObject jSONObject, String str);
    }

    public static vt ouw() {
        if (ouw == null) {
            synchronized (vt.class) {
                if (ouw == null) {
                    ouw = new vt();
                }
            }
        }
        return ouw;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void lh() {
        int iYu = zih.yu().yu();
        if (iYu <= 0) {
            iYu = 100;
        }
        List<com.bytedance.sdk.openadsdk.core.cf.ouw.ouw> listVt = lh.ouw().vt();
        if (!listVt.isEmpty() && iYu < listVt.size()) {
            int size = (int) (listVt.size() - (iYu * 0.75f));
            if (size <= 0) {
                return;
            }
            TreeMap treeMap = new TreeMap();
            for (com.bytedance.sdk.openadsdk.core.cf.ouw.ouw ouwVar : listVt) {
                treeMap.put(ouwVar.yu, ouwVar);
            }
            HashSet hashSet = new HashSet();
            int i10 = 0;
            for (Map.Entry entry : treeMap.entrySet()) {
                if (entry != null && i10 < size) {
                    i10++;
                    com.bytedance.sdk.openadsdk.core.cf.ouw.ouw ouwVar2 = (com.bytedance.sdk.openadsdk.core.cf.ouw.ouw) entry.getValue();
                    if (ouwVar2 != null) {
                        hashSet.add(ouwVar2.ouw);
                    }
                }
            }
            ouw(hashSet);
            return;
        }
        ko.vt("UGTemplateManager", "end doCheckAndDeleteTask maxTplCnt,local size" + iYu + ", Number of templates currently stored" + listVt.size());
    }

    public final void ouw(String str, String str2, String str3, String str4, String str5, final ouw ouwVar) {
        if (!TextUtils.isEmpty(str3) && !TextUtils.isEmpty(str4)) {
            String str6 = str + "_" + str3;
            com.bytedance.sdk.openadsdk.core.cf.ouw.ouw ouwVarOuw = ouw(str6, str4);
            if (ouwVarOuw != null && !TextUtils.isEmpty(ouwVarOuw.fkw)) {
                ouw(ouwVarOuw);
                try {
                    ouwVar.ouw(PangleVideoBridge.jsonObjectInit(ouwVarOuw.fkw), "local");
                    return;
                } catch (JSONException unused) {
                    ouwVar.ouw(2, "parse json exception data is " + ouwVarOuw.fkw, "local");
                    return;
                }
            }
            ouw(str2, str6, str4, str5, new ouw() { // from class: com.bytedance.sdk.openadsdk.core.cf.ouw.vt.2
                @Override // com.bytedance.sdk.openadsdk.core.cf.ouw.vt.ouw
                public final void ouw(JSONObject jSONObject, String str7) {
                    ouw ouwVar2 = ouwVar;
                    if (ouwVar2 != null) {
                        ouwVar2.ouw(jSONObject, str7);
                    }
                }

                @Override // com.bytedance.sdk.openadsdk.core.cf.ouw.vt.ouw
                public final void ouw(int i10, String str7, String str8) {
                    ouw ouwVar2 = ouwVar;
                    if (ouwVar2 != null) {
                        ouwVar2.ouw(i10, str7, str8);
                    }
                }
            });
            return;
        }
        ouwVar.ouw(1, "id  or md5 is empty", "net");
    }

    private void ouw(final String str, final String str2, final String str3, final String str4, final ouw ouwVar) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || TextUtils.isEmpty(str3)) {
            if (ouwVar != null) {
                ouwVar.ouw(1, "template url or id  or md5 is empty", "net");
            }
        } else {
            com.bytedance.sdk.component.ra.vt.vt vtVarVt = com.bytedance.sdk.openadsdk.th.vt.ouw().ouw.vt();
            vtVarVt.ouw(str);
            vtVarVt.f11911ra = 7;
            vtVarVt.f11910le = "load_ug_t";
            vtVarVt.ouw(new com.bytedance.sdk.component.ra.ouw.ouw() { // from class: com.bytedance.sdk.openadsdk.core.cf.ouw.vt.3
                @Override // com.bytedance.sdk.component.ra.ouw.ouw
                public final void ouw(com.bytedance.sdk.component.ra.vt.lh lhVar, IOException iOException) {
                    ouw ouwVar2 = ouwVar;
                    if (ouwVar2 != null) {
                        ouwVar2.ouw(3, "net error " + iOException.getMessage(), "net");
                    }
                }

                @Override // com.bytedance.sdk.component.ra.ouw.ouw
                public final void ouw(com.bytedance.sdk.component.ra.vt.lh lhVar, com.bytedance.sdk.component.ra.vt vtVar) {
                    if (vtVar == null) {
                        return;
                    }
                    if (vtVar.pno) {
                        String str5 = vtVar.yu;
                        if (TextUtils.isEmpty(str5)) {
                            ouw ouwVar2 = ouwVar;
                            if (ouwVar2 != null) {
                                ouwVar2.ouw(3, "net data is null", "net");
                                return;
                            }
                            return;
                        }
                        com.bytedance.sdk.openadsdk.core.cf.ouw.ouw ouwVar3 = new com.bytedance.sdk.openadsdk.core.cf.ouw.ouw();
                        ouwVar3.ouw = str2;
                        ouwVar3.vt = str3;
                        ouwVar3.f12645lh = str;
                        ouwVar3.f12644le = str4;
                        ouwVar3.fkw = str5;
                        ouwVar3.yu = Long.valueOf(System.currentTimeMillis());
                        lh.ouw().ouw(ouwVar3);
                        vt.lh();
                        if (ouwVar != null) {
                            try {
                                ouwVar.ouw(PangleVideoBridge.jsonObjectInit(str5), "net");
                                return;
                            } catch (JSONException unused) {
                                ouwVar.ouw(2, "parse json exception data is".concat(String.valueOf(str5)), "net");
                                return;
                            }
                        }
                        return;
                    }
                    ouw ouwVar4 = ouwVar;
                    if (ouwVar4 != null) {
                        ouwVar4.ouw(3, "net code error code is " + vtVar.ouw + " message is " + vtVar.vt, "net");
                    }
                }
            });
        }
    }

    public static Set<com.bytedance.sdk.openadsdk.core.cf.ouw.ouw> ouw(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return lh.ouw().ouw(str);
    }

    public final String ouw(String str, String str2, String str3) {
        com.bytedance.sdk.openadsdk.core.cf.ouw.ouw ouwVarOuw = ouw(str + "_" + str2, str3);
        if (ouwVarOuw == null) {
            return null;
        }
        ouw(ouwVarOuw);
        return ouwVarOuw.fkw;
    }

    private static com.bytedance.sdk.openadsdk.core.cf.ouw.ouw ouw(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return null;
        }
        return lh.ouw().ouw(str, str2);
    }

    private static void ouw(String str, String str2, String str3, String str4, String str5) {
        com.bytedance.sdk.openadsdk.core.cf.ouw.ouw ouwVar = new com.bytedance.sdk.openadsdk.core.cf.ouw.ouw();
        ouwVar.f12645lh = str;
        ouwVar.f12644le = str3;
        ouwVar.fkw = str4;
        ouwVar.vt = str2;
        ouwVar.ouw = str5;
        ouwVar.yu = Long.valueOf(System.currentTimeMillis());
        lh.ouw().ouw(ouwVar);
        lh();
    }

    private void ouw(final com.bytedance.sdk.openadsdk.core.cf.ouw.ouw ouwVar) {
        ouwVar.yu = Long.valueOf(System.currentTimeMillis());
        bs.ouw(new pno("updateTmplTime") { // from class: com.bytedance.sdk.openadsdk.core.cf.ouw.vt.4
            @Override // java.lang.Runnable
            public final void run() {
                lh.ouw().ouw(ouwVar);
            }
        }, 10);
    }

    private static void ouw(Set<String> set) {
        try {
            lh.ouw().ouw(set);
        } catch (Throwable th2) {
            ko.vt("UGTemplateManager", th2.getMessage());
        }
    }

    public final void ouw(com.bytedance.sdk.openadsdk.core.cf.pno.ouw ouwVar, String str) {
        if (ouwVar == null) {
            return;
        }
        if (TextUtils.isEmpty(ouwVar.ouw)) {
            ko.fkw("UGTemplateManager", "save ugen template error : tmpId is empty");
            return;
        }
        final String str2 = str + "_" + ouwVar.ouw;
        final String str3 = ouwVar.f12650lh;
        final String str4 = ouwVar.vt;
        final String str5 = ouwVar.yu;
        String strYu = ouwVar.fkw;
        if (TextUtils.isEmpty(strYu)) {
            if (str.equals("ad")) {
                strYu = bly.ouw().yu();
            } else if (str.equals("adv3")) {
                strYu = bly.ouw().yu() + "_v3";
            }
        }
        final String str6 = strYu;
        bs.ouw(new pno("saveUGenTemplate") { // from class: com.bytedance.sdk.openadsdk.core.cf.ouw.vt.1
            @Override // java.lang.Runnable
            public final void run() {
                vt.ouw(vt.this, str2, str3, str4, str5, str6);
            }
        }, 10);
    }

    public static /* synthetic */ void ouw(vt vtVar, String str, String str2, String str3, String str4, String str5) {
        if (ouw(str, str3) != null) {
            if (TextUtils.isEmpty(str4) || TextUtils.isEmpty(str3)) {
                return;
            }
            ouw(str2, str3, str5, str4, str);
            return;
        }
        if (TextUtils.isEmpty(str4)) {
            vtVar.ouw(str2, str, str3, str5, (ouw) null);
        } else {
            ouw(str2, str3, str5, str4, str);
        }
    }
}
