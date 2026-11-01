package sg.bigo.ads.common.x;

import android.content.SharedPreferences;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes8.dex */
public final class c {

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static a f70323a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final C0723a f70324b = new C0723a();

        /* JADX INFO: renamed from: sg.bigo.ads.common.x.c$a$a, reason: collision with other inner class name */
        public static class C0723a {
            public static void a(@NonNull SharedPreferences.Editor editor) {
                try {
                    editor.apply();
                } catch (AbstractMethodError unused) {
                    editor.commit();
                }
            }
        }

        private a() {
        }

        public static a a() {
            if (f70323a == null) {
                f70323a = new a();
            }
            return f70323a;
        }
    }
}
