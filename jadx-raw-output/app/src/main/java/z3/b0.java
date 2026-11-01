package z3;

import com.google.android.exoplayer2.Format;
import java.util.List;

/* JADX INFO: compiled from: SeiReader.java */
/* JADX INFO: loaded from: classes9.dex */
public final class b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<Format> f85934a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q3.u[] f85935b;

    public void a(long j10, g5.t tVar) {
        u4.g.a(j10, tVar, this.f85935b);
    }

    public void b(q3.i iVar, h0.d dVar) {
        for (int i10 = 0; i10 < this.f85935b.length; i10++) {
            dVar.a();
            q3.u uVarTrack = iVar.track(dVar.c(), 3);
            Format format = this.f85934a.get(i10);
            String str = format.f18970j;
            g5.a.b("application/cea-608".equals(str) || "application/cea-708".equals(str), "Invalid closed caption mime type provided: " + str);
            String strB = format.f18962b;
            if (strB == null) {
                strB = dVar.b();
            }
            uVarTrack.a(Format.y(strB, str, null, -1, format.f18964d, format.B, format.C, null, Long.MAX_VALUE, format.f18972l));
            this.f85935b[i10] = uVarTrack;
        }
    }

    public b0(List<Format> list) {
        this.f85934a = list;
        this.f85935b = new q3.u[list.size()];
    }
}
