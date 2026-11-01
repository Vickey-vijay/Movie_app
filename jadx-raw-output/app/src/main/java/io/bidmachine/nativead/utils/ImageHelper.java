package io.bidmachine.nativead.utils;

import android.content.Context;
import android.graphics.BitmapFactory;
import android.graphics.Point;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.text.TextUtils;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.bidmachine.core.Logger;
import io.bidmachine.core.Utils;
import java.io.InputStream;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes6.dex */
public class ImageHelper {
    private static final int MAX_IMAGE_HEIGHT = 700;
    private static final int MAX_IMAGE_WIDTH = 1200;

    public interface OnImageHelperListener {
        void onError(@NonNull String str);

        void onImagePrepared(@NonNull ImageView imageView, @NonNull Drawable drawable);
    }

    public static class b implements Runnable {
        private final Context context;
        private Drawable image;
        private final Uri imageUri;
        private final OnImageHelperListener onImageHelperListener;
        private final WeakReference<ImageView> weakTargetImageView;

        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                ImageView imageView = (ImageView) b.this.weakTargetImageView.get();
                if (imageView == null || b.this.image == null) {
                    b.this.onImageHelperListener.onError("Target ImageView or Bitmap is invalid");
                } else {
                    b.this.onImageHelperListener.onImagePrepared(imageView, b.this.image);
                }
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inJustDecodeBounds = true;
                InputStream inputStreamOpenInputStream = this.context.getContentResolver().openInputStream(this.imageUri);
                try {
                    BitmapFactory.decodeStream(inputStreamOpenInputStream, null, options);
                    Utils.close(inputStreamOpenInputStream);
                    if (options.outWidth != 0 && options.outHeight != 0) {
                        int iCalculateReqWidth = ImageHelper.calculateReqWidth(this.context);
                        options.inSampleSize = ImageHelper.calculateInSamplesSize(options, iCalculateReqWidth, ImageHelper.calculateReqHeight(iCalculateReqWidth));
                        options.inJustDecodeBounds = false;
                        InputStream inputStreamOpenInputStream2 = this.context.getContentResolver().openInputStream(this.imageUri);
                        try {
                            this.image = new BitmapDrawable(this.context.getResources(), BitmapFactory.decodeStream(inputStreamOpenInputStream2, null, options));
                            Utils.close(inputStreamOpenInputStream2);
                            Utils.onUiThread(new a());
                            return;
                        } catch (Throwable th2) {
                            Utils.close(inputStreamOpenInputStream2);
                            throw th2;
                        }
                    }
                    this.onImageHelperListener.onError("Image size is (0;0)");
                } catch (Throwable th3) {
                    Utils.close(inputStreamOpenInputStream);
                    throw th3;
                }
            } catch (Throwable th4) {
                String message = th4.getMessage();
                OnImageHelperListener onImageHelperListener = this.onImageHelperListener;
                if (message == null) {
                    message = "ImagePreparation error";
                }
                onImageHelperListener.onError(message);
            }
        }

        public b(@NonNull Context context, @NonNull Uri uri, @NonNull ImageView imageView, @NonNull OnImageHelperListener onImageHelperListener) {
            this.context = context;
            this.imageUri = uri;
            this.weakTargetImageView = new WeakReference<>(imageView);
            this.onImageHelperListener = onImageHelperListener;
        }
    }

    public static int calculateReqHeight(int i10) {
        if (i10 > 700) {
            return 700;
        }
        return i10;
    }

    public class a implements OnImageHelperListener {
        @Override // io.bidmachine.nativead.utils.ImageHelper.OnImageHelperListener
        public void onError(@NonNull String str) {
            Logger.d(str);
        }

        @Override // io.bidmachine.nativead.utils.ImageHelper.OnImageHelperListener
        public void onImagePrepared(@NonNull ImageView imageView, @NonNull Drawable drawable) {
            imageView.setImageDrawable(drawable);
        }
    }

    public static int calculateInSamplesSize(@NonNull BitmapFactory.Options options, int i10, int i11) {
        int i12 = options.outWidth;
        int i13 = options.outHeight;
        int i14 = 1;
        while (true) {
            if (i12 / i14 <= i10 && i13 / i14 <= i11) {
                return i14;
            }
            i14 *= 2;
        }
    }

    public static void fillImageView(@NonNull Context context, @NonNull ImageView imageView, @Nullable Uri uri, @Nullable Drawable drawable) {
        if (drawable != null) {
            imageView.setImageDrawable(drawable);
        } else {
            loadImageByPath(context, uri, imageView, new a());
        }
    }

    private static void loadImageByPath(@NonNull Context context, @Nullable Uri uri, @Nullable ImageView imageView, @Nullable OnImageHelperListener onImageHelperListener) {
        if (onImageHelperListener == null) {
            return;
        }
        if (uri == null || TextUtils.isEmpty(uri.getPath())) {
            onImageHelperListener.onError("ImagePath is invalid");
        } else if (imageView == null) {
            onImageHelperListener.onError("Target ImageView is null");
        } else {
            NativeNetworkExecutor.getInstance().execute(new b(context, uri, imageView, onImageHelperListener));
        }
    }

    public static int calculateReqWidth(@NonNull Context context) {
        Point screenSize = Utils.getScreenSize(context);
        return Math.min(1200, Math.min(screenSize.x, screenSize.y));
    }
}
