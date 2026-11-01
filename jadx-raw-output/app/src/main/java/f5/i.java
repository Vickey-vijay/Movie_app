package f5;

import android.net.Uri;
import androidx.annotation.Nullable;

/* JADX INFO: compiled from: ContentMetadata.java */
/* JADX INFO: loaded from: classes.dex */
public interface i {
    long get(String str, long j10);

    @Nullable
    String get(String str, @Nullable String str2);

    static long a(i iVar) {
        return iVar.get("exo_len", -1L);
    }

    @Nullable
    static Uri b(i iVar) {
        String str = iVar.get("exo_redir", (String) null);
        if (str == null) {
            return null;
        }
        return Uri.parse(str);
    }
}
