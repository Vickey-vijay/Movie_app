package com.bytedance.sdk.component.adexpress.ouw.vt;

import android.text.TextUtils;
import android.util.Pair;
import android.webkit.WebResourceResponse;
import com.bytedance.sdk.component.adexpress.yu.bly;
import com.bytedance.sdk.component.pno.pno;
import com.bytedance.sdk.component.utils.ko;
import com.ironsource.G5;
import java.io.File;
import java.io.FileInputStream;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class vt {
    public static Object ouw = new Object();

    public static String lh() {
        return fkw.lh();
    }

    public static void ouw() {
        yu.vt();
    }

    public static void vt() {
        try {
            ra.vt();
            File fileLe = yu.le();
            if (fileLe == null || !fileLe.exists()) {
                return;
            }
            if (fileLe.getParentFile() != null) {
                com.bytedance.sdk.component.utils.ra.lh(fileLe.getParentFile());
            } else {
                com.bytedance.sdk.component.utils.ra.lh(fileLe);
            }
        } catch (Throwable unused) {
        }
    }

    public static boolean yu() {
        return yu.vt().vt;
    }

    public static com.bytedance.sdk.component.adexpress.ouw.lh.vt lh(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        le.ouw();
        final com.bytedance.sdk.component.adexpress.ouw.lh.vt vtVarOuw = le.ouw(str);
        if (vtVarOuw != null) {
            vtVarOuw.f11570ra = Long.valueOf(System.currentTimeMillis());
            com.bytedance.sdk.component.adexpress.yu.yu.ouw(new pno("updateTmplTime") { // from class: com.bytedance.sdk.component.adexpress.ouw.vt.vt.1
                @Override // java.lang.Runnable
                public final void run() {
                    synchronized (vt.ouw) {
                        fkw.ouw().ouw(vtVarOuw, true);
                    }
                }
            }, 10);
        }
        return vtVarOuw;
    }

    public static com.bytedance.sdk.component.adexpress.ouw.lh.vt ouw(String str) {
        le.ouw();
        return le.ouw(str);
    }

    private static boolean fkw(String str) {
        List<com.bytedance.sdk.component.adexpress.ouw.lh.ouw.C0086ouw> listOuw;
        if (yu.vt().vt) {
            yu.vt();
            com.bytedance.sdk.component.adexpress.ouw.lh.ouw ouwVarFkw = yu.fkw();
            if (ouwVarFkw != null && (listOuw = ouwVarFkw.ouw()) != null) {
                for (com.bytedance.sdk.component.adexpress.ouw.lh.ouw.C0086ouw c0086ouw : listOuw) {
                    if (c0086ouw != null && TextUtils.equals(str, c0086ouw.ouw)) {
                        return true;
                    }
                }
                return false;
            }
            return false;
        }
        return false;
    }

    private static File le(String str) {
        if (!yu.vt().vt) {
            return null;
        }
        yu.vt();
        for (com.bytedance.sdk.component.adexpress.ouw.lh.ouw.C0086ouw c0086ouw : yu.fkw().ouw()) {
            String str2 = c0086ouw.ouw;
            if (str2 != null && str2.equals(str)) {
                File file = new File(yu.le(), com.bytedance.sdk.component.utils.fkw.ouw(c0086ouw.ouw));
                String strOuw = com.bytedance.sdk.component.utils.fkw.ouw(file);
                String str3 = c0086ouw.vt;
                if (str3 == null || !str3.equals(strOuw)) {
                    return null;
                }
                return file;
            }
        }
        return null;
    }

    public static void ouw(com.bytedance.sdk.component.adexpress.ouw.lh.yu yuVar) {
        final le leVarOuw = le.ouw();
        String str = yuVar.f11571le;
        final String str2 = yuVar.ouw;
        final String str3 = yuVar.f11572lh;
        final String str4 = yuVar.vt;
        final String str5 = yuVar.yu;
        final String str6 = yuVar.fkw;
        final String strPno = TextUtils.isEmpty(str) ? com.bytedance.sdk.component.adexpress.ouw.ouw.ouw.ouw().f11574lh != null ? com.bytedance.sdk.component.adexpress.ouw.ouw.ouw.ouw().f11574lh.pno() : "" : str;
        if (TextUtils.isEmpty(str2)) {
            ko.fkw("TmplDiffManager", "saveTemplate error:tmpId is empty");
        } else {
            final String str7 = "saveTemplate";
            com.bytedance.sdk.component.adexpress.yu.yu.ouw(new pno(str7) { // from class: com.bytedance.sdk.component.adexpress.ouw.vt.le.1
                public final /* synthetic */ String fkw;

                /* JADX INFO: renamed from: le */
                public final /* synthetic */ String f11578le;

                /* JADX INFO: renamed from: lh */
                public final /* synthetic */ String f11579lh;
                public final /* synthetic */ String ouw;
                public final /* synthetic */ String vt;
                public final /* synthetic */ String yu;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass1(final String str8) {
                    super(str8);
                    str = str2;
                    str = str3;
                    str = str4;
                    str = str5;
                    str = str6;
                    str = strPno;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    le.this.ouw(str, str, str, str, str, str);
                }
            }, 10);
        }
    }

    private static File ra(String str) {
        List<Pair<String, String>> list;
        yu.vt();
        com.bytedance.sdk.component.adexpress.ouw.lh.ouw.vt vtVar = yu.fkw().f11564lh;
        if (vtVar == null || (list = vtVar.f11567lh) == null || list.size() <= 0) {
            return null;
        }
        for (Pair<String, String> pair : list) {
            Object obj = pair.second;
            if (obj != null && ((String) obj).equals(str)) {
                return new File(yu.le(), (String) pair.first);
            }
        }
        return null;
    }

    public static String yu(String str) {
        com.bytedance.sdk.component.adexpress.ouw.lh.ouw ouwVar;
        yu.vt();
        com.bytedance.sdk.component.adexpress.ouw.lh.ouw ouwVarFkw = yu.fkw();
        if (ouwVarFkw == null) {
            return null;
        }
        if (!TextUtils.isEmpty(str)) {
            Map<String, com.bytedance.sdk.component.adexpress.ouw.lh.ouw> map = ouwVarFkw.fkw;
            if (map == null || map.size() <= 0 || (ouwVar = map.get(str)) == null) {
                return null;
            }
            return ouwVar.vt;
        }
        yu.vt();
        com.bytedance.sdk.component.adexpress.ouw.lh.ouw ouwVarFkw2 = yu.fkw();
        if (ouwVarFkw2 == null) {
            return null;
        }
        return ouwVarFkw2.vt;
    }

    public static Set<String> vt(String str) {
        le.ouw();
        return le.vt(str);
    }

    public static boolean vt(JSONObject jSONObject) {
        Object objOpt;
        return (jSONObject == null || (objOpt = jSONObject.opt("xTemplate")) == null || TextUtils.isEmpty(objOpt.toString())) ? false : true;
    }

    public static ouw ouw(String str, bly.ouw ouwVar, String str2) {
        ouw ouwVar2 = new ouw();
        File fileLe = null;
        if (!TextUtils.isEmpty(str2)) {
            yu.vt();
            com.bytedance.sdk.component.adexpress.ouw.lh.ouw ouwVarFkw = yu.fkw();
            if (ouwVarFkw != null && yu.vt().vt) {
                Map<String, com.bytedance.sdk.component.adexpress.ouw.lh.ouw> map = ouwVarFkw.fkw;
                if (map.size() == 0) {
                    ko.vt("TTDynamic", "map is empty");
                } else {
                    com.bytedance.sdk.component.adexpress.ouw.lh.ouw ouwVar3 = map.get(str2);
                    if (ouwVar3 != null) {
                        for (com.bytedance.sdk.component.adexpress.ouw.lh.ouw.C0086ouw c0086ouw : ouwVar3.ouw()) {
                            String str3 = c0086ouw.ouw;
                            if (str3 != null && str3.equals(str)) {
                                File file = new File(yu.le(), com.bytedance.sdk.component.utils.fkw.ouw(c0086ouw.ouw));
                                String strOuw = com.bytedance.sdk.component.utils.fkw.ouw(file);
                                String str4 = c0086ouw.vt;
                                if (str4 == null || !str4.equals(strOuw)) {
                                    break;
                                    break;
                                }
                                fileLe = file;
                                break;
                            }
                        }
                    }
                }
            } else {
                ko.vt("TTDynamic", "is null");
            }
            if (fileLe != null) {
                ouwVar2.vt = 1;
            }
        }
        if (fileLe == null && (fileLe = ra(str)) != null) {
            ouwVar2.vt = 3;
        }
        if (fileLe == null && (fileLe = le(str)) != null) {
            ouwVar2.vt = 2;
        }
        if (!TextUtils.isEmpty(str2)) {
            if (!ouw(str, str2)) {
                ouwVar2.vt = 4;
            }
        } else if (!fkw(str)) {
            ouwVar2.vt = 6;
        }
        ko.vt("TTDynamic", "final type:" + ouwVar2.vt);
        if (fileLe != null) {
            try {
                ouwVar2.ouw = new WebResourceResponse(ouwVar.fkw, G5.N, new FileInputStream(fileLe));
            } catch (Throwable th2) {
                ko.lh("TTDynamic", "get html WebResourceResponse error", th2);
            }
        }
        return ouwVar2;
    }

    public static boolean ouw(JSONObject jSONObject) {
        Object objOpt;
        return (jSONObject == null || (objOpt = jSONObject.opt("template_Plugin")) == null || TextUtils.isEmpty(objOpt.toString())) ? false : true;
    }

    private static boolean ouw(String str, String str2) {
        com.bytedance.sdk.component.adexpress.ouw.lh.ouw ouwVar;
        if (!yu.vt().vt) {
            return false;
        }
        yu.vt();
        com.bytedance.sdk.component.adexpress.ouw.lh.ouw ouwVarFkw = yu.fkw();
        if (ouwVarFkw == null) {
            return false;
        }
        Map<String, com.bytedance.sdk.component.adexpress.ouw.lh.ouw> map = ouwVarFkw.fkw;
        if (map.size() == 0 || (ouwVar = map.get(str2)) == null) {
            return false;
        }
        for (com.bytedance.sdk.component.adexpress.ouw.lh.ouw.C0086ouw c0086ouw : ouwVar.ouw()) {
            if (c0086ouw != null && TextUtils.equals(str, c0086ouw.ouw)) {
                return true;
            }
        }
        return false;
    }
}
