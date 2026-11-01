package yads;

import android.net.Uri;
import android.util.Base64;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.net.URLDecoder;

/* JADX INFO: loaded from: classes11.dex */
public final class m30 extends eo {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public u30 f80052e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public byte[] f80053f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f80054g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f80055h;

    public m30() {
        super(false);
    }

    @Override // yads.p30
    public final void close() {
        if (this.f80053f != null) {
            this.f80053f = null;
            d();
        }
        this.f80052e = null;
    }

    @Override // yads.p30
    public final Uri getUri() {
        u30 u30Var = this.f80052e;
        if (u30Var != null) {
            return u30Var.f83341a;
        }
        return null;
    }

    @Override // yads.l30
    public final int read(byte[] bArr, int i10, int i11) {
        if (i11 == 0) {
            return 0;
        }
        int i12 = this.f80055h;
        if (i12 == 0) {
            return -1;
        }
        int iMin = Math.min(i11, i12);
        byte[] bArr2 = this.f80053f;
        int i13 = ib3.f78556a;
        System.arraycopy(bArr2, this.f80054g, bArr, i10, iMin);
        this.f80054g += iMin;
        this.f80055h -= iMin;
        c(iMin);
        return iMin;
    }

    @Override // yads.p30
    public final long a(u30 u30Var) throws ob2, q30 {
        e();
        this.f80052e = u30Var;
        Uri uri = u30Var.f83341a;
        String scheme = uri.getScheme();
        ni.a("Unsupported scheme: " + scheme, "data".equals(scheme));
        String schemeSpecificPart = uri.getSchemeSpecificPart();
        int i10 = ib3.f78556a;
        String[] strArrSplit = schemeSpecificPart.split(StringUtils.COMMA, -1);
        if (strArrSplit.length == 2) {
            String str = strArrSplit[1];
            if (strArrSplit[0].contains(";base64")) {
                try {
                    this.f80053f = Base64.decode(str, 0);
                } catch (IllegalArgumentException e10) {
                    throw new ob2("Error while parsing Base64 encoded string: " + str, e10, true, 0);
                }
            } else {
                this.f80053f = ib3.c(URLDecoder.decode(str, bu.f75962a.name()));
            }
            long j10 = u30Var.f83346f;
            byte[] bArr = this.f80053f;
            if (j10 <= bArr.length) {
                int i11 = (int) j10;
                this.f80054g = i11;
                int length = bArr.length - i11;
                this.f80055h = length;
                long j11 = u30Var.f83347g;
                if (j11 != -1) {
                    this.f80055h = (int) Math.min(length, j11);
                }
                b(u30Var);
                long j12 = u30Var.f83347g;
                if (j12 == -1) {
                    return this.f80055h;
                }
                return j12;
            }
            this.f80053f = null;
            throw new q30(2008);
        }
        throw new ob2("Unexpected URI format: " + uri, null, true, 0);
    }
}
