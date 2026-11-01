package bl;

/* JADX INFO: compiled from: CollectionDescriptors.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class s1 extends x0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f5466c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s1(kotlinx.serialization.descriptors.a aVar) {
        super(aVar, null);
        ck.p.j(aVar, "primitive");
        this.f5466c = aVar.h() + "Array";
    }

    @Override // kotlinx.serialization.descriptors.a
    public String h() {
        return this.f5466c;
    }
}
