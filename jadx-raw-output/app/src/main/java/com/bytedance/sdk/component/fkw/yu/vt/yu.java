package com.bytedance.sdk.component.fkw.yu.vt;

import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import android.graphics.drawable.Drawable;
import android.os.Build;
import com.bytedance.sdk.component.fkw.mwh;
import com.bytedance.sdk.component.fkw.th;
import com.bytedance.sdk.component.fkw.yu.lh.le;
import com.bytedance.sdk.component.utils.cf;
import com.bytedance.sdk.component.utils.ko;
import com.bytedance.sdk.component.utils.qbp;
import com.bytedance.sdk.component.utils.ra;
import com.safedk.android.internal.partials.PangleFilesBridge;
import java.io.File;
import java.io.FileOutputStream;

/* JADX INFO: loaded from: classes11.dex */
public final class yu<T> implements le {
    private static void ouw(com.bytedance.sdk.component.fkw.vt vtVar, com.bytedance.sdk.component.fkw.yu.lh.le leVar, String str, Bitmap bitmap) {
        if (vtVar == null || leVar == null || !vtVar.fkw()) {
            return;
        }
        leVar.ouw(vtVar).ouw(str, bitmap);
    }

    @Override // com.bytedance.sdk.component.fkw.yu.vt.le
    public final String ouw() {
        return "decode";
    }

