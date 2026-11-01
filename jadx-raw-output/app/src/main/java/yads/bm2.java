package yads;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.net.Uri;
import android.text.TextUtils;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;

/* JADX INFO: loaded from: classes8.dex */
public final class bm2 extends eo {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Resources f75896e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f75897f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Uri f75898g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public AssetFileDescriptor f75899h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public FileInputStream f75900i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public long f75901j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f75902k;

    public bm2(Context context) {
        super(false);
        this.f75896e = context.getResources();
        this.f75897f = context.getPackageName();
    }

    /* JADX WARN: Code duplicated, block: B:84:0x00a6 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // yads.p30
    public final long a(u30 u30Var) throws am2 {
        int identifier;
        String str;
        Uri uri = u30Var.f83341a;
        this.f75898g = uri;
        if (TextUtils.equals("rawresource", uri.getScheme())) {
            try {
                String lastPathSegment = uri.getLastPathSegment();
                lastPathSegment.getClass();
                identifier = Integer.parseInt(lastPathSegment);
            } catch (NumberFormatException unused) {
                throw new am2("Resource identifier must be an integer.", null, 1004);
            }
        } else {
            if (TextUtils.equals("android.resource", uri.getScheme()) && uri.getPathSegments().size() == 1) {
                String lastPathSegment2 = uri.getLastPathSegment();
                lastPathSegment2.getClass();
                if (lastPathSegment2.matches("\\d+")) {
                    String lastPathSegment3 = uri.getLastPathSegment();
                    lastPathSegment3.getClass();
                    identifier = Integer.parseInt(lastPathSegment3);
                }
            }
            if (!TextUtils.equals("android.resource", uri.getScheme())) {
                throw new am2("URI must either use scheme rawresource or android.resource", null, 1004);
            }
            String path = uri.getPath();
            path.getClass();
            if (path.startsWith("/")) {
                path = path.substring(1);
            }
            String host = uri.getHost();
            StringBuilder sb2 = new StringBuilder();
            if (TextUtils.isEmpty(host)) {
                str = "";
            } else {
                str = host + StringUtils.PROCESS_POSTFIX_DELIMITER;
            }
            sb2.append(str);
            sb2.append(path);
            identifier = this.f75896e.getIdentifier(sb2.toString(), "raw", this.f75897f);
            if (identifier == 0) {
                throw new am2("Resource not found.", null, 2005);
            }
        }
        e();
        try {
            AssetFileDescriptor assetFileDescriptorOpenRawResourceFd = this.f75896e.openRawResourceFd(identifier);
            this.f75899h = assetFileDescriptorOpenRawResourceFd;
            if (assetFileDescriptorOpenRawResourceFd == null) {
                throw new am2("Resource is compressed: " + uri, null, 2000);
            }
            long length = assetFileDescriptorOpenRawResourceFd.getLength();
            FileInputStream fileInputStream = new FileInputStream(assetFileDescriptorOpenRawResourceFd.getFileDescriptor());
            this.f75900i = fileInputStream;
            if (length != -1) {
                try {
                    if (u30Var.f83346f > length) {
                        throw new am2(null, null, 2008);
                    }
                } catch (am2 e10) {
                    throw e10;
                } catch (IOException e11) {
                    throw new am2(null, e11, 2000);
                }
            }
            long startOffset = assetFileDescriptorOpenRawResourceFd.getStartOffset();
            long jSkip = fileInputStream.skip(u30Var.f83346f + startOffset) - startOffset;
            if (jSkip != u30Var.f83346f) {
                throw new am2(null, null, 2008);
            }
            if (length == -1) {
                FileChannel channel = fileInputStream.getChannel();
                if (channel.size() == 0) {
                    this.f75901j = -1L;
                } else {
                    long size = channel.size() - channel.position();
                    this.f75901j = size;
                    if (size < 0) {
                        throw new am2(null, null, 2008);
                    }
                }
            } else {
                long j10 = length - jSkip;
                this.f75901j = j10;
                if (j10 < 0) {
                    throw new q30(2008);
                }
            }
            long jMin = u30Var.f83347g;
            if (jMin != -1) {
                long j11 = this.f75901j;
                if (j11 != -1) {
                    jMin = Math.min(j11, jMin);
                }
                this.f75901j = jMin;
            }
            this.f75902k = true;
            b(u30Var);
            long j12 = u30Var.f83347g;
            return j12 != -1 ? j12 : this.f75901j;
        } catch (Resources.NotFoundException e12) {
            throw new am2(null, e12, 2005);
        }
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
            r5.f75898g = r0
            r1 = 2000(0x7d0, float:2.803E-42)
            r2 = 0
            java.io.FileInputStream r3 = r5.f75900i     // Catch: java.lang.Throwable -> L37 java.io.IOException -> L39
            if (r3 == 0) goto Ld
            r3.close()     // Catch: java.lang.Throwable -> L37 java.io.IOException -> L39
        Ld:
            r5.f75900i = r0
            android.content.res.AssetFileDescriptor r3 = r5.f75899h     // Catch: java.lang.Throwable -> L22 java.io.IOException -> L24
            if (r3 == 0) goto L16
            r3.close()     // Catch: java.lang.Throwable -> L22 java.io.IOException -> L24
        L16:
            r5.f75899h = r0
            boolean r0 = r5.f75902k
            if (r0 == 0) goto L21
            r5.f75902k = r2
            r5.d()
        L21:
            return
        L22:
            r1 = move-exception
            goto L2b
        L24:
            r3 = move-exception
            yads.am2 r4 = new yads.am2     // Catch: java.lang.Throwable -> L22
            r4.<init>(r0, r3, r1)     // Catch: java.lang.Throwable -> L22
            throw r4     // Catch: java.lang.Throwable -> L22
        L2b:
            r5.f75899h = r0
            boolean r0 = r5.f75902k
            if (r0 == 0) goto L36
            r5.f75902k = r2
            r5.d()
        L36:
            throw r1
        L37:
            r3 = move-exception
            goto L40
        L39:
            r3 = move-exception
            yads.am2 r4 = new yads.am2     // Catch: java.lang.Throwable -> L37
            r4.<init>(r0, r3, r1)     // Catch: java.lang.Throwable -> L37
            throw r4     // Catch: java.lang.Throwable -> L37
        L40:
            r5.f75900i = r0
            android.content.res.AssetFileDescriptor r4 = r5.f75899h     // Catch: java.lang.Throwable -> L55 java.io.IOException -> L57
            if (r4 == 0) goto L49
            r4.close()     // Catch: java.lang.Throwable -> L55 java.io.IOException -> L57
        L49:
            r5.f75899h = r0
            boolean r0 = r5.f75902k
            if (r0 == 0) goto L54
            r5.f75902k = r2
            r5.d()
        L54:
            throw r3
        L55:
            r1 = move-exception
            goto L5e
        L57:
            r3 = move-exception
            yads.am2 r4 = new yads.am2     // Catch: java.lang.Throwable -> L55
            r4.<init>(r0, r3, r1)     // Catch: java.lang.Throwable -> L55
            throw r4     // Catch: java.lang.Throwable -> L55
        L5e:
            r5.f75899h = r0
            boolean r0 = r5.f75902k
            if (r0 == 0) goto L69
            r5.f75902k = r2
            r5.d()
        L69:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: yads.bm2.close():void");
    }

    @Override // yads.p30
    public final Uri getUri() {
        return this.f75898g;
    }

    @Override // yads.l30
    public final int read(byte[] bArr, int i10, int i11) throws am2 {
        if (i11 == 0) {
            return 0;
        }
        long j10 = this.f75901j;
        if (j10 == 0) {
            return -1;
        }
        if (j10 != -1) {
            try {
                i11 = (int) Math.min(j10, i11);
            } catch (IOException e10) {
                throw new am2(null, e10, 2000);
            }
        }
        FileInputStream fileInputStream = this.f75900i;
        int i12 = ib3.f78556a;
        int i13 = fileInputStream.read(bArr, i10, i11);
        if (i13 == -1) {
            if (this.f75901j == -1) {
                return -1;
            }
            throw new am2("End of stream reached having not read sufficient data.", new EOFException(), 2000);
        }
        long j11 = this.f75901j;
        if (j11 != -1) {
            this.f75901j = j11 - ((long) i13);
        }
        c(i13);
        return i13;
    }
}
