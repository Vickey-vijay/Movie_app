package org.fourthline.cling.model.meta;

import java.util.Collections;
import java.util.List;
import mn.k;
import un.l;

/* JADX INFO: compiled from: QueryStateVariableAction.java */
/* JADX INFO: loaded from: classes5.dex */
public class b<S extends l> extends a<S> {
    public b() {
        this(null);
    }

    @Override // org.fourthline.cling.model.meta.a
    public String d() {
        return "QueryStateVariable";
    }

    public b(S s10) {
        super("QueryStateVariable", new ActionArgument[]{new ActionArgument("varName", "VirtualQueryActionInput", ActionArgument.Direction.IN), new ActionArgument("return", "VirtualQueryActionOutput", ActionArgument.Direction.OUT)});
        j(s10);
    }

    @Override // org.fourthline.cling.model.meta.a
    public List<k> k() {
        return Collections.EMPTY_LIST;
    }
}
