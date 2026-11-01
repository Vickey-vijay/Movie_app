package com.bytedance.sdk.openadsdk.core.lh;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import com.bytedance.sdk.component.utils.ko;
import com.bytedance.sdk.component.utils.ksc;
import com.bytedance.sdk.openadsdk.core.bly.pno;
import com.bytedance.sdk.openadsdk.core.bly.qbp;
import com.bytedance.sdk.openadsdk.core.model.cf;
import com.bytedance.sdk.openadsdk.core.model.od;
import com.bytedance.sdk.openadsdk.core.model.th;
import com.bytedance.sdk.openadsdk.core.model.vpp;
import com.bytedance.sdk.openadsdk.core.uoy;
import com.bytedance.sdk.openadsdk.core.zih;
import com.bytedance.sdk.openadsdk.utils.osn;
import com.bytedance.sdk.openadsdk.utils.rn;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public class ouw extends vt {
    public boolean fkw;

    /* JADX INFO: renamed from: le, reason: collision with root package name */
    public boolean f12718le;
    private WeakReference<InterfaceC0125ouw> ouw;

    /* JADX INFO: renamed from: ra, reason: collision with root package name */
    public boolean f12719ra;
    private int vt;
    public boolean yu;

    /* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.core.lh.ouw$ouw, reason: collision with other inner class name */
    public interface InterfaceC0125ouw {
        long getVideoProgress();
    }

    private boolean lh(View view) {
        if (view == null) {
            return false;
        }
        if (view instanceof com.bytedance.sdk.openadsdk.core.mwh.vt.le) {
            ko.lh("ClickCreativeListener", "NativeVideoTsView....");
            return true;
        }
        if (view.getId() == rn.qni || view.getId() == rn.rrs || view.getId() == rn.jvy || view.getId() == rn.fqk || view.getId() == rn.hun) {
            ko.lh("ClickCreativeListener", "tt_video_ad_cover_center_layout....");
            return true;
        }
        if (view.getId() == 520093726 || view.getId() == rn.f13417ki) {
            ko.lh("ClickCreativeListener", "tt_root_view....");
            return true;
        }
        if (!(view instanceof ViewGroup)) {
            return false;
        }
        int i10 = 0;
        while (true) {
            ViewGroup viewGroup = (ViewGroup) view;
            if (i10 >= viewGroup.getChildCount()) {
                return false;
            }
            if (lh(viewGroup.getChildAt(i10))) {
                return true;
            }
            i10++;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:107:0x01a5  */
    /* JADX WARN: Code duplicated, block: B:112:0x01af  */
    /* JADX WARN: Code duplicated, block: B:146:0x0276  */
    /* JADX WARN: Code duplicated, block: B:148:0x027d  */
    /* JADX WARN: Code duplicated, block: B:149:0x0280  */
    /* JADX WARN: Code duplicated, block: B:152:0x0294  */
    /* JADX WARN: Code duplicated, block: B:161:0x02ae  */
    /* JADX WARN: Code duplicated, block: B:236:0x03b9  */
    /* JADX WARN: Code duplicated, block: B:238:0x03c1  */
    /* JADX WARN: Code duplicated, block: B:249:0x03f7  */
    /* JADX WARN: Code duplicated, block: B:251:0x03fb  */
    /* JADX WARN: Code duplicated, block: B:253:0x03ff  */
    /* JADX WARN: Code duplicated, block: B:255:0x0408  */
    /* JADX WARN: Code duplicated, block: B:256:0x040b  */
    /* JADX WARN: Code duplicated, block: B:259:0x0414  */
    /* JADX WARN: Code duplicated, block: B:261:0x041c  */
    /* JADX WARN: Code duplicated, block: B:263:0x0420 A[Catch: Exception -> 0x0438, TryCatch #0 {Exception -> 0x0438, blocks: (B:260:0x0417, B:263:0x0420, B:265:0x0429, B:269:0x0435, B:267:0x042d), top: B:293:0x0417 }] */
    /* JADX WARN: Code duplicated, block: B:267:0x042d A[Catch: Exception -> 0x0438, TryCatch #0 {Exception -> 0x0438, blocks: (B:260:0x0417, B:263:0x0420, B:265:0x0429, B:269:0x0435, B:267:0x042d), top: B:293:0x0417 }] */
    /* JADX WARN: Code duplicated, block: B:271:0x043a  */
    /* JADX WARN: Code duplicated, block: B:273:0x0440  */
    /* JADX WARN: Code duplicated, block: B:274:0x0443  */
    /* JADX WARN: Code duplicated, block: B:277:0x044b  */
    /* JADX WARN: Code duplicated, block: B:280:0x0451  */
    /* JADX WARN: Code duplicated, block: B:283:0x046b  */
    /* JADX WARN: Code duplicated, block: B:285:0x0473  */
    /* JADX WARN: Code duplicated, block: B:286:0x0476  */
    /* JADX WARN: Code duplicated, block: B:290:0x0481  */
    /* JADX WARN: Code duplicated, block: B:300:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:62:0x00f8  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.bytedance.sdk.openadsdk.core.lh.vt, com.bytedance.sdk.openadsdk.core.lh.lh
    public void ouw(View view, float f10, float f11, float f12, float f13, SparseArray<lh.ouw> sparseArray, boolean z10) {
        String str;
        com.bytedance.sdk.openadsdk.core.ryl.yu yuVar;
        boolean z11;
        JSONObject jSONObject;
        boolean z12;
        int i10;
        JSONObject jSONObject2;
        View viewFindViewById;
        View view2;
        cf cfVarOuw;
        int i11;
        View view3;
        int i12;
        Object tag;
        Activity activityOuw;
        Context context;
        boolean z13;
        int i13;
        String str2;
        vt.ouw ouwVar;
        int i14;
        int i15;
        int i16;
        if (ouw(view, 2, f10, f11, f12, f13, sparseArray, z10)) {
            return;
        }
        vpp vppVar = this.tlj;
        vppVar.f12847cp = true;
        vppVar.pv();
        if (!vppVar.f12842an) {
            vppVar.mq = true;
        }
        if (vpp.fkw(vppVar)) {
            com.bytedance.sdk.openadsdk.yu.lh.vt(vppVar, this.f12721cf, vppVar.uq);
        }
        if (this.zih != null) {
            if (this.qbp == null) {
                this.qbp = new HashMap();
            }
            this.qbp.put("duration", Long.valueOf(this.zih.rn()));
        }
        int i17 = vppVar.ycd;
        vppVar.ycd = 0;
        com.bytedance.sdk.openadsdk.qbp.ouw.ouw.lh lhVar = this.f12726th;
        if (lhVar != null) {
            lhVar.ouw(i17 > 0 ? i17 : 0);
        }
        Map<String, Object> map = this.qbp;
        if (map != null) {
            map.remove("dsp_click_type");
            this.qbp.remove("click_probability_jump");
            this.qbp.remove("auto_click");
        }
        boolean zCd = vppVar.cd();
        if (i17 > 0) {
            if (this.qbp == null) {
                this.qbp = new HashMap();
            }
            if (zCd && i17 < 11) {
                this.qbp.put("dsp_click_type", Integer.valueOf(i17));
            }
            if (i17 >= 11 && vppVar.cy == 0) {
                this.qbp.put("click_probability_jump", Integer.valueOf(i17 <= 0 ? 0 : i17 >= 11 ? (i17 - 11) + 1 : i17));
            }
        }
        com.bytedance.sdk.openadsdk.core.model.yu yuVarSd = vppVar.sd();
        if (zCd || yuVarSd != null) {
            long videoProgress = 0;
            WeakReference<InterfaceC0125ouw> weakReference = this.ouw;
            if (weakReference != null && weakReference.get() != null) {
                videoProgress = this.ouw.get().getVideoProgress();
            }
            if (!zCd && yuVarSd != null && (yuVar = yuVarSd.ouw) != null) {
                yuVar.le(videoProgress);
            }
            if (zCd) {
                if (view != null) {
                    Object tag2 = view.getTag(570425345);
                    if (tag2 instanceof String) {
                        str = (String) tag2;
                    } else {
                        str = "VAST_ACTION_BUTTON";
                    }
                } else {
                    str = "VAST_ACTION_BUTTON";
                }
                com.bytedance.sdk.openadsdk.core.ryl.ouw ouwVar2 = vppVar.cu;
                if (ouwVar2 != null) {
                    ouwVar2.f13011cf = str;
                    if (!TextUtils.isEmpty(str)) {
                        this.ex = str;
                    }
                    if ("VAST_ICON".equals(str)) {
                        com.bytedance.sdk.openadsdk.core.ryl.vt vtVar = ouwVar2.vt;
                        if (vtVar != null) {
                            vtVar.ouw(videoProgress);
                        }
                    } else if ("VAST_END_CARD".equals(str)) {
                        com.bytedance.sdk.openadsdk.core.ryl.lh lhVar2 = ouwVar2.f13013lh;
                        if (lhVar2 != null) {
                            lhVar2.ouw(videoProgress);
                        }
                    } else {
                        com.bytedance.sdk.openadsdk.core.ryl.yu yuVar2 = ouwVar2.ouw.ouw;
                        if (yuVar2 != null) {
                            yuVar2.le(videoProgress);
                        }
                    }
                }
            }
        }
        vpp vppVar2 = this.tlj;
        if (vppVar2 == null || (this instanceof pno) || !((i15 = vppVar2.ucs) == 5 || i15 == 15)) {
            z11 = false;
        } else {
            if (this.vt == 0) {
                this.vt = vppVar2.uoy();
            }
            StringBuilder sb2 = new StringBuilder("!isViewVisibility()=");
            sb2.append(!ouw());
            sb2.append(",isAutoPlay()=");
            sb2.append(fkw());
            sb2.append(",!isCoverPageVisibility()=");
            sb2.append(!vt());
            ko.vt("ClickCreativeListener", sb2.toString());
            if (this.vt == 5) {
                vpp vppVar3 = this.tlj;
                if (!(vpp.fkw(vppVar3) && vppVar3.f12862ln == 1) || !fkw() || ouw() || vt()) {
                    i16 = this.vt;
                    if (i16 != 1 || i16 == 2 || i16 == 5) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                } else {
                    z11 = false;
                }
            } else {
                i16 = this.vt;
                if (i16 != 1) {
                }
                z11 = true;
            }
        }
        if (z11 && lh(view) && !this.f12718le) {
            ko.vt("ClickCreativeListener", "Intercept the native video view , Select the normal click event.....");
            super.ouw(view, f10, f11, f12, f13, sparseArray, z10);
            return;
        }
        ko.vt("ClickCreativeListener", "Select creative area click event.....");
        if (this.pno == null) {
            this.pno = zih.ouw();
        }
        if (this.pno != null && ouw(view, z10)) {
            JSONObject jSONObjectOuw = qbp.ouw(view);
            com.bytedance.sdk.openadsdk.core.model.ko koVar = this.bly;
            if (koVar != null) {
                int i18 = koVar.pno;
                JSONObject jSONObject3 = koVar.bly;
                JSONObject jSONObject4 = koVar.mwh;
                i10 = i18;
                z12 = koVar.f12763jg;
                jSONObject = jSONObject3;
                jSONObject2 = jSONObject4;
            } else {
                jSONObject = jSONObjectOuw;
                z12 = false;
                i10 = -1;
                jSONObject2 = null;
            }
            long j10 = this.uq;
            long j11 = this.f12715pd;
            WeakReference<View> weakReference2 = this.mwh;
            if (weakReference2 == null) {
                WeakReference<Activity> weakReference3 = this.f12725tc;
                if (weakReference3 == null || weakReference3.get() == null) {
                    view2 = null;
                } else {
                    viewFindViewById = this.f12725tc.get().findViewById(R.id.content);
                }
                cfVarOuw = ouw(f10, f11, f12, f13, sparseArray, j10, j11, view2, this.ex, osn.bly(this.pno), osn.cf(this.pno), osn.tlj(this.pno), i10, jSONObject, jSONObject2);
                this.f12722jg = cfVarOuw;
                if (z12) {
                    String str3 = this.f12721cf;
                    Map<String, Object> map2 = this.qbp;
                    if (z10) {
                        i14 = 1;
                    } else {
                        i14 = 2;
                    }
                    com.bytedance.sdk.openadsdk.yu.lh.ouw("click", vppVar, cfVarOuw, str3, true, map2, i14);
                    return;
                }
                i11 = vppVar.f12868pd;
                byte b10 = 4;
                if (i11 != 2 || i11 == 3) {
                    view3 = view;
                    if (i11 == 3) {
                        str2 = vppVar.osn;
                        if (!TextUtils.isEmpty(str2) || !str2.contains("play.google.com/store")) {
                            if (this.f12724rn == null || this.fkw) {
                                cf cfVar = this.f12722jg;
                                String str4 = this.f12721cf;
                                Map<String, Object> map3 = this.qbp;
                                if (z10) {
                                    i12 = 1;
                                } else {
                                    i12 = 2;
                                }
                                com.bytedance.sdk.openadsdk.yu.lh.ouw("click_button", vppVar, cfVar, str4, true, map3, i12);
                            }
                            if (view3 != null) {
                                try {
                                    tag = view3.getTag(520093762);
                                } catch (Exception unused) {
                                }
                            } else {
                                tag = null;
                            }
                            if ((view3 == null && (view.getId() == 520093726 || (view3 instanceof com.bytedance.sdk.openadsdk.core.mwh.vt.le))) || Boolean.TRUE.equals(tag)) {
                                uoy.ouw(true);
                            }
                            activityOuw = view3 != null ? com.bytedance.sdk.component.utils.vt.ouw(view) : null;
                            if (activityOuw == null) {
                                context = this.pno;
                            } else {
                                context = activityOuw;
                            }
                            if (th.lh(vppVar) || !this.f12719ra) {
                                boolean zOuw = uoy.ouw(context, vppVar, this.ryl, this.f12724rn, this.zin, this.f12721cf, this.f12726th, true, i17);
                                uoy.ouw(false);
                                z13 = zOuw;
                            } else {
                                z13 = false;
                            }
                            if (this.yu) {
                                cf cfVar2 = this.f12722jg;
                                String str5 = this.f12721cf;
                                Map<String, Object> map4 = this.qbp;
                                if (z10) {
                                    i13 = 1;
                                } else {
                                    i13 = 2;
                                }
                                com.bytedance.sdk.openadsdk.yu.lh.ouw("click", vppVar, cfVar2, str5, z13, map4, i13);
                            }
                        } else if (!com.bytedance.sdk.openadsdk.qbp.ouw.ouw.vt.ouw(this.pno, str2, str2.substring(str2.indexOf("?id=") + 4), this.f12721cf, vppVar)) {
                            if (this.f12724rn == null) {
                                cf cfVar3 = this.f12722jg;
                                String str6 = this.f12721cf;
                                Map<String, Object> map5 = this.qbp;
                                if (z10) {
                                    i12 = 1;
                                } else {
                                    i12 = 2;
                                }
                                com.bytedance.sdk.openadsdk.yu.lh.ouw("click_button", vppVar, cfVar3, str6, true, map5, i12);
                            } else {
                                cf cfVar4 = this.f12722jg;
                                String str7 = this.f12721cf;
                                Map<String, Object> map6 = this.qbp;
                                if (z10) {
                                    i12 = 1;
                                } else {
                                    i12 = 2;
                                }
                                com.bytedance.sdk.openadsdk.yu.lh.ouw("click_button", vppVar, cfVar4, str7, true, map6, i12);
                            }
                            if (view3 != null) {
                                tag = view3.getTag(520093762);
                            } else {
                                tag = null;
                            }
                            if (view3 == null) {
                                uoy.ouw(true);
                            } else {
                                uoy.ouw(true);
                            }
                            if (view3 != null) {
                            }
                            if (activityOuw == null) {
                                context = this.pno;
                            } else {
                                context = activityOuw;
                            }
                            if (th.lh(vppVar)) {
                                boolean zOuw2 = uoy.ouw(context, vppVar, this.ryl, this.f12724rn, this.zin, this.f12721cf, this.f12726th, true, i17);
                                uoy.ouw(false);
                                z13 = zOuw2;
                            } else {
                                boolean zOuw3 = uoy.ouw(context, vppVar, this.ryl, this.f12724rn, this.zin, this.f12721cf, this.f12726th, true, i17);
                                uoy.ouw(false);
                                z13 = zOuw3;
                            }
                            if (this.yu) {
                                cf cfVar5 = this.f12722jg;
                                String str8 = this.f12721cf;
                                Map<String, Object> map7 = this.qbp;
                                if (z10) {
                                    i13 = 1;
                                } else {
                                    i13 = 2;
                                }
                                com.bytedance.sdk.openadsdk.yu.lh.ouw("click", vppVar, cfVar5, str8, z13, map7, i13);
                            }
                        } else if (this.yu) {
                            com.bytedance.sdk.openadsdk.yu.lh.ouw("click", vppVar, this.f12722jg, this.f12721cf, true, this.qbp, z10 ? 1 : 2);
                        }
                    } else {
                        if (this.f12724rn == null) {
                            cf cfVar6 = this.f12722jg;
                            String str9 = this.f12721cf;
                            Map<String, Object> map8 = this.qbp;
                            if (z10) {
                                i12 = 1;
                            } else {
                                i12 = 2;
                            }
                            com.bytedance.sdk.openadsdk.yu.lh.ouw("click_button", vppVar, cfVar6, str9, true, map8, i12);
                        } else {
                            cf cfVar7 = this.f12722jg;
                            String str10 = this.f12721cf;
                            Map<String, Object> map9 = this.qbp;
                            if (z10) {
                                i12 = 1;
                            } else {
                                i12 = 2;
                            }
                            com.bytedance.sdk.openadsdk.yu.lh.ouw("click_button", vppVar, cfVar7, str10, true, map9, i12);
                        }
                        if (view3 != null) {
                            tag = view3.getTag(520093762);
                        } else {
                            tag = null;
                        }
                        if (view3 == null) {
                            uoy.ouw(true);
                        } else {
                            uoy.ouw(true);
                        }
                        if (view3 != null) {
                        }
                        if (activityOuw == null) {
                            context = this.pno;
                        } else {
                            context = activityOuw;
                        }
                        if (th.lh(vppVar)) {
                            boolean zOuw4 = uoy.ouw(context, vppVar, this.ryl, this.f12724rn, this.zin, this.f12721cf, this.f12726th, true, i17);
                            uoy.ouw(false);
                            z13 = zOuw4;
                        } else {
                            boolean zOuw5 = uoy.ouw(context, vppVar, this.ryl, this.f12724rn, this.zin, this.f12721cf, this.f12726th, true, i17);
                            uoy.ouw(false);
                            z13 = zOuw5;
                        }
                        if (this.yu) {
                            cf cfVar8 = this.f12722jg;
                            String str11 = this.f12721cf;
                            Map<String, Object> map10 = this.qbp;
                            if (z10) {
                                i13 = 1;
                            } else {
                                i13 = 2;
                            }
                            com.bytedance.sdk.openadsdk.yu.lh.ouw("click", vppVar, cfVar8, str11, z13, map10, i13);
                        }
                    }
                } else if (i11 != 4) {
                    if (i11 == 5) {
                        String str12 = this.f12721cf;
                        str12.hashCode();
                        String str13 = "open_ad";
                        switch (str12.hashCode()) {
                            case -1695837674:
                                b10 = !str12.equals("banner_ad") ? (byte) -1 : (byte) 0;
                                break;
                            case -1263194568:
                                b10 = !str12.equals("open_ad") ? (byte) -1 : (byte) 1;
                                break;
                            case -712491894:
                                b10 = !str12.equals("embeded_ad") ? (byte) -1 : (byte) 2;
                                break;
                            case 1844104722:
                                b10 = !str12.equals("interaction") ? (byte) -1 : (byte) 3;
                                break;
                            case 2091589896:
                                if (!str12.equals("slide_banner_ad")) {
                                    b10 = -1;
                                }
                                break;
                            default:
                                b10 = -1;
                                break;
                        }
                        String str14 = "banner_call";
                        switch (b10) {
                            case 0:
                            case 4:
                                str13 = str14;
                                break;
                            case 1:
                                break;
                            case 2:
                                str14 = "feed_call";
                                str13 = str14;
                                break;
                            case 3:
                                str14 = "interaction_call";
                                str13 = str14;
                                break;
                            default:
                                str14 = "";
                                str13 = str14;
                                break;
                        }
                        if (!TextUtils.isEmpty(str13)) {
                            com.bytedance.sdk.openadsdk.yu.lh.ouw("click_call", vppVar, this.f12722jg, str13, true, this.qbp, z10 ? 1 : 2);
                        }
                        com.bytedance.sdk.openadsdk.yu.lh.ouw("click", vppVar, this.f12722jg, this.f12721cf, com.bytedance.sdk.openadsdk.utils.uoy.vt(view.getContext(), vppVar.ey), this.qbp, z10 ? 1 : 2);
                        view3 = view;
                    } else if (i11 != 8) {
                        view3 = view;
                        i11 = -1;
                    } else {
                        view3 = view;
                        if (i11 == 3) {
                            str2 = vppVar.osn;
                            if (!TextUtils.isEmpty(str2)) {
                                if (this.f12724rn == null) {
                                    cf cfVar9 = this.f12722jg;
                                    String str15 = this.f12721cf;
                                    Map<String, Object> map11 = this.qbp;
                                    if (z10) {
                                        i12 = 1;
                                    } else {
                                        i12 = 2;
                                    }
                                    com.bytedance.sdk.openadsdk.yu.lh.ouw("click_button", vppVar, cfVar9, str15, true, map11, i12);
                                } else {
                                    cf cfVar10 = this.f12722jg;
                                    String str16 = this.f12721cf;
                                    Map<String, Object> map12 = this.qbp;
                                    if (z10) {
                                        i12 = 1;
                                    } else {
                                        i12 = 2;
                                    }
                                    com.bytedance.sdk.openadsdk.yu.lh.ouw("click_button", vppVar, cfVar10, str16, true, map12, i12);
                                }
                                if (view3 != null) {
                                    tag = view3.getTag(520093762);
                                } else {
                                    tag = null;
                                }
                                if (view3 == null) {
                                    uoy.ouw(true);
                                } else {
                                    uoy.ouw(true);
                                }
                                if (view3 != null) {
                                }
                                if (activityOuw == null) {
                                    context = this.pno;
                                } else {
                                    context = activityOuw;
                                }
                                if (th.lh(vppVar)) {
                                    boolean zOuw6 = uoy.ouw(context, vppVar, this.ryl, this.f12724rn, this.zin, this.f12721cf, this.f12726th, true, i17);
                                    uoy.ouw(false);
                                    z13 = zOuw6;
                                } else {
                                    boolean zOuw7 = uoy.ouw(context, vppVar, this.ryl, this.f12724rn, this.zin, this.f12721cf, this.f12726th, true, i17);
                                    uoy.ouw(false);
                                    z13 = zOuw7;
                                }
                                if (this.yu) {
                                    cf cfVar11 = this.f12722jg;
                                    String str17 = this.f12721cf;
                                    Map<String, Object> map13 = this.qbp;
                                    if (z10) {
                                        i13 = 1;
                                    } else {
                                        i13 = 2;
                                    }
                                    com.bytedance.sdk.openadsdk.yu.lh.ouw("click", vppVar, cfVar11, str17, z13, map13, i13);
                                }
                            } else {
                                if (this.f12724rn == null) {
                                    cf cfVar12 = this.f12722jg;
                                    String str18 = this.f12721cf;
                                    Map<String, Object> map14 = this.qbp;
                                    if (z10) {
                                        i12 = 1;
                                    } else {
                                        i12 = 2;
                                    }
                                    com.bytedance.sdk.openadsdk.yu.lh.ouw("click_button", vppVar, cfVar12, str18, true, map14, i12);
                                } else {
                                    cf cfVar13 = this.f12722jg;
                                    String str19 = this.f12721cf;
                                    Map<String, Object> map15 = this.qbp;
                                    if (z10) {
                                        i12 = 1;
                                    } else {
                                        i12 = 2;
                                    }
                                    com.bytedance.sdk.openadsdk.yu.lh.ouw("click_button", vppVar, cfVar13, str19, true, map15, i12);
                                }
                                if (view3 != null) {
                                    tag = view3.getTag(520093762);
                                } else {
                                    tag = null;
                                }
                                if (view3 == null) {
                                    uoy.ouw(true);
                                } else {
                                    uoy.ouw(true);
                                }
                                if (view3 != null) {
                                }
                                if (activityOuw == null) {
                                    context = this.pno;
                                } else {
                                    context = activityOuw;
                                }
                                if (th.lh(vppVar)) {
                                    boolean zOuw8 = uoy.ouw(context, vppVar, this.ryl, this.f12724rn, this.zin, this.f12721cf, this.f12726th, true, i17);
                                    uoy.ouw(false);
                                    z13 = zOuw8;
                                } else {
                                    boolean zOuw9 = uoy.ouw(context, vppVar, this.ryl, this.f12724rn, this.zin, this.f12721cf, this.f12726th, true, i17);
                                    uoy.ouw(false);
                                    z13 = zOuw9;
                                }
                                if (this.yu) {
                                    cf cfVar14 = this.f12722jg;
                                    String str110 = this.f12721cf;
                                    Map<String, Object> map16 = this.qbp;
                                    if (z10) {
                                        i13 = 1;
                                    } else {
                                        i13 = 2;
                                    }
                                    com.bytedance.sdk.openadsdk.yu.lh.ouw("click", vppVar, cfVar14, str110, z13, map16, i13);
                                }
                            }
                        } else {
                            if (this.f12724rn == null) {
                                cf cfVar15 = this.f12722jg;
                                String str111 = this.f12721cf;
                                Map<String, Object> map17 = this.qbp;
                                if (z10) {
                                    i12 = 1;
                                } else {
                                    i12 = 2;
                                }
                                com.bytedance.sdk.openadsdk.yu.lh.ouw("click_button", vppVar, cfVar15, str111, true, map17, i12);
                            } else {
                                cf cfVar16 = this.f12722jg;
                                String str112 = this.f12721cf;
                                Map<String, Object> map18 = this.qbp;
                                if (z10) {
                                    i12 = 1;
                                } else {
                                    i12 = 2;
                                }
                                com.bytedance.sdk.openadsdk.yu.lh.ouw("click_button", vppVar, cfVar16, str112, true, map18, i12);
                            }
                            if (view3 != null) {
                                tag = view3.getTag(520093762);
                            } else {
                                tag = null;
                            }
                            if (view3 == null) {
                                uoy.ouw(true);
                            } else {
                                uoy.ouw(true);
                            }
                            if (view3 != null) {
                            }
                            if (activityOuw == null) {
                                context = this.pno;
                            } else {
                                context = activityOuw;
                            }
                            if (th.lh(vppVar)) {
                                boolean zOuw10 = uoy.ouw(context, vppVar, this.ryl, this.f12724rn, this.zin, this.f12721cf, this.f12726th, true, i17);
                                uoy.ouw(false);
                                z13 = zOuw10;
                            } else {
                                boolean zOuw11 = uoy.ouw(context, vppVar, this.ryl, this.f12724rn, this.zin, this.f12721cf, this.f12726th, true, i17);
                                uoy.ouw(false);
                                z13 = zOuw11;
                            }
                            if (this.yu) {
                                cf cfVar17 = this.f12722jg;
                                String str113 = this.f12721cf;
                                Map<String, Object> map19 = this.qbp;
                                if (z10) {
                                    i13 = 1;
                                } else {
                                    i13 = 2;
                                }
                                com.bytedance.sdk.openadsdk.yu.lh.ouw("click", vppVar, cfVar17, str113, z13, map19, i13);
                            }
                        }
                    }
                } else if (!od.vt(vppVar) || (this.f12724rn == null && this.zin == null)) {
                    view3 = view;
                    com.bytedance.sdk.openadsdk.qbp.ouw.ouw.lh lhVar3 = this.f12726th;
                    if (lhVar3 != null) {
                        lhVar3.ouw(vppVar);
                        Map<String, Object> map20 = this.qbp;
                        if (vppVar.f12842an && !vppVar.mq) {
                            map20.put("auto_click", Boolean.TRUE);
                            vppVar.f12842an = false;
                        }
                        if (this.yu) {
                            com.bytedance.sdk.openadsdk.yu.lh.ouw("click", vppVar, this.f12722jg, this.f12721cf, true, map20, z10 ? 1 : 2);
                        }
                    }
                } else {
                    view3 = view;
                    activityOuw = view3 != null ? com.bytedance.sdk.component.utils.vt.ouw(view) : null;
                    boolean zOuw12 = uoy.ouw(activityOuw == null ? this.pno : activityOuw, vppVar, this.ryl, this.f12724rn, this.zin, this.f12721cf, this.f12726th, true, i17);
                    if (this.yu) {
                        com.bytedance.sdk.openadsdk.yu.lh.ouw("click", vppVar, this.f12722jg, this.f12721cf, zOuw12, this.qbp, z10 ? 1 : 2);
                    }
                }
                ouwVar = this.f12723ko;
                if (ouwVar != null) {
                    ouwVar.ouw(view3, i11);
                }
            }
            viewFindViewById = weakReference2.get();
            view2 = viewFindViewById;
            cfVarOuw = ouw(f10, f11, f12, f13, sparseArray, j10, j11, view2, this.ex, osn.bly(this.pno), osn.cf(this.pno), osn.tlj(this.pno), i10, jSONObject, jSONObject2);
            this.f12722jg = cfVarOuw;
            if (z12) {
                String str20 = this.f12721cf;
                Map<String, Object> map21 = this.qbp;
                if (z10) {
                    i14 = 1;
                } else {
                    i14 = 2;
                }
                com.bytedance.sdk.openadsdk.yu.lh.ouw("click", vppVar, cfVarOuw, str20, true, map21, i14);
                return;
            }
            i11 = vppVar.f12868pd;
            byte b11 = 4;
            if (i11 != 2) {
                view3 = view;
                if (i11 == 3) {
                    str2 = vppVar.osn;
                    if (!TextUtils.isEmpty(str2)) {
                        if (this.f12724rn == null) {
                            cf cfVar18 = this.f12722jg;
                            String str114 = this.f12721cf;
                            Map<String, Object> map110 = this.qbp;
                            if (z10) {
                                i12 = 1;
                            } else {
                                i12 = 2;
                            }
                            com.bytedance.sdk.openadsdk.yu.lh.ouw("click_button", vppVar, cfVar18, str114, true, map110, i12);
                        } else {
                            cf cfVar19 = this.f12722jg;
                            String str115 = this.f12721cf;
                            Map<String, Object> map111 = this.qbp;
                            if (z10) {
                                i12 = 1;
                            } else {
                                i12 = 2;
                            }
                            com.bytedance.sdk.openadsdk.yu.lh.ouw("click_button", vppVar, cfVar19, str115, true, map111, i12);
                        }
                        if (view3 != null) {
                            tag = view3.getTag(520093762);
                        } else {
                            tag = null;
                        }
                        if (view3 == null) {
                            uoy.ouw(true);
                        } else {
                            uoy.ouw(true);
                        }
                        if (view3 != null) {
                        }
                        if (activityOuw == null) {
                            context = this.pno;
                        } else {
                            context = activityOuw;
                        }
                        if (th.lh(vppVar)) {
                            boolean zOuw13 = uoy.ouw(context, vppVar, this.ryl, this.f12724rn, this.zin, this.f12721cf, this.f12726th, true, i17);
                            uoy.ouw(false);
                            z13 = zOuw13;
                        } else {
                            boolean zOuw14 = uoy.ouw(context, vppVar, this.ryl, this.f12724rn, this.zin, this.f12721cf, this.f12726th, true, i17);
                            uoy.ouw(false);
                            z13 = zOuw14;
                        }
                        if (this.yu) {
                            cf cfVar110 = this.f12722jg;
                            String str116 = this.f12721cf;
                            Map<String, Object> map112 = this.qbp;
                            if (z10) {
                                i13 = 1;
                            } else {
                                i13 = 2;
                            }
                            com.bytedance.sdk.openadsdk.yu.lh.ouw("click", vppVar, cfVar110, str116, z13, map112, i13);
                        }
                    } else {
                        if (this.f12724rn == null) {
                            cf cfVar111 = this.f12722jg;
                            String str117 = this.f12721cf;
                            Map<String, Object> map113 = this.qbp;
                            if (z10) {
                                i12 = 1;
                            } else {
                                i12 = 2;
                            }
                            com.bytedance.sdk.openadsdk.yu.lh.ouw("click_button", vppVar, cfVar111, str117, true, map113, i12);
                        } else {
                            cf cfVar112 = this.f12722jg;
                            String str118 = this.f12721cf;
                            Map<String, Object> map114 = this.qbp;
                            if (z10) {
                                i12 = 1;
                            } else {
                                i12 = 2;
                            }
                            com.bytedance.sdk.openadsdk.yu.lh.ouw("click_button", vppVar, cfVar112, str118, true, map114, i12);
                        }
                        if (view3 != null) {
                            tag = view3.getTag(520093762);
                        } else {
                            tag = null;
                        }
                        if (view3 == null) {
                            uoy.ouw(true);
                        } else {
                            uoy.ouw(true);
                        }
                        if (view3 != null) {
                        }
                        if (activityOuw == null) {
                            context = this.pno;
                        } else {
                            context = activityOuw;
                        }
                        if (th.lh(vppVar)) {
                            boolean zOuw15 = uoy.ouw(context, vppVar, this.ryl, this.f12724rn, this.zin, this.f12721cf, this.f12726th, true, i17);
                            uoy.ouw(false);
                            z13 = zOuw15;
                        } else {
                            boolean zOuw16 = uoy.ouw(context, vppVar, this.ryl, this.f12724rn, this.zin, this.f12721cf, this.f12726th, true, i17);
                            uoy.ouw(false);
                            z13 = zOuw16;
                        }
                        if (this.yu) {
                            cf cfVar113 = this.f12722jg;
                            String str119 = this.f12721cf;
                            Map<String, Object> map115 = this.qbp;
                            if (z10) {
                                i13 = 1;
                            } else {
                                i13 = 2;
                            }
                            com.bytedance.sdk.openadsdk.yu.lh.ouw("click", vppVar, cfVar113, str119, z13, map115, i13);
                        }
                    }
                } else {
                    if (this.f12724rn == null) {
                        cf cfVar114 = this.f12722jg;
                        String str1110 = this.f12721cf;
                        Map<String, Object> map116 = this.qbp;
                        if (z10) {
                            i12 = 1;
                        } else {
                            i12 = 2;
                        }
                        com.bytedance.sdk.openadsdk.yu.lh.ouw("click_button", vppVar, cfVar114, str1110, true, map116, i12);
                    } else {
                        cf cfVar115 = this.f12722jg;
                        String str1111 = this.f12721cf;
                        Map<String, Object> map117 = this.qbp;
                        if (z10) {
                            i12 = 1;
                        } else {
                            i12 = 2;
                        }
                        com.bytedance.sdk.openadsdk.yu.lh.ouw("click_button", vppVar, cfVar115, str1111, true, map117, i12);
                    }
                    if (view3 != null) {
                        tag = view3.getTag(520093762);
                    } else {
                        tag = null;
                    }
                    if (view3 == null) {
                        uoy.ouw(true);
                    } else {
                        uoy.ouw(true);
                    }
                    if (view3 != null) {
                    }
                    if (activityOuw == null) {
                        context = this.pno;
                    } else {
                        context = activityOuw;
                    }
                    if (th.lh(vppVar)) {
                        boolean zOuw17 = uoy.ouw(context, vppVar, this.ryl, this.f12724rn, this.zin, this.f12721cf, this.f12726th, true, i17);
                        uoy.ouw(false);
                        z13 = zOuw17;
                    } else {
                        boolean zOuw18 = uoy.ouw(context, vppVar, this.ryl, this.f12724rn, this.zin, this.f12721cf, this.f12726th, true, i17);
                        uoy.ouw(false);
                        z13 = zOuw18;
                    }
                    if (this.yu) {
                        cf cfVar116 = this.f12722jg;
                        String str1112 = this.f12721cf;
                        Map<String, Object> map118 = this.qbp;
                        if (z10) {
                            i13 = 1;
                        } else {
                            i13 = 2;
                        }
                        com.bytedance.sdk.openadsdk.yu.lh.ouw("click", vppVar, cfVar116, str1112, z13, map118, i13);
                    }
                }
            } else {
                view3 = view;
                if (i11 == 3) {
                    str2 = vppVar.osn;
                    if (!TextUtils.isEmpty(str2)) {
                        if (this.f12724rn == null) {
                            cf cfVar117 = this.f12722jg;
                            String str1113 = this.f12721cf;
                            Map<String, Object> map119 = this.qbp;
                            if (z10) {
                                i12 = 1;
                            } else {
                                i12 = 2;
                            }
                            com.bytedance.sdk.openadsdk.yu.lh.ouw("click_button", vppVar, cfVar117, str1113, true, map119, i12);
                        } else {
                            cf cfVar118 = this.f12722jg;
                            String str1114 = this.f12721cf;
                            Map<String, Object> map1110 = this.qbp;
                            if (z10) {
                                i12 = 1;
                            } else {
                                i12 = 2;
                            }
                            com.bytedance.sdk.openadsdk.yu.lh.ouw("click_button", vppVar, cfVar118, str1114, true, map1110, i12);
                        }
                        if (view3 != null) {
                            tag = view3.getTag(520093762);
                        } else {
                            tag = null;
                        }
                        if (view3 == null) {
                            uoy.ouw(true);
                        } else {
                            uoy.ouw(true);
                        }
                        if (view3 != null) {
                        }
                        if (activityOuw == null) {
                            context = this.pno;
                        } else {
                            context = activityOuw;
                        }
                        if (th.lh(vppVar)) {
                            boolean zOuw19 = uoy.ouw(context, vppVar, this.ryl, this.f12724rn, this.zin, this.f12721cf, this.f12726th, true, i17);
                            uoy.ouw(false);
                            z13 = zOuw19;
                        } else {
                            boolean zOuw110 = uoy.ouw(context, vppVar, this.ryl, this.f12724rn, this.zin, this.f12721cf, this.f12726th, true, i17);
                            uoy.ouw(false);
                            z13 = zOuw110;
                        }
                        if (this.yu) {
                            cf cfVar119 = this.f12722jg;
                            String str1115 = this.f12721cf;
                            Map<String, Object> map1111 = this.qbp;
                            if (z10) {
                                i13 = 1;
                            } else {
                                i13 = 2;
                            }
                            com.bytedance.sdk.openadsdk.yu.lh.ouw("click", vppVar, cfVar119, str1115, z13, map1111, i13);
                        }
                    } else {
                        if (this.f12724rn == null) {
                            cf cfVar1110 = this.f12722jg;
                            String str1116 = this.f12721cf;
                            Map<String, Object> map1112 = this.qbp;
                            if (z10) {
                                i12 = 1;
                            } else {
                                i12 = 2;
                            }
                            com.bytedance.sdk.openadsdk.yu.lh.ouw("click_button", vppVar, cfVar1110, str1116, true, map1112, i12);
                        } else {
                            cf cfVar1111 = this.f12722jg;
                            String str1117 = this.f12721cf;
                            Map<String, Object> map1113 = this.qbp;
                            if (z10) {
                                i12 = 1;
                            } else {
                                i12 = 2;
                            }
                            com.bytedance.sdk.openadsdk.yu.lh.ouw("click_button", vppVar, cfVar1111, str1117, true, map1113, i12);
                        }
                        if (view3 != null) {
                            tag = view3.getTag(520093762);
                        } else {
                            tag = null;
                        }
                        if (view3 == null) {
                            uoy.ouw(true);
                        } else {
                            uoy.ouw(true);
                        }
                        if (view3 != null) {
                        }
                        if (activityOuw == null) {
                            context = this.pno;
                        } else {
                            context = activityOuw;
                        }
                        if (th.lh(vppVar)) {
                            boolean zOuw111 = uoy.ouw(context, vppVar, this.ryl, this.f12724rn, this.zin, this.f12721cf, this.f12726th, true, i17);
                            uoy.ouw(false);
                            z13 = zOuw111;
                        } else {
                            boolean zOuw112 = uoy.ouw(context, vppVar, this.ryl, this.f12724rn, this.zin, this.f12721cf, this.f12726th, true, i17);
                            uoy.ouw(false);
                            z13 = zOuw112;
                        }
                        if (this.yu) {
                            cf cfVar1112 = this.f12722jg;
                            String str1118 = this.f12721cf;
                            Map<String, Object> map1114 = this.qbp;
                            if (z10) {
                                i13 = 1;
                            } else {
                                i13 = 2;
                            }
                            com.bytedance.sdk.openadsdk.yu.lh.ouw("click", vppVar, cfVar1112, str1118, z13, map1114, i13);
                        }
                    }
                } else {
                    if (this.f12724rn == null) {
                        cf cfVar1113 = this.f12722jg;
                        String str1119 = this.f12721cf;
                        Map<String, Object> map1115 = this.qbp;
                        if (z10) {
                            i12 = 1;
                        } else {
                            i12 = 2;
                        }
                        com.bytedance.sdk.openadsdk.yu.lh.ouw("click_button", vppVar, cfVar1113, str1119, true, map1115, i12);
                    } else {
                        cf cfVar1114 = this.f12722jg;
                        String str11110 = this.f12721cf;
                        Map<String, Object> map1116 = this.qbp;
                        if (z10) {
                            i12 = 1;
                        } else {
                            i12 = 2;
                        }
                        com.bytedance.sdk.openadsdk.yu.lh.ouw("click_button", vppVar, cfVar1114, str11110, true, map1116, i12);
                    }
                    if (view3 != null) {
                        tag = view3.getTag(520093762);
                    } else {
                        tag = null;
                    }
                    if (view3 == null) {
                        uoy.ouw(true);
                    } else {
                        uoy.ouw(true);
                    }
                    if (view3 != null) {
                    }
                    if (activityOuw == null) {
                        context = this.pno;
                    } else {
                        context = activityOuw;
                    }
                    if (th.lh(vppVar)) {
                        boolean zOuw113 = uoy.ouw(context, vppVar, this.ryl, this.f12724rn, this.zin, this.f12721cf, this.f12726th, true, i17);
                        uoy.ouw(false);
                        z13 = zOuw113;
                    } else {
                        boolean zOuw114 = uoy.ouw(context, vppVar, this.ryl, this.f12724rn, this.zin, this.f12721cf, this.f12726th, true, i17);
                        uoy.ouw(false);
                        z13 = zOuw114;
                    }
                    if (this.yu) {
                        cf cfVar1115 = this.f12722jg;
                        String str11111 = this.f12721cf;
                        Map<String, Object> map1117 = this.qbp;
                        if (z10) {
                            i13 = 1;
                        } else {
                            i13 = 2;
                        }
                        com.bytedance.sdk.openadsdk.yu.lh.ouw("click", vppVar, cfVar1115, str11111, z13, map1117, i13);
                    }
                }
            }
            ouwVar = this.f12723ko;
            if (ouwVar != null) {
                ouwVar.ouw(view3, i11);
            }
        }
    }

    public boolean ouw() {
        return false;
    }

    public boolean vt() {
        return false;
    }

    private boolean fkw() {
        vpp vppVar = this.tlj;
        if (vppVar == null) {
            return true;
        }
        int iFqk = vppVar.fqk();
        zih.yu();
        int iVt = com.bytedance.sdk.openadsdk.core.settings.cf.vt(iFqk);
        int iOuw = ksc.ouw(zih.ouw(), 60000L);
        if (iVt == 1) {
            return com.bytedance.sdk.openadsdk.utils.uoy.yu(iOuw);
        }
        if (iVt == 2) {
            return com.bytedance.sdk.openadsdk.utils.uoy.fkw(iOuw) || com.bytedance.sdk.openadsdk.utils.uoy.yu(iOuw) || com.bytedance.sdk.openadsdk.utils.uoy.le(iOuw);
        }
        if (iVt != 3) {
            return iVt != 5 || com.bytedance.sdk.openadsdk.utils.uoy.yu(iOuw) || com.bytedance.sdk.openadsdk.utils.uoy.le(iOuw);
        }
        return false;
    }

    public ouw(@NonNull Context context, @NonNull vpp vppVar, @NonNull String str, int i10) {
        super(context, vppVar, str, i10);
        this.yu = true;
        this.fkw = false;
        this.f12718le = false;
        this.f12719ra = false;
    }

    public final void ouw(InterfaceC0125ouw interfaceC0125ouw) {
        this.ouw = new WeakReference<>(interfaceC0125ouw);
    }
}
