package com.yandex.div.core.downloader;

import androidx.annotation.NonNull;
import com.yandex.div.core.downloader.DivDownloader;
import com.yandex.div.core.downloader.DivPatchDownloadCallback;
import com.yandex.div.core.images.LoadReference;
import com.yandex.div.core.view2.Div2View;

/* JADX INFO: loaded from: classes2.dex */
public interface DivDownloader {
    public static final DivDownloader STUB = new DivDownloader() { // from class: pd.a
        @Override // com.yandex.div.core.downloader.DivDownloader
        public final LoadReference downloadPatch(Div2View div2View, String str, DivPatchDownloadCallback divPatchDownloadCallback) {
            return DivDownloader.lambda$static$0(div2View, str, divPatchDownloadCallback);
        }
    };

    LoadReference downloadPatch(@NonNull Div2View div2View, @NonNull String str, @NonNull DivPatchDownloadCallback divPatchDownloadCallback);

    /* JADX INFO: Access modifiers changed from: private */
    static /* synthetic */ LoadReference lambda$static$0(Div2View div2View, String str, DivPatchDownloadCallback divPatchDownloadCallback) {
        throw new AssertionError("To load patch you must provide implementation of DivDownloader to your DivConfiguration. ");
    }
}