    @Override // com.bytedance.sdk.component.fkw.yu.vt.le
    public final boolean ouw(final com.bytedance.sdk.component.fkw.yu.lh.lh lhVar, th thVar, final com.bytedance.sdk.component.fkw.yu.lh.ouw ouwVar) {
        final byte[] bArr = lhVar.f11745tc;
        if (bArr == null) {
            ouwVar.ouw(2000, "imageData is empty", new Exception("imageData is empty"));
            return false;
        }
        int i10 = lhVar.tlj;
        lhVar.f11746th = bArr.length;
        if (i10 == 2) {
            boolean z10 = (com.bytedance.sdk.component.utils.le.vt(bArr) || cf.ouw(bArr)) ? false : true;
            if (com.bytedance.sdk.component.utils.le.ouw(bArr)) {
                ouw(lhVar, bArr, z10, ouwVar);
            } else {
                ouwVar.ouw(1001, "result type is bit but data not image", new Exception("not image format"));
            }
        } else if (i10 != 3) {
            if (com.bytedance.sdk.component.utils.le.vt(bArr)) {
                try {
                    final com.bytedance.sdk.component.fkw.yu.lh.le leVar = lhVar.qbp;
                    final com.bytedance.sdk.component.fkw.yu.lh.vt.ouw ouwVar2 = new com.bytedance.sdk.component.fkw.yu.lh.vt.ouw();
                    final com.bytedance.sdk.component.fkw.yu.lh.vt.ouw.InterfaceC0090ouw interfaceC0090ouw = new com.bytedance.sdk.component.fkw.yu.lh.vt.ouw.InterfaceC0090ouw() { // from class: com.bytedance.sdk.component.fkw.yu.vt.yu.2
                        @Override // com.bytedance.sdk.component.fkw.yu.lh.vt.ouw.InterfaceC0090ouw
                        public final void ouw(Drawable drawable) {
                            ouwVar.ouw(new com.bytedance.sdk.component.fkw.yu.lh.yu().ouw(lhVar, drawable, null, true));
                        }

                        @Override // com.bytedance.sdk.component.fkw.yu.lh.vt.ouw.InterfaceC0090ouw
                        public final void ouw() {
                            ouwVar.ouw(1002, "decode gif fail", new Exception("decode gif fail"));
                        }

                        @Override // com.bytedance.sdk.component.fkw.yu.lh.vt.ouw.InterfaceC0090ouw
                        public final void vt() {
                            if (com.bytedance.sdk.component.utils.le.ouw(bArr)) {
                                yu.ouw(lhVar, bArr, true, ouwVar);
                            } else {
                                ouwVar.ouw(1001, "result type is gif but data not image", new Exception("gif not image format"));
                            }
                        }
                    };
                    if (Build.VERSION.SDK_INT <= 30) {
                        try {
                            ko.vt("PAGGifDefaultDecoder", "load animation image");
                            leVar.vt().submit(new Runnable() { // from class: com.bytedance.sdk.component.fkw.yu.lh.vt.ouw.1

                                /* JADX INFO: renamed from: lh */
                                public final /* synthetic */ InterfaceC0090ouw f11765lh;
                                public final /* synthetic */ byte[] ouw;
                                public final /* synthetic */ le vt;

                                public AnonymousClass1() {
                                    bArr = bArr;
                                    leVar = leVar;
                                    interfaceC0090ouw = interfaceC0090ouw;
                                }

                                @Override // java.lang.Runnable
                                public final void run() {
                                    byte[] bArr2 = bArr;
                                    le leVar2 = leVar;
                                    InterfaceC0090ouw interfaceC0090ouw2 = interfaceC0090ouw;
                                    FileOutputStream fileOutputStream = null;
                                    try {
                                        mwh mwhVar = leVar2.vt;
                                        boolean zTlj = mwhVar != null ? mwhVar.tlj() : false;
                                        File fileOuw = ra.ouw(leVar2.f11733le, zTlj, zTlj ? "P_GIF_MUTIL_CACHE/" : "/P_GIF_CACHE/", "P_U_GIF_FILE");
                                        FileOutputStream fileOutputStreamFileOutputStreamCtor = PangleFilesBridge.fileOutputStreamCtor(fileOuw);
                                        try {
                                            fileOutputStreamFileOutputStreamCtor.write(bArr2, 0, bArr2.length);
                                            if (Build.VERSION.SDK_INT < 28) {
                                                if (interfaceC0090ouw2 != null) {
                                                    interfaceC0090ouw2.vt();
                                                }
                                                try {
                                                    fileOutputStreamFileOutputStreamCtor.close();
                                                    return;
                                                } catch (Throwable unused) {
                                                    return;
                                                }
                                            }
                                            Drawable drawableDecodeDrawable = ImageDecoder.decodeDrawable(ImageDecoder.createSource(fileOuw));
                                            if (interfaceC0090ouw2 != null) {
                                                interfaceC0090ouw2.ouw(drawableDecodeDrawable);
                                            }
                                            try {
                                                fileOutputStreamFileOutputStreamCtor.close();
                                            } catch (Throwable unused2) {
                                            }
                                        } catch (Throwable th2) {
                                            th = th2;
                                            fileOutputStream = fileOutputStreamFileOutputStreamCtor;
                                            try {
                                                qbp.ouw("PAGGifDefaultDecoder", "Gif  getSourceByFile fail : ", th);
                                                if (fileOutputStream != null) {
                                                    try {
                                                        fileOutputStream.close();
                                                    } catch (Throwable unused3) {
                                                    }
                                                }
                                                if (interfaceC0090ouw2 != null) {
                                                    interfaceC0090ouw2.ouw();
                                                }
                                            } catch (Throwable th3) {
                                                if (fileOutputStream != null) {
                                                    try {
                                                        fileOutputStream.close();
                                                    } catch (Throwable unused4) {
                                                    }
                                                }
                                                throw th3;
                                            }
                                        }
                                    } catch (Throwable th4) {
                                        th = th4;
                                    }
                                }
                            });
                        } catch (Throwable th2) {
                            qbp.lh("PAGGifDefaultDecoder", th2.getMessage());
                            interfaceC0090ouw.ouw();
                        }
                    } else {
                        com.bytedance.sdk.component.fkw.yu.lh.vt.ouw.ouw(bArr, interfaceC0090ouw);
                    }
                } catch (Throwable th3) {
                    ouwVar.ouw(2000, "decode gif error", th3);
                }
            } else if (cf.ouw(bArr)) {
                try {
                    new com.bytedance.sdk.component.fkw.yu.lh.vt.ouw();
                    com.bytedance.sdk.component.fkw.yu.lh.vt.ouw.ouw(bArr, new com.bytedance.sdk.component.fkw.yu.lh.vt.ouw.InterfaceC0090ouw() { // from class: com.bytedance.sdk.component.fkw.yu.vt.yu.1
                        @Override // com.bytedance.sdk.component.fkw.yu.lh.vt.ouw.InterfaceC0090ouw
                        public final void ouw(Drawable drawable) {
                            ouwVar.ouw(new com.bytedance.sdk.component.fkw.yu.lh.yu().ouw(lhVar, drawable, null, false));
                        }

                        @Override // com.bytedance.sdk.component.fkw.yu.lh.vt.ouw.InterfaceC0090ouw
                        public final void ouw() {
                            ouwVar.ouw(1002, "decode webp animate fail", new Exception("decode webp animate fail"));
                        }

                        @Override // com.bytedance.sdk.component.fkw.yu.lh.vt.ouw.InterfaceC0090ouw
                        public final void vt() {
                            if (com.bytedance.sdk.component.utils.le.ouw(bArr)) {
                                yu.ouw(lhVar, bArr, true, ouwVar);
                            } else {
                                ouwVar.ouw(1001, "result type is webp animated but data not image", new Exception("webp animated not image format"));
                            }
                        }
                    });
                } catch (Throwable th4) {
                    ouwVar.ouw(2000, "decode webp animation error", th4);
                }
            } else if (com.bytedance.sdk.component.utils.le.ouw(bArr)) {
                ouw(lhVar, bArr, true, ouwVar);
            } else {
                ouwVar.ouw(1001, "is not supprot image type", new Exception("not supprot image type"));
            }
        } else {
            ouwVar.ouw(new com.bytedance.sdk.component.fkw.yu.lh.yu().ouw(lhVar, bArr, null, com.bytedance.sdk.component.utils.le.vt(bArr)));
        }
        return false;
    }

