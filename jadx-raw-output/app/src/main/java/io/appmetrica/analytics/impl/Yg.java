package io.appmetrica.analytics.impl;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.data.IBinaryDataHelper;

/* JADX INFO: loaded from: classes7.dex */
public final class Yg extends Sg {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final N8 f56250b;

    public Yg(@NonNull Y4 y10) {
        this(y10, y10.j());
    }

    public Yg(Y4 y10, N8 n10) {
        super(y10);
        this.f56250b = n10;
    }

    @Override // io.appmetrica.analytics.impl.Sg
    public final boolean a(@NonNull Q5 q10) {
        EnumC4162ea enumC4162ea;
        EnumC4162ea enumC4162ea2;
        if (!TextUtils.isEmpty(q10.getName())) {
            N8 n10 = this.f56250b;
            String name = q10.getName();
            if (n10.f55616c == null) {
                n10.a();
            }
            int iHashCode = name.hashCode();
            if (n10.f55616c.f55727b.contains(Integer.valueOf(iHashCode))) {
                enumC4162ea2 = EnumC4162ea.NON_FIRST_OCCURENCE;
            } else {
                P8 p10 = n10.f55616c;
                if (p10.f55726a) {
                    enumC4162ea = EnumC4162ea.FIRST_OCCURRENCE;
                } else {
                    enumC4162ea = EnumC4162ea.UNKNOWN;
                }
                if (p10.f55729d < 1000) {
                    p10.f55727b.add(Integer.valueOf(iHashCode));
                    p10.f55729d++;
                } else {
                    p10.f55726a = false;
                }
                S8 s10 = n10.f55615b;
                P8 p11 = n10.f55616c;
                IBinaryDataHelper iBinaryDataHelper = s10.f55857c;
                R8 r10 = s10.f55856b;
                s10.f55855a.getClass();
                iBinaryDataHelper.insert("event_hashes", r10.toByteArray(Q8.a(p11)));
                enumC4162ea2 = enumC4162ea;
            }
            q10.f55783k = enumC4162ea2;
        }
        return false;
    }
}
