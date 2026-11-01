package p4;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.ParserException;
import g5.g0;
import g5.t;
import java.io.IOException;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import q3.r;
import q3.s;
import q3.u;

/* JADX INFO: compiled from: WebvttExtractor.java */
/* JADX INFO: loaded from: classes8.dex */
public final class p implements q3.g {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Pattern f65999g = Pattern.compile("LOCAL:([^,]+)");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Pattern f66000h = Pattern.compile("MPEGTS:(-?\\d+)");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public final String f66001a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g0 f66002b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public q3.i f66004d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f66006f;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final t f66003c = new t();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public byte[] f66005e = new byte[1024];

    @Override // q3.g
    public void release() {
    }

    @Override // q3.g
    public int a(q3.h hVar, r rVar) throws InterruptedException, IOException {
        g5.a.e(this.f66004d);
        int length = (int) hVar.getLength();
        int i10 = this.f66006f;
        byte[] bArr = this.f66005e;
        if (i10 == bArr.length) {
            this.f66005e = Arrays.copyOf(bArr, ((length != -1 ? length : bArr.length) * 3) / 2);
        }
        byte[] bArr2 = this.f66005e;
        int i11 = this.f66006f;
        int i12 = hVar.read(bArr2, i11, bArr2.length - i11);
        if (i12 != -1) {
            int i13 = this.f66006f + i12;
            this.f66006f = i13;
            if (length == -1 || i13 != length) {
                return 0;
            }
        }
        e();
        return -1;
    }

    @Override // q3.g
    public boolean b(q3.h hVar) throws InterruptedException, IOException {
        hVar.peekFully(this.f66005e, 0, 6, false);
        this.f66003c.J(this.f66005e, 6);
        if (b5.h.b(this.f66003c)) {
            return true;
        }
        hVar.peekFully(this.f66005e, 6, 3, false);
        this.f66003c.J(this.f66005e, 9);
        return b5.h.b(this.f66003c);
    }

    @Override // q3.g
    public void c(q3.i iVar) {
        this.f66004d = iVar;
        iVar.e(new s.b(-9223372036854775807L));
    }

    public final u d(long j10) {
        u uVarTrack = this.f66004d.track(0, 3);
        uVarTrack.a(Format.z(null, "text/vtt", null, -1, 0, this.f66001a, null, j10));
        this.f66004d.endTracks();
        return uVarTrack;
    }

    public final void e() throws ParserException {
        t tVar = new t(this.f66005e);
        b5.h.e(tVar);
        long jF = 0;
        long jD = 0;
        for (String strL = tVar.l(); !TextUtils.isEmpty(strL); strL = tVar.l()) {
            if (strL.startsWith("X-TIMESTAMP-MAP")) {
                Matcher matcher = f65999g.matcher(strL);
                if (!matcher.find()) {
                    throw new ParserException("X-TIMESTAMP-MAP doesn't contain local timestamp: " + strL);
                }
                Matcher matcher2 = f66000h.matcher(strL);
                if (!matcher2.find()) {
                    throw new ParserException("X-TIMESTAMP-MAP doesn't contain media timestamp: " + strL);
                }
                jD = b5.h.d(matcher.group(1));
                jF = g0.f(Long.parseLong(matcher2.group(1)));
            }
        }
        Matcher matcherA = b5.h.a(tVar);
        if (matcherA == null) {
            d(0L);
            return;
        }
        long jD2 = b5.h.d(matcherA.group(1));
        long jB = this.f66002b.b(g0.i((jF + jD2) - jD));
        u uVarD = d(jB - jD2);
        this.f66003c.J(this.f66005e, this.f66006f);
        uVarD.c(this.f66003c, this.f66006f);
        uVarD.d(jB, 1, this.f66006f, 0, null);
    }

    @Override // q3.g
    public void seek(long j10, long j11) {
        throw new IllegalStateException();
    }

    public p(@Nullable String str, g0 g0Var) {
        this.f66001a = str;
        this.f66002b = g0Var;
    }
}
