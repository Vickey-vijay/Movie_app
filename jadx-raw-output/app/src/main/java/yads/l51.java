package yads;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public final class l51 extends h51 {
    public final l51 a(Object obj) {
        obj.getClass();
        a(this.f78071b + 1);
        Object[] objArr = this.f78070a;
        int i10 = this.f78071b;
        this.f78071b = i10 + 1;
        objArr[i10] = obj;
        return this;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0029 A[LOOP:0: B:8:0x0023->B:10:0x0029, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:7:0x001f  */
    /* JADX WARN: Multi-variable type inference failed */
    public final l51 a(List list) {
        Iterator it;
        if (list instanceof Collection) {
            a(list.size() + this.f78071b);
            if (list instanceof j51) {
                this.f78071b = ((j51) list).a(this.f78071b, this.f78070a);
            } else {
                it = list.iterator();
                while (it.hasNext()) {
                    a(it.next());
                }
            }
        } else {
            it = list.iterator();
            while (it.hasNext()) {
                a(it.next());
            }
        }
        return this;
    }

    public final sm2 a() {
        this.f78072c = true;
        return p51.b(this.f78071b, this.f78070a);
    }
}
