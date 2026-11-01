package bl;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: CollectionSerializers.kt */
/* JADX INFO: loaded from: classes11.dex */
public abstract class c1<Key, Value, Collection, Builder extends Map<Key, Value>> extends a<Map.Entry<? extends Key, ? extends Value>, Collection, Builder> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xk.b<Key> f5390a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final xk.b<Value> f5391b;

    public c1(xk.b<Key> bVar, xk.b<Value> bVar2) {
        super(null);
        this.f5390a = bVar;
        this.f5391b = bVar2;
    }

    public /* synthetic */ c1(xk.b bVar, xk.b bVar2, ck.i iVar) {
        this(bVar, bVar2);
    }

    @Override // xk.b, xk.g, xk.a
    public abstract kotlinx.serialization.descriptors.a getDescriptor();

    public final xk.b<Key> m() {
        return this.f5390a;
    }

    public final xk.b<Value> n() {
        return this.f5391b;
    }

    @Override // bl.a
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public final void g(al.c cVar, Builder builder, int i10, int i11) {
        ck.p.j(cVar, "decoder");
        ck.p.j(builder, "builder");
        if (!(i11 >= 0)) {
            throw new IllegalArgumentException("Size must be known in advance when using READ_ALL".toString());
        }
        ik.g gVarP = ik.k.p(ik.k.q(0, i11 * 2), 2);
        int iE = gVarP.e();
        int iF = gVarP.f();
        int iG = gVarP.g();
        if ((iG <= 0 || iE > iF) && (iG >= 0 || iF > iE)) {
            return;
        }
        while (true) {
            h(cVar, i10 + iE, builder, false);
            if (iE == iF) {
                return;
            } else {
                iE += iG;
            }
        }
    }

    @Override // bl.a
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public final void h(al.c cVar, int i10, Builder builder, boolean z10) {
        int iX;
        ck.p.j(cVar, "decoder");
        ck.p.j(builder, "builder");
        Object objC = al.c.a.c(cVar, getDescriptor(), i10, this.f5390a, null, 8, null);
        if (z10) {
            iX = cVar.x(getDescriptor());
            if (!(iX == i10 + 1)) {
                throw new IllegalArgumentException(("Value must follow key in a map, index for key: " + i10 + ", returned index for value: " + iX).toString());
            }
        } else {
            iX = i10 + 1;
        }
        int i11 = iX;
        builder.put(objC, (!builder.containsKey(objC) || (this.f5391b.getDescriptor().getKind() instanceof zk.e)) ? al.c.a.c(cVar, getDescriptor(), i11, this.f5391b, null, 8, null) : cVar.v(getDescriptor(), i11, this.f5391b, kotlin.collections.a.k(builder, objC)));
    }

    @Override // xk.g
    public void serialize(al.f fVar, Collection collection) {
        ck.p.j(fVar, "encoder");
        int iE = e(collection);
        kotlinx.serialization.descriptors.a descriptor = getDescriptor();
        al.d dVarY = fVar.y(descriptor, iE);
        Iterator<Map.Entry<? extends Key, ? extends Value>> itD = d(collection);
        int i10 = 0;
        while (itD.hasNext()) {
            Map.Entry<? extends Key, ? extends Value> next = itD.next();
            Key key = next.getKey();
            Value value = next.getValue();
            int i11 = i10 + 1;
            dVarY.m(getDescriptor(), i10, m(), key);
            dVarY.m(getDescriptor(), i11, n(), value);
            i10 = i11 + 1;
        }
        dVarY.c(descriptor);
    }
}
