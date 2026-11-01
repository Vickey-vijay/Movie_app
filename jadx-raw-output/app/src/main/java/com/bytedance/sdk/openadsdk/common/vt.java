package com.bytedance.sdk.openadsdk.common;

import android.annotation.SuppressLint;
import android.content.Context;
import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.CacheDirFactory;
import com.bytedance.sdk.openadsdk.core.model.od;
import com.bytedance.sdk.openadsdk.core.model.vpp;
import com.mgs.carparking.dbtable.SearchHistoryEntity;
import java.io.File;
import java.io.FileFilter;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes11.dex */
public class vt {
    private static final HashMap<String, vt> ouw = new HashMap<>();
    private static final HashMap<String, ouw> vt = new HashMap<>();
    private final String fkw;

    /* JADX INFO: renamed from: le, reason: collision with root package name */
    private final Map<vpp, Long> f12231le = Collections.synchronizedMap(new HashMap());

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    @SuppressLint({"StaticFieldLeak"})
    private final Context f12232lh;
    private final ouw yu;

    public static class ouw {
        public final String ouw;

        /* JADX INFO: renamed from: ra, reason: collision with root package name */
        private final HashSet<String> f12235ra = new HashSet<>();
        public String vt = "material_data";

        /* JADX INFO: renamed from: lh, reason: collision with root package name */
        public String f12234lh = "has_played";
        public String yu = SearchHistoryEntity.CREATE_TIME;
        public String fkw = "in_use_process";

        /* JADX INFO: renamed from: le, reason: collision with root package name */
        public String f12233le = "req_id";

        public final String lh(String str) {
            try {
                return com.bytedance.sdk.openadsdk.multipro.yu.yu.vt(ouw(str), this.f12233le, null);
            } catch (Throwable unused) {
                return null;
            }
        }

        public String ouw(String str) {
            if (TextUtils.isEmpty(str)) {
                str = "0";
            }
            return this.ouw + "_cache_" + str;
        }

        public String vt(String str) {
            try {
                return com.bytedance.sdk.openadsdk.multipro.yu.yu.vt(ouw(str), this.vt, null);
            } catch (Throwable unused) {
                return null;
            }
        }

        public final boolean ra(String str) {
            try {
                String strOuw = ouw(str);
                String strVt = com.bytedance.sdk.openadsdk.multipro.yu.yu.vt(strOuw, this.fkw, "");
                if (TextUtils.isEmpty(strVt)) {
                    return false;
                }
                com.bytedance.sdk.openadsdk.core.zih.ouw();
                if (strVt.equals(com.bytedance.sdk.component.utils.zin.ouw()) && !this.f12235ra.contains(str)) {
                    com.bytedance.sdk.openadsdk.multipro.yu.yu.ouw(strOuw, this.fkw, "");
                    return false;
                }
            } catch (Throwable unused) {
            }
            return true;
        }

        public final long yu(String str) {
            try {
                return com.bytedance.sdk.openadsdk.multipro.yu.yu.ouw(ouw(str), this.yu, 0L);
            } catch (Throwable unused) {
                return 0L;
            }
        }

        public ouw(String str) {
            this.ouw = TextUtils.isEmpty(str) ? "" : str;
        }

        public final boolean fkw(String str) {
            try {
                return com.bytedance.sdk.openadsdk.multipro.yu.yu.ouw(ouw(str), this.f12234lh);
            } catch (Throwable unused) {
                return true;
            }
        }

        public final void le(String str) {
            try {
                com.bytedance.sdk.openadsdk.core.zih.ouw();
                com.bytedance.sdk.openadsdk.multipro.yu.yu.ouw(ouw(str), this.fkw, com.bytedance.sdk.component.utils.zin.ouw());
                this.f12235ra.add(str);
            } catch (Throwable unused) {
            }
        }

        public void ouw(AdSlot adSlot, String str, String str2) {
            try {
                String codeId = adSlot.getCodeId();
                String strOuw = ouw(codeId);
                com.bytedance.sdk.openadsdk.multipro.yu.yu.ouw(strOuw, this.f12234lh, Boolean.FALSE);
                com.bytedance.sdk.openadsdk.multipro.yu.yu.ouw(strOuw, this.yu, Long.valueOf(System.currentTimeMillis()));
                com.bytedance.sdk.openadsdk.multipro.yu.yu.ouw(strOuw, this.vt, str);
                com.bytedance.sdk.openadsdk.multipro.yu.yu.ouw(strOuw, this.fkw, "");
                com.bytedance.sdk.openadsdk.multipro.yu.yu.ouw(strOuw, this.f12233le, str2);
                this.f12235ra.remove(codeId);
            } catch (Throwable unused) {
            }
        }

