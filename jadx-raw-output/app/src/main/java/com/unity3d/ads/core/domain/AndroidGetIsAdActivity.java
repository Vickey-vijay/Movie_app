package com.unity3d.ads.core.domain;

import ck.p;
import com.unity3d.ads.core.data.repository.SessionRepository;
import com.unity3d.ads.core.extensions.StringExtensionsKt;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.b;
import mj.g;
import nj.t;
import okio.ByteString;

/* JADX INFO: compiled from: AndroidGetIsAdActivity.kt */
/* JADX INFO: loaded from: classes9.dex */
public final class AndroidGetIsAdActivity {
    private final g activities$delegate;
    private final SessionRepository sessionRepository;

    public AndroidGetIsAdActivity(SessionRepository sessionRepository) {
        p.j(sessionRepository, "sessionRepository");
        this.sessionRepository = sessionRepository;
        this.activities$delegate = b.a(new bk.a<List<? extends ByteString>>() { // from class: com.unity3d.ads.core.domain.AndroidGetIsAdActivity$activities$2
            {
                super(0);
            }

            @Override // bk.a
            public final List<? extends ByteString> invoke() {
                List<com.google.protobuf.ByteString> observableAndroidActivitiesList = this.this$0.sessionRepository.getNativeConfiguration().getObservableAndroidActivitiesList();
                p.i(observableAndroidActivitiesList, "sessionRepository.native…ableAndroidActivitiesList");
                ArrayList arrayList = new ArrayList(t.v(observableAndroidActivitiesList, 10));
                Iterator<T> it = observableAndroidActivitiesList.iterator();
                while (it.hasNext()) {
                    byte[] byteArray = ((com.google.protobuf.ByteString) it.next()).toByteArray();
                    arrayList.add(ByteString.of(Arrays.copyOf(byteArray, byteArray.length)));
                }
                return arrayList;
            }
        });
    }

    private final List<ByteString> getActivities() {
        return (List) this.activities$delegate.getValue();
    }

    public final boolean invoke(String str) {
        p.j(str, "activityName");
        return getActivities().contains(ByteString.decodeHex(StringExtensionsKt.getSHA256Hash(str)));
    }
}
