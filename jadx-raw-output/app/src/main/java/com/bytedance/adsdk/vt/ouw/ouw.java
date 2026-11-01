package com.bytedance.adsdk.vt.ouw;

import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.os.Build;
import android.os.LocaleList;
import androidx.core.view.ViewCompat;
import com.bytedance.adsdk.vt.le.ra;

/* JADX INFO: loaded from: classes2.dex */
public final class ouw extends Paint {
    public ouw() {
    }

    @Override // android.graphics.Paint
    public final void setTextLocales(LocaleList localeList) {
    }

    public ouw(int i10) {
        super(i10);
    }

    @Override // android.graphics.Paint
    public final void setAlpha(int i10) {
        if (Build.VERSION.SDK_INT >= 29) {
            super.setAlpha(ra.ouw(i10));
        } else {
            setColor((ra.ouw(i10) << 24) | (getColor() & ViewCompat.MEASURED_SIZE_MASK));
        }
    }

    public ouw(PorterDuff.Mode mode) {
        setXfermode(new PorterDuffXfermode(mode));
    }

    public ouw(PorterDuff.Mode mode, byte b10) {
        super(1);
        setXfermode(new PorterDuffXfermode(mode));
    }
}
