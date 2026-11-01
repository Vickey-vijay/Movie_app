package com.bytedance.sdk.openadsdk.component.reward.view;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.drawable.AnimatedImageDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.view.ViewCompat;
import com.bytedance.sdk.openadsdk.core.model.od;
import com.bytedance.sdk.openadsdk.core.model.vpp;
import com.bytedance.sdk.openadsdk.core.widget.rn;
import com.bytedance.sdk.openadsdk.core.widget.zih;
import com.bytedance.sdk.openadsdk.utils.osn;
import com.bytedance.sdk.openadsdk.utils.uoy;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.utils.Logger;
import com.safedk.android.utils.g;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.bidmachine.unified.UnifiedMediationParams;
import java.lang.ref.WeakReference;
import java.util.Locale;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class fkw extends com.bytedance.sdk.openadsdk.core.le.fkw {
    private TextView fkw;

    /* JADX INFO: renamed from: le, reason: collision with root package name */
    private TextView f12449le;

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    private TextView f12450lh;
    private rn ouw;
    private com.bytedance.sdk.openadsdk.component.reward.ouw.ouw pno;

    /* JADX INFO: renamed from: ra, reason: collision with root package name */
    private boolean f12451ra;
    private TextView vt;
    private zih yu;

    @SuppressLint({"ClickableViewAccessibility"})
    private void lh() {
        TextView textView;
        com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ouwVar = this.pno;
        com.bytedance.sdk.openadsdk.component.reward.ouw.tlj tljVar = ouwVar.f12371cd;
        com.bytedance.sdk.openadsdk.core.lh.fkw fkwVar = tljVar.f12420lh;
        final com.bytedance.sdk.openadsdk.core.lh.vt vtVar = tljVar.vt;
        final vpp vppVar = ouwVar.vt;
        if (vppVar.ms == null) {
            return;
        }
        if (vppVar.zih() != 5 && (textView = this.vt) != null) {
            if (vppVar.ms.fkw) {
                textView.setOnClickListener(fkwVar);
                this.vt.setOnTouchListener(fkwVar);
            } else {
                textView.setOnClickListener(vtVar);
            }
        }
        if (vppVar.zih() == 1) {
            if (!vppVar.ms.ouw) {
                osn.ouw((View) this, (View.OnClickListener) vtVar, "TTBaseVideoActivity#mRlDownloadBar");
                this.fkw.setOnClickListener(vtVar);
                this.ouw.setOnClickListener(vtVar);
                this.yu.setOnClickListener(vtVar);
                return;
            }
            osn.ouw((View) this, (View.OnClickListener) fkwVar, "TTBaseVideoActivity#mRlDownloadBar");
            osn.ouw((View) this, (View.OnTouchListener) fkwVar, "TTBaseVideoActivity#mRlDownloadBar");
            this.fkw.setOnClickListener(fkwVar);
            this.fkw.setOnTouchListener(fkwVar);
            this.ouw.setOnClickListener(fkwVar);
            this.ouw.setOnTouchListener(fkwVar);
            this.yu.setOnClickListener(fkwVar);
            this.yu.setOnTouchListener(fkwVar);
            return;
        }
        if (vppVar.zih() != 5) {
            if (!vppVar.ms.f12832lh) {
                osn.ouw((View) this, (View.OnClickListener) vtVar, "TTBaseVideoActivity#mRlDownloadBar");
                return;
            } else {
                osn.ouw((View) this, (View.OnClickListener) fkwVar, "TTBaseVideoActivity#mRlDownloadBar");
                osn.ouw((View) this, (View.OnTouchListener) fkwVar, "TTBaseVideoActivity#mRlDownloadBar");
                return;
            }
        }
        String str = "VAST_ICON";
        if (!vppVar.ms.fkw) {
            View.OnClickListener onClickListener = new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.component.reward.view.fkw.5
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    Logger.d("Pangle|SafeDK: Execution> Lcom/bytedance/sdk/openadsdk/component/reward/view/fkw$5;->onClick(Landroid/view/View;)V");
                    CreativeInfoManager.onViewClicked(g.f44975u, view);
                    safedk_fkw$5_onClick_01d42ffdb7761d6b85c41d1882db1fd2(view);
                }

                public void safedk_fkw$5_onClick_01d42ffdb7761d6b85c41d1882db1fd2(View p10) {
                    com.bytedance.sdk.openadsdk.core.ryl.vt vtVar2;
                    View.OnClickListener onClickListener2 = vtVar;
                    if (onClickListener2 != null) {
                        onClickListener2.onClick(p10);
                    }
                    if (p10 == null || !"VAST_ICON".equals(p10.getTag(570425345))) {
                        com.bytedance.sdk.openadsdk.core.ryl.ouw ouwVar2 = vppVar.cu;
                        if (ouwVar2 != null) {
                            ouwVar2.ouw.ouw.le(fkw.this.pno.ex.fkw());
                            return;
                        }
                        return;
                    }
                    com.bytedance.sdk.openadsdk.core.ryl.ouw ouwVar3 = vppVar.cu;
                    if (ouwVar3 == null || (vtVar2 = ouwVar3.vt) == null) {
                        return;
                    }
                    vtVar2.ouw(fkw.this.pno.ex.fkw());
                }
            };
            TextView textView2 = this.vt;
            if (textView2 != null) {
                textView2.setOnClickListener(onClickListener);
            }
            TextView textView3 = this.fkw;
            if (textView3 != null && !TextUtils.isEmpty(textView3.getText())) {
                this.fkw.setOnClickListener(onClickListener);
            }
            zih zihVar = this.yu;
            if (zihVar != null) {
                zihVar.setTag(570425345, "VAST_ICON");
                this.yu.setOnClickListener(vtVar);
                return;
            }
            return;
        }
        com.bytedance.sdk.openadsdk.core.lh.ra raVar = new com.bytedance.sdk.openadsdk.core.lh.ra("VAST_ACTION_BUTTON", vppVar.cu, fkwVar) { // from class: com.bytedance.sdk.openadsdk.component.reward.view.fkw.3
        };
        com.bytedance.sdk.openadsdk.core.lh.ra raVar2 = new com.bytedance.sdk.openadsdk.core.lh.ra(str, vppVar.cu, fkwVar) { // from class: com.bytedance.sdk.openadsdk.component.reward.view.fkw.4
        };
        TextView textView4 = this.vt;
        if (textView4 != null) {
            textView4.setOnClickListener(raVar);
            this.vt.setOnTouchListener(raVar);
        }
        zih zihVar2 = this.yu;
        if (zihVar2 != null) {
            zihVar2.setOnClickListener(raVar2);
            this.yu.setOnTouchListener(raVar2);
        }
        TextView textView5 = this.fkw;
        if (textView5 == null || TextUtils.isEmpty(textView5.getText())) {
            return;
        }
        this.fkw.setOnClickListener(raVar);
        this.fkw.setOnTouchListener(raVar);
    }

    @Override // com.bytedance.sdk.openadsdk.core.le.fkw, android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me2) {
        DetectTouchUtils.viewOnTouch(g.f44975u, this, me2);
        return super.dispatchTouchEvent(me2);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.bytedance.sdk.openadsdk.core.le.fkw, android.widget.LinearLayout, android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        }
    }

    public static class ouw implements com.bytedance.sdk.component.fkw.rn {

        /* JADX INFO: renamed from: lh, reason: collision with root package name */
        private final String f12453lh;
        public final vpp ouw;
        public final String vt;
        private final WeakReference<ImageView> yu;

        @Override // com.bytedance.sdk.component.fkw.rn
        public final void ouw(com.bytedance.sdk.component.fkw.cf cfVar) {
            Object objVt = cfVar.vt();
            if (objVt != null) {
                ImageView imageView = this.yu.get();
                if (objVt instanceof Bitmap) {
                    if (imageView != null) {
                        imageView.setImageBitmap((Bitmap) objVt);
                    }
                } else if (objVt instanceof Drawable) {
                    if (Build.VERSION.SDK_INT >= 28 && (objVt instanceof AnimatedImageDrawable)) {
                        ((AnimatedImageDrawable) objVt).start();
                    }
                    if (imageView != null) {
                        imageView.setImageDrawable((Drawable) objVt);
                    }
                }
                com.bytedance.sdk.openadsdk.yu.lh.vt(this.ouw, this.vt, "load_vast_icon_success", (JSONObject) null);
            }
        }

        public ouw(ImageView imageView, vpp vppVar, String str, String str2) {
            this.yu = new WeakReference<>(imageView);
            this.ouw = vppVar;
            this.f12453lh = str;
            this.vt = str2;
        }

        @Override // com.bytedance.sdk.component.fkw.rn
        public final void ouw(final int i10, final String str, @Nullable Throwable th2) {
            final String str2 = this.f12453lh;
            com.bytedance.sdk.openadsdk.yu.lh.ouw(new com.bytedance.sdk.component.pno.pno("load_vast_icon_fail") { // from class: com.bytedance.sdk.openadsdk.component.reward.view.fkw.ouw.1
                @Override // java.lang.Runnable
                public final void run() {
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put("error_code", i10);
                        jSONObject.put(UnifiedMediationParams.KEY_DESCRIPTION, i10 + StringUtils.PROCESS_POSTFIX_DELIMITER + str);
                        jSONObject.put("url", str2);
                    } catch (Throwable unused) {
                    }
                    ouw ouwVar = ouw.this;
                    com.bytedance.sdk.openadsdk.yu.lh.vt(ouwVar.ouw, ouwVar.vt, "load_vast_icon_fail", jSONObject);
                }
            });
        }
    }

    private String getCnOrEnBtnText() {
        return this.pno.vt.f12868pd != 4 ? "View" : "Install";
    }

    private void ouw() {
        com.bytedance.sdk.openadsdk.core.model.zih zihVar;
        com.bytedance.sdk.openadsdk.core.ryl.vt vtVar;
        this.f12451ra = true;
        vpp vppVar = this.pno.vt;
        int i10 = vppVar.fvf;
        if ((i10 == 43 || i10 == 44) && od.vt(vppVar)) {
            fkw();
        } else if (this.pno.ucs == 1) {
            yu();
        } else {
            vt();
        }
        if (this.vt == null) {
            this.vt = (TextView) this.pno.rrs.findViewById(520093705);
        }
        TextView textView = this.vt;
        if (textView != null) {
            textView.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: com.bytedance.sdk.openadsdk.component.reward.view.fkw.1
                @Override // android.view.View.OnLayoutChangeListener
                public final void onLayoutChange(View view, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
                    int width = ((ViewGroup) fkw.this.vt.getParent()).getWidth();
                    if (width > 0) {
                        fkw.this.vt.setMaxWidth((int) (width * 0.45f));
                    }
                }
            });
            if (vppVar.cd()) {
                com.bytedance.sdk.openadsdk.core.ryl.ouw ouwVar = vppVar.cu;
                if (ouwVar != null && TextUtils.isEmpty(ouwVar.f13012le)) {
                    osn.ouw((View) this.vt, 8);
                }
            } else {
                this.vt.setText(vppVar.zih() == 3 ? getButtonTextForNewStyleBar() : vppVar.vpp());
            }
        }
        if (this.yu != null && (zihVar = vppVar.fak) != null && !TextUtils.isEmpty(zihVar.ouw)) {
            String str = vppVar.fak.ouw;
            if (vppVar.cd()) {
                com.bytedance.sdk.openadsdk.core.model.zih zihVar2 = vppVar.fak;
                com.bytedance.sdk.openadsdk.tlj.yu.ouw.ouw(com.bytedance.sdk.openadsdk.tlj.yu.ouw.vt.ouw(zihVar2.ouw).ouw(zihVar2.vt).vt(zihVar2.f12895lh).fkw(osn.le(com.bytedance.sdk.openadsdk.core.zih.ouw())).yu(osn.yu(com.bytedance.sdk.openadsdk.core.zih.ouw())).ouw(zihVar2.f12894le)).lh(1).vt(new com.bytedance.sdk.openadsdk.tlj.vt(vppVar, vppVar.fak.ouw, new ouw(this.yu, vppVar, str, this.pno.fkw)));
                com.bytedance.sdk.openadsdk.core.ryl.ouw ouwVar2 = vppVar.cu;
                if (ouwVar2 != null && (vtVar = ouwVar2.vt) != null) {
                    vtVar.vt(0L);
                }
            } else {
                com.bytedance.sdk.openadsdk.th.vt.ouw();
                com.bytedance.sdk.openadsdk.th.vt.ouw(vppVar.fak, this.yu, vppVar);
            }
        }
        TextView textView2 = this.fkw;
        if (textView2 != null) {
            textView2.setText(vppVar.fqk);
        }
        TextView textView3 = this.f12449le;
        if (textView3 != null) {
            textView3.setText(ouw(vppVar));
        }
        if (this.f12450lh != null) {
            String strKo = od.ko(this.pno.vt);
            if (TextUtils.isEmpty(strKo)) {
                strKo = "Play now";
            }
            this.f12450lh.setText(strKo);
            this.f12450lh.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.component.reward.view.fkw.2
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    Logger.d("Pangle|SafeDK: Execution> Lcom/bytedance/sdk/openadsdk/component/reward/view/fkw$2;->onClick(Landroid/view/View;)V");
                    CreativeInfoManager.onViewClicked(g.f44975u, view);
                    safedk_fkw$2_onClick_e058703c5dfc50a7d8724fcba0811edd(view);
                }

                public void safedk_fkw$2_onClick_e058703c5dfc50a7d8724fcba0811edd(View p10) {
                    if (fkw.this.pno != null) {
                        com.bytedance.sdk.openadsdk.component.reward.ouw.ouw(fkw.this.pno);
                    }
                }
            });
        }
        rn rnVar = this.ouw;
        if (rnVar != null) {
            osn.ouw((TextView) null, rnVar, vppVar);
        }
        if (this.pno.ucs == 2 && vppVar.zih() == 1) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.vt.getLayoutParams();
            layoutParams.height = osn.ouw(this.pno.hun, 55.0f);
            layoutParams.topMargin = osn.ouw(this.pno.hun, 20.0f);
            this.vt.setLayoutParams(layoutParams);
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) getLayoutParams();
            layoutParams2.bottomMargin = osn.ouw(this.pno.hun, 12.0f);
            setLayoutParams(layoutParams2);
        }
        lh();
    }

    private void vt() {
        setOrientation(0);
        setGravity(16);
        Context context = getContext();
        setPadding(osn.ouw(context, 16.0f), osn.ouw(context, 12.0f), osn.ouw(context, 16.0f), osn.ouw(context, 12.0f));
        zih zihVar = new zih(context);
        this.yu = zihVar;
        zihVar.setBackgroundColor(0);
        this.yu.setId(com.bytedance.sdk.openadsdk.utils.rn.vt);
        addView(this.yu, new LinearLayout.LayoutParams(osn.ouw(context, 48.0f), osn.ouw(context, 48.0f)));
        com.bytedance.sdk.openadsdk.core.le.fkw fkwVar = new com.bytedance.sdk.openadsdk.core.le.fkw(context);
        fkwVar.setOrientation(1);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, -2);
        layoutParams.leftMargin = osn.ouw(context, 12.0f);
        layoutParams.weight = 1.0f;
        addView(fkwVar, layoutParams);
        com.bytedance.sdk.openadsdk.core.le.pno pnoVar = new com.bytedance.sdk.openadsdk.core.le.pno(context);
        this.fkw = pnoVar;
        pnoVar.setEllipsize(TextUtils.TruncateAt.END);
        this.fkw.setGravity(16);
        this.fkw.setSingleLine(true);
        this.fkw.setTextSize(2, 17.0f);
        this.fkw.setId(com.bytedance.sdk.openadsdk.utils.rn.f13421lh);
        this.fkw.setTextColor(ViewCompat.MEASURED_STATE_MASK);
        fkwVar.addView(this.fkw, new LinearLayout.LayoutParams(-1, -2));
        rn rnVar = new rn(context);
        this.ouw = rnVar;
        rnVar.setId(com.bytedance.sdk.openadsdk.utils.rn.fkw);
        fkwVar.addView(this.ouw, new LinearLayout.LayoutParams(-2, osn.ouw(context, 14.0f)));
        com.bytedance.sdk.openadsdk.core.le.pno pnoVar2 = new com.bytedance.sdk.openadsdk.core.le.pno(context);
        this.vt = pnoVar2;
        pnoVar2.setGravity(17);
        this.vt.setEllipsize(TextUtils.TruncateAt.END);
        this.vt.setSingleLine(true);
        this.vt.setTextColor(-1);
        this.vt.setTextSize(2, 16.0f);
        this.vt.setId(520093705);
        this.vt.setBackground(ouw(context));
        this.vt.setText(this.pno.vt.vpp());
        addView(this.vt, new LinearLayout.LayoutParams(osn.ouw(context, 164.0f), osn.ouw(context, 36.0f)));
    }

    public final String getButtonTextForNewStyleBar() {
        boolean zEquals;
        String strVpp;
        String strOuw = uoy.ouw(this.pno.hun);
        if (strOuw == null) {
            strOuw = "";
        }
        try {
            zEquals = strOuw.equals(Locale.ENGLISH.getLanguage());
        } catch (Throwable unused) {
            zEquals = false;
        }
        if (TextUtils.isEmpty(this.pno.vt.vpp())) {
            strVpp = this.pno.vt.f12868pd != 4 ? "View" : "Install";
        } else {
            strVpp = this.pno.vt.vpp();
            if (strVpp == null || !uoy.yu(strVpp) || strVpp.length() <= 2) {
                if (strVpp != null && !uoy.yu(strVpp) && strVpp.length() > 7 && zEquals) {
                    strVpp = getCnOrEnBtnText();
                }
            } else if (zEquals) {
                strVpp = getCnOrEnBtnText();
            }
        }
        if (zEquals && !uoy.yu(strVpp)) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.vt.getLayoutParams();
            layoutParams.bottomMargin = osn.ouw(this.pno.hun, 4.0f);
            this.vt.setLayoutParams(layoutParams);
        }
        return strVpp;
    }

    public fkw(@NonNull Context context) {
        super(context);
        setOrientation(1);
        setVisibility(8);
        setBackgroundColor(-1);
    }

    private void fkw() {
        Context context = getContext();
        int iOuw = osn.ouw(context, 12.0f);
        setPadding(iOuw, iOuw, iOuw, iOuw);
        com.bytedance.sdk.openadsdk.core.le.fkw fkwVar = new com.bytedance.sdk.openadsdk.core.le.fkw(context);
        ViewGroup.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        fkwVar.setOrientation(0);
        fkwVar.setGravity(16);
        addView(fkwVar, layoutParams);
        zih zihVar = new zih(context);
        this.yu = zihVar;
        zihVar.setBackgroundColor(0);
        this.yu.setId(com.bytedance.sdk.openadsdk.utils.rn.vt);
        fkwVar.addView(this.yu, new LinearLayout.LayoutParams(osn.ouw(context, 54.0f), osn.ouw(context, 54.0f)));
        com.bytedance.sdk.openadsdk.core.le.fkw fkwVar2 = new com.bytedance.sdk.openadsdk.core.le.fkw(context);
        fkwVar2.setOrientation(1);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams2.leftMargin = osn.ouw(context, 12.0f);
        fkwVar.addView(fkwVar2, layoutParams2);
        com.bytedance.sdk.openadsdk.core.le.pno pnoVar = new com.bytedance.sdk.openadsdk.core.le.pno(context);
        this.fkw = pnoVar;
        pnoVar.setEllipsize(TextUtils.TruncateAt.END);
        this.fkw.setGravity(16);
        this.fkw.setSingleLine(true);
        this.fkw.setTextSize(2, 17.0f);
        this.fkw.setId(com.bytedance.sdk.openadsdk.utils.rn.f13421lh);
        this.fkw.setTextColor(ViewCompat.MEASURED_STATE_MASK);
        fkwVar2.addView(this.fkw, new LinearLayout.LayoutParams(-1, -2));
        com.bytedance.sdk.openadsdk.core.le.pno pnoVar2 = new com.bytedance.sdk.openadsdk.core.le.pno(context);
        this.f12449le = pnoVar2;
        pnoVar2.setTextColor(ViewCompat.MEASURED_STATE_MASK);
        this.f12449le.setTextSize(2, 13.0f);
        this.f12449le.setMaxLines(2);
        this.f12449le.setAlpha(0.8f);
        this.f12449le.setEllipsize(TextUtils.TruncateAt.END);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams3.topMargin = osn.ouw(context, 4.0f);
        fkwVar2.addView(this.f12449le, layoutParams3);
        com.bytedance.sdk.openadsdk.core.le.fkw fkwVar3 = new com.bytedance.sdk.openadsdk.core.le.fkw(context);
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams4.topMargin = osn.ouw(context, 12.0f);
        fkwVar3.setOrientation(0);
        addView(fkwVar3, layoutParams4);
        com.bytedance.sdk.openadsdk.core.le.pno pnoVar3 = new com.bytedance.sdk.openadsdk.core.le.pno(context);
        this.f12450lh = pnoVar3;
        pnoVar3.setGravity(17);
        this.f12450lh.setEllipsize(TextUtils.TruncateAt.END);
        this.f12450lh.setSingleLine(true);
        this.f12450lh.setTextColor(ViewCompat.MEASURED_STATE_MASK);
        this.f12450lh.setTextSize(2, 16.0f);
        this.f12450lh.setBackground(vt(context));
        LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(0, osn.ouw(context, 36.0f), 1.0f);
        layoutParams5.rightMargin = osn.ouw(context, 3.0f);
        fkwVar3.addView(this.f12450lh, layoutParams5);
        com.bytedance.sdk.openadsdk.core.le.pno pnoVar4 = new com.bytedance.sdk.openadsdk.core.le.pno(context);
        this.vt = pnoVar4;
        pnoVar4.setGravity(17);
        this.vt.setEllipsize(TextUtils.TruncateAt.END);
        this.vt.setSingleLine(true);
        this.vt.setTextColor(-1);
        this.vt.setTextSize(2, 16.0f);
        this.vt.setId(520093705);
        this.vt.setBackground(lh(context));
        this.vt.setText(this.pno.vt.vpp());
        LinearLayout.LayoutParams layoutParams6 = new LinearLayout.LayoutParams(0, osn.ouw(context, 36.0f), 1.0f);
        layoutParams6.leftMargin = osn.ouw(context, 3.0f);
        fkwVar3.addView(this.vt, layoutParams6);
    }

    private void yu() {
        Context context = getContext();
        setPadding(osn.ouw(context, 16.0f), osn.ouw(context, 16.0f), osn.ouw(context, 16.0f), osn.ouw(context, 24.0f));
        com.bytedance.sdk.openadsdk.core.le.fkw fkwVar = new com.bytedance.sdk.openadsdk.core.le.fkw(context);
        fkwVar.setOrientation(0);
        fkwVar.setGravity(16);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.bottomMargin = osn.ouw(context, 12.0f);
        addView(fkwVar, layoutParams);
        zih zihVar = new zih(context);
        this.yu = zihVar;
        zihVar.setBackgroundColor(0);
        this.yu.setId(com.bytedance.sdk.openadsdk.utils.rn.vt);
        fkwVar.addView(this.yu, new LinearLayout.LayoutParams(osn.ouw(context, 48.0f), osn.ouw(context, 48.0f)));
        com.bytedance.sdk.openadsdk.core.le.fkw fkwVar2 = new com.bytedance.sdk.openadsdk.core.le.fkw(context);
        fkwVar2.setOrientation(1);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams2.leftMargin = osn.ouw(context, 12.0f);
        fkwVar.addView(fkwVar2, layoutParams2);
        com.bytedance.sdk.openadsdk.core.le.pno pnoVar = new com.bytedance.sdk.openadsdk.core.le.pno(context);
        this.fkw = pnoVar;
        pnoVar.setEllipsize(TextUtils.TruncateAt.END);
        this.fkw.setGravity(16);
        this.fkw.setSingleLine(true);
        this.fkw.setTextSize(2, 17.0f);
        this.fkw.setId(com.bytedance.sdk.openadsdk.utils.rn.f13421lh);
        this.fkw.setTextColor(ViewCompat.MEASURED_STATE_MASK);
        fkwVar2.addView(this.fkw, new LinearLayout.LayoutParams(-1, -2));
        rn rnVar = new rn(context);
        this.ouw = rnVar;
        rnVar.setId(com.bytedance.sdk.openadsdk.utils.rn.fkw);
        fkwVar2.addView(this.ouw, new LinearLayout.LayoutParams(-2, osn.ouw(context, 14.0f)));
        com.bytedance.sdk.openadsdk.core.le.pno pnoVar2 = new com.bytedance.sdk.openadsdk.core.le.pno(context);
        this.vt = pnoVar2;
        pnoVar2.setGravity(17);
        this.vt.setEllipsize(TextUtils.TruncateAt.END);
        this.vt.setSingleLine(true);
        this.vt.setTextColor(-1);
        this.vt.setTextSize(2, 16.0f);
        this.vt.setId(520093705);
        this.vt.setBackground(ouw(context));
        this.vt.setText(this.pno.vt.vpp());
        addView(this.vt, new LinearLayout.LayoutParams(-1, osn.ouw(context, 36.0f)));
    }

    @Override // android.view.View
    public final void setVisibility(int i10) {
        super.setVisibility(i10);
        if (i10 == 0 && !this.f12451ra) {
            ouw();
        }
    }

    private static Drawable vt(Context context) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(Color.parseColor("#000000"));
        gradientDrawable.setAlpha(30);
        gradientDrawable.setCornerRadius(osn.ouw(context, 8.0f));
        return gradientDrawable;
    }

    private static Drawable lh(Context context) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(Color.parseColor("#FE2C55"));
        gradientDrawable.setCornerRadius(osn.ouw(context, 8.0f));
        return gradientDrawable;
    }

    public final void ouw(com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ouwVar) {
        this.pno = ouwVar;
        if (ouwVar.vt.zih() == 1) {
            ouw();
        }
    }

    private static Drawable ouw(Context context) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(Color.parseColor("#1A73E8"));
        gradientDrawable.setCornerRadius(osn.ouw(context, 18.0f));
        return gradientDrawable;
    }

    private static String ouw(vpp vppVar) {
        if (TextUtils.isEmpty(vppVar.fqk)) {
            return !TextUtils.isEmpty(vppVar.hun) ? vppVar.hun : "";
        }
        return vppVar.fqk;
    }
}
