package tj;

/* JADX INFO: compiled from: ContinuationImpl.kt */
/* JADX INFO: loaded from: classes11.dex */
public final class b implements rj.c<Object> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final b f72420b = new b();

    public String toString() {
        return "This continuation is already complete";
    }

    @Override // rj.c
    public kotlin.coroutines.d getContext() {
        throw new IllegalStateException("This continuation is already complete".toString());
    }

    @Override // rj.c
    public void resumeWith(Object obj) {
        throw new IllegalStateException("This continuation is already complete".toString());
    }
}
