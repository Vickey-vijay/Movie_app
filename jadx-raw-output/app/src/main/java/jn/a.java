package jn;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.fourthline.cling.model.meta.ActionArgument;

/* JADX INFO: compiled from: MutableAction.java */
/* JADX INFO: loaded from: classes6.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f61947a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public List<b> f61948b = new ArrayList();

    public org.fourthline.cling.model.meta.a a() {
        return new org.fourthline.cling.model.meta.a(this.f61947a, b());
    }

    public ActionArgument[] b() {
        ActionArgument[] actionArgumentArr = new ActionArgument[this.f61948b.size()];
        Iterator<b> it = this.f61948b.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            actionArgumentArr[i10] = it.next().a();
            i10++;
        }
        return actionArgumentArr;
    }
}
