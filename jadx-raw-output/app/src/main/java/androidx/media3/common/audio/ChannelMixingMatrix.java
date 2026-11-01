package androidx.media3.common.audio;

import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.UnstableApi;

/* JADX INFO: loaded from: classes8.dex */
@UnstableApi
public final class ChannelMixingMatrix {
    private final float[] coefficients;
    private final int inputChannelCount;
    private final boolean isDiagonal;
    private final boolean isIdentity;
    private final boolean isZero;
    private final int outputChannelCount;

    private static float[] checkCoefficientsValid(float[] fArr) {
        for (int i10 = 0; i10 < fArr.length; i10++) {
            if (fArr[i10] < 0.0f) {
                throw new IllegalArgumentException("Coefficient at index " + i10 + " is negative.");
            }
        }
        return fArr;
    }

    public static ChannelMixingMatrix create(int i10, int i11) {
        return new ChannelMixingMatrix(i10, i11, createMixingCoefficients(i10, i11));
    }

    private static float[] createMixingCoefficients(int i10, int i11) {
        if (i10 == i11) {
            return initializeIdentityMatrix(i11);
        }
        if (i10 == 1 && i11 == 2) {
            return new float[]{1.0f, 1.0f};
        }
        if (i10 == 2 && i11 == 1) {
            return new float[]{0.5f, 0.5f};
        }
        throw new UnsupportedOperationException("Default channel mixing coefficients for " + i10 + "->" + i11 + " are not yet implemented.");
    }

    private static float[] initializeIdentityMatrix(int i10) {
        float[] fArr = new float[i10 * i10];
        for (int i11 = 0; i11 < i10; i11++) {
            fArr[(i10 * i11) + i11] = 1.0f;
        }
        return fArr;
    }

    public int getInputChannelCount() {
        return this.inputChannelCount;
    }

    public float getMixingCoefficient(int i10, int i11) {
        return this.coefficients[(i10 * this.outputChannelCount) + i11];
    }

    public int getOutputChannelCount() {
        return this.outputChannelCount;
    }

    public boolean isDiagonal() {
        return this.isDiagonal;
    }

    public boolean isIdentity() {
        return this.isIdentity;
    }

    public boolean isSquare() {
        return this.inputChannelCount == this.outputChannelCount;
    }

    public boolean isZero() {
        return this.isZero;
    }

    public ChannelMixingMatrix scaleBy(float f10) {
        float[] fArr = new float[this.coefficients.length];
        int i10 = 0;
        while (true) {
            float[] fArr2 = this.coefficients;
            if (i10 >= fArr2.length) {
                return new ChannelMixingMatrix(this.inputChannelCount, this.outputChannelCount, fArr);
            }
            fArr[i10] = fArr2[i10] * f10;
            i10++;
        }
    }

    public ChannelMixingMatrix(int i10, int i11, float[] fArr) {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        if (i10 > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        Assertions.checkArgument(z10, "Input channel count must be positive.");
        if (i11 > 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        Assertions.checkArgument(z11, "Output channel count must be positive.");
        if (fArr.length == i10 * i11) {
            z12 = true;
        } else {
            z12 = false;
        }
        Assertions.checkArgument(z12, "Coefficient array length is invalid.");
        this.inputChannelCount = i10;
        this.outputChannelCount = i11;
        this.coefficients = checkCoefficientsValid(fArr);
        boolean z15 = true;
        boolean z16 = true;
        boolean z17 = true;
        for (int i12 = 0; i12 < i10; i12++) {
            for (int i13 = 0; i13 < i11; i13++) {
                float mixingCoefficient = getMixingCoefficient(i12, i13);
                if (i12 == i13) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (mixingCoefficient != 1.0f && z14) {
                    z17 = false;
                }
                if (mixingCoefficient != 0.0f) {
                    z15 = false;
                    if (!z14) {
                        z16 = false;
                    }
                }
            }
        }
        this.isZero = z15;
        if (isSquare() && z16) {
            z13 = true;
        } else {
            z13 = false;
        }
        this.isDiagonal = z13;
        this.isIdentity = z13 && z17;
    }
}
