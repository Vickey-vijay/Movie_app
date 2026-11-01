package com.yandex.div.core;

import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import androidx.annotation.ColorInt;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes6.dex */
public interface Div2ImageStubProvider {
    public static final Div2ImageStubProvider STUB = new Div2ImageStubProvider() { // from class: od.b
        @Override // com.yandex.div.core.Div2ImageStubProvider
        public final Drawable getImageStubDrawable(int i10) {
            return new ColorDrawable(i10);
        }
    };

    @Nullable
    Drawable getImageStubDrawable(@ColorInt int i10);
}
