package kotlinx.serialization.internal;

import bl.n1;
import ck.p;
import kotlin.b;
import kotlinx.serialization.descriptors.SerialDescriptorsKt;
import kotlinx.serialization.descriptors.a;
import nj.b0;
import zk.f;
import zk.g;

/* JADX INFO: compiled from: Enums.kt */
/* JADX INFO: loaded from: classes6.dex */
public final class EnumDescriptor extends PluginGeneratedSerialDescriptor {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final g f63254m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final mj.g f63255n;

    @Override // kotlinx.serialization.internal.PluginGeneratedSerialDescriptor
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return aVar.getKind() == g.b.f86476a && p.e(h(), aVar.h()) && p.e(n1.a(this), n1.a(aVar));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EnumDescriptor(final String str, final int i10) {
        super(str, null, i10, 2, null);
        p.j(str, "name");
        this.f63254m = g.b.f86476a;
        this.f63255n = b.a(new bk.a<a[]>() { // from class: kotlinx.serialization.internal.EnumDescriptor$elementDescriptors$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // bk.a
            public final a[] invoke() {
                int i11 = i10;
                a[] aVarArr = new a[i11];
                for (int i12 = 0; i12 < i11; i12++) {
                    aVarArr[i12] = SerialDescriptorsKt.d(str + '.' + this.f(i12), kotlinx.serialization.descriptors.b.d.f63249a, new a[0], null, 8, null);
                }
                return aVarArr;
            }
        });
    }

    @Override // kotlinx.serialization.internal.PluginGeneratedSerialDescriptor, kotlinx.serialization.descriptors.a
    public g getKind() {
        return this.f63254m;
    }

    public final a[] s() {
        return (a[]) this.f63255n.getValue();
    }

    @Override // kotlinx.serialization.internal.PluginGeneratedSerialDescriptor, kotlinx.serialization.descriptors.a
    public a d(int i10) {
        return s()[i10];
    }

    @Override // kotlinx.serialization.internal.PluginGeneratedSerialDescriptor
    public int hashCode() {
        int iHashCode;
        int iHashCode2 = h().hashCode();
        int i10 = 1;
        for (String str : f.b(this)) {
            int i11 = i10 * 31;
            if (str != null) {
                iHashCode = str.hashCode();
            } else {
                iHashCode = 0;
            }
            i10 = i11 + iHashCode;
        }
        return (iHashCode2 * 31) + i10;
    }

    @Override // kotlinx.serialization.internal.PluginGeneratedSerialDescriptor
    public String toString() {
        return b0.p0(f.b(this), ", ", h() + '(', ")", 0, null, null, 56, null);
    }
}
