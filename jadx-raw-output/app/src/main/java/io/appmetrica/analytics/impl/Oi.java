package io.appmetrica.analytics.impl;

import androidx.annotation.Nullable;
import io.appmetrica.analytics.Revenue;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class Oi implements to {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final so f55700a = new so();

    @Override // io.appmetrica.analytics.impl.to
    public final ro a(@Nullable Revenue revenue) {
        ro roVar;
        so soVar = this.f55700a;
        ro[] roVarArr = new ro[1];
        Tf tf2 = new Tf();
        Integer num = revenue.quantity;
        if (num == null || num.intValue() > 0) {
            roVar = new ro(tf2, true, "");
        } else {
            roVar = new ro(tf2, false, "Invalid quantity value " + num);
        }
        roVarArr[0] = roVar;
        List<ro> listAsList = Arrays.asList(roVarArr);
        soVar.getClass();
        return soVar.a(listAsList);
    }
}
