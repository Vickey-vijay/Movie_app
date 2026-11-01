package com.bytedance.sdk.openadsdk.core.mwh.yu;

import android.content.Context;
import android.text.TextUtils;
import android.view.SurfaceView;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import com.bytedance.sdk.component.utils.bly;
import com.bytedance.sdk.component.utils.ko;
import com.bytedance.sdk.component.utils.qbp;
import com.bytedance.sdk.openadsdk.BuildConfig;
import com.bytedance.sdk.openadsdk.core.model.th;
import com.bytedance.sdk.openadsdk.core.model.vpp;
import com.bytedance.sdk.openadsdk.core.ryl.le;
import com.bytedance.sdk.openadsdk.core.ryl.yu;
import com.bytedance.sdk.openadsdk.core.settings.cf;
import com.bytedance.sdk.openadsdk.core.zih;
import com.bytedance.sdk.openadsdk.ko.jg;
import com.bytedance.sdk.openadsdk.tc.vt.fkw;
import com.bytedance.sdk.openadsdk.utils.ey;
import com.bytedance.sdk.openadsdk.utils.osn;
import com.bytedance.sdk.openadsdk.utils.rn;
import com.bytedance.sdk.openadsdk.utils.uoy;
import com.bytedance.sdk.openadsdk.yu.ra;
import com.iab.omid.library.bytedance2.adsession.FriendlyObstructionPurpose;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.bidmachine.iab.vast.tags.VastAttributes;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes5.dex */
public class ouw extends com.bytedance.sdk.openadsdk.core.mwh.ouw.ouw {

    /* JADX INFO: renamed from: cj, reason: collision with root package name */
    public final AtomicBoolean f12968cj;
    public long fqk;
    public boolean hun;
    public long jvy;

    /* JADX INFO: renamed from: kn, reason: collision with root package name */
    public final Runnable f12969kn;
    public long lso;
    public final lh.vt pv;
    public final ra rrs;

    /* JADX INFO: renamed from: ub, reason: collision with root package name */
    public boolean f12970ub;
    public InterfaceC0131ouw ucs;
    public final int ux;
    public boolean wp;

    /* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.core.mwh.yu.ouw$1, reason: invalid class name */
    public class AnonymousClass1 implements lh.vt {
        private boolean vt = true;

