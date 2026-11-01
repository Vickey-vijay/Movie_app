package com.mbridge.msdk.foundation.same.image;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.download.DownloadError;
import com.mbridge.msdk.foundation.download.DownloadMessage;
import com.mbridge.msdk.foundation.download.DownloadPriority;
import com.mbridge.msdk.foundation.download.DownloadResourceType;
import com.mbridge.msdk.foundation.download.MBDownloadManager;
import com.mbridge.msdk.foundation.download.OnDownloadStateListener;
import com.mbridge.msdk.foundation.download.core.DownloadRequest;
import com.mbridge.msdk.foundation.tools.o0;
import com.mbridge.msdk.foundation.tools.q0;
import java.io.File;
import java.util.concurrent.ThreadPoolExecutor;

/* JADX INFO: compiled from: CommonImageLoaderRefactor.java */
/* JADX INFO: loaded from: classes4.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ThreadPoolExecutor f34962a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Handler f34963b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f34964c;

    /* JADX INFO: compiled from: CommonImageLoaderRefactor.java */
    public class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f34965a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ com.mbridge.msdk.foundation.same.image.c f34966b;

        /* JADX INFO: renamed from: com.mbridge.msdk.foundation.same.image.d$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: CommonImageLoaderRefactor.java */
        public class RunnableC0327a implements Runnable {
            public RunnableC0327a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                a aVar = a.this;
                aVar.f34966b.onFailedLoad("create download request error", aVar.f34965a);
            }
        }

        public a(String str, g gVar, com.mbridge.msdk.foundation.same.image.c cVar) {
            this.f34965a = str;
            this.f34966b = cVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            DownloadRequest downloadRequestA = d.this.a(o0.d(this.f34965a), this.f34965a, null, this.f34966b);
            if (downloadRequestA != null) {
                downloadRequestA.start();
                return;
            }
            if (MBridgeConstans.DEBUG) {
                q0.b("CommonImageLoaderRefactor", "createDownloadRequest error");
            }
            if (this.f34966b == null) {
                return;
            }
            d.this.f34963b.post(new RunnableC0327a());
        }
    }

    /* JADX INFO: compiled from: CommonImageLoaderRefactor.java */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final d f34969a = new d(null);
    }

    /* JADX INFO: compiled from: CommonImageLoaderRefactor.java */
    public static final class c implements OnDownloadStateListener<Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final ThreadPoolExecutor f34970a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Handler f34971b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final String f34972c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final String f34973d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final String f34974e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final com.mbridge.msdk.foundation.same.image.c f34975f;

        /* JADX INFO: compiled from: CommonImageLoaderRefactor.java */
        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                c.this.a();
            }
        }

        /* JADX INFO: compiled from: CommonImageLoaderRefactor.java */
        public class b implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ String f34977a;

            public b(String str) {
                this.f34977a = str;
            }

            @Override // java.lang.Runnable
            public void run() {
                try {
                    c.this.f34975f.onFailedLoad(c.this.f34974e, this.f34977a);
                } catch (Exception e10) {
                    if (MBridgeConstans.DEBUG) {
                        q0.b("CommonImageLoaderRefactor", "callbackForFailed error", e10);
                    }
                }
            }
        }

        /* JADX INFO: renamed from: com.mbridge.msdk.foundation.same.image.d$c$c, reason: collision with other inner class name */
        /* JADX INFO: compiled from: CommonImageLoaderRefactor.java */
        public class RunnableC0328c implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ Bitmap f34979a;

            public RunnableC0328c(Bitmap bitmap) {
                this.f34979a = bitmap;
            }

            @Override // java.lang.Runnable
            public void run() {
                try {
                    c.this.f34975f.onSuccessLoad(this.f34979a, c.this.f34974e);
                } catch (Exception e10) {
                    if (MBridgeConstans.DEBUG) {
                        q0.b("CommonImageLoaderRefactor", "callbackForSuccess error", e10);
                    }
                }
            }
        }

        @Override // com.mbridge.msdk.foundation.download.OnDownloadStateListener
        public void onCancelDownload(DownloadMessage<Object> downloadMessage) {
        }

        @Override // com.mbridge.msdk.foundation.download.OnDownloadStateListener
        public void onDownloadStart(DownloadMessage<Object> downloadMessage) {
        }

        @Override // com.mbridge.msdk.foundation.download.OnDownloadStateListener
        public void onResponseStart(DownloadMessage<Object> downloadMessage) {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void a() {
            if (this.f34975f == null) {
                return;
            }
            try {
                Bitmap bitmapB = d.b(this.f34972c + this.f34973d);
                if (bitmapB == null) {
                    a("bitmap decode failed");
                    return;
                }
                Bitmap bitmapA = a(bitmapB, null);
                if (bitmapA == null) {
                    a("bitmap transformation failed");
                } else {
                    a(bitmapA);
                }
            } catch (Exception e10) {
                if (MBridgeConstans.DEBUG) {
                    q0.a("CommonImageLoaderRefactor", "onDownloadComplete decodeBitmap error = " + e10.getLocalizedMessage());
                }
                a("bitmap decode failed");
            }
        }

        private void b() {
            if (MBridgeConstans.DEBUG) {
                q0.a("CommonImageLoaderRefactor", "onDownloadComplete imageUrl = " + this.f34974e + " imagePath = " + this.f34972c + this.f34973d);
                File file = null;
                try {
                    file = new File(this.f34972c + this.f34973d);
                } catch (Exception e10) {
                    if (MBridgeConstans.DEBUG) {
                        q0.b("CommonImageLoaderRefactor", "onDownloadComplete error", e10);
                    }
                }
                if (file == null || !file.isFile() || !file.exists()) {
                    q0.b("CommonImageLoaderRefactor", "onDownloadComplete file not exist");
                    return;
                }
                q0.a("CommonImageLoaderRefactor", "onDownloadComplete file size = " + file.length());
            }
        }

        @Override // com.mbridge.msdk.foundation.download.OnDownloadStateListener
        public void onDownloadError(DownloadMessage<Object> downloadMessage, DownloadError downloadError) {
            if (MBridgeConstans.DEBUG) {
                q0.a("CommonImageLoaderRefactor", "onDownloadError imageUrl = " + downloadError.getException().getLocalizedMessage());
            }
            a(downloadError.getException().getLocalizedMessage());
        }

        public c(Handler handler, ThreadPoolExecutor threadPoolExecutor, String str, String str2, String str3, g gVar, com.mbridge.msdk.foundation.same.image.c cVar) {
            this.f34971b = handler;
            this.f34970a = threadPoolExecutor;
            this.f34974e = str;
            this.f34972c = str2;
            this.f34973d = str3;
            this.f34975f = cVar;
        }

        @Override // com.mbridge.msdk.foundation.download.OnDownloadStateListener
        public void onDownloadComplete(DownloadMessage<Object> downloadMessage) {
            b();
            this.f34970a.execute(new a());
        }

        private void a(String str) {
            if (this.f34975f == null) {
                return;
            }
            this.f34971b.post(new b(str));
        }

        private Bitmap a(Bitmap bitmap, g gVar) {
            if (gVar == null) {
                return bitmap;
            }
            try {
                return gVar.a(bitmap);
            } catch (Exception e10) {
                if (MBridgeConstans.DEBUG) {
                    q0.b("CommonImageLoaderRefactor", "handlerImageTransformation error", e10);
                }
                return bitmap;
            }
        }

        private void a(Bitmap bitmap) {
            if (this.f34975f == null) {
                return;
            }
            this.f34971b.post(new RunnableC0328c(bitmap));
        }
    }

    public /* synthetic */ d(a aVar) {
        this();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Bitmap b(String str) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeFile(str, options);
        options.inJustDecodeBounds = false;
        options.inPurgeable = true;
        options.inInputShareable = true;
        options.inDither = true;
        return BitmapFactory.decodeFile(str, options);
    }

    private d() {
        this.f34963b = new Handler(Looper.getMainLooper());
        this.f34964c = com.mbridge.msdk.foundation.same.directory.e.b(com.mbridge.msdk.foundation.same.directory.c.MBRIDGE_700_IMG) + File.separator;
        this.f34962a = f.b();
    }

    public Bitmap c(String str) {
        if (MBridgeConstans.DEBUG) {
            q0.a("CommonImageLoaderRefactor", "getImageBitmapByUrl imageUrl = " + str);
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String str2 = this.f34964c + o0.d(str);
        File file = new File(str2);
        if (file.isFile() && file.exists()) {
            try {
                return b(str2);
            } catch (Exception e10) {
                if (MBridgeConstans.DEBUG) {
                    q0.b("CommonImageLoaderRefactor", "getImageBitmapByUrl error", e10);
                }
            }
        }
        return null;
    }

    public boolean d(String str) {
        if (MBridgeConstans.DEBUG) {
            q0.a("CommonImageLoaderRefactor", "isImageFileExists imageUrl = " + str);
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            File file = null;
            try {
                file = new File(this.f34964c + o0.d(str));
            } catch (Exception e10) {
                if (MBridgeConstans.DEBUG) {
                    q0.b("CommonImageLoaderRefactor", "isImageFileExists error", e10);
                }
            }
            return file != null && file.isFile() && file.exists();
        } catch (Exception e11) {
            if (MBridgeConstans.DEBUG) {
                q0.b("CommonImageLoaderRefactor", "isImageFileExists error", e11);
            }
            return false;
        }
    }

    public static d a() {
        return b.f34969a;
    }

    private Runnable a(String str, g gVar, com.mbridge.msdk.foundation.same.image.c cVar) {
        return new a(str, gVar, cVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public DownloadRequest<?> a(String str, String str2, g gVar, com.mbridge.msdk.foundation.same.image.c cVar) {
        try {
            return MBDownloadManager.getInstance().download(new DownloadMessage<>(new Object(), str2, str, 100, DownloadResourceType.DOWNLOAD_RESOURCE_TYPE_IMAGE)).withReadTimeout(com.mbridge.msdk.foundation.same.a.f34911u).withConnectTimeout(com.mbridge.msdk.foundation.same.a.f34910t).withWriteTimeout(com.mbridge.msdk.foundation.same.a.f34909s).withDownloadPriority(DownloadPriority.LOW).withHttpRetryCounter(1).withDirectoryPathInternal(this.f34964c).withDownloadStateListener(new c(this.f34963b, this.f34962a, str2, this.f34964c, str, gVar, cVar)).with("download_scene", "download_image").withProgressStateListener(null).withTimeout(60000L).with("do_us_fi_re", Boolean.FALSE.toString()).build();
        } catch (Exception e10) {
            if (!MBridgeConstans.DEBUG) {
                return null;
            }
            q0.b("CommonImageLoaderRefactor", "createDownloadRequest error", e10);
            return null;
        }
    }

    public void b(String str, g gVar, com.mbridge.msdk.foundation.same.image.c cVar) {
        try {
            this.f34962a.execute(a(str, gVar, cVar));
        } catch (Exception e10) {
            if (MBridgeConstans.DEBUG) {
                q0.b("CommonImageLoaderRefactor", "loadImage error", e10);
            }
        }
    }
}
