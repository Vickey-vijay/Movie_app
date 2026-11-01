package com.inmobi.ads;

import ck.i;
import ck.p;

/* JADX INFO: loaded from: classes7.dex */
public enum AudioStatus {
    PLAYING,
    PAUSED,
    COMPLETED;

    private static final /* synthetic */ uj.a $ENTRIES = kotlin.enums.a.a(values());
    public static final Companion Companion = new Companion(null);

    public static final class Companion {
        public /* synthetic */ Companion(i iVar) {
            this();
        }

        public /* bridge */ /* synthetic */ Object from(Object obj) {
            return from(((Number) obj).intValue());
        }

        private Companion() {
        }

        public AudioStatus from(int i10) {
            if (i10 != 0) {
                return i10 != 1 ? AudioStatus.COMPLETED : AudioStatus.PAUSED;
            }
            return AudioStatus.PLAYING;
        }

        public Integer to(AudioStatus audioStatus) {
            p.j(audioStatus, "item");
            return Integer.valueOf(audioStatus.ordinal());
        }
    }

    public static AudioStatus from(int i10) {
        return Companion.from(i10);
    }

    public static uj.a<AudioStatus> getEntries() {
        return $ENTRIES;
    }

    public static int to(AudioStatus audioStatus) {
        return Companion.to(audioStatus).intValue();
    }
}
