package p4;

import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.source.hls.HlsTrackMetadataEntry;
import g5.g0;
import java.io.EOFException;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: DefaultHlsExtractorFactory.java */
/* JADX INFO: loaded from: classes7.dex */
public final class c implements f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f65887b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f65888c;

    public c() {
        this(0, true);
    }

    public c(int i10, boolean z10) {
        this.f65887b = i10;
        this.f65888c = z10;
    }

    public static f.a b(q3.g gVar) {
        return new f.a(gVar, (gVar instanceof z3.h) || (gVar instanceof z3.b) || (gVar instanceof z3.e) || (gVar instanceof v3.e), h(gVar));
    }

    @Nullable
    public static f.a c(q3.g gVar, Format format, g0 g0Var) {
        if (gVar instanceof p) {
            return b(new p(format.B, g0Var));
        }
        if (gVar instanceof z3.h) {
            return b(new z3.h());
        }
        if (gVar instanceof z3.b) {
            return b(new z3.b());
        }
        if (gVar instanceof z3.e) {
            return b(new z3.e());
        }
        if (gVar instanceof v3.e) {
            return b(new v3.e());
        }
        return null;
    }

    public static w3.f e(g0 g0Var, Format format, @Nullable List<Format> list) {
        int i10 = g(format) ? 4 : 0;
        if (list == null) {
            list = Collections.emptyList();
        }
        return new w3.f(i10, g0Var, null, list);
    }

    public static z3.g0 f(int i10, boolean z10, Format format, @Nullable List<Format> list, g0 g0Var) {
        int i11 = i10 | 16;
        if (list != null) {
            i11 |= 32;
        } else {
            list = z10 ? Collections.singletonList(Format.w(null, "application/cea-608", 0, null)) : Collections.emptyList();
        }
        String str = format.f18967g;
        if (!TextUtils.isEmpty(str)) {
            if (!"audio/mp4a-latm".equals(g5.p.b(str))) {
                i11 |= 2;
            }
            if (!"video/avc".equals(g5.p.k(str))) {
                i11 |= 4;
            }
        }
        return new z3.g0(2, g0Var, new z3.j(i11, list));
    }

    public static boolean g(Format format) {
        Metadata metadata = format.f18968h;
        if (metadata == null) {
            return false;
        }
        for (int i10 = 0; i10 < metadata.d(); i10++) {
            Metadata.Entry entryC = metadata.c(i10);
            if (entryC instanceof HlsTrackMetadataEntry) {
                return !((HlsTrackMetadataEntry) entryC).f19582d.isEmpty();
            }
        }
        return false;
    }

    public static boolean h(q3.g gVar) {
        return (gVar instanceof z3.g0) || (gVar instanceof w3.f);
    }

    @Override // p4.f
    public f.a a(@Nullable q3.g gVar, Uri uri, Format format, @Nullable List<Format> list, g0 g0Var, Map<String, List<String>> map, q3.h hVar) throws InterruptedException, IOException {
        if (gVar != null) {
            if (h(gVar)) {
                return b(gVar);
            }
            if (c(gVar, format, g0Var) == null) {
                throw new IllegalArgumentException("Unexpected previousExtractor type: " + gVar.getClass().getSimpleName());
            }
        }
        q3.g gVarD = d(uri, format, list, g0Var);
        hVar.resetPeekPosition();
        if (i(gVarD, hVar)) {
            return b(gVarD);
        }
        if (!(gVarD instanceof p)) {
            p pVar = new p(format.B, g0Var);
            if (i(pVar, hVar)) {
                return b(pVar);
            }
        }
        if (!(gVarD instanceof z3.h)) {
            z3.h hVar2 = new z3.h();
            if (i(hVar2, hVar)) {
                return b(hVar2);
            }
        }
        if (!(gVarD instanceof z3.b)) {
            z3.b bVar = new z3.b();
            if (i(bVar, hVar)) {
                return b(bVar);
            }
        }
        if (!(gVarD instanceof z3.e)) {
            z3.e eVar = new z3.e();
            if (i(eVar, hVar)) {
                return b(eVar);
            }
        }
        if (!(gVarD instanceof v3.e)) {
            v3.e eVar2 = new v3.e(0, 0L);
            if (i(eVar2, hVar)) {
                return b(eVar2);
            }
        }
        if (!(gVarD instanceof w3.f)) {
            w3.f fVarE = e(g0Var, format, list);
            if (i(fVarE, hVar)) {
                return b(fVarE);
            }
        }
        if (!(gVarD instanceof z3.g0)) {
            z3.g0 g0VarF = f(this.f65887b, this.f65888c, format, list, g0Var);
            if (i(g0VarF, hVar)) {
                return b(g0VarF);
            }
        }
        return b(gVarD);
    }

    public static boolean i(q3.g gVar, q3.h hVar) throws InterruptedException, IOException {
        try {
            return gVar.b(hVar);
        } catch (EOFException unused) {
            return false;
        } finally {
            hVar.resetPeekPosition();
        }
    }

    public final q3.g d(Uri uri, Format format, @Nullable List<Format> list, g0 g0Var) {
        String lastPathSegment = uri.getLastPathSegment();
        if (lastPathSegment == null) {
            lastPathSegment = "";
        }
        if (!"text/vtt".equals(format.f18970j) && !lastPathSegment.endsWith(".webvtt") && !lastPathSegment.endsWith(".vtt")) {
            if (lastPathSegment.endsWith(".aac")) {
                return new z3.h();
            }
            if (!lastPathSegment.endsWith(".ac3") && !lastPathSegment.endsWith(".ec3")) {
                if (lastPathSegment.endsWith(".ac4")) {
                    return new z3.e();
                }
                if (lastPathSegment.endsWith(".mp3")) {
                    return new v3.e(0, 0L);
                }
                if (!lastPathSegment.endsWith(".mp4") && !lastPathSegment.startsWith(".m4", lastPathSegment.length() - 4) && !lastPathSegment.startsWith(".mp4", lastPathSegment.length() - 5) && !lastPathSegment.startsWith(".cmf", lastPathSegment.length() - 5)) {
                    return f(this.f65887b, this.f65888c, format, list, g0Var);
                }
                return e(g0Var, format, list);
            }
            return new z3.b();
        }
        return new p(format.B, g0Var);
    }
}
