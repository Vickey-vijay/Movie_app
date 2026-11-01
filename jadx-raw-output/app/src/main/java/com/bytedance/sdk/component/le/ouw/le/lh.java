package com.bytedance.sdk.component.le.ouw.le;

import android.annotation.SuppressLint;
import android.content.Context;
import android.text.TextUtils;
import com.bytedance.sdk.component.le.ouw.pno;
import com.bytedance.sdk.component.utils.ko;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class lh implements vt {
    public final Context ouw;
    private final fkw vt;

    @SuppressLint({"StaticFieldLeak"})
    public class ouw extends com.bytedance.sdk.component.le.ouw.fkw.fkw {

        /* JADX INFO: renamed from: lh, reason: collision with root package name */
        private final String f11778lh;
        private final yu vt;
        private final Map<String, String> yu;

        public /* synthetic */ ouw(lh lhVar, yu yuVar, String str, Map map, byte b10) {
            this(yuVar, str, map);
        }

        private ouw(yu yuVar, String str, Map<String, String> map) {
            super("AdsStats");
            this.vt = yuVar;
            this.f11778lh = str;
            this.yu = map;
        }

        @Override // java.lang.Runnable
        public final void run() {
            boolean z10;
            boolean z11;
            com.bytedance.sdk.component.le.ouw.fkw fkwVar = pno.vt().bly;
            if (fkwVar != null && pno.vt().ouw != null) {
                String str = this.vt.vt;
                if (!TextUtils.isEmpty(str) && (str.startsWith("http://") || str.startsWith("https://"))) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (!z10) {
                    return;
                }
                yu yuVar = this.vt;
                if (yuVar.yu >= fkwVar.lh(yuVar.f11780le)) {
                    lh.this.vt.lh(this.vt);
                    return;
                }
                try {
                    if (this.vt.yu == -1) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (z11) {
                        lh.this.vt.ouw(this.vt);
                    }
                    Context context = lh.this.ouw;
                    if (context == null) {
                        context = pno.vt().ouw;
                    }
                    if (!fkwVar.ouw(context)) {
                        return;
                    }
                    System.currentTimeMillis();
                    String str2 = this.vt.vt;
                    com.bytedance.sdk.component.le.ouw.fkw.lh lhVarYu = fkwVar.yu();
                    lhVarYu.ouw("User-Agent", fkwVar.lh());
                    lhVarYu.ouw("csj_client_source_from", "1");
                    if (this.yu != null) {
                        JSONObject jSONObject = new JSONObject();
                        for (Map.Entry<String, String> entry : this.yu.entrySet()) {
                            jSONObject.put(entry.getKey(), entry.getValue());
                        }
                        lhVarYu.ouw("csj_extra_info", jSONObject.toString());
                    }
                    lhVarYu.ouw(str2);
                    com.bytedance.sdk.component.le.ouw.fkw.yu yuVarOuw = null;
                    try {
                        yuVarOuw = lhVarYu.ouw();
                        yuVarOuw.ouw();
                    } catch (Throwable unused) {
                    }
                    this.vt.yu++;
                    if (yuVarOuw != null && yuVarOuw.ouw()) {
                        lh.this.vt.lh(this.vt);
                        String str3 = this.vt.vt;
                        com.bytedance.sdk.component.le.ouw.lh.vt.yu();
                        System.currentTimeMillis();
                        fkwVar.ouw(true, this.vt);
                        return;
                    }
                    if (yuVarOuw != null) {
                        yu yuVar2 = this.vt;
                        int iVt = yuVarOuw.vt();
                        yuVar2.bly = iVt;
                        if (iVt != 0) {
                            if (TextUtils.isEmpty(yuVar2.f11782ra)) {
                                yuVar2.f11782ra = String.valueOf(yuVar2.bly);
                            } else {
                                yuVar2.f11782ra += StringUtils.COMMA + yuVar2.bly;
                            }
                        }
                        yu yuVar3 = this.vt;
                        String strLh = yuVarOuw.lh();
                        yuVar3.tlj = strLh;
                        if (!TextUtils.isEmpty(strLh)) {
                            if (TextUtils.isEmpty(yuVar3.pno)) {
                                yuVar3.pno = String.valueOf(yuVar3.tlj);
                            } else {
                                yuVar3.pno += StringUtils.COMMA + yuVar3.tlj;
                            }
                        }
                    }
                    if (yuVarOuw != null && yuVarOuw.vt() == 8848) {
                        ko.vt("trackurl", "block url : " + yuVarOuw.lh());
                        lh.this.vt.lh(this.vt);
                    } else {
                        String str4 = this.vt.vt;
                        com.bytedance.sdk.component.le.ouw.lh.vt.yu();
                        yu yuVar4 = this.vt;
                        if (yuVar4.yu >= fkwVar.lh(yuVar4.f11780le)) {
                            lh.this.vt.lh(this.vt);
                            String str5 = this.vt.vt;
                            com.bytedance.sdk.component.le.ouw.lh.vt.yu();
                        } else {
                            lh.this.vt.vt(this.vt);
                        }
                    }
                    System.currentTimeMillis();
                    fkwVar.ouw(false, this.vt);
                } catch (Throwable unused2) {
                }
            }
        }
    }

    @Override // com.bytedance.sdk.component.le.ouw.le.vt
    public final void ouw(String str, List<String> list, boolean z10, Map<String, String> map, int i10, String str2) {
        com.bytedance.sdk.component.le.ouw.fkw fkwVar = pno.vt().bly;
        if (fkwVar == null || pno.vt().ouw == null || fkwVar.ouw() == null || list == null || list.size() == 0) {
            return;
        }
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            fkwVar.ouw().execute(new ouw(this, new yu(UUID.randomUUID().toString() + "_" + System.currentTimeMillis(), it.next(), z10, i10, str2), str, map, (byte) 0));
        }
    }

    public lh(Context context, fkw fkwVar) {
        this.ouw = context;
        this.vt = fkwVar;
    }

    @Override // com.bytedance.sdk.component.le.ouw.le.vt
    public final void ouw(final String str, final boolean z10) {
        com.bytedance.sdk.component.le.ouw.fkw fkwVar = pno.vt().bly;
        if (fkwVar == null || pno.vt().ouw == null) {
            return;
        }
        com.bytedance.sdk.component.le.ouw.fkw.fkw fkwVar2 = new com.bytedance.sdk.component.le.ouw.fkw.fkw("trackFailedUrls") { // from class: com.bytedance.sdk.component.le.ouw.le.lh.2
            @Override // java.lang.Runnable
            public final void run() {
                lh.ouw(lh.this, lh.this.vt.ouw(), str, z10);
            }
        };
        fkwVar2.pno = 1;
        if (fkwVar.ouw() != null) {
            fkwVar.ouw().execute(fkwVar2);
        }
    }

    @Override // com.bytedance.sdk.component.le.ouw.le.vt
    public final Runnable ouw(final yu yuVar, final String str, final Map<String, String> map) {
        if (TextUtils.isEmpty(yuVar.ouw)) {
            return null;
        }
        return new Runnable() { // from class: com.bytedance.sdk.component.le.ouw.le.lh.1
            @Override // java.lang.Runnable
            public final void run() {
                if (lh.this.vt.ouw(yuVar.ouw) != null) {
                    new ouw(lh.this, yuVar, str, map, (byte) 0).run();
                }
            }
        };
    }

    public static /* synthetic */ void ouw(lh lhVar, List list, String str, boolean z10) {
        if (list == null || list.size() == 0) {
            return;
        }
        com.bytedance.sdk.component.le.ouw.fkw fkwVar = pno.vt().bly;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            yu yuVar = (yu) it.next();
            if (fkwVar != null && fkwVar.ouw() != null) {
                yuVar.f11779cf = z10;
                fkwVar.ouw().execute(new ouw(lhVar, yuVar, str, null, (byte) 0));
            }
        }
    }
}
