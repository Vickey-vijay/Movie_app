package yads;

import android.net.Uri;
import android.text.TextUtils;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/* JADX INFO: loaded from: classes3.dex */
public final class cv0 extends eo {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public RandomAccessFile f76444e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Uri f76445f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f76446g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f76447h;

    public cv0() {
        super(false);
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
            r5.f76445f = r0
            r1 = 0
            java.io.RandomAccessFile r2 = r5.f76444e     // Catch: java.lang.Throwable -> L17 java.io.IOException -> L19
            if (r2 == 0) goto Lb
            r2.close()     // Catch: java.lang.Throwable -> L17 java.io.IOException -> L19
        Lb:
            r5.f76444e = r0
            boolean r0 = r5.f76447h
            if (r0 == 0) goto L16
            r5.f76447h = r1
            r5.d()
        L16:
            return
        L17:
            r2 = move-exception
            goto L22
        L19:
            r2 = move-exception
            yads.bv0 r3 = new yads.bv0     // Catch: java.lang.Throwable -> L17
            r4 = 2000(0x7d0, float:2.803E-42)
            r3.<init>(r2, r4)     // Catch: java.lang.Throwable -> L17
            throw r3     // Catch: java.lang.Throwable -> L17
        L22:
            r5.f76444e = r0
            boolean r0 = r5.f76447h
            if (r0 == 0) goto L2d
            r5.f76447h = r1
            r5.d()
        L2d:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: yads.cv0.close():void");
    }

    @Override // yads.p30
    public final long a(u30 u30Var) throws bv0 {
        Uri uri = u30Var.f83341a;
        this.f76445f = uri;
        e();
        try {
            String path = uri.getPath();
            path.getClass();
            RandomAccessFile randomAccessFile = new RandomAccessFile(path, "r");
            this.f76444e = randomAccessFile;
            try {
                randomAccessFile.seek(u30Var.f83346f);
                long length = u30Var.f83347g;
                if (length == -1) {
                    length = this.f76444e.length() - u30Var.f83346f;
                }
                this.f76446g = length;
                if (length < 0) {
                    throw new bv0(null, null, 2008);
                }
                this.f76447h = true;
                b(u30Var);
                return this.f76446g;
            } catch (IOException e10) {
                throw new bv0(e10, 2000);
            }
        } catch (FileNotFoundException e11) {
            if (TextUtils.isEmpty(uri.getQuery()) && TextUtils.isEmpty(uri.getFragment())) {
                throw new bv0(e11, (ib3.f78556a < 21 || !zu0.a(e11.getCause())) ? 2005 : 2006);
            }
            throw new bv0("uri has query and/or fragment, which are not supported. Did you call Uri.parse() on a string containing '?' or '#'? Use Uri.fromFile(new File(path)) to avoid this. path=" + uri.getPath() + ",query=" + uri.getQuery() + ",fragment=" + uri.getFragment(), e11, 1004);
        } catch (SecurityException e12) {
            throw new bv0(e12, 2006);
        } catch (RuntimeException e13) {
            throw new bv0(e13, 2000);
        }
    }

    @Override // yads.p30
    public final Uri getUri() {
        return this.f76445f;
    }

    @Override // yads.l30
    public final int read(byte[] bArr, int i10, int i11) throws bv0 {
        if (i11 == 0) {
            return 0;
        }
        long j10 = this.f76446g;
        if (j10 == 0) {
            return -1;
        }
        try {
            RandomAccessFile randomAccessFile = this.f76444e;
            int i12 = ib3.f78556a;
            int i13 = randomAccessFile.read(bArr, i10, (int) Math.min(j10, i11));
            if (i13 > 0) {
                this.f76446g -= (long) i13;
                c(i13);
            }
            return i13;
        } catch (IOException e10) {
            throw new bv0(e10, 2000);
        }
    }
}
