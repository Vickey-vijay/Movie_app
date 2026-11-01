package com.yandex.div.core.player;

import android.net.Uri;
import com.yandex.div.core.DivPreloader;
import java.util.List;

/* JADX INFO: compiled from: DivPlayerPreloader.kt */
/* JADX INFO: loaded from: classes5.dex */
public interface DivPlayerPreloader {
    public static final Companion Companion = Companion.$$INSTANCE;
    public static final DivPlayerPreloader STUB = new DivPlayerPreloader() { // from class: com.yandex.div.core.player.DivPlayerPreloader$Companion$STUB$1
        @Override // com.yandex.div.core.player.DivPlayerPreloader
        public DivPreloader.PreloadReference preloadVideo(List<? extends Uri> list) {
            return DivPreloader.PreloadReference.Companion.getEMPTY();
        }
    };

    /* JADX INFO: compiled from: DivPlayerPreloader.kt */
    public static final class Companion {
        public static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }
    }

    DivPreloader.PreloadReference preloadVideo(List<? extends Uri> list);
}
