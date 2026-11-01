package com.bytedance.sdk.openadsdk.component.reward.view;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.view.GravityCompat;
import androidx.core.view.ViewCompat;
import com.bytedance.sdk.component.utils.vpp;
import com.bytedance.sdk.openadsdk.activity.TTWebsiteActivity;
import com.bytedance.sdk.openadsdk.core.widget.PAGLogoView;
import com.bytedance.sdk.openadsdk.core.widget.rn;
import com.bytedance.sdk.openadsdk.core.widget.zih;
import com.bytedance.sdk.openadsdk.utils.osn;
import com.google.android.material.badge.BadgeDrawable;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.utils.Logger;
import com.safedk.android.utils.g;
import java.util.HashMap;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public class RFEndCardBackUpLayout extends com.bytedance.sdk.openadsdk.core.le.lh {
    private static final String TAG = "TTAD.RFEndCardBackUpL";
    private com.bytedance.sdk.openadsdk.component.reward.ouw.ouw adContext;
    private PAGLogoView adLogo;
    private zih ivIcon;
    private boolean mInit;
    private rn rbScore;
    private int shownAdCount;
    private com.bytedance.sdk.openadsdk.core.le.pno tvDesc;
    private com.bytedance.sdk.openadsdk.core.le.pno tvDownload;
    private TextView tvTitle;

    public static final class ouw extends Drawable {

        /* JADX INFO: renamed from: lh, reason: collision with root package name */
        private final int f12448lh;
        public Path ouw = new Path();
        private final Drawable vt;

        @Override // android.graphics.drawable.Drawable
        public final int getOpacity() {
            return -3;
        }

        @Override // android.graphics.drawable.Drawable
        public final void setAlpha(int i10) {
        }

        @Override // android.graphics.drawable.Drawable
        public final void setColorFilter(@Nullable ColorFilter colorFilter) {
        }

        @Override // android.graphics.drawable.Drawable
        public final void draw(@NonNull Canvas canvas) {
            canvas.clipPath(this.ouw);
            canvas.drawColor(-1);
            this.vt.draw(canvas);
        }

        public ouw(Context context) {
            this.vt = vpp.lh(context, "tt_ad_bg_header_gradient");
            this.f12448lh = osn.ouw(context, 8.0f);
        }

        @Override // android.graphics.drawable.Drawable
        public final void setBounds(int i10, int i11, int i12, int i13) {
            super.setBounds(i10, i11, i12, i13);
            float f10 = i12;
            this.vt.setBounds(i10, i11, i12, (int) (((1.0f * f10) / this.vt.getIntrinsicWidth()) * this.vt.getIntrinsicHeight()));
            this.ouw.reset();
            Path path = this.ouw;
            RectF rectF = new RectF(0.0f, 0.0f, f10, i13);
            int i14 = this.f12448lh;
            path.addRoundRect(rectF, i14, i14, Path.Direction.CCW);
        }
    }

    private void initData(com.bytedance.sdk.openadsdk.core.model.vpp vppVar, com.bytedance.sdk.openadsdk.core.le.pno pnoVar) {
        setDownloadButtonData(pnoVar, vppVar, -1);
        bindIconData(this.ivIcon, vppVar);
        rn rnVar = this.rbScore;
        if (rnVar != null) {
            osn.ouw((TextView) null, rnVar, vppVar);
            if (vppVar.wp != null) {
                this.rbScore.setVisibility(0);
            }
        }
        if (this.tvTitle != null) {
            com.bytedance.sdk.openadsdk.core.model.le leVar = vppVar.wp;
            if (leVar != null && !TextUtils.isEmpty(leVar.vt)) {
                this.tvTitle.setText(vppVar.wp.vt);
            } else if (TextUtils.isEmpty(vppVar.f12883vh)) {
                this.tvTitle.setVisibility(8);
            } else {
                this.tvTitle.setText(vppVar.f12883vh);
            }
        }
        if (this.tvDesc != null) {
            String str = vppVar.fqk;
            if (TextUtils.isEmpty(str)) {
                this.tvDesc.setVisibility(8);
            } else {
                this.tvDesc.setText(str);
            }
        }
        this.adLogo.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.component.reward.view.RFEndCardBackUpLayout.1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Logger.d("Pangle|SafeDK: Execution> Lcom/bytedance/sdk/openadsdk/component/reward/view/RFEndCardBackUpLayout$1;->onClick(Landroid/view/View;)V");
                CreativeInfoManager.onViewClicked(g.f44975u, view);
                safedk_RFEndCardBackUpLayout$1_onClick_e3cd0b4f7141da5a0d1c7900657d88b3(view);
            }

            public void safedk_RFEndCardBackUpLayout$1_onClick_e3cd0b4f7141da5a0d1c7900657d88b3(View p10) {
                try {
                    TTWebsiteActivity.ouw(RFEndCardBackUpLayout.this.adContext.jvy, RFEndCardBackUpLayout.this.adContext.vt, RFEndCardBackUpLayout.this.adContext.fkw);
                } catch (Throwable unused) {
                }
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.core.le.lh, android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me2) {
        DetectTouchUtils.viewOnTouch(g.f44975u, this, me2);
        return super.dispatchTouchEvent(me2);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.bytedance.sdk.openadsdk.core.le.lh, android.widget.FrameLayout, android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        }
    }

    private void bindDescData(com.bytedance.sdk.openadsdk.core.le.pno pnoVar, com.bytedance.sdk.openadsdk.core.model.vpp vppVar) {
        if (pnoVar == null) {
            return;
        }
        String str = vppVar.hun;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        pnoVar.setText(str);
    }

    private void bindIconData(com.bytedance.sdk.openadsdk.core.le.yu yuVar, com.bytedance.sdk.openadsdk.core.model.vpp vppVar) {
        com.bytedance.sdk.openadsdk.core.model.zih zihVar;
        if (yuVar == null || (zihVar = vppVar.fak) == null || TextUtils.isEmpty(zihVar.ouw)) {
            return;
        }
        com.bytedance.sdk.openadsdk.th.vt.ouw();
        com.bytedance.sdk.openadsdk.th.vt.ouw(vppVar.fak, yuVar, vppVar);
    }

    private void bindTitleData(TextView textView, com.bytedance.sdk.openadsdk.core.model.vpp vppVar, String str) {
        if (textView != null) {
            com.bytedance.sdk.openadsdk.core.model.le leVar = vppVar.wp;
            if (leVar == null || TextUtils.isEmpty(leVar.vt)) {
                textView.setText(str);
            } else {
                textView.setText(vppVar.wp.vt);
            }
        }
    }

    private void initOneSlotMultipleAdsLayoutForThreeAdVertical(com.bytedance.sdk.openadsdk.core.le.fkw fkwVar) {
        com.bytedance.sdk.openadsdk.core.model.vpp vppVar = this.adContext.vt;
        if (vppVar != null) {
            List<com.bytedance.sdk.openadsdk.core.model.vpp> list = vppVar.f12885vm.yu;
            for (int i10 = 0; i10 < list.size() && i10 < 3; i10++) {
                initSingleCardInThreeCardStyle(fkwVar, list.get(i10), i10);
            }
        }
    }

    private void initOneSlotMultipleAdsLayoutForTwoAdVertical(com.bytedance.sdk.openadsdk.core.le.fkw fkwVar) {
        com.bytedance.sdk.openadsdk.core.model.vpp vppVar = this.adContext.vt;
        if (vppVar != null) {
            List<com.bytedance.sdk.openadsdk.core.model.vpp> list = vppVar.f12885vm.yu;
            for (int i10 = 0; i10 < list.size() && i10 < 2; i10++) {
                initSingleCardInTwoCardStyle(fkwVar, list.get(i10), i10);
            }
        }
    }

    private void initOneSlotMultipleAdsLayoutLandscape(com.bytedance.sdk.openadsdk.core.le.fkw fkwVar, int i10) {
        com.bytedance.sdk.openadsdk.core.model.vpp vppVar = this.adContext.vt;
        if (vppVar != null) {
            List<com.bytedance.sdk.openadsdk.core.model.vpp> list = vppVar.f12885vm.yu;
            for (int i11 = 0; i11 < list.size() && i11 < i10 && i11 < 3; i11++) {
                initSingleCardInTwoCardStyleLandscape(fkwVar, list.get(i11), i11, i10);
            }
        }
    }

    private void initSingleCardInTwoCardStyleLandscape(com.bytedance.sdk.openadsdk.core.le.fkw fkwVar, com.bytedance.sdk.openadsdk.core.model.vpp vppVar, int i10, int i11) {
        Context context = getContext();
        com.bytedance.sdk.openadsdk.core.le.fkw fkwVar2 = new com.bytedance.sdk.openadsdk.core.le.fkw(context);
        fkwVar2.setOrientation(1);
        fkwVar2.setGravity(1);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, -2);
        layoutParams.weight = 1.0f;
        if (i10 > 0) {
            layoutParams.setMargins(osn.ouw(context, 12.0f), 0, 0, 0);
        }
        fkwVar2.setBackground(new ouw(context));
        fkwVar.addView(fkwVar2, layoutParams);
        com.bytedance.sdk.openadsdk.core.le.fkw fkwVar3 = new com.bytedance.sdk.openadsdk.core.le.fkw(context);
        fkwVar3.setOrientation(0);
        fkwVar3.setGravity(48);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams2.topMargin = osn.ouw(context, 20.0f);
        layoutParams2.leftMargin = osn.ouw(context, 17.0f);
        layoutParams2.rightMargin = osn.ouw(context, 30.0f);
        fkwVar2.addView(fkwVar3, layoutParams2);
        zih zihVar = new zih(context);
        fkwVar3.addView(zihVar, new FrameLayout.LayoutParams(osn.ouw(context, 44.0f), osn.ouw(context, 44.0f)));
        bindIconData(zihVar, vppVar);
        com.bytedance.sdk.openadsdk.core.le.fkw fkwVar4 = new com.bytedance.sdk.openadsdk.core.le.fkw(context);
        fkwVar4.setOrientation(1);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams3.leftMargin = osn.ouw(context, 7.0f);
        fkwVar3.addView(fkwVar4, layoutParams3);
        com.bytedance.sdk.openadsdk.core.le.pno pnoVar = new com.bytedance.sdk.openadsdk.core.le.pno(context);
        pnoVar.setSingleLine(true);
        pnoVar.setEllipsize(TextUtils.TruncateAt.END);
        pnoVar.setTextSize(18.0f);
        pnoVar.setTextColor(Color.parseColor("#161823"));
        pnoVar.setGravity(GravityCompat.START);
        pnoVar.setTypeface(null, 1);
        fkwVar4.addView(pnoVar, new FrameLayout.LayoutParams(-1, -2));
        bindTitleData(pnoVar, vppVar, vppVar.f12883vh);
        com.bytedance.sdk.openadsdk.core.le.fkw fkwVar5 = new com.bytedance.sdk.openadsdk.core.le.fkw(context);
        fkwVar5.setOrientation(0);
        fkwVar5.setGravity(16);
        fkwVar4.addView(fkwVar5, new FrameLayout.LayoutParams(-2, -2));
        com.bytedance.sdk.openadsdk.core.le.pno pnoVar2 = new com.bytedance.sdk.openadsdk.core.le.pno(context);
        pnoVar2.setTextSize(16.0f);
        pnoVar2.setTextColor(Color.parseColor("#80161823"));
        fkwVar5.addView(pnoVar2, new ViewGroup.LayoutParams(-2, -2));
        rn rnVar = new rn(context);
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams4.leftMargin = osn.ouw(context, 8.0f);
        fkwVar5.addView(rnVar, layoutParams4);
        osn.ouw(pnoVar2, rnVar, vppVar, 18);
        com.bytedance.sdk.openadsdk.core.le.pno pnoVar3 = new com.bytedance.sdk.openadsdk.core.le.pno(context);
        if (i11 == 2) {
            pnoVar3.setSingleLine(true);
        } else {
            pnoVar3.setLines(2);
        }
        pnoVar3.setEllipsize(TextUtils.TruncateAt.END);
        pnoVar3.setTextSize(16.0f);
        pnoVar3.setTextColor(Color.parseColor("#80161823"));
        LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(-1, -2);
        int i12 = layoutParams2.leftMargin;
        layoutParams5.rightMargin = i12;
        layoutParams5.leftMargin = i12;
        layoutParams5.topMargin = osn.ouw(context, 12.0f);
        fkwVar2.addView(pnoVar3, layoutParams5);
        bindDescData(pnoVar3, vppVar);
        com.bytedance.sdk.openadsdk.core.le.pno pnoVar4 = new com.bytedance.sdk.openadsdk.core.le.pno(context);
        pnoVar4.setGravity(17);
        pnoVar4.setId(520093707);
        pnoVar4.setText(vpp.ouw(context, "tt_video_download_apk"));
        pnoVar4.setTextColor(-1);
        pnoVar4.setTextSize(2, 16.0f);
        pnoVar4.setBackground(com.bytedance.sdk.openadsdk.utils.cf.ouw(context, "tt_reward_full_video_backup_btn_bg"));
        FrameLayout.LayoutParams layoutParams6 = new FrameLayout.LayoutParams(-1, osn.ouw(context, 36.0f));
        layoutParams6.setMargins(osn.ouw(context, 20.0f), osn.ouw(context, 22.0f), osn.ouw(context, 20.0f), osn.ouw(context, 20.0f));
        fkwVar2.addView(pnoVar4, layoutParams6);
        setDownloadButtonData(pnoVar4, vppVar, i10);
    }

    @SuppressLint({"ClickableViewAccessibility"})
    private void initViews() {
        com.bytedance.sdk.openadsdk.activity.pno pnoVar;
        if (this.mInit) {
            return;
        }
        this.mInit = true;
        com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ouwVar = this.adContext;
        if (ouwVar.vt.tpk && (pnoVar = ouwVar.f12374gh) != null && pnoVar.fqk() && this.shownAdCount > 1) {
            initOneSlotMultipleAdsLayout();
            return;
        }
        com.bytedance.sdk.openadsdk.core.model.vpp vppVar = this.adContext.vt;
        if (vppVar.cd()) {
            initViewsForVast();
        } else {
            initViewsDefault();
            initData(vppVar, this.tvDownload);
        }
    }

    private void setDownloadButtonData(com.bytedance.sdk.openadsdk.core.le.pno pnoVar, com.bytedance.sdk.openadsdk.core.model.vpp vppVar, int i10) {
        com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ouwVar = this.adContext;
        com.bytedance.sdk.openadsdk.core.lh.fkw fkwVarOuw = ouwVar.f12371cd.ouw(ouwVar, vppVar);
        com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ouwVar2 = this.adContext;
        fkwVarOuw.ouw(com.bytedance.sdk.openadsdk.qbp.ouw.ouw.yu.ouw(ouwVar2.jvy, ouwVar2.fkw));
        if (i10 != -1) {
            HashMap map = new HashMap();
            int i11 = i10 + 1;
            map.put("ad_show_order", Integer.valueOf(i11));
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("ad_show_order", i11);
                map.put("pag_json_data", jSONObject.toString());
            } catch (Throwable unused) {
            }
            fkwVarOuw.ouw(map);
        }
        pnoVar.setOnClickListener(fkwVarOuw);
        pnoVar.setOnTouchListener(fkwVarOuw);
        CharSequence charSequenceVpp = vppVar.vpp();
        if (TextUtils.isEmpty(charSequenceVpp)) {
            return;
        }
        pnoVar.setText(charSequenceVpp);
    }

    public void init(com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ouwVar) {
        this.adContext = ouwVar;
        if (ouwVar.vt.cd()) {
            initViews();
        }
    }

    public void setShownAdCount(int i10) {
        this.shownAdCount = i10;
    }

    public RFEndCardBackUpLayout(Context context) {
        super(context);
        setVisibility(8);
        setId(com.bytedance.sdk.openadsdk.utils.rn.f13441vi);
    }

    private void initOneSlotMultipleAdsLayout() {
        Context context = getContext();
        setBackgroundColor(Color.parseColor("#C2FFFFFF"));
        com.bytedance.sdk.openadsdk.core.le.fkw fkwVar = new com.bytedance.sdk.openadsdk.core.le.fkw(context);
        fkwVar.setOrientation(1);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        layoutParams.setMargins(osn.ouw(context, 16.0f), 0, osn.ouw(context, 16.0f), 0);
        layoutParams.gravity = 17;
        addView(fkwVar, layoutParams);
        if (this.adContext.ucs == 2) {
            com.bytedance.sdk.openadsdk.core.le.fkw fkwVar2 = new com.bytedance.sdk.openadsdk.core.le.fkw(context);
            fkwVar2.setOrientation(0);
            fkwVar.addView(fkwVar2, new FrameLayout.LayoutParams(-1, -2));
            initOneSlotMultipleAdsLayoutLandscape(fkwVar2, this.shownAdCount);
        } else if (this.shownAdCount == 2) {
            initOneSlotMultipleAdsLayoutForTwoAdVertical(fkwVar);
        } else {
            initOneSlotMultipleAdsLayoutForThreeAdVertical(fkwVar);
        }
        com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ouwVar = this.adContext;
        View viewCreatePAGLogoViewByMaterial = PAGLogoView.createPAGLogoViewByMaterial(ouwVar.jvy, ouwVar.vt);
        viewCreatePAGLogoViewByMaterial.setId(520093757);
        fkwVar.addView(viewCreatePAGLogoViewByMaterial);
        viewCreatePAGLogoViewByMaterial.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.component.reward.view.RFEndCardBackUpLayout.2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Logger.d("Pangle|SafeDK: Execution> Lcom/bytedance/sdk/openadsdk/component/reward/view/RFEndCardBackUpLayout$2;->onClick(Landroid/view/View;)V");
                CreativeInfoManager.onViewClicked(g.f44975u, view);
                safedk_RFEndCardBackUpLayout$2_onClick_44d18a2021a676cfae96a2f3caf48cf7(view);
            }

            public void safedk_RFEndCardBackUpLayout$2_onClick_44d18a2021a676cfae96a2f3caf48cf7(View p10) {
                TTWebsiteActivity.ouw(RFEndCardBackUpLayout.this.adContext.jvy, RFEndCardBackUpLayout.this.adContext.vt, RFEndCardBackUpLayout.this.adContext.fkw);
            }
        });
    }

    private void initSingleCardInThreeCardStyle(com.bytedance.sdk.openadsdk.core.le.fkw fkwVar, com.bytedance.sdk.openadsdk.core.model.vpp vppVar, int i10) {
        int iOuw;
        Context context = getContext();
        com.bytedance.sdk.openadsdk.core.le.fkw fkwVar2 = new com.bytedance.sdk.openadsdk.core.le.fkw(context);
        fkwVar2.setOrientation(1);
        fkwVar2.setGravity(1);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        if (i10 > 0) {
            iOuw = osn.ouw(context, 12.0f);
        } else {
            iOuw = 0;
        }
        layoutParams.setMargins(0, iOuw, 0, 0);
        fkwVar2.setBackground(new ouw(context));
        fkwVar.addView(fkwVar2, layoutParams);
        com.bytedance.sdk.openadsdk.core.le.fkw fkwVar3 = new com.bytedance.sdk.openadsdk.core.le.fkw(context);
        fkwVar3.setOrientation(0);
        fkwVar3.setGravity(16);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams2.topMargin = osn.ouw(context, 20.0f);
        layoutParams2.leftMargin = osn.ouw(context, 17.0f);
        layoutParams2.rightMargin = osn.ouw(context, 30.0f);
        fkwVar2.addView(fkwVar3, layoutParams2);
        zih zihVar = new zih(context);
        fkwVar3.addView(zihVar, new FrameLayout.LayoutParams(osn.ouw(context, 70.0f), osn.ouw(context, 63.0f)));
        bindIconData(zihVar, vppVar);
        com.bytedance.sdk.openadsdk.core.le.fkw fkwVar4 = new com.bytedance.sdk.openadsdk.core.le.fkw(context);
        fkwVar4.setOrientation(1);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams3.leftMargin = osn.ouw(context, 7.0f);
        fkwVar3.addView(fkwVar4, layoutParams3);
        com.bytedance.sdk.openadsdk.core.le.pno pnoVar = new com.bytedance.sdk.openadsdk.core.le.pno(context);
        pnoVar.setSingleLine(true);
        pnoVar.setEllipsize(TextUtils.TruncateAt.END);
        pnoVar.setTextSize(18.0f);
        pnoVar.setTextColor(Color.parseColor("#161823"));
        pnoVar.setGravity(GravityCompat.START);
        pnoVar.setTypeface(null, 1);
        fkwVar4.addView(pnoVar, new FrameLayout.LayoutParams(-1, -2));
        bindTitleData(pnoVar, vppVar, vppVar.f12883vh);
        com.bytedance.sdk.openadsdk.core.le.pno pnoVar2 = new com.bytedance.sdk.openadsdk.core.le.pno(context);
        pnoVar2.setSingleLine(true);
        pnoVar2.setEllipsize(TextUtils.TruncateAt.END);
        pnoVar2.setTextSize(16.0f);
        pnoVar2.setTextColor(Color.parseColor("#80161823"));
        fkwVar4.addView(pnoVar2, new FrameLayout.LayoutParams(-1, -2));
        bindDescData(pnoVar2, vppVar);
        com.bytedance.sdk.openadsdk.core.le.fkw fkwVar5 = new com.bytedance.sdk.openadsdk.core.le.fkw(context);
        fkwVar5.setOrientation(0);
        fkwVar5.setGravity(16);
        fkwVar4.addView(fkwVar5, new FrameLayout.LayoutParams(-2, -2));
        com.bytedance.sdk.openadsdk.core.le.pno pnoVar3 = new com.bytedance.sdk.openadsdk.core.le.pno(context);
        pnoVar3.setTextSize(16.0f);
        pnoVar3.setTextColor(Color.parseColor("#80161823"));
        fkwVar5.addView(pnoVar3, new ViewGroup.LayoutParams(-2, -2));
        rn rnVar = new rn(context);
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams4.leftMargin = osn.ouw(context, 8.0f);
        fkwVar5.addView(rnVar, layoutParams4);
        osn.ouw(pnoVar3, rnVar, vppVar, 18);
        com.bytedance.sdk.openadsdk.core.le.pno pnoVar4 = new com.bytedance.sdk.openadsdk.core.le.pno(context);
        pnoVar4.setGravity(17);
        pnoVar4.setId(520093707);
        pnoVar4.setText(vpp.ouw(context, "tt_video_download_apk"));
        pnoVar4.setTextColor(-1);
        pnoVar4.setTextSize(2, 16.0f);
        pnoVar4.setBackground(com.bytedance.sdk.openadsdk.utils.cf.ouw(context, "tt_reward_full_video_backup_btn_bg"));
        FrameLayout.LayoutParams layoutParams5 = new FrameLayout.LayoutParams(-1, osn.ouw(context, 36.0f));
        layoutParams5.setMargins(osn.ouw(context, 20.0f), osn.ouw(context, 22.0f), osn.ouw(context, 20.0f), osn.ouw(context, 20.0f));
        fkwVar2.addView(pnoVar4, layoutParams5);
        setDownloadButtonData(pnoVar4, vppVar, i10);
    }

    private void initSingleCardInTwoCardStyle(com.bytedance.sdk.openadsdk.core.le.fkw fkwVar, com.bytedance.sdk.openadsdk.core.model.vpp vppVar, int i10) {
        int iOuw;
        Context context = getContext();
        com.bytedance.sdk.openadsdk.core.le.fkw fkwVar2 = new com.bytedance.sdk.openadsdk.core.le.fkw(context);
        fkwVar2.setOrientation(1);
        fkwVar2.setGravity(1);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        if (i10 > 0) {
            iOuw = osn.ouw(context, 12.0f);
        } else {
            iOuw = 0;
        }
        layoutParams.setMargins(0, iOuw, 0, 0);
        fkwVar2.setBackground(new ouw(context));
        fkwVar.addView(fkwVar2, layoutParams);
        zih zihVar = new zih(context);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(osn.ouw(context, 70.0f), osn.ouw(context, 63.0f));
        layoutParams2.setMargins(0, osn.ouw(context, 24.0f), 0, osn.ouw(context, 12.0f));
        fkwVar2.addView(zihVar, layoutParams2);
        bindIconData(zihVar, vppVar);
        com.bytedance.sdk.openadsdk.core.le.pno pnoVar = new com.bytedance.sdk.openadsdk.core.le.pno(context);
        pnoVar.setSingleLine(true);
        pnoVar.setEllipsize(TextUtils.TruncateAt.END);
        pnoVar.setTextSize(18.0f);
        pnoVar.setTextColor(Color.parseColor("#161823"));
        pnoVar.setGravity(17);
        pnoVar.setTypeface(null, 1);
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-1, -2);
        layoutParams3.setMargins(osn.ouw(context, 56.0f), 0, osn.ouw(context, 56.0f), 0);
        fkwVar2.addView(pnoVar, layoutParams3);
        bindTitleData(pnoVar, vppVar, vppVar.f12883vh);
        com.bytedance.sdk.openadsdk.core.le.pno pnoVar2 = new com.bytedance.sdk.openadsdk.core.le.pno(context);
        pnoVar2.setSingleLine(true);
        pnoVar2.setEllipsize(TextUtils.TruncateAt.END);
        pnoVar2.setTextSize(16.0f);
        pnoVar2.setTextColor(Color.parseColor("#80161823"));
        FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams(-1, -2);
        layoutParams4.setMargins(osn.ouw(context, 56.0f), osn.ouw(context, 4.0f), osn.ouw(context, 56.0f), 0);
        fkwVar2.addView(pnoVar2, layoutParams4);
        bindDescData(pnoVar2, vppVar);
        com.bytedance.sdk.openadsdk.core.le.fkw fkwVar3 = new com.bytedance.sdk.openadsdk.core.le.fkw(context);
        fkwVar3.setOrientation(0);
        fkwVar3.setGravity(16);
        fkwVar2.addView(fkwVar3, new FrameLayout.LayoutParams(-2, -2));
        com.bytedance.sdk.openadsdk.core.le.pno pnoVar3 = new com.bytedance.sdk.openadsdk.core.le.pno(context);
        pnoVar3.setTextSize(16.0f);
        pnoVar3.setTextColor(Color.parseColor("#80161823"));
        fkwVar3.addView(pnoVar3, new ViewGroup.LayoutParams(-2, -2));
        rn rnVar = new rn(context);
        LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams5.leftMargin = osn.ouw(context, 8.0f);
        fkwVar3.addView(rnVar, layoutParams5);
        osn.ouw(pnoVar3, rnVar, vppVar, 18);
        com.bytedance.sdk.openadsdk.core.le.pno pnoVar4 = new com.bytedance.sdk.openadsdk.core.le.pno(context);
        pnoVar4.setGravity(17);
        pnoVar4.setId(520093707);
        pnoVar4.setText(vpp.ouw(context, "tt_video_download_apk"));
        pnoVar4.setTextColor(-1);
        pnoVar4.setTextSize(2, 16.0f);
        pnoVar4.setBackground(com.bytedance.sdk.openadsdk.utils.cf.ouw(context, "tt_reward_full_video_backup_btn_bg"));
        FrameLayout.LayoutParams layoutParams6 = new FrameLayout.LayoutParams(-1, osn.ouw(context, 36.0f));
        layoutParams6.setMargins(osn.ouw(context, 20.0f), osn.ouw(context, 36.0f), osn.ouw(context, 20.0f), osn.ouw(context, 20.0f));
        fkwVar2.addView(pnoVar4, layoutParams6);
        setDownloadButtonData(pnoVar4, vppVar, i10);
    }

    private void initViewsDefault() {
        boolean z10;
        FrameLayout.LayoutParams layoutParams;
        Context context = getContext();
        if (this.adContext.vt.jqy() == 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        setBackgroundColor(ViewCompat.MEASURED_STATE_MASK);
        com.bytedance.sdk.openadsdk.core.le.fkw fkwVar = new com.bytedance.sdk.openadsdk.core.le.fkw(context);
        fkwVar.setGravity(1);
        fkwVar.setOrientation(1);
        if (z10) {
            layoutParams = new FrameLayout.LayoutParams(-1, -2);
        } else {
            layoutParams = new FrameLayout.LayoutParams(osn.ouw(context, 327.0f), -2);
        }
        layoutParams.gravity = 17;
        int iOuw = osn.ouw(context, 24.0f);
        layoutParams.rightMargin = iOuw;
        layoutParams.leftMargin = iOuw;
        addView(fkwVar, layoutParams);
        zih zihVar = new zih(context);
        this.ivIcon = zihVar;
        zihVar.setBackgroundColor(0);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(osn.ouw(context, 80.0f), osn.ouw(context, 80.0f));
        layoutParams2.bottomMargin = osn.ouw(context, 12.0f);
        fkwVar.addView(this.ivIcon, layoutParams2);
        com.bytedance.sdk.openadsdk.core.le.pno pnoVar = new com.bytedance.sdk.openadsdk.core.le.pno(context);
        this.tvTitle = pnoVar;
        pnoVar.setEllipsize(TextUtils.TruncateAt.END);
        this.tvTitle.setGravity(17);
        this.tvTitle.setMaxLines(2);
        this.tvTitle.setMaxWidth(osn.ouw(context, 180.0f));
        this.tvTitle.setTextColor(-1);
        this.tvTitle.setTextSize(2, 24.0f);
        fkwVar.addView(this.tvTitle, new LinearLayout.LayoutParams(-1, -2));
        com.bytedance.sdk.openadsdk.core.le.pno pnoVar2 = new com.bytedance.sdk.openadsdk.core.le.pno(context);
        this.tvDesc = pnoVar2;
        pnoVar2.setEllipsize(TextUtils.TruncateAt.END);
        this.tvDesc.setGravity(17);
        this.tvDesc.setMaxLines(2);
        this.tvDesc.setTextColor(Color.parseColor("#BFFFFFFF"));
        this.tvDesc.setTextSize(2, 16.0f);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams3.topMargin = osn.ouw(context, 8.0f);
        fkwVar.addView(this.tvDesc, layoutParams3);
        this.rbScore = new rn(context, true);
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-2, osn.ouw(context, 16.0f));
        layoutParams4.topMargin = osn.ouw(context, 12.0f);
        this.rbScore.setVisibility(8);
        fkwVar.addView(this.rbScore, layoutParams4);
        com.bytedance.sdk.openadsdk.core.le.pno pnoVar3 = new com.bytedance.sdk.openadsdk.core.le.pno(context);
        this.tvDownload = pnoVar3;
        pnoVar3.setId(520093707);
        this.tvDownload.setGravity(17);
        this.tvDownload.setText(vpp.ouw(context, "tt_video_download_apk"));
        this.tvDownload.setTextColor(-1);
        this.tvDownload.setTextSize(2, 16.0f);
        this.tvDownload.setBackground(com.bytedance.sdk.openadsdk.utils.cf.ouw(context, "tt_reward_full_video_backup_btn_bg"));
        LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(-1, osn.ouw(context, 44.0f));
        layoutParams5.topMargin = osn.ouw(context, 54.0f);
        fkwVar.addView(this.tvDownload, layoutParams5);
        this.adLogo = PAGLogoView.createPAGLogoViewByMaterial(context, this.adContext.vt);
        FrameLayout.LayoutParams layoutParams6 = new FrameLayout.LayoutParams(-2, osn.ouw(context, 14.0f));
        layoutParams6.gravity = BadgeDrawable.BOTTOM_START;
        layoutParams6.leftMargin = osn.ouw(context, 18.0f);
        if (z10) {
            layoutParams6.bottomMargin = osn.ouw(context, 61.0f);
        } else {
            layoutParams6.bottomMargin = osn.ouw(context, 24.0f);
        }
        addView(this.adLogo, layoutParams6);
    }

    private void initViewsForVast() {
        Context context = getContext();
        setBackgroundColor(ViewCompat.MEASURED_STATE_MASK);
        com.bytedance.sdk.openadsdk.core.le.yu yuVar = new com.bytedance.sdk.openadsdk.core.le.yu(context);
        yuVar.setId(com.bytedance.sdk.openadsdk.utils.rn.pno);
        yuVar.setVisibility(8);
        addView(yuVar, new FrameLayout.LayoutParams(-1, -1));
        View leVar = new com.bytedance.sdk.component.bly.le(context, true, com.bytedance.sdk.component.bly.le.lh.VAST_ENDCARD);
        leVar.setVisibility(8);
        leVar.setId(com.bytedance.sdk.openadsdk.utils.rn.bly);
        addView(leVar, new FrameLayout.LayoutParams(-1, -1));
    }

    @Override // android.view.View
    public void setVisibility(int i10) {
        super.setVisibility(i10);
        if (i10 == 0) {
            initViews();
        }
    }
}
