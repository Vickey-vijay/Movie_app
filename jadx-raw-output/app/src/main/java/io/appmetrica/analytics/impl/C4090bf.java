package io.appmetrica.analytics.impl;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import org.json.JSONObject;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.bf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C4090bf implements ProtobufConverter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C4473qf f56422a;

    public C4090bf() {
        this(new C4473qf());
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C4398nf fromModel(@NonNull C4142df c4142df) {
        C4398nf c4398nf = new C4398nf();
        if (!TextUtils.isEmpty(c4142df.f56593a)) {
            c4398nf.f57346a = c4142df.f56593a;
        }
        c4398nf.f57347b = c4142df.f56594b.toString();
        c4398nf.f57348c = this.f56422a.fromModel(c4142df.f56595c).intValue();
        return c4398nf;
    }

    public C4090bf(C4473qf c4473qf) {
        this.f56422a = c4473qf;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C4142df toModel(@NonNull C4398nf c4398nf) {
        JSONObject jSONObject;
        String str = c4398nf.f57346a;
        String str2 = c4398nf.f57347b;
        if (!TextUtils.isEmpty(str2)) {
            try {
                jSONObject = new JSONObject(str2);
            } catch (Throwable unused) {
                jSONObject = new JSONObject();
            }
        } else {
            jSONObject = new JSONObject();
        }
        return new C4142df(str, jSONObject, this.f56422a.toModel(Integer.valueOf(c4398nf.f57348c)));
    }
}
