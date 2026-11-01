package lo;

import java.util.Map;
import org.fourthline.cling.model.types.Datatype;
import org.fourthline.cling.support.shared.AbstractMap$SimpleEntry;
import yn.d0;

/* JADX INFO: compiled from: EventedValueChannelVolume.java */
/* JADX INFO: loaded from: classes3.dex */
public class g extends ho.b<c> {
    @Override // ho.b
    public Map.Entry<String, String>[] a() {
        return new Map.Entry[]{new AbstractMap$SimpleEntry("val", new d0().e(new org.fourthline.cling.model.types.d(d().b().intValue()))), new AbstractMap$SimpleEntry("channel", d().a().name())};
    }

    @Override // ho.b
    public Datatype b() {
        return null;
    }

    public g(c cVar) {
        super(cVar);
    }

    @Override // ho.b
    public String toString() {
        return d().toString();
    }
}
