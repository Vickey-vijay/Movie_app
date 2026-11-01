package io.bidmachine.media3.common;

import android.os.Bundle;
import androidx.annotation.FloatRange;
import androidx.annotation.IntRange;
import androidx.annotation.Nullable;
import io.bidmachine.media3.common.util.Assertions;
import io.bidmachine.media3.common.util.UnstableApi;
import io.bidmachine.media3.common.util.Util;

/* JADX INFO: loaded from: classes4.dex */
public final class StarRating extends Rating {
    private static final String FIELD_MAX_STARS = Util.intToStringMaxRadix(1);
    private static final String FIELD_STAR_RATING = Util.intToStringMaxRadix(2);
    private static final int MAX_STARS_DEFAULT = 5;
    private static final int TYPE = 2;

    @IntRange(from = 1)
    private final int maxStars;
    private final float starRating;

    public StarRating(@IntRange(from = 1) int i10) {
        Assertions.checkArgument(i10 > 0, "maxStars must be a positive integer");
        this.maxStars = i10;
        this.starRating = -1.0f;
    }

    public int hashCode() {
        return m5.i.b(Integer.valueOf(this.maxStars), Float.valueOf(this.starRating));
    }

    @UnstableApi
    public static StarRating fromBundle(Bundle bundle) {
        Assertions.checkArgument(bundle.getInt(Rating.FIELD_RATING_TYPE, -1) == 2);
        int i10 = bundle.getInt(FIELD_MAX_STARS, 5);
        float f10 = bundle.getFloat(FIELD_STAR_RATING, -1.0f);
        return f10 == -1.0f ? new StarRating(i10) : new StarRating(i10, f10);
    }

    public boolean equals(@Nullable Object obj) {
        if (!(obj instanceof StarRating)) {
            return false;
        }
        StarRating starRating = (StarRating) obj;
        return this.maxStars == starRating.maxStars && this.starRating == starRating.starRating;
    }

    @IntRange(from = 1)
    public int getMaxStars() {
        return this.maxStars;
    }

    public float getStarRating() {
        return this.starRating;
    }

    @Override // io.bidmachine.media3.common.Rating
    public boolean isRated() {
        return this.starRating != -1.0f;
    }

    @Override // io.bidmachine.media3.common.Rating
    @UnstableApi
    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putInt(Rating.FIELD_RATING_TYPE, 2);
        bundle.putInt(FIELD_MAX_STARS, this.maxStars);
        bundle.putFloat(FIELD_STAR_RATING, this.starRating);
        return bundle;
    }

    public StarRating(@IntRange(from = 1) int i10, @FloatRange(from = 0.0d) float f10) {
        Assertions.checkArgument(i10 > 0, "maxStars must be a positive integer");
        Assertions.checkArgument(f10 >= 0.0f && f10 <= ((float) i10), "starRating is out of range [0, maxStars]");
        this.maxStars = i10;
        this.starRating = f10;
    }
}
