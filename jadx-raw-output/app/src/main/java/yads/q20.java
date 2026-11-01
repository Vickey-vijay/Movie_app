package yads;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import yads.q20;
import yads.xq;

/* JADX INFO: loaded from: classes8.dex */
public final class q20 implements xq {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f81686b = 0;

    public static final q20 a(Bundle bundle) {
        sm2 sm2VarA;
        ArrayList parcelableArrayList = bundle.getParcelableArrayList(Integer.toString(0, 36));
        if (parcelableArrayList == null) {
            m51 m51Var = p51.f81258c;
            sm2VarA = sm2.f82697f;
        } else {
            sm2VarA = yq.a(o20.f80903t, parcelableArrayList);
        }
        return new q20(sm2VarA);
    }

    static {
        m51 m51Var = p51.f81258c;
        new q20(sm2.f82697f);
        new wq() { // from class: cp.p8
            @Override // yads.wq
            public final xq fromBundle(Bundle bundle) {
                return q20.a(bundle);
            }
        };
    }

    public q20(List list) {
        p51.a((Collection) list);
    }
}
