package com.yandex.div.core.view2.divs;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import ck.i;
import com.yandex.div2.DivVideoScale;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: compiled from: DivVideoBinder.kt */
/* JADX INFO: loaded from: classes10.dex */
final class PreviewImageView extends AppCompatImageView {
    public static final Companion Companion = new Companion(null);
    private static final ImageView.ScaleType NO_SCALE = ImageView.ScaleType.CENTER;
    private static final ImageView.ScaleType FIT = ImageView.ScaleType.FIT_CENTER;
    private static final ImageView.ScaleType FILL = ImageView.ScaleType.CENTER_CROP;

    /* JADX INFO: compiled from: DivVideoBinder.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(i iVar) {
            this();
        }
    }

    /* JADX INFO: compiled from: DivVideoBinder.kt */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[DivVideoScale.values().length];
            try {
                iArr[DivVideoScale.FILL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[DivVideoScale.NO_SCALE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[DivVideoScale.FIT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        super.setImageDrawable(drawable != null ? tryScaleAccordingToDensity(drawable) : null);
    }

    public final void setScale(DivVideoScale divVideoScale) {
        ImageView.ScaleType scaleType;
        int i10 = WhenMappings.$EnumSwitchMapping$0[divVideoScale.ordinal()];
        if (i10 == 1) {
            scaleType = FILL;
        } else if (i10 == 2) {
            scaleType = NO_SCALE;
        } else {
            if (i10 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            scaleType = FIT;
        }
        setScaleType(scaleType);
    }

    public PreviewImageView(Context context) {
        super(context);
        setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        setBackgroundColor(0);
        setVisibility(4);
    }

    private final Drawable tryScaleAccordingToDensity(Drawable drawable) {
        if (getScaleType() == NO_SCALE && (drawable instanceof BitmapDrawable)) {
            BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
            Bitmap bitmap = bitmapDrawable.getBitmap();
            if (bitmap != null) {
                bitmap.setDensity(160);
            }
            bitmapDrawable.setTargetDensity(getContext().getResources().getDisplayMetrics());
        }
        return drawable;
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        if (getScaleType() == NO_SCALE && bitmap != null) {
            bitmap.setDensity(160);
        }
        super.setImageBitmap(bitmap);
    }
}
