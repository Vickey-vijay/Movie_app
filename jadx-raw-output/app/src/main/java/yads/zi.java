package yads;

import android.content.Context;
import android.content.res.AssetManager;
import android.net.Uri;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes11.dex */
public final class zi extends eo {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final AssetManager f85397e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Uri f85398f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public InputStream f85399g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f85400h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f85401i;

    public zi(Context context) {
        super(false);
        this.f85397e = context.getAssets();
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x0017 */
    @Override // yads.p30
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void close() {
        /*
            r5 = this;
            r0 = 0
            r5.f85398f = r0
            r1 = 0
            java.io.InputStream r2 = r5.f85399g     // Catch: java.lang.Throwable -> L17 java.io.IOException -> L19
            if (r2 == 0) goto Lb
            r2.close()     // Catch: java.lang.Throwable -> L17 java.io.IOException -> L19
        Lb:
            r5.f85399g = r0
            boolean r0 = r5.f85401i
            if (r0 == 0) goto L16
            r5.f85401i = r1
            r5.d()
        L16:
            return
        L17:
            r2 = move-exception
            goto L22
        L19:
            r2 = move-exception
            yads.yi r3 = new yads.yi     // Catch: java.lang.Throwable -> L17
            r4 = 2000(0x7d0, float:2.803E-42)
            r3.<init>(r2, r4)     // Catch: java.lang.Throwable -> L17
            throw r3     // Catch: java.lang.Throwable -> L17
        L22:
            r5.f85399g = r0
            boolean r0 = r5.f85401i
            if (r0 == 0) goto L2d
            r5.f85401i = r1
            r5.d()
        L2d:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: yads.zi.close():void");
    }

    @Override // yads.p30
    public final long a(u30 u30Var) throws yi {
        try {
            Uri uri = u30Var.f83341a;
            this.f85398f = uri;
            String path = uri.getPath();
            path.getClass();
            if (path.startsWith("/android_asset/")) {
                path = path.substring(15);
            } else if (path.startsWith("/")) {
                path = path.substring(1);
            }
            e();
            InputStream inputStreamOpen = this.f85397e.open(path, 1);
            this.f85399g = inputStreamOpen;
            if (inputStreamOpen.skip(u30Var.f83346f) < u30Var.f83346f) {
                throw new yi(null, 2008);
            }
            long j10 = u30Var.f83347g;
            if (j10 != -1) {
                this.f85400h = j10;
            } else {
                long jAvailable = this.f85399g.available();
                this.f85400h = jAvailable;
                if (jAvailable == 2147483647L) {
                    this.f85400h = -1L;
                }
            }
            this.f85401i = true;
            b(u30Var);
            return this.f85400h;
        } catch (yi e10) {
            throw e10;
        } catch (IOException e11) {
            throw new yi(e11, e11 instanceof FileNotFoundException ? 2005 : 2000);
        }
    }

    @Override // yads.p30
    public final Uri getUri() {
        return this.f85398f;
    }

    @Override // yads.l30
    public final int read(byte[] bArr, int i10, int i11) throws yi {
        if (i11 == 0) {
            return 0;
        }
        long j10 = this.f85400h;
        if (j10 == 0) {
            return -1;
        }
        if (j10 != -1) {
            try {
                i11 = (int) Math.min(j10, i11);
            } catch (IOException e10) {
                throw new yi(e10, 2000);
            }
        }
        InputStream inputStream = this.f85399g;
        int i12 = ib3.f78556a;
        int i13 = inputStream.read(bArr, i10, i11);
        if (i13 == -1) {
            return -1;
        }
        long j11 = this.f85400h;
        if (j11 != -1) {
            this.f85400h = j11 - ((long) i13);
        }
        c(i13);
        return i13;
    }
}
