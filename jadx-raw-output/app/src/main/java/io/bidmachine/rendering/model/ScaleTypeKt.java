package io.bidmachine.rendering.model;

import android.widget.ImageView;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u000e\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u0004\u0018\u00010\u0002¨\u0006\u0003"}, d2 = {"toImageViewScaleType", "Landroid/widget/ImageView$ScaleType;", "Lio/bidmachine/rendering/model/ScaleType;", "bidmachine-android-rendering_d_2_5_2"}, k = 2, mv = {1, 7, 1}, xi = 48)
public final class ScaleTypeKt {

    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ScaleType.values().length];
            try {
                iArr[ScaleType.None.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ScaleType.ToFill.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ScaleType.AspectFill.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ScaleType.AspectFit.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final ImageView.ScaleType toImageViewScaleType(ScaleType scaleType) {
        int i10 = scaleType == null ? -1 : WhenMappings.$EnumSwitchMapping$0[scaleType.ordinal()];
        if (i10 == -1 || i10 == 1) {
            return null;
        }
        if (i10 == 2) {
            return ImageView.ScaleType.FIT_XY;
        }
        if (i10 == 3) {
            return ImageView.ScaleType.CENTER_CROP;
        }
        if (i10 == 4) {
            return ImageView.ScaleType.CENTER_INSIDE;
        }
        throw new NoWhenBranchMatchedException();
    }
}
