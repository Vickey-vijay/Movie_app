package io.bidmachine.media3.extractor.mp4;

import androidx.annotation.Nullable;
import com.google.common.primitives.ImmutableIntArray;
import io.bidmachine.media3.common.util.UnstableApi;
import io.bidmachine.media3.extractor.SniffFailure;

/* JADX INFO: loaded from: classes8.dex */
@UnstableApi
public final class UnsupportedBrandsSniffFailure implements SniffFailure {
    public final ImmutableIntArray compatibleBrands;
    public final int majorBrand;

    public UnsupportedBrandsSniffFailure(int i10, @Nullable int[] iArr) {
        ImmutableIntArray immutableIntArrayOf;
        this.majorBrand = i10;
        if (iArr != null) {
            immutableIntArrayOf = ImmutableIntArray.copyOf(iArr);
        } else {
            immutableIntArrayOf = ImmutableIntArray.of();
        }
        this.compatibleBrands = immutableIntArrayOf;
    }
}
