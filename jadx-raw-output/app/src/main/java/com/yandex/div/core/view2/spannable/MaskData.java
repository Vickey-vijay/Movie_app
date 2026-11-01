package com.yandex.div.core.view2.spannable;

import androidx.annotation.ColorInt;
import ck.i;

/* JADX INFO: compiled from: MaskData.kt */
/* JADX INFO: loaded from: classes4.dex */
public abstract class MaskData {

    /* JADX INFO: compiled from: MaskData.kt */
    public static final class Particles extends MaskData {
        private final int color;
        private final float density;
        private final boolean isAnimated;
        private final boolean isEnabled;
        private final float particleSize;

        public Particles(@ColorInt int i10, float f10, boolean z10, boolean z11, float f11) {
            super(null);
            this.color = i10;
            this.density = f10;
            this.isAnimated = z10;
            this.isEnabled = z11;
            this.particleSize = f11;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Particles)) {
                return false;
            }
            Particles particles = (Particles) obj;
            return this.color == particles.color && Float.compare(this.density, particles.density) == 0 && this.isAnimated == particles.isAnimated && this.isEnabled == particles.isEnabled && Float.compare(this.particleSize, particles.particleSize) == 0;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v5, types: [int] */
        /* JADX WARN: Type inference failed for: r0v7, types: [int] */
        /* JADX WARN: Type inference failed for: r1v3, types: [int] */
        /* JADX WARN: Type inference failed for: r1v7 */
        /* JADX WARN: Type inference failed for: r1v8 */
        /* JADX WARN: Type inference failed for: r2v0 */
        /* JADX WARN: Type inference failed for: r2v1, types: [int] */
        /* JADX WARN: Type inference failed for: r2v2 */
        public int hashCode() {
            int iHashCode = ((Integer.hashCode(this.color) * 31) + Float.hashCode(this.density)) * 31;
            boolean z10 = this.isAnimated;
            ?? r10 = z10;
            if (z10) {
                r10 = 1;
            }
            int i10 = (iHashCode + r10) * 31;
            boolean z11 = this.isEnabled;
            return ((i10 + (z11 ? 1 : z11)) * 31) + Float.hashCode(this.particleSize);
        }

        public String toString() {
            return "Particles(color=" + this.color + ", density=" + this.density + ", isAnimated=" + this.isAnimated + ", isEnabled=" + this.isEnabled + ", particleSize=" + this.particleSize + ')';
        }

        public final int getColor() {
            return this.color;
        }

        public final float getDensity() {
            return this.density;
        }

        public final float getParticleSize() {
            return this.particleSize;
        }

        public final boolean isAnimated() {
            return this.isAnimated;
        }

        public final boolean isEnabled() {
            return this.isEnabled;
        }
    }

    /* JADX INFO: compiled from: MaskData.kt */
    public static final class Solid extends MaskData {
        private final int color;
        private final boolean isEnabled;

        public Solid(@ColorInt int i10, boolean z10) {
            super(null);
            this.color = i10;
            this.isEnabled = z10;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Solid)) {
                return false;
            }
            Solid solid = (Solid) obj;
            return this.color == solid.color && this.isEnabled == solid.isEnabled;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v3, types: [int] */
        /* JADX WARN: Type inference failed for: r1v1, types: [int] */
        /* JADX WARN: Type inference failed for: r1v2 */
        /* JADX WARN: Type inference failed for: r1v3 */
        public int hashCode() {
            int iHashCode = Integer.hashCode(this.color) * 31;
            boolean z10 = this.isEnabled;
            ?? r10 = z10;
            if (z10) {
                r10 = 1;
            }
            return iHashCode + r10;
        }

        public String toString() {
            return "Solid(color=" + this.color + ", isEnabled=" + this.isEnabled + ')';
        }

        public final int getColor() {
            return this.color;
        }

        public final boolean isEnabled() {
            return this.isEnabled;
        }
    }

    private MaskData() {
    }

    public /* synthetic */ MaskData(i iVar) {
        this();
    }
}
