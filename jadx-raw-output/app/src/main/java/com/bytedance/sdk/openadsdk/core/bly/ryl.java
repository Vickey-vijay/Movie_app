package com.bytedance.sdk.openadsdk.core.bly;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.os.Handler;
import android.os.Looper;
import android.os.MessageQueue;
import androidx.annotation.NonNull;
import com.bytedance.sdk.openadsdk.utils.bs;
import com.bytedance.sdk.openadsdk.utils.osn;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public final class ryl {
    private static String ouw;
    private static String vt;

    /* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.core.bly.ryl$2, reason: invalid class name */
    public static class AnonymousClass2 implements com.bytedance.sdk.component.adexpress.ouw.ouw.lh {

        /* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.core.bly.ryl$2$1, reason: invalid class name */
        public class AnonymousClass1 implements Runnable {

            /* JADX INFO: renamed from: lh, reason: collision with root package name */
            public final /* synthetic */ int f12559lh;
            public final /* synthetic */ MessageQueue[] ouw;
            public final /* synthetic */ int vt;

            public AnonymousClass1(MessageQueue[] messageQueueArr, int i10, int i11) {
                this.ouw = messageQueueArr;
                this.vt = i10;
                this.f12559lh = i11;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.ouw[0] = Looper.myQueue();
                AnonymousClass2.this.ouw(this.ouw[0], this.vt, this.f12559lh);
            }
        }

        @Override // com.bytedance.sdk.component.adexpress.ouw.ouw.lh
        public final int ouw() {
            if (com.bytedance.sdk.openadsdk.core.zih.yu() == null) {
                return 0;
            }
            return com.bytedance.sdk.openadsdk.core.zih.yu().yu();
        }

        @Override // com.bytedance.sdk.component.adexpress.ouw.ouw.lh
        public final int ko() {
            return com.bytedance.sdk.openadsdk.vpp.ouw.ouw("gaussian_blur_type", 0);
        }

        @Override // com.bytedance.sdk.component.adexpress.ouw.ouw.lh
        public final int bly() {
            return com.bytedance.sdk.openadsdk.core.zih.yu().cd();
        }

        @Override // com.bytedance.sdk.component.adexpress.ouw.ouw.lh
        public final ExecutorService cf() {
            return bs.fkw();
        }

        @Override // com.bytedance.sdk.component.adexpress.ouw.ouw.lh
        public final com.bytedance.sdk.component.adexpress.ouw.lh.ouw fkw() {
            return com.bytedance.sdk.openadsdk.core.zih.lh().ouw();
        }

        @Override // com.bytedance.sdk.component.adexpress.ouw.ouw.lh
        public final int jg() {
            return osn.le(com.bytedance.sdk.openadsdk.core.zih.ouw());
        }

        @Override // com.bytedance.sdk.component.adexpress.ouw.ouw.lh
        public final com.bytedance.sdk.component.ra.vt.ouw le() {
            com.bytedance.sdk.component.ra.vt.ouw ouwVarLh = com.bytedance.sdk.openadsdk.th.vt.ouw().ouw.lh();
            ouwVarLh.f11911ra = 8;
            ouwVarLh.f11910le = "express_down";
            return ouwVarLh;
        }

        @Override // com.bytedance.sdk.component.adexpress.ouw.ouw.lh
        public final Handler lh() {
            return com.bytedance.sdk.openadsdk.core.jg.lh();
        }

        @Override // com.bytedance.sdk.component.adexpress.ouw.ouw.lh
        public final int mwh() {
            return osn.yu(com.bytedance.sdk.openadsdk.core.zih.ouw());
        }

        public final void ouw(final MessageQueue messageQueue, final int i10, final int i11) {
            if (messageQueue != null) {
                final int iOuw = com.bytedance.sdk.openadsdk.vpp.ouw.ouw("ad_load_and_render_opt", "w_p_delay", 500);
                Runnable runnable = new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.bly.ryl.2.2
                    @Override // java.lang.Runnable
                    public final void run() {
                        com.bytedance.sdk.component.utils.ko.lh("WebViewPool", "webview preload delay:" + iOuw);
                        final AnonymousClass2 anonymousClass2 = AnonymousClass2.this;
                        final MessageQueue messageQueue2 = messageQueue;
                        final int i12 = i10;
                        if (messageQueue2 == null || i12 <= 0) {
                            com.bytedance.sdk.component.utils.ko.lh("WebViewPool", "webview can not preload engine v1.");
                        } else {
                            messageQueue2.addIdleHandler(new MessageQueue.IdleHandler() { // from class: com.bytedance.sdk.openadsdk.core.bly.ryl.2.4
                                @Override // android.os.MessageQueue.IdleHandler
                                public final boolean queueIdle() {
                                    new com.bytedance.sdk.openadsdk.core.widget.ouw.vt(i12, false, messageQueue2).vt();
                                    return false;
                                }
                            });
                        }
                        final AnonymousClass2 anonymousClass3 = AnonymousClass2.this;
                        final MessageQueue messageQueue3 = messageQueue;
                        final int i13 = i11;
                        if (messageQueue3 == null || i13 <= 0) {
                            com.bytedance.sdk.component.utils.ko.lh("WebViewPool", "webview can not preload engine v3.");
                        } else {
                            messageQueue3.addIdleHandler(new MessageQueue.IdleHandler() { // from class: com.bytedance.sdk.openadsdk.core.bly.ryl.2.3
                                @Override // android.os.MessageQueue.IdleHandler
                                public final boolean queueIdle() {
                                    new com.bytedance.sdk.openadsdk.core.widget.ouw.vt(i13, true, messageQueue3).vt();
                                    return false;
                                }
                            });
                        }
                    }
                };
                if (iOuw > 0) {
                    com.bytedance.sdk.openadsdk.core.jg.lh().postDelayed(runnable, iOuw);
                } else {
                    runnable.run();
                }
            }
        }

        @Override // com.bytedance.sdk.component.adexpress.ouw.ouw.lh
        public final String pno() {
            return com.bytedance.sdk.openadsdk.core.bly.ouw().yu();
        }

        @Override // com.bytedance.sdk.component.adexpress.ouw.ouw.lh
        public final com.bytedance.sdk.component.ra.vt.vt ra() {
            com.bytedance.sdk.component.ra.vt.vt vtVarVt = com.bytedance.sdk.openadsdk.th.vt.ouw().ouw.vt();
            vtVarVt.f11911ra = 8;
            vtVarVt.f11910le = "express_get";
            return vtVarVt;
        }

        @Override // com.bytedance.sdk.component.adexpress.ouw.ouw.lh
        public final ExecutorService ryl() {
            return bs.tlj();
        }

        @Override // com.bytedance.sdk.component.adexpress.ouw.ouw.lh
        public final int tlj() {
            return com.bytedance.sdk.openadsdk.core.zih.yu().uq();
        }

        @Override // com.bytedance.sdk.component.adexpress.ouw.ouw.lh
        public final Context vt() {
            return com.bytedance.sdk.openadsdk.core.zih.ouw();
        }

        @Override // com.bytedance.sdk.component.adexpress.ouw.ouw.lh
        public final void yu() {
            int iCd = com.bytedance.sdk.openadsdk.core.zih.yu().cd();
            int iUq = com.bytedance.sdk.openadsdk.core.zih.yu().uq();
            if (iCd == 0 && iUq == 0) {
                com.bytedance.sdk.component.utils.ko.lh("WebViewPool", "webview cache for v1 or v3 is not enable.");
                return;
            }
            com.bytedance.sdk.component.adexpress.fkw.fkw.ouw();
            com.bytedance.sdk.component.adexpress.fkw.fkw.ouw(iCd);
            com.bytedance.sdk.component.adexpress.fkw.fkw.ouw();
            com.bytedance.sdk.component.adexpress.fkw.fkw.vt(iUq);
            int iFkw = com.bytedance.sdk.openadsdk.vpp.ouw.fkw();
            int iYu = com.bytedance.sdk.openadsdk.vpp.ouw.yu();
            if (iFkw == 0 && iYu == 0) {
                com.bytedance.sdk.component.utils.ko.lh("WebViewPool", "webview preload cache size  for v1 or v3 is all 0.");
            } else {
                ouw(com.bytedance.sdk.openadsdk.core.jg.lh().getLooper().getQueue(), iYu, iFkw);
            }
        }
    }

    public static String lh() {
        Map<String, com.bytedance.sdk.component.adexpress.ouw.lh.ouw> map;
        com.bytedance.sdk.component.adexpress.ouw.lh.ouw ouwVar;
        String str;
        if (vt == null) {
            vt = com.bytedance.sdk.openadsdk.multipro.yu.yu.vt("tt_sp", "js_render_v3_ver", "");
        }
        com.bytedance.sdk.component.adexpress.ouw.lh.ouw ouwVarOuw = com.bytedance.sdk.component.adexpress.ouw.vt.ra.ouw();
        if (ouwVarOuw != null && (map = ouwVarOuw.fkw) != null && (ouwVar = map.get("v3")) != null && (str = ouwVar.ouw) != null && !str.equals(vt)) {
            vt = str;
            com.bytedance.sdk.openadsdk.multipro.yu.yu.ouw("tt_sp", "js_render_v3_ver", str);
        }
        return vt;
    }

    @NonNull
    public static String vt() {
        String str;
        if (ouw == null) {
            ouw = com.bytedance.sdk.openadsdk.multipro.yu.yu.vt("tt_sp", "js_render_ver", "");
        }
        com.bytedance.sdk.component.adexpress.ouw.lh.ouw ouwVarOuw = com.bytedance.sdk.component.adexpress.ouw.vt.ra.ouw();
        if (ouwVarOuw != null && (str = ouwVarOuw.ouw) != null && !str.equals(ouw)) {
            ouw = str;
            com.bytedance.sdk.openadsdk.multipro.yu.yu.ouw("tt_sp", "js_render_ver", str);
        }
        return ouw;
    }

    public static void ouw() {
        com.bytedance.sdk.component.adexpress.ouw.ouw.ouw.ouw().ouw = new com.bytedance.sdk.component.adexpress.ouw.ouw.vt() { // from class: com.bytedance.sdk.openadsdk.core.bly.ryl.1
            @Override // com.bytedance.sdk.component.adexpress.ouw.ouw.vt
            public final int ouw(String str, ContentValues contentValues, String str2, String[] strArr) {
                return com.bytedance.sdk.openadsdk.multipro.ouw.ouw.ouw(com.bytedance.sdk.openadsdk.core.zih.ouw(), str, contentValues, str2, strArr);
            }

            @Override // com.bytedance.sdk.component.adexpress.ouw.ouw.vt
            public final Cursor ouw(String str, String[] strArr, String str2, String[] strArr2, String str3, String str4, String str5) {
                return new com.bytedance.sdk.openadsdk.multipro.aidl.lh(com.bytedance.sdk.openadsdk.multipro.ouw.ouw.ouw(com.bytedance.sdk.openadsdk.core.zih.ouw(), str, strArr, str2, strArr2, str3, str4, str5));
            }

            @Override // com.bytedance.sdk.component.adexpress.ouw.ouw.vt
            public final int ouw(String str, String str2, String[] strArr) {
                return com.bytedance.sdk.openadsdk.multipro.ouw.ouw.ouw(com.bytedance.sdk.openadsdk.core.zih.ouw(), str, str2, strArr);
            }

            @Override // com.bytedance.sdk.component.adexpress.ouw.ouw.vt
            public final void ouw(String str, ContentValues contentValues) {
                com.bytedance.sdk.openadsdk.multipro.ouw.ouw.ouw(com.bytedance.sdk.openadsdk.core.zih.ouw(), str, contentValues);
            }
        };
        com.bytedance.sdk.component.adexpress.ouw.ouw.ouw.ouw().f11574lh = new AnonymousClass2();
        com.bytedance.sdk.component.adexpress.ouw.ouw.ouw.ouw().vt = new com.bytedance.sdk.component.adexpress.ouw.ouw.yu() { // from class: com.bytedance.sdk.openadsdk.core.bly.ryl.3
            @Override // com.bytedance.sdk.component.adexpress.ouw.ouw.yu
            public final void ouw() {
                com.bytedance.sdk.openadsdk.rn.ouw.yu yuVar = new com.bytedance.sdk.openadsdk.rn.ouw.yu();
                yuVar.f13321le = 109;
                yuVar.f13323ra = com.bytedance.sdk.openadsdk.core.pno.ouw(109);
                com.bytedance.sdk.openadsdk.rn.lh.ouw().ouw(yuVar);
            }
        };
        com.bytedance.sdk.component.bly.ouw.ouw.ouw().ouw = new com.bytedance.sdk.component.bly.ouw.vt() { // from class: com.bytedance.sdk.openadsdk.core.bly.ryl.4
            @Override // com.bytedance.sdk.component.bly.ouw.vt
            public final void ouw(String str, String str2, JSONObject jSONObject) {
                com.bytedance.sdk.openadsdk.yu.lh.lh(com.bytedance.sdk.openadsdk.utils.vt.vt(), str, str2, jSONObject);
            }

            @Override // com.bytedance.sdk.component.bly.ouw.vt
            public final void ouw(com.bytedance.sdk.component.bly.vt.ouw ouwVar, String str, String str2, JSONObject jSONObject, long j10) {
                com.bytedance.sdk.openadsdk.core.model.vpp vppVar = new com.bytedance.sdk.openadsdk.core.model.vpp();
                vppVar.f12884vi = ouwVar.ouw;
                vppVar.yhj = ouwVar.vt;
                vppVar.pv = ouwVar.f11656lh;
                com.bytedance.sdk.openadsdk.yu.lh.vt(vppVar, str, str2, jSONObject, j10);
            }

            @Override // com.bytedance.sdk.component.bly.ouw.vt
            public final void ouw(com.bytedance.sdk.component.bly.vt.ouw ouwVar, String str, final String str2, final JSONObject jSONObject, final JSONObject jSONObject2) {
                if (ouwVar != null) {
                    com.bytedance.sdk.openadsdk.core.model.vpp vppVar = new com.bytedance.sdk.openadsdk.core.model.vpp();
                    vppVar.f12884vi = ouwVar.ouw;
                    vppVar.yhj = ouwVar.vt;
                    vppVar.pv = ouwVar.f11656lh;
                    com.bytedance.sdk.openadsdk.yu.lh.ouw(System.currentTimeMillis(), vppVar, str, str2, new com.bytedance.sdk.openadsdk.rn.lh.ouw() { // from class: com.bytedance.sdk.openadsdk.core.bly.ryl.4.1
                        @Override // com.bytedance.sdk.openadsdk.rn.lh.ouw, com.bytedance.sdk.openadsdk.rn.lh.vt
                        public final JSONObject lh() {
                            com.bytedance.sdk.component.utils.ko.ouw("LpClickIntervalTouchListenerEvent", "click_interval_intercept", str2, jSONObject2);
                            return jSONObject2;
                        }

                        @Override // com.bytedance.sdk.openadsdk.rn.lh.ouw, com.bytedance.sdk.openadsdk.rn.lh.vt
                        public final JSONObject ouw() {
                            return jSONObject;
                        }
                    });
                }
            }
        };
    }
}
