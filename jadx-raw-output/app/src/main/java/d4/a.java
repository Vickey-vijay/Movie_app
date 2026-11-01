package d4;

import c4.c;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.emsg.EventMessage;
import g5.t;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* JADX INFO: compiled from: EventMessageDecoder.java */
/* JADX INFO: loaded from: classes11.dex */
public final class a implements c4.a {
    @Override // c4.a
    public Metadata a(c cVar) {
        ByteBuffer byteBuffer = (ByteBuffer) g5.a.e(cVar.f64969c);
        return new Metadata(b(new t(byteBuffer.array(), byteBuffer.limit())));
    }

    public EventMessage b(t tVar) {
        return new EventMessage((String) g5.a.e(tVar.s()), (String) g5.a.e(tVar.s()), tVar.A(), tVar.A(), Arrays.copyOfRange(tVar.f53154a, tVar.c(), tVar.d()));
    }
}
