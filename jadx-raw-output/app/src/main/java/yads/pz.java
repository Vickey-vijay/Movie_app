package yads;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.Bundle;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.channels.FileChannel;

/* JADX INFO: loaded from: classes10.dex */
public final class pz extends eo {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ContentResolver f81653e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Uri f81654f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public AssetFileDescriptor f81655g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public FileInputStream f81656h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f81657i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f81658j;

    public pz(Context context) {
        super(false);
        this.f81653e = context.getContentResolver();
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x0037 */
    /* JADX WARN: Bottom block not found for handler: all -> 0x0055 */
    @Override // yads.p30
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void close() {
        /*
            r5 = this;
            r0 = 0
            r5.f81654f = r0
            r1 = 2000(0x7d0, float:2.803E-42)
            r2 = 0
            java.io.FileInputStream r3 = r5.f81656h     // Catch: java.lang.Throwable -> L37 java.io.IOException -> L39
            if (r3 == 0) goto Ld
            r3.close()     // Catch: java.lang.Throwable -> L37 java.io.IOException -> L39
        Ld:
            r5.f81656h = r0
            android.content.res.AssetFileDescriptor r3 = r5.f81655g     // Catch: java.lang.Throwable -> L22 java.io.IOException -> L24
            if (r3 == 0) goto L16
            r3.close()     // Catch: java.lang.Throwable -> L22 java.io.IOException -> L24
        L16:
            r5.f81655g = r0
            boolean r0 = r5.f81658j
            if (r0 == 0) goto L21
            r5.f81658j = r2
            r5.d()
        L21:
            return
        L22:
            r1 = move-exception
            goto L2b
        L24:
            r3 = move-exception
            yads.oz r4 = new yads.oz     // Catch: java.lang.Throwable -> L22
            r4.<init>(r3, r1)     // Catch: java.lang.Throwable -> L22
            throw r4     // Catch: java.lang.Throwable -> L22
        L2b:
            r5.f81655g = r0
            boolean r0 = r5.f81658j
            if (r0 == 0) goto L36
            r5.f81658j = r2
            r5.d()
        L36:
            throw r1
        L37:
            r3 = move-exception
            goto L40
        L39:
            r3 = move-exception
            yads.oz r4 = new yads.oz     // Catch: java.lang.Throwable -> L37
            r4.<init>(r3, r1)     // Catch: java.lang.Throwable -> L37
            throw r4     // Catch: java.lang.Throwable -> L37
        L40:
            r5.f81656h = r0
            android.content.res.AssetFileDescriptor r4 = r5.f81655g     // Catch: java.lang.Throwable -> L55 java.io.IOException -> L57
            if (r4 == 0) goto L49
            r4.close()     // Catch: java.lang.Throwable -> L55 java.io.IOException -> L57
        L49:
            r5.f81655g = r0
            boolean r0 = r5.f81658j
            if (r0 == 0) goto L54
            r5.f81658j = r2
            r5.d()
        L54:
            throw r3
        L55:
            r1 = move-exception
            goto L5e
        L57:
            r3 = move-exception
            yads.oz r4 = new yads.oz     // Catch: java.lang.Throwable -> L55
            r4.<init>(r3, r1)     // Catch: java.lang.Throwable -> L55
            throw r4     // Catch: java.lang.Throwable -> L55
        L5e:
            r5.f81655g = r0
            boolean r0 = r5.f81658j
            if (r0 == 0) goto L69
            r5.f81658j = r2
            r5.d()
        L69:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: yads.pz.close():void");
    }

    @Override // yads.p30
    public final long a(u30 u30Var) throws oz {
        AssetFileDescriptor assetFileDescriptorOpenAssetFileDescriptor;
        try {
            Uri uri = u30Var.f83341a;
            this.f81654f = uri;
            e();
            if ("content".equals(u30Var.f83341a.getScheme())) {
                Bundle bundle = new Bundle();
                bundle.putBoolean("android.provider.extra.ACCEPT_ORIGINAL_MEDIA_FORMAT", true);
                assetFileDescriptorOpenAssetFileDescriptor = this.f81653e.openTypedAssetFileDescriptor(uri, "*/*", bundle);
            } else {
                assetFileDescriptorOpenAssetFileDescriptor = this.f81653e.openAssetFileDescriptor(uri, "r");
            }
            this.f81655g = assetFileDescriptorOpenAssetFileDescriptor;
            if (assetFileDescriptorOpenAssetFileDescriptor == null) {
                throw new oz(new IOException("Could not open file descriptor for: " + uri), 2000);
            }
            long length = assetFileDescriptorOpenAssetFileDescriptor.getLength();
            FileInputStream fileInputStream = new FileInputStream(assetFileDescriptorOpenAssetFileDescriptor.getFileDescriptor());
            this.f81656h = fileInputStream;
            if (length != -1 && u30Var.f83346f > length) {
                throw new oz(null, 2008);
            }
            long startOffset = assetFileDescriptorOpenAssetFileDescriptor.getStartOffset();
            long jSkip = fileInputStream.skip(u30Var.f83346f + startOffset) - startOffset;
            if (jSkip != u30Var.f83346f) {
                throw new oz(null, 2008);
            }
            if (length == -1) {
                FileChannel channel = fileInputStream.getChannel();
                long size = channel.size();
                if (size == 0) {
                    this.f81657i = -1L;
                } else {
                    long jPosition = size - channel.position();
                    this.f81657i = jPosition;
                    if (jPosition < 0) {
                        throw new oz(null, 2008);
                    }
                }
            } else {
                long j10 = length - jSkip;
                this.f81657i = j10;
                if (j10 < 0) {
                    throw new oz(null, 2008);
                }
            }
            long jMin = u30Var.f83347g;
            if (jMin != -1) {
                long j11 = this.f81657i;
                if (j11 != -1) {
                    jMin = Math.min(j11, jMin);
                }
                this.f81657i = jMin;
            }
            this.f81658j = true;
            b(u30Var);
            long j12 = u30Var.f83347g;
            return j12 != -1 ? j12 : this.f81657i;
        } catch (oz e10) {
            throw e10;
        } catch (IOException e11) {
            throw new oz(e11, e11 instanceof FileNotFoundException ? 2005 : 2000);
        }
    }

    @Override // yads.p30
    public final Uri getUri() {
        return this.f81654f;
    }

    @Override // yads.l30
    public final int read(byte[] bArr, int i10, int i11) throws oz {
        if (i11 == 0) {
            return 0;
        }
        long j10 = this.f81657i;
        if (j10 == 0) {
            return -1;
        }
        if (j10 != -1) {
            try {
                i11 = (int) Math.min(j10, i11);
            } catch (IOException e10) {
                throw new oz(e10, 2000);
            }
        }
        FileInputStream fileInputStream = this.f81656h;
        int i12 = ib3.f78556a;
        int i13 = fileInputStream.read(bArr, i10, i11);
        if (i13 == -1) {
            return -1;
        }
        long j11 = this.f81657i;
        if (j11 != -1) {
            this.f81657i = j11 - ((long) i13);
        }
        c(i13);
        return i13;
    }
}
