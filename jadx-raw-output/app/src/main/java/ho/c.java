package ho;

import java.lang.Enum;
import org.fourthline.cling.model.types.Datatype;

/* JADX INFO: compiled from: EventedValueEnum.java */
/* JADX INFO: loaded from: classes2.dex */
public abstract class c<E extends Enum> extends b<E> {
    @Override // ho.b
    public Datatype b() {
        return null;
    }

    public c(E e10) {
        super(e10);
    }

    @Override // ho.b
    public String toString() {
        return d().name();
    }
}
