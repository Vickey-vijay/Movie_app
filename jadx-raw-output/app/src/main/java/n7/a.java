package n7;

import android.support.v4.media.session.PlaybackStateCompat;

/* JADX INFO: compiled from: DefaultConnectionCountAdapter.java */
/* JADX INFO: loaded from: classes8.dex */
public class a implements w7.c.a {
    @Override // w7.c.a
    public int a(int i10, String str, String str2, long j10) {
        if (j10 < PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED) {
            return 1;
        }
        if (j10 < 5242880) {
            return 2;
        }
        if (j10 < 52428800) {
            return 3;
        }
        return j10 < 104857600 ? 4 : 5;
    }
}
