package e5;

import android.net.Uri;
import android.util.Base64;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.upstream.DataSourceException;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import g5.k0;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.io.IOException;
import java.net.URLDecoder;

/* JADX INFO: compiled from: DataSchemeDataSource.java */
/* JADX INFO: loaded from: classes10.dex */
public final class e extends d {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public h f52364e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public byte[] f52365f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f52366g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f52367h;

    public e() {
        super(false);
    }

    @Override // com.google.android.exoplayer2.upstream.a
    public void close() {
        if (this.f52365f != null) {
            this.f52365f = null;
            d();
        }
        this.f52364e = null;
    }

    @Override // com.google.android.exoplayer2.upstream.a
    @Nullable
    public Uri getUri() {
        h hVar = this.f52364e;
        if (hVar != null) {
            return hVar.f52374a;
        }
        return null;
    }

    @Override // com.google.android.exoplayer2.upstream.a
    public int read(byte[] bArr, int i10, int i11) {
        if (i11 == 0) {
            return 0;
        }
        int i12 = this.f52366g - this.f52367h;
        if (i12 == 0) {
            return -1;
        }
        int iMin = Math.min(i11, i12);
        System.arraycopy(k0.i(this.f52365f), this.f52367h, bArr, i10, iMin);
        this.f52367h += iMin;
        c(iMin);
        return iMin;
    }

    @Override // com.google.android.exoplayer2.upstream.a
    public long a(h hVar) throws IOException {
        int length;
        e(hVar);
        this.f52364e = hVar;
        this.f52367h = (int) hVar.f52379f;
        Uri uri = hVar.f52374a;
        String scheme = uri.getScheme();
        if ("data".equals(scheme)) {
            String[] strArrD0 = k0.D0(uri.getSchemeSpecificPart(), StringUtils.COMMA);
            if (strArrD0.length == 2) {
                String str = strArrD0[1];
                if (strArrD0[0].contains(";base64")) {
                    try {
                        this.f52365f = Base64.decode(str, 0);
                    } catch (IllegalArgumentException e10) {
                        throw new ParserException("Error while parsing Base64 encoded string: " + str, e10);
                    }
                } else {
                    this.f52365f = k0.c0(URLDecoder.decode(str, C.ASCII_NAME));
                }
                long j10 = hVar.f52380g;
                if (j10 != -1) {
                    length = ((int) j10) + this.f52367h;
                } else {
                    length = this.f52365f.length;
                }
                this.f52366g = length;
                if (length <= this.f52365f.length && this.f52367h <= length) {
                    f(hVar);
                    return ((long) this.f52366g) - ((long) this.f52367h);
                }
                this.f52365f = null;
                throw new DataSourceException(0);
            }
            throw new ParserException("Unexpected URI format: " + uri);
        }
        throw new ParserException("Unsupported scheme: " + scheme);
    }
}
