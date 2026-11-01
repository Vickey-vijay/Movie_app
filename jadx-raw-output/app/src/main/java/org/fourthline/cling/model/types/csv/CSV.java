package org.fourthline.cling.model.types.csv;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import mn.f;
import org.fourthline.cling.model.types.Datatype;
import org.fourthline.cling.model.types.InvalidValueException;
import so.d;

/* JADX INFO: loaded from: classes4.dex */
public abstract class CSV<T> extends ArrayList<T> {
    public final Datatype.Builtin datatype = getBuiltinDatatype();

    public CSV() {
    }

    public Datatype.Builtin getBuiltinDatatype() throws InvalidValueException {
        Class<?> cls = d.j(ArrayList.class, getClass()).get(0);
        Datatype.Default byJavaType = Datatype.Default.getByJavaType(cls);
        if (byJavaType != null) {
            return byJavaType.getBuiltinType();
        }
        throw new InvalidValueException("No built-in UPnP datatype for Java type of CSV: " + cls);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractCollection
    public String toString() {
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = iterator();
        while (it.hasNext()) {
            arrayList.add(this.datatype.getDatatype().e(it.next()));
        }
        return f.g(arrayList.toArray(new Object[arrayList.size()]));
    }

    public CSV(String str) throws InvalidValueException {
        addAll(parseString(str));
    }

    public List parseString(String str) throws InvalidValueException {
        String[] strArrA = f.a(str);
        ArrayList arrayList = new ArrayList();
        for (String str2 : strArrA) {
            arrayList.add(this.datatype.getDatatype().c(str2));
        }
        return arrayList;
    }
}
