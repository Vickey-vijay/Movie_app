package com.bytedance.sdk.openadsdk.le;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.SystemClock;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.app.NotificationCompat;
import com.bytedance.sdk.component.utils.pno;
import com.bytedance.sdk.component.utils.qbp;
import com.bytedance.sdk.openadsdk.core.jg;
import com.bytedance.sdk.openadsdk.core.model.vpp;
import com.bytedance.sdk.openadsdk.rn.lh;
import com.bytedance.sdk.openadsdk.rn.ouw.yu;
import com.bytedance.sdk.openadsdk.utils.uq;
import com.ironsource.C3605n2;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public final class vt {
    private static volatile vt ouw;
    private final ConcurrentHashMap<String, com.bytedance.sdk.openadsdk.zih.ouw> vt = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    private com.bytedance.sdk.openadsdk.zih.ouw f13228lh = null;
    private volatile boolean yu = false;
    private volatile HandlerThread fkw = null;

    /* JADX INFO: renamed from: le, reason: collision with root package name */
    private volatile Handler f13227le = null;

    /* JADX INFO: renamed from: ra, reason: collision with root package name */
    private String f13229ra = "";
    private int pno = 0;
    private volatile long bly = 0;
    private final Runnable tlj = new Runnable() { // from class: com.bytedance.sdk.openadsdk.le.vt.6
        @Override // java.lang.Runnable
        public final void run() {
            try {
                JSONObject jSONObject = new JSONObject();
                JSONObject jSONObject2 = new JSONObject();
                try {
                    if (ouw.ouw().f13222ko) {
                        Set<String> setKeySet = vt.this.vt.keySet();
                        if (setKeySet.size() > vt.this.pno) {
                            vt.this.pno = setKeySet.size();
                        }
                        HashSet hashSet = new HashSet(5);
                        ArrayList arrayList = new ArrayList(setKeySet.size());
                        arrayList.addAll(vt.this.vt.values());
                        Collections.sort(arrayList);
                        for (int i10 = 0; i10 < arrayList.size() && i10 < 5; i10++) {
                            hashSet.add(((com.bytedance.sdk.openadsdk.zih.ouw) arrayList.get(i10)).ouw);
                        }
                        try {
                            for (String str : setKeySet) {
                                com.bytedance.sdk.openadsdk.zih.ouw ouwVar = (com.bytedance.sdk.openadsdk.zih.ouw) vt.this.vt.get(str);
                                if (ouwVar != null) {
                                    JSONObject jSONObjectOuw = ouwVar.ouw(jSONObject2);
                                    if (hashSet.contains(str)) {
                                        jSONObject.put(str, jSONObjectOuw);
                                    }
                                }
                            }
                            jSONObject.put("common", jSONObject2);
                        } catch (JSONException e10) {
                            qbp.yu(e10.getMessage(), new Object[0]);
                        }
                    } else {
                        try {
                            if (vt.this.f13228lh != null) {
                                jSONObject.put("common", vt.this.f13228lh.ouw(jSONObject2));
                            }
                        } catch (JSONException e11) {
                            qbp.yu(e11.getMessage(), new Object[0]);
                        }
                    }
                } catch (Throwable th2) {
                    qbp.yu(th2.getMessage(), new Object[0]);
                }
                vt.this.f13229ra = jSONObject.toString();
                vt vtVar = vt.this;
                vtVar.ouw(vtVar.tlj, ouw.ouw().f13221jg);
            } catch (OutOfMemoryError e12) {
                qbp.yu(e12.getMessage(), new Object[0]);
            }
        }
    };

    private void lh() {
        final long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (jElapsedRealtime - this.bly > 10000) {
            lh.ouw("track_feature_result", false, new com.bytedance.sdk.openadsdk.rn.vt() { // from class: com.bytedance.sdk.openadsdk.le.vt.1
                @Override // com.bytedance.sdk.openadsdk.rn.vt
                @Nullable
                public final com.bytedance.sdk.openadsdk.rn.ouw.lh ouw() throws Exception {
                    vt.this.bly = jElapsedRealtime;
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put(NotificationCompat.CATEGORY_MESSAGE, String.valueOf(vt.this.pno));
                    yu yuVar = new yu();
                    yuVar.ouw = "track_feature_result";
                    yuVar.bly = jSONObject.toString();
                    return yuVar;
                }
            });
        }
    }

    private Handler vt() {
        if (this.fkw == null || !this.fkw.isAlive()) {
            synchronized (jg.class) {
                if (this.fkw == null || !this.fkw.isAlive()) {
                    this.fkw = pno.ouw("csj_feature", -1);
                    this.f13227le = new Handler(this.fkw.getLooper());
                }
            }
        } else if (this.f13227le == null) {
            synchronized (jg.class) {
                if (this.f13227le == null) {
                    this.f13227le = new Handler(this.fkw.getLooper());
                }
            }
        }
        return this.f13227le;
    }

    private vt() {
    }

    public final void ouw(Runnable runnable) {
        if (uq.ouw) {
            return;
        }
        try {
            vt().post(runnable);
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ouw(Runnable runnable, long j10) {
        if (uq.ouw || runnable == null) {
            return;
        }
        try {
            vt().postDelayed(runnable, j10);
        } catch (Throwable unused) {
        }
    }

    public static vt ouw() {
        if (ouw == null) {
            synchronized (com.bytedance.sdk.openadsdk.core.lh.class) {
                if (ouw == null) {
                    ouw = new vt();
                }
            }
        }
        return ouw;
    }

    public final void ouw(JSONObject jSONObject) {
        if (ouw.ouw().mwh) {
            try {
                jSONObject.put("feature_data", this.f13229ra);
                lh();
            } catch (JSONException e10) {
                qbp.yu(e10.getMessage(), new Object[0]);
            }
        }
    }

    public final void ouw(@NonNull final String str, @NonNull final String str2, final String str3, String str4) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || !ouw.ouw().mwh) {
            return;
        }
        if (!C3605n2.f30216v.equals(str) && !"click".equals(str) && !"dislike".equals(str)) {
            if (ouw.ouw().f13226rn) {
                if (TextUtils.isEmpty(str4)) {
                    return;
                }
                if (!"rewarded_video".equals(str4) && !"fullscreen_interstitial_ad".equals(str4) && !"open_ad".equals(str4)) {
                    return;
                }
            }
            if ("feed_play".equals(str) || "feed_pause".equals(str) || "feed_continue".equals(str) || "feed_over".equals(str) || "feed_break".equals(str) || "play_error".equals(str)) {
                ouw(new Runnable() { // from class: com.bytedance.sdk.openadsdk.le.vt.3
                    @Override // java.lang.Runnable
                    public final void run() {
                        vt.ouw(vt.this, str, str2, str3);
                    }
                });
                return;
            }
            return;
        }
        ouw(new Runnable() { // from class: com.bytedance.sdk.openadsdk.le.vt.2
            @Override // java.lang.Runnable
            public final void run() {
                vt.ouw(vt.this, str, str2, str3);
            }
        });
    }

    public final void ouw(@NonNull final String str, final vpp vppVar) {
        int i10;
        if (!TextUtils.isEmpty(str) && ouw.ouw().mwh && vpp.fkw(vppVar)) {
            if (!ouw.ouw().f13226rn || (i10 = vppVar.lna) == 8 || i10 == 7 || i10 == 3) {
                if ("videoPercent30".equals(str) || "videoForceBreak".equals(str)) {
                    ouw(new Runnable() { // from class: com.bytedance.sdk.openadsdk.le.vt.4
                        @Override // java.lang.Runnable
                        public final void run() {
                            String strTlj = vppVar.tlj();
                            String strUx = vppVar.ux();
                            if (TextUtils.isEmpty(strTlj)) {
                                return;
                            }
                            vt.ouw(vt.this, str, strTlj, strUx);
                        }
                    });
                }
            }
        }
    }

    public final void ouw(@NonNull final String str, final vpp vppVar, final String str2) {
        if (TextUtils.isEmpty(str) || !ouw.ouw().mwh) {
            return;
        }
        if ("landingStart".equals(str) || "landingFinish".equals(str) || "landingContinue".equals(str) || "landingPause".equals(str)) {
            ouw(new Runnable() { // from class: com.bytedance.sdk.openadsdk.le.vt.5
                @Override // java.lang.Runnable
                public final void run() {
                    vpp vppVar2 = vppVar;
                    if (vppVar2 == null || TextUtils.isEmpty(vppVar2.tlj())) {
                        return;
                    }
                    vt.ouw(vt.this, str, vppVar.tlj(), vppVar.ux() + str2);
                }
            });
        }
    }

    public static /* synthetic */ void ouw(vt vtVar, String str, String str2, String str3) {
        try {
            if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2) && ouw.ouw().mwh) {
                if (!vtVar.yu) {
                    vtVar.yu = true;
                    vtVar.ouw(vtVar.tlj, ouw.ouw().f13221jg);
                }
                if (ouw.ouw().f13222ko) {
                    com.bytedance.sdk.openadsdk.zih.ouw ouwVar = vtVar.vt.get(str2);
                    if (ouwVar == null) {
                        ouwVar = new com.bytedance.sdk.openadsdk.zih.ouw(str2);
                    }
                    ouwVar.ouw(str, str3);
                    vtVar.vt.put(str2, ouwVar);
                    return;
                }
                if (vtVar.f13228lh == null) {
                    vtVar.f13228lh = new com.bytedance.sdk.openadsdk.zih.ouw(str2);
                }
                vtVar.f13228lh.ouw(str, str3);
            }
        } catch (OutOfMemoryError e10) {
            qbp.yu(e10.getMessage(), new Object[0]);
        }
    }
}
