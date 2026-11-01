package zo;

import java.util.LinkedHashMap;
import xyz.doikki.videoplayer.player.VideoView;

/* JADX INFO: compiled from: VideoViewManager.java */
/* JADX INFO: loaded from: classes6.dex */
public class f {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static f f86538c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static e f86539d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkedHashMap<String, VideoView> f86540a = new LinkedHashMap<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f86541b = a().f86522a;

    public static e a() {
        d(null);
        return f86539d;
    }

    public static f b() {
        if (f86538c == null) {
            synchronized (f.class) {
                if (f86538c == null) {
                    f86538c = new f();
                }
            }
        }
        return f86538c;
    }

    public static void d(e eVar) {
        if (f86539d == null) {
            synchronized (e.class) {
                if (f86539d == null) {
                    if (eVar == null) {
                        eVar = e.a().j();
                    }
                    f86539d = eVar;
                }
            }
        }
    }

    public boolean c() {
        return this.f86541b;
    }

    public void e(boolean z10) {
        this.f86541b = z10;
    }
}
