package yads;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.random.Random;

/* JADX INFO: loaded from: classes2.dex */
public final class w61 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final cl.a f84113a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final jn f84114b;

    public final String a(m80 m80Var) {
        cl.a aVar = this.f84113a;
        cl.a.f6073d.a();
        String strC = aVar.c(m80.Companion.serializer(), m80Var);
        this.f84114b.getClass();
        String strA = jn.a(strC);
        if (strA == null) {
            strA = "";
        }
        List listX0 = nj.b0.x0(new ik.c('A', 'Z'), new ik.c('a', 'z'));
        ik.i iVar = new ik.i(1, 3);
        ArrayList arrayList = new ArrayList(nj.t.v(iVar, 10));
        Iterator<Integer> it = iVar.iterator();
        while (it.hasNext()) {
            ((nj.g0) it).nextInt();
            Character ch2 = (Character) nj.b0.A0(listX0, Random.Default);
            ch2.getClass();
            arrayList.add(ch2);
        }
        return nj.b0.p0(arrayList, "", null, null, 0, null, null, 62, null) + strA;
    }

    public w61(cl.a aVar, jn jnVar) {
        this.f84113a = aVar;
        this.f84114b = jnVar;
    }
}