        @Override // com.bykv.vk.openvk.ouw.ouw.ouw.ouw.InterfaceC0060ouw
        public final void ouw(com.bykv.vk.openvk.ouw.ouw.ouw.ouw ouwVar) {
            yu yuVar;
            if (ouw.this.f12968cj.compareAndSet(false, true)) {
                ko.lh(ouw.this.ouw, "onCompletion: ");
                ouw.this.f12912lh.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.mwh.yu.ouw.1.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        le leVar = ouw.this.f12907cd;
                        if (leVar != null) {
                            try {
                                leVar.ouw(9);
                            } catch (Exception unused) {
                            }
                        }
                        ouw ouwVar2 = ouw.this;
                        if (ouwVar2.f12915ra != null) {
                            ouwVar2.f12912lh.removeCallbacks(ouwVar2.f12969kn);
                            ouwVar2.f12915ra.vt();
                            ouwVar2.fqk = System.currentTimeMillis() - ouwVar2.jvy;
                            if (!ouwVar2.hun) {
                                ouwVar2.hun = true;
                                long j10 = ouwVar2.bs;
                                ouwVar2.vt(j10, j10);
                                long j11 = ouwVar2.bs;
                                ouwVar2.bly = j11;
                                ouwVar2.tlj = j11;
                                ouwVar2.vt(ouwVar2.rrs);
                            }
                            com.bykv.vk.openvk.ouw.ouw.ouw.yu.lh.ouw ouwVar3 = ouwVar2.f12913od;
                            if (ouwVar3 != null) {
                                ouwVar3.ouw(ouwVar2.fqk, com.bykv.vk.openvk.ouw.ouw.vt.yu.ouw.ouw(ouwVar2.bly, ouwVar2.bs));
                            }
                            ouwVar2.f12909jg = true;
                        }
                    }
                });
                com.bytedance.sdk.openadsdk.core.model.yu yuVarSd = ouw.this.pno.sd();
                if (yuVarSd != null && (yuVar = yuVarSd.ouw) != null) {
                    long j10 = ouw.this.bly;
                    yuVar.lh(j10);
                    yuVar.yu(j10);
                }
                fkw.ouw(ouw.this.pno, 5);
                com.bytedance.sdk.openadsdk.tc.ouw.lh.ouw(ouw.this.pno, 5);
                InterfaceC0131ouw interfaceC0131ouw = ouw.this.ucs;
                if (interfaceC0131ouw != null) {
                    interfaceC0131ouw.ouw(3);
                }
            }
        }

        @Override // com.bykv.vk.openvk.ouw.ouw.ouw.ouw.InterfaceC0060ouw
        public final void vt(com.bykv.vk.openvk.ouw.ouw.ouw.ouw ouwVar, int i10) {
        }

        public AnonymousClass1() {
        }

        @Override // com.bykv.vk.openvk.ouw.ouw.ouw.ouw.InterfaceC0060ouw
        public final void fkw(com.bykv.vk.openvk.ouw.ouw.ouw.ouw ouwVar) {
            fkw.ouw(ouw.this.pno, 0);
            le leVar = ouw.this.f12907cd;
            if (leVar != null) {
                leVar.ouw(1);
            }
            InterfaceC0131ouw interfaceC0131ouw = ouw.this.ucs;
            if (interfaceC0131ouw != null) {
                interfaceC0131ouw.ouw(1);
            }
        }

        @Override // com.bykv.vk.openvk.ouw.ouw.ouw.ouw.InterfaceC0060ouw
        public final void lh(com.bykv.vk.openvk.ouw.ouw.ouw.ouw ouwVar) {
            ko.lh(ouw.this.ouw, "IVideoPlayerCallback onRelease: ");
        }

        @Override // com.bykv.vk.openvk.ouw.ouw.ouw.ouw.InterfaceC0060ouw
        public final void vt(com.bykv.vk.openvk.ouw.ouw.ouw.ouw ouwVar) {
            ko.lh(ouw.this.ouw, "onPrepared: ");
            ouw ouwVar2 = ouw.this;
            ouwVar2.f12912lh.removeCallbacks(ouwVar2.f12969kn);
            ouw.this.f12912lh.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.mwh.yu.ouw.1.4
                @Override // java.lang.Runnable
                public final void run() {
                    com.bytedance.sdk.openadsdk.core.mwh.vt.fkw fkwVar = ouw.this.f12915ra;
                    if (fkwVar != null) {
                        fkwVar.vt();
                    }
                }
            });
        }

        @Override // com.bykv.vk.openvk.ouw.ouw.ouw.ouw.InterfaceC0060ouw
        public final void yu(com.bykv.vk.openvk.ouw.ouw.ouw.ouw ouwVar) {
            yu yuVar;
            com.bytedance.sdk.openadsdk.core.model.yu yuVarSd = ouw.this.pno.sd();
            if (yuVarSd != null && (yuVar = yuVarSd.ouw) != null) {
                yuVar.ouw(ouw.this.bly);
            }
            fkw.ouw(ouw.this.pno, 3);
            le leVar = ouw.this.f12907cd;
            if (leVar != null) {
                leVar.ouw(0);
            }
            InterfaceC0131ouw interfaceC0131ouw = ouw.this.ucs;
            if (interfaceC0131ouw != null) {
                interfaceC0131ouw.ouw(2);
            }
        }

        @Override // com.bykv.vk.openvk.ouw.ouw.ouw.ouw.InterfaceC0060ouw
        public final void ouw(com.bykv.vk.openvk.ouw.ouw.ouw.ouw ouwVar, long j10) {
            ko.lh(ouw.this.ouw, "onRenderStart: ");
            if (!ouw.this.qbp.get()) {
                ouw.this.bs();
            }
            ouw ouwVar2 = ouw.this;
            ouwVar2.f12917tc = false;
            ouwVar2.f12912lh.removeCallbacks(ouwVar2.f12969kn);
            ouw.this.f12912lh.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.mwh.yu.ouw.1.3
                @Override // java.lang.Runnable
                public final void run() {
                    com.bytedance.sdk.openadsdk.core.mwh.vt.fkw fkwVar = ouw.this.f12915ra;
                    if (fkwVar != null) {
                        fkwVar.vt();
                    }
                }
            });
            if (!ouw.this.qbp.get()) {
                ouw ouwVar3 = ouw.this;
                ouwVar3.lso = j10;
                ouwVar3.ouw(ouwVar3.rrs);
                ouw.this.osn();
            }
            le leVar = ouw.this.f12907cd;
            if (leVar != null) {
                leVar.vt();
            }
            fkw.ouw(ouw.this.pno, 0);
            InterfaceC0131ouw interfaceC0131ouw = ouw.this.ucs;
            if (interfaceC0131ouw != null) {
                interfaceC0131ouw.ouw(1);
            }
        }

        @Override // com.bykv.vk.openvk.ouw.ouw.ouw.ouw.InterfaceC0060ouw
        public final void ouw(com.bykv.vk.openvk.ouw.ouw.ouw.ouw ouwVar, com.bykv.vk.openvk.ouw.ouw.ouw.lh.ouw ouwVar2) {
            yu yuVar;
            ko.fkw(ouw.this.ouw, "onError: " + ouwVar2.ouw + StringUtils.COMMA + ouwVar2.vt + StringUtils.COMMA + ouwVar2.f10453lh);
            if (vpp.le(ouw.this.pno)) {
                com.bytedance.sdk.openadsdk.vm.lh.lh(new com.bytedance.sdk.openadsdk.vm.yu() { // from class: com.bytedance.sdk.openadsdk.core.mwh.yu.ouw.1.5
                    @Override // com.bytedance.sdk.openadsdk.vm.yu
                    public final com.bytedance.sdk.openadsdk.vm.vt.ouw ouw() {
                        com.bytedance.sdk.openadsdk.vm.vt.ouw ouwVar3 = new com.bytedance.sdk.openadsdk.vm.vt.ouw();
                        try {
                            ouwVar3.f13464lh = "video_player";
                            ouwVar3.pno = uoy.ouw(ouw.this.pno);
                            ouwVar3.vt = BuildConfig.VERSION_NAME;
                        } catch (Throwable unused) {
                        }
                        return ouwVar3;
                    }
                });
            }
            ouw ouwVar3 = ouw.this;
            ouwVar3.f12912lh.removeCallbacks(ouwVar3.f12969kn);
            ouw.this.f12912lh.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.mwh.yu.ouw.1.6
                @Override // java.lang.Runnable
                public final void run() {
                    com.bytedance.sdk.openadsdk.core.mwh.vt.fkw fkwVar = ouw.this.f12915ra;
                    if (fkwVar != null) {
                        fkwVar.vt();
                    }
                    ouw ouwVar4 = ouw.this;
                    com.bykv.vk.openvk.ouw.ouw.ouw.yu.lh.ouw ouwVar5 = ouwVar4.f12913od;
                    if (ouwVar5 != null) {
                        ouwVar5.vt(ouwVar4.fqk, com.bykv.vk.openvk.ouw.ouw.vt.yu.ouw.ouw(ouwVar4.bly, ouwVar4.bs));
                    }
                }
            });
            ouw.this.ouw(ouwVar2);
            fkw.ouw(ouw.this.pno, 6);
            com.bytedance.sdk.openadsdk.tc.ouw.lh.vt(ouw.this.pno);
            le leVar = ouw.this.f12907cd;
            if (leVar != null) {
                leVar.ouw(14);
            }
            InterfaceC0131ouw interfaceC0131ouw = ouw.this.ucs;
            if (interfaceC0131ouw != null) {
                interfaceC0131ouw.ouw(4);
            }
            com.bytedance.sdk.openadsdk.core.model.yu yuVarSd = ouw.this.pno.sd();
            if (yuVarSd == null || (yuVar = yuVarSd.ouw) == null) {
                return;
            }
            yuVar.ouw(com.bytedance.sdk.openadsdk.core.ryl.ouw.ouw.GENERAL_LINEAR_AD_ERROR);
        }

        @Override // com.bykv.vk.openvk.ouw.ouw.ouw.ouw.InterfaceC0060ouw
        public final void ouw(com.bykv.vk.openvk.ouw.ouw.ouw.ouw ouwVar, boolean z10) {
            ko.lh(ouw.this.ouw, "onSeekCompletion: ".concat(String.valueOf(z10)));
            ouw ouwVar2 = ouw.this;
            ouwVar2.f12912lh.removeCallbacks(ouwVar2.f12969kn);
            ouw.this.f12912lh.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.mwh.yu.ouw.1.7
                @Override // java.lang.Runnable
                public final void run() {
                    com.bytedance.sdk.openadsdk.core.mwh.vt.fkw fkwVar = ouw.this.f12915ra;
                    if (fkwVar != null) {
                        fkwVar.vt();
                    }
                }
            });
        }

        @Override // com.bykv.vk.openvk.ouw.ouw.ouw.ouw.InterfaceC0060ouw
        public final void ouw(com.bykv.vk.openvk.ouw.ouw.ouw.ouw ouwVar, int i10, int i11) {
            ko.lh(ouw.this.ouw, "IVideoPlayerCallback onVideoSizeChanged: " + i10 + VastAttributes.HORIZONTAL_POSITION + i11);
            bly.ouw().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.mwh.yu.ouw.1.8
                @Override // java.lang.Runnable
                public final void run() {
                    lh lhVar = ouw.this.f12911le;
                    if (lhVar == null) {
                        return;
                    }
                    try {
                        final float fYu = lhVar.yu();
                        final float fFkw = ouw.this.f12911le.fkw();
                        if (fYu == 0.0f || fFkw == 0.0f) {
                            return;
                        }
                        ouw.this.f12912lh.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.mwh.yu.ouw.1.8.1
                            /* JADX WARN: Code duplicated, block: B:68:0x0191  */
                            @Override // java.lang.Runnable
                            public final void run() {
                                ViewGroup viewGroup;
                                boolean z10;
                                if (!(ouw.this.pno.ex() == 100.0f)) {
                                    ouw ouwVar2 = ouw.this;
                                    float f10 = fYu;
                                    float f11 = fFkw;
                                    try {
                                        if (ouwVar2.fqk() != null && ouwVar2.f12911le != null && (viewGroup = ouwVar2.ksc) != null) {
                                            float width = viewGroup.getWidth();
                                            float f12 = f10 / (width * 1.0f);
                                            float height = ouwVar2.ksc.getHeight();
                                            if (f12 <= f11 / (1.0f * height)) {
                                                width = f10 * (height / f11);
                                            } else {
                                                height = f11 * (width / f10);
                                            }
                                            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams((int) width, (int) height);
                                            layoutParams.addRule(13);
                                            if (ouwVar2.fqk() instanceof TextureView) {
                                                ((TextureView) ouwVar2.fqk()).setLayoutParams(layoutParams);
                                                return;
                                            } else {
                                                if (ouwVar2.fqk() instanceof SurfaceView) {
                                                    ((SurfaceView) ouwVar2.fqk()).setLayoutParams(layoutParams);
                                                    return;
                                                }
                                                return;
                                            }
                                        }
                                        return;
                                    } catch (Throwable th2) {
                                        qbp.ouw(ouwVar2.ouw, "changeVideoSizeSupportInteraction error", th2);
                                        return;
                                    }
                                }
                                if (!th.vt(ouw.this.pno)) {
                                    ouw ouwVar3 = ouw.this;
                                    if (ouwVar3.ex.f12920tc != 4) {
                                        if (th.lh(ouwVar3.pno)) {
                                            ouw.this.ouw(fYu, fFkw);
                                            return;
                                        }
                                        ouw ouwVar4 = ouw.this;
                                        int i12 = ouwVar4.pno.wbf;
                                        if (i12 == 3) {
                                            ouwVar4.ouw(fYu, fFkw);
                                            return;
                                        }
                                        if (i12 == 0) {
                                            float f13 = fYu;
                                            float f14 = fFkw;
                                            try {
                                                if (ouwVar4.fqk() != null && ouwVar4.f12911le != null) {
                                                    boolean z11 = ouwVar4.pno.jqy() == 1;
                                                    int[] iArrLh = osn.lh(zih.ouw());
                                                    ouwVar4.ouw(iArrLh[0], iArrLh[1], f13, f14, z11);
                                                    ko.vt(ouwVar4.ouw, "changeSize=end");
                                                    return;
                                                }
                                                return;
                                            } catch (Throwable th3) {
                                                ko.ouw(ouwVar4.ouw, "changeSize error", th3);
                                                return;
                                            }
                                        }
                                        float f15 = fYu;
                                        float f16 = fFkw;
                                        try {
                                            ko.lh(ouwVar4.ouw, "changeVideoSize start.......slot=" + ouwVar4.pno.yiz);
                                            if (ouwVar4.jvy()) {
                                                return;
                                            }
                                            ko.lh(ouwVar4.ouw, "changeVideoSize start check condition complete ... go ..");
                                            int[] iArrLh2 = osn.lh(zih.ouw());
                                            boolean z12 = ouwVar4.pno.jqy() == 1;
                                            float f17 = iArrLh2[0];
                                            float f18 = iArrLh2[1];
                                            if (z12) {
                                                if (f15 > f16) {
                                                    ko.vt(ouwVar4.ouw, "Separate adaptation for landscape to portrait .....");
                                                    ouwVar4.ouw(f17, f18, f15, f16, true);
                                                    return;
                                                }
                                            } else if (f15 < f16) {
                                                ko.vt(ouwVar4.ouw, "Separate adaptation for portrait to landscape.....");
                                                ouwVar4.ouw(f17, f18, f15, f16, false);
                                                return;
                                            }
                                            float f19 = f15 / f16;
                                            float f20 = f17 / f18;
                                            ko.vt(ouwVar4.ouw, "screenHeight=" + f18 + ",screenWidth=" + f17);
                                            ko.vt(ouwVar4.ouw, "videoHeight=" + f16 + ",videoWidth=" + f15);
                                            ko.vt(ouwVar4.ouw, "video w/h,videoScale=" + f19 + ",screen  w/h .screenScale=" + f20 + ",VERTICAL_SCALE(9:16)=0.5625,HORIZONTAL_SCALE(16:9) =1.7777778");
                                            if (z12) {
                                                if (f20 >= 0.5625f || f19 != 0.5625f) {
                                                    z10 = false;
                                                } else {
                                                    f15 = (9.0f * f18) / 16.0f;
                                                    z10 = true;
                                                    f16 = f18;
                                                }
                                            } else if (f20 <= 1.7777778f || f19 != 1.7777778f) {
                                                z10 = false;
                                            } else {
                                                f16 = (9.0f * f17) / 16.0f;
                                                z10 = true;
                                                f15 = f17;
                                            }
                                            ko.lh(ouwVar4.ouw, "Width and height after adaptation：videoHeight=" + f16 + ",videoWidth=" + f15);
                                            if (z10) {
                                                f17 = f15;
                                                f18 = f16;
                                            } else {
                                                ko.lh(ouwVar4.ouw, " Screen w/h == Video w/h and in other cases，use screen width and height，videoHeight=" + f18 + "，videoWidth=" + f17);
                                            }
                                            int i13 = (int) f17;
                                            int i14 = (int) f18;
                                            RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(i13, i14);
                                            layoutParams2.addRule(13);
                                            if (ouwVar4.fqk() != null) {
                                                if (ouwVar4.fqk() instanceof TextureView) {
                                                    ((TextureView) ouwVar4.fqk()).setLayoutParams(layoutParams2);
                                                } else if (ouwVar4.fqk() instanceof SurfaceView) {
                                                    ((SurfaceView) ouwVar4.fqk()).setLayoutParams(layoutParams2);
                                                }
                                                ViewGroup.LayoutParams layoutParams3 = ouwVar4.ksc.getLayoutParams();
                                                if (layoutParams3 != null) {
                                                    layoutParams3.height = i14;
                                                    layoutParams3.width = i13;
                                                    ouwVar4.ksc.setLayoutParams(layoutParams3);
                                                }
                                            }
                                            ko.vt(ouwVar4.ouw, "changeVideoSize .... complete ... end !!!");
                                            return;
                                        } catch (Throwable th4) {
                                            qbp.ouw(ouwVar4.ouw, "changeSize error", th4);
                                            return;
                                        }
                                    }
                                }
                                ouw.this.ouw(fYu, fFkw);
                            }
                        });
                    } catch (Throwable th2) {
                        qbp.lh(ouw.this.ouw, th2.getMessage());
                    }
                }
            });
        }

        @Override // com.bykv.vk.openvk.ouw.ouw.ouw.ouw.InterfaceC0060ouw
        public final void ouw(com.bykv.vk.openvk.ouw.ouw.ouw.ouw ouwVar, int i10, int i11, int i12) {
            int iOuw;
            ko.lh(ouw.this.ouw, "IVideoPlayerCallback onBufferStart: " + i10 + ", " + i11 + ", " + i12);
            ouw ouwVar2 = ouw.this;
            ouwVar2.f12917tc = true;
            int i13 = ouwVar2.ex.f12920tc;
            if (i13 == 2 || i13 == 1) {
                iOuw = zih.yu().pno.ouw("vbtt", 5) * 1000;
            } else if (i13 == 4) {
                zih.yu();
                String strValueOf = String.valueOf(ouwVar2.ux);
                iOuw = strValueOf == null ? 1500 : cf.qbp(strValueOf).f13079rn;
            } else {
                iOuw = 5000;
            }
            ouwVar2.f12912lh.removeCallbacks(ouwVar2.f12969kn);
            ouwVar2.f12912lh.postDelayed(ouwVar2.f12969kn, iOuw);
            ouw.this.f12912lh.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.mwh.yu.ouw.1.9
                @Override // java.lang.Runnable
                public final void run() {
                    com.bytedance.sdk.openadsdk.core.mwh.vt.fkw fkwVar = ouw.this.f12915ra;
                    if (fkwVar != null) {
                        fkwVar.vm();
                    }
                }
            });
            fkw.ouw(ouw.this.pno, 3);
            le leVar = ouw.this.f12907cd;
            if (leVar != null) {
                leVar.ouw(4);
            }
        }

        @Override // com.bykv.vk.openvk.ouw.ouw.ouw.ouw.InterfaceC0060ouw
        public final void ouw(com.bykv.vk.openvk.ouw.ouw.ouw.ouw ouwVar, int i10) {
            ko.lh(ouw.this.ouw, "IVideoPlayerCallback onBufferEnd: ".concat(String.valueOf(i10)));
            ouw ouwVar2 = ouw.this;
            ouwVar2.f12917tc = false;
            ouwVar2.f12912lh.removeCallbacks(ouwVar2.f12969kn);
            ouw.this.f12912lh.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.mwh.yu.ouw.1.10
                @Override // java.lang.Runnable
                public final void run() {
                    com.bytedance.sdk.openadsdk.core.mwh.vt.fkw fkwVar = ouw.this.f12915ra;
                    if (fkwVar != null) {
                        fkwVar.vt();
                    }
                }
            });
            fkw.ouw(ouw.this.pno, 0);
            le leVar = ouw.this.f12907cd;
            if (leVar != null) {
                leVar.ouw(5);
            }
        }

        @Override // com.bykv.vk.openvk.ouw.ouw.ouw.ouw.InterfaceC0060ouw
        public final void ouw(final com.bykv.vk.openvk.ouw.ouw.ouw.ouw ouwVar, long j10, long j11) {
            yu yuVar;
            if (Math.abs(j10 - ouw.this.bly) < 50) {
                return;
            }
            if (!ouw.this.qbp.get()) {
                ouw.this.bs();
            }
            ouw ouwVar2 = ouw.this;
            ouwVar2.ouw(ouwVar2.rrs);
            ouw.this.ouw(j10, j11);
            ouw.this.vt(j10, j11);
            com.bytedance.sdk.openadsdk.core.model.yu yuVarSd = ouw.this.pno.sd();
            if (yuVarSd != null && (yuVar = yuVarSd.ouw) != null) {
                yuVar.ouw(j10, j11, ouw.this.f12907cd);
            }
            if (!this.vt || j11 - j10 >= 500) {
                return;
            }
            this.vt = false;
            ouw.this.f12912lh.postDelayed(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.mwh.yu.ouw.1.2
                @Override // java.lang.Runnable
                public final void run() {
                    AnonymousClass1.this.ouw(ouwVar);
                }
            }, 1000L);
        }

        @Override // com.bytedance.sdk.openadsdk.core.mwh.yu.lh.vt
        public final void ouw() {
            ouw.this.lso();
        }
    }

    /* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.core.mwh.yu.ouw$ouw, reason: collision with other inner class name */
    public interface InterfaceC0131ouw {
        void ouw(int i10);
    }

    public void ksc() {
    }

    @Override // com.bytedance.sdk.openadsdk.core.mwh.ouw.ouw
    public final boolean uq() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lso() {
        vt(this.rrs);
        this.ex.jqy = this.f12911le.f12966ko;
        if (vpp.le(this.pno)) {
            com.bytedance.sdk.openadsdk.vm.lh.ouw(new com.bytedance.sdk.openadsdk.vm.yu() { // from class: com.bytedance.sdk.openadsdk.core.mwh.yu.ouw.2
                @Override // com.bytedance.sdk.openadsdk.vm.yu
                public final com.bytedance.sdk.openadsdk.vm.vt.ouw ouw() {
                    com.bytedance.sdk.openadsdk.vm.vt.ouw ouwVar = new com.bytedance.sdk.openadsdk.vm.vt.ouw();
                    try {
                        ouwVar.f13464lh = "video_player";
                        ouwVar.pno = uoy.ouw(ouw.this.pno);
                        ouwVar.vt = BuildConfig.VERSION_NAME;
                    } catch (Throwable unused) {
                    }
                    return ouwVar;
                }
            });
        }
        uoy();
        this.qbp.set(false);
        this.f12968cj.set(false);
        ouw(this.rrs);
    }

    @Override // com.bykv.vk.openvk.ouw.ouw.ouw.yu.lh
    public final void bly() {
        if (this.f12911le != null) {
            lso();
            this.f12911le.ryl();
        }
    }

    public final void ey() {
        this.pv.ouw((com.bykv.vk.openvk.ouw.ouw.ouw.ouw) null, 0, 0);
    }

    public final com.bykv.vk.openvk.ouw.ouw.ouw.le.vt fqk() {
        com.bytedance.sdk.openadsdk.core.mwh.vt.fkw fkwVar = this.f12915ra;
        if (fkwVar != null) {
            return fkwVar.f12925le;
        }
        return null;
    }

    public final void hun() {
        le leVar = this.f12907cd;
        if (leVar != null) {
            leVar.ouw(2);
        }
    }

    public final boolean jvy() {
        return fqk() == null || this.f12911le == null || (!com.bytedance.sdk.openadsdk.core.cf.yu.ouw(this.pno.kfa) ? this.pno.f12886xn != null : this.pno.lht != null) || this.pno.zih() == 1;
    }

    @Override // com.bykv.vk.openvk.ouw.ouw.ouw.yu.lh
    public final void mwh() {
        lh lhVar = this.f12911le;
        if (lhVar == null) {
            return;
        }
        lhVar.jg();
        this.f12911le = null;
        com.bytedance.sdk.openadsdk.core.mwh.vt.fkw fkwVar = this.f12915ra;
        if (fkwVar != null) {
            fkwVar.cf();
        }
        this.f12912lh.removeCallbacks(this.f12969kn);
        this.f12912lh.removeCallbacksAndMessages(null);
        le leVar = this.f12907cd;
        if (leVar != null) {
            leVar.yu();
        }
    }

    public final void ouw(float f10, float f11) {
        try {
            ko.lh(this.ouw, "landingPageChangeVideoSize start......." + this.pno.yiz);
            jvy();
            ko.lh(this.ouw, "landingPageChangeVideoSize start check condition complete ... go ..");
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams((int) f10, (int) f11);
            layoutParams.addRule(13);
            if (fqk() != null) {
                if (fqk() instanceof TextureView) {
                    ((TextureView) fqk()).setLayoutParams(layoutParams);
                } else if (fqk() instanceof SurfaceView) {
                    ((SurfaceView) fqk()).setLayoutParams(layoutParams);
                }
                ViewGroup.LayoutParams layoutParams2 = this.ksc.getLayoutParams();
                if (this.ksc.getHeight() > 0) {
                    float fMin = Math.min(this.ksc.getWidth() / f10, this.ksc.getHeight() / f11);
                    if (layoutParams2 != null) {
                        layoutParams.width = (int) (f10 * fMin);
                        layoutParams.height = (int) (f11 * fMin);
                        if (fqk() instanceof TextureView) {
                            ((TextureView) fqk()).setLayoutParams(layoutParams);
                        } else if (fqk() instanceof SurfaceView) {
                            ((SurfaceView) fqk()).setLayoutParams(layoutParams);
                        }
                        if (this.ex.f12920tc == 4) {
                            layoutParams2.width = layoutParams.width;
                            layoutParams2.height = layoutParams.height;
                            this.ksc.setLayoutParams(layoutParams2);
                        }
                    }
                }
            }
            ko.vt(this.ouw, "changeVideoSize .... complete ... end !!!");
        } catch (Throwable th2) {
            qbp.ouw(this.ouw, "changeSize error", th2);
        }
    }

    public final void rrs() {
        yu yuVar;
        if (this.hun || !this.qbp.get()) {
            return;
        }
        fak();
        com.bytedance.sdk.openadsdk.core.model.yu yuVarSd = this.pno.sd();
        if (yuVarSd == null || (yuVar = yuVarSd.ouw) == null) {
            return;
        }
        yuVar.vt(rn());
    }

    @Override // com.bykv.vk.openvk.ouw.ouw.ouw.yu.lh
    public final void ryl() {
        yu yuVar;
        com.bytedance.sdk.openadsdk.core.mwh.vt.fkw fkwVar = this.f12915ra;
        if (fkwVar != null) {
            fkwVar.ouw();
            this.f12915ra.rn();
            this.f12915ra.th();
        }
        ko.vt(this.ouw, "resumeVideo:  mIsSurfaceValid = ", Boolean.valueOf(this.mwh));
        lh lhVar = this.f12911le;
        if (lhVar != null) {
            if (lhVar.ra()) {
                if (!this.mwh) {
                    vt(this.fak);
                } else if (com.bytedance.sdk.openadsdk.core.bly.rn()) {
                    lh lhVar2 = this.f12911le;
                    lhVar2.yu = 3;
                    lhVar2.ouw(false, lhVar2.rn(), this.f12916rn);
                } else {
                    cd();
                }
                ko.vt(this.ouw, "resumeVideo: isPaused = true , mIsSurfaceValid = ", Boolean.valueOf(this.mwh));
            } else {
                this.f12911le.ouw(false, this.bly, this.f12916rn);
            }
        }
        if (this.hun || !this.qbp.get()) {
            return;
        }
        fak();
        com.bytedance.sdk.openadsdk.core.model.yu yuVarSd = this.pno.sd();
        if (yuVarSd == null || (yuVar = yuVarSd.ouw) == null) {
            return;
        }
        yuVar.vt(rn());
    }

    public final void ux() {
        le leVar = this.f12907cd;
        if (leVar != null) {
            leVar.ouw(13);
        }
    }

    public final void vt(final long j10, final long j11) {
        this.pno.uq = j10;
        this.bly = j10;
        this.bs = j11;
        final int iOuw = com.bykv.vk.openvk.ouw.ouw.vt.yu.ouw.ouw(j10, j11);
        this.f12912lh.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.mwh.yu.ouw.5
            @Override // java.lang.Runnable
            public final void run() {
                ouw.this.f12915ra.ouw(j10, j11);
                ouw.this.f12915ra.ouw(iOuw);
                try {
                    com.bykv.vk.openvk.ouw.ouw.ouw.yu.lh.ouw ouwVar = ouw.this.f12913od;
                    if (ouwVar != null) {
                        ouwVar.ouw(j10, j11);
                    }
                } catch (Throwable th2) {
                    qbp.ouw(ouw.this.ouw, "onProgressUpdate error: ", th2);
                }
            }
        });
    }

    public ouw(Context context, ViewGroup viewGroup, vpp vppVar, ra raVar) {
        super(context, vppVar, viewGroup);
        this.jvy = 0L;
        this.fqk = 0L;
        this.hun = false;
        this.lso = 0L;
        this.f12970ub = false;
        this.f12968cj = new AtomicBoolean(false);
        this.pv = new AnonymousClass1();
        this.f12969kn = new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.mwh.yu.ouw.4
            @Override // java.lang.Runnable
            public final void run() {
                ouw ouwVar = ouw.this;
                if (ouwVar.f12913od != null) {
                    ouwVar.ksc();
                    ouw.this.f12913od.ouw();
                }
            }
        };
        this.rrs = raVar;
        this.ux = vppVar.fqk();
        if (vppVar.uq() && this.ksc != null) {
            if (this.f12907cd == null) {
                this.f12907cd = new le();
            }
            this.f12907cd.ouw(this.ksc, vppVar);
        }
        com.bytedance.sdk.openadsdk.core.mwh.vt.fkw fkwVar = new com.bytedance.sdk.openadsdk.core.mwh.vt.fkw(context.getApplicationContext(), new jg(context), this.pno, this);
        this.f12915ra = fkwVar;
        fkwVar.ouw((com.bykv.vk.openvk.ouw.ouw.ouw.yu.ouw) this);
    }

    @Override // com.bykv.vk.openvk.ouw.ouw.ouw.yu.lh
    public final void jg() {
        mwh();
    }

    @Override // com.bykv.vk.openvk.ouw.ouw.ouw.yu.lh
    public final void ko() {
        mwh();
    }

    @Override // com.bytedance.sdk.openadsdk.core.mwh.ouw.ouw, com.bykv.vk.openvk.ouw.ouw.ouw.yu.lh
    public final boolean ouw(@NonNull com.bykv.vk.openvk.ouw.ouw.ouw.lh.lh lhVar) {
        int iMyk;
        super.ouw(lhVar);
        if (this.f12911le != null) {
            ko.fkw(this.ouw, "playVideoUrl: already invoked");
            return false;
        }
        ko.vt(this.ouw, "video local url " + lhVar.pno());
        if (TextUtils.isEmpty(lhVar.pno())) {
            ko.fkw(this.ouw, "No video info");
            return false;
        }
        lhVar.yu = com.bytedance.sdk.openadsdk.vpp.ouw.ouw("player_force_raw_url", 0) == 1;
        vt(lhVar);
        lhVar.f10444ko = 1;
        this.f12970ub = !lhVar.pno().startsWith("http");
        if (this.f12907cd != null) {
            if (this.ex.f12920tc == 1) {
                iMyk = this.pno.ng();
            } else {
                iMyk = this.pno.myk();
            }
            ViewGroup viewGroup = this.ksc;
            if (viewGroup != null) {
                try {
                    int i10 = this.pno.lna;
                    if (i10 == 7 || i10 == 8) {
                        View viewOuw = ey.ouw(viewGroup, (Class<? extends View>) com.bytedance.sdk.openadsdk.component.reward.view.bly.class);
                        if (viewOuw != null) {
                            View viewFindViewById = viewOuw.findViewById(rn.ryl);
                            View viewFindViewById2 = viewOuw.findViewById(rn.amr);
                            View viewFindViewById3 = viewOuw.findViewById(rn.f13438uj);
                            le leVar = this.f12907cd;
                            FriendlyObstructionPurpose friendlyObstructionPurpose = FriendlyObstructionPurpose.OTHER;
                            leVar.ouw(viewFindViewById2, friendlyObstructionPurpose);
                            this.f12907cd.ouw(viewFindViewById, friendlyObstructionPurpose);
                            this.f12907cd.ouw(viewFindViewById3, friendlyObstructionPurpose);
                            if (this.wp) {
                                View viewOuw2 = ey.ouw(this.ksc, (Class<? extends View>) com.bytedance.sdk.openadsdk.core.cf.vt.fkw.ouw.class);
                                if (viewOuw2 instanceof com.bytedance.sdk.openadsdk.core.cf.vt.fkw.ouw) {
                                    this.f12907cd.ouw(((com.bytedance.sdk.openadsdk.core.cf.vt.fkw.ouw) viewOuw2).getMarkView(), friendlyObstructionPurpose);
                                }
                            }
                        }
                        Iterator<View> it = ey.ouw(this.ksc, 1).iterator();
                        while (it.hasNext()) {
                            this.f12907cd.ouw(it.next(), FriendlyObstructionPurpose.OTHER);
                        }
                    } else if (i10 == 3) {
                        Iterator<View> it2 = ey.ouw(viewGroup, 2).iterator();
                        while (it2.hasNext()) {
                            this.f12907cd.ouw(it2.next(), FriendlyObstructionPurpose.OTHER);
                        }
                    }
                } catch (Throwable unused) {
                }
            }
            this.f12907cd.ouw(iMyk > 0, iMyk / 1000.0f);
        }
        uoy();
        long j10 = lhVar.tlj;
        if (j10 > 0) {
            this.bly = j10;
            this.tlj = Math.max(this.tlj, j10);
        }
        if (this.bly == this.bs) {
            this.bly = 0L;
        }
        com.bytedance.sdk.openadsdk.core.mwh.vt.fkw fkwVar = this.f12915ra;
        if (fkwVar != null) {
            fkwVar.ouw();
            this.f12915ra.tlj();
            this.f12915ra.vt(lhVar.f10448ra, lhVar.pno);
            this.f12915ra.lh(this.ksc);
        }
        lh lhVar2 = new lh();
        this.f12911le = lhVar2;
        lhVar2.ouw(this.pv);
        od();
        this.fqk = 0L;
        this.f12911le.f12965jg = Math.max(1, this.ey);
        this.f12911le.ouw(this.ex);
        this.jvy = System.currentTimeMillis();
        this.f12915ra.lh(8);
        this.f12915ra.lh(0);
        ouw(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.mwh.yu.ouw.3
            @Override // java.lang.Runnable
            public final void run() {
                ouw ouwVar = ouw.this;
                if (ouwVar.f12911le == null) {
                    return;
                }
                ouwVar.jvy = System.currentTimeMillis();
                ouw.this.f12915ra.yu(0);
                ouw ouwVar2 = ouw.this;
                ouwVar2.f12911le.ouw(true, ouwVar2.bly, ouwVar2.f12916rn);
            }
        });
        return true;
    }

    public final void ouw(float f10, float f11, float f12, float f13, boolean z10) {
        RelativeLayout.LayoutParams layoutParams;
        try {
            ko.vt(this.ouw, "sWh=" + f10 + VastAttributes.HORIZONTAL_POSITION + f11 + ", vWH=" + f12 + VastAttributes.HORIZONTAL_POSITION + f13 + ", " + z10);
            if (f12 <= 0.0f || f13 <= 0.0f) {
                com.bykv.vk.openvk.ouw.ouw.ouw.lh.vt vtVar = this.pno.f12874sd;
                float f14 = vtVar.vt;
                f13 = vtVar.ouw;
                f12 = f14;
            }
            if (f13 > 0.0f && f12 > 0.0f) {
                if (z10) {
                    if (f12 < f13) {
                        return;
                    }
                    ko.vt(this.ouw, "Vertical screen mode use video width compute scale value");
                    layoutParams = new RelativeLayout.LayoutParams((int) f10, (int) ((f13 * f10) / f12));
                } else {
                    if (f12 > f13) {
                        return;
                    }
                    ko.vt(this.ouw, "Landscape screen mode use video height compute scale value");
                    layoutParams = new RelativeLayout.LayoutParams((int) ((f12 * f11) / f13), (int) f11);
                }
                layoutParams.addRule(13);
                if (fqk() != null) {
                    if (fqk() instanceof TextureView) {
                        ((TextureView) fqk()).setLayoutParams(layoutParams);
                    } else if (fqk() instanceof SurfaceView) {
                        ((SurfaceView) fqk()).setLayoutParams(layoutParams);
                    }
                    ViewGroup.LayoutParams layoutParams2 = this.ksc.getLayoutParams();
                    if (!com.bytedance.sdk.component.adexpress.yu.vt.ouw(zih.ouw()) || this.ksc.getHeight() <= 0 || layoutParams2 == null) {
                        return;
                    }
                    layoutParams2.width = layoutParams.width;
                    layoutParams2.height = layoutParams.height;
                    this.ksc.setLayoutParams(layoutParams2);
                }
            }
        } catch (Throwable th2) {
            ko.ouw(this.ouw, "changeSize error", th2);
        }
    }

    @Override // com.bykv.vk.openvk.ouw.ouw.ouw.yu.ouw
    public final void ouw() {
        lh lhVar = this.f12911le;
        if (lhVar == null) {
            return;
        }
        if (lhVar.le()) {
            cf();
            this.f12915ra.le(true);
            this.f12915ra.pno();
            return;
        }
        if (!this.f12911le.ra()) {
            com.bytedance.sdk.openadsdk.core.mwh.vt.fkw fkwVar = this.f12915ra;
            if (fkwVar != null) {
                fkwVar.lh(this.ksc);
            }
            lh(this.bly);
            com.bytedance.sdk.openadsdk.core.mwh.vt.fkw fkwVar2 = this.f12915ra;
            if (fkwVar2 != null) {
                fkwVar2.le(false);
                return;
            }
            return;
        }
        ryl();
        com.bytedance.sdk.openadsdk.core.mwh.vt.fkw fkwVar3 = this.f12915ra;
        if (fkwVar3 != null) {
            fkwVar3.le(false);
        }
    }
}
