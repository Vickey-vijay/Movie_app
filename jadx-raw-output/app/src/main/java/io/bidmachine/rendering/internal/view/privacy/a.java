package io.bidmachine.rendering.internal.view.privacy;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.widget.Button;
import ck.p;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import io.bidmachine.rendering.R;
import io.bidmachine.util.UtilsKt;

/* JADX INFO: loaded from: classes.dex */
public final class a extends Button {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(Context context) {
        super(context);
        p.j(context, GAMConfig.KEY_CONTEXT);
        setAllCaps(false);
        setMinHeight(UtilsKt.dpToPx(context, 40.0f));
        setMinWidth(0);
        setGravity(8388627);
        setIncludeFontPadding(false);
        setElevation(0.0f);
        setStateListAnimator(null);
        int iDpToPx = UtilsKt.dpToPx(context, 24.0f);
        int iDpToPx2 = UtilsKt.dpToPx(context, 10.0f);
        int iDpToPx3 = UtilsKt.dpToPx(context, 8.0f);
        setPadding(iDpToPx, iDpToPx2, iDpToPx, iDpToPx2);
        setCompoundDrawablePadding(iDpToPx3);
        setBackgroundResource(R.drawable.bm_bg_privacy_button);
        setTextColor(UtilsKt.getColorCompat(context, R.color.bm_privacy_button_text_color));
    }

    private final Drawable a(Drawable drawable) {
        if (!(drawable instanceof BitmapDrawable)) {
            return drawable;
        }
        Bitmap bitmap = ((BitmapDrawable) drawable).getBitmap();
        Context context = getContext();
        p.i(context, GAMConfig.KEY_CONTEXT);
        int iDpToPx = UtilsKt.dpToPx(context, 24.0f);
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        if (width == iDpToPx && height == iDpToPx) {
            return drawable;
        }
        float f10 = iDpToPx;
        float f11 = width;
        float f12 = height;
        float fMin = Math.min(f10 / f11, f10 / f12);
        return new BitmapDrawable(getContext().getResources(), Bitmap.createScaledBitmap(bitmap, (int) (f11 * fMin), (int) (f12 * fMin), true));
    }

    @Override // android.view.View
    public boolean dispatchTouchEvent(MotionEvent me2) {
        DetectTouchUtils.viewOnTouch("io.bidmachine", this, me2);
        return super.dispatchTouchEvent(me2);
    }

    @Override // android.widget.TextView, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        }
    }

    public final void setActionIcon(Drawable drawable) {
        Drawable drawableMutate;
        Context context = getContext();
        p.i(context, GAMConfig.KEY_CONTEXT);
        int colorCompat = UtilsKt.getColorCompat(context, R.color.bm_privacy_button_icon_color);
        if (drawable != null) {
            drawableMutate = a(drawable).mutate();
            drawableMutate.setTint(colorCompat);
        } else {
            drawableMutate = null;
        }
        setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, drawableMutate, (Drawable) null);
    }
}
