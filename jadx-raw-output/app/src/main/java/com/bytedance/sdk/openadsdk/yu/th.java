package com.bytedance.sdk.openadsdk.yu;

import android.text.TextUtils;
import com.bytedance.sdk.component.utils.qbp;
import com.bytedance.sdk.openadsdk.core.model.vpp;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public final class th implements com.bytedance.sdk.openadsdk.yu.yu.fkw {
    public Boolean fkw;

    /* JADX INFO: renamed from: le, reason: collision with root package name */
    public JSONObject f13575le;

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    public Boolean f13576lh;
    public String ouw;
    public JSONArray pno;

    /* JADX INFO: renamed from: ra, reason: collision with root package name */
    public JSONArray f13577ra;
    public vpp vt;
    public Boolean yu;

    public th(int i10, String str, vpp vppVar) {
        Boolean bool = Boolean.FALSE;
        this.f13576lh = bool;
        this.yu = bool;
        this.fkw = bool;
        this.ouw = str;
        this.vt = vppVar;
        this.f13575le = new JSONObject();
        this.f13577ra = new JSONArray();
        this.pno = new JSONArray();
        ouw(this.f13575le, "webview_source", (Object) Integer.valueOf(i10), true);
    }

    @Override // com.bytedance.sdk.openadsdk.yu.yu.le
    public final void fkw() {
        com.bytedance.sdk.component.utils.bly.ouw().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.yu.th.28
            @Override // java.lang.Runnable
            public final void run() {
                long jCurrentTimeMillis = System.currentTimeMillis();
                JSONObject jSONObject = new JSONObject();
                th.ouw(jSONObject, "ts", (Object) Long.valueOf(jCurrentTimeMillis), true);
                th.ouw(th.this.f13575le, "webview_load_start", (Object) jSONObject, false);
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.yu.yu.le
    public final void le() {
        com.bytedance.sdk.component.utils.bly.ouw().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.yu.th.29
            @Override // java.lang.Runnable
            public final void run() {
                long jCurrentTimeMillis = System.currentTimeMillis();
                JSONObject jSONObject = new JSONObject();
                th.ouw(jSONObject, "ts", (Object) Long.valueOf(jCurrentTimeMillis), true);
                th.ouw(th.this.f13575le, "webview_load_success", (Object) jSONObject, true);
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.yu.yu.vt
    public final void lh() {
        com.bytedance.sdk.component.utils.bly.ouw().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.yu.th.26
            @Override // java.lang.Runnable
            public final void run() {
                long jCurrentTimeMillis = System.currentTimeMillis();
                JSONObject jSONObject = new JSONObject();
                th.ouw(jSONObject, "ts", (Object) Long.valueOf(jCurrentTimeMillis), true);
                th.ouw(th.this.f13575le, "native_render_start", (Object) jSONObject, true);
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.yu.yu.yu
    public final void ouw() {
        com.bytedance.sdk.component.utils.bly.ouw().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.yu.th.1
            @Override // java.lang.Runnable
            public final void run() {
                long jCurrentTimeMillis = System.currentTimeMillis();
                JSONObject jSONObject = new JSONObject();
                th.ouw(jSONObject, "ts", (Object) Long.valueOf(jCurrentTimeMillis), true);
                th.ouw(jSONObject, "render_sequence", (Object) Integer.valueOf(th.this.vt.kfa), true);
                vpp vppVar = th.this.vt;
                if (vppVar != null) {
                    vpp.ouw ouwVar = vppVar.f12886xn;
                    if (ouwVar != null) {
                        if (ouwVar.ouw()) {
                            th.ouw(jSONObject, "webview_count", (Object) Integer.valueOf(com.bytedance.sdk.component.adexpress.fkw.fkw.ouw().yu()), true);
                            th.ouw(jSONObject, "available_cache_count", (Object) Integer.valueOf(com.bytedance.sdk.component.adexpress.fkw.fkw.ouw().yu()), true);
                        } else {
                            th.ouw(jSONObject, "webview_count", (Object) Integer.valueOf(com.bytedance.sdk.component.adexpress.fkw.fkw.ouw().lh()), true);
                            th.ouw(jSONObject, "available_cache_count", (Object) Integer.valueOf(com.bytedance.sdk.component.adexpress.fkw.fkw.ouw().lh()), true);
                        }
                    } else if (vppVar.lht != null) {
                        th.ouw(jSONObject, "webview_count", (Object) Integer.valueOf(com.bytedance.sdk.component.adexpress.fkw.fkw.ouw().yu()), true);
                        th.ouw(jSONObject, "available_cache_count", (Object) Integer.valueOf(com.bytedance.sdk.component.adexpress.fkw.fkw.ouw().yu()), true);
                    }
                }
                th.ouw(th.this.f13575le, "render_start", (Object) jSONObject, true);
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.yu.yu.lh
    public final void ra() {
        com.bytedance.sdk.component.utils.bly.ouw().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.yu.th.31
            @Override // java.lang.Runnable
            public final void run() {
                long jCurrentTimeMillis = System.currentTimeMillis();
                JSONObject jSONObject = new JSONObject();
                th.ouw(jSONObject, "ts", (Object) Long.valueOf(jCurrentTimeMillis), true);
                th.ouw(th.this.f13575le, "native_endcard_show", (Object) jSONObject, true);
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.yu.yu.yu
    public final void vt() {
        com.bytedance.sdk.component.utils.bly.ouw().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.yu.th.12
            @Override // java.lang.Runnable
            public final void run() {
                long jCurrentTimeMillis = System.currentTimeMillis();
                JSONObject jSONObject = new JSONObject();
                th.ouw(jSONObject, "ts", (Object) Long.valueOf(jCurrentTimeMillis), true);
                th.ouw(th.this.f13575le, "render_success", (Object) jSONObject, true);
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.yu.yu.lh
    public final void yu() {
        com.bytedance.sdk.component.utils.bly.ouw().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.yu.th.27
            @Override // java.lang.Runnable
            public final void run() {
                long jCurrentTimeMillis = System.currentTimeMillis();
                JSONObject jSONObject = new JSONObject();
                th.ouw(jSONObject, "ts", (Object) Long.valueOf(jCurrentTimeMillis), true);
                th.ouw(th.this.f13575le, "native_render_end", (Object) jSONObject, true);
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.yu.yu.fkw
    public final void cf() {
        this.f13576lh = Boolean.TRUE;
    }

    @Override // com.bytedance.sdk.openadsdk.yu.yu.ouw
    public final void fkw(final String str) {
        try {
            com.bytedance.sdk.component.utils.bly.ouw().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.yu.th.20
                @Override // java.lang.Runnable
                public final void run() {
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    JSONObject jSONObject = new JSONObject();
                    th.ouw(jSONObject, "ts", (Object) Long.valueOf(jCurrentTimeMillis), true);
                    th.ouw(th.this.f13575le, str, (Object) jSONObject, true);
                }
            });
        } catch (Throwable th2) {
            com.bytedance.sdk.component.utils.ko.yu("WebviewTimeTrack", th2.getMessage());
        }
    }

    @Override // com.bytedance.sdk.openadsdk.yu.yu.ouw
    public final void le(final String str) {
        try {
            com.bytedance.sdk.component.utils.bly.ouw().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.yu.th.21
                @Override // java.lang.Runnable
                public final void run() {
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    JSONObject jSONObject = new JSONObject();
                    th.ouw(jSONObject, "ts", (Object) Long.valueOf(jCurrentTimeMillis), true);
                    th.ouw(th.this.f13575le, str, (Object) jSONObject, true);
                }
            });
        } catch (Throwable th2) {
            com.bytedance.sdk.component.utils.ko.yu("WebviewTimeTrack", th2.getMessage());
        }
    }

    @Override // com.bytedance.sdk.openadsdk.yu.yu.ouw
    public final void lh(final String str) {
        com.bytedance.sdk.component.utils.bly.ouw().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.yu.th.11
            @Override // java.lang.Runnable
            public final void run() {
                long jCurrentTimeMillis = System.currentTimeMillis();
                JSONObject jSONObject = new JSONObject();
                th.ouw(jSONObject, "ts", (Object) Long.valueOf(jCurrentTimeMillis), true);
                th.ouw(th.this.f13575le, str, (Object) jSONObject, true);
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.yu.yu.yu
    public final void ouw(final int i10, final String str) {
        com.bytedance.sdk.component.utils.bly.ouw().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.yu.th.23
            @Override // java.lang.Runnable
            public final void run() {
                long jCurrentTimeMillis = System.currentTimeMillis();
                JSONObject jSONObject = new JSONObject();
                th.ouw(jSONObject, "ts", (Object) Long.valueOf(jCurrentTimeMillis), true);
                th.ouw(jSONObject, "code", (Object) Integer.valueOf(i10), true);
                String str2 = str;
                if (str2 != null) {
                    th.ouw(jSONObject, "reason", (Object) str2, true);
                }
                th.ouw(th.this.f13575le, "render_error", (Object) jSONObject, true);
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.yu.yu.ouw
    public final void ra(final String str) {
        com.bytedance.sdk.component.utils.bly.ouw().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.yu.th.24
            @Override // java.lang.Runnable
            public final void run() {
                long jCurrentTimeMillis = System.currentTimeMillis();
                JSONObject jSONObject = new JSONObject();
                th.ouw(jSONObject, "ts", (Object) Long.valueOf(jCurrentTimeMillis), true);
                th.ouw(th.this.f13575le, str, (Object) jSONObject, true);
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.yu.yu.fkw
    public final void ryl() {
        this.fkw = Boolean.TRUE;
    }

    @Override // com.bytedance.sdk.openadsdk.yu.yu.le
    public final void vt(final String str, final long j10, final long j11, final int i10) {
        com.bytedance.sdk.component.utils.bly.ouw().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.yu.th.6
            @Override // java.lang.Runnable
            public final void run() {
                if (TextUtils.isEmpty(str) || j11 < j10) {
                    return;
                }
                JSONObject jSONObject = new JSONObject();
                th.ouw(jSONObject, "start_ts", (Object) Long.valueOf(j10), true);
                th.ouw(jSONObject, "end_ts", (Object) Long.valueOf(j11), true);
                th.ouw(jSONObject, "intercept_type", (Object) Integer.valueOf(i10), true);
                th.ouw(jSONObject, "type", (Object) "intercept_js", true);
                th.ouw(jSONObject, "url", (Object) str, true);
                th.ouw(jSONObject, "duration", (Object) Long.valueOf(j11 - j10), true);
                th.ouw(th.this.pno, jSONObject);
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.yu.yu.ouw
    public final void yu(final String str) {
        com.bytedance.sdk.component.utils.bly.ouw().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.yu.th.18
            @Override // java.lang.Runnable
            public final void run() {
                long jCurrentTimeMillis = System.currentTimeMillis();
                JSONObject jSONObject = new JSONObject();
                th.ouw(jSONObject, "ts", (Object) Long.valueOf(jCurrentTimeMillis), true);
                th.ouw(th.this.f13575le, str, (Object) jSONObject, true);
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.yu.yu.lh
    public final void bly() {
        com.bytedance.sdk.component.utils.bly.ouw().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.yu.th.3
            @Override // java.lang.Runnable
            public final void run() {
                long jCurrentTimeMillis = System.currentTimeMillis();
                JSONObject jSONObject = new JSONObject();
                th.ouw(jSONObject, "ts", (Object) Long.valueOf(jCurrentTimeMillis), true);
                th.ouw(jSONObject, "type", (Object) "native_enterBackground", true);
                th.ouw(th.this.f13577ra, jSONObject);
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.yu.yu.vt
    public final void jg() {
        com.bytedance.sdk.component.utils.bly.ouw().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.yu.th.14
            @Override // java.lang.Runnable
            public final void run() {
                long jCurrentTimeMillis = System.currentTimeMillis();
                JSONObject jSONObject = new JSONObject();
                th.ouw(jSONObject, "ts", (Object) Long.valueOf(jCurrentTimeMillis), true);
                th.ouw(th.this.f13575le, "native_render_end", (Object) jSONObject, true);
                long jCurrentTimeMillis2 = System.currentTimeMillis();
                JSONObject jSONObject2 = new JSONObject();
                th.ouw(jSONObject2, "ts", (Object) Long.valueOf(jCurrentTimeMillis2), true);
                th.ouw(th.this.f13575le, "render_success", (Object) jSONObject2, true);
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.yu.yu.vt
    public final void ko() {
        com.bytedance.sdk.component.utils.bly.ouw().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.yu.th.15
            @Override // java.lang.Runnable
            public final void run() {
                long jCurrentTimeMillis = System.currentTimeMillis();
                JSONObject jSONObject = new JSONObject();
                th.ouw(jSONObject, "ts", (Object) Long.valueOf(jCurrentTimeMillis), true);
                th.ouw(th.this.f13575le, "no_native_render", (Object) jSONObject, true);
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.yu.yu.ouw
    public final void lh(final int i10, final String str) {
        try {
            com.bytedance.sdk.component.utils.bly.ouw().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.yu.th.22
                @Override // java.lang.Runnable
                public final void run() {
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    JSONObject jSONObject = new JSONObject();
                    th.ouw(jSONObject, "ts", (Object) Long.valueOf(jCurrentTimeMillis), true);
                    th.ouw(jSONObject, "code", (Object) Integer.valueOf(i10), true);
                    th.ouw(th.this.f13575le, str, (Object) jSONObject, true);
                }
            });
        } catch (Throwable th2) {
            com.bytedance.sdk.component.utils.ko.yu("WebviewTimeTrack", th2.getMessage());
        }
    }

    @Override // com.bytedance.sdk.openadsdk.yu.yu.fkw
    public final void mwh() {
        com.bytedance.sdk.component.utils.bly.ouw().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.yu.th.10
            @Override // java.lang.Runnable
            public final void run() {
                JSONObject jSONObject;
                th thVar = th.this;
                if (thVar.fkw.booleanValue() || (thVar.yu.booleanValue() && thVar.f13576lh.booleanValue())) {
                    JSONArray jSONArray = th.this.f13577ra;
                    if (jSONArray != null && jSONArray.length() != 0) {
                        try {
                            th thVar2 = th.this;
                            thVar2.f13575le.put("native_switchBackgroundAndForeground", thVar2.f13577ra);
                        } catch (Exception unused) {
                        }
                    }
                    JSONArray jSONArray2 = th.this.pno;
                    if (jSONArray2 != null && jSONArray2.length() != 0) {
                        try {
                            th thVar3 = th.this;
                            thVar3.f13575le.put("intercept_source", thVar3.pno);
                        } catch (Exception unused2) {
                        }
                    }
                    JSONObject jSONObject2 = new JSONObject();
                    try {
                        jSONObject2.put("webview_time_track", th.this.f13575le);
                    } catch (JSONException e10) {
                        qbp.ouw("WebviewTimeTrack", "trySendTrackInfo json error", e10);
                    }
                    if (com.bytedance.sdk.openadsdk.core.bly.ouw().jg() && (jSONObject = th.this.f13575le) != null) {
                        com.bytedance.sdk.component.utils.ko.vt("WebviewTimeTrack", jSONObject.toString());
                    }
                    th thVar4 = th.this;
                    lh.vt(thVar4.vt, thVar4.ouw, "webview_time_track", jSONObject2);
                }
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.yu.yu.le
    public final void ouw(final JSONObject jSONObject) {
        com.bytedance.sdk.component.utils.bly.ouw().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.yu.th.30
            @Override // java.lang.Runnable
            public final void run() {
                JSONObject jSONObject2 = jSONObject;
                if (jSONObject2 == null) {
                    jSONObject2 = new JSONObject();
                }
                th.ouw(jSONObject2, "ts", (Object) Long.valueOf(System.currentTimeMillis()), true);
                th.ouw(th.this.f13575le, "webview_load_error", (Object) jSONObject2, true);
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.yu.yu.lh
    public final void pno() {
        com.bytedance.sdk.component.utils.bly.ouw().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.yu.th.2
            @Override // java.lang.Runnable
            public final void run() {
                long jCurrentTimeMillis = System.currentTimeMillis();
                JSONObject jSONObject = new JSONObject();
                th.ouw(jSONObject, "ts", (Object) Long.valueOf(jCurrentTimeMillis), true);
                th.ouw(th.this.f13575le, "native_endcard_close", (Object) jSONObject, true);
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.yu.yu.yu
    public final void rn() {
        com.bytedance.sdk.component.utils.bly.ouw().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.yu.th.16
            @Override // java.lang.Runnable
            public final void run() {
                long jCurrentTimeMillis = System.currentTimeMillis();
                JSONObject jSONObject = new JSONObject();
                th.ouw(jSONObject, "ts", (Object) Long.valueOf(jCurrentTimeMillis), true);
                th.ouw(th.this.f13575le, "render_failed", (Object) jSONObject, true);
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.yu.yu.lh
    public final void tlj() {
        com.bytedance.sdk.component.utils.bly.ouw().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.yu.th.4
            @Override // java.lang.Runnable
            public final void run() {
                long jCurrentTimeMillis = System.currentTimeMillis();
                JSONObject jSONObject = new JSONObject();
                th.ouw(jSONObject, "ts", (Object) Long.valueOf(jCurrentTimeMillis), true);
                th.ouw(jSONObject, "type", (Object) "native_enterForeground", true);
                th.ouw(th.this.f13577ra, jSONObject);
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.yu.yu.le
    public final void vt(final String str) {
        com.bytedance.sdk.component.utils.bly.ouw().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.yu.th.8
            @Override // java.lang.Runnable
            public final void run() {
                if (TextUtils.isEmpty(str)) {
                    return;
                }
                long jCurrentTimeMillis = System.currentTimeMillis();
                JSONObject jSONObject = new JSONObject();
                th.ouw(jSONObject, "ts", (Object) Long.valueOf(jCurrentTimeMillis), true);
                th.ouw(jSONObject, "jsb", (Object) str, true);
                th.ouw(th.this.f13575le, "webview_jsb_end", (Object) jSONObject, true);
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.yu.yu.yu
    public final void zih() {
        try {
            com.bytedance.sdk.component.utils.bly.ouw().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.yu.th.17
                @Override // java.lang.Runnable
                public final void run() {
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    JSONObject jSONObject = new JSONObject();
                    th.ouw(jSONObject, "ts", (Object) Long.valueOf(jCurrentTimeMillis), true);
                    th.ouw(th.this.f13575le, "render_did_finish", (Object) jSONObject, true);
                }
            });
        } catch (Throwable th2) {
            com.bytedance.sdk.component.utils.ko.yu("WebviewTimeTrack", th2.getMessage());
        }
    }

    @Override // com.bytedance.sdk.openadsdk.yu.yu.le
    public final void ouw(final String str, final long j10, final long j11, final int i10) {
        com.bytedance.sdk.component.utils.bly.ouw().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.yu.th.5
            @Override // java.lang.Runnable
            public final void run() {
                if (TextUtils.isEmpty(str) || j11 < j10) {
                    return;
                }
                JSONObject jSONObject = new JSONObject();
                th.ouw(jSONObject, "start_ts", (Object) Long.valueOf(j10), true);
                th.ouw(jSONObject, "end_ts", (Object) Long.valueOf(j11), true);
                th.ouw(jSONObject, "intercept_type", (Object) Integer.valueOf(i10), true);
                th.ouw(jSONObject, "type", (Object) "intercept_html", true);
                th.ouw(jSONObject, "url", (Object) str, true);
                th.ouw(jSONObject, "duration", (Object) Long.valueOf(j11 - j10), true);
                th.ouw(th.this.pno, jSONObject);
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.yu.yu.le
    public final void vt(final JSONObject jSONObject) {
        com.bytedance.sdk.component.utils.bly.ouw().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.yu.th.9
            @Override // java.lang.Runnable
            public final void run() {
                JSONObject jSONObject2;
                if (th.this.f13575le == null || (jSONObject2 = jSONObject) == null) {
                    return;
                }
                Iterator<String> itKeys = jSONObject2.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    th.ouw(th.this.f13575le, next, jSONObject.opt(next), true);
                }
                th thVar = th.this;
                thVar.yu = Boolean.TRUE;
                thVar.mwh();
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.yu.yu.le
    public final void ouw(final String str) {
        com.bytedance.sdk.component.utils.bly.ouw().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.yu.th.7
            @Override // java.lang.Runnable
            public final void run() {
                if (TextUtils.isEmpty(str)) {
                    return;
                }
                long jCurrentTimeMillis = System.currentTimeMillis();
                JSONObject jSONObject = new JSONObject();
                th.ouw(jSONObject, "ts", (Object) Long.valueOf(jCurrentTimeMillis), true);
                th.ouw(jSONObject, "jsb", (Object) str, true);
                th.ouw(th.this.f13575le, "webview_jsb_start", (Object) jSONObject, true);
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.yu.yu.ouw
    public final void vt(final int i10, final String str) {
        com.bytedance.sdk.component.utils.bly.ouw().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.yu.th.13
            @Override // java.lang.Runnable
            public final void run() {
                long jCurrentTimeMillis = System.currentTimeMillis();
                JSONObject jSONObject = new JSONObject();
                th.ouw(jSONObject, "ts", (Object) Long.valueOf(jCurrentTimeMillis), true);
                th.ouw(jSONObject, "code", (Object) Integer.valueOf(i10), true);
                th.ouw(th.this.f13575le, str, (Object) jSONObject, true);
            }
        });
    }

    public static void ouw(JSONObject jSONObject, String str, Object obj, boolean z10) {
        if (jSONObject == null || TextUtils.isEmpty(str)) {
            return;
        }
        if (!z10) {
            try {
                if (jSONObject.has(str)) {
                    return;
                }
            } catch (Exception unused) {
                return;
            }
        }
        jSONObject.put(str, obj);
    }

    @Override // com.bytedance.sdk.openadsdk.yu.yu.ouw
    public final void ouw(final String str, final boolean z10) {
        try {
            com.bytedance.sdk.component.utils.bly.ouw().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.yu.th.19
                @Override // java.lang.Runnable
                public final void run() {
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    JSONObject jSONObject = new JSONObject();
                    th.ouw(jSONObject, "ts", (Object) Long.valueOf(jCurrentTimeMillis), true);
                    th.ouw(jSONObject, "isReuse", (Object) Integer.valueOf(z10 ? 1 : 0), true);
                    th.ouw(th.this.f13575le, str, (Object) jSONObject, true);
                }
            });
        } catch (Throwable th2) {
            com.bytedance.sdk.component.utils.ko.yu("WebviewTimeTrack", th2.getMessage());
        }
    }

    @Override // com.bytedance.sdk.openadsdk.yu.yu.le
    public final void ouw(final int i10) {
        com.bytedance.sdk.component.utils.bly.ouw().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.yu.th.25
            @Override // java.lang.Runnable
            public final void run() {
                long jCurrentTimeMillis = System.currentTimeMillis();
                JSONObject jSONObject = new JSONObject();
                th.ouw(jSONObject, "ts", (Object) Long.valueOf(jCurrentTimeMillis), true);
                th.ouw(jSONObject, "isWebViewCache", (Object) Integer.valueOf(i10), true);
                vpp vppVar = th.this.vt;
                if (vppVar != null) {
                    if (vppVar.th()) {
                        th.ouw(jSONObject, "engine_version", (Object) "v3", true);
                    } else {
                        th.ouw(jSONObject, "engine_version", (Object) "v1", true);
                    }
                }
                th.ouw(th.this.f13575le, "before_webview_request", (Object) jSONObject, true);
            }
        });
    }

    public th() {
        this.ouw = "embeded_ad";
        Boolean bool = Boolean.FALSE;
        this.f13576lh = bool;
        this.yu = bool;
        this.fkw = bool;
    }

    public static /* synthetic */ void ouw(JSONArray jSONArray, Object obj) {
        if (jSONArray == null || jSONArray.length() >= 10) {
            return;
        }
        try {
            jSONArray.put(obj);
        } catch (Exception unused) {
        }
    }
}
