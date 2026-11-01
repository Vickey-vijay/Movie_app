package kotlinx.serialization.descriptors;

import java.lang.annotation.Annotation;
import java.util.List;
import nj.s;
import zk.g;

/* JADX INFO: compiled from: SerialDescriptor.kt */
/* JADX INFO: loaded from: classes11.dex */
public interface a {
    boolean b();

    int c(String str);

    a d(int i10);

    int e();

    String f(int i10);

    List<Annotation> g(int i10);

    List<Annotation> getAnnotations();

    g getKind();

    String h();

    boolean i(int i10);

    boolean isInline();

    /* JADX INFO: renamed from: kotlinx.serialization.descriptors.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: SerialDescriptor.kt */
    public static final class C0566a {
        public static boolean b(a aVar) {
            return false;
        }

        public static boolean c(a aVar) {
            return false;
        }

        public static List<Annotation> a(a aVar) {
            return s.k();
        }
    }
}