    public static void ouw(com.bytedance.sdk.component.fkw.yu.lh.lh lhVar, byte[] bArr, boolean z10, com.bytedance.sdk.component.fkw.yu.lh.ouw ouwVar) {
        try {
            com.bytedance.sdk.component.fkw.yu.lh.le leVar = lhVar.qbp;
            Bitmap bitmapOuw = com.bytedance.sdk.component.fkw.yu.lh.le.ouw(lhVar).ouw(bArr);
            if (bitmapOuw != null) {
                ko.vt("PagImageRequest", "step 5 decode success  image key is " + lhVar.vt + " url is " + lhVar.ouw + " bitmap is width = " + bitmapOuw.getWidth() + " height " + bitmapOuw.getHeight() + " size = " + ((bitmapOuw.getByteCount() * 1.0f) / 1024.0f));
                ouwVar.ouw(new com.bytedance.sdk.component.fkw.yu.lh.yu().ouw(lhVar, bitmapOuw, null, false));
                if (z10) {
                    ouw(lhVar.zin, leVar, lhVar.vt, bitmapOuw);
                    return;
                }
                return;
            }
            ko.vt("PagImageRequest", "step 5 decode fail bitmap is null image key is " + lhVar.vt + " url is " + lhVar.ouw);
            ouwVar.ouw(1002, "decode failed bitmap null", new Exception("decode failed bitmap null"));
        } catch (Throwable th2) {
            ko.ouw("PagImageRequest", "step 5 decode exception bitmap is null image key is " + lhVar.vt + " url is " + lhVar.ouw, th2);
            StringBuilder sb2 = new StringBuilder("decode failed:");
            sb2.append(th2.getMessage());
            ouwVar.ouw(1002, sb2.toString(), th2);
        }
    }
}
