package yads;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Collection;
import yads.o83;
import yads.xq;

/* JADX INFO: loaded from: classes6.dex */
public final class o83 implements xq {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final o83 f80972c;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p51 f80973b;

    public final boolean a(int i10) {
        for (int i11 = 0; i11 < this.f80973b.size(); i11++) {
            n83 n83Var = (n83) this.f80973b.get(i11);
            if (n83Var.b() && n83Var.a() == i10) {
                return true;
            }
        }
        return false;
    }

    static {
        m51 m51Var = p51.f81258c;
        f80972c = new o83(sm2.f82697f);
        new wq() { // from class: cp.h7
            @Override // yads.wq
            public final xq fromBundle(Bundle bundle) {
                return o83.a(bundle);
            }
        };
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || o83.class != obj.getClass()) {
            return false;
        }
        return this.f80973b.equals(((o83) obj).f80973b);
    }

    public final int hashCode() {
        return this.f80973b.hashCode();
    }

    public o83(p51 p51Var) {
        this.f80973b = p51.a((Collection) p51Var);
    }

    public static o83 a(Bundle bundle) {
        sm2 sm2VarA;
        ArrayList parcelableArrayList = bundle.getParcelableArrayList(Integer.toString(0, 36));
        if (parcelableArrayList == null) {
            m51 m51Var = p51.f81258c;
            sm2VarA = sm2.f82697f;
        } else {
            sm2VarA = yq.a(n83.f80597g, parcelableArrayList);
        }
        return new o83(sm2VarA);
    }
}
