package io.bidmachine.media3.common;

import io.bidmachine.media3.common.util.UnstableApi;
import java.io.IOException;

/* JADX INFO: loaded from: classes11.dex */
@UnstableApi
public interface DataReader {
    int read(byte[] bArr, int i10, int i11) throws IOException;
}
