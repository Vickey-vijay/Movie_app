package bl;

/* JADX INFO: compiled from: CollectionDescriptors.kt */
/* JADX INFO: loaded from: classes11.dex */
public final class j0 extends x0 {
    @Override // kotlinx.serialization.descriptors.a
    public String h() {
        return "kotlin.collections.HashSet";
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(kotlinx.serialization.descriptors.a aVar) {
        super(aVar, null);
        ck.p.j(aVar, "elementDesc");
    }
}
