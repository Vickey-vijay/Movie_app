package androidx.dynamicanimation.animation;

import android.util.FloatProperty;
import androidx.annotation.RequiresApi;

/* JADX INFO: loaded from: classes10.dex */
public abstract class FloatPropertyCompat<T> {
    public final String mPropertyName;

    public abstract float getValue(T t10);

    public abstract void setValue(T t10, float f10);

    @RequiresApi(24)
    public static <T> FloatPropertyCompat<T> createFloatPropertyCompat(final FloatProperty<T> floatProperty) {
        return new FloatPropertyCompat<T>(floatProperty.getName()) { // from class: androidx.dynamicanimation.animation.FloatPropertyCompat.1
            @Override // androidx.dynamicanimation.animation.FloatPropertyCompat
            public float getValue(T t10) {
                return ((Float) floatProperty.get(t10)).floatValue();
            }

            @Override // androidx.dynamicanimation.animation.FloatPropertyCompat
            public void setValue(T t10, float f10) {
                floatProperty.setValue(t10, f10);
            }
        };
    }

    public FloatPropertyCompat(String str) {
        this.mPropertyName = str;
    }
}
