package com.bytedance.sdk.component.adexpress.yu;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.HardwareRenderer;
import android.graphics.Paint;
import android.graphics.RenderEffect;
import android.graphics.RenderNode;
import android.graphics.Shader;
import android.hardware.HardwareBuffer;
import android.media.Image;
import android.media.ImageReader;
import android.os.Build;
import android.renderscript.Allocation;
import android.renderscript.Element;
import android.renderscript.RenderScript;
import android.renderscript.ScriptIntrinsicBlur;
import androidx.core.view.ViewCompat;
import androidx.recyclerview.widget.ItemTouchHelper;
import com.bytedance.sdk.component.utils.ko;
import java.lang.reflect.Array;

/* JADX INFO: loaded from: classes2.dex */
public final class ouw {
    public static Bitmap ouw(Context context, Bitmap bitmap, int i10) {
        if (Build.VERSION.SDK_INT < 26) {
            return null;
        }
        try {
            Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmap, Math.round(bitmap.getWidth() * 0.2f), Math.round(bitmap.getHeight() * 0.2f), false);
            if (com.bytedance.sdk.component.adexpress.yu.lh() == 0) {
                return vt(context, bitmapCreateScaledBitmap, i10);
            }
            return com.bytedance.sdk.component.adexpress.yu.lh() == 1 ? ouw(bitmapCreateScaledBitmap, i10) : vt(bitmapCreateScaledBitmap, i10);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:42:0x00aa A[DONT_GENERATE, DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:43:0x00ac A[Catch: all -> 0x00bf, DONT_GENERATE, TryCatch #9 {all -> 0x00bf, blocks: (B:40:0x00a2, B:43:0x00ac, B:45:0x00b1, B:47:0x00b6, B:49:0x00bb), top: B:87:0x00a2 }] */
    /* JADX WARN: Code duplicated, block: B:45:0x00b1 A[Catch: all -> 0x00bf, DONT_GENERATE, TryCatch #9 {all -> 0x00bf, blocks: (B:40:0x00a2, B:43:0x00ac, B:45:0x00b1, B:47:0x00b6, B:49:0x00bb), top: B:87:0x00a2 }] */
    /* JADX WARN: Code duplicated, block: B:47:0x00b6 A[Catch: all -> 0x00bf, DONT_GENERATE, TryCatch #9 {all -> 0x00bf, blocks: (B:40:0x00a2, B:43:0x00ac, B:45:0x00b1, B:47:0x00b6, B:49:0x00bb), top: B:87:0x00a2 }] */
    /* JADX WARN: Code duplicated, block: B:49:0x00bb A[Catch: all -> 0x00bf, DONT_GENERATE, TRY_LEAVE, TryCatch #9 {all -> 0x00bf, blocks: (B:40:0x00a2, B:43:0x00ac, B:45:0x00b1, B:47:0x00b6, B:49:0x00bb), top: B:87:0x00a2 }] */
    /* JADX WARN: Code duplicated, block: B:90:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:91:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [android.renderscript.BaseObj] */
    /* JADX WARN: Type inference failed for: r4v3, types: [android.renderscript.BaseObj, android.renderscript.ScriptIntrinsicBlur] */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1, types: [android.renderscript.Allocation] */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v4, types: [android.renderscript.Allocation] */
    private static Bitmap vt(Context context, Bitmap bitmap, int i10) {
        RenderScript renderScriptCreate;
        Allocation allocationCreateFromBitmap;
        ?? Create;
        ?? CreateFromBitmap;
        com.bytedance.sdk.component.adexpress.ouw.ouw.lh lhVar;
        try {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap);
            renderScriptCreate = RenderScript.create(context);
            if (renderScriptCreate == null) {
                try {
                    if (com.bytedance.sdk.component.adexpress.ouw.ouw.ouw.ouw().f11574lh != null && renderScriptCreate != null) {
                        RenderScript.releaseAllContexts();
                    }
                } catch (Throwable th2) {
                    ko.fkw("BlurUtils", "gaussianBlur destrot error: " + th2.getMessage());
                }
                return null;
            }
            try {
                Create = ScriptIntrinsicBlur.create(renderScriptCreate, Element.U8_4(renderScriptCreate));
                try {
                    allocationCreateFromBitmap = Allocation.createFromBitmap(renderScriptCreate, bitmap);
                    try {
                        CreateFromBitmap = Allocation.createFromBitmap(renderScriptCreate, bitmapCreateBitmap);
                        try {
                            Create.setRadius(i10);
                            Create.setInput(allocationCreateFromBitmap);
                            Create.forEach(CreateFromBitmap);
                            CreateFromBitmap.copyTo(bitmapCreateBitmap);
                            try {
                                if (com.bytedance.sdk.component.adexpress.ouw.ouw.ouw.ouw().f11574lh != null) {
                                    RenderScript.releaseAllContexts();
                                    if (allocationCreateFromBitmap != null) {
                                        allocationCreateFromBitmap.destroy();
                                    }
                                    CreateFromBitmap.destroy();
                                    Create.destroy();
                                }
                            } catch (Throwable th3) {
                                ko.fkw("BlurUtils", "gaussianBlur destrot error: " + th3.getMessage());
                            }
                            return bitmapCreateBitmap;
                        } catch (Throwable th4) {
                            th = th4;
                            try {
                                ko.fkw("BlurUtils", "gaussianBlur error: " + th.getMessage());
                                try {
                                    if (lhVar != null) {
                                        return null;
                                    }
                                    if (Create != 0) {
                                        return null;
                                    }
                                    return null;
                                } catch (Throwable th5) {
                                    return null;
                                }
                            } finally {
                                try {
                                    if (com.bytedance.sdk.component.adexpress.ouw.ouw.ouw.ouw().f11574lh != null) {
                                        if (renderScriptCreate != null) {
                                            RenderScript.releaseAllContexts();
                                        }
                                        if (allocationCreateFromBitmap != null) {
                                            allocationCreateFromBitmap.destroy();
                                        }
                                        if (CreateFromBitmap != 0) {
                                            CreateFromBitmap.destroy();
                                        }
                                        if (Create != 0) {
                                            Create.destroy();
                                        }
                                    }
                                } catch (Throwable th6) {
                                    ko.fkw("BlurUtils", "gaussianBlur destrot error: " + th6.getMessage());
                                }
                            }
                        }
                    } catch (Throwable th7) {
                        th = th7;
                        CreateFromBitmap = 0;
                    }
                } catch (Throwable th8) {
                    th = th8;
                    allocationCreateFromBitmap = null;
                    CreateFromBitmap = 0;
                }
            } catch (Throwable th9) {
                th = th9;
                allocationCreateFromBitmap = null;
                Create = allocationCreateFromBitmap;
                CreateFromBitmap = Create;
                ko.fkw("BlurUtils", "gaussianBlur error: " + th.getMessage());
                if (lhVar != null) {
                    return null;
                }
                if (Create != 0) {
                    return null;
                }
                return null;
            }
        } catch (Throwable th10) {
            th = th10;
            renderScriptCreate = null;
            allocationCreateFromBitmap = null;
        }
    }

    private static Bitmap ouw(Bitmap bitmap, int i10) {
        int i11 = i10;
        try {
            int width = bitmap.getWidth();
            int height = bitmap.getHeight();
            int i12 = width * height;
            int[] iArr = new int[i12];
            bitmap.getPixels(iArr, 0, width, 0, 0, width, height);
            int i13 = width - 1;
            int i14 = height - 1;
            int i15 = i11 + i11 + 1;
            int i16 = (i15 + 1) >> 1;
            int i17 = i16 * i16;
            int[] iArr2 = new int[Math.max(width, height)];
            int i18 = i17 * 256;
            int[] iArr3 = new int[i18];
            int[] iArr4 = new int[i12];
            int[] iArr5 = new int[i12];
            int[] iArr6 = new int[i12];
            for (int i19 = 0; i19 < i18; i19++) {
                iArr3[i19] = i19 / i17;
            }
            int[][] iArr7 = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, i15, 3);
            int i20 = i11 + 1;
            int i21 = 0;
            int i22 = 0;
            int i23 = 0;
            while (i21 < height) {
                int i24 = -i11;
                int i25 = 0;
                int i26 = 0;
                int i27 = 0;
                int i28 = 0;
                int i29 = 0;
                int i30 = 0;
                int i31 = 0;
                int i32 = 0;
                int i33 = 0;
                while (i24 <= i11) {
                    int i34 = i14;
                    int i35 = height;
                    int i36 = iArr[i22 + Math.min(i13, Math.max(i24, 0))];
                    int[] iArr8 = iArr7[i24 + i11];
                    iArr8[0] = (i36 & ItemTouchHelper.ACTION_MODE_DRAG_MASK) >> 16;
                    iArr8[1] = (i36 & 65280) >> 8;
                    iArr8[2] = i36 & 255;
                    int iAbs = i20 - Math.abs(i24);
                    int i37 = iArr8[0];
                    i25 += i37 * iAbs;
                    int i38 = iArr8[1];
                    i26 += i38 * iAbs;
                    int i39 = iArr8[2];
                    i27 += iAbs * i39;
                    if (i24 <= 0) {
                        i29 += i37;
                        i31 += i38;
                        i33 += i39;
                    } else {
                        i28 += i37;
                        i30 += i38;
                        i32 += i39;
                    }
                    i24++;
                    height = i35;
                    i14 = i34;
                }
                int i40 = i14;
                int i41 = height;
                int i42 = i11;
                int i43 = 0;
                while (i43 < width) {
                    iArr4[i22] = iArr3[i25];
                    iArr5[i22] = iArr3[i26];
                    iArr6[i22] = iArr3[i27];
                    int[] iArr9 = iArr7[((i42 - i11) + i15) % i15];
                    int i44 = i25 - i29;
                    int i45 = i26 - i31;
                    int i46 = i27 - i33;
                    int i47 = i29 - iArr9[0];
                    int i48 = i31 - iArr9[1];
                    int i49 = i33 - iArr9[2];
                    if (i21 == 0) {
                        iArr2[i43] = Math.min(i43 + i11 + 1, i13);
                    }
                    int i50 = iArr[i23 + iArr2[i43]];
                    int i51 = (i50 & ItemTouchHelper.ACTION_MODE_DRAG_MASK) >> 16;
                    iArr9[0] = i51;
                    int i52 = (i50 & 65280) >> 8;
                    iArr9[1] = i52;
                    int i53 = i50 & 255;
                    iArr9[2] = i53;
                    int i54 = i28 + i51;
                    int i55 = i30 + i52;
                    int i56 = i32 + i53;
                    i42 = (i42 + 1) % i15;
                    int[] iArr10 = iArr7[i42 % i15];
                    i25 = i44 + i54;
                    i26 = i45 + i55;
                    i27 = i46 + i56;
                    int i57 = iArr10[0];
                    i28 = i54 - i57;
                    int i58 = iArr10[1];
                    i30 = i55 - i58;
                    int i59 = iArr10[2];
                    i32 = i56 - i59;
                    i29 = i47 + i57;
                    i31 = i48 + i58;
                    i33 = i49 + i59;
                    i22++;
                    i43++;
                    iArr3 = iArr3;
                }
                i23 += width;
                i21++;
                height = i41;
                i14 = i40;
            }
            int i60 = i14;
            int[] iArr11 = iArr3;
            int i61 = height;
            int i62 = 0;
            while (i62 < width) {
                int i63 = -i11;
                int i64 = i63 * width;
                int i65 = 0;
                int i66 = 0;
                int i67 = 0;
                int i68 = 0;
                int i69 = 0;
                int i70 = 0;
                int i71 = 0;
                int i72 = 0;
                int i73 = 0;
                while (i63 <= i11) {
                    int[] iArr12 = iArr7[i63 + i11];
                    int[] iArr13 = iArr2;
                    int iMax = Math.max(0, i64) + i62;
                    int iAbs2 = i20 - Math.abs(i63);
                    int i74 = iArr4[iMax];
                    i65 += i74 * iAbs2;
                    i66 += iArr5[iMax] * iAbs2;
                    i67 += iArr6[iMax] * iAbs2;
                    iArr12[0] = i74;
                    int i75 = iArr5[iMax];
                    iArr12[1] = i75;
                    int i76 = iArr6[iMax];
                    iArr12[2] = i76;
                    if (i63 <= 0) {
                        i69 += i74;
                        i71 += i75;
                        i73 += i76;
                    } else {
                        i68 += i74;
                        i70 += i75;
                        i72 += i76;
                    }
                    int i77 = i60;
                    if (i63 < i77) {
                        i64 += width;
                    }
                    i63++;
                    i60 = i77;
                    iArr2 = iArr13;
                }
                int[] iArr14 = iArr2;
                int i78 = i60;
                int i79 = i11;
                int i80 = i62;
                int i81 = i61;
                int i82 = 0;
                while (i82 < i81) {
                    iArr[i80] = (iArr[i80] & ViewCompat.MEASURED_STATE_MASK) | (iArr11[i65] << 16) | (iArr11[i66] << 8) | iArr11[i67];
                    int[] iArr15 = iArr7[((i79 - i11) + i15) % i15];
                    int i83 = i65 - i69;
                    int i84 = i66 - i71;
                    int i85 = i67 - i73;
                    int i86 = i69 - iArr15[0];
                    int i87 = i71 - iArr15[1];
                    int i88 = i73 - iArr15[2];
                    if (i62 == 0) {
                        iArr14[i82] = Math.min(i82 + i20, i78) * width;
                    }
                    int i89 = iArr14[i82] + i62;
                    int i90 = iArr4[i89];
                    iArr15[0] = i90;
                    int i91 = iArr5[i89];
                    iArr15[1] = i91;
                    int i92 = iArr6[i89];
                    iArr15[2] = i92;
                    int i93 = i68 + i90;
                    int i94 = i70 + i91;
                    int i95 = i72 + i92;
                    i65 = i83 + i93;
                    i66 = i84 + i94;
                    i67 = i85 + i95;
                    i79 = (i79 + 1) % i15;
                    int[] iArr16 = iArr7[i79];
                    int i96 = iArr16[0];
                    i68 = i93 - i96;
                    int i97 = iArr16[1];
                    i70 = i94 - i97;
                    int i98 = iArr16[2];
                    i72 = i95 - i98;
                    i69 = i86 + i96;
                    i71 = i87 + i97;
                    i73 = i88 + i98;
                    i80 += width;
                    i82++;
                    i11 = i10;
                }
                i62++;
                i11 = i10;
                i61 = i81;
                i60 = i78;
                iArr2 = iArr14;
            }
            bitmap.setPixels(iArr, 0, width, 0, 0, width, i61);
            return bitmap;
        } catch (Throwable th2) {
            ko.fkw("BlurUtils", "gaussianBlur error: " + th2.getMessage());
            return null;
        }
    }

    private static Bitmap vt(Bitmap bitmap, int i10) {
        try {
            if (Build.VERSION.SDK_INT < 31) {
                return ouw(bitmap, i10);
            }
            ImageReader imageReaderNewInstance = ImageReader.newInstance(bitmap.getWidth(), bitmap.getHeight(), 1, 1, 768L);
            RenderNode renderNode = new RenderNode("BlurEffect");
            HardwareRenderer hardwareRenderer = new HardwareRenderer();
            hardwareRenderer.setSurface(imageReaderNewInstance.getSurface());
            hardwareRenderer.setContentRoot(renderNode);
            renderNode.setPosition(0, 0, imageReaderNewInstance.getWidth(), imageReaderNewInstance.getHeight());
            float f10 = i10;
            renderNode.setRenderEffect(RenderEffect.createBlurEffect(f10, f10, Shader.TileMode.MIRROR));
            renderNode.beginRecording().drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
            renderNode.endRecording();
            hardwareRenderer.createRenderRequest().setWaitForPresent(true).syncAndDraw();
            Image imageAcquireNextImage = imageReaderNewInstance.acquireNextImage();
            HardwareBuffer hardwareBuffer = imageAcquireNextImage.getHardwareBuffer();
            Bitmap bitmapWrapHardwareBuffer = Bitmap.wrapHardwareBuffer(hardwareBuffer, null);
            hardwareBuffer.close();
            imageAcquireNextImage.close();
            imageReaderNewInstance.close();
            renderNode.discardDisplayList();
            hardwareRenderer.destroy();
            return bitmapWrapHardwareBuffer;
        } catch (Throwable th2) {
            ko.fkw("BlurUtils", "gaussianBlur error: " + th2.getMessage());
            return ouw(bitmap, i10);
        }
    }
}
