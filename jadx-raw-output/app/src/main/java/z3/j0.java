package z3;

import com.google.android.exoplayer2.Format;
import java.util.List;

/* JADX INFO: compiled from: UserDataReader.java */
/* JADX INFO: loaded from: classes10.dex */
public final class j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<Format> f86054a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q3.u[] f86055b;

    public void b(q3.i iVar, h0.d dVar) {
        for (int i10 = 0; i10 < this.f86055b.length; i10++) {
            dVar.a();
            q3.u uVarTrack = iVar.track(dVar.c(), 3);
            Format format = this.f86054a.get(i10);
            String str = format.f18970j;
            g5.a.b("application/cea-608".equals(str) || "application/cea-708".equals(str), "Invalid closed caption mime type provided: " + str);
            uVarTrack.a(Format.y(dVar.b(), str, null, -1, format.f18964d, format.B, format.C, null, Long.MAX_VALUE, format.f18972l));
            this.f86055b[i10] = uVarTrack;
        }
    }

    public j0(List<Format> list) {
        this.f86054a = list;
        this.f86055b = new q3.u[list.size()];
    }

    public void a(long j10, g5.t tVar) {
        if (tVar.a() < 9) {
            return;
        }
        int iJ = tVar.j();
        int iJ2 = tVar.j();
        int iY = tVar.y();
        if (iJ == 434 && iJ2 == 1195456820 && iY == 3) {
            u4.g.b(j10, tVar, this.f86055b);
        }
    }
}
