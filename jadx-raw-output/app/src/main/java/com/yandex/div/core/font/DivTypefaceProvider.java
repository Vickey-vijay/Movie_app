package com.yandex.div.core.font;

import android.graphics.Typeface;
import android.os.Build;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes7.dex */
public interface DivTypefaceProvider {
    public static final DivTypefaceProvider DEFAULT = new DivTypefaceProvider() { // from class: com.yandex.div.core.font.DivTypefaceProvider.1
        @Override // com.yandex.div.core.font.DivTypefaceProvider
        @Nullable
        public Typeface getBold() {
            return null;
        }

        @Override // com.yandex.div.core.font.DivTypefaceProvider
        @Nullable
        public Typeface getLight() {
            return null;
        }

        @Override // com.yandex.div.core.font.DivTypefaceProvider
        @Nullable
        public Typeface getMedium() {
            return null;
        }

        @Override // com.yandex.div.core.font.DivTypefaceProvider
        @Nullable
        public Typeface getRegular() {
            return null;
        }

        @Override // com.yandex.div.core.font.DivTypefaceProvider
        @Nullable
        public Typeface getTypefaceFor(int i10) {
            return Build.VERSION.SDK_INT >= 28 ? Typeface.create(Typeface.DEFAULT, i10, false) : super.getTypefaceFor(i10);
        }
    };

    @Nullable
    Typeface getBold();

    @Nullable
    Typeface getLight();

    @Nullable
    Typeface getMedium();

    @Nullable
    Typeface getRegular();

    default boolean isVariable() {
        return false;
    }

    @Nullable
    default Typeface getTypefaceFor(int i10) {
        if (i10 >= 0 && i10 < 350) {
            return getLight();
        }
        if (i10 < 350 || i10 >= 450) {
            return (i10 < 450 || i10 >= 600) ? getBold() : getMedium();
        }
        return getRegular();
    }
}
