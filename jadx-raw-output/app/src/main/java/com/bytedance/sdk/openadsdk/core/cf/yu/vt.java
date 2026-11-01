package com.bytedance.sdk.openadsdk.core.cf.yu;

import android.R;
import android.app.Activity;
import android.content.ComponentCallbacks2;
import android.os.Looper;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import com.bytedance.adsdk.ugeno.core.mwh;
import com.bytedance.adsdk.ugeno.core.rn;
import com.bytedance.adsdk.ugeno.vt.lh;
import com.bytedance.sdk.openadsdk.activity.TTWebsiteActivity;
import com.bytedance.sdk.openadsdk.core.model.vpp;
import com.bytedance.sdk.openadsdk.core.zih;
import com.bytedance.sdk.openadsdk.qbp.ouw.ouw.yu;
import com.bytedance.sdk.openadsdk.utils.bs;
import com.bytedance.sdk.openadsdk.utils.uoy;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class vt implements rn, ouw.InterfaceC0122ouw {

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    public static int f12674lh = 8;
    private String bly;

    /* JADX INFO: renamed from: cf, reason: collision with root package name */
    private JSONObject f12675cf;
    private final Activity fkw;

    /* JADX INFO: renamed from: jg, reason: collision with root package name */
    private float f12676jg;

    /* JADX INFO: renamed from: ko, reason: collision with root package name */
    private float f12677ko;

    /* JADX INFO: renamed from: le, reason: collision with root package name */
    private final vpp f12678le;
    private String mwh;
    public com.bytedance.sdk.openadsdk.core.cf.ra.ouw ouw;
    private String pno;
    private boolean qbp = true;

    /* JADX INFO: renamed from: ra, reason: collision with root package name */
    private final com.bytedance.sdk.openadsdk.core.cf.pno.ouw f12679ra;

    /* JADX INFO: renamed from: rn, reason: collision with root package name */
    private float f12680rn;
    private final com.bytedance.sdk.openadsdk.core.cf.ra.vt ryl;

    /* JADX INFO: renamed from: th, reason: collision with root package name */
    private long f12681th;
    private String tlj;

    /* JADX INFO: renamed from: vm, reason: collision with root package name */
    private long f12682vm;
    public View vt;
    private ouw yu;
    private float zih;

    public final void ouw() {
        if (this.f12678le == null) {
            this.ryl.ouw(1, "material is null", "net");
            return;
        }
        if (this.f12679ra == null) {
            this.ryl.ouw(1, "material ugen template is null", "net");
            return;
        }
        this.yu = new ouw(this.fkw);
        com.bytedance.sdk.openadsdk.core.cf.pno.ouw ouwVar = this.f12679ra;
        this.tlj = ouwVar.f12650lh;
        this.pno = ouwVar.ouw;
        this.bly = ouwVar.vt;
        this.f12675cf = this.f12678le.ouw(true);
        this.ryl.ouw(CampaignEx.JSON_NATIVE_VIDEO_ENDCARD);
        com.bytedance.sdk.openadsdk.core.cf.ouw.vt.ouw().ouw(CampaignEx.JSON_NATIVE_VIDEO_ENDCARD, this.tlj, this.pno, this.bly, "", new com.bytedance.sdk.openadsdk.core.cf.ouw.vt.ouw() { // from class: com.bytedance.sdk.openadsdk.core.cf.yu.vt.1
            @Override // com.bytedance.sdk.openadsdk.core.cf.ouw.vt.ouw
            public final void ouw(JSONObject jSONObject, String str) {
                vt vtVar = vt.this;
                vt.ouw(vtVar, jSONObject, vtVar.f12675cf);
                vt.this.ryl.vt(str);
            }

            @Override // com.bytedance.sdk.openadsdk.core.cf.ouw.vt.ouw
            public final void ouw(int i10, String str, String str2) {
                vt.this.ryl.ouw(i10, str, str2);
            }
        });
    }

    public vt(Activity activity, vpp vppVar, com.bytedance.sdk.openadsdk.core.cf.pno.ouw ouwVar, String str, com.bytedance.sdk.openadsdk.core.cf.ra.vt vtVar) {
        this.fkw = activity;
        this.mwh = str;
        this.f12678le = vppVar;
        this.ryl = vtVar;
        this.f12679ra = ouwVar;
    }

    @Override // com.bytedance.adsdk.ugeno.core.rn
    public final void ouw(lh lhVar, MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f12682vm = System.currentTimeMillis();
            this.f12676jg = motionEvent.getRawX();
            this.f12677ko = motionEvent.getRawY();
            this.qbp = true;
            return;
        }
        if (action != 1) {
            if (action != 2) {
                return;
            }
            if (Math.abs(motionEvent.getRawX() - this.f12676jg) >= f12674lh || Math.abs(motionEvent.getRawY() - this.f12677ko) >= f12674lh) {
                this.qbp = false;
                return;
            }
            return;
        }
        this.f12680rn = motionEvent.getRawX();
        this.zih = motionEvent.getRawY();
        if (Math.abs(this.f12680rn - this.f12676jg) >= f12674lh || Math.abs(this.zih - this.f12677ko) >= f12674lh) {
            this.qbp = false;
        }
        this.f12681th = System.currentTimeMillis();
    }

    /* JADX WARN: Code duplicated, block: B:40:0x008f  */
    @Override // com.bytedance.sdk.openadsdk.core.cf.yu.ouw.InterfaceC0122ouw
    public final void ouw(mwh mwhVar) {
        vpp vppVar;
        String strOptString = mwhVar.f10810lh.optString("type");
        strOptString.hashCode();
        int i10 = 1;
        switch (strOptString) {
            case "privacy":
                if (this.fkw != null && !TextUtils.isEmpty(zih.yu().th())) {
                    TTWebsiteActivity.ouw(this.fkw, this.f12678le, this.mwh);
                    break;
                }
                break;
            case "close":
                com.bytedance.sdk.openadsdk.core.cf.ra.ouw ouwVar = this.ouw;
                if (ouwVar != null) {
                    ouwVar.vt();
                    break;
                }
                break;
            case "creative":
                Activity activity = this.fkw;
                if (activity != null && (vppVar = this.f12678le) != null) {
                    int i11 = vppVar.f12868pd;
                    if (i11 == 2 || i11 == 3) {
                        if (i11 == 3) {
                            String str = vppVar.osn;
                            if (!TextUtils.isEmpty(str) && str.contains("play.google.com/store")) {
                                if (!com.bytedance.sdk.openadsdk.qbp.ouw.ouw.vt.ouw(this.fkw, str, str.substring(str.indexOf("?id=") + 4), this.mwh, this.f12678le)) {
                                    Activity activity2 = this.fkw;
                                    vpp vppVar2 = this.f12678le;
                                    int iOuw = uoy.ouw(this.mwh);
                                    String str2 = this.mwh;
                                    com.bytedance.sdk.openadsdk.core.uoy.ouw(activity2, vppVar2, iOuw, null, null, str2, yu.ouw(this.fkw, str2), true, 0);
                                }
                            } else {
                                Activity activity3 = this.fkw;
                                vpp vppVar3 = this.f12678le;
                                int iOuw2 = uoy.ouw(this.mwh);
                                String str3 = this.mwh;
                                com.bytedance.sdk.openadsdk.core.uoy.ouw(activity3, vppVar3, iOuw2, null, null, str3, yu.ouw(this.fkw, str3), true, 0);
                            }
                        } else {
                            Activity activity4 = this.fkw;
                            vpp vppVar4 = this.f12678le;
                            int iOuw3 = uoy.ouw(this.mwh);
                            String str4 = this.mwh;
                            com.bytedance.sdk.openadsdk.core.uoy.ouw(activity4, vppVar4, iOuw3, null, null, str4, yu.ouw(this.fkw, str4), true, 0);
                        }
                    } else if (i11 == 4) {
                        yu.ouw(activity, this.mwh).ouw(this.f12678le);
                    } else if (i11 == 5) {
                        uoy.vt(activity, vppVar.ey);
                    }
                    ComponentCallbacks2 componentCallbacks2 = this.fkw;
                    if (componentCallbacks2 instanceof com.bytedance.sdk.openadsdk.core.mwh.yu.vt) {
                        ((com.bytedance.sdk.openadsdk.core.mwh.yu.vt) componentCallbacks2).kn();
                    }
                    vpp vppVar5 = this.f12678le;
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put("down_x", this.f12676jg);
                        jSONObject.put("down_y", this.f12677ko);
                        jSONObject.put("down_time", this.f12682vm);
                        jSONObject.put("up_x", this.f12680rn);
                        jSONObject.put("up_y", this.zih);
                        jSONObject.put("up_time", this.f12681th);
                        T t10 = mwhVar.ouw.fkw;
                        if (t10 != 0) {
                            JSONObject jSONObject2 = new JSONObject();
                            int[] iArr = new int[2];
                            float width = t10.getWidth();
                            float height = t10.getHeight();
                            t10.getLocationOnScreen(iArr);
                            float f10 = iArr[0];
                            float f11 = iArr[1];
                            jSONObject2.put("width", width);
                            jSONObject2.put("height", height);
                            jSONObject2.put("left", f10);
                            jSONObject2.put("top", f11);
                            jSONObject.put("rectInfo", jSONObject2);
                        }
                        View view = this.vt;
                        if (view != null) {
                            int[] iArr2 = new int[2];
                            view.getLocationOnScreen(iArr2);
                            jSONObject.put("button_x", iArr2[0]);
                            jSONObject.put("button_y", iArr2[1]);
                            jSONObject.put("button_width", this.vt.getWidth());
                            jSONObject.put("button_height", this.vt.getHeight());
                        }
                        View viewFindViewById = this.fkw.findViewById(R.id.content);
                        if (viewFindViewById != null) {
                            int[] iArr3 = new int[2];
                            viewFindViewById.getLocationOnScreen(iArr3);
                            jSONObject.put("ad_x", iArr3[0]);
                            jSONObject.put("ad_y", iArr3[1]);
                            jSONObject.put("width", viewFindViewById.getWidth());
                            jSONObject.put("height", viewFindViewById.getHeight());
                        }
                        jSONObject.put("click_area_type", mwhVar.ouw.jae());
                        jSONObject.put("brick_id", mwhVar.ouw.ksc());
                        jSONObject.put("endcard_id", this.pno);
                        jSONObject.put("click_scence", 2);
                        if (!this.qbp) {
                            i10 = 2;
                        }
                        jSONObject.put("user_behavior_type", i10);
                        com.bytedance.sdk.openadsdk.core.cf.ra.ouw ouwVar2 = this.ouw;
                        if (ouwVar2 != null) {
                            jSONObject.put("endcard_type", ouwVar2.ouw());
                        }
                        com.bytedance.sdk.openadsdk.yu.lh.ouw(vppVar5, this.mwh, "click", jSONObject);
                    } catch (JSONException unused) {
                        return;
                    }
                    break;
                }
                break;
        }
    }

    public static /* synthetic */ void ouw(vt vtVar, JSONObject jSONObject, JSONObject jSONObject2) {
        ouw ouwVar = vtVar.yu;
        ouwVar.ouw = vtVar;
        ouwVar.vt = vtVar;
        vtVar.ryl.ouw();
        ouw ouwVar2 = vtVar.yu;
        com.bytedance.sdk.openadsdk.core.cf.ra.yu yuVar = new com.bytedance.sdk.openadsdk.core.cf.ra.yu() { // from class: com.bytedance.sdk.openadsdk.core.cf.yu.vt.2
            @Override // com.bytedance.sdk.openadsdk.core.cf.ra.yu
            public final void ouw(int i10, String str) {
                if (vt.this.ryl != null) {
                    vt.this.ryl.ouw(i10, str);
                }
            }

            @Override // com.bytedance.sdk.openadsdk.core.cf.ra.yu
            public final void ouw(lh<View> lhVar) {
                if (vt.this.ryl != null) {
                    vt.this.ryl.ouw(lhVar);
                }
            }
        };
        if (Looper.myLooper() == Looper.getMainLooper()) {
            ouwVar2.ouw(jSONObject, jSONObject2, yuVar);
        } else {
            bs.ouw(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.cf.yu.ouw.1

                /* JADX INFO: renamed from: lh */
                public final /* synthetic */ com.bytedance.sdk.openadsdk.core.cf.ra.yu f12673lh;
                public final /* synthetic */ JSONObject ouw;
                public final /* synthetic */ JSONObject vt;

                public AnonymousClass1() {
                    jSONObject = jSONObject;
                    jSONObject = jSONObject2;
                    yuVar = yuVar;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    ouw.this.ouw(jSONObject, jSONObject, yuVar);
                }
            });
        }
    }
}
