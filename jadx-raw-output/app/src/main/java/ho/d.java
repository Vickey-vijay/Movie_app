package ho;

import java.lang.Enum;
import org.fourthline.cling.model.types.Datatype;

/* JADX INFO: compiled from: EventedValueEnumArray.java */
/* JADX INFO: loaded from: classes2.dex */
public abstract class d<E extends Enum> extends b<E[]> {
    @Override // ho.b
    public Datatype b() {
        return null;
    }

    public d(E[] eArr) {
        super(eArr);
    }

    @Override // ho.b
    public String toString() {
        return mn.f.g(d());
    }
}
