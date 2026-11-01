package com.yandex.div.core.widget;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimatedImageDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.CallSuper;
import bk.a;
import ck.p;
import com.yandex.div.R$id;
import com.yandex.div.core.images.LoadReference;
import com.yandex.div.core.view2.Releasable;
import com.yandex.div.core.view2.divs.widgets.LoadableImage;
import com.yandex.div.core.view2.drawable.ScaleDrawable;
import com.yandex.div.internal.widget.AspectImageView;
import java.util.concurrent.Future;
import mj.r;

/* JADX INFO: compiled from: LoadableImageView.kt */
/* JADX INFO: loaded from: classes10.dex */
public class LoadableImageView extends AspectImageView implements LoadableImage, Releasable {
    private ImageTransformer _imageTransformer;
    private Bitmap currentBitmapWithoutFilters;
    private DivViewDelegate delegate;
    private Drawable externalImage;
    private a<r> imageChangeCallback;
    private LoadReference loadReference;
    private Drawable sourceDrawable;

    /* JADX INFO: compiled from: LoadableImageView.kt */
    public interface ImageTransformer {

        /* JADX INFO: compiled from: LoadableImageView.kt */
        public static final class NOP implements ImageTransformer {
            public static final NOP INSTANCE = new NOP();

            private NOP() {
            }

            @Override // com.yandex.div.core.widget.LoadableImageView.ImageTransformer
            public Drawable transform(Drawable drawable) {
                return drawable;
            }
        }

        Drawable transform(Drawable drawable);
    }

    public static /* synthetic */ void getCurrentBitmapWithoutFilters$div_release$annotations() {
    }

    public static /* synthetic */ void getExternalImage$annotations() {
    }

    private final boolean wrapsSize(int i10) {
        return i10 == -3 || i10 == -2;
    }

    public void release() {
        this.currentBitmapWithoutFilters = null;
        setExternalImage(null);
        this.sourceDrawable = null;
        resetImageLoaded();
        Future<?> loadingTask = getLoadingTask();
        if (loadingTask != null) {
            loadingTask.cancel(true);
        }
        cleanLoadingTask();
    }

    public void setImage(Bitmap bitmap) {
        setImageBitmap(bitmap);
    }

    public void setPreview(Drawable drawable) {
        setImageDrawable(drawable);
    }

    @Override // com.yandex.div.core.view2.divs.widgets.LoadableImage
    public void cleanLoadingTask() {
        setTag(R$id.bitmap_load_references_tag, null);
    }

    public final Bitmap getCurrentBitmapWithoutFilters$div_release() {
        return this.currentBitmapWithoutFilters;
    }

    public DivViewDelegate getDelegate() {
        return this.delegate;
    }

    public final Drawable getExternalImage() {
        return this.externalImage;
    }

    public final ImageTransformer getImageTransformer() {
        return this._imageTransformer;
    }

    public final LoadReference getLoadReference$div_release() {
        return this.loadReference;
    }

    @Override // com.yandex.div.core.view2.divs.widgets.LoadableImage
    public Future<?> getLoadingTask() {
        Object tag = getTag(R$id.bitmap_load_references_tag);
        if (tag instanceof Future) {
            return (Future) tag;
        }
        return null;
    }

    public void imageLoaded() {
        setTag(R$id.image_loaded_flag, Boolean.TRUE);
    }

    public boolean isImageLoaded() {
        return p.e(getTag(R$id.image_loaded_flag), Boolean.TRUE);
    }

    public boolean isImagePreview() {
        return p.e(getTag(R$id.image_loaded_flag), Boolean.FALSE);
    }

    public void previewLoaded() {
        setTag(R$id.image_loaded_flag, Boolean.FALSE);
    }

    public void resetImageLoaded() {
        setTag(R$id.image_loaded_flag, null);
    }

    @Override // com.yandex.div.core.view2.divs.widgets.LoadableImage
    public void saveLoadingTask(Future<?> future) {
        setTag(R$id.bitmap_load_references_tag, future);
    }

    public final void setCurrentBitmapWithoutFilters$div_release(Bitmap bitmap) {
        this.currentBitmapWithoutFilters = bitmap;
    }

    public void setDelegate(DivViewDelegate divViewDelegate) {
        this.delegate = divViewDelegate;
    }

    public final void setExternalImage(Drawable drawable) {
        this.externalImage = drawable != null ? scaleAccordingToDensity(drawable) : null;
        invalidate();
    }

    public void setImage(Drawable drawable) {
        setImageDrawable(drawable);
        Object drawable2 = getDrawable();
        if ((drawable2 instanceof Animatable) && this.externalImage == null) {
            ((Animatable) drawable2).start();
        }
    }

