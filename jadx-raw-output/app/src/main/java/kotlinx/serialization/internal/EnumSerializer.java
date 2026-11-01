package kotlinx.serialization.internal;

import al.e;
import al.f;
import ck.p;
import java.lang.Enum;
import java.util.Arrays;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.descriptors.a;
import mj.g;
import nj.n;
import xk.b;

/* JADX INFO: compiled from: Enums.kt */
/* JADX INFO: loaded from: classes7.dex */
public final class EnumSerializer<T extends Enum<T>> implements b<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final T[] f63256a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public a f63257b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g f63258c;

    public EnumSerializer(final String str, T[] tArr) {
        p.j(str, "serialName");
        p.j(tArr, "values");
        this.f63256a = tArr;
        this.f63258c = kotlin.b.a(new bk.a<a>(this) { // from class: kotlinx.serialization.internal.EnumSerializer$descriptor$2
            public final /* synthetic */ EnumSerializer<T> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.this$0 = this;
            }

            @Override // bk.a
            public final a invoke() {
                a aVar = this.this$0.f63257b;
                return aVar == null ? this.this$0.c(str) : aVar;
            }
        });
    }

    public final a c(String str) {
        EnumDescriptor enumDescriptor = new EnumDescriptor(str, this.f63256a.length);
        for (T t10 : this.f63256a) {
            PluginGeneratedSerialDescriptor.l(enumDescriptor, t10.name(), false, 2, null);
        }
        return enumDescriptor;
    }

    @Override // xk.a
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public T deserialize(e eVar) {
        p.j(eVar, "decoder");
        int iS = eVar.s(getDescriptor());
        boolean z10 = false;
        if (iS >= 0 && iS < this.f63256a.length) {
            z10 = true;
        }
        if (z10) {
            return this.f63256a[iS];
        }
        throw new SerializationException(iS + " is not among valid " + getDescriptor().h() + " enum values, values size is " + this.f63256a.length);
    }

    @Override // xk.g
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public void serialize(f fVar, T t10) {
        p.j(fVar, "encoder");
        p.j(t10, "value");
        int iW = n.W(this.f63256a, t10);
        if (iW != -1) {
            fVar.f(getDescriptor(), iW);
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(t10);
        sb2.append(" is not a valid enum ");
        sb2.append(getDescriptor().h());
        sb2.append(", must be one of ");
        String string = Arrays.toString(this.f63256a);
        p.i(string, "toString(this)");
        sb2.append(string);
        throw new SerializationException(sb2.toString());
    }

    @Override // xk.b, xk.g, xk.a
    public a getDescriptor() {
        return (a) this.f63258c.getValue();
    }

    public String toString() {
        return "kotlinx.serialization.internal.EnumSerializer<" + getDescriptor().h() + '>';
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public EnumSerializer(String str, T[] tArr, a aVar) {
        this(str, tArr);
        p.j(str, "serialName");
        p.j(tArr, "values");
        p.j(aVar, "descriptor");
        this.f63257b = aVar;
    }
}
