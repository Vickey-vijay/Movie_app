package yads;

import java.util.Arrays;
import java.util.Objects;
import java.util.Set;
import java.util.SortedSet;

/* JADX INFO: loaded from: classes9.dex */
public abstract class u51 extends j51 implements Set {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public transient p51 f83384c;

    @Override // yads.j51
    public p51 a() {
        p51 p51Var = this.f83384c;
        if (p51Var != null) {
            return p51Var;
        }
        p51 p51VarF = f();
        this.f83384c = p51VarF;
        return p51VarF;
    }

    public static u51 b(int i10, Object... objArr) {
        if (i10 == 0) {
            return ym2.f85051j;
        }
        if (i10 == 1) {
            Object obj = objArr[0];
            Objects.requireNonNull(obj);
            return new xz2(obj);
        }
        int iA = a(i10);
        Object[] objArr2 = new Object[iA];
        int i11 = iA - 1;
        int i12 = 0;
        int i13 = 0;
        for (int i14 = 0; i14 < i10; i14++) {
            Object obj2 = objArr[i14];
            if (obj2 == null) {
                throw new NullPointerException(mg2.a("at index ", i14));
            }
            int iHashCode = obj2.hashCode();
            int iA2 = p01.a(iHashCode);
            while (true) {
                int i15 = iA2 & i11;
                Object obj3 = objArr2[i15];
                if (obj3 == null) {
                    objArr[i13] = obj2;
                    objArr2[i15] = obj2;
                    i12 += iHashCode;
                    i13++;
                    break;
                }
                if (obj3.equals(obj2)) {
                    break;
                }
                iA2++;
            }
        }
        Arrays.fill(objArr, i13, i10, (Object) null);
        if (i13 == 1) {
            Object obj4 = objArr[0];
            Objects.requireNonNull(obj4);
            return new xz2(obj4);
        }
        if (a(i13) < iA / 2) {
            return b(i13, objArr);
        }
        int length = objArr.length;
        if (i13 < (length >> 1) + (length >> 2)) {
            objArr = Arrays.copyOf(objArr, i13);
        }
        return new ym2(objArr, i12, objArr2, i11, i13);
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof u51) && (this instanceof ym2)) {
            u51 u51Var = (u51) obj;
            u51Var.getClass();
            if ((u51Var instanceof ym2) && hashCode() != obj.hashCode()) {
                return false;
            }
        }
        return ly2.a(this, obj);
    }

    public p51 f() {
        Object[] array = toArray(j51.f78916b);
        m51 m51Var = p51.f81258c;
        return p51.b(array.length, array);
    }

    @Override // yads.j51
    public Object writeReplace() {
        return new t51(toArray(j51.f78916b));
    }

    public static int a(int i10) {
        int iMax = Math.max(i10, 2);
        if (iMax >= 751619276) {
            if (iMax < 1073741824) {
                return 1073741824;
            }
            throw new IllegalArgumentException("collection too large");
        }
        int iHighestOneBit = Integer.highestOneBit(iMax - 1) << 1;
        while (((double) iHighestOneBit) * 0.7d < iMax) {
            iHighestOneBit <<= 1;
        }
        return iHighestOneBit;
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        return ly2.a(this);
    }

    public static u51 a(Set set) {
        if ((set instanceof u51) && !(set instanceof SortedSet)) {
            u51 u51Var = (u51) set;
            if (!u51Var.e()) {
                return u51Var;
            }
        }
        Object[] array = set.toArray();
        return b(array.length, array);
    }
}