        public final void pno(String str) {
            try {
                com.bytedance.sdk.openadsdk.multipro.yu.yu.ouw(ouw(str));
                this.f12235ra.remove(str);
            } catch (Throwable unused) {
            }
        }
    }

    public static vt ouw(String str) {
        vt vtVar;
        HashMap<String, vt> map = ouw;
        vt vtVar2 = map.get(str);
        if (vtVar2 != null) {
            return vtVar2;
        }
        synchronized (vt.class) {
            vtVar = map.get(str);
            if (vtVar == null) {
                vtVar = new vt(com.bytedance.sdk.openadsdk.core.zih.ouw(), str);
                map.put(str, vtVar);
            }
        }
        return vtVar;
    }

    public final boolean fkw(String str) {
        return this.yu.ra(str);
    }

    public final String lh(String str) {
        long jYu = this.yu.yu(str);
        boolean zFkw = this.yu.fkw(str);
        if (!(System.currentTimeMillis() - jYu < 10500000) || zFkw) {
            return null;
        }
        return vt(str);
    }

    public final String vt(String str) {
        try {
            String strVt = this.yu.vt(str);
            if (TextUtils.isEmpty(strVt)) {
                return null;
            }
            return strVt;
        } catch (Throwable unused) {
            return null;
        }
    }

    public final void yu(String str) {
        this.yu.le(str);
    }

    private vt(Context context, String str) {
        this.f12232lh = context;
        ouw ouwVar = vt.get(str);
        this.yu = ouwVar == null ? new ouw(str) : ouwVar;
        this.fkw = str;
    }

    public static void ouw(String str, ouw ouwVar) {
        vt.put(str, ouwVar);
    }

    public final void ouw(String str, vpp vppVar) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        String strLh = this.yu.lh(str);
        String strUx = vppVar != null ? vppVar.ux() : "";
        if (TextUtils.isEmpty(strLh) || TextUtils.isEmpty(strUx) || strLh.equals(strUx)) {
            this.yu.pno(str);
        }
    }

    public final void ouw() {
        File[] fileArrListFiles;
        try {
            boolean z10 = com.bytedance.sdk.openadsdk.core.bly.fkw(this.fkw);
            File file = new File(this.f12232lh.getDataDir(), z10 ? "files" : "shared_prefs");
            if (file.exists() && file.isDirectory() && (fileArrListFiles = file.listFiles(new FileFilter() { // from class: com.bytedance.sdk.openadsdk.common.vt.1
                @Override // java.io.FileFilter
                public final boolean accept(File file2) {
                    if (file2 != null) {
                        return file2.getName().contains(vt.this.fkw);
                    }
                    return false;
                }
            })) != null) {
                for (File file2 : fileArrListFiles) {
                    if (z10) {
                        try {
                            com.bytedance.sdk.component.utils.ra.lh(file2);
                        } catch (Throwable unused) {
                        }
                    } else {
                        this.f12232lh.deleteSharedPreferences(file2.getName().replace(".xml", ""));
                    }
                }
            }
        } catch (Throwable unused2) {
        }
        try {
            File file3 = new File(CacheDirFactory.getICacheDir(0).ouw());
            if (file3.exists() && file3.isDirectory()) {
                com.bytedance.sdk.component.utils.ra.lh(file3);
            }
        } catch (Throwable unused3) {
        }
    }

    public final void ouw(AdSlot adSlot, com.bytedance.sdk.openadsdk.core.model.ouw ouwVar) {
        vpp vppVarLh;
        if ((ouwVar != null && ouwVar.lh() != null && ouwVar.lh().f12887zn) || ouwVar == null || adSlot == null || !TextUtils.isEmpty(adSlot.getBidAdm()) || (vppVarLh = ouwVar.lh()) == null || vppVarLh.yhj() == 2) {
            return;
        }
        try {
            this.yu.ouw(adSlot, ouwVar.f12792cf, ouwVar.ouw());
        } catch (Throwable unused) {
        }
    }

    public static boolean ouw(com.bytedance.sdk.openadsdk.core.model.ouw ouwVar) {
        if (ouwVar == null || !ouwVar.vt()) {
            return false;
        }
        Iterator<vpp> it = ouwVar.yu.iterator();
        while (it.hasNext()) {
            vpp next = it.next();
            boolean z10 = true;
            if (next == null || (!od.lh(next) && next.f12874sd == null)) {
                z10 = false;
            }
            if (!z10) {
                it.remove();
            }
        }
        return ouwVar.vt();
    }
}
