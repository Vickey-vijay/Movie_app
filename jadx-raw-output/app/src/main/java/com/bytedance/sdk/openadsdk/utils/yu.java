package com.bytedance.sdk.openadsdk.utils;

import android.app.Activity;
import android.content.res.Resources;
import android.graphics.BitmapFactory;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.Base64;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class yu {
    public static void ouw(ViewGroup viewGroup, com.bytedance.sdk.openadsdk.core.model.vpp vppVar) {
        if (vppVar == null || TextUtils.isEmpty(vppVar.pev)) {
            return;
        }
        try {
            int i10 = rn.lht;
            if (viewGroup.getTag(i10) != null) {
                return;
            }
            viewGroup.setTag(i10, Integer.valueOf(i10));
            Drawable drawableOuw = ouw(viewGroup.getResources(), vppVar);
            if (drawableOuw == null) {
                return;
            }
            viewGroup.setForeground(drawableOuw);
        } catch (Throwable th2) {
            com.bytedance.sdk.component.utils.qbp.lh("add overlay fail", th2.getMessage());
        }
    }

    public static class ouw implements View.OnLayoutChangeListener {

        /* JADX INFO: renamed from: lh, reason: collision with root package name */
        private int f13455lh;
        private final Drawable ouw;
        private int vt;

        @Override // android.view.View.OnLayoutChangeListener
        public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
            int i18 = i12 - i10;
            int i19 = i13 - i11;
            if (i18 == this.vt && i19 == this.f13455lh) {
                return;
            }
            this.vt = i18;
            this.f13455lh = i19;
            this.ouw.setBounds(0, 0, i18, i19);
        }

        public ouw(Drawable drawable) {
            this.ouw = drawable;
        }
    }

    public static void ouw(Activity activity, com.bytedance.sdk.openadsdk.core.model.vpp vppVar) {
        if (activity == null || vppVar == null || TextUtils.isEmpty(vppVar.pev)) {
            return;
        }
        try {
            View decorView = activity.getWindow().getDecorView();
            int i10 = rn.lht;
            if (decorView.getTag(i10) != null) {
                return;
            }
            activity.getWindow().getDecorView().setTag(i10, Integer.valueOf(i10));
            Drawable drawableOuw = ouw(activity.getResources(), vppVar);
            if (drawableOuw == null) {
                return;
            }
            activity.getWindow().getDecorView().setForeground(drawableOuw);
        } catch (Throwable th2) {
            com.bytedance.sdk.component.utils.qbp.lh("add overlay fail", th2.getMessage());
        }
    }

    @Nullable
    private static Drawable ouw(Resources resources, com.bytedance.sdk.openadsdk.core.model.vpp vppVar) {
        try {
            String str = vppVar.pev;
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            byte[] bArrDecode = Base64.decode(str, 0);
            BitmapDrawable bitmapDrawable = new BitmapDrawable(resources, BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length));
            Shader.TileMode tileMode = Shader.TileMode.REPEAT;
            bitmapDrawable.setTileModeXY(tileMode, tileMode);
            bitmapDrawable.setTargetDensity(resources.getDisplayMetrics());
            return bitmapDrawable;
        } catch (Throwable unused) {
            return null;
        }
    }
}
