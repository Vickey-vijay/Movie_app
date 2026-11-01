package lo;

import java.util.Map;
import org.fourthline.cling.model.types.Datatype;
import org.fourthline.cling.support.shared.AbstractMap$SimpleEntry;

/* JADX INFO: compiled from: EventedValueChannelMute.java */
/* JADX INFO: loaded from: classes3.dex */
public class f extends ho.b<b> {
    @Override // ho.b
    public Map.Entry<String, String>[] a() {
        return new Map.Entry[]{new AbstractMap$SimpleEntry("val", new yn.c().e(d().b())), new AbstractMap$SimpleEntry("channel", d().a().name())};
    }

    @Override // ho.b
    public Datatype b() {
        return null;
    }

    public f(b bVar) {
        super(bVar);
    }

    @Override // ho.b
    public String toString() {
        return d().toString();
    }
}
