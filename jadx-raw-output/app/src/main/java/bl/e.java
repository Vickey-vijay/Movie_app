package bl;

/* JADX INFO: compiled from: CollectionDescriptors.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class e extends x0 {
    @Override // kotlinx.serialization.descriptors.a
    public String h() {
        return "kotlin.collections.ArrayList";
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(kotlinx.serialization.descriptors.a aVar) {
        super(aVar, null);
        ck.p.j(aVar, "elementDesc");
    }
}
