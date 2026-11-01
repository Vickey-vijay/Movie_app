package bl;

import java.util.Iterator;

/* JADX INFO: compiled from: CollectionSerializers.kt */
/* JADX INFO: loaded from: classes2.dex */
public abstract class a<Element, Collection, Builder> implements xk.b<Collection> {
    public a() {
    }

    public /* synthetic */ a(ck.i iVar) {
        this();
    }

    public abstract Builder a();

    public abstract int b(Builder builder);

    public abstract void c(Builder builder, int i10);

    public abstract Iterator<Element> d(Collection collection);

    public abstract int e(Collection collection);

    public abstract void g(al.c cVar, Builder builder, int i10, int i11);

    public abstract void h(al.c cVar, int i10, Builder builder, boolean z10);

    public abstract Builder k(Collection collection);

    public abstract Collection l(Builder builder);

    public static /* synthetic */ void i(a aVar, al.c cVar, int i10, Object obj, boolean z10, int i11, Object obj2) {
        if (obj2 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: readElement");
        }
        if ((i11 & 8) != 0) {
            z10 = true;
        }
        aVar.h(cVar, i10, obj, z10);
    }

    @Override // xk.a
    public Collection deserialize(al.e eVar) {
        ck.p.j(eVar, "decoder");
        return f(eVar, null);
    }

    public final Collection f(al.e eVar, Collection collection) {
        Builder builderA;
        ck.p.j(eVar, "decoder");
        if (collection == null || (builderA = k(collection)) == null) {
            builderA = a();
        }
        int iB = b(builderA);
        al.c cVarB = eVar.b(getDescriptor());
        if (!cVarB.j()) {
            while (true) {
                int iX = cVarB.x(getDescriptor());
                if (iX == -1) {
                    break;
                }
                i(this, cVarB, iB + iX, builderA, false, 8, null);
            }
        } else {
            g(cVarB, builderA, iB, j(cVarB, builderA));
        }
        cVarB.c(getDescriptor());
        return l(builderA);
    }

    public final int j(al.c cVar, Builder builder) {
        int iW = cVar.w(getDescriptor());
        c(builder, iW);
        return iW;
    }
}
