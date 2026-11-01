package com.squareup.picasso;

import androidx.annotation.NonNull;
import java.io.IOException;
import okhttp3.Response;

/* JADX INFO: loaded from: classes10.dex */
public interface Downloader {
    @NonNull
    Response load(@NonNull okhttp3.Request request) throws IOException;

    void shutdown();
}
