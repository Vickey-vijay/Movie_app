package l2;

import com.ironsource.C3605n2;
import java.io.PrintWriter;
import kotlin.Metadata;

/* JADX INFO: compiled from: EndToEndDumper.kt */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bæ\u0080\u0001\u0018\u0000 \t2\u00020\u0001:\u0001\tJ/\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0006H&¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Ll2/a;", "", "", "prefix", "Ljava/io/PrintWriter;", "writer", "", "args", "", "a", "(Ljava/lang/String;Ljava/io/PrintWriter;[Ljava/lang/String;)Z", "facebook-common_release"}, k = 1, mv = {1, 5, 1})
public interface a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = Companion.f63392a;

    /* JADX INFO: renamed from: l2.a$a, reason: collision with other inner class name and from kotlin metadata */
    /* JADX INFO: compiled from: EndToEndDumper.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\n\u0010\u000bR$\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\f"}, d2 = {"Ll2/a$a;", "", "Ll2/a;", "b", "Ll2/a;", "a", "()Ll2/a;", "setInstance", "(Ll2/a;)V", C3605n2.f30210p, "<init>", "()V", "facebook-common_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ Companion f63392a = new Companion();

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        public static a instance;

        public final a a() {
            return instance;
        }
    }

    boolean a(String prefix, PrintWriter writer, String[] args);
}