    public final void setImageChangeCallback(a<r> aVar) {
        this.imageChangeCallback = aVar;
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    @CallSuper
    public void setImageDrawable(Drawable drawable) {
        this.sourceDrawable = drawable;
        if (this.externalImage == null) {
            Drawable drawableTransform = this._imageTransformer.transform(drawable);
            super.setImageDrawable(drawableTransform != null ? scaleAccordingToDensity(drawableTransform) : null);
            a<r> aVar = this.imageChangeCallback;
            if (aVar != null) {
                aVar.invoke();
                return;
            }
            return;
        }
        Drawable drawable2 = getDrawable();
        Drawable drawable3 = this.externalImage;
        if (drawable2 != drawable3) {
            super.setImageDrawable(drawable3);
        }
        a<r> aVar2 = this.imageChangeCallback;
        if (aVar2 != null) {
            aVar2.invoke();
        }
    }

    public final void setImageTransformer(ImageTransformer imageTransformer) {
        if (imageTransformer == null) {
            imageTransformer = ImageTransformer.NOP.INSTANCE;
        }
        this._imageTransformer = imageTransformer;
        Drawable drawable = this.sourceDrawable;
        if (drawable != null) {
            setImageDrawable(drawable);
        }
    }

    public final void setLoadReference$div_release(LoadReference loadReference) {
        this.loadReference = loadReference;
    }

    public void setPreview(Bitmap bitmap) {
        setImageBitmap(bitmap);
    }

    public LoadableImageView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this._imageTransformer = ImageTransformer.NOP.INSTANCE;
    }

    private final Drawable scaleAccordingToDensity(Drawable drawable) {
        if (shouldScaleAccordingToDensity()) {
            if (drawable instanceof BitmapDrawable) {
                BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
                Bitmap bitmap = bitmapDrawable.getBitmap();
                if (bitmap != null) {
                    bitmap.setDensity(160);
                }
                bitmapDrawable.setTargetDensity(getContext().getResources().getDisplayMetrics());
                return drawable;
            }
            if (Build.VERSION.SDK_INT >= 28 && (drawable instanceof AnimatedImageDrawable)) {
                return new ScaleDrawable(drawable, getContext().getResources().getDisplayMetrics().density);
            }
            return drawable;
        }
        return drawable;
    }

    private final boolean shouldScaleAccordingToDensity() {
        boolean z10;
        if (wrapsSize(getLayoutParams().width) && wrapsSize(getLayoutParams().height)) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10 || getImageScale() == AspectImageView.Scale.NO_SCALE) {
            return true;
        }
        return false;
    }

    @Override // android.view.View
    public void buildDrawingCache(boolean z10) {
        DivViewDelegate delegate = getDelegate();
        if (delegate != null) {
            delegate.buildDrawingCache(z10);
        }
        super.buildDrawingCache(z10);
    }

    @Override // android.widget.ImageView, android.view.View, android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable drawable) {
        Drawable drawableInvalidateDrawable;
        DivViewDelegate delegate = getDelegate();
        if (delegate != null && (drawableInvalidateDrawable = delegate.invalidateDrawable(drawable)) != null) {
            drawable = drawableInvalidateDrawable;
        }
        super.invalidateDrawable(drawable);
    }

    @Override // android.widget.ImageView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        DivViewDelegate delegate = getDelegate();
        if (delegate != null) {
            delegate.onAttachedToWindow();
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        DivViewDelegate delegate = getDelegate();
        if (delegate != null) {
            delegate.onDetachedFromWindow();
        }
    }

    @Override // android.view.View
    public void onVisibilityChanged(View view, int i10) {
        DivViewDelegate delegate = getDelegate();
        boolean z10 = false;
        if (delegate != null && !delegate.onVisibilityChanged(view, i10)) {
            z10 = true;
        }
        if (z10) {
            super.onVisibilityChanged(view, i10);
        }
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    @CallSuper
    public void setImageBitmap(Bitmap bitmap) {
        if (shouldScaleAccordingToDensity() && bitmap != null) {
            bitmap.setDensity(160);
        }
        setImageDrawable(new BitmapDrawable(getContext().getResources(), bitmap));
    }

    public void setPlaceholder(Drawable drawable) {
        setImageDrawable(drawable);
    }

    @Override // android.view.View
    public void unscheduleDrawable(Drawable drawable) {
        DivViewDelegate delegate = getDelegate();
        if (delegate != null) {
            delegate.unscheduleDrawable(drawable);
        }
        super.unscheduleDrawable(drawable);
    }
}
