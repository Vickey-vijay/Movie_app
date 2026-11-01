package androidx.media3.extractor.mp4;

import androidx.annotation.Nullable;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.extractor.SniffFailure;
import com.google.common.primitives.ImmutableIntArray;

/* JADX INFO: loaded from: classes3.dex */
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
