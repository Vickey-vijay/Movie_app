package lo;

import java.util.Map;
import org.fourthline.cling.model.types.Datatype;
import org.fourthline.cling.support.shared.AbstractMap$SimpleEntry;

/* JADX INFO: compiled from: EventedValueChannelLoudness.java */
/* JADX INFO: loaded from: classes3.dex */
public class e extends ho.b<a> {
    @Override // ho.b
    public Map.Entry<String, String>[] a() {
        return new Map.Entry[]{new AbstractMap$SimpleEntry("val", new yn.c().e(d().b())), new AbstractMap$SimpleEntry("channel", d().a().name())};
    }

    @Override // ho.b
    public Datatype b() {
        return null;
    }

    public e(a aVar) {
        super(aVar);
    }

    @Override // ho.b
    public String toString() {
        return d().toString();
    }
}
