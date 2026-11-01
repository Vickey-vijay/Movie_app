package com.yandex.div.core.player;

/* JADX INFO: compiled from: DivPlayer.kt */
/* JADX INFO: loaded from: classes9.dex */
public interface DivPlayer {
    public static final Companion Companion = Companion.$$INSTANCE;

    /* JADX INFO: compiled from: DivPlayer.kt */
    public static final class Companion {
        public static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }
    }

    /* JADX INFO: compiled from: DivPlayer.kt */
    public interface Observer {
    }

    default void addObserver(Observer observer) {
    }

    default void pause() {
    }

    default void play() {
    }

    default void release() {
    }

    default void seek(long j10) {
    }

    default void setMuted(boolean z10) {
    }
}
