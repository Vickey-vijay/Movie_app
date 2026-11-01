package androidx.media3.common;

import android.os.Bundle;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;

/* JADX INFO: loaded from: classes3.dex */
public abstract class Rating {
    public static final String FIELD_RATING_TYPE = Util.intToStringMaxRadix(0);
    public static final int RATING_TYPE_HEART = 0;
    public static final int RATING_TYPE_PERCENTAGE = 1;
    public static final int RATING_TYPE_STAR = 2;
    public static final int RATING_TYPE_THUMB = 3;
    public static final int RATING_TYPE_UNSET = -1;
    public static final float RATING_UNSET = -1.0f;

    public abstract boolean isRated();

    @UnstableApi
    public abstract Bundle toBundle();

    @UnstableApi
    public static Rating fromBundle(Bundle bundle) {
        int i10 = bundle.getInt(FIELD_RATING_TYPE, -1);
        if (i10 == 0) {
            return HeartRating.fromBundle(bundle);
        }
        if (i10 == 1) {
            return PercentageRating.fromBundle(bundle);
        }
        if (i10 == 2) {
            return StarRating.fromBundle(bundle);
        }
        if (i10 == 3) {
            return ThumbRating.fromBundle(bundle);
        }
        throw new IllegalArgumentException("Unknown RatingType: " + i10);
    }
}
