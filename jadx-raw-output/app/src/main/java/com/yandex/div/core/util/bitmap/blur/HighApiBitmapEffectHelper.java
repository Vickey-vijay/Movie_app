package com.yandex.div.core.util.bitmap.blur;

import android.graphics.Bitmap;
import android.graphics.HardwareRenderer;
import android.graphics.Paint;
import android.graphics.RenderEffect;
import android.graphics.RenderNode;
import android.graphics.Shader;
import android.hardware.HardwareBuffer;
import android.media.Image;
import android.media.ImageReader;
import androidx.annotation.RequiresApi;
import ck.i;
import com.yandex.div.core.util.bitmap.BitmapEffectHelper;

/* JADX INFO: compiled from: HighApiBitmapEffectHelper.kt */
/* JADX INFO: loaded from: classes.dex */
@RequiresApi(31)
public final class HighApiBitmapEffectHelper extends BitmapEffectHelper {
    private static final Companion Companion = new Companion(null);
    private HardwareRenderer cachedHardwareRenderer;
    private RenderNode cachedRenderNode;

    /* JADX INFO: compiled from: HighApiBitmapEffectHelper.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(i iVar) {
            this();
        }
    }

    @Override // com.yandex.div.core.util.bitmap.blur.BlurHelper
    public float getBitmapScale(float f10) {
        return 1.0f;
    }

    @Override // com.yandex.div.core.util.bitmap.blur.BlurHelper
    public float getCoercedBlurRadius(float f10) {
        return f10;
    }

    private final HardwareRenderer getOrCreateHardwareRenderer() {
        HardwareRenderer hardwareRenderer = this.cachedHardwareRenderer;
        if (hardwareRenderer != null) {
            return hardwareRenderer;
        }
        HardwareRenderer hardwareRenderer2 = new HardwareRenderer();
        this.cachedHardwareRenderer = hardwareRenderer2;
        return hardwareRenderer2;
    }

    private final RenderNode getOrCreateRenderNode() {
        RenderNode renderNode = this.cachedRenderNode;
        if (renderNode != null) {
            return renderNode;
        }
        RenderNode renderNode2 = new RenderNode("BlurEffect");
        this.cachedRenderNode = renderNode2;
        return renderNode2;
    }

    @Override // com.yandex.div.core.util.bitmap.blur.BlurHelper
    public Bitmap blurBitmap(Bitmap bitmap, float f10) {
        return !BlurUtils.INSTANCE.isBlurParamsValid(bitmap, f10) ? bitmap : blur(bitmap, f10, false);
    }

    @Override // com.yandex.div.core.util.bitmap.blur.BlurHelper
    public Bitmap blurShadow(Bitmap bitmap, float f10) {
        return !BlurUtils.INSTANCE.isBlurParamsValid(bitmap, f10) ? bitmap : blur(bitmap, f10, true);
    }

    @Override // com.yandex.div.core.util.bitmap.blur.BlurHelper
    public void release() {
        RenderNode renderNode = this.cachedRenderNode;
        if (renderNode != null) {
            renderNode.discardDisplayList();
        }
        this.cachedRenderNode = null;
        HardwareRenderer hardwareRenderer = this.cachedHardwareRenderer;
        if (hardwareRenderer != null) {
            hardwareRenderer.destroy();
        }
        this.cachedHardwareRenderer = null;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0081 A[Catch: all -> 0x00ae, TryCatch #0 {all -> 0x00ae, blocks: (B:12:0x0065, B:17:0x0074, B:19:0x007c, B:30:0x00a4, B:20:0x0081, B:22:0x008b, B:24:0x0091, B:25:0x0093, B:26:0x0098, B:28:0x009e, B:29:0x00a0), top: B:36:0x0065 }] */
    /* JADX WARN: Code duplicated, block: B:22:0x008b A[Catch: all -> 0x00ae, TryCatch #0 {all -> 0x00ae, blocks: (B:12:0x0065, B:17:0x0074, B:19:0x007c, B:30:0x00a4, B:20:0x0081, B:22:0x008b, B:24:0x0091, B:25:0x0093, B:26:0x0098, B:28:0x009e, B:29:0x00a0), top: B:36:0x0065 }] */
    /* JADX WARN: Code duplicated, block: B:24:0x0091 A[Catch: all -> 0x00ae, TryCatch #0 {all -> 0x00ae, blocks: (B:12:0x0065, B:17:0x0074, B:19:0x007c, B:30:0x00a4, B:20:0x0081, B:22:0x008b, B:24:0x0091, B:25:0x0093, B:26:0x0098, B:28:0x009e, B:29:0x00a0), top: B:36:0x0065 }] */
    /* JADX WARN: Code duplicated, block: B:26:0x0098 A[Catch: all -> 0x00ae, TryCatch #0 {all -> 0x00ae, blocks: (B:12:0x0065, B:17:0x0074, B:19:0x007c, B:30:0x00a4, B:20:0x0081, B:22:0x008b, B:24:0x0091, B:25:0x0093, B:26:0x0098, B:28:0x009e, B:29:0x00a0), top: B:36:0x0065 }] */
    /* JADX WARN: Code duplicated, block: B:28:0x009e A[Catch: all -> 0x00ae, TryCatch #0 {all -> 0x00ae, blocks: (B:12:0x0065, B:17:0x0074, B:19:0x007c, B:30:0x00a4, B:20:0x0081, B:22:0x008b, B:24:0x0091, B:25:0x0093, B:26:0x0098, B:28:0x009e, B:29:0x00a0), top: B:36:0x0065 }] */
    private final Bitmap blur(Bitmap bitmap, float f10, boolean z10) {
        Shader.TileMode tileMode;
        HardwareBuffer hardwareBuffer;
        Bitmap.Config config;
        Bitmap bitmapCopy;
        Bitmap.Config config2;
        HardwareRenderer orCreateHardwareRenderer = getOrCreateHardwareRenderer();
        RenderNode orCreateRenderNode = getOrCreateRenderNode();
        ImageReader imageReaderNewInstance = ImageReader.newInstance(bitmap.getWidth(), bitmap.getHeight(), 1, 1, 768L);
        orCreateHardwareRenderer.setSurface(imageReaderNewInstance.getSurface());
        orCreateHardwareRenderer.setContentRoot(orCreateRenderNode);
        orCreateRenderNode.setPosition(0, 0, imageReaderNewInstance.getWidth(), imageReaderNewInstance.getHeight());
        float f11 = f10 / 1.5f;
        if (z10) {
            tileMode = Shader.TileMode.DECAL;
        } else {
            tileMode = Shader.TileMode.MIRROR;
        }
        orCreateRenderNode.setRenderEffect(RenderEffect.createBlurEffect(f11, f11, tileMode));
        orCreateRenderNode.beginRecording().drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
        orCreateRenderNode.endRecording();
        orCreateHardwareRenderer.createRenderRequest().setWaitForPresent(true).syncAndDraw();
        Image imageAcquireNextImage = imageReaderNewInstance.acquireNextImage();
        if (imageAcquireNextImage == null || (hardwareBuffer = imageAcquireNextImage.getHardwareBuffer()) == null) {
            return bitmap;
        }
        try {
            Bitmap bitmapWrapHardwareBuffer = Bitmap.wrapHardwareBuffer(hardwareBuffer, null);
            if (bitmapWrapHardwareBuffer == null) {
                return bitmap;
            }
            if (z10) {
                Bitmap.Config config3 = bitmapWrapHardwareBuffer.getConfig();
                Bitmap.Config config4 = Bitmap.Config.ALPHA_8;
                if (config3 != config4) {
                    bitmapCopy = bitmapWrapHardwareBuffer.copy(config4, false);
                } else if (bitmapWrapHardwareBuffer.getConfig() != bitmap.getConfig()) {
                    config2 = bitmap.getConfig();
                    if (config2 == null) {
                        config2 = Bitmap.Config.ARGB_8888;
                    }
                    bitmapCopy = bitmapWrapHardwareBuffer.copy(config2, false);
                } else {
                    config = bitmapWrapHardwareBuffer.getConfig();
                    if (config == null) {
                        config = Bitmap.Config.ARGB_8888;
                    }
                    bitmapCopy = bitmapWrapHardwareBuffer.copy(config, false);
                }
            } else if (bitmapWrapHardwareBuffer.getConfig() != bitmap.getConfig()) {
                config2 = bitmap.getConfig();
                if (config2 == null) {
                    config2 = Bitmap.Config.ARGB_8888;
                }
                bitmapCopy = bitmapWrapHardwareBuffer.copy(config2, false);
            } else {
                config = bitmapWrapHardwareBuffer.getConfig();
                if (config == null) {
                    config = Bitmap.Config.ARGB_8888;
                }
                bitmapCopy = bitmapWrapHardwareBuffer.copy(config, false);
            }
            bitmapWrapHardwareBuffer.recycle();
            return bitmapCopy;
        } finally {
            hardwareBuffer.close();
            imageAcquireNextImage.close();
        }
    }
}
