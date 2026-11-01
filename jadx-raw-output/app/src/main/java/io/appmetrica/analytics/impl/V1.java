package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import io.appmetrica.analytics.coreapi.internal.permission.PermissionState;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
public final class V1 implements ProtobufConverter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C4609w2 f56006a;

    public V1() {
        this(new C4609w2());
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Y1 fromModel(@NonNull U1 u10) {
        Y1 y10 = new Y1();
        y10.f56196a = new X1[u10.f55956a.size()];
        int i10 = 0;
        int i11 = 0;
        for (PermissionState permissionState : u10.f55956a) {
            X1[] x1Arr = y10.f56196a;
            X1 x10 = new X1();
            x10.f56128a = permissionState.name;
            x10.f56129b = permissionState.granted;
            x1Arr[i11] = x10;
            i11++;
        }
        C4659y2 c4659y2 = u10.f55957b;
        if (c4659y2 != null) {
            y10.f56197b = this.f56006a.fromModel(c4659y2);
        }
        y10.f56198c = new String[u10.f55958c.size()];
        Iterator it = u10.f55958c.iterator();
        while (it.hasNext()) {
            y10.f56198c[i10] = (String) it.next();
            i10++;
        }
        return y10;
    }

    public V1(C4609w2 c4609w2) {
        this.f56006a = c4609w2;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final U1 toModel(@NonNull Y1 y10) {
        ArrayList arrayList = new ArrayList();
        int i10 = 0;
        int i11 = 0;
        while (true) {
            X1[] x1Arr = y10.f56196a;
            if (i11 >= x1Arr.length) {
                break;
            }
            X1 x10 = x1Arr[i11];
            arrayList.add(new PermissionState(x10.f56128a, x10.f56129b));
            i11++;
        }
        W1 w10 = y10.f56197b;
        C4659y2 model = w10 != null ? this.f56006a.toModel(w10) : null;
        ArrayList arrayList2 = new ArrayList();
        while (true) {
            String[] strArr = y10.f56198c;
            if (i10 < strArr.length) {
                arrayList2.add(strArr[i10]);
                i10++;
            } else {
                return new U1(arrayList, model, arrayList2);
            }
        }
    }
}
