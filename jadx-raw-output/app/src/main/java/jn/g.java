package jn;

import java.util.List;
import org.fourthline.cling.model.types.Datatype;
import un.m;
import un.n;
import un.o;
import un.p;

/* JADX INFO: compiled from: MutableStateVariable.java */
/* JADX INFO: loaded from: classes6.dex */
public class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f61988a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Datatype f61989b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f61990c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public List<String> f61991d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public c f61992e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public o f61993f;

    public m a() {
        String[] strArr;
        String str = this.f61988a;
        Datatype datatype = this.f61989b;
        String str2 = this.f61990c;
        List<String> list = this.f61991d;
        if (list == null || list.size() == 0) {
            strArr = null;
        } else {
            List<String> list2 = this.f61991d;
            strArr = (String[]) list2.toArray(new String[list2.size()]);
        }
        return new m(str, new p(datatype, str2, strArr, this.f61992e != null ? new n(this.f61992e.f61953a.longValue(), this.f61992e.f61954b.longValue(), this.f61992e.f61955c.longValue()) : null), this.f61993f);
    }
}
