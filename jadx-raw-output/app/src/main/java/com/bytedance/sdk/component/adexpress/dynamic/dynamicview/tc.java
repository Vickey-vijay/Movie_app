package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.content.Context;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.TextView;
import androidx.core.view.GravityCompat;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.utils.g;
import java.text.DecimalFormat;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;

/* JADX INFO: loaded from: classes11.dex */
public final class tc extends le {
    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.le, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.fkw, android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me2) {
        DetectTouchUtils.viewOnTouch(g.f44975u, this, me2);
        return super.dispatchTouchEvent(me2);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.le, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.fkw, android.widget.FrameLayout, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        }
    }

    public final String getText() {
        String strFkw = this.ryl.fkw();
        if (TextUtils.isEmpty(strFkw)) {
            if (!com.bytedance.sdk.component.adexpress.yu.vt() && TextUtils.equals(this.mwh.bly.ouw, "text_star")) {
                strFkw = CampaignEx.CLICKMODE_ON;
            }
            if (!com.bytedance.sdk.component.adexpress.yu.vt() && TextUtils.equals(this.mwh.bly.ouw, "score-count")) {
                strFkw = "6870";
            }
        }
        return (TextUtils.equals(this.mwh.bly.ouw, "title") || TextUtils.equals(this.mwh.bly.ouw, "subtitle")) ? strFkw.replace("\n", "") : strFkw;
    }

    public tc(Context context, DynamicRootView dynamicRootView, com.bytedance.sdk.component.adexpress.dynamic.yu.pno pnoVar) {
        super(context, dynamicRootView, pnoVar);
        this.pno += 6;
        if (this.ryl.yu.f11458vh) {
            int iLe = this.ryl.le();
            com.bytedance.sdk.component.adexpress.dynamic.yu.ra raVar = this.ryl;
            com.bytedance.sdk.component.adexpress.le.ouw ouwVar = new com.bytedance.sdk.component.adexpress.le.ouw(context, iLe, raVar.yu.pno, raVar.ra());
            this.f11364ko = ouwVar;
            ouwVar.setMaxLines(1);
        } else {
            TextView textView = new TextView(context);
            this.f11364ko = textView;
            textView.setIncludeFontPadding(false);
        }
        this.f11364ko.setTag(Integer.valueOf(getClickArea()));
        addView(this.f11364ko, getWidgetLayoutParams());
    }

    /* JADX WARN: Code duplicated, block: B:147:0x04c1  */
    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.le, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.bs
    public final boolean ra() {
        int i10;
        int i11;
        int iOuw;
        boolean z10;
        super.ra();
        if (TextUtils.isEmpty(getText())) {
            this.f11364ko.setVisibility(4);
            return true;
        }
        com.bytedance.sdk.component.adexpress.dynamic.yu.ra raVar = this.ryl;
        if (raVar.yu.f11458vh) {
            if (this.f11364ko instanceof com.bytedance.sdk.component.adexpress.le.ouw) {
                String text = getText();
                ArrayList arrayList = new ArrayList();
                try {
                    JSONArray jSONArray = new JSONArray(text);
                    for (int i12 = 0; i12 < jSONArray.length(); i12++) {
                        arrayList.add(jSONArray.optString(i12));
                    }
                } catch (JSONException e10) {
                    e10.printStackTrace();
                    arrayList.add(text);
                }
                ((com.bytedance.sdk.component.adexpress.le.ouw) this.f11364ko).setMaxLines(1);
                ((com.bytedance.sdk.component.adexpress.le.ouw) this.f11364ko).setTextColor(this.ryl.le());
                ((com.bytedance.sdk.component.adexpress.le.ouw) this.f11364ko).setTextSize(this.ryl.yu.pno);
                ((com.bytedance.sdk.component.adexpress.le.ouw) this.f11364ko).setAnimationText(arrayList);
                ((com.bytedance.sdk.component.adexpress.le.ouw) this.f11364ko).setAnimationType(this.ryl.yu.yib);
                ((com.bytedance.sdk.component.adexpress.le.ouw) this.f11364ko).setAnimationDuration(this.ryl.yu.yhj * 1000);
                com.bytedance.sdk.component.adexpress.le.ouw ouwVar = (com.bytedance.sdk.component.adexpress.le.ouw) this.f11364ko;
                int i13 = ouwVar.vt;
                if (i13 == 1) {
                    ouwVar.setInAnimation(ouwVar.getContext(), com.bytedance.sdk.component.utils.vpp.pno(ouwVar.ouw, "tt_text_animation_y_in"));
                    ouwVar.setOutAnimation(ouwVar.getContext(), com.bytedance.sdk.component.utils.vpp.pno(ouwVar.ouw, "tt_text_animation_y_out"));
                } else if (i13 == 0) {
                    ouwVar.setInAnimation(ouwVar.getContext(), com.bytedance.sdk.component.utils.vpp.pno(ouwVar.ouw, "tt_text_animation_x_in"));
                    ouwVar.setOutAnimation(ouwVar.getContext(), com.bytedance.sdk.component.utils.vpp.pno(ouwVar.ouw, "tt_text_animation_x_in"));
                    ouwVar.getInAnimation().setInterpolator(new LinearInterpolator());
                    ouwVar.getOutAnimation().setInterpolator(new LinearInterpolator());
                    ouwVar.getInAnimation().setAnimationListener(ouwVar.yu);
                    ouwVar.getOutAnimation().setAnimationListener(ouwVar.yu);
                }
                ouwVar.f11520lh.sendEmptyMessage(1);
            }
            return true;
        }
        ((TextView) this.f11364ko).setText(raVar.fkw());
        ((TextView) this.f11364ko).setTextDirection(5);
        this.f11364ko.setTextAlignment(this.ryl.ra());
        ((TextView) this.f11364ko).setTextColor(this.ryl.le());
        ((TextView) this.f11364ko).setTextSize(this.ryl.yu.pno);
        com.bytedance.sdk.component.adexpress.dynamic.yu.le leVar = this.ryl.yu;
        if (!leVar.uq) {
            ((TextView) this.f11364ko).setMaxLines(1);
            ((TextView) this.f11364ko).setGravity(17);
            ((TextView) this.f11364ko).setEllipsize(TextUtils.TruncateAt.END);
        } else {
            int i14 = leVar.f11449pd;
            if (i14 > 0) {
                ((TextView) this.f11364ko).setLines(i14);
                ((TextView) this.f11364ko).setEllipsize(TextUtils.TruncateAt.END);
            }
        }
        com.bytedance.sdk.component.adexpress.dynamic.yu.pno pnoVar = this.mwh;
        if (pnoVar != null && pnoVar.bly != null) {
            if (com.bytedance.sdk.component.adexpress.yu.vt()) {
                DynamicRootView dynamicRootView = this.f11363jg;
                if (dynamicRootView != null && dynamicRootView.getRenderRequest() != null && this.f11363jg.getRenderRequest().f11596le != 4) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10 && (TextUtils.equals(this.mwh.bly.ouw, "text_star") || TextUtils.equals(this.mwh.bly.ouw, "score-count") || TextUtils.equals(this.mwh.bly.ouw, "score-count-type-1") || TextUtils.equals(this.mwh.bly.ouw, "score-count-type-2"))) {
                    setVisibility(8);
                    return true;
                }
            }
            if (!TextUtils.equals(this.mwh.bly.ouw, "score-count") && !TextUtils.equals(this.mwh.bly.ouw, "score-count-type-2")) {
                if (TextUtils.equals(this.mwh.bly.ouw, "text_star")) {
                    double d10 = -1.0d;
                    try {
                        d10 = Double.parseDouble(getText());
                    } catch (Exception e11) {
                        com.bytedance.sdk.component.utils.ko.fkw("DynamicStarView applyNativeStyle", e11.toString());
                    }
                    if (d10 < 0.0d || d10 > 5.0d) {
                        if (com.bytedance.sdk.component.adexpress.yu.vt()) {
                            setVisibility(8);
                            return true;
                        }
                        this.f11364ko.setVisibility(0);
                    }
                    ((TextView) this.f11364ko).setIncludeFontPadding(false);
                    ((TextView) this.f11364ko).setText(String.format("%.1f", Double.valueOf(d10)));
                } else if (TextUtils.equals("privacy-detail", this.mwh.bly.ouw)) {
                    ((TextView) this.f11364ko).setText("Permission list | Privacy policy");
                } else if (TextUtils.equals(this.mwh.bly.ouw, "development-name")) {
                    ((TextView) this.f11364ko).setText(com.bytedance.sdk.component.utils.vpp.ouw(com.bytedance.sdk.component.adexpress.yu.ouw(), "tt_text_privacy_development") + getText());
                } else if (TextUtils.equals(this.mwh.bly.ouw, "app-version")) {
                    ((TextView) this.f11364ko).setText(com.bytedance.sdk.component.utils.vpp.ouw(com.bytedance.sdk.component.adexpress.yu.ouw(), "tt_text_privacy_app_version") + getText());
                } else {
                    ((TextView) this.f11364ko).setText(getText());
                }
            } else {
                try {
                    try {
                        i10 = Integer.parseInt(getText());
                    } catch (Exception unused) {
                    }
                } catch (NumberFormatException unused2) {
                    i10 = -1;
                }
                if (i10 < 0) {
                    if (com.bytedance.sdk.component.adexpress.yu.vt()) {
                        setVisibility(8);
                        return true;
                    }
                    this.f11364ko.setVisibility(0);
                }
                if (TextUtils.equals(this.mwh.bly.ouw, "score-count-type-2")) {
                    ((TextView) this.f11364ko).setText(String.format(new DecimalFormat("(###,###,###)").format(i10), Integer.valueOf(i10)));
                    ((TextView) this.f11364ko).setGravity(17);
                    return true;
                }
                TextView textView = (TextView) this.f11364ko;
                textView.setText("(" + String.format(com.bytedance.sdk.component.utils.vpp.ouw(getContext(), "tt_comment_num"), Integer.valueOf(i10)) + ")");
                if (i10 == -1) {
                    textView.setVisibility(8);
                }
            }
            this.f11364ko.setTextAlignment(this.ryl.ra());
            TextView textView2 = (TextView) this.f11364ko;
            int iRa = this.ryl.ra();
            if (iRa == 4) {
                i11 = 17;
            } else if (iRa == 3) {
                i11 = GravityCompat.END;
            } else {
                i11 = GravityCompat.START;
            }
            textView2.setGravity(i11);
            if (com.bytedance.sdk.component.adexpress.yu.vt()) {
                if (TextUtils.equals(this.mwh.bly.ouw, "source") || TextUtils.equals(this.mwh.bly.ouw, "title") || TextUtils.equals(this.mwh.bly.ouw, "text_star")) {
                    int[] iArrOuw = com.bytedance.sdk.component.adexpress.dynamic.fkw.cf.ouw(this.ryl.fkw(), this.ryl.yu.pno, true);
                    int iOuw2 = (int) com.bytedance.sdk.component.adexpress.yu.ra.ouw(getContext(), this.ryl.vt());
                    int iOuw3 = (int) com.bytedance.sdk.component.adexpress.yu.ra.ouw(getContext(), this.ryl.lh());
                    int iOuw4 = (int) com.bytedance.sdk.component.adexpress.yu.ra.ouw(getContext(), this.ryl.yu());
                    int iOuw5 = (int) com.bytedance.sdk.component.adexpress.yu.ra.ouw(getContext(), this.ryl.ouw());
                    int iMin = Math.min(iOuw2, iOuw5);
                    if (TextUtils.equals(this.mwh.bly.ouw, "source") && (iOuw = ((this.pno - ((int) com.bytedance.sdk.component.adexpress.yu.ra.ouw(getContext(), this.ryl.yu.pno))) - iOuw2) - iOuw5) > 1 && iOuw <= iMin * 2) {
                        int i15 = iOuw / 2;
                        this.f11364ko.setPadding(iOuw3, iOuw2 - i15, iOuw4, iOuw5 - (iOuw - i15));
                    } else {
                        int i16 = (((iArrOuw[1] + iOuw2) + iOuw5) - this.pno) - 2;
                        if (i16 > 1) {
                            if (i16 <= iMin * 2) {
                                int i17 = i16 / 2;
                                this.f11364ko.setPadding(iOuw3, iOuw2 - i17, iOuw4, iOuw5 - (i16 - i17));
                            } else if (i16 <= iOuw2 + iOuw5) {
                                if (iOuw2 > iOuw5) {
                                    this.f11364ko.setPadding(iOuw3, iOuw2 - (i16 - iMin), iOuw4, iOuw5 - iMin);
                                } else {
                                    this.f11364ko.setPadding(iOuw3, iOuw2 - iMin, iOuw4, iOuw5 - (i16 - iMin));
                                }
                            } else {
                                final int i18 = (i16 - iOuw2) - iOuw5;
                                this.f11364ko.setPadding(iOuw3, 0, iOuw4, 0);
                                if (i18 <= ((int) com.bytedance.sdk.component.adexpress.yu.ra.ouw(getContext(), 1.0f)) + 1) {
                                    ((TextView) this.f11364ko).setTextSize(this.ryl.yu.pno - 1.0f);
                                } else if (i18 <= (((int) com.bytedance.sdk.component.adexpress.yu.ra.ouw(getContext(), 1.0f)) + 1) * 2) {
                                    ((TextView) this.f11364ko).setTextSize(this.ryl.yu.pno - 2.0f);
                                } else {
                                    post(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.dynamic.dynamicview.tc.1
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            try {
                                                ViewGroup.LayoutParams layoutParams = tc.this.f11364ko.getLayoutParams();
                                                tc tcVar = tc.this;
                                                layoutParams.height = tcVar.pno + i18;
                                                tcVar.f11364ko.setLayoutParams(layoutParams);
                                                tc.this.f11364ko.setTranslationY(-i18);
                                                ((ViewGroup) tc.this.f11364ko.getParent()).setClipChildren(false);
                                                ((ViewGroup) tc.this.f11364ko.getParent().getParent()).setClipChildren(false);
                                            } catch (Throwable unused3) {
                                            }
                                        }
                                    });
                                }
                            }
                            if (TextUtils.equals(this.mwh.bly.ouw, "fillButton")) {
                                this.f11364ko.setTextAlignment(2);
                                ((TextView) this.f11364ko).setGravity(17);
                            }
                        }
                    }
                } else if (TextUtils.equals(this.mwh.bly.ouw, "fillButton")) {
                    this.f11364ko.setTextAlignment(2);
                    ((TextView) this.f11364ko).setGravity(17);
                }
            }
        }
        return true;
    }
}
