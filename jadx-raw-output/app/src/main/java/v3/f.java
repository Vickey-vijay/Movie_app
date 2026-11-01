package v3;

import q3.s;

/* JADX INFO: compiled from: Seeker.java */
/* JADX INFO: loaded from: classes2.dex */
public interface f extends s {
    long getDataEndPosition();

    long getTimeUs(long j10);

    /* JADX INFO: compiled from: Seeker.java */
    public static class a extends s.b implements f {
        @Override // v3.f
        public long getDataEndPosition() {
            return -1L;
        }

        @Override // v3.f
        public long getTimeUs(long j10) {
            return 0L;
        }

        public a() {
            super(-9223372036854775807L);
        }
    }
}
