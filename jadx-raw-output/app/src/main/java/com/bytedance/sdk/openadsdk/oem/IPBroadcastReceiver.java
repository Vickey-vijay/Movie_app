package com.bytedance.sdk.openadsdk.oem;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.text.TextUtils;
import android.util.LruCache;
import com.bytedance.sdk.component.pno.pno;
import com.bytedance.sdk.component.utils.ko;
import com.bytedance.sdk.component.utils.qbp;
import com.bytedance.sdk.openadsdk.core.jg;
import com.bytedance.sdk.openadsdk.core.model.jae;
import com.bytedance.sdk.openadsdk.core.model.vpp;
import com.bytedance.sdk.openadsdk.core.zih;
import com.bytedance.sdk.openadsdk.utils.bs;
import com.bytedance.sdk.openadsdk.utils.uoy;
import com.bytedance.sdk.openadsdk.yu.lh;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.safedk.android.analytics.events.BrandSafetyEvent;
import com.safedk.android.analytics.events.base.StatsEvent;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public class IPBroadcastReceiver extends BroadcastReceiver {

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    private static volatile IPBroadcastReceiver f13269lh;
    public final LruCache<String, vpp> ouw;
    public ouw vt;
    private int yu = 0;

    public static void vt(final Context context, final vpp vppVar) {
        jae jaeVar;
        ko.vt("IPMiBroadcastReceiver", "registerBroadcastReceiverAsy");
        if (f13269lh != null || vppVar == null || (jaeVar = vppVar.oiz) == null) {
            return;
        }
        if (jaeVar.ouw() || jaeVar.vt()) {
            jg.vt().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.oem.IPBroadcastReceiver.3
                @Override // java.lang.Runnable
                public final void run() {
                    try {
                        IPBroadcastReceiver.ouw(zih.ouw(context), vppVar);
                    } catch (Throwable th2) {
                        qbp.ouw("IPMiBroadcastReceiver", "registerBroadcastReceiverAsy error ", th2);
                    }
                }
            });
        }
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, final Intent intent) {
        ko.vt("IPMiBroadcastReceiver", "onReceive action = " + intent.getAction());
        if ("com.xiaomi.market.DOWNLOAD_INSTALL_RESULT".equals(intent.getAction())) {
            ko.vt("IPMiBroadcastReceiver", "handleXiaomiInstallResult start");
            bs.lh(new pno("ip-mi") { // from class: com.bytedance.sdk.openadsdk.oem.IPBroadcastReceiver.1
                @Override // java.lang.Runnable
                public final void run() {
                    final int i10;
                    final int i11;
                    final int i12;
                    int intExtra;
                    try {
                        final int intExtra2 = intent.getIntExtra(IronSourceConstants.EVENTS_ERROR_CODE, 0);
                        if (intExtra2 < 0) {
                            int intExtra3 = intent.getIntExtra("reason", 0);
                            if (intExtra2 == -4 && intExtra3 == -1) {
                                return;
                            } else {
                                i10 = intExtra3;
                            }
                        } else {
                            i10 = 0;
                        }
                        if (intExtra2 == 5) {
                            int intExtra4 = intent.getIntExtra("status", 0);
                            if (intExtra4 == -2) {
                                try {
                                    intExtra = intent.getIntExtra("progress", 0);
                                } catch (Throwable unused) {
                                    IPBroadcastReceiver.this.yu = 1;
                                    intExtra = 0;
                                }
                                if (intExtra < 100) {
                                    return;
                                } else {
                                    i12 = intExtra;
                                }
                            } else {
                                i12 = 0;
                            }
                            i11 = intExtra4;
                        } else {
                            i11 = 0;
                            i12 = 0;
                        }
                        String stringExtra = intent.getStringExtra(HandleInvocationsFromAdViewer.KEY_PACKAGE_NAME);
                        ouw ouwVar = IPBroadcastReceiver.this.vt;
                        if (intExtra2 > 0 && ouwVar != null) {
                            ouwVar.ouw(stringExtra, intExtra2);
                        }
                        final vpp vppVarOuw = IPBroadcastReceiver.this.ouw(stringExtra);
                        ko.ouw("IPMiBroadcastReceiver", "err_code=", Integer.valueOf(intExtra2), " reason=", Integer.valueOf(i10), " status=", Integer.valueOf(i11), " progress=", Integer.valueOf(i12));
                        if (vppVarOuw != null) {
                            lh.ouw(System.currentTimeMillis(), vppVarOuw, uoy.ouw(vppVarOuw), "ip_listener_log", new com.bytedance.sdk.openadsdk.rn.lh.ouw() { // from class: com.bytedance.sdk.openadsdk.oem.IPBroadcastReceiver.1.1
                                @Override // com.bytedance.sdk.openadsdk.rn.lh.ouw, com.bytedance.sdk.openadsdk.rn.lh.vt
                                public final JSONObject ouw() {
                                    JSONObject jSONObject = new JSONObject();
                                    try {
                                        jSONObject.put("ip_error_code", intExtra2);
                                        vpp vppVar = vppVarOuw;
                                        if (vppVar != null) {
                                            jSONObject.put("ip_is_w2a", vppVar.fkw());
                                        }
                                        int i13 = intExtra2;
                                        if (i13 > 0) {
                                            if (i13 == 5) {
                                                jSONObject.put("ip_status", i11);
                                                jSONObject.put("ip_exec_type", IPBroadcastReceiver.this.yu);
                                            }
                                            if (i11 == -2) {
                                                jSONObject.put("ip_progress", i12);
                                            }
                                        }
                                        if (intExtra2 < 0) {
                                            jSONObject.put("ip_reason", i10);
                                        }
                                        return jSONObject;
                                    } catch (Throwable th2) {
                                        qbp.ouw("IPMiBroadcastReceiver", "handleXiaomiInstallResult error ", th2);
                                        return null;
                                    }
                                }
                            });
                        }
                    } catch (Throwable th2) {
                        qbp.ouw("IPMiBroadcastReceiver", "handleXiaomiInstallResult error ", th2);
                    }
                }
            });
        } else if ("com.oplus.market.intent.action.ADD_APP_STATUS_CHANGED".equals(intent.getAction())) {
            ko.vt("IPMiBroadcastReceiver", "handleOppoInstallResult start");
            bs.lh(new pno("ip-oppo") { // from class: com.bytedance.sdk.openadsdk.oem.IPBroadcastReceiver.2
                @Override // java.lang.Runnable
                public final void run() {
                    int i10;
                    final int i11;
                    try {
                        int intExtra = intent.getIntExtra(StatsEvent.f44666z, 0);
                        final String stringExtra = intent.getStringExtra("event_track");
                        if (intExtra != 7 && intExtra != 9 && stringExtra != null) {
                            final String stringExtra2 = intent.getStringExtra("event_id");
                            final String stringExtra3 = intent.getStringExtra(BrandSafetyEvent.f44588g);
                            final String stringExtra4 = intent.getStringExtra("market_version");
                            final String stringExtra5 = intent.getStringExtra("caller");
                            if (intExtra == 2) {
                                i10 = 7;
                            } else if (intExtra == 3) {
                                i10 = 1;
                            } else if (intExtra == 4) {
                                i10 = 2;
                            } else if (intExtra != 5) {
                                i10 = intExtra != 6 ? 0 : 4;
                            } else {
                                i10 = 3;
                            }
                            if (intExtra == 8) {
                                i11 = -3;
                            } else if (intExtra != 10) {
                                i11 = intExtra != 11 ? 0 : -101;
                            } else {
                                i11 = -100;
                            }
                            ko.vt("IPMiBroadcastReceiver", String.format("eventId: %s, eventType: %s, eventTrack: %s, appPackage: %s, marketVersion: %s, caller: %s, errorCode: %s, status: %s", stringExtra2, Integer.valueOf(intExtra), stringExtra, stringExtra3, stringExtra4, stringExtra5, Integer.valueOf(i10), Integer.valueOf(i11)));
                            ouw ouwVar = IPBroadcastReceiver.this.vt;
                            final int i12 = i10;
                            if (i12 > 0 && ouwVar != null) {
                                ouwVar.ouw(stringExtra3, i12);
                            }
                            final vpp vppVarOuw = IPBroadcastReceiver.this.ouw(stringExtra3);
                            if (vppVarOuw != null) {
                                lh.ouw(System.currentTimeMillis(), vppVarOuw, uoy.ouw(vppVarOuw), "ip_listener_log", new com.bytedance.sdk.openadsdk.rn.lh.ouw() { // from class: com.bytedance.sdk.openadsdk.oem.IPBroadcastReceiver.2.1
                                    @Override // com.bytedance.sdk.openadsdk.rn.lh.ouw, com.bytedance.sdk.openadsdk.rn.lh.vt
                                    public final JSONObject ouw() {
                                        JSONObject jSONObject = new JSONObject();
                                        try {
                                            jSONObject.put("ip_error_code", i12);
                                            jSONObject.put("ip_market_version", stringExtra4);
                                            jSONObject.put("ip_app_pkg", stringExtra3);
                                            jSONObject.put("ip_caller_pkg", stringExtra5);
                                            jSONObject.put("ip_event_id", stringExtra2);
                                            jSONObject.put("ip_event_track", stringExtra);
                                            jSONObject.put("ip_status", i11);
                                            jSONObject.put("ip_exec_type", IPBroadcastReceiver.this.yu);
                                            vpp vppVar = vppVarOuw;
                                            if (vppVar != null) {
                                                jSONObject.put("ip_is_w2a", vppVar.fkw());
                                                jae jaeVar = vppVarOuw.oiz;
                                                if (jaeVar != null) {
                                                    jSONObject.put("ip_oem_type", jaeVar.ouw);
                                                }
                                            }
                                            return jSONObject;
                                        } catch (Throwable th2) {
                                            qbp.ouw("IPMiBroadcastReceiver", "handleOppoInstallResult error = ", th2);
                                            return null;
                                        }
                                    }
                                });
                                return;
                            }
                            return;
                        }
                        ko.vt("IPMiBroadcastReceiver", "handleOppoInstallResult eventType= " + intExtra + ", eventTrack = " + stringExtra);
                    } catch (Throwable th2) {
                        qbp.ouw("IPMiBroadcastReceiver", "handleOppoInstallResult error = ", th2);
                        IPBroadcastReceiver.this.yu = 2;
                    }
                }
            });
        }
    }

    private IPBroadcastReceiver() {
        int i10 = 10;
        int iOuw = com.bytedance.sdk.openadsdk.vpp.ouw.ouw("ip_data_config", "ip_ad_cache_count", 10);
        if (iOuw > 0 && iOuw <= 200) {
            i10 = iOuw;
        }
        ko.vt("IPMiBroadcastReceiver", "cacheSize=", Integer.valueOf(i10));
        this.ouw = new LruCache<>(i10);
    }

    public final vpp ouw(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return this.ouw.get(str);
    }

    public static IPBroadcastReceiver ouw(Context context, vpp vppVar) {
        jae jaeVar;
        int iOuw = com.bytedance.sdk.openadsdk.vpp.ouw.ouw("ip_data_config", "ip_link_listener", 0);
        ko.ouw("IPMiBroadcastReceiver", "open =", Integer.valueOf(iOuw));
        if (iOuw == 0 || vppVar == null || (jaeVar = vppVar.oiz) == null) {
            return null;
        }
        if (f13269lh == null) {
            synchronized (IPBroadcastReceiver.class) {
                if (f13269lh == null) {
                    f13269lh = new IPBroadcastReceiver();
                    IntentFilter intentFilter = new IntentFilter();
                    if (jaeVar.ouw()) {
                        intentFilter.addAction("com.xiaomi.market.DOWNLOAD_INSTALL_RESULT");
                    } else if (jaeVar.vt()) {
                        intentFilter.addAction("com.oplus.market.intent.action.ADD_APP_STATUS_CHANGED");
                    }
                    if (Build.VERSION.SDK_INT >= 34 && uoy.vt(context) >= 34) {
                        ko.vt("IPMiBroadcastReceiver", "registerBroadcastReceiverAsy sdk 34+ ");
                        context.registerReceiver(f13269lh, intentFilter, 2);
                    } else {
                        ko.vt("IPMiBroadcastReceiver", "registerBroadcastReceiverAsy sdk < 34");
                        context.registerReceiver(f13269lh, intentFilter);
                    }
                }
            }
        }
        return f13269lh;
    }
}
