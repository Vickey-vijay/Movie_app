package com.applovin.mediation;

import androidx.annotation.NonNull;
import com.applovin.impl.mediation.MaxAdViewConfigurationImpl;

/* JADX INFO: loaded from: classes6.dex */
public abstract class MaxAdViewConfiguration {

    public enum AdaptiveType {
        NONE("none"),
        ANCHORED("anchored"),
        INLINE("inline");


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f10292a;

        @Override // java.lang.Enum
        @NonNull
        public String toString() {
            return this.f10292a;
        }

        AdaptiveType(String str) {
            this.f10292a = str;
        }
    }

    public interface Builder {
        MaxAdViewConfiguration build();

        Builder setAdaptiveType(AdaptiveType adaptiveType);

        Builder setAdaptiveWidth(int i10);

        Builder setInlineMaximumHeight(int i10);
    }

    public abstract AdaptiveType getAdaptiveType();

    public abstract int getAdaptiveWidth();

    public abstract int getInlineMaximumHeight();

    public static Builder builder() {
        return new MaxAdViewConfigurationImpl.BuilderImpl();
    }
}
