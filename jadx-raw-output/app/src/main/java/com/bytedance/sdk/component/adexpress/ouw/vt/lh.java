package com.bytedance.sdk.component.adexpress.ouw.vt;

import android.text.TextUtils;
import android.util.Pair;
import androidx.multidex.MultiDexExtractor;
import com.bytedance.sdk.component.utils.ko;
import com.bytedance.sdk.component.utils.uq;
import com.ironsource.G5;
import com.safedk.android.internal.partials.PangleFilesBridge;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public abstract class lh {
    public abstract File ouw();

    public final boolean ouw(Map<String, com.bytedance.sdk.component.adexpress.ouw.lh.ouw> map) {
        if (map == null || map.size() == 0) {
            ko.vt("PlayComponentEngineCacheManager", "map is false");
            return false;
        }
        Iterator<String> it = map.keySet().iterator();
        while (it.hasNext()) {
            com.bytedance.sdk.component.adexpress.ouw.lh.ouw ouwVar = map.get(it.next());
            if (ouwVar != null && !ouw(ouwVar.ouw())) {
                ko.vt("PlayComponentEngineCacheManager", "resources is false");
                return false;
            }
        }
        return true;
    }

    public final List<com.bytedance.sdk.component.adexpress.ouw.lh.ouw.C0086ouw> vt(com.bytedance.sdk.component.adexpress.ouw.lh.ouw ouwVar, com.bytedance.sdk.component.adexpress.ouw.lh.ouw ouwVar2) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        if (ouwVar2 == null || ouwVar2.ouw().isEmpty()) {
            arrayList2.addAll(ouwVar.ouw());
            ko.vt("PlayComponentEngineCacheManager", "loadTemplate update1");
        } else if (ouwVar.ouw().isEmpty()) {
            arrayList.addAll(ouwVar2.ouw());
            ko.vt("PlayComponentEngineCacheManager", "loadTemplate update2");
        } else {
            for (com.bytedance.sdk.component.adexpress.ouw.lh.ouw.C0086ouw c0086ouw : ouwVar.ouw()) {
                if (!ouwVar2.ouw().contains(c0086ouw) && c0086ouw != null && c0086ouw.ouw != null && c0086ouw.vt != null) {
                    arrayList2.add(c0086ouw);
                }
            }
            for (com.bytedance.sdk.component.adexpress.ouw.lh.ouw.C0086ouw c0086ouw2 : ouwVar2.ouw()) {
                if (!ouwVar.ouw().contains(c0086ouw2)) {
                    arrayList.add(c0086ouw2);
                }
            }
            ko.vt("PlayComponentEngineCacheManager", "loadTemplate update3");
        }
        if (ouw(arrayList2, arrayList3)) {
            return arrayList;
        }
        return null;
    }

    public static boolean lh(com.bytedance.sdk.component.adexpress.ouw.lh.ouw ouwVar, com.bytedance.sdk.component.adexpress.ouw.lh.ouw ouwVar2) {
        boolean z10 = true;
        if (ouwVar != null) {
            try {
                if (!TextUtils.isEmpty(ouwVar.ouw)) {
                    if (ouwVar2 == null) {
                        return false;
                    }
                    String str = ouwVar.yu;
                    String str2 = ouwVar2.yu;
                    if ((!TextUtils.isEmpty(str2) && !str2.equals(str)) || ouw(ouwVar.ouw, ouwVar2.ouw)) {
                        return true;
                    }
                    Map<String, com.bytedance.sdk.component.adexpress.ouw.lh.ouw> map = ouwVar.fkw;
                    Map<String, com.bytedance.sdk.component.adexpress.ouw.lh.ouw> map2 = ouwVar2.fkw;
                    if (map.isEmpty()) {
                        ko.vt("PlayComponentEngineCacheManager", "old engine is empty");
                        return !map2.isEmpty();
                    }
                    if (map2.isEmpty()) {
                        return false;
                    }
                    if (map.size() == map2.size()) {
                        for (String str3 : map2.keySet()) {
                            com.bytedance.sdk.component.adexpress.ouw.lh.ouw ouwVar3 = map.get(str3);
                            if (ouwVar3 != null) {
                                com.bytedance.sdk.component.adexpress.ouw.lh.ouw ouwVar4 = map2.get(str3);
                                if (ouwVar4 == null) {
                                    break;
                                }
                                if (ouw(ouwVar3.ouw, ouwVar4.ouw)) {
                                }
                            }
                        }
                        z10 = false;
                    }
                    ko.vt("PlayComponentEngineCacheManager", "update:".concat(String.valueOf(z10)));
                    return z10;
                }
            } catch (Throwable th2) {
                ko.vt("PlayComponentEngineCacheManager", th2.getMessage());
                return false;
            }
        }
        return true;
    }

    public final boolean ouw(List<com.bytedance.sdk.component.adexpress.ouw.lh.ouw.C0086ouw> list) {
        String str;
        if (list == null || list.size() <= 0 || ouw() == null) {
            return false;
        }
        for (com.bytedance.sdk.component.adexpress.ouw.lh.ouw.C0086ouw c0086ouw : list) {
            String strOuw = com.bytedance.sdk.component.utils.fkw.ouw(c0086ouw.ouw);
            if (TextUtils.isEmpty(strOuw)) {
                return false;
            }
            File file = new File(ouw(), strOuw);
            String strOuw2 = com.bytedance.sdk.component.utils.fkw.ouw(file);
            if (!file.exists() || !file.isFile() || (str = c0086ouw.vt) == null || !str.equals(strOuw2)) {
                return false;
            }
        }
        return true;
    }

    public final boolean ouw(com.bytedance.sdk.component.adexpress.ouw.lh.ouw.vt vtVar) {
        if (vtVar == null || ouw() == null) {
            return false;
        }
        List<Pair<String, String>> list = vtVar.f11567lh;
        if (list == null || list.size() <= 0) {
            return true;
        }
        Iterator<Pair<String, String>> it = list.iterator();
        while (it.hasNext()) {
            File file = new File(ouw(), (String) it.next().first);
            if (!file.exists() || !file.isFile()) {
                return false;
            }
        }
        return true;
    }

    private void vt(List<com.bytedance.sdk.component.adexpress.ouw.lh.ouw.C0086ouw> list) {
        if (list == null || list.isEmpty()) {
            return;
        }
        Iterator<com.bytedance.sdk.component.adexpress.ouw.lh.ouw.C0086ouw> it = list.iterator();
        while (it.hasNext()) {
            File file = new File(ouw(), com.bytedance.sdk.component.utils.fkw.ouw(it.next().ouw));
            File file2 = new File(file + ".tmp");
            if (file.exists()) {
                try {
                    file.delete();
                } catch (Throwable unused) {
                }
            }
            if (file2.exists()) {
                try {
                    file2.delete();
                } catch (Throwable unused2) {
                }
            }
        }
    }

    private boolean ouw(List<com.bytedance.sdk.component.adexpress.ouw.lh.ouw.C0086ouw> list, List<com.bytedance.sdk.component.adexpress.ouw.lh.ouw.C0086ouw> list2) {
        File file;
        for (com.bytedance.sdk.component.adexpress.ouw.lh.ouw.C0086ouw c0086ouw : list) {
            String str = c0086ouw.ouw;
            String strOuw = com.bytedance.sdk.component.utils.fkw.ouw(str);
            File file2 = new File(ouw(), strOuw);
            File file3 = new File(file2 + ".tmp");
            if (file2.exists()) {
                try {
                    file2.delete();
                } catch (Throwable unused) {
                }
            }
            if (file3.exists()) {
                try {
                    file3.delete();
                } catch (Throwable unused2) {
                }
            }
            com.bytedance.sdk.component.ra.vt.ouw ouwVarLe = com.bytedance.sdk.component.adexpress.ouw.ouw.ouw.ouw().f11574lh.le();
            ouwVarLe.ouw(str);
            ouwVarLe.ouw(ouw().getAbsolutePath(), strOuw);
            com.bytedance.sdk.component.ra.vt vtVarOuw = ouwVarLe.ouw();
            list2.add(c0086ouw);
            if (vtVarOuw == null || !vtVarOuw.pno || (file = vtVarOuw.f11909ra) == null || !file.exists()) {
                vt(list2);
                ko.vt("PlayComponentEngineCacheManager", "really download error");
                return false;
            }
        }
        return true;
    }

    public static void vt(File file, com.bytedance.sdk.component.adexpress.ouw.lh.ouw ouwVar, String str) {
        if (ouwVar == null || file == null) {
            return;
        }
        try {
            new File(file, str).delete();
        } catch (Throwable unused) {
            ko.vt("PlayComponentEngineCacheManager", "clear() pkgjson target error");
        }
        if (ouwVar.ouw() != null) {
            Iterator<com.bytedance.sdk.component.adexpress.ouw.lh.ouw.C0086ouw> it = ouwVar.ouw().iterator();
            while (it.hasNext()) {
                try {
                    new File(file, com.bytedance.sdk.component.utils.fkw.ouw(it.next().ouw)).delete();
                } catch (Throwable unused2) {
                    ko.vt("PlayComponentEngineCacheManager", "clear() resource target error");
                }
            }
        }
    }

    public final boolean ouw(String str) {
        File file;
        String strOuw = com.bytedance.sdk.component.utils.fkw.ouw(str);
        File file2 = new File(ouw().getAbsoluteFile(), strOuw + MultiDexExtractor.EXTRACTED_SUFFIX);
        com.bytedance.sdk.component.ra.vt.ouw ouwVarLe = com.bytedance.sdk.component.adexpress.ouw.ouw.ouw.ouw().f11574lh.le();
        ouwVarLe.ouw(str);
        ouwVarLe.ouw(file2.getParent(), file2.getName());
        com.bytedance.sdk.component.ra.vt vtVarOuw = ouwVarLe.ouw();
        if (vtVarOuw.pno && (file = vtVarOuw.f11909ra) != null && file.exists()) {
            File file3 = vtVarOuw.f11909ra;
            try {
                uq.ouw(file3.getAbsolutePath(), file2.getParent(), (String) null);
                if (!file3.exists()) {
                    return true;
                }
                file3.delete();
                return true;
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
        return false;
    }

    private static boolean ouw(String str, String str2) {
        String[] strArrSplit = str2.split("\\.");
        String[] strArrSplit2 = str.split("\\.");
        int iMin = Math.min(strArrSplit.length, strArrSplit2.length);
        for (int i10 = 0; i10 < iMin; i10++) {
            int length = strArrSplit[i10].length() - strArrSplit2[i10].length();
            if (length == 0) {
                int iCompareTo = strArrSplit[i10].compareTo(strArrSplit2[i10]);
                if (iCompareTo > 0) {
                    return true;
                }
                if (iCompareTo < 0) {
                    return false;
                }
                if (i10 == iMin - 1) {
                    return strArrSplit.length > strArrSplit2.length;
                }
            } else if (length > 0) {
                return true;
            }
        }
        return false;
    }

    public final List<com.bytedance.sdk.component.adexpress.ouw.lh.ouw.C0086ouw> ouw(com.bytedance.sdk.component.adexpress.ouw.lh.ouw ouwVar, com.bytedance.sdk.component.adexpress.ouw.lh.ouw ouwVar2) {
        Map<String, com.bytedance.sdk.component.adexpress.ouw.lh.ouw> map = ouwVar.fkw;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        if (map.size() == 0) {
            if (ouwVar2 != null && ouwVar2.fkw.size() != 0) {
                Map<String, com.bytedance.sdk.component.adexpress.ouw.lh.ouw> map2 = ouwVar2.fkw;
                Iterator<String> it = map2.keySet().iterator();
                while (it.hasNext()) {
                    com.bytedance.sdk.component.adexpress.ouw.lh.ouw ouwVar3 = map2.get(it.next());
                    if (ouwVar3 != null) {
                        arrayList.addAll(ouwVar3.ouw());
                        ko.vt("PlayComponentEngineCacheManager", "deleteAll");
                    }
                }
            }
        } else if (ouwVar2 != null && ouwVar2.fkw.size() != 0) {
            Map<String, com.bytedance.sdk.component.adexpress.ouw.lh.ouw> map3 = ouwVar2.fkw;
            for (String str : map.keySet()) {
                com.bytedance.sdk.component.adexpress.ouw.lh.ouw ouwVar4 = map.get(str);
                com.bytedance.sdk.component.adexpress.ouw.lh.ouw ouwVar5 = map3.get(str);
                if (ouwVar5 == null && ouwVar4 != null) {
                    arrayList2.addAll(ouwVar4.ouw());
                } else if (ouwVar4 == null && ouwVar5 != null) {
                    arrayList.addAll(ouwVar5.ouw());
                } else if (ouwVar4 != null) {
                    for (com.bytedance.sdk.component.adexpress.ouw.lh.ouw.C0086ouw c0086ouw : ouwVar4.ouw()) {
                        if (c0086ouw != null && !ouwVar5.ouw().contains(c0086ouw) && c0086ouw.vt != null && c0086ouw.ouw != null) {
                            arrayList2.add(c0086ouw);
                        }
                    }
                    for (com.bytedance.sdk.component.adexpress.ouw.lh.ouw.C0086ouw c0086ouw2 : ouwVar5.ouw()) {
                        if (c0086ouw2 != null && !ouwVar4.ouw().contains(c0086ouw2)) {
                            arrayList.add(c0086ouw2);
                        }
                    }
                }
            }
        } else if (map.size() != 0) {
            Iterator<String> it2 = map.keySet().iterator();
            while (it2.hasNext()) {
                com.bytedance.sdk.component.adexpress.ouw.lh.ouw ouwVar6 = map.get(it2.next());
                if (ouwVar6 != null) {
                    arrayList2.addAll(ouwVar6.ouw());
                    ko.vt("PlayComponentEngineCacheManager", "updateAll");
                }
            }
        }
        if (ouw(arrayList2, arrayList3)) {
            return arrayList;
        }
        ko.vt("PlayComponentEngineCacheManager", "download error");
        return null;
    }

    public static void ouw(File file, com.bytedance.sdk.component.adexpress.ouw.lh.ouw ouwVar, String str) {
        JSONObject jSONObjectLh;
        if (ouwVar == null) {
            return;
        }
        FileOutputStream fileOutputStream = null;
        String string = (!ouwVar.vt() || (jSONObjectLh = ouwVar.lh()) == null) ? null : jSONObjectLh.toString();
        if (TextUtils.isEmpty(string)) {
            return;
        }
        File file2 = new File(file, str);
        File file3 = new File(file2 + ".tmp");
        if (file3.exists()) {
            file3.delete();
        }
        try {
            FileOutputStream fileOutputStreamFileOutputStreamCtor = PangleFilesBridge.fileOutputStreamCtor(file3);
            try {
                fileOutputStreamFileOutputStreamCtor.write(string.getBytes(G5.N));
                if (file2.exists()) {
                    file2.delete();
                }
                file3.renameTo(file2);
                try {
                    fileOutputStreamFileOutputStreamCtor.close();
                } catch (IOException unused) {
                }
            } catch (Throwable th2) {
                th = th2;
                fileOutputStream = fileOutputStreamFileOutputStreamCtor;
                try {
                    ko.lh("PlayComponentEngineCacheManager", "version save error3", th);
                } finally {
                    if (fileOutputStream != null) {
                        try {
                            fileOutputStream.close();
                        } catch (IOException unused2) {
                        }
                    }
                }
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    public static boolean ouw(com.bytedance.sdk.component.adexpress.ouw.lh.ouw ouwVar, String str) {
        if (ouwVar == null) {
            return true;
        }
        try {
            if (TextUtils.isEmpty(ouwVar.ouw)) {
                return true;
            }
            if (TextUtils.isEmpty(str)) {
                return false;
            }
            return ouw(ouwVar.ouw, str);
        } catch (Throwable unused) {
            return false;
        }
    }
}
