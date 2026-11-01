package com.bytedance.sdk.openadsdk.core.mwh.vt;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.SurfaceTexture;
import android.graphics.drawable.AnimatedImageDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Message;
import android.text.TextUtils;
import android.view.SurfaceHolder;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.bytedance.sdk.component.pno.pno;
import com.bytedance.sdk.component.utils.jae;
import com.bytedance.sdk.component.utils.ko;
import com.bytedance.sdk.openadsdk.core.model.vpp;
import com.bytedance.sdk.openadsdk.core.settings.cf;
import com.bytedance.sdk.openadsdk.core.widget.qbp;
import com.bytedance.sdk.openadsdk.core.widget.th;
import com.bytedance.sdk.openadsdk.core.zih;
import com.bytedance.sdk.openadsdk.utils.osn;
import com.bytedance.sdk.openadsdk.utils.rn;
import com.bytedance.sdk.openadsdk.utils.uoy;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.utils.Logger;
import com.safedk.android.utils.g;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.bidmachine.iab.vast.tags.VastTagName;
import io.bidmachine.unified.UnifiedMediationParams;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public class fkw implements com.bykv.vk.openvk.ouw.ouw.ouw.le.ouw, com.bykv.vk.openvk.ouw.ouw.ouw.yu.vt<vpp>, jae.ouw, com.bytedance.sdk.openadsdk.core.lh.ouw.InterfaceC0125ouw, qbp.vt, th.ouw {
    public View bly;
    public com.bykv.vk.openvk.ouw.ouw.ouw.yu.lh bs;

    /* JADX INFO: renamed from: cd, reason: collision with root package name */
    public qbp f12921cd;

    /* JADX INFO: renamed from: cf, reason: collision with root package name */
    public View f12922cf;
    public boolean ex;
    public le.ouw ey;
    public com.bytedance.sdk.openadsdk.core.lh.ouw fak;
    public ViewGroup fkw;
    public com.bytedance.sdk.openadsdk.qbp.ouw.ouw.lh fvf;
    public vpp jae;

    /* JADX INFO: renamed from: jg, reason: collision with root package name */
    public View f12923jg;
    public boolean jqy;

    /* JADX INFO: renamed from: ko, reason: collision with root package name */
    public com.bytedance.sdk.openadsdk.core.widget.ouw f12924ko;
    public int ksc;

    /* JADX INFO: renamed from: le, reason: collision with root package name */
    public com.bykv.vk.openvk.ouw.ouw.ouw.le.vt f12925le;

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    public final int f12926lh;
    public ImageView mwh;

    /* JADX INFO: renamed from: od, reason: collision with root package name */
    public Context f12927od;
    public boolean osn;
    private long ouw;

    /* JADX INFO: renamed from: pd, reason: collision with root package name */
    public boolean f12928pd;
    public View pno;
    public int qbp;

    /* JADX INFO: renamed from: ra, reason: collision with root package name */
    public ImageView f12929ra;

    /* JADX INFO: renamed from: rn, reason: collision with root package name */
    public TextView f12930rn;
    public View ryl;

    /* JADX INFO: renamed from: tc, reason: collision with root package name */
    public int f12931tc;

    /* JADX INFO: renamed from: th, reason: collision with root package name */
    public int f12932th;
    public ImageView tlj;
    public com.bytedance.sdk.openadsdk.core.lh.ouw uoy;
    public ouw uq;

    /* JADX INFO: renamed from: vm, reason: collision with root package name */
    public TextView f12933vm;
    public int vpp;
    private final String vt;
    public final int yu;
    public TextView zih;
    public int zin;

    public fkw(Context context, ViewGroup viewGroup, vpp vppVar, com.bykv.vk.openvk.ouw.ouw.ouw.yu.lh lhVar, boolean z10) {
        this.f12926lh = 228;
        this.yu = 160;
        this.jqy = true;
        this.f12928pd = true;
        this.osn = true;
        this.vt = Build.MODEL;
        if (this instanceof yu) {
            return;
        }
        this.f12927od = zih.ouw().getApplicationContext();
        fkw(z10);
        this.fkw = viewGroup;
        this.jqy = true;
        this.ksc = 17;
        this.bs = lhVar;
        this.jae = vppVar;
        yu(8);
        ouw(context, this.fkw);
        le();
        ko();
    }

    public void bly() {
    }

    public final void fkw(boolean z10) {
        this.f12928pd = z10;
        if (z10) {
            com.bytedance.sdk.openadsdk.core.lh.ouw ouwVar = this.fak;
            if (ouwVar != null) {
                ouwVar.yu = true;
            }
            com.bytedance.sdk.openadsdk.core.lh.ouw ouwVar2 = this.uoy;
            if (ouwVar2 != null) {
                ouwVar2.yu = true;
                return;
            }
            return;
        }
        com.bytedance.sdk.openadsdk.core.lh.ouw ouwVar3 = this.fak;
        if (ouwVar3 != null) {
            ouwVar3.yu = false;
        }
        com.bytedance.sdk.openadsdk.core.lh.ouw ouwVar4 = this.uoy;
        if (ouwVar4 != null) {
            ouwVar4.yu = false;
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.widget.th.ouw
    public void jg() {
    }

    public void le() {
        this.f12925le.ouw(this);
        this.f12929ra.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.core.mwh.vt.fkw.4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Logger.d("Pangle|SafeDK: Execution> Lcom/bytedance/sdk/openadsdk/core/mwh/vt/fkw$4;->onClick(Landroid/view/View;)V");
                CreativeInfoManager.onViewClicked(g.f44975u, view);
                safedk_fkw$4_onClick_249a348b49af2e14a186a2c4e3dcf1cd(view);
            }

            public void safedk_fkw$4_onClick_249a348b49af2e14a186a2c4e3dcf1cd(View p10) {
                if (fkw.this.zih()) {
                    View p11 = fkw.this.f12933vm;
                    if (p11 == null || p11.getVisibility() != 0) {
                        fkw.this.uq.ouw();
                    }
                }
            }
        });
    }

    public final void lh(int i10) {
        osn.ouw((View) this.fkw, 0);
        com.bykv.vk.openvk.ouw.ouw.ouw.le.vt vtVar = this.f12925le;
        if (vtVar != null) {
            vtVar.setVisibility(i10);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.widget.qbp.vt
    public void mwh() {
        lh(false);
    }

    public void ouw(long j10) {
    }

    public void ouw(long j10, long j11) {
    }

    @Override // com.bytedance.sdk.component.utils.jae.ouw
    public void ouw(Message message) {
    }

    public void ouw(ViewGroup viewGroup) {
    }

    public void ouw(String str) {
    }

    public void pno() {
    }

    public void ra() {
    }

    @Override // com.bytedance.sdk.openadsdk.core.widget.qbp.vt
    public boolean ryl() {
        return false;
    }

    public final void vt(int i10, int i11) {
        this.zin = i10;
        this.vpp = i11;
    }

    public void vt(ViewGroup viewGroup) {
    }

    public boolean vt(int i10) {
        return false;
    }

    public void yu(boolean z10) {
    }

    @Override // com.bykv.vk.openvk.ouw.ouw.ouw.le.ouw
    public final boolean yu() {
        this.ex = false;
        if (!zih()) {
            return true;
        }
        this.uq.pno();
        return true;
    }

    private boolean ex() {
        return vpp.fkw(this.jae) && (!com.bytedance.sdk.openadsdk.core.cf.yu.ouw(this.jae.kfa) ? this.jae.f12886xn == null : this.jae.lht == null) && this.jae.f12862ln == 1;
    }

    private void tc() {
        if (this.uq == null || this.f12921cd != null) {
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        qbp qbpVar = new qbp();
        this.f12921cd = qbpVar;
        Context context = this.f12927od;
        ViewGroup viewGroup = this.fkw;
        if (context != null && (viewGroup instanceof ViewGroup)) {
            qbpVar.pno = viewGroup;
            qbpVar.f13140lh = zih.ouw().getApplicationContext();
        }
        qbp qbpVar2 = this.f12921cd;
        ouw ouwVar = this.uq;
        qbpVar2.fkw = this;
        qbpVar2.yu = ouwVar;
        ko.vt("useTime", "mVideoTrafficTipLayout use time :" + (System.currentTimeMillis() - jCurrentTimeMillis));
    }

    public void cf() {
        yu(8);
        if (jqy()) {
            this.f12925le.setVisibility(8);
        }
        ImageView imageView = this.tlj;
        if (imageView != null) {
            imageView.setImageDrawable(null);
        }
        yu(8);
        osn.ouw(this.ryl, 8);
        osn.ouw((View) this.mwh, 8);
        osn.ouw(this.f12923jg, 8);
        osn.ouw((View) this.f12924ko, 8);
        osn.ouw((View) this.f12930rn, 8);
        osn.ouw((View) this.zih, 8);
        qbp qbpVar = this.f12921cd;
        if (qbpVar != null) {
            qbpVar.ouw(true);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.lh.ouw.InterfaceC0125ouw
    public long getVideoProgress() {
        com.bykv.vk.openvk.ouw.ouw.ouw.lh.vt vtVar;
        if (this.ouw <= 0) {
            vpp vppVar = this.jae;
            if (vppVar != null && (vtVar = vppVar.f12874sd) != null) {
                this.ouw = (long) (vtVar.yu * 1000.0d);
            }
            com.bykv.vk.openvk.ouw.ouw.ouw.yu.lh lhVar = this.bs;
            if (lhVar != null) {
                this.ouw = lhVar.th();
            }
        }
        return this.ouw;
    }

    public final boolean jqy() {
        return (this.ksc & 4) != 4 || this.jqy;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0039  */
    /* JADX WARN: Code duplicated, block: B:22:0x0057  */
    /* JADX WARN: Code duplicated, block: B:23:0x005a  */
    /* JADX WARN: Code duplicated, block: B:31:0x0084  */
    /* JADX WARN: Code duplicated, block: B:33:0x00af  */
    /* JADX WARN: Code duplicated, block: B:36:? A[RETURN, SYNTHETIC] */
    public final void ko() {
        String str;
        int i10;
        int i11;
        String str2;
        com.bytedance.sdk.openadsdk.core.lh.ouw ouwVar;
        com.bytedance.sdk.openadsdk.qbp.ouw.ouw.lh lhVar;
        com.bytedance.sdk.openadsdk.qbp.ouw.ouw.lh lhVar2;
        com.bytedance.sdk.openadsdk.core.lh.ouw ouwVar2;
        String str3 = this.f12928pd ? "embeded_ad" : "embeded_ad_landingpage";
        if (this.jae.ey()) {
            i11 = 7;
            str2 = "rewarded_video";
        } else {
            if (!this.jae.rrs()) {
                if (this.jae.jvy()) {
                    i11 = 2;
                    str2 = "banner_ad";
                } else {
                    str = str3;
                    i10 = 1;
                }
                if (this.jae.f12868pd == 4) {
                    this.fvf = com.bytedance.sdk.openadsdk.qbp.ouw.ouw.yu.ouw(this.f12927od, str);
                }
                com.bytedance.sdk.openadsdk.core.lh.ouw ouwVar3 = new com.bytedance.sdk.openadsdk.core.lh.ouw(this.f12927od, this.jae, str, i10);
                this.fak = ouwVar3;
                ouwVar3.ouw(this);
                ouwVar = this.fak;
                ouwVar.fkw = true;
                if (this.f12928pd) {
                    ouwVar.yu = true;
                } else {
                    ouwVar.yu = false;
                    ouwVar.f12718le = true;
                }
                ouwVar.ouw(this.bs);
                this.fak.lh();
                this.fak.ouw(new com.bytedance.sdk.openadsdk.core.lh.vt.ouw() { // from class: com.bytedance.sdk.openadsdk.core.mwh.vt.fkw.1
                    @Override // com.bytedance.sdk.openadsdk.core.lh.vt.ouw
                    public final void ouw(View view, int i12) {
                        le.ouw ouwVar4 = fkw.this.ey;
                        if (ouwVar4 != null) {
                            ouwVar4.ouw(view, i12);
                        }
                    }
                });
                lhVar = this.fvf;
                if (lhVar != null && (ouwVar2 = this.fak) != null) {
                    ouwVar2.ouw(lhVar);
                }
                if (ex()) {
                    com.bytedance.sdk.openadsdk.core.lh.ouw ouwVar4 = new com.bytedance.sdk.openadsdk.core.lh.ouw(this.f12927od, this.jae, str, i10) { // from class: com.bytedance.sdk.openadsdk.core.mwh.vt.fkw.2
                        @Override // com.bytedance.sdk.openadsdk.core.lh.ouw
                        public final boolean ouw() {
                            qbp qbpVar = fkw.this.f12921cd;
                            boolean zOuw = qbpVar != null ? qbpVar.ouw() : false;
                            StringBuilder sb2 = new StringBuilder("isVisible=");
                            sb2.append(zOuw);
                            sb2.append(",mPlayBtn.getVisibility() == VISIBLE->");
                            sb2.append(fkw.this.f12929ra.getVisibility() == 0);
                            ko.lh("ClickCreativeListener", sb2.toString());
                            return zOuw || fkw.this.f12929ra.getVisibility() == 0;
                        }

                        @Override // com.bytedance.sdk.openadsdk.core.lh.ouw
                        public final boolean vt() {
                            View view = fkw.this.ryl;
                            if (view != null && view.getVisibility() == 0) {
                                return true;
                            }
                            View view2 = fkw.this.f12923jg;
                            if (view2 != null && view2.getVisibility() == 0) {
                                return true;
                            }
                            com.bytedance.sdk.openadsdk.core.widget.ouw ouwVar5 = fkw.this.f12924ko;
                            if (ouwVar5 != null && ouwVar5.getVisibility() == 0) {
                                return true;
                            }
                            TextView textView = fkw.this.f12930rn;
                            return textView != null && textView.getVisibility() == 0;
                        }
                    };
                    this.uoy = ouwVar4;
                    ouwVar4.ouw(new com.bytedance.sdk.openadsdk.core.lh.vt.ouw() { // from class: com.bytedance.sdk.openadsdk.core.mwh.vt.fkw.3
                        @Override // com.bytedance.sdk.openadsdk.core.lh.vt.ouw
                        public final void ouw(View view, int i12) {
                            le.ouw ouwVar5 = fkw.this.ey;
                            if (ouwVar5 != null) {
                                ouwVar5.ouw(view, i12);
                            }
                        }
                    });
                    com.bytedance.sdk.openadsdk.core.lh.ouw ouwVar5 = this.uoy;
                    ouwVar5.fkw = true;
                    ouwVar5.yu = this.f12928pd;
                    ouwVar5.ouw(this.bs);
                    this.uoy.lh();
                    lhVar2 = this.fvf;
                    if (lhVar2 != null) {
                        this.uoy.ouw(lhVar2);
                    }
                    this.uoy.ouw(this);
                }
            }
            i11 = 5;
            str2 = "fullscreen_interstitial_ad";
        }
        i10 = i11;
        str = str2;
        if (this.jae.f12868pd == 4) {
            this.fvf = com.bytedance.sdk.openadsdk.qbp.ouw.ouw.yu.ouw(this.f12927od, str);
        }
        com.bytedance.sdk.openadsdk.core.lh.ouw ouwVar6 = new com.bytedance.sdk.openadsdk.core.lh.ouw(this.f12927od, this.jae, str, i10);
        this.fak = ouwVar6;
        ouwVar6.ouw(this);
        ouwVar = this.fak;
        ouwVar.fkw = true;
        if (this.f12928pd) {
            ouwVar.yu = true;
        } else {
            ouwVar.yu = false;
            ouwVar.f12718le = true;
        }
        ouwVar.ouw(this.bs);
        this.fak.lh();
        this.fak.ouw(new com.bytedance.sdk.openadsdk.core.lh.vt.ouw() { // from class: com.bytedance.sdk.openadsdk.core.mwh.vt.fkw.1
            @Override // com.bytedance.sdk.openadsdk.core.lh.vt.ouw
            public final void ouw(View view, int i12) {
                le.ouw ouwVar7 = fkw.this.ey;
                if (ouwVar7 != null) {
                    ouwVar7.ouw(view, i12);
                }
            }
        });
        lhVar = this.fvf;
        if (lhVar != null) {
            ouwVar2.ouw(lhVar);
        }
        if (ex()) {
            com.bytedance.sdk.openadsdk.core.lh.ouw ouwVar7 = new com.bytedance.sdk.openadsdk.core.lh.ouw(this.f12927od, this.jae, str, i10) { // from class: com.bytedance.sdk.openadsdk.core.mwh.vt.fkw.2
                @Override // com.bytedance.sdk.openadsdk.core.lh.ouw
                public final boolean ouw() {
                    qbp qbpVar = fkw.this.f12921cd;
                    boolean zOuw = qbpVar != null ? qbpVar.ouw() : false;
                    StringBuilder sb2 = new StringBuilder("isVisible=");
                    sb2.append(zOuw);
                    sb2.append(",mPlayBtn.getVisibility() == VISIBLE->");
                    sb2.append(fkw.this.f12929ra.getVisibility() == 0);
                    ko.lh("ClickCreativeListener", sb2.toString());
                    return zOuw || fkw.this.f12929ra.getVisibility() == 0;
                }

                @Override // com.bytedance.sdk.openadsdk.core.lh.ouw
                public final boolean vt() {
                    View view = fkw.this.ryl;
                    if (view != null && view.getVisibility() == 0) {
                        return true;
                    }
                    View view2 = fkw.this.f12923jg;
                    if (view2 != null && view2.getVisibility() == 0) {
                        return true;
                    }
                    com.bytedance.sdk.openadsdk.core.widget.ouw ouwVar8 = fkw.this.f12924ko;
                    if (ouwVar8 != null && ouwVar8.getVisibility() == 0) {
                        return true;
                    }
                    TextView textView = fkw.this.f12930rn;
                    return textView != null && textView.getVisibility() == 0;
                }
            };
            this.uoy = ouwVar7;
            ouwVar7.ouw(new com.bytedance.sdk.openadsdk.core.lh.vt.ouw() { // from class: com.bytedance.sdk.openadsdk.core.mwh.vt.fkw.3
                @Override // com.bytedance.sdk.openadsdk.core.lh.vt.ouw
                public final void ouw(View view, int i12) {
                    le.ouw ouwVar8 = fkw.this.ey;
                    if (ouwVar8 != null) {
                        ouwVar8.ouw(view, i12);
                    }
                }
            });
            com.bytedance.sdk.openadsdk.core.lh.ouw ouwVar8 = this.uoy;
            ouwVar8.fkw = true;
            ouwVar8.yu = this.f12928pd;
            ouwVar8.ouw(this.bs);
            this.uoy.lh();
            lhVar2 = this.fvf;
            if (lhVar2 != null) {
                this.uoy.ouw(lhVar2);
            }
            this.uoy.ouw(this);
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0031 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:17:0x0033  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v5, types: [android.view.ViewGroup, android.widget.RelativeLayout] */
    /* JADX WARN: Type inference failed for: r6v33 */
    /* JADX WARN: Type inference failed for: r6v34 */
    /* JADX WARN: Type inference failed for: r6v4, types: [android.view.View, com.bykv.vk.openvk.ouw.ouw.ouw.le.vt] */
    public void ouw(Context context, View view) {
        ?? r10;
        long jCurrentTimeMillis = System.currentTimeMillis();
        vpp vppVar = this.jae;
        if (vppVar != null) {
            if ((vppVar.uoy() == 5) || this.jae.jvy()) {
                if (cf.vt().pno.ouw("bus_con_video_keep_screen_on", 1) == 1) {
                    if (view != null) {
                        view.setKeepScreenOn(true);
                    }
                }
            } else if (view != null) {
                view.setKeepScreenOn(true);
            }
        } else if (view != null) {
            view.setKeepScreenOn(true);
        }
        com.bykv.vk.openvk.ouw.ouw.ouw.yu.lh lhVar = this.bs;
        if (lhVar == null || !lhVar.tc()) {
            com.bykv.vk.openvk.ouw.ouw.ouw.le.lh lhVar2 = new com.bykv.vk.openvk.ouw.ouw.ouw.le.lh(this.f12927od);
            ko.vt("NewLiveViewLayout", "use SurfaceView......");
            r10 = lhVar2;
        } else {
            com.bykv.vk.openvk.ouw.ouw.ouw.le.yu yuVar = new com.bykv.vk.openvk.ouw.ouw.ouw.le.yu(this.f12927od);
            ko.vt("NewLiveViewLayout", "use TextureView......");
            r10 = yuVar;
        }
        if (view instanceof RelativeLayout) {
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
            layoutParams.addRule(13);
            ((RelativeLayout) view).addView(r10, 0, layoutParams);
        }
        osn.ouw((View) r10, 8);
        this.f12925le = r10;
        this.f12929ra = (ImageView) view.findViewById(rn.f13417ki);
        this.pno = view.findViewById(rn.f13412fn);
        this.bly = view.findViewById(rn.ehk);
        this.tlj = (ImageView) view.findViewById(rn.byv);
        this.f12922cf = view.findViewById(rn.f13423ln);
        ko.vt("useTime", "NativeVideoLayout**findViews use time :" + (System.currentTimeMillis() - jCurrentTimeMillis));
    }

    public final void qbp() {
        try {
            osn.ouw(this.ryl, 8);
            osn.ouw((View) this.mwh, 8);
            osn.ouw(this.f12923jg, 8);
            osn.ouw((View) this.f12924ko, 8);
            osn.ouw((View) this.f12930rn, 8);
            osn.ouw((View) this.zih, 8);
            osn.ouw((View) this.f12933vm, 8);
        } catch (Exception unused) {
        }
    }

    public final void rn() {
        qbp qbpVar = this.f12921cd;
        if (qbpVar != null) {
            qbpVar.ouw(false);
        }
    }

    @TargetApi(14)
    public final void th() {
        osn.ouw((View) this.fkw, 0);
        com.bykv.vk.openvk.ouw.ouw.ouw.le.vt vtVar = this.f12925le;
        if (vtVar != null) {
            osn.ouw(vtVar.getView(), 0);
        }
    }

    public void tlj() {
        vpp vppVar;
        com.bykv.vk.openvk.ouw.ouw.ouw.lh.vt vtVar;
        osn.le(this.pno);
        osn.le(this.bly);
        ImageView imageView = this.tlj;
        if (imageView != null && (vppVar = this.jae) != null && (vtVar = vppVar.f12874sd) != null && vtVar.f10457le != null) {
            osn.le(imageView);
            com.bytedance.sdk.openadsdk.th.vt.ouw();
            vpp vppVar2 = this.jae;
            com.bykv.vk.openvk.ouw.ouw.ouw.lh.vt vtVar2 = vppVar2.f12874sd;
            com.bytedance.sdk.openadsdk.th.vt.ouw(vtVar2.f10457le, vtVar2.vt, vtVar2.ouw, this.tlj, vppVar2);
        }
        if (this.f12929ra.getVisibility() == 0) {
            osn.ouw((View) this.f12929ra, 8);
        }
    }

    public final void vm() {
        osn.le(this.pno);
        osn.le(this.bly);
        if (this.f12929ra.getVisibility() == 0) {
            osn.ouw((View) this.f12929ra, 8);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.widget.th.ouw
    public final boolean vpp() {
        qbp qbpVar = this.f12921cd;
        return qbpVar != null && qbpVar.ouw();
    }

    public final boolean zih() {
        if (this.uq != null) {
            return true;
        }
        ko.fkw("NewLiveViewLayout", "callback is null");
        return false;
    }

    public final void zin() {
        ImageView imageView = this.mwh;
        if (imageView != null) {
            imageView.setImageBitmap(null);
        }
        com.bytedance.sdk.openadsdk.core.widget.ouw ouwVar = this.f12924ko;
        if (ouwVar != null) {
            ouwVar.setImageBitmap(null);
        }
    }

    public final void le(boolean z10) {
        ImageView imageView = this.f12929ra;
        if (imageView != null) {
            if (z10) {
                imageView.setImageDrawable(com.bytedance.sdk.openadsdk.utils.cf.ouw(this.f12927od, "tt_play_movebar_textpage"));
            } else {
                imageView.setImageDrawable(com.bytedance.sdk.openadsdk.utils.cf.ouw(this.f12927od, "tt_stop_movebar_textpage"));
            }
        }
    }

    @Override // com.bykv.vk.openvk.ouw.ouw.ouw.yu.vt
    public final void vt() {
        osn.fkw(this.pno);
        osn.fkw(this.bly);
        ImageView imageView = this.tlj;
        if (imageView != null) {
            osn.fkw(imageView);
        }
    }

    private void lh(int i10, int i11) {
        ViewGroup.LayoutParams layoutParams = this.fkw.getLayoutParams();
        if (layoutParams == null) {
            return;
        }
        if (i10 == -1 || i10 == -2 || i10 > 0) {
            layoutParams.width = i10;
        }
        if (i11 == -1 || i11 == -2 || i11 > 0) {
            layoutParams.height = i11;
        }
        this.fkw.setLayoutParams(layoutParams);
    }

    public final void yu(int i10) {
        this.f12931tc = i10;
        osn.ouw((View) this.fkw, i10);
    }

    @Override // com.bykv.vk.openvk.ouw.ouw.ouw.le.ouw
    public final void vt(SurfaceHolder surfaceHolder) {
        if (surfaceHolder != this.f12925le.getHolder()) {
            return;
        }
        zih();
    }

    public final void lh(ViewGroup viewGroup) {
        if (viewGroup == null) {
            return;
        }
        if (this.fkw.getParent() == null) {
            viewGroup.addView(this.fkw);
        }
        yu(0);
    }

    public void vt(boolean z10) {
        osn.ouw((View) this.f12929ra, (!z10 || this.pno.getVisibility() == 0) ? 8 : 0);
    }

    private int fkw(int i10) {
        if (this.zin <= 0 || this.vpp <= 0) {
            return 0;
        }
        int iOuw = osn.ouw(this.f12927od, 228.0f);
        int iOuw2 = osn.ouw(this.f12927od, 160.0f);
        int i11 = (int) (this.vpp * ((i10 * 1.0f) / this.zin));
        if (i11 > iOuw) {
            return iOuw;
        }
        return i11 < iOuw2 ? iOuw2 : i11;
    }

    @Override // com.bykv.vk.openvk.ouw.ouw.ouw.yu.vt
    public final View lh() {
        return this.fkw;
    }

    @Override // com.bykv.vk.openvk.ouw.ouw.ouw.le.ouw
    public final void lh(SurfaceHolder surfaceHolder) {
        if (surfaceHolder != this.f12925le.getHolder()) {
            return;
        }
        this.ex = false;
        if (zih()) {
            this.uq.ra();
        }
    }

    @Override // com.bykv.vk.openvk.ouw.ouw.ouw.le.ouw
    public final void fkw() {
        com.bykv.vk.openvk.ouw.ouw.ouw.yu.lh lhVar = this.bs;
        if (lhVar != null) {
            lhVar.tlj();
        }
    }

    public void lh(boolean z10) {
        osn.ouw((View) this.f12929ra, 8);
    }

    public fkw(Context context, ViewGroup viewGroup, vpp vppVar, com.bykv.vk.openvk.ouw.ouw.ouw.yu.lh lhVar) {
        this(context, viewGroup, vppVar, lhVar, true);
    }

    public final void ouw(View view, Context context) {
        View view2;
        if (view == null || context == null || (view2 = this.f12922cf) == null || view2.getParent() == null || this.ryl != null) {
            return;
        }
        this.ryl = this.f12922cf;
        this.mwh = (ImageView) view.findViewById(rn.smu);
        this.f12923jg = view.findViewById(rn.qni);
        this.f12924ko = (com.bytedance.sdk.openadsdk.core.widget.ouw) view.findViewById(rn.rrs);
        this.f12930rn = (TextView) view.findViewById(rn.jvy);
        this.zih = (TextView) view.findViewById(rn.fqk);
        this.f12933vm = (TextView) view.findViewById(rn.hun);
    }

    public final void ouw(com.bykv.vk.openvk.ouw.ouw.ouw.yu.ouw ouwVar) {
        this.uq = (ouw) ouwVar;
        tc();
    }

    public final void ouw(int i10, int i11) {
        if (i10 == -1) {
            i10 = osn.yu(this.f12927od);
        }
        if (i10 <= 0) {
            return;
        }
        this.f12932th = i10;
        if (!this.jqy && !ryl() && (this.ksc & 8) != 8) {
            this.qbp = fkw(i10);
        } else {
            this.qbp = i11;
        }
        lh(this.f12932th, this.qbp);
    }

    public void ouw(int i10) {
        ko.lh(VastTagName.PROGRESS, "setSeekProgress-percent=".concat(String.valueOf(i10)));
    }

    @Override // com.bykv.vk.openvk.ouw.ouw.ouw.yu.vt
    public void ouw() {
        lh(this.jqy);
        qbp();
    }

    @Override // com.bykv.vk.openvk.ouw.ouw.ouw.yu.vt
    public final void ouw(boolean z10) {
        this.osn = z10;
    }

    /* JADX WARN: Code duplicated, block: B:92:0x01ad  */
    @Override // com.bykv.vk.openvk.ouw.ouw.ouw.yu.vt
    @SuppressLint({"ClickableViewAccessibility"})
    public void ouw(final vpp vppVar) {
        String str;
        vpp vppVar2;
        com.bytedance.sdk.openadsdk.core.model.zih zihVar;
        com.bytedance.sdk.openadsdk.core.ryl.ouw ouwVar;
        final com.bytedance.sdk.openadsdk.core.ryl.vt vtVar;
        com.bytedance.sdk.openadsdk.core.widget.ouw ouwVar2;
        com.bytedance.sdk.openadsdk.core.ryl.vt vtVar2;
        vpp vppVar3;
        com.bykv.vk.openvk.ouw.ouw.ouw.lh.vt vtVar3;
        if (vppVar == null) {
            return;
        }
        lh(this.jqy);
        ouw(this.fkw, zih.ouw());
        View view = this.ryl;
        if (view != null) {
            osn.ouw(view, 0);
        }
        ImageView imageView = this.mwh;
        if (imageView != null) {
            osn.ouw((View) imageView, 0);
        }
        osn.ouw(this.f12923jg, 0);
        if (this.mwh != null && (vppVar3 = this.jae) != null && (vtVar3 = vppVar3.f12874sd) != null && vtVar3.f10457le != null) {
            com.bytedance.sdk.openadsdk.th.vt.ouw();
            com.bykv.vk.openvk.ouw.ouw.ouw.lh.vt vtVar4 = this.jae.f12874sd;
            com.bytedance.sdk.openadsdk.th.vt.ouw(vtVar4.f10457le, vtVar4.vt, vtVar4.ouw, this.mwh, vppVar);
        }
        if (!TextUtils.isEmpty(vppVar.f12883vh)) {
            str = vppVar.f12883vh;
        } else if (!TextUtils.isEmpty(vppVar.fqk)) {
            str = vppVar.fqk;
        } else {
            str = !TextUtils.isEmpty(vppVar.hun) ? vppVar.hun : "";
        }
        com.bytedance.sdk.openadsdk.core.widget.ouw ouwVar3 = this.f12924ko;
        if (ouwVar3 != null && (vppVar2 = this.jae) != null && (zihVar = vppVar2.fak) != null && zihVar.ouw != null) {
            osn.ouw((View) ouwVar3, 0);
            osn.ouw((View) this.f12930rn, 4);
            vpp vppVar4 = this.jae;
            if (vppVar4 != null && vppVar4.cd()) {
                com.bytedance.sdk.openadsdk.core.model.zih zihVar2 = this.jae.fak;
                com.bytedance.sdk.openadsdk.tlj.yu.ouw.ouw(com.bytedance.sdk.openadsdk.tlj.yu.ouw.vt.ouw(zihVar2.ouw).ouw(zihVar2.vt).vt(zihVar2.f12895lh).fkw(osn.le(zih.ouw())).yu(osn.yu(zih.ouw())).ouw(zihVar2.f12894le)).lh(1).vt(new com.bytedance.sdk.openadsdk.tlj.vt(vppVar, this.jae.fak.ouw, new com.bytedance.sdk.component.fkw.rn() { // from class: com.bytedance.sdk.openadsdk.core.mwh.vt.fkw.5
                    @Override // com.bytedance.sdk.component.fkw.rn
                    public final void ouw(com.bytedance.sdk.component.fkw.cf cfVar) {
                        Object objVt = cfVar.vt();
                        if (objVt != null) {
                            if (objVt instanceof Bitmap) {
                                com.bytedance.sdk.openadsdk.core.widget.ouw ouwVar4 = fkw.this.f12924ko;
                                if (ouwVar4 != null) {
                                    ouwVar4.setImageBitmap((Bitmap) objVt);
                                }
                            } else if ((objVt instanceof Drawable) && fkw.this.f12924ko != null) {
                                if (Build.VERSION.SDK_INT >= 28 && (objVt instanceof AnimatedImageDrawable)) {
                                    ((AnimatedImageDrawable) objVt).start();
                                }
                                fkw.this.f12924ko.setImageDrawable((Drawable) objVt);
                            }
                            com.bytedance.sdk.openadsdk.yu.lh.vt(fkw.this.jae, fkw.this.jae != null ? uoy.lh(vppVar.uoy()) : null, "load_vast_icon_success", (JSONObject) null);
                        }
                    }

                    @Override // com.bytedance.sdk.component.fkw.rn
                    public final void ouw(final int i10, final String str2, Throwable th2) {
                        final fkw fkwVar = fkw.this;
                        final vpp vppVar5 = vppVar;
                        com.bytedance.sdk.openadsdk.yu.lh.ouw(new pno("load_vast_icon_fail") { // from class: com.bytedance.sdk.openadsdk.core.mwh.vt.fkw.7
                            @Override // java.lang.Runnable
                            public final void run() {
                                JSONObject jSONObject = new JSONObject();
                                try {
                                    jSONObject.put("error_code", i10);
                                    jSONObject.put(UnifiedMediationParams.KEY_DESCRIPTION, i10 + StringUtils.PROCESS_POSTFIX_DELIMITER + str2);
                                    jSONObject.put("url", fkw.this.jae.fak.ouw);
                                } catch (Throwable unused) {
                                }
                                com.bytedance.sdk.openadsdk.yu.lh.vt(fkw.this.jae, fkw.this.jae != null ? uoy.lh(vppVar5.uoy()) : null, "load_vast_icon_fail", jSONObject);
                            }
                        });
                    }
                }));
                com.bytedance.sdk.openadsdk.core.ryl.ouw ouwVar4 = this.jae.cu;
                if (ouwVar4 != null && (vtVar2 = ouwVar4.vt) != null) {
                    vtVar2.vt(0L);
                }
            } else {
                com.bytedance.sdk.openadsdk.th.vt.ouw();
                com.bytedance.sdk.openadsdk.th.vt.ouw(this.jae.fak, this.f12924ko, vppVar);
            }
            vpp vppVar5 = this.jae;
            if (vppVar5 != null && vppVar5.cd()) {
                try {
                    this.f12924ko.setTag(570425345, "VAST_ICON");
                } catch (Throwable unused) {
                }
            }
            vpp vppVar6 = this.jae;
            if (vppVar6 != null && (ouwVar = vppVar6.cu) != null && (vtVar = ouwVar.vt) != null && (ouwVar2 = this.f12924ko) != null) {
                ouwVar2.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.mwh.vt.fkw.6
                    @Override // java.lang.Runnable
                    public final void run() {
                        com.bytedance.sdk.openadsdk.core.ryl.vt vtVar5;
                        com.bytedance.sdk.openadsdk.core.widget.ouw ouwVar5 = fkw.this.f12924ko;
                        if (ouwVar5 == null || !ouwVar5.isShown() || (vtVar5 = vtVar) == null) {
                            return;
                        }
                        vtVar5.vt(fkw.this.getVideoProgress());
                    }
                });
            }
            if (ex()) {
                this.f12924ko.setOnClickListener(this.uoy);
                this.f12924ko.setOnTouchListener(this.uoy);
            } else {
                this.f12924ko.setOnClickListener(this.fak);
                this.f12924ko.setOnTouchListener(this.fak);
            }
        } else if (!TextUtils.isEmpty(str)) {
            osn.ouw((View) this.f12924ko, 4);
            osn.ouw((View) this.f12930rn, 0);
            TextView textView = this.f12930rn;
            if (textView != null) {
                textView.setText(str.substring(0, 1));
                if (ex()) {
                    this.f12930rn.setOnClickListener(this.uoy);
                    this.f12930rn.setOnTouchListener(this.uoy);
                } else {
                    this.f12930rn.setOnClickListener(this.fak);
                    this.f12930rn.setOnTouchListener(this.fak);
                }
            }
        }
        if (this.zih != null && !TextUtils.isEmpty(str)) {
            this.zih.setText(str);
            this.zih.setTag(570425345, "VAST_TITLE");
        }
        osn.ouw((View) this.zih, 0);
        osn.ouw((View) this.f12933vm, 0);
        String strVpp = vppVar.vpp();
        if (TextUtils.isEmpty(strVpp)) {
            int i10 = vppVar.f12868pd;
            if (i10 == 2 || i10 == 3) {
                strVpp = com.bytedance.sdk.component.utils.vpp.ouw(this.f12927od, "tt_video_mobile_go_detail");
            } else if (i10 == 4) {
                strVpp = com.bytedance.sdk.component.utils.vpp.ouw(this.f12927od, "tt_video_download_apk");
            } else if (i10 == 5) {
                strVpp = com.bytedance.sdk.component.utils.vpp.ouw(this.f12927od, "tt_video_dial_phone");
            } else if (i10 != 8) {
                strVpp = com.bytedance.sdk.component.utils.vpp.ouw(this.f12927od, "tt_video_mobile_go_detail");
            } else {
                strVpp = com.bytedance.sdk.component.utils.vpp.ouw(this.f12927od, "tt_video_mobile_go_detail");
            }
        }
        TextView textView2 = this.f12933vm;
        if (textView2 != null) {
            textView2.setText(strVpp);
            this.f12933vm.setOnClickListener(this.fak);
            this.f12933vm.setOnTouchListener(this.fak);
        }
        if (this.osn) {
            return;
        }
        osn.ouw(this.f12923jg, 4);
    }

    @Override // com.bykv.vk.openvk.ouw.ouw.ouw.le.ouw
    public final void ouw(SurfaceHolder surfaceHolder) {
        if (surfaceHolder != this.f12925le.getHolder()) {
            return;
        }
        this.ex = true;
        if (zih()) {
            this.uq.ouw(surfaceHolder);
        }
    }

    @Override // com.bykv.vk.openvk.ouw.ouw.ouw.le.ouw
    public final void ouw(SurfaceTexture surfaceTexture) {
        this.ex = true;
        if (zih()) {
            this.uq.ouw(surfaceTexture);
        }
    }

    @Override // com.bykv.vk.openvk.ouw.ouw.ouw.yu.vt
    public final void ouw(Drawable drawable) {
        ViewGroup viewGroup = this.fkw;
        if (viewGroup != null) {
            viewGroup.setBackgroundDrawable(drawable);
        }
    }
}
