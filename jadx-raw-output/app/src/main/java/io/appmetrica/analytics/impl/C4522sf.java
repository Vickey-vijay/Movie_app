package io.appmetrica.analytics.impl;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import org.json.JSONObject;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.sf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C4522sf implements ProtobufConverter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C4473qf f57660a = new C4473qf();

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C4373mf fromModel(@NonNull C4497rf c4497rf) {
        C4373mf c4373mf = new C4373mf();
        if (!TextUtils.isEmpty(c4497rf.f57602a)) {
            c4373mf.f57276a = c4497rf.f57602a;
        }
        c4373mf.f57277b = c4497rf.f57603b.toString();
        c4373mf.f57278c = c4497rf.f57604c;
        c4373mf.f57279d = c4497rf.f57605d;
        c4373mf.f57280e = this.f57660a.fromModel(c4497rf.f57606e).intValue();
        return c4373mf;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C4497rf toModel(@NonNull C4373mf c4373mf) {
        JSONObject jSONObject;
        String str = c4373mf.f57276a;
        String str2 = c4373mf.f57277b;
        if (!TextUtils.isEmpty(str2)) {
            try {
                jSONObject = new JSONObject(str2);
            } catch (Throwable unused) {
                jSONObject = new JSONObject();
            }
        } else {
            jSONObject = new JSONObject();
        }
        return new C4497rf(str, jSONObject, c4373mf.f57278c, c4373mf.f57279d, this.f57660a.toModel(Integer.valueOf(c4373mf.f57280e)));
    }
}
