package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.AnimatedImageDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.internal.partials.PangleVideoBridge;
import com.safedk.android.utils.g;
import java.lang.ref.WeakReference;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class cf extends le {
    private String ouw;

    public static class ouw implements com.bytedance.sdk.component.fkw.pno {
        private final WeakReference<Context> ouw;

        @Override // com.bytedance.sdk.component.fkw.pno
        public final Bitmap ouw(Bitmap bitmap) {
            Context context = this.ouw.get();
            if (context != null) {
                return com.bytedance.sdk.component.adexpress.yu.ouw.ouw(context, bitmap, 25);
            }
            return null;
        }

        public ouw(Context context) {
            this.ouw = new WeakReference<>(context);
        }
    }

    public static class vt implements com.bytedance.sdk.component.fkw.rn {
        private WeakReference<View> ouw;
        private Resources vt;

        @Override // com.bytedance.sdk.component.fkw.rn
        public final void ouw(int i10, String str, @Nullable Throwable th2) {
        }

        @Override // com.bytedance.sdk.component.fkw.rn
        public final void ouw(com.bytedance.sdk.component.fkw.cf cfVar) {
            Object objVt;
            View view = this.ouw.get();
            if (view == null || (objVt = cfVar.vt()) == null || cfVar.lh() == null) {
                return;
            }
            if (objVt instanceof Bitmap) {
                view.setBackground(new BitmapDrawable(this.vt, (Bitmap) objVt));
            } else if (objVt instanceof Drawable) {
                if (Build.VERSION.SDK_INT >= 28 && (objVt instanceof AnimatedImageDrawable)) {
                    ((AnimatedImageDrawable) objVt).start();
                }
                view.setBackground((Drawable) objVt);
            }
        }

        public vt(View view, Resources resources) {
            this.ouw = new WeakReference<>(view);
            this.vt = resources;
        }
    }

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

    private String getImageKey() {
        Map<String, String> map = this.f11363jg.getRenderRequest().f11600ra;
        if (map == null || map.size() <= 0) {
            return null;
        }
        return map.get(this.ryl.bly());
    }

    private boolean pno() {
        com.bytedance.sdk.component.adexpress.dynamic.yu.ra raVar = this.ryl;
        String str = raVar.f11478le;
        if (raVar.yu.odc) {
            return true;
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            JSONObject jSONObjectJsonObjectInit = PangleVideoBridge.jsonObjectInit(str);
            return Math.abs((((float) this.f11367ra) / (((float) this.pno) * 1.0f)) - (((float) jSONObjectJsonObjectInit.optInt("width")) / (((float) jSONObjectJsonObjectInit.optInt("height")) * 1.0f))) > 0.01f;
        } catch (JSONException e10) {
            e10.printStackTrace();
            return false;
        }
    }

    public cf(Context context, @NonNull DynamicRootView dynamicRootView, @NonNull com.bytedance.sdk.component.adexpress.dynamic.yu.pno pnoVar) {
        Uri uri;
        super(context, dynamicRootView, pnoVar);
        if (!TextUtils.isEmpty(this.ryl.yu.f11437fn) && pnoVar.f11472jg) {
            com.bytedance.sdk.component.adexpress.le.tlj tljVar = new com.bytedance.sdk.component.adexpress.le.tlj(context);
            tljVar.setAnimationsLoop(this.ryl.yu.byv);
            tljVar.setImageLottieTosPath(this.ryl.yu.f11437fn);
            tljVar.setLottieAppNameMaxLength(this.ryl.yu.ehk);
            tljVar.setLottieAdTitleMaxLength(this.ryl.yu.f11440ki);
            tljVar.setLottieAdDescMaxLength(this.ryl.yu.xwt);
            tljVar.setData(pnoVar.f11473ko);
            this.f11364ko = tljVar;
        } else if (this.ryl.yu.ouw > 0.0f) {
            com.bytedance.sdk.component.adexpress.le.tc tcVar = new com.bytedance.sdk.component.adexpress.le.tc(context);
            this.f11364ko = tcVar;
            tcVar.setXRound((int) com.bytedance.sdk.component.adexpress.yu.ra.ouw(context, this.ryl.yu.ouw));
            ((com.bytedance.sdk.component.adexpress.le.tc) this.f11364ko).setYRound((int) com.bytedance.sdk.component.adexpress.yu.ra.ouw(context, this.ryl.yu.ouw));
        } else if (!le() && "arrowButton".equals(pnoVar.bly.ouw)) {
            com.bytedance.sdk.component.adexpress.dynamic.animation.view.vt vtVar = new com.bytedance.sdk.component.adexpress.dynamic.animation.view.vt(context);
            vtVar.setBrickNativeValue(this.ryl);
            this.f11364ko = vtVar;
        } else {
            String strBly = this.ryl.bly();
            boolean zEndsWith = false;
            if (!TextUtils.isEmpty(strBly) && (uri = Uri.parse(strBly)) != null) {
                String path = uri.getPath();
                if (!TextUtils.isEmpty(path)) {
                    zEndsWith = path.endsWith(".gif");
                }
            }
            if (zEndsWith) {
                this.f11364ko = new com.bytedance.sdk.component.adexpress.le.mwh(context);
            } else {
                this.f11364ko = new ImageView(context);
            }
        }
        this.ouw = getImageKey();
        this.f11364ko.setTag(Integer.valueOf(getClickArea()));
        if ("arrowButton".equals(pnoVar.bly.ouw)) {
            if (this.ryl.vt() <= 0 && this.ryl.ouw() <= 0) {
                int iMax = Math.max(this.f11367ra, this.pno);
                this.f11367ra = iMax;
                this.pno = Math.max(iMax, this.pno);
            } else {
                int iMin = Math.min(this.f11367ra, this.pno);
                this.f11367ra = iMin;
                this.pno = Math.min(iMin, this.pno);
                this.bly = (int) (this.bly + com.bytedance.sdk.component.adexpress.yu.ra.ouw(context, this.ryl.vt() + (this.ryl.ouw() / 2) + 0.5f));
            }
            this.ryl.yu.ouw = this.f11367ra / 2;
        }
        addView(this.f11364ko, new FrameLayout.LayoutParams(this.f11367ra, this.pno));
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.le, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.fkw, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        Drawable drawable = ((ImageView) this.f11364ko).getDrawable();
        if (Build.VERSION.SDK_INT >= 28 && (drawable instanceof AnimatedImageDrawable)) {
            ((AnimatedImageDrawable) drawable).start();
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.le, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.fkw, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Drawable drawable = ((ImageView) this.f11364ko).getDrawable();
        if (Build.VERSION.SDK_INT >= 28 && (drawable instanceof AnimatedImageDrawable)) {
            ((AnimatedImageDrawable) drawable).stop();
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.le, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.bs
    public final boolean ra() {
        int iJg;
        super.ra();
        if (!TextUtils.isEmpty(this.ryl.yu.f11437fn)) {
            ((ImageView) this.f11364ko).setScaleType(ImageView.ScaleType.CENTER_CROP);
            return true;
        }
        int iMwh = 0;
        if ("arrowButton".equals(this.mwh.bly.ouw)) {
            ((ImageView) this.f11364ko).setImageResource(com.bytedance.sdk.component.utils.vpp.yu(this.f11362cf, "tt_white_righterbackicon_titlebar"));
            if (((ImageView) this.f11364ko).getDrawable() != null) {
                ((ImageView) this.f11364ko).getDrawable().setAutoMirrored(true);
            }
            this.f11364ko.setPadding(0, 0, 0, 0);
            ((ImageView) this.f11364ko).setScaleType(ImageView.ScaleType.FIT_XY);
            return true;
        }
        this.f11364ko.setBackgroundColor(this.ryl.mwh());
        String str = this.mwh.bly.vt;
        if ("user".equals(str)) {
            ((ImageView) this.f11364ko).setScaleType(ImageView.ScaleType.CENTER_INSIDE);
            ((ImageView) this.f11364ko).setColorFilter(this.ryl.le());
            ((ImageView) this.f11364ko).setImageDrawable(com.bytedance.sdk.component.utils.vpp.lh(getContext(), "tt_user"));
            ImageView imageView = (ImageView) this.f11364ko;
            int i10 = this.f11367ra;
            imageView.setPadding(i10 / 10, this.pno / 5, i10 / 10, 0);
        } else if (str != null && str.startsWith("@")) {
            try {
                ((ImageView) this.f11364ko).setImageResource(Integer.parseInt(str.substring(1)));
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
        com.bytedance.sdk.component.fkw.ko koVar = com.bytedance.sdk.component.adexpress.ouw.ouw.ouw.ouw().yu;
        String strBly = this.ryl.bly();
        if (!TextUtils.isEmpty(strBly) && !strBly.startsWith("http:") && !strBly.startsWith("https:")) {
            String str2 = null;
            DynamicRootView dynamicRootView = this.f11363jg;
            if (dynamicRootView != null && dynamicRootView.getRenderRequest() != null) {
                str2 = this.f11363jg.getRenderRequest().jqy;
            }
            strBly = com.bytedance.sdk.component.adexpress.dynamic.fkw.bly.vt(strBly, str2);
        }
        com.bytedance.sdk.component.adexpress.ouw.ouw.lh lhVar = com.bytedance.sdk.component.adexpress.ouw.ouw.ouw.ouw().f11574lh;
        if (lhVar != null) {
            iMwh = lhVar.mwh();
            iJg = lhVar.jg();
        } else {
            iJg = 0;
        }
        com.bytedance.sdk.component.fkw.tlj tljVarFkw = koVar.ouw(strBly).ouw(this.ouw).ouw(this.f11367ra).vt(this.pno).yu(iMwh).fkw(iJg);
        String str3 = this.f11363jg.getRenderRequest().tlj;
        if (!TextUtils.isEmpty(str3)) {
            tljVarFkw.vt(str3);
        }
        if (pno()) {
            ((ImageView) this.f11364ko).setScaleType(ImageView.ScaleType.FIT_CENTER);
            tljVarFkw.ouw(Bitmap.Config.ARGB_4444).lh(2).ouw(new ouw(this.f11362cf)).vt(new vt(this.f11364ko, getResources()));
        } else {
            if (com.bytedance.sdk.component.adexpress.yu.vt()) {
                tljVarFkw.lh(1).ouw((ImageView) this.f11364ko);
            }
            ((ImageView) this.f11364ko).setScaleType(ImageView.ScaleType.FIT_XY);
        }
        if ((this.f11364ko instanceof ImageView) && "cover".equals(getImageObjectFit())) {
            ((ImageView) this.f11364ko).setScaleType(ImageView.ScaleType.CENTER_CROP);
        }
        return true;
    }
}
