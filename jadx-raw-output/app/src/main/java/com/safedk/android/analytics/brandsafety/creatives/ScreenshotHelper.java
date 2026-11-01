package com.safedk.android.analytics.brandsafety.creatives;

import android.annotation.TargetApi;
import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import android.view.PixelCopy;
import android.view.View;
import com.safedk.android.SafeDK;
import com.safedk.android.analytics.brandsafety.InterstitialFinder;
import com.safedk.android.analytics.brandsafety.n;
import com.safedk.android.utils.Logger;

/* JADX INFO: loaded from: classes9.dex */
public class ScreenshotHelper {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f43944a = "ScreenshotHelper";

    public static Bitmap a(View view, int i10) {
        if (view == null || view.getWidth() <= 0 || view.getHeight() <= 0) {
            Logger.d(f43944a, "Cannot save view to bitmap! view: " + view);
            return null;
        }
        Pair<Bitmap, Float> pairB = b(view, i10);
        Bitmap bitmap = (Bitmap) pairB.first;
        float fFloatValue = ((Float) pairB.second).floatValue();
        if (bitmap != null) {
            Canvas canvas = new Canvas(bitmap);
            canvas.scale(1.0f / fFloatValue, 1.0f / fFloatValue);
            view.draw(canvas);
            return bitmap;
        }
        return bitmap;
    }

    private static Pair<Bitmap, Float> b(View view, int i10) {
        float width = view.getWidth();
        float height = view.getHeight();
        float f10 = 1.0f;
        if (i10 > 0) {
            if (width > height) {
                Logger.v(f43944a, "Taking screenshot of landscape view " + view);
                if (width > i10) {
                    f10 = width / i10;
                    height = (height * i10) / width;
                    width = i10;
                }
            } else {
                Logger.v(f43944a, "Taking screenshot of portrait view " + view);
                if (height > i10) {
                    f10 = height / i10;
                    width = (width * i10) / height;
                    height = i10;
                }
            }
        }
        Logger.v(f43944a, "scale size = " + f10);
        return new Pair<>(Bitmap.createBitmap((int) width, (int) height, Bitmap.Config.ARGB_8888), Float.valueOf(f10));
    }

    @TargetApi(26)
    public static class DefaultOnPixelCopyFinishedListener implements PixelCopy.OnPixelCopyFinishedListener {
        final Activity activity;
        Bitmap bitmap;
        n currentActivityInterstitial;

        DefaultOnPixelCopyFinishedListener(Bitmap bitmap, n currentActivityInterstitial, Activity activity) {
            this.bitmap = null;
            this.currentActivityInterstitial = null;
            this.bitmap = bitmap;
            this.currentActivityInterstitial = currentActivityInterstitial;
            this.activity = activity;
        }

        @Override // android.view.PixelCopy.OnPixelCopyFinishedListener
        public void onPixelCopyFinished(int copyResult) {
            if (copyResult == 0) {
                InterstitialFinder interstitialFinderY = SafeDK.getInstance().y();
                if (interstitialFinderY != null) {
                    Logger.d(ScreenshotHelper.f43944a, "take screenshot using PixelCopy - PixelCopy finished successfully. Calling Inter takeScreenshot");
                    interstitialFinderY.a(this.bitmap, this.currentActivityInterstitial, this.activity);
                    return;
                }
                return;
            }
            Logger.d(ScreenshotHelper.f43944a, "take screenshot using PixelCopy - PixelCopy finished NOT successfully. result= " + copyResult);
        }
    }

    public static void a(Activity activity, n nVar, View view, int i10) {
        if (view == null || view.getWidth() <= 0 || view.getHeight() <= 0) {
            Logger.d(f43944a, "Cannot save view to bitmap! view: " + view);
            return;
        }
        try {
            Bitmap bitmap = (Bitmap) b(view, i10).first;
            if (activity != null && bitmap != null) {
                int[] iArr = new int[2];
                view.getLocationInWindow(iArr);
                Rect rect = new Rect(iArr[0], iArr[1], iArr[0] + view.getWidth(), iArr[1] + view.getHeight());
                if (Build.VERSION.SDK_INT >= 26) {
                    PixelCopy.request(activity.getWindow(), rect, bitmap, new DefaultOnPixelCopyFinishedListener(bitmap, nVar, activity), new Handler(Looper.getMainLooper()));
                }
            }
        } catch (Exception e10) {
            Logger.d(f43944a, "take screenshot using PixelCopy - exception on PixelCopy request: " + e10);
        } catch (Throwable th2) {
            Logger.d(f43944a, "take screenshot using PixelCopy - throwable on PixelCopy request: " + th2);
        }
    }
}
