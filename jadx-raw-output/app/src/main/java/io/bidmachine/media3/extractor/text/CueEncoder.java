package io.bidmachine.media3.extractor.text;

import android.os.Bundle;
import android.os.Parcel;
import io.bidmachine.media3.common.text.Cue;
import io.bidmachine.media3.common.util.BundleCollectionUtil;
import io.bidmachine.media3.common.util.UnstableApi;
import java.util.ArrayList;
import java.util.List;
import m5.e;

/* JADX INFO: loaded from: classes11.dex */
@UnstableApi
public final class CueEncoder {
    public byte[] encode(List<Cue> list, long j10) {
        ArrayList<Bundle> bundleArrayList = BundleCollectionUtil.toBundleArrayList(list, new e() { // from class: kh.a
            @Override // m5.e
            public final Object apply(Object obj) {
                return ((Cue) obj).toSerializableBundle();
            }
        });
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList("c", bundleArrayList);
        bundle.putLong("d", j10);
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeBundle(bundle);
        byte[] bArrMarshall = parcelObtain.marshall();
        parcelObtain.recycle();
        return bArrMarshall;
    }
}
