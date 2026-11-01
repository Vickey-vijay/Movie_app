package com.bumptech.glide.load.data.mediastore;

import java.io.File;

/* JADX INFO: loaded from: classes2.dex */
class FileService {
    public File get(String str) {
        return new File(str);
    }

    public boolean exists(File file) {
        return file.exists();
    }

    public long length(File file) {
        return file.length();
    }
}
