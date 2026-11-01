package g4;

import c4.c;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.scte35.PrivateCommand;
import com.google.android.exoplayer2.metadata.scte35.SpliceInsertCommand;
import com.google.android.exoplayer2.metadata.scte35.SpliceNullCommand;
import com.google.android.exoplayer2.metadata.scte35.SpliceScheduleCommand;
import com.google.android.exoplayer2.metadata.scte35.TimeSignalCommand;
import g5.g0;
import g5.s;
import g5.t;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: SpliceInfoDecoder.java */
/* JADX INFO: loaded from: classes9.dex */
public final class a implements c4.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t f53039a = new t();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final s f53040b = new s();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public g0 f53041c;

    @Override // c4.a
    public Metadata a(c cVar) {
        ByteBuffer byteBuffer = (ByteBuffer) g5.a.e(cVar.f64969c);
        g0 g0Var = this.f53041c;
        if (g0Var == null || cVar.f5636h != g0Var.e()) {
            g0 g0Var2 = new g0(cVar.f64971e);
            this.f53041c = g0Var2;
            g0Var2.a(cVar.f64971e - cVar.f5636h);
        }
        byte[] bArrArray = byteBuffer.array();
        int iLimit = byteBuffer.limit();
        this.f53039a.J(bArrArray, iLimit);
        this.f53040b.n(bArrArray, iLimit);
        this.f53040b.q(39);
        long jH = (((long) this.f53040b.h(1)) << 32) | ((long) this.f53040b.h(32));
        this.f53040b.q(20);
        int iH = this.f53040b.h(12);
        int iH2 = this.f53040b.h(8);
        Metadata.Entry spliceNullCommand = null;
        this.f53039a.M(14);
        if (iH2 == 0) {
            spliceNullCommand = new SpliceNullCommand();
        } else if (iH2 == 255) {
            spliceNullCommand = PrivateCommand.a(this.f53039a, iH, jH);
        } else if (iH2 == 4) {
            spliceNullCommand = SpliceScheduleCommand.a(this.f53039a);
        } else if (iH2 == 5) {
            spliceNullCommand = SpliceInsertCommand.a(this.f53039a, jH, this.f53041c);
        } else if (iH2 == 6) {
            spliceNullCommand = TimeSignalCommand.a(this.f53039a, jH, this.f53041c);
        }
        return spliceNullCommand == null ? new Metadata(new Metadata.Entry[0]) : new Metadata(spliceNullCommand);
    }
}
