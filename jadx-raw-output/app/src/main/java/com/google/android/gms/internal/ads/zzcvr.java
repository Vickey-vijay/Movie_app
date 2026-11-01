package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.core.view.ViewCompat;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import io.bidmachine.iab.vast.tags.VastAttributes;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes11.dex */
public final class zzcvr extends FrameLayout implements ViewTreeObserver.OnScrollChangedListener, ViewTreeObserver.OnGlobalLayoutListener {
    private final Context zza;
    private View zzb;

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me2) {
        DetectTouchUtils.viewOnTouch(com.safedk.android.utils.g.f44962h, this, me2);
        return super.dispatchTouchEvent(me2);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        int[] iArr = new int[2];
        getLocationInWindow(iArr);
        this.zzb.setY(-iArr[1]);
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        }
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final void onScrollChanged() {
        int[] iArr = new int[2];
        getLocationInWindow(iArr);
        this.zzb.setY(-iArr[1]);
    }

    public static zzcvr zza(Context context, View view, zzfir zzfirVar) {
        Resources resources;
        DisplayMetrics displayMetrics;
        zzcvr zzcvrVar = new zzcvr(context);
        List list = zzfirVar.zzu;
        if (!list.isEmpty() && (resources = zzcvrVar.zza.getResources()) != null && (displayMetrics = resources.getDisplayMetrics()) != null) {
            zzfis zzfisVar = (zzfis) list.get(0);
            float f10 = zzfisVar.zza;
            float f11 = displayMetrics.density;
            zzcvrVar.setLayoutParams(new FrameLayout.LayoutParams((int) (f10 * f11), (int) (zzfisVar.zzb * f11)));
        }
        zzcvrVar.zzb = view;
        zzcvrVar.addView(view);
        com.google.android.gms.ads.internal.zzt.zzC();
        zzcev.zzb(zzcvrVar, zzcvrVar);
        com.google.android.gms.ads.internal.zzt.zzC();
        zzcev.zza(zzcvrVar, zzcvrVar);
        JSONObject jSONObject = zzfirVar.zzah;
        RelativeLayout relativeLayout = new RelativeLayout(zzcvrVar.zza);
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("header");
        if (jSONObjectOptJSONObject != null) {
            zzcvrVar.zzb(jSONObjectOptJSONObject, relativeLayout, 10);
        }
        JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("footer");
        if (jSONObjectOptJSONObject2 != null) {
            zzcvrVar.zzb(jSONObjectOptJSONObject2, relativeLayout, 12);
        }
        zzcvrVar.addView(relativeLayout);
        return zzcvrVar;
    }

    private final void zzb(JSONObject jSONObject, RelativeLayout relativeLayout, int i10) {
        TextView textView = new TextView(this.zza);
        textView.setTextColor(-1);
        textView.setBackgroundColor(ViewCompat.MEASURED_STATE_MASK);
        textView.setGravity(17);
        textView.setText(jSONObject.optString("text", ""));
        textView.setTextSize((float) jSONObject.optDouble("text_size", 11.0d));
        int iZzc = zzc(jSONObject.optDouble(VastAttributes.PADDING, 0.0d));
        textView.setPadding(0, iZzc, 0, iZzc);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, zzc(jSONObject.optDouble("height", 15.0d)));
        layoutParams.addRule(i10);
        relativeLayout.addView(textView, layoutParams);
    }

    private zzcvr(Context context) {
        super(context);
        this.zza = context;
    }

    private final int zzc(double d10) {
        com.google.android.gms.ads.internal.client.zzbb.zza();
        return com.google.android.gms.ads.internal.util.client.zzf.zzC(this.zza, (int) d10);
    }
}
