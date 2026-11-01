package ho;

import org.fourthline.cling.model.types.Datatype;

/* JADX INFO: compiled from: EventedValueString.java */
/* JADX INFO: loaded from: classes2.dex */
public class f extends b<String> {
    @Override // ho.b
    public Datatype b() {
        return Datatype.Builtin.STRING.getDatatype();
    }

    public f(String str) {
        super(str);
    }
}
