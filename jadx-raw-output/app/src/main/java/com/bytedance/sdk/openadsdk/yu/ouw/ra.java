package com.bytedance.sdk.openadsdk.yu.ouw;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.bytedance.sdk.component.utils.qbp;
import com.bytedance.sdk.openadsdk.BuildConfig;
import com.bytedance.sdk.openadsdk.core.vpp;
import com.bytedance.sdk.openadsdk.core.zih;
import com.bytedance.sdk.openadsdk.utils.bs;
import com.bytedance.sdk.openadsdk.utils.ex;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public final class ra implements com.bytedance.sdk.component.le.ouw.vt.lh {
    public vpp<com.bytedance.sdk.openadsdk.yu.ouw> ouw;
    public final ouw vt = ouw.ouw();

    @Override // com.bytedance.sdk.component.le.ouw.vt.lh
    public final void ouw(final List<com.bytedance.sdk.component.le.ouw.yu.ouw> list, @Nullable final com.bytedance.sdk.component.le.ouw.vt.vt vtVar) {
        com.bytedance.sdk.component.le.ouw.yu.ouw ouwVar;
        if (list == null || list.isEmpty() || !zih.yu().tc() || (ouwVar = list.get(0)) == null) {
            return;
        }
        byte bYu = ouwVar.yu();
        final ArrayList arrayList = new ArrayList();
        if (bYu == 0) {
            com.bytedance.sdk.openadsdk.vm.lh.ouw(new com.bytedance.sdk.openadsdk.vm.yu() { // from class: com.bytedance.sdk.openadsdk.yu.ouw.ra.1
                @Override // com.bytedance.sdk.openadsdk.vm.yu
                public final com.bytedance.sdk.openadsdk.vm.vt.ouw ouw() {
                    com.bytedance.sdk.openadsdk.vm.vt.ouw ouwVar2 = new com.bytedance.sdk.openadsdk.vm.vt.ouw();
                    ouwVar2.f13464lh = "applog";
                    return ouwVar2;
                }
            });
            bs.ouw(new com.bytedance.sdk.component.pno.lh.vt("upload_ad_event") { // from class: com.bytedance.sdk.openadsdk.yu.ouw.ra.2
                @Override // java.lang.Runnable
                public final void run() {
                    Iterator it;
                    int i10;
                    JSONObject jSONObjectYu;
                    try {
                        List list2 = list;
                        HashMap map = new HashMap();
                        new ArrayList();
                        for (int i11 = 0; i11 < list2.size(); i11++) {
                            com.bytedance.sdk.component.le.ouw.yu.ouw ouwVar2 = (com.bytedance.sdk.component.le.ouw.yu.ouw) list2.get(i11);
                            JSONObject jSONObjectRa = ouwVar2.ra();
                            if (jSONObjectRa != null) {
                                String strOptString = jSONObjectRa.optString("app_log_url");
                                List arrayList2 = (List) map.get(strOptString);
                                if (arrayList2 == null) {
                                    arrayList2 = new ArrayList();
                                    map.put(strOptString, arrayList2);
                                }
                                arrayList2.add(ouwVar2);
                            }
                        }
                        it = map.entrySet().iterator();
                    } catch (Throwable th2) {
                        qbp.lh("OverSeaEventUploadImp", th2.getMessage());
                        it = null;
                    }
                    if (it == null) {
                        com.bytedance.sdk.component.le.ouw.vt.vt vtVar2 = vtVar;
                        if (vtVar2 != null) {
                            vtVar2.ouw(arrayList);
                            return;
                        }
                        return;
                    }
                    while (it.hasNext()) {
                        try {
                            List<com.bytedance.sdk.component.le.ouw.yu.ouw> list3 = (List) ((Map.Entry) it.next()).getValue();
                            ArrayList arrayList3 = new ArrayList();
                            for (com.bytedance.sdk.component.le.ouw.yu.ouw ouwVar3 : list3) {
                                arrayList3.add(new com.bytedance.sdk.openadsdk.yu.ouw(ouwVar3.lh(), ouwVar3.ra()));
                            }
                            ra raVar = ra.this;
                            if (raVar.ouw == null) {
                                raVar.ouw = zih.lh();
                            }
                            com.bytedance.sdk.openadsdk.yu.fkw fkwVarOuw = raVar.ouw == null ? null : raVar.ouw.ouw(raVar.vt.ouw(ouw.vt(arrayList3), System.currentTimeMillis(), raVar.vt.vt()), ouw.ouw(arrayList3));
                            if (vtVar != null && fkwVarOuw != null) {
                                boolean z10 = fkwVarOuw.yu;
                                if (!((arrayList3.size() == 0 || (jSONObjectYu = ((com.bytedance.sdk.openadsdk.yu.ouw) arrayList3.get(0)).yu()) == null) ? true : TextUtils.isEmpty(jSONObjectYu.optString("app_log_url"))) && (i10 = fkwVarOuw.vt) >= 400 && i10 < 500) {
                                    z10 = true;
                                }
                                arrayList.add(new com.bytedance.sdk.component.le.ouw.vt.lh.ouw(new com.bytedance.sdk.component.le.ouw.vt.lh.vt(fkwVarOuw.ouw, fkwVarOuw.vt, fkwVarOuw.f13471lh, z10, ""), list3));
                                if (fkwVarOuw.vt == 200) {
                                    com.bytedance.sdk.openadsdk.vm.lh.vt(new com.bytedance.sdk.openadsdk.vm.yu() { // from class: com.bytedance.sdk.openadsdk.yu.ouw.ra.2.1
                                        @Override // com.bytedance.sdk.openadsdk.vm.yu
                                        public final com.bytedance.sdk.openadsdk.vm.vt.ouw ouw() {
                                            com.bytedance.sdk.openadsdk.vm.vt.ouw ouwVar4 = new com.bytedance.sdk.openadsdk.vm.vt.ouw();
                                            ouwVar4.f13464lh = "applog";
                                            return ouwVar4;
                                        }
                                    });
                                } else if (z10) {
                                    com.bytedance.sdk.openadsdk.vm.lh.lh(new com.bytedance.sdk.openadsdk.vm.yu() { // from class: com.bytedance.sdk.openadsdk.yu.ouw.ra.2.2
                                        @Override // com.bytedance.sdk.openadsdk.vm.yu
                                        public final com.bytedance.sdk.openadsdk.vm.vt.ouw ouw() {
                                            com.bytedance.sdk.openadsdk.vm.vt.ouw ouwVar4 = new com.bytedance.sdk.openadsdk.vm.vt.ouw();
                                            ouwVar4.f13464lh = "applog";
                                            return ouwVar4;
                                        }
                                    });
                                } else {
                                    com.bytedance.sdk.openadsdk.vm.lh.lh(new com.bytedance.sdk.openadsdk.vm.yu() { // from class: com.bytedance.sdk.openadsdk.yu.ouw.ra.2.3
                                        @Override // com.bytedance.sdk.openadsdk.vm.yu
                                        public final com.bytedance.sdk.openadsdk.vm.vt.ouw ouw() {
                                            com.bytedance.sdk.openadsdk.vm.vt.ouw ouwVar4 = new com.bytedance.sdk.openadsdk.vm.vt.ouw();
                                            ouwVar4.f13464lh = "applog";
                                            return ouwVar4;
                                        }
                                    });
                                }
                            }
                            if (vtVar != null && fkwVarOuw == null) {
                                com.bytedance.sdk.openadsdk.vm.lh.lh(new com.bytedance.sdk.openadsdk.vm.yu() { // from class: com.bytedance.sdk.openadsdk.yu.ouw.ra.2.4
                                    @Override // com.bytedance.sdk.openadsdk.vm.yu
                                    public final com.bytedance.sdk.openadsdk.vm.vt.ouw ouw() {
                                        com.bytedance.sdk.openadsdk.vm.vt.ouw ouwVar4 = new com.bytedance.sdk.openadsdk.vm.vt.ouw();
                                        ouwVar4.f13464lh = "applog";
                                        return ouwVar4;
                                    }
                                });
                            }
                        } catch (Throwable th3) {
                            qbp.lh("OverSeaEventUploadImp", th3.getMessage());
                        }
                    }
                    com.bytedance.sdk.component.le.ouw.vt.vt vtVar3 = vtVar;
                    if (vtVar3 != null) {
                        vtVar3.ouw(arrayList);
                    }
                }
            });
            return;
        }
        if (bYu == 1) {
            final ArrayList arrayList2 = new ArrayList();
            for (com.bytedance.sdk.component.le.ouw.yu.ouw ouwVar2 : list) {
                arrayList2.add(new com.bytedance.sdk.openadsdk.rn.lh.yu.ouw(ouwVar2.lh(), ouwVar2.ra()));
            }
            if (arrayList2.size() > 0) {
                com.bytedance.sdk.openadsdk.vm.lh.ouw(new com.bytedance.sdk.openadsdk.vm.yu() { // from class: com.bytedance.sdk.openadsdk.yu.ouw.ra.3
                    @Override // com.bytedance.sdk.openadsdk.vm.yu
                    public final com.bytedance.sdk.openadsdk.vm.vt.ouw ouw() {
                        com.bytedance.sdk.openadsdk.vm.vt.ouw ouwVar3 = new com.bytedance.sdk.openadsdk.vm.vt.ouw();
                        ouwVar3.f13464lh = "stats";
                        return ouwVar3;
                    }
                });
                bs.ouw(new com.bytedance.sdk.component.pno.lh.vt("upload_stats_event") { // from class: com.bytedance.sdk.openadsdk.yu.ouw.ra.4
                    @Override // java.lang.Runnable
                    public final void run() {
                        com.bytedance.sdk.openadsdk.yu.fkw fkwVarOuw = ra.this.ouw(arrayList2);
                        if (vtVar != null && fkwVarOuw != null) {
                            arrayList.add(new com.bytedance.sdk.component.le.ouw.vt.lh.ouw(new com.bytedance.sdk.component.le.ouw.vt.lh.vt(fkwVarOuw.ouw, fkwVarOuw.vt, fkwVarOuw.f13471lh, fkwVarOuw.yu, ""), list));
                            vtVar.ouw(arrayList);
                            if (fkwVarOuw.vt == 200) {
                                com.bytedance.sdk.openadsdk.vm.lh.vt(new com.bytedance.sdk.openadsdk.vm.yu() { // from class: com.bytedance.sdk.openadsdk.yu.ouw.ra.4.1
                                    @Override // com.bytedance.sdk.openadsdk.vm.yu
                                    public final com.bytedance.sdk.openadsdk.vm.vt.ouw ouw() {
                                        com.bytedance.sdk.openadsdk.vm.vt.ouw ouwVar3 = new com.bytedance.sdk.openadsdk.vm.vt.ouw();
                                        ouwVar3.f13464lh = "stats";
                                        return ouwVar3;
                                    }
                                });
                            } else if (fkwVarOuw.yu) {
                                com.bytedance.sdk.openadsdk.vm.lh.lh(new com.bytedance.sdk.openadsdk.vm.yu() { // from class: com.bytedance.sdk.openadsdk.yu.ouw.ra.4.2
                                    @Override // com.bytedance.sdk.openadsdk.vm.yu
                                    public final com.bytedance.sdk.openadsdk.vm.vt.ouw ouw() {
                                        com.bytedance.sdk.openadsdk.vm.vt.ouw ouwVar3 = new com.bytedance.sdk.openadsdk.vm.vt.ouw();
                                        ouwVar3.f13464lh = "stats";
                                        return ouwVar3;
                                    }
                                });
                            } else {
                                com.bytedance.sdk.openadsdk.vm.lh.lh(new com.bytedance.sdk.openadsdk.vm.yu() { // from class: com.bytedance.sdk.openadsdk.yu.ouw.ra.4.3
                                    @Override // com.bytedance.sdk.openadsdk.vm.yu
                                    public final com.bytedance.sdk.openadsdk.vm.vt.ouw ouw() {
                                        com.bytedance.sdk.openadsdk.vm.vt.ouw ouwVar3 = new com.bytedance.sdk.openadsdk.vm.vt.ouw();
                                        ouwVar3.f13464lh = "stats";
                                        return ouwVar3;
                                    }
                                });
                            }
                        }
                        if (vtVar == null || fkwVarOuw != null) {
                            return;
                        }
                        com.bytedance.sdk.openadsdk.vm.lh.lh(new com.bytedance.sdk.openadsdk.vm.yu() { // from class: com.bytedance.sdk.openadsdk.yu.ouw.ra.4.4
                            @Override // com.bytedance.sdk.openadsdk.vm.yu
                            public final com.bytedance.sdk.openadsdk.vm.vt.ouw ouw() {
                                com.bytedance.sdk.openadsdk.vm.vt.ouw ouwVar3 = new com.bytedance.sdk.openadsdk.vm.vt.ouw();
                                ouwVar3.f13464lh = "stats";
                                return ouwVar3;
                            }
                        });
                    }
                });
            }
        }
    }

    public final com.bytedance.sdk.openadsdk.yu.fkw ouw(List<com.bytedance.sdk.openadsdk.rn.lh.yu.ouw> list) {
        if (this.ouw == null) {
            this.ouw = zih.lh();
        }
        if (list != null && list.size() != 0 && com.bytedance.sdk.openadsdk.core.settings.ra.ouw()) {
            JSONObject jSONObject = new JSONObject();
            try {
                JSONArray jSONArray = new JSONArray();
                Iterator<com.bytedance.sdk.openadsdk.rn.lh.yu.ouw> it = list.iterator();
                while (it.hasNext()) {
                    jSONArray.put(it.next().vt);
                }
                jSONObject.put("stats_list", jSONArray);
                long jCurrentTimeMillis = System.currentTimeMillis();
                long j10 = jCurrentTimeMillis / 1000;
                jSONObject.put("ts", j10);
                jSONObject.put("ts_ms", jCurrentTimeMillis);
                String strYu = com.bytedance.sdk.openadsdk.core.bly.ouw().yu();
                if (strYu == null) {
                    strYu = "";
                }
                StringBuilder sb2 = new StringBuilder(ex.ouw());
                sb2.append("-");
                sb2.append(jCurrentTimeMillis);
                jSONObject.put("req_sign", com.bytedance.sdk.component.utils.fkw.ouw(strYu + j10 + BuildConfig.VERSION_NAME));
                jSONObject.put("req_uniq", com.bytedance.sdk.component.utils.fkw.ouw(sb2.toString()));
                return this.ouw.vt(jSONObject);
            } catch (Throwable unused) {
            }
        }
        return null;
    }
}
