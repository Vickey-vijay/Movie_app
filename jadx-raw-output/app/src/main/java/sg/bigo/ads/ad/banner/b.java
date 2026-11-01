package sg.bigo.ads.ad.banner;

import android.os.SystemClock;
import androidx.annotation.NonNull;
import java.util.Map;
import java.util.WeakHashMap;
import sg.bigo.ads.api.Ad;

/* JADX INFO: loaded from: classes8.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Map<InterfaceC0656b, a> f67455a = new WeakHashMap();

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long[] f67456a;

        private a() {
            this.f67456a = new long[9];
        }

        public /* synthetic */ a(byte b10) {
            this();
        }
    }

    /* JADX INFO: renamed from: sg.bigo.ads.ad.banner.b$b, reason: collision with other inner class name */
    public interface InterfaceC0656b {
    }

    public static <T extends Ad> long a(InterfaceC0656b interfaceC0656b, long j10) {
        if (j10 == -1) {
            return -1L;
        }
        return j10 - j(interfaceC0656b).f67456a[4];
    }

    public static <T extends Ad> void a(InterfaceC0656b interfaceC0656b) {
        a(interfaceC0656b, 0);
    }

    private static <T extends Ad> void a(InterfaceC0656b interfaceC0656b, int i10) {
        j(interfaceC0656b).f67456a[i10] = SystemClock.elapsedRealtime();
    }

    public static <T extends Ad> void b(InterfaceC0656b interfaceC0656b) {
        a(interfaceC0656b, 1);
    }

    public static <T extends Ad> void c(InterfaceC0656b interfaceC0656b) {
        a(interfaceC0656b, 2);
    }

    public static <T extends Ad> void d(InterfaceC0656b interfaceC0656b) {
        a(interfaceC0656b, 3);
    }

    public static <T extends Ad> void e(InterfaceC0656b interfaceC0656b) {
        a(interfaceC0656b, 4);
    }

    public static <T extends Ad> void f(InterfaceC0656b interfaceC0656b) {
        a(interfaceC0656b, 5);
    }

    public static <T extends Ad> void g(InterfaceC0656b interfaceC0656b) {
        a(interfaceC0656b, 6);
    }

    public static <T extends Ad> void h(InterfaceC0656b interfaceC0656b) {
        f67455a.remove(interfaceC0656b);
    }

    public static <T extends Ad> long i(InterfaceC0656b interfaceC0656b) {
        long[] jArr = j(interfaceC0656b).f67456a;
        return jArr[6] - jArr[4];
    }

    @NonNull
    private static <T extends Ad> a j(InterfaceC0656b interfaceC0656b) {
        Map<InterfaceC0656b, a> map = f67455a;
        a aVar = map.get(interfaceC0656b);
        if (aVar != null) {
            return aVar;
        }
        a aVar2 = new a((byte) 0);
        map.put(interfaceC0656b, aVar2);
        return aVar2;
    }
}
