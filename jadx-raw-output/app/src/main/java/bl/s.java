package bl;

/* JADX INFO: compiled from: Caching.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class s<T> extends ClassValue<d1<T>> {
    @Override // java.lang.ClassValue
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public d1<T> computeValue(Class<?> cls) {
        ck.p.j(cls, "type");
        return new d1<>();
    }
}
