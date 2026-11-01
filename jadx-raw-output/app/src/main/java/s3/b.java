package s3;

import g5.j;
import java.io.IOException;
import java.util.Objects;
import q3.h;
import q3.l;

/* JADX INFO: compiled from: FlacBinarySearchSeeker.java */
/* JADX INFO: loaded from: classes6.dex */
public final class b extends q3.a {

    /* JADX INFO: renamed from: s3.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: FlacBinarySearchSeeker.java */
    public static final class C0637b implements q3.a.f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final j f67006a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f67007b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final l.a f67008c;

        public C0637b(j jVar, int i10) {
            this.f67006a = jVar;
            this.f67007b = i10;
            this.f67008c = new l.a();
        }

        @Override // q3.a.f
        public q3.a.e a(h hVar, long j10) throws InterruptedException, IOException {
            long position = hVar.getPosition();
            long jB = b(hVar);
            long peekPosition = hVar.getPeekPosition();
            hVar.advancePeekPosition(Math.max(6, this.f67006a.f53095c));
            long jB2 = b(hVar);
            long peekPosition2 = hVar.getPeekPosition();
            if (jB <= j10 && jB2 > j10) {
                return q3.a.e.e(peekPosition);
            }
            if (jB2 <= j10) {
                return q3.a.e.f(jB2, peekPosition2);
            }
            return q3.a.e.d(jB, position);
        }

        public final long b(h hVar) throws InterruptedException, IOException {
            while (hVar.getPeekPosition() < hVar.getLength() - 6 && !l.h(hVar, this.f67006a, this.f67007b, this.f67008c)) {
                hVar.advancePeekPosition(1);
            }
            if (hVar.getPeekPosition() >= hVar.getLength() - 6) {
                hVar.advancePeekPosition((int) (hVar.getLength() - hVar.getPeekPosition()));
                return this.f67006a.f53102j;
            }
            return this.f67008c.f66455a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(final j jVar, int i10, long j10, long j11) {
        super(new q3.a.d() { // from class: s3.a
            @Override // q3.a.d
            public final long timeUsToTargetTime(long j12) {
                return jVar.k(j12);
            }
        }, new C0637b(jVar, i10), jVar.h(), 0L, jVar.f53102j, j10, j11, jVar.e(), Math.max(6, jVar.f53095c));
        Objects.requireNonNull(jVar);
    }
}
