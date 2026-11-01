package com.bytedance.sdk.openadsdk.activity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.Window;
import android.view.WindowManager;
import androidx.annotation.Nullable;
import com.bytedance.sdk.component.utils.ko;
import com.bytedance.sdk.openadsdk.core.cd;
import com.bytedance.sdk.openadsdk.core.jg;
import com.bytedance.sdk.openadsdk.core.model.vpp;
import com.bytedance.sdk.openadsdk.core.od;
import com.bytedance.sdk.openadsdk.core.zih;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.utils.g;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public class TTDelegateActivity extends TTBaseActivity {
    private static final Map<String, com.bytedance.sdk.openadsdk.core.yu.ra.ouw> yu = Collections.synchronizedMap(new HashMap());

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    private cd f12021lh;
    public vpp ouw = null;
    private Intent vt;

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseActivity, android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent me2) {
        DetectTouchUtils.activityOnTouch(g.f44975u, me2);
        return super.dispatchTouchEvent(me2);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseActivity, android.app.Activity
    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        if (!jg.fkw()) {
            finish();
            return;
        }
        Window window = getWindow();
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.alpha = 0.0f;
        window.setAttributes(attributes);
        this.vt = getIntent();
        if (zih.ouw() == null) {
            zih.vt(this);
        }
    }

    @Override // android.app.Activity
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        if (zih.ouw() == null) {
            zih.vt(this);
        }
        setIntent(intent);
        this.vt = intent;
    }

    public static void ouw(vpp vppVar, String str, com.bytedance.sdk.openadsdk.core.yu.ra.ouw ouwVar) {
        if (vppVar == null) {
            return;
        }
        Intent intent = new Intent(zih.ouw(), (Class<?>) TTDelegateActivity.class);
        intent.addFlags(268435456);
        intent.putExtra("type", 6);
        intent.putExtra("closed_listener_key", str);
        if (com.bytedance.sdk.openadsdk.multipro.vt.lh()) {
            intent.putExtra("ext_info", vppVar.yhj);
            intent.putExtra("filter_words", com.bytedance.sdk.openadsdk.tool.ouw.ouw(vppVar.jae));
            intent.putExtra("creative_info", vppVar.ouw(true).toString());
        } else {
            intent.putExtra("meta_index", od.ouw().ouw(vppVar));
        }
        if (ouwVar != null) {
            if (com.bytedance.sdk.openadsdk.multipro.vt.lh()) {
                com.bytedance.sdk.openadsdk.core.bly.ouw().ouw(str, ouwVar);
            } else {
                yu.put(str, ouwVar);
            }
        }
        com.bytedance.sdk.component.utils.vt.ouw(zih.ouw(), intent, null);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        cd cdVar = this.f12021lh;
        if (cdVar != null) {
            cdVar.vt();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseActivity, android.app.Activity
    public void onResume() {
        Intent intent;
        int intExtra;
        String str;
        String stringExtra;
        String strOuw;
        super.onResume();
        cd cdVar = this.f12021lh;
        if ((cdVar == null || ((com.bytedance.sdk.openadsdk.lh.lh) cdVar).vt == null || !((com.bytedance.sdk.openadsdk.lh.lh) cdVar).vt.isShowing()) && (intent = this.vt) != null && (intExtra = intent.getIntExtra("type", 0)) != 1) {
            if (intExtra == 6) {
                if (com.bytedance.sdk.openadsdk.multipro.vt.lh()) {
                    String stringExtra2 = this.vt.getStringExtra("ext_info");
                    strOuw = this.vt.getStringExtra("filter_words");
                    str = stringExtra2;
                    stringExtra = this.vt.getStringExtra("creative_info");
                } else {
                    if (this.ouw == null) {
                        this.ouw = od.ouw().ouw(od.ouw(this.vt));
                    }
                    vpp vppVar = this.ouw;
                    if (vppVar != null) {
                        str = vppVar.yhj;
                        stringExtra = "";
                        strOuw = com.bytedance.sdk.openadsdk.tool.ouw.ouw(vppVar.jae);
                    }
                }
                final String stringExtra3 = this.vt.getStringExtra("closed_listener_key");
                vpp vppVar2 = this.ouw;
                if (strOuw != null && str != null && this.f12021lh == null) {
                    com.bytedance.sdk.openadsdk.lh.lh lhVar = new com.bytedance.sdk.openadsdk.lh.lh(this, str, com.bytedance.sdk.openadsdk.tool.ouw.ouw(strOuw), stringExtra, vppVar2);
                    this.f12021lh = lhVar;
                    com.bytedance.sdk.openadsdk.lh.yu yuVar = lhVar.ouw;
                    if (yuVar != null) {
                        yuVar.fkw = stringExtra3;
                    }
                    lhVar.ouw(new cd.ouw() { // from class: com.bytedance.sdk.openadsdk.activity.TTDelegateActivity.1
                        @Override // com.bytedance.sdk.openadsdk.core.cd.ouw
                        public final void ouw(String str2) {
                            com.bytedance.sdk.openadsdk.core.yu.ra.ouw ouwVarLh;
                            ko.lh("showDislike", "closedListenerKey=" + stringExtra3 + ",onSelected->position=0,value=" + str2);
                            if (TTDelegateActivity.yu != null && TTDelegateActivity.yu.size() > 0 && !TextUtils.isEmpty(stringExtra3) && !com.bytedance.sdk.openadsdk.multipro.vt.lh()) {
                                com.bytedance.sdk.openadsdk.core.yu.ra.ouw ouwVar = (com.bytedance.sdk.openadsdk.core.yu.ra.ouw) TTDelegateActivity.yu.get(stringExtra3);
                                if (ouwVar != null) {
                                    ouwVar.ouw();
                                }
                            } else if (!TextUtils.isEmpty(stringExtra3) && (ouwVarLh = com.bytedance.sdk.openadsdk.core.bly.ouw().lh(stringExtra3)) != null) {
                                ouwVarLh.ouw();
                                com.bytedance.sdk.openadsdk.core.bly.ouw().yu(stringExtra3);
                            }
                            TTDelegateActivity.ouw(stringExtra3);
                            TTDelegateActivity.this.finish();
                        }

                        @Override // com.bytedance.sdk.openadsdk.core.cd.ouw
                        public final void ouw() {
                            if (!((com.bytedance.sdk.openadsdk.lh.lh) TTDelegateActivity.this.f12021lh).f13242lh) {
                                TTDelegateActivity.ouw(stringExtra3);
                                TTDelegateActivity.this.finish();
                            }
                            ((com.bytedance.sdk.openadsdk.lh.lh) TTDelegateActivity.this.f12021lh).f13242lh = false;
                        }
                    });
                }
                cd cdVar2 = this.f12021lh;
                if (cdVar2 != null) {
                    cdVar2.ouw();
                    return;
                }
                return;
            }
            finish();
        }
    }

    public static void ouw(vpp vppVar, String str) {
        ouw(vppVar, str, null);
    }

    public static /* synthetic */ void ouw(String str) {
        ko.lh("showDislike", "removeDislikeListener....closedListenerKey=".concat(String.valueOf(str)));
        Map<String, com.bytedance.sdk.openadsdk.core.yu.ra.ouw> map = yu;
        if (map == null || TextUtils.isEmpty(str)) {
            return;
        }
        map.remove(str);
        if (ko.yu()) {
            ko.lh("showDislike", "removeDislikeListener....mListenerMap.size:" + map.size());
        }
    }
}
