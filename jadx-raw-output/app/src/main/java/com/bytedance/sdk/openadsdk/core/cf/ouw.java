package com.bytedance.sdk.openadsdk.core.cf;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.ImageDecoder;
import android.graphics.drawable.AnimatedImageDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextUtils;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import com.bytedance.sdk.component.fkw.cf;
import com.bytedance.sdk.component.fkw.rn;
import com.bytedance.sdk.component.fkw.tlj;
import com.bytedance.sdk.component.pno.pno;
import com.bytedance.sdk.component.utils.ko;
import com.bytedance.sdk.component.utils.qbp;
import com.bytedance.sdk.component.utils.ra;
import com.bytedance.sdk.openadsdk.core.zih;
import com.bytedance.sdk.openadsdk.utils.bs;
import com.bytedance.sdk.openadsdk.utils.osn;
import com.safedk.android.internal.partials.PangleFilesBridge;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class ouw implements com.bytedance.adsdk.ugeno.ouw {

    /* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.core.cf.ouw$ouw, reason: collision with other inner class name */
    public interface InterfaceC0115ouw {
        void ouw(Drawable drawable);
    }

    public static class vt implements rn {

        /* JADX INFO: renamed from: lh, reason: collision with root package name */
        private final int f12639lh;
        private final WeakReference<ImageView> ouw;
        private final ouw vt;
        private final int yu;

        @Override // com.bytedance.sdk.component.fkw.rn
        public final void ouw(int i10, String str, Throwable th2) {
        }

        @Override // com.bytedance.sdk.component.fkw.rn
        public final void ouw(cf cfVar) {
            try {
                final ImageView imageView = this.ouw.get();
                if (imageView == null) {
                    return;
                }
                final Object objVt = cfVar.vt();
                if (objVt instanceof Drawable) {
                    bs.ouw((Runnable) new pno("load_draw_img") { // from class: com.bytedance.sdk.openadsdk.core.cf.ouw.vt.1
                        @Override // java.lang.Runnable
                        public final void run() {
                            if (Build.VERSION.SDK_INT >= 28) {
                                Object obj = objVt;
                                if (obj instanceof AnimatedImageDrawable) {
                                    ((AnimatedImageDrawable) obj).start();
                                }
                            }
                            imageView.setImageDrawable((Drawable) objVt);
                        }
                    });
                    return;
                }
                if (!(objVt instanceof byte[])) {
                    if (objVt instanceof Bitmap) {
                        bs.ouw((Runnable) new pno("ug_load_bitmap") { // from class: com.bytedance.sdk.openadsdk.core.cf.ouw.vt.3
                            @Override // java.lang.Runnable
                            public final void run() {
                                imageView.setImageBitmap((Bitmap) objVt);
                            }
                        });
                        return;
                    }
                    return;
                }
                if (!cfVar.fkw()) {
                    if (com.bytedance.sdk.component.utils.cf.ouw((byte[]) objVt)) {
                        ouw.ouw(this.vt, imageView, (byte[]) objVt, this.f12639lh, this.yu);
                        return;
                    }
                    ko.vt("ImageLoaderProvider", "load static image");
                    final Bitmap bitmapOuw = new com.bytedance.sdk.component.fkw.yu.lh.vt.vt(this.f12639lh, this.yu, imageView.getScaleType(), Bitmap.Config.RGB_565, this.f12639lh, this.yu).ouw((byte[]) objVt);
                    if (bitmapOuw != null) {
                        bs.ouw((Runnable) new pno("load_static_img") { // from class: com.bytedance.sdk.openadsdk.core.cf.ouw.vt.2
                            @Override // java.lang.Runnable
                            public final void run() {
                                imageView.setImageBitmap(bitmapOuw);
                            }
                        });
                        return;
                    }
                    return;
                }
                if (Build.VERSION.SDK_INT > 30) {
                    ouw.ouw(this.vt, imageView, (byte[]) objVt, this.f12639lh, this.yu);
                    return;
                }
                final ouw ouwVar = this.vt;
                final byte[] bArr = (byte[]) objVt;
                try {
                    ko.fkw("ImageLoaderProvider", "load animation image");
                    final InterfaceC0115ouw interfaceC0115ouw = new InterfaceC0115ouw() { // from class: com.bytedance.sdk.openadsdk.core.cf.ouw.3
                        @Override // com.bytedance.sdk.openadsdk.core.cf.ouw.InterfaceC0115ouw
                        public final void ouw(final Drawable drawable) {
                            bs.ouw(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.cf.ouw.3.1
                                @Override // java.lang.Runnable
                                public final void run() {
                                    if (Build.VERSION.SDK_INT >= 28) {
                                        Drawable drawable2 = drawable;
                                        if (drawable2 instanceof AnimatedImageDrawable) {
                                            ((AnimatedImageDrawable) drawable2).start();
                                        }
                                    }
                                    imageView.setImageDrawable(drawable);
                                }
                            });
                        }
                    };
                    bs.vt(new pno("pag_animation_drawable") { // from class: com.bytedance.sdk.openadsdk.core.cf.ouw.4
                        @Override // java.lang.Runnable
                        public final void run() {
                            Drawable drawableOuw = ouw.ouw(bArr);
                            InterfaceC0115ouw interfaceC0115ouw2 = interfaceC0115ouw;
                            if (interfaceC0115ouw2 != null) {
                                interfaceC0115ouw2.ouw(drawableOuw);
                            }
                        }
                    });
                } catch (Exception e10) {
                    qbp.lh("ImageLoaderProvider", e10.getMessage());
                }
            } catch (Throwable th2) {
                qbp.lh("ImageLoaderProvider", th2.getMessage());
            }
        }

        public vt(ImageView imageView, ouw ouwVar, int i10, int i11) {
            this.ouw = new WeakReference<>(imageView);
            this.vt = ouwVar;
            this.f12639lh = i10;
            this.yu = i11;
        }
    }

    @Override // com.bytedance.adsdk.ugeno.ouw
    public final void ouw(com.bytedance.adsdk.ugeno.core.cf cfVar, String str, ImageView imageView, int i10, int i11) {
        String strOuw = lh.ouw(str);
        tlj tljVarLh = com.bytedance.sdk.openadsdk.tlj.yu.ouw.ouw(com.bytedance.sdk.openadsdk.tlj.yu.ouw.vt.ouw(strOuw).fkw(osn.le(zih.ouw())).yu(osn.yu(zih.ouw()))).lh(1);
        ouw(cfVar, tljVarLh, strOuw);
        tljVarLh.ouw(new vt(imageView, this, i10, i11));
    }

    public static Drawable ouw(byte[] bArr) {
        FileOutputStream fileOutputStreamFileOutputStreamCtor;
        try {
            boolean zLh = com.bytedance.sdk.openadsdk.multipro.vt.lh();
            File fileOuw = ra.ouw(zih.ouw(), zLh, zLh ? "UGEN_GIF_AD_CACHE/" : "/UGEN_GIF_CACHE/", "TT_UGEN_GIF_FILE");
            fileOutputStreamFileOutputStreamCtor = PangleFilesBridge.fileOutputStreamCtor(fileOuw);
            try {
                fileOutputStreamFileOutputStreamCtor.write(bArr, 0, bArr.length);
                if (Build.VERSION.SDK_INT >= 28) {
                    Drawable drawableDecodeDrawable = ImageDecoder.decodeDrawable(ImageDecoder.createSource(fileOuw));
                    try {
                        fileOutputStreamFileOutputStreamCtor.close();
                    } catch (Throwable unused) {
                    }
                    return drawableDecodeDrawable;
                }
                BitmapDrawable bitmapDrawable = new BitmapDrawable(zih.ouw().getResources(), BitmapFactory.decodeByteArray(bArr, 0, bArr.length));
                try {
                    fileOutputStreamFileOutputStreamCtor.close();
                } catch (Throwable unused2) {
                }
                return bitmapDrawable;
            } catch (Throwable th2) {
                th = th2;
                try {
                    qbp.ouw("ImageLoaderProvider", "GifView  getSourceByFile fail : ", th);
                    return null;
                } finally {
                    if (fileOutputStreamFileOutputStreamCtor != null) {
                        try {
                            fileOutputStreamFileOutputStreamCtor.close();
                        } catch (Throwable unused3) {
                        }
                    }
                }
            }
        } catch (Throwable th3) {
            th = th3;
            fileOutputStreamFileOutputStreamCtor = null;
        }
    }

    @Override // com.bytedance.adsdk.ugeno.ouw
    public final void ouw(com.bytedance.adsdk.ugeno.core.cf cfVar, String str, final com.bytedance.adsdk.ugeno.ouw.InterfaceC0071ouw interfaceC0071ouw) {
        String strOuw = lh.ouw(str);
        tlj tljVarLh = com.bytedance.sdk.openadsdk.tlj.yu.ouw.ouw(com.bytedance.sdk.openadsdk.tlj.yu.ouw.vt.ouw(strOuw).fkw(osn.le(zih.ouw())).yu(osn.yu(zih.ouw()))).lh(2);
        ouw(cfVar, tljVarLh, strOuw);
        tljVarLh.ouw(new rn() { // from class: com.bytedance.sdk.openadsdk.core.cf.ouw.5
            @Override // com.bytedance.sdk.component.fkw.rn
            public final void ouw(cf cfVar2) {
                if (cfVar2 == null) {
                    interfaceC0071ouw.ouw(null);
                    return;
                }
                if (interfaceC0071ouw != null) {
                    Object objVt = cfVar2.vt();
                    if (objVt instanceof Bitmap) {
                        interfaceC0071ouw.ouw((Bitmap) objVt);
                        return;
                    }
                    if (cfVar2.vt() instanceof byte[]) {
                        try {
                            interfaceC0071ouw.ouw(BitmapFactory.decodeByteArray((byte[]) cfVar2.vt(), 0, ((byte[]) cfVar2.vt()).length));
                            return;
                        } catch (Throwable unused) {
                        }
                    }
                    interfaceC0071ouw.ouw(null);
                }
            }

            @Override // com.bytedance.sdk.component.fkw.rn
            public final void ouw(int i10, String str2, Throwable th2) {
                com.bytedance.adsdk.ugeno.ouw.InterfaceC0071ouw interfaceC0071ouw2 = interfaceC0071ouw;
                if (interfaceC0071ouw2 != null) {
                    interfaceC0071ouw2.ouw(null);
                }
            }
        });
    }

    private static void ouw(com.bytedance.adsdk.ugeno.core.cf cfVar, @NonNull tlj tljVar, String str) {
        Map<String, Object> map;
        if (cfVar == null || (map = cfVar.yu) == null) {
            return;
        }
        Object obj = map.get("image_info");
        if (obj instanceof Map) {
            tljVar.ouw((String) ((Map) obj).get(str));
        }
        String str2 = (String) map.get("cache_dir");
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        tljVar.vt(str2);
    }

    public static /* synthetic */ void ouw(ouw ouwVar, final ImageView imageView, byte[] bArr, int i10, int i11) {
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
        if (Build.VERSION.SDK_INT >= 28) {
            try {
                final Drawable drawableDecodeDrawable = ImageDecoder.decodeDrawable(ImageDecoder.createSource(byteBufferWrap));
                if (drawableDecodeDrawable != null) {
                    bs.ouw((Runnable) new pno("loadAnimatedDrawable") { // from class: com.bytedance.sdk.openadsdk.core.cf.ouw.1
                        @Override // java.lang.Runnable
                        public final void run() {
                            Drawable drawable = drawableDecodeDrawable;
                            if (drawable instanceof AnimatedImageDrawable) {
                                ((AnimatedImageDrawable) drawable).start();
                            }
                            imageView.setImageDrawable(drawableDecodeDrawable);
                        }
                    });
                    return;
                }
                return;
            } catch (IOException e10) {
                qbp.lh("ImageLoaderProvider", e10.getMessage());
                return;
            }
        }
        final Bitmap bitmapOuw = new com.bytedance.sdk.component.fkw.yu.lh.vt.vt(i10, i11, imageView.getScaleType(), Bitmap.Config.ARGB_4444, i10, i11).ouw(bArr);
        if (bitmapOuw != null) {
            bs.ouw((Runnable) new pno("loadStaticImage") { // from class: com.bytedance.sdk.openadsdk.core.cf.ouw.2
                @Override // java.lang.Runnable
                public final void run() {
                    imageView.setImageBitmap(bitmapOuw);
                }
            });
        }
    }
}
