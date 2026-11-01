package k4;

import android.os.Handler;
import androidx.annotation.Nullable;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.io.IOException;
import k3.v0;

/* JADX INFO: compiled from: MediaSource.java */
/* JADX INFO: loaded from: classes.dex */
public interface r {

    /* JADX INFO: compiled from: MediaSource.java */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Object f62602a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f62603b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f62604c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final long f62605d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f62606e;

        public a(Object obj) {
            this(obj, -1L);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || a.class != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            return this.f62602a.equals(aVar.f62602a) && this.f62603b == aVar.f62603b && this.f62604c == aVar.f62604c && this.f62605d == aVar.f62605d && this.f62606e == aVar.f62606e;
        }

        public a(Object obj, long j10) {
            this(obj, -1, -1, j10, -1);
        }

        public a a(Object obj) {
            return this.f62602a.equals(obj) ? this : new a(obj, this.f62603b, this.f62604c, this.f62605d, this.f62606e);
        }

        public boolean b() {
            return this.f62603b != -1;
        }

        public int hashCode() {
            return ((((((((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.f62602a.hashCode()) * 31) + this.f62603b) * 31) + this.f62604c) * 31) + ((int) this.f62605d)) * 31) + this.f62606e;
        }

        public a(Object obj, long j10, int i10) {
            this(obj, -1, -1, j10, i10);
        }

        public a(Object obj, int i10, int i11, long j10) {
            this(obj, i10, i11, j10, -1);
        }

        public a(Object obj, int i10, int i11, long j10, int i12) {
            this.f62602a = obj;
            this.f62603b = i10;
            this.f62604c = i11;
            this.f62605d = j10;
            this.f62606e = i12;
        }
    }

    /* JADX INFO: compiled from: MediaSource.java */
    public interface b {
        void c(r rVar, v0 v0Var);
    }

    void a(b bVar);

    void b(b bVar);

    void c(q qVar);

    void d(b0 b0Var);

    void e(b bVar, @Nullable e5.q qVar);

    @Nullable
    default Object getTag() {
        return null;
    }

    void i(Handler handler, b0 b0Var);

    q j(a aVar, e5.b bVar, long j10);

    void l(b bVar);

    void maybeThrowSourceInfoRefreshError() throws IOException;
}
