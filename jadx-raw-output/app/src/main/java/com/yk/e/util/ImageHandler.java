package com.yk.e.util;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.widget.ImageView;
import androidx.annotation.Nullable;
import com.bumptech.glide.Glide;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.engine.GlideException;
import com.bumptech.glide.request.RequestListener;
import com.bumptech.glide.request.target.Target;

/* JADX INFO: loaded from: classes7.dex */
public class ImageHandler {
    private final long timeout = 6000;

    public interface IImageHandlerCallback {
        void onFailed(String str);

        void onSuccess(Drawable drawable);
    }

    public void clearDiskCache(Context context) {
        Glide.get(context).clearDiskCache();
    }

    public void clearMemory(Context context) {
        Glide.get(context).clearMemory();
    }

    public void loadImg(Context context, String str, ImageView imageView, String str2, final IImageHandlerCallback iImageHandlerCallback) {
        int drawable;
        try {
            if (TextUtils.isEmpty(str2)) {
                drawable = 0;
            } else {
                drawable = IDUtil.getDrawable(context, str2);
            }
            Glide.with(context).load(str).timeout(6000).error(drawable).listener(new RequestListener<Drawable>() { // from class: com.yk.e.util.ImageHandler.1
                @Override // com.bumptech.glide.request.RequestListener
                public boolean onLoadFailed(@Nullable GlideException glideException, Object obj, Target<Drawable> target, boolean z10) {
                    IImageHandlerCallback iImageHandlerCallback2 = iImageHandlerCallback;
                    if (iImageHandlerCallback2 == null) {
                        return false;
                    }
                    iImageHandlerCallback2.onFailed(glideException != null ? glideException.getMessage() : "load img failed");
                    return false;
                }

                @Override // com.bumptech.glide.request.RequestListener
                public boolean onResourceReady(Drawable drawable2, Object obj, Target<Drawable> target, DataSource dataSource, boolean z10) {
                    IImageHandlerCallback iImageHandlerCallback2 = iImageHandlerCallback;
                    if (iImageHandlerCallback2 == null) {
                        return false;
                    }
                    iImageHandlerCallback2.onSuccess(drawable2);
                    return false;
                }
            }).into(imageView);
        } catch (Exception e10) {
            AdLog.e(e10.getMessage(), e10);
            if (iImageHandlerCallback != null) {
                iImageHandlerCallback.onFailed(e10.getMessage());
            }
        }
    }

    public void preloadImg(Context context, String str, final IImageHandlerCallback iImageHandlerCallback) {
        try {
            Glide.with(context).load(str).timeout(10000).listener(new RequestListener<Drawable>() { // from class: com.yk.e.util.ImageHandler.2
                @Override // com.bumptech.glide.request.RequestListener
                public boolean onLoadFailed(GlideException glideException, Object obj, Target<Drawable> target, boolean z10) {
                    IImageHandlerCallback iImageHandlerCallback2 = iImageHandlerCallback;
                    if (iImageHandlerCallback2 == null) {
                        return false;
                    }
                    iImageHandlerCallback2.onFailed(glideException != null ? glideException.getMessage() : "load img failed");
                    return false;
                }

                @Override // com.bumptech.glide.request.RequestListener
                public boolean onResourceReady(Drawable drawable, Object obj, Target<Drawable> target, DataSource dataSource, boolean z10) {
                    IImageHandlerCallback iImageHandlerCallback2 = iImageHandlerCallback;
                    if (iImageHandlerCallback2 == null) {
                        return false;
                    }
                    iImageHandlerCallback2.onSuccess(drawable);
                    return false;
                }
            }).preload();
        } catch (Exception e10) {
            AdLog.e(e10.getMessage(), e10);
            if (iImageHandlerCallback != null) {
                iImageHandlerCallback.onFailed(e10.getMessage());
            }
        }
    }
}
