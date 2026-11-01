package io.bidmachine.media3.extractor.text;

import android.os.Bundle;
import android.os.Parcel;
import io.bidmachine.media3.common.util.Assertions;
import io.bidmachine.media3.common.util.BundleCollectionUtil;
import io.bidmachine.media3.common.util.UnstableApi;
import java.util.ArrayList;
import yf.b;

/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public final class CueDecoder {
    public static final String BUNDLE_FIELD_CUES = "c";
    public static final String BUNDLE_FIELD_DURATION_US = "d";

    public CuesWithTiming decode(long j10, byte[] bArr) {
        return decode(j10, bArr, 0, bArr.length);
    }

    public CuesWithTiming decode(long j10, byte[] bArr, int i10, int i11) {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.unmarshall(bArr, i10, i11);
        parcelObtain.setDataPosition(0);
        Bundle bundle = parcelObtain.readBundle(Bundle.class.getClassLoader());
        parcelObtain.recycle();
        return new CuesWithTiming(BundleCollectionUtil.fromBundleList(new b(), (ArrayList) Assertions.checkNotNull(bundle.getParcelableArrayList("c"))), j10, bundle.getLong("d"));
    }
}
