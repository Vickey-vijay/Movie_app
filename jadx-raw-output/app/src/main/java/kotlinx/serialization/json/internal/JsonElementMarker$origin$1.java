package kotlinx.serialization.json.internal;

import bk.p;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* JADX INFO: compiled from: JsonElementMarker.kt */
/* JADX INFO: loaded from: classes10.dex */
public /* synthetic */ class JsonElementMarker$origin$1 extends FunctionReferenceImpl implements p<kotlinx.serialization.descriptors.a, Integer, Boolean> {
    public JsonElementMarker$origin$1(Object obj) {
        super(2, obj, JsonElementMarker.class, "readIfAbsent", "readIfAbsent(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z", 0);
    }

    public final Boolean invoke(kotlinx.serialization.descriptors.a aVar, int i10) {
        ck.p.j(aVar, "p0");
        return Boolean.valueOf(((JsonElementMarker) this.receiver).e(aVar, i10));
    }

    @Override // bk.p
    /* JADX INFO: renamed from: invoke */
    public /* bridge */ /* synthetic */ Boolean mo1invoke(kotlinx.serialization.descriptors.a aVar, Integer num) {
        return invoke(aVar, num.intValue());
    }
}
