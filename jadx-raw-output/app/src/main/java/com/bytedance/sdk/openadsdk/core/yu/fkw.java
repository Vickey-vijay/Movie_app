package com.bytedance.sdk.openadsdk.core.yu;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.sdk.component.utils.ko;
import com.bytedance.sdk.openadsdk.core.model.zin;
import com.bytedance.sdk.openadsdk.utils.osn;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class fkw {
    public final View.OnAttachStateChangeListener fkw;
    public zin ouw;
    private final le.ouw pno;

    /* JADX INFO: renamed from: ra, reason: collision with root package name */
    private final le.vt f13170ra;
    public le vt;

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    public List<ouw> f13169lh = new ArrayList();

    /* JADX INFO: renamed from: le, reason: collision with root package name */
    private final String f13168le = "BannerSwiperManager";
    public int yu = -1;

    public final void ouw(final int i10) {
        ouw ouwVar;
        try {
            final int size = this.f13169lh.size();
            if (i10 < size && (ouwVar = this.f13169lh.get(i10)) != null) {
                ouwVar.ouw(new com.bytedance.sdk.openadsdk.ouw.ouw.vt() { // from class: com.bytedance.sdk.openadsdk.core.yu.fkw.5
                    @Override // com.bytedance.sdk.openadsdk.ouw.ouw.vt
                    public final void ouw() {
                        int i11 = i10 + 1;
                        if (i11 >= size) {
                            return;
                        }
                        fkw.this.ouw(i11);
                    }
                });
            }
        } catch (Throwable th2) {
            ko.fkw("BannerSwiperManager", th2.getMessage());
        }
    }

    public final void vt(int i10) {
        ouw ouwVar;
        for (int i11 = 0; i11 < this.f13169lh.size(); i11++) {
            try {
                if (i11 != i10 && (ouwVar = this.f13169lh.get(i11)) != null) {
                    ouwVar.ra();
                }
            } catch (Throwable th2) {
                ko.fkw("BannerSwiperManager", th2.getMessage());
                return;
            }
        }
    }

    public fkw(zin zinVar, Context context, int i10, int i11) {
        le.vt vtVar = new le.vt() { // from class: com.bytedance.sdk.openadsdk.core.yu.fkw.1
            @Override // com.bytedance.sdk.openadsdk.core.yu.le.vt
            public final void ouw(boolean z10) {
                try {
                    if (z10) {
                        fkw.vt(fkw.this);
                    } else {
                        fkw.ouw(fkw.this);
                    }
                } catch (Throwable th2) {
                    ko.lh("BannerSwiperManager", "onWindowFocusChanged", th2);
                }
            }
        };
        this.f13170ra = vtVar;
        View.OnAttachStateChangeListener onAttachStateChangeListener = new View.OnAttachStateChangeListener() { // from class: com.bytedance.sdk.openadsdk.core.yu.fkw.2
            @Override // android.view.View.OnAttachStateChangeListener
            public final void onViewAttachedToWindow(View view) {
                final fkw fkwVar = fkw.this;
                if (fkwVar.ouw == null) {
                    fkwVar.ouw = new zin();
                }
                boolean zEquals = TextUtils.equals(fkwVar.ouw.ouw, "vertical");
                le leVar = fkwVar.vt;
                leVar.pno = zEquals ? 1 : 0;
                com.bytedance.adsdk.ugeno.le.ouw ouwVarOuw = leVar.ouw("dot");
                ouwVarOuw.yu = false;
                com.bytedance.adsdk.ugeno.le.ouw ouwVarOuw2 = ouwVarOuw.vt(fkwVar.ouw.yu == 1).ouw(fkwVar.ouw.vt == 1).ouw(fkwVar.ouw.bly);
                zin zinVar2 = fkwVar.ouw;
                ouwVarOuw2.f10880le = zinVar2.tlj == 1;
                com.bytedance.adsdk.ugeno.le.ouw ouwVarVt = ouwVarOuw2.vt(zinVar2.pno);
                zin zinVar3 = fkwVar.ouw;
                ouwVarVt.fkw = zinVar3.f12897lh == 1;
                ouwVarVt.le(zinVar3.fkw).ra(fkwVar.ouw.f12896le).fkw(fkwVar.ouw.f12898ra);
                fkwVar.vt.setOnPageChangeListener(new com.bytedance.adsdk.ugeno.le.lh() { // from class: com.bytedance.sdk.openadsdk.core.yu.fkw.4
                    @Override // com.bytedance.adsdk.ugeno.le.lh
                    public final void ouw(boolean z10, int i12, float f10, int i13) {
                    }

                    @Override // com.bytedance.adsdk.ugeno.le.lh
                    public final void ouw(boolean z10, int i12, int i13, boolean z11, boolean z12) {
                        ouw ouwVar;
                        fkw fkwVar2 = fkw.this;
                        try {
                            int i14 = fkwVar2.yu;
                            if (i14 != -1 && i14 != i12 && (ouwVar = fkwVar2.f13169lh.get(i14)) != null) {
                                ouwVar.ouw(ouwVar.vt);
                                ouwVar.f13182ra = 0L;
                                ouwVar.le();
                            }
                            ouw ouwVar2 = fkwVar2.f13169lh.get(i12);
                            if (ouwVar2 != null) {
                                ouwVar2.f13182ra = System.currentTimeMillis();
                            }
                        } catch (Throwable unused) {
                        }
                        fkw fkwVar3 = fkw.this;
                        fkwVar3.yu = i12;
                        fkwVar3.ouw(i12);
                        fkw.this.vt(i12);
                    }

                    @Override // com.bytedance.adsdk.ugeno.le.lh
                    public final void ouw(boolean z10, int i12) {
                        if (i12 == 1 || i12 == 2) {
                            fkw.this.vt(-1);
                        } else if (i12 == 0) {
                            fkw fkwVar2 = fkw.this;
                            fkwVar2.ouw(fkwVar2.yu);
                        }
                    }
                });
                List<ouw> list = fkwVar.f13169lh;
                if (list != null && !list.isEmpty()) {
                    for (int i12 = 0; i12 < list.size(); i12++) {
                        fkwVar.vt.ouw(list.get(i12).ouw());
                    }
                }
                fkwVar.vt.ouw();
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public final void onViewDetachedFromWindow(View view) {
                List<ouw> list = fkw.this.f13169lh;
                if (list != null && !list.isEmpty()) {
                    for (int i12 = 0; i12 < fkw.this.f13169lh.size(); i12++) {
                        fkw.this.f13169lh.get(i12).yu();
                    }
                }
                fkw fkwVar = fkw.this;
                fkwVar.yu = -1;
                le leVar = fkwVar.vt;
                if (leVar != null) {
                    leVar.vt();
                }
            }
        };
        this.fkw = onAttachStateChangeListener;
        le.ouw ouwVar = new le.ouw() { // from class: com.bytedance.sdk.openadsdk.core.yu.fkw.3
            @Override // com.bytedance.sdk.openadsdk.core.yu.le.ouw
            public final void ouw(boolean z10) {
                if (z10) {
                    fkw.vt(fkw.this);
                } else {
                    fkw.ouw(fkw.this);
                }
            }
        };
        this.pno = ouwVar;
        this.ouw = zinVar;
        le leVar = new le(context);
        this.vt = leVar;
        leVar.addOnAttachStateChangeListener(onAttachStateChangeListener);
        this.vt.setSwiperWindowFocusChangedListener(vtVar);
        this.vt.setSwiperVisibleChangeListener(ouwVar);
        int iOuw = osn.ouw(context, i10);
        int iOuw2 = osn.ouw(context, i11);
        ViewGroup.LayoutParams layoutParams = this.vt.getLayoutParams();
        layoutParams = layoutParams == null ? new ViewGroup.LayoutParams(iOuw, iOuw2) : layoutParams;
        layoutParams.width = iOuw;
        layoutParams.height = iOuw2;
        this.vt.setLayoutParams(layoutParams);
    }

    public static /* synthetic */ void ouw(fkw fkwVar) {
        le leVar;
        zin zinVar = fkwVar.ouw;
        if (zinVar != null && zinVar.vt == 1 && (leVar = fkwVar.vt) != null) {
            leVar.yu();
        }
        if (fkwVar.yu >= 0) {
            fkwVar.vt(-1);
        }
    }

    public static /* synthetic */ void vt(fkw fkwVar) {
        le leVar;
        zin zinVar = fkwVar.ouw;
        if (zinVar != null && zinVar.vt == 1 && (leVar = fkwVar.vt) != null) {
            leVar.lh();
        }
        int i10 = fkwVar.yu;
        if (i10 >= 0) {
            fkwVar.ouw(i10);
            fkwVar.vt(fkwVar.yu);
        }
    }
}
